# -*- coding: utf-8 -*-
"""
Created on Mon Sep 11 15:38:30 2017

This file achieves two functionalities:
    1) Grab all the .c files from a specified directory
    2) Process all the .c files with CodeSensor and output them to a specified directory.

"""

import os
import shutil
from subprocess import Popen, PIPE, STDOUT

"""
Path

"""

Software_package = "FFmpeg"

Working_directory = "F:\\final year project\\g8-serp2021\\A performance evaluation of deep‐learnt features for software vulnerability detection\\"

# SOURCE_FILE = "\\Vulnerable_Files\\"

SOURCE_FILE = "Data\\Non-vulnerable_funcs\\"

CodeSensor_OUTPUT_PATH = Working_directory + SOURCE_FILE + "Processed_data_results_"+Software_package+"\\"

CodeSensor_PATH = "F:\\final year project\\g8-serp2021\\codesensor tool\\CodeSensor.jar"

PATH = Working_directory + SOURCE_FILE + Software_package

Full_path = ""
"F:\final year project\g8-serp2021\A performance evaluation of deep‐learnt features for software vulnerability detection\Data\Non-vulnerable_funcs\Processed_data_results_FFmpeg"
print(PATH)
for fpathe, dirs, fs in os.walk(PATH):

    for f in fs:

        if (os.path.splitext(f)[1] == '.c'):  # Get the .c files only
            file_path = os.path.join(fpathe, f)  # f is the .c file, which will be processed by CodeSensor

            # With each .c file open, CodeSensor will process the opened file and output all the processed files to a specified directory.
            Full_path = CodeSensor_OUTPUT_PATH + "_" + f + ".txt"
            print(Full_path)
            with open(Full_path, "w+") as output_file:
                Popen(["java", '-jar', CodeSensor_PATH,file_path],
                      stdout=output_file, stderr=STDOUT)
                output_file.close()
