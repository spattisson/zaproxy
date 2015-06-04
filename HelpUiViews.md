# Views

ZAP provides a set of plugable views which allows you to display the requests and responses in different
ways.<br>The following views are included by default:<br>
<table>
<tr><td></td><td>Text</td><td>The data in text format</td></tr>
<tr><td></td><td>Hex</td><td>A table showing the hex representation of all of the characters in the header and body.  For editable<br>
screens this allows you to add control characters via their hex codes. You cannot add or delete characters<br>
in this view - to do that switch to one of the other views and then back to carry on in hex view.</td></tr>
<tr><td></td><td>Image</td><td>The image - only available for bodys containing images</td></tr>
<tr><td></td><td>Table</td><td>A table with one row per attribute and value. For editable screens all values will automatically be URL<br>
encoded when they are submitted. </td></tr>
<tr><td></td><td>Table (adv)</td><td>A table with one row per attribute and value plus additional functions. For editable screens values will<br>
not be automatically be URL encoded when they are submitted, but this can be done 'manually' via 'URLEncode'<br>
function. </td></tr>
<tr><td></td><td>Large Request</td><td>A placeholder view used to prevent the UI trying to load a very large request body. You will need to<br>
switch to a different view to display the actual contents. The threshold for the view can be changed<br>
via the <a href='HelpUiDialogsOptionsView'>Display Options screen</a></td></tr>
<tr><td></td><td>Large Response</td><td>A placeholder view used to prevent the UI trying to load a very large response body. You will need to<br>
switch to a different view to display the actual contents. The threshold for the view can be changed<br>
via the <a href='HelpUiDialogsOptionsView'>Display Options screen</a></td></tr>
</table>

Note that <a href='HelpStartConceptsAddons'>add-ons</a> can add additional views.<br>
<h2>Used in</h2>
<table>
<tr><td></td><td><a href='HelpUiTabsBreak'>Break tab</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiTabsRequest'>Request tab</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiTabsResponse'>Response tab</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiDialogsMan_req'>Manual Request dialog</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiDialogsResend'>Resend dialog</a></td><td></td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
</table>