Execution Instruction

Please execute the following python functions in sequence.

For Data Preprocessing:
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
