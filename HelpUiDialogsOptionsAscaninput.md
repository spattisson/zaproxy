# Options Active Scan Input Vectors screen

This screen allows you to configure the [active scan](HelpStartConceptsAscan) input vectors.<br>These are the elements that the active scanner will attack.<br>Scanning all of the elements supported will take longer, but not scanning some elements may cause some vulnerabilities to be missed.<br>
<h3>Injectable Targets</h3>
The request element that the active scanner will target:<br>
<table>
<tr><td></td><td>URL Query String</td><td>Key value pairs in the request URL query, ie after the '?'</td></tr>
<tr><td></td><td>POST Data</td><td>Key value pairs in the request POST data</td></tr>
<tr><td></td><td>URL Path</td><td>Path elements in the request URL, ie the elements separated by '/'</td></tr>
<tr><td></td><td>HTTP Headers</td><td>Request HTTP Headers</td></tr>
<tr><td></td><td>Cookie data</td><td>Request cookies</td></tr>
</table>
<h3>Build-in Input Vector Handlers</h3>
The data formats that the active scanner will target:<br>
<table>
<tr><td></td><td>Multipart Form Data</td><td></td></tr>
<tr><td></td><td>XML tag/attribute</td><td></td></tr>
<tr><td></td><td>JSON</td><td></td></tr>
<tr><td></td><td>Google Web Toolkit</td><td></td></tr>
<tr><td></td><td>OData id/filter</td><td></td></tr>
</table>
<h3>Enable Script Input Vectors</h3>
If this option is selected then the active scanner will use any enabled script input vectors.<br>Script input<br>
vectors are scripts which you have written or imported into ZAP and allow you to target elements which<br>
are not supported by default.<br>
<br>
This screen also allows you to configure the parameters which will be ignored by the active scanner.<br>
<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsOptions'>Options dialogs</a></td><td>for details of the other Options dialog screens</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsAscaninput'>Active Scan Input Vectors</a></td><td></td></tr>
</table>