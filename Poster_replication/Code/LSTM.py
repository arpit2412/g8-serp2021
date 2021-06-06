# -*- coding: utf-8 -*-
import csv
import numpy as np
import pandas as pd
import time

from sklearn.metrics import classification_report
from sklearn.metrics import confusion_matrix
from sklearn.model_selection import train_test_split
from keras.preprocessing import sequence
from keras.models import Sequential
from keras.layers import Dense, Dropout
from keras.layers import Embedding, Bidirectional
from keras.layers import LSTM
from keras.callbacks import ModelCheckpoint, EarlyStopping
from keras import backend as K
import os
import warnings

warnings.filterwarnings('ignore')
# CPU or GPU
os.environ["CUDA_VISIBLE_DEVICES"] = " "
script_start_time = time.time()

print("Script starts at: " + str(script_start_time))

# The a CSV file which contains the extracted AST data. (The ASTs are tokenized, namely they have been mapped to integers.)
csv_URL = "csv data file path"  # All the ASTs will be processed and converted to vectors and stored in a CSV file.

working_dir = 'Save the result at this path'

# The path where the trained models are saved.
model_saved_path = "...\\model\\"


# Get the csv file and convert it to a list.
def getData(filePath):
    df = pd.read_csv(filePath, sep=",")
    df_id = df['func_id']
    print(df_id)
    df_value = df.drop(['func_id'], axis=1)
    df_list = df_value.values.tolist()
    df_id_list = df_id.values.tolist()
    temp = []
    ####
    for i in df_list:
        # Get rid of 'NaN' values.
        i = [x for x in i if str(x) != 'nan']
        temp.append(i)

    return temp, df_id_list


# Generate the labels for samples according to the names of the samples.
def generateLabels(input_arr):
    temp_arr = []
    for func_id in input_arr:
        temp_sub_arr = []
        if "cve" in func_id:
            temp_sub_arr.append(1)
        else:
            temp_sub_arr.append(0)
        temp_arr.append(temp_sub_arr)
    return np.asarray(temp_arr)


def storeOuput(arr, path):
    with open(path, 'w') as myfile:
        wr = csv.writer(myfile)
        wr.writerow(arr)

# Get the activations (outputs of each layer)
def get_activations(model, model_inputs, print_shape_only=False, layer_name=None):
    print('----- activations -----')
    activations = []
    inp = model.input

    model_multi_inputs_cond = True
    if not isinstance(inp, list):
        # only one input! let's wrap it in a list.
        inp = [inp]
        model_multi_inputs_cond = False

    outputs = [layer.output for layer in model.layers if
               layer.name == layer_name or layer_name is None]  # all layer outputs

    funcs = [K.function(inp + [K.learning_phase()], [out]) for out in outputs]  # evaluation functions

    if model_multi_inputs_cond:
        list_inputs = []
        list_inputs.extend(model_inputs)
        list_inputs.append(1.)
    else:
        list_inputs = [model_inputs, 1.]

    # Learning phase. 1 = Test mode (no dropout or batch normalization)
    layer_outputs = [func([model_inputs, 1.])[0] for func in funcs]
    # layer_outputs = [func(list_inputs)[0] for func in funcs]
    for layer_activations in layer_outputs:
        activations.append(layer_activations)
        if print_shape_only:
            print(layer_activations.shape)
        else:
            print(layer_activations)
    return activations


# Visualize the outputs of each layer.
def display_activations(activation_maps):
    import numpy as np
    import matplotlib.pyplot as plt
    """
    (1, 26, 26, 32)
    (1, 24, 24, 64)
    (1, 12, 12, 64)
    (1, 12, 12, 64)
    (1, 9216)
    (1, 128)
    (1, 128)
    (1, 10)
    """
    # batch_size = activation_maps[0].shape[0]
    # assert batch_size == 200, 'One image at a time to visualize.'
    for i, activation_map in enumerate(activation_maps):
        print('Displaying activation map {}'.format(i))
        shape = activation_map.shape
        if len(shape) == 4:
            activations = np.hstack(np.transpose(activation_map[0], (2, 0, 1)))
        elif len(shape) == 2:
            # try to make it square as much as possible. we can skip some activations.
            activations = activation_map[0]
            num_activations = len(activations)
            if num_activations > 1024:  # too hard to display it on the screen.
                square_param = int(np.floor(np.sqrt(num_activations)))
                activations = activations[0: square_param * square_param]
                activations = np.reshape(activations, (square_param, square_param))
            else:
                activations = np.expand_dims(activations, axis=0)
        else:
            raise Exception('len(shape) = 3 has not been implemented.')
        plt.imshow(activations, interpolation='None', cmap='jet')
        plt.show()


