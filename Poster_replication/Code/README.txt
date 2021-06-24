Execution Instruction

Please execute the following python functions in sequence.

For LSTM Method:
1. ProcessCFilesWithCodeSensor.py 
This function will process the source functions from raw data into ASTs.
Before executing the function, please set up the working directory route, codesensor path and codesensor output path accordingly. 
2. ProcessRawASTs_DFT.py
This function will process the ASTs into DFT which is textual form vectors.
Before execute the function, please set up the input path as the ProcessCFilesWithCodeSensor.py output directory and set up an output path for textual form vectors.
3. BlurProjectSpecific.py
This function will process the textual form vectors into numerical vectors.
Before executing the function, please set up the input path as the ProcessRawASTs_DFT.py output .txt file and set up an output path for numerical vectors.
Reminder: The output file of BlurProjectSpecific.py is a .txt file. It needs the operator to manually change the file format into .csv
4. LSTM.py
This function will use numerical vectors to train and test the LSTM model.
Before executing the function, please set up the working directory route and set up the numerical vectors .csv file as input. As for output, set up a directory for saving models and outputs.


For RandomForest Method:
1. RandomForest.py
This function will use code metrics as essential complexity extracted by the Understand Tool to train and test the Random Forest Algorithm. Due to the Understand Tool is a commercial tool, we have included the extracted code metrics in the repository. Please put "train_cm.csv" "train_id.csv" "test_cm.csv" "test_cm.csv" files under the same directory and set up the directory as an input path.

(ExtractCFunctionByName_v2.py will not be used)