# Fuzzing

Fuzzing is a technique of submitting lots of invalid or unexpected data to a target.

ZAP allows you to fuzz any request still using a built in set of payloads.<br>To fuzz a request string:<br>
<ul><li>Select a request in the Sites or History tab<br>
</li><li>Highlight the string you wish to fuzz in the Request tab<br>
</li><li>Right click in the Request tab and select 'Fuzz...'<br>
</li><li>Add payloads and new locations<br>
</li><li>Press the Start Fuzzer button<br>
</li><li>The results will then be listed in the <a href='HelpAddonsFuzzTab'>Fuzzer tab</a> select them to see the full requests and responses.<br>
You can also search for strings in the fuzz results using the 'Search tab'.</li></ul>

Fuzzing is configured using the <a href='HelpAddonsFuzzOptions'>Options Fuzzing screen</a>. Additional fuzzing files can be added via this screen or can be put manually into the "fuzzers" directory where ZAP was installed - they will then become available after restarting ZAP.<br>
<br>
This functionality is based on code from the OWASP JBroFuzz project and includes files from the fuzzdb<br>
project.<br>Note that some fuzzdb files have been left out as they cause common anti virus scanners to flag<br>
them as containing viruses.<br>You can replace them (and upgrade fuzzdb) by downloading the latest version<br>
of fuzzdb and expanding it in the 'fuzzers' library.