# The function outputs a 3D array and store it in a txt file.
# The arr is the array to be output.
# The path specifies where the output file is stored.
# def storeOutput_3DArray(arr, path):
#    # Write the array to disk
#    with file(path, 'w') as outfile:
#        # I'm writing a header here just for the sake of readability
#        # Any line starting with "#" will be ignored by numpy.loadtxt
#        outfile.write('# Array shape: {0}\n'.format(arr.shape))
#
#        # Iterating through a ndimensional array produces slices along
#        # the last axis. This is equivalent to data[i,:,:] in this case
#        for data_slice in arr:
#
#            # The formatting string indicates that I'm writing out
#            # the values in left-justified columns 7 characters in width
#            # with 2 decimal places.
#            np.savetxt(outfile, data_slice, fmt='%14.5f')
#
#            # Writing out a break to indicate different slices...
#            outfile.write('# New slice\n')

# def storeOutput_3DArray_str(arr, path):
#    # Write the array to disk
#    with file(path, 'w') as outfile:
#        # I'm writing a header here just for the sake of readability
#        # Any line starting with "#" will be ignored by numpy.loadtxt
#        outfile.write('# Array shape: {0}\n'.format(arr.shape))
#
#        # Iterating through a ndimensional array produces slices along
#        # the last axis. This is equivalent to data[i,:,:] in this case
#        for data_slice in arr:
#
#            # The formatting string indicates that I'm writing out
#            # the values in left-justified columns 7 characters in width
#            # with 2 decimal places.
#            np.savetxt(outfile, data_slice, fmt='%s')
#
#            # Writing out a break to indicate different slices...
#            outfile.write('# New slice\n')

# ------------------------------------------------------------ #
# 1. Give the data list which stores the training and testing sets of the extracted ASTs.

data_list, data_id_list = getData(csv_URL)
# print("data_list", data_list )
# print("data_id_list",data_id_list)
print("The length of the data list: " + str(len(data_list)))

# 4775

#  0%    2.5%      5%    7.5%     10%   12.5%     15%   17.5%     20%   22.5%     25%   27.5%     30%   32.5%     35%   37.5%
#  15.00   20.00   23.00   25.00   28.00   30.00   33.00   35.00   37.00   40.00   42.00   45.00   47.00   50.00   53.00   56.00
#    40%   42.5%     45%   47.5%     50%   52.5%     55%   57.5%     60%   62.5%     65%   67.5%     70%   72.5%     75%   77.5%
#  59.00   63.00   67.00   71.00   75.00   80.00   85.00   90.00   96.40  103.00  111.00  119.00  129.00  139.00  153.00  169.00
#    80%   82.5%     85%   87.5%     90%   92.5%     95%   97.5%    100%
# 186.00  206.00  227.90  255.00  287.60  346.95  433.00  624.60 2876.00

# ------------------------------------------------------------ #
# 2. Do the padding -- using the function provided by Keras
max_len = 650  # Padding using the max_len of the provided AST.
print("max_len " + str(max_len))
print('Pad sequences (samples x time)')
sequence_pad = sequence.pad_sequences(data_list, maxlen=max_len, padding='post')

print(sequence_pad.shape)
print(sequence_pad)
print(data_id_list)

# ------------------------------------------------------------ #
# 3. Split the data into 3 parts: training, validation and testing.

# Use the id as the 'test' set because the id contains the 'cve' keyword which can be used as the label later.
# When the samples in the train_set_x are
train_set_x, test_validation_set_x, train_set_y_id, test_validation_set_y = train_test_split(sequence_pad, data_id_list,
                                                                                             test_size=0.35,
                                                                                             random_state=42)

print("The training set: ")
print(train_set_x)

# print test_validation_set_x

print("The length of training set: " + str(len(train_set_x)) + ". The length of training set id list: " + str(
    len(train_set_y_id)))

# Further split the data set into two parts, to form training, validation and testing parts with the ratio of 0.65:0.2:0.15
validation_set_x, test_set_x, validation_set_id, test_set_id = train_test_split(test_validation_set_x,
                                                                                test_validation_set_y, test_size=0.43,
                                                                                random_state=42)

print("The validation set: ")
print(validation_set_x)

print("The test set: ")
print(test_set_x)

print("The length of validation and test set: ")
print(len(validation_set_x), len(test_set_x), len(validation_set_id), len(test_set_id))

