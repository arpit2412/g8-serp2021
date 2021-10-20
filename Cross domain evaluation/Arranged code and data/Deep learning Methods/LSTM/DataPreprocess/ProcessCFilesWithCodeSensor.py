# -*- coding: utf-8 -*-
"""
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

CodeSensor_OUTPUT_PATH =""

CodeSensor_PATH = "...\\CodeSensor.jar"

PATH = "The path contains your .txt/.c files"

Full_path = "The path to store the output"
i = 0
for fpathe, dirs, fs in os.walk(PATH):
    for f in fs:
        if (os.path.splitext(f)[1] == '.txt' or os.path.splitext(f)[1] == '.c'):  # Get the .c files only
            file_path = os.path.join(fpathe, f)  # f is the .c file, which will be processed by CodeSensor

            # With each .c file open, CodeSensor will process the opened file and output all the processed files to a specified directory.
            Full_path = CodeSensor_OUTPUT_PATH + "_" + f + ".txt"
            i=i+1
            percent=i/len([lists for lists in os.listdir(PATH) if os.path.isfile(os.path.join(PATH, lists))])
            percent="%.2f%%" % (percent * 100)
            print("\rCurrent progress:{}".format(percent), end="")
            with open(Full_path, "w+") as output_file:
                Popen(["java", '-jar', CodeSensor_PATH,file_path],
                      stdout=output_file, stderr=STDOUT)
                output_file.close()
