# Command Line
Quick Start add-on supports the following command line options:
<table>
<tr><td></td><td>-quickurl</td><td>Specifies the URL of the target application that will be attacked.</td></tr>
<tr><td></td><td>-quickout</td><td>Specifies the file to write the XML report to. If not set in 'inline' and daemon modes the report is<br>
written to default output stream.</td></tr>
</table>
<br>

Examples:<br>
<ul><li>Start ZAP in 'inline' mode, attack the target application <a href='http://example.com/'>http://example.com/</a> and write the report to default output stream: <pre>-cmd -quickurl http://example.com/</pre>
</li><li>Start ZAP with UI, attack the target application <a href='http://example.com/'>http://example.com/</a> and save the report to a file: <pre>-quickurl http://example.com/ -quickout /path/to/report.xml</pre>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpAddonsQuickstartQuickstart'>Quick Start</a></td><td>the introduction to Quick Start</td></tr>
</table>