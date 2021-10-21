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
![screenshot](https://github.com/arpit2412/g8-serp2021/blob/main/Paper%20Replication%20Attempt%20Results/POSTER%20Vulnerability%20Discovery%20with%20Function%20Representation%20Learning%20from%20Unlabeled%20Projects/results.png)<br /><br />



## Papers Replicated/Scope
### Dual-component Deep domain Adaptation: A New Approach for Cross Project Software Vulnerability Detection
To address the issue concerning the scarcity of labeled vulnerabilities in data sets used for software vulnerability detection, a deep domain adaptation soltuion is proposed. Using deep domain adaptation labelled vulnerability representations from a source dataset could be transfered to an unlabelled target dataset. this paper proposes an Dual Generator-Discriminator Deep Code Domain Adaptation Network (Dual-GD-DDAN) architecture for handling transfer learning from a labelled source to unlabelled target dataset.
#### Paper: [https://link.springer.com/chapter/10.1007/978-3-030-47426-3_54](https://link.springer.com/chapter/10.1007/978-3-030-47426-3_54)
#### Source code: [https://github.com/vannguyennd/dual-dan?fbclid=IwAR2fcuVwPvZlCtvUY3c_Bis0q6NND1jl5GS5UUMxvR9shOlef0doDzRUENk](https://github.com/vannguyennd/dual-dan?fbclid=IwAR2fcuVwPvZlCtvUY3c_Bis0q6NND1jl5GS5UUMxvR9shOlef0doDzRUENk)
#### Tools:

### CodeSensor (version 0.2)
CodeSensor is a robust code to Abstract Syntax Tree(AST) parser implemented by based on the concept of island grammars.<br />
<b>Source:</b> [https://github.com/fabsx00/codesensor](https://github.com/fabsx00/codesensor)<br /><br />
#### Results: <br /><br />

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

