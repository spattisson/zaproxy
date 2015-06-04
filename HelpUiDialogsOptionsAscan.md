# Options Active Scan screen

This screen allows you to configure the [active scan](HelpStartConceptsAscan) options:
### Number of hosts scanned concurrently
The maximum number of hosts that will be scanned at the same time. Increasing this may put extra strain
on the computer ZAP is running on.
### Concurrent scanning threads per host
The number of threads the scanner will use per host.<br>Increasing the number of threads will speed up the<br>
scan but may put extra strain on the computer ZAP is running on and the target host.<br>
<h3>Max results to list</h3>
The number of results that will be shown in the Active Scan tab.<br>Displaying a large number of results<br>
can significantly increase the time a scan takes.<br>
<h3>Delay when scanning in milliseconds</h3>
The delay in milliseconds between each request.<br>Setting this to a non zero value will increase the time<br>
an active scan takes, but will put less of a strain on the target host.<br>
<h3>Handle anti CSRF tokens</h3>
If this option is selected then the active scanner will attempt to automatically request <a href='HelpStartConceptsAnticsrf'>anti CSRF</a> tokens when required.<br>Note that this is experimental functionality and will slow down the scanning process as only one thread will be used to ensure that anti CSRF token requests dont get out of step.<br>
<h3>In Attack mode prompt to rescan nodes when scope changed</h3>
If this option is selected then when you select Attack <a href='HelpStartConceptsModes'>mode</a> you will be prompted to choose whether to rescan nodes in scope.<br>If the option is not selected then the following option will control whether the nodes are rescanned.<br>
<h3>In Attack mode always rescan nodes when scope changed</h3>
If this option is selected then when running in Attack <a href='HelpStartConceptsModes'>mode</a> all nodes in scope will be rescanned if the scope changes.<br>This is not recommended for large sites as it could take a long time.<br>
<h3>Default active scan policy</h3>
The <a href='HelpStartConceptsScanpolicy'>Scan Policy</a> that is used by default when you start an active scan.<br>
<h3>Attack mode scan policy</h3>
The <a href='HelpStartConceptsScanpolicy'>Scan Policy</a> that is used for scanning in Attack <a href='HelpStartConceptsModes'>mode</a>.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsOptions'>Options dialogs</a></td><td>for details of the other Options dialog screens</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsAscan'>Active Scan options</a></td><td></td></tr>
</table>