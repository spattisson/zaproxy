# Modes

The ZAP UI has a 'mode' which can be:
  * Safe - no potentially dangerous operations permitted
  * Protected - you can only perform (potentially) dangerous actions on URLs in the [Scope](HelpStartConceptsScope)
  * Standard - as in previous releases, you can do anything
  * ATTACK - new nodes that are in [Scope](HelpStartConceptsScope) are [actively scanned](HelpStartConceptsAscan) as soon as they are discovered
It is recommended that you use the Protected mode to ensure that you only attack sites that you mean
to.<br><br>The mode can be changed via the <a href='HelpUiTltoolbar'>toolbar</a> and is persisted between sessions.<br>It does not apply to the API.<br><br>Examples of the things that will not be possible in either Safe mode or in Protected mode when not acting on URLs in the Scope:<br>
<ul><li>Spidering<br>
</li><li>Active Scanning<br>
</li><li>Fuzzing<br>
</li><li>Force Browsing<br>
</li><li>Breaking (intercepting)<br>
</li><li>Resending requests<br>
You can define the <a href='HelpStartConceptsScanpolicy'>Scan Policy</a> to be used for the Attack mode the <a href='HelpUiDialogsOptionsAscan'>Options Active Scan screen</a>.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
</table>