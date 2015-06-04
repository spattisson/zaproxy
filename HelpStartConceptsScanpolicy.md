# Scan Policy

A scan policy defines exactly which [rules](HelpStartChecks) are run as part of an [active scan](HelpStartConceptsAscan).<br>It also defines how these rules run influencing how many requests are made and how likely potential issues are to be flagged.<br>You can define as many scan policies as you like and select the most appropriate one when you start the scan via the <a href='HelpUiDialogsAdvascan'>Active Scan Dialog</a>.<br>You can define the default scan policy to be used for active scans and for the <a href='HelpStartConceptsModes'>Attack mode</a> via the <a href='HelpUiDialogsOptionsAscan'>Options Active Scan screen</a>.<br>

Active scanning is an attack on those targets. <br>You should NOT use it on web applications that you do<br>
not own.<br>
<br>
It should be noted that active scanning can only find certain types of vulnerabilities.<br>Logical vulnerabilities,<br>
such as broken access control, will not be found by any active or automated vulnerability scanning.<br>Manual<br>
penetration testing should always be performed in addition to active scanning to find all types of vulnerabilities.<br>
<br>
<br>
Active scanning is configured using the <a href='HelpUiDialogsOptionsAscan'>Options Active Scan screen</a>.<br>You can also define as many scan policies as you like - these define exactly which rules are run and how they work.<br>
<h2>Accessed via</h2>
<table>
<tr><td></td><td><a href='HelpUiTabsAscan'>Active Scan tab</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiTabsSites'>Sites tab</a></td><td>'Attack/Active Scan site' right click menu item</td></tr>
<tr><td></td><td><a href='HelpUiTabsSites'>Sites tab</a></td><td>'Attack/Active Scan node' right click menu item</td></tr>
<tr><td></td><td><a href='HelpUiTabsHistory'>History tab</a></td><td>'Scan this History' right click menu item</td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpStartConceptsPscan'>Passive scanning</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiDialogsScanpolicymgr'>Scan Policy Manager Dialog</a></td><td>which allows you to manage the scan policies</td></tr>
<tr><td></td><td><a href='HelpStartChecks'>Scanner Rules</a></td><td>supported by default</td></tr>
</table>