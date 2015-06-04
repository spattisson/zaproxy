# Scan Policy dialog

This allows you to enable and disable the rules that are run when performing an [active scan](HelpStartConceptsAscan).<br>The first screen allows you to define the default levels as well as the levels for all of the rules in a specific category.<br><br>The category screens allow you to define the levels for every individual rule.<br><br><br>Note that <a href='HelpStartConceptsPscan'>passive scan</a> rules are no longer managed via this dialog but are instead managed via the <a href='HelpUiDialogsOptionsPscanrules'>Options Passive Scan Rules</a>.<br>
<h3>Threshold</h3>
This controls how likely ZAP is to report potential vulnerabilities.<br>If you select Low then more potential<br>
issues will be raised which may increase the number of false positives.<br>If you select High then fewer<br>
potential issues will be raised which may mean that some real issues are missed (false negatives).<br>
<h3>Strength</h3>
This controls the number of attacks that ZAP will perform.<br>If you select Low then fewer attacks will be<br>
used which will be quicker but may miss some issues.<br>If you select High then more attacks will be used<br>
which may find more issues but will take longer.<br>The Insane level should typically only be used for small<br>
parts of an application as it can result in a very large number of attacks being used, which can take<br>
a considerable length of time.<br>
<h2>Accessed via</h2>
<table>
<tr><td></td><td><a href='HelpUiDialogsScanpolicymgr'>Scan Policy Manager dialog</a></td><td></td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsDialogs'>Dialogs</a></td><td>for details of the dialogs or popups </td></tr>
</table>