## SERP Project 8 - Evaluating Cross Domain Vulnerability Detection Methods

This project explores evaluating various deep learning based cross-project vulnerability detection methods. Methods from different research papers will be replicated to provide a baseline for our evaluation framework. Our framework will be reproducible and can be adopted into future reseach for determining the optimum vulnerability detection method. Research papers(scope), source code, and feature extraction tools will be provided within this repository.<br /><br />

## Tools Used

### Understand by SciTools
Understand is a commercial code enhancement tool for extracting function-level code metrics.
#### Source: [https://www.scitools.com/](https://www.scitools.com/)<br /><br />

### CodeSensor (version 2.0)
CodeSensor is a robust code to Abstract Syntax Tree(AST) parser implemented by based on the concept of island grammars.
#### Source: [https://github.com/fabsx00/codesensor](https://github.com/fabsx00/codesensor)<br /><br /><br />

## Papers Replicated
### POSTER: Vulnerability Discovery with Function Representation Learning from Unlabeled Projects 
This project explores using function-level vulnerability discovery within a cross-project scope. The AST representation will be the training data used for a bidirectional LSTM neural network. Typical Recurrent neural networks have difficulties in capturing long term dependencies regarding continuous and fragment elements associated with vulnerability therefore the method combines RNN with LSTM cells to handle the vulnerabilities with long term dependencies  spanning multiple lines of code. The function level representation model machine learning model has demonstrated significant performance gains
#### Paper: [https://dl.acm.org/doi/abs/10.1145/3133956.3138840](https://dl.acm.org/doi/abs/10.1145/3133956.3138840)
#### Source code: [https://github.com/DanielLin1986/function_representation_learning](https://github.com/DanielLin1986/function_representation_learning)
#### Results: <br /><br />

### Software Vulnerability Discovery via Learning Multi-domain Knowledge Bases 
A framework is proposed to address the underlying issues regarding automated vulnerability discovery. The framework incorporates transferable knowledge from preexisting data sources that could be applied to real-world vulnerability detection. The method addresses the issue regarding the shortage of labeled data for model training by using cross domain vulnerability relevant data from past vulnerabilities from multiple open source projects and Software Assurance Reference Database (SARD) with examples of artificial  vulnerabilities samples.  2 LSTM networks will be used from training each type of data set independently and the separate representation will be combined and trained using a random forest classifler to enhance detection capabilities.  
#### Paper: [https://ieeexplore.ieee.org/abstract/document/8906156](https://ieeexplore.ieee.org/abstract/document/8906156)
#### Source code: [https://github.com/DanielLin1986/RepresentationsLearningFromMulti_domain](https://github.com/DanielLin1986/RepresentationsLearningFromMulti_domain)
#### Results: 

