## How to Use
 
***Please execute the following python scripts in sequence.***
 
### DUAL-DAN Method:
 
`$ py dual_dan.py` <br>
This function will use numerical vectors from the folder ./data/CSV_data for training and model generation<br>
The resulting model will be save in folder ./dan_save/model/<br>
 
`$ py dual_dan_predict.py` <br>
This function will evaluate the model saved in folder ./dan_save/model/ and save the results in ./dan_model/dan_peg_png/<br>
 
 
### Dependencies:
1. Tensorflow 1.14
1. Python 3.6
1. codeSensor-0.2: https://github.com/fabsx00/codesensor/releases/tag/codeSensor-0.2
