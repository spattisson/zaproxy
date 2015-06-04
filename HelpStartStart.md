# Getting Started

The quickest way to get going with ZAP is to use the Quick Start add-on, which is installed by default.<br>This<br>
allows you to enter a URL which ZAP will first <a href='HelpStartConceptsSpider'>spider</a> and then <a href='HelpStartConceptsAscan'>active scan</a>.<br>For a more in depth test you should explore your application using your browser or automated regression tests while proxying through ZAP.<br>
<br>
At its heart ZAP is an <a href='HelpStartConceptsIntercept'>intercepting proxy</a>.<br>You need to configure your browser to connect to the web application you wish to test through ZAP.<br>If required you can also configure ZAP to connect through another proxy - this is often necessary in a corporate environment.<br>

If you know how to set up proxies in your web browser then go ahead and give it a go!<br>If you are unsure<br>
then have a look at the <a href='HelpStartProxies'>Configuring proxies</a> section.<br>
<br>
Once you have configured ZAP as your browser's proxy then try to connect to the web application you will<br>
be testing.<br>If you can not connect to it then check your proxy settings again. You will need to check<br>
your browser's proxy settings, and also ZAP's proxy settings. <br>Its also worth checking that the application<br>
that you are trying to test is running!<br>
<br>
When you have successfully connected to your application via your browser then have a look at ZAP again.<br>
You should now see one or more lines in the <a href='HelpUiTabsSites'>Sites</a> and <a href='HelpUiTabsHistory'>History</a> tabs.<br>If so we're in business. If not then you'll need to check your proxy settings again.<br>
<br>
The next thing to do is to start a <a href='HelpPentestPentest'>basic penetration test</a>.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpStartProxies'>Configuring Proxies</a></td><td>for details of how to set up ZAP as a proxy in your web browser</td></tr>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpStartChecks'>Scanner Rules</a></td><td>supported by default</td></tr>
</table>