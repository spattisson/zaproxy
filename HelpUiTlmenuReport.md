# The Report menu
This menu handles the reports.
### Generate HTML Report ...
This generates a new HTML report containing the alerts raised.
### Generate XML Report ...
This generates a new XML report containing the alerts raised.
### Export Messages to File...
This allows you to save requests and responses to a text file. <br>Select the messages to save in the History<br>
tab - use the shift key to select multiple messages.<br>
<h3>Export Response to File...</h3>
This allows you to save a specific response to a file. <br>Select the relevant message in the History tab<br>
- note that binary responses (such as images) can be saved as well as test responses.<br>
<h3>Export All URLs to File...</h3>
This allows you to save all of the URLs accessed to a text or HTML file. <br>The URLs will be preceded by<br>
the HTTP method used. <br>This can be used, amongst other things, to compare the URLs available to users<br>
with different roles or permissions on the same system.<br>
<h3>Compare with another Session...</h3>
This prompts you for a ZAP session that you have previously saved. <br>It then prompts you for an output<br>
file into which is written all of the URLs accessed by the current session and the session you have selected<br>
to compare it with.<br>The file will contain a table listing the URLs and the HTTP responses for the URLs<br>
in the 2 sessions.<br>JavaScript buttons allow you to display all of the URLs, just those accessed in the<br>
first session, the second session and those accessed by both sessions.<br>This is particularly useful for<br>
comparing 2 sessions which access the same application using different users. You will be able to see<br>
which URLs are visible to the users and will be able to try to access all of the URLs when logged in<br>
as either of the users.<br>
<br>
Note that <a href='HelpStartConceptsAddons'>add-ons</a> can add additional menu items.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiTlmenuTlmenu'>The top level menu</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
</table>