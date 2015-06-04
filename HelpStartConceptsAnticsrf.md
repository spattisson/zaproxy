# Anti CSRF Tokens

Anti CSRF tokens are (pseudo) random parameters used to protect against Cross Site Request Forgery (CSRF)
attacks.<br>However they also make a penetration testers job harder, especially if the tokens are regenerated<br>
every time a form is requested.<br>

ZAP detects anti CSRF tokens purely by attribute names - the list of attribute names considered to be<br>
anti CSRF tokens is configured using the <a href='HelpUiDialogsOptionsAnticsrf'>Options Anti CSRF screen</a>.<br>When ZAP detects these tokens it records the token value and which URL generated the token.<br>Other scanners, like <a href='HelpStartConceptsAscan'>active scanner</a>, have options which cause ZAP to automatically regenerate the tokens when required.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
</table>