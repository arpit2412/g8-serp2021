## How to Use

***Please execute the following python scripts in sequence.***

### DAN Method:

`$ py dan.py` <br>
This function will use numerical vectors from the folder ./data/Preprocessed_data for training and model generation<br>
The resulting model will be save in folder ./data/dan_model_save/model/<br>

`$ py dan_predict.py` <br>
This function will evaluate the selected best performance model saved in folder ./data/dan_model/dan_predict_model/ and save the results in ./data/dan_model/dan_predict_model_result.txt<br>


### Dependencies:
1. Tensorflow 1.14
1. Python 3.6
1. codeSensor-0.2: https://github.com/fabsx00/codesensor/releases/tag/codeSensor-0.2