# print validation_set_x, test_set_x, validation_set_y, test_set_y

# Now we need to convert all the *_set_y to 0 and 1 labels. All the *_set_y lists contain the actual names of all the samples.

# The samples' ids of the train_set should be reserved, so after training we can still use the ids to identify which feature sets belong to which sample.
train_set_y = generateLabels(train_set_y_id)
validation_set_y = generateLabels(validation_set_id)
test_set_y = generateLabels(test_set_id)

print("-------------------------")

print("The shape of the datasets: " + "\r\n")

print(train_set_x.shape, train_set_y.shape, validation_set_x.shape, validation_set_y.shape, test_set_x.shape,
      test_set_y.shape)

print(np.count_nonzero(train_set_y), np.count_nonzero(validation_set_y), np.count_nonzero(test_set_y))


# ------------------------------------------------------------ #
# Parameters used
DATA_DIMENSION = 650
# NUM_TRAIN_SAMPLE = 3103
# NUM_VALIDATION_SAMPLE = 953
# NUM_TEST_SAMPLE = 719
BATCH_SIZE = 64
EPOCHS = 3

# ------------------------------------------------------------ #
# 4. Define model structure
model = Sequential()

model.add(Embedding(DATA_DIMENSION, 64))  # Layer 0: an embedding layer
model.add(Bidirectional(LSTM(64, activation='tanh', return_sequences=True)))  # Layer 1: An LSTM layer (tanh)
model.add(Bidirectional(LSTM(64)))  # Layer 2: An LSTM layer
model.add(Dense(64, activation='tanh'))
model.add(Dense(1, activation='sigmoid'))  # Layer 3: Dense layer

print("-------------------------")

print("strat compiling the model...")

# ------------------------------------------------------------ #
# 5. Configure the learning process
model.compile(loss='binary_crossentropy',
              optimizer='rmsprop',
              metrics=['accuracy'])

# Save weights of best training epoch: monitor either val_loss or val_acc
# now = datetime.now()
# callbacks_list = [
#     ModelCheckpoint(filepath=model_saved_path + now.strftime("%H:%M:%S") + '2st_64_model_{epoch:02d}_{val_loss:.3f}.h5',
#                     monitor='val_loss', verbose=2, save_best_only=True, period=1),
#     EarlyStopping(monitor='val_loss', patience=20, verbose=2, mode="min")]

callbacks_list = [
        ModelCheckpoint(filepath = model_saved_path + '2st_64_model_{epoch:02d}_{val_loss:.3f}.h5', monitor='val_loss', verbose=2, save_best_only=True, period=1),
        EarlyStopping(monitor='val_loss', patience=5, verbose=2, mode="min")]

print("start training the model...")

# ------------------------------------------------------------ #
# 6. Train the model.
model.fit(train_set_x, train_set_y,
          epochs=EPOCHS,
          batch_size=BATCH_SIZE,
          shuffle=False,
          # The data has already been shuffle before, so it is unnessary to shuffle it again. (And also, we need to correspond the ids to the features of the samples.)
          # validation_split=0.5,
          validation_data=(validation_set_x, validation_set_y),
          # Validation data is not used for training (or development of the model)
          callbacks=callbacks_list,  # Get the best weights of the model and stop the first round training.
          verbose=2)


print("-----------------------------------------------")

print("Start predicting....")

# The 0 or 1 outputs. 0 means non-vulnerable and 1 means vulnerable.
predicted_classes = model.predict_classes(test_set_x, batch_size=BATCH_SIZE, verbose=2)

predicted_prob = model.predict(test_set_x, batch_size=BATCH_SIZE, verbose=2)

test_accuracy = np.mean(np.equal(test_set_y, predicted_classes))
print("test_accuracy: ", test_accuracy)

print("\r\n")

print("Start saving the trained model...")

model.save_weights(model_saved_path  + '_weights.h5')

target_names = ["Non-vulnerable", "Vulnerable"]  # non-vulnerable->0, vulnerable->1
print(confusion_matrix(test_set_y, predicted_classes, labels=[0, 1]))
print("\r\n")
print("\r\n")
print(classification_report(test_set_y, predicted_classes, target_names=target_names))



# Save the result.
np.savetxt(working_dir + 'Result_probabilities.csv', predicted_prob, delimiter=",")
np.savetxt(working_dir + 'test_label.csv', test_set_y, delimiter=",")
storeOuput(test_set_id, working_dir + 'test_id.csv')

print("\r\n")
print("--- %s seconds ---" + str((time.time() - script_start_time)))

