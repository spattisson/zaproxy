# Options Fuzzer screen

This screen allows you to configure the [fuzzing](HelpAddonsFuzzConcepts) options:
### Default category
The category that will be initially selected shown when the [Fuzz dialog](HelpAddonsFuzzDialogue) is displayed.
### Concurrent scanning threads per host
The number of threads the scanner will use per host.<br>Increasing the number of threads will speed up the<br>
scan but may put extra strain on the computer ZAP is running on and the target host.<br>
<h3>Add custom Fuzz file</h3>
Allows you to add your own files to be used when fuzzing.<br>These should be text files with one attack per<br>
line.<br>Files are added to the 'fuzzers' directory underneath the ZAP home directory.