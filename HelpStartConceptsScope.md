# Scope

The Scope is the set of URLs you are testing, and is defined by the [Contexts](HelpStartConceptsContexts) you have specified.<br><br>By default nothing is in scope.<br>
<br>
The Scope potentially changes:<br>
<ul><li>What you can do, when you are in Protected <a href='HelpStartConceptsModes'>mode</a>
</li><li>What is shown in the <a href='HelpUiTabsHistory'>History tab</a>
</li><li>Protected - user can only perform (potentially) dangerous actions on URLs in the Scope<br>
</li><li>Standard - as in previous releases, user can do anything<br>
</li><li>ATTACK - new nodes that are in Scope are <a href='HelpStartConceptsAscan'>actively scanned</a> as soon as they are discovered<br>
It is recommended that you define a new <a href='HelpStartConceptsContexts'>Context</a> for each web application that makes up the system you are testing, and set them in scope as you test each one.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
</table>