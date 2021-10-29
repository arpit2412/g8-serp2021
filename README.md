# SERP Project 8 - Evaluating Cross-Domain Vulnerability Detection Methods

This project explores evaluating various deep learning-based cross-project vulnerability detection methods. Methods from different research papers will be replicated to provide a baseline for our evaluation framework. Our framework will be reproducible and can be adopted into future research for determining the optimum vulnerability detection method. Research papers(scope), source code, and feature extraction tools will be provided within this repository.<br /><br />

## Papers Replicated/Scope
### POSTER: Vulnerability Discovery with Function Representation Learning from Unlabeled Projects 
This project explores using function-level vulnerability discovery within a cross-project scope. The AST representation will be the training data used for a bidirectional LSTM neural network. Typical Recurrent neural networks have difficulties in capturing long-term dependencies regarding continuous and fragment elements associated with vulnerability therefore the method combines RNN with LSTM cells to handle the vulnerabilities with long-term dependencies spanning multiple lines of code. The function level representation model machine learning model has demonstrated significant performance gains
#### Paper: [https://dl.acm.org/doi/abs/10.1145/3133956.3138840](https://dl.acm.org/doi/abs/10.1145/3133956.3138840)
#### Source code: [https://github.com/DanielLin1986/function_representation_learning](https://github.com/DanielLin1986/function_representation_learning)
#### Tools:

### Understand by SciTools
Understand is a commercial code enhancement tool for extracting function-level code metrics.<br />
<b>Source:</b> [https://www.scitools.com/](https://www.scitools.com/)<br /><br />

### CodeSensor (version 2.0)
CodeSensor is a robust code to Abstract Syntax Tree(AST) parser implemented by based on the concept of island grammars.<br />
<b>Source:</b> [https://github.com/fabsx00/codesensor](https://github.com/fabsx00/codesensor)<br /><br />
#### Results: <br /><br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/Poster_replication/paper%20replication%20attempt%20results/POSTER%20Vulnerability%20Discovery%20with%20Function%20Representation%20Learning%20from%20Unlabeled%20Projects/results.png)<br /><br /><br />


### Dual-component Deep domain Adaptation: A New Approach for Cross Project Software Vulnerability Detection
To address the issue concerning the scarcity of labeled vulnerabilities in data sets used for software vulnerability detection, a deep domain adaptation soltuion is proposed. Using deep domain adaptation labelled vulnerability representations from a source dataset could be transfered to an unlabelled target dataset. this paper proposes an Dual Generator-Discriminator Deep Code Domain Adaptation Network (Dual-GD-DDAN) architecture for handling transfer learning from a labelled source to unlabelled target dataset.
#### Paper: [https://link.springer.com/chapter/10.1007/978-3-030-47426-3_54](https://link.springer.com/chapter/10.1007/978-3-030-47426-3_54)
#### Source code: [https://github.com/vannguyennd/dual-dan?fbclid=IwAR2fcuVwPvZlCtvUY3c_Bis0q6NND1jl5GS5UUMxvR9shOlef0doDzRUENk](https://github.com/vannguyennd/dual-dan?fbclid=IwAR2fcuVwPvZlCtvUY3c_Bis0q6NND1jl5GS5UUMxvR9shOlef0doDzRUENk)
#### Tools:

### joern - Data pre-processing tool for DDAN & Dual-DDAN
Joern will be utilized to analyze the source codes to get user-defined variables and functions.<br />
<b>Source:</b> [https://joern.readthedocs.io/en/latest/]<br /><br />
#### Results: <br /><br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/DDAN_DUAL_DDAN_COMPARSION2.png)<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/DDAN_DUAL_DDAN_COMPARSION1.png)<br />

## Validation Data

### SySeVR: A Framework for Using Deep Learning to Detect Software Vulnerabilities
126 types of vulnerabilities within source code, were collected from the National Vulnerability Database (NVD) and the Software Assurance Reference Dataset (SARD). The NVD data set contains vulnerabilities from 29 open-source software projects. The SARD dataset contains 13,906 vulnerable C/C++ programs out of a total of 14,000. Vulnerable data representations are aimed to accommodate both syntax and semantic information by introducing the notion of: 
- Syntax-based Vulnerability Candidates (SyVCs)  
- Semantics-based Vulnerability Candidates (SeVCs) 
 
 A program as a whole is divided into statements that correspond to “region proposals” and display the syntax and semantics characteristics of vulnerabilities. SyVCs are representative of vulnerability syntax characteristics and are extended upon by SeVCs for accommodating the semantic information due to the presence of data dependency and control dependency.

#### Paper: [https://ieeexplore.ieee.org/abstract/document/9321538](https://ieeexplore.ieee.org/abstract/document/9321538)
#### Vulnerable data: [https://github.com/SySeVR/SySeVR/tree/master/Program%20data](https://github.com/SySeVR/SySeVR/tree/master/Program%20data)
<br /><br />

## System Design/Requirements
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/resource/system%20design.png)<br /><br />

## Performance Metrics
In order to compare the performance of each model horizontally, we introduced five performance metrics: FNR, FPR, Recall, Precision and F1-score. The parameters of these performance indicators can be calculated through the confusion matrix of the model.<br />
FNR (False Negative Rate, best = 0): FNR represents that in the positive class, how many samples are predicted to be the negative class which is an error rate. In the project, the FNR demonstrates that the rate of non-vulnerable functions has been identified as vulnerable. <br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/FNR_Calc.png)<br />
FPR (False Positive Rate, best = 0): FPR represents that in the negative class, how many samples are predicted to be a positive class which is an error rate. In the project, FPR represents that the rate of the vulnerable function has been identified as non-vulnerable. Therefore, it directly demonstrates the capability of the model to correctly find out the vulnerable functions. FPR is one of our key performance indicators.<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/FPR_Calc.png)<br />
Precision (best = 1): Model precision score represents the rate of the model correctly classifying the positive sample out of all the positive predictions made.<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/Precision_Calc.png)<br />
Recall (best = 1): Model recall score represents the model’s ability to correctly predict the positives out of actual positives. The higher the recall score, the better the machine learning model is at identifying both positive and negative classes.<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/Recall_Calc.png)<br />
F1-Score (best = 1): Model F1 score represents the model score as a function of precision and recall score. F1-score is a machine learning model performance metric that gives equal weight to both the Precision and Recall for measuring its performance in terms of accuracy. It’s often used as a single value that provides high-level information about the model’s output quality. Therefore, F1-score is one of our key performance indicators.<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/F1_Calc.png)<br />


## LSTM, RF, DDAN and Dual-DDAN performance results
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/all_data_result.png)<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/FPR_PERFORMANCE.png)<br />
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/wiki_images/F1_PERFORMANCE.png)<br />
