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

Software_package = "FFmpeg"

Working_directory = "F:\\final year project\\g8-serp2021\\A performance evaluation of deep‐learnt features for software vulnerability detection\\"

SOURCE_FILE = "Data\\1\\"

CodeSensor_OUTPUT_PATH = Working_directory + SOURCE_FILE + " "+"\\"

CodeSensor_PATH = "F:\\final year project\\g8-serp2021\\codesensor tool\\CodeSensor.jar"

PATH = Working_directory + SOURCE_FILE + Software_package

Full_path = ""
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
