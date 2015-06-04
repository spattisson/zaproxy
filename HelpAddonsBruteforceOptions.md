# Options Forced Browse screen

This screen allows you to configure the [Forced Browse](HelpAddonsBruteforceConcepts) options:
### Concurrent scanning threads per host
The number of threads the scanner will use per host. <br>Increasing the number of threads will speed up the<br>
scan but may put extra strain on the computer ZAP is running on and the target host.<br>
<h3>Recursive</h3>
If checked then the scanner will recurse through all of the sub-directories found. <br>This may take a long<br>
time.<br>
<h3>Default file</h3>
The default file selected when ZAP starts.<br>
<h3>Add custom Forced Browse file</h3>
Allows you to add your own files to be used when brute forcing files and directories. <br>These should be<br>
text files with one file or directory name per line. <br>Files are added to the 'dirbuster' directory underneath<br>
the ZAP home directory.