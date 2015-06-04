# Passive Scan

ZAP passively scans all of the responses from the web application being tested.<br>Passive scanning does<br>
not change the responses in any way and is therefore safe to use.<br>Scanned is performed in a background<br>
thread to ensure that it does not slow down the exploration of an application.<br>
<br>
In this release ZAP passive scanning is used for automatically adding <a href='HelpStartConceptsTags'>tags</a> and raising <a href='HelpStartConceptsAlerts'>alerts</a> for potential issues.<br>
<br>
A set of rules for automatic tagging are provided by default.<br>These can be changed, deleted or added to<br>
via the <a href='HelpUiDialogsOptionsPscan'>Options Passive Scan Tags screen</a>.<br>

The alerts raised by passive scanning can be configured using the <a href='HelpUiDialogsOptionsPscanrules'>Options Passive Scan Rules screen</a>.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpStartConceptsAscan'>Active scanning</a></td><td></td></tr>
<tr><td></td><td><a href='HelpStartChecks'>Scanner Rules</a></td><td>supported by default</td></tr>
</table>