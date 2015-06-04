# API

ZAP provides an Application Programming Interface (API) which allows you to interact with ZAP programmatically.


The API is available in JSON, HTML and XML formats.<br>The API documentation is available via the URL <a href='http://zap/'>http://zap/</a>
when you are proxying via ZAP.<br>

It should be noted that there is minimal security built into the API, which is why it is disabled by<br>
default.<br>If enabled then the API is available to all machines that are able to use ZAP as a proxy.<br>By default<br>
ZAP listens only on 'localhost' and so can only be used from the host machine.<br>
<br>
The API provides access to the core ZAP features such as the <a href='HelpStartConceptsAscan'>active scanner</a> and <a href='HelpStartConceptsSpider'>spider</a>.<br>Future versions of ZAP will increase the functionality available via the APi.<br>
<br>
The API is configured using the <a href='HelpUiDialogsOptionsApi'>Options API screen</a>.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
</table>