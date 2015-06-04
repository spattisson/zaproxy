# Manual Request Editor dialog
This dialog allows you to create a request from scratch which will be submitted to the specified target.
## Request tab
This shows the request header and data, either in one or two panels depending on the options chosen.
<br><br>A 'Method' pull down allows you to switch between the HTTP methods.<br>Note that when the method is changed<br>
to a POST then any URL parameters are moved into the body, and when the method is changed from a POST<br>
then any parameters in the body are moved to the URL. <br><br>Pull downs allow you to select different <a href='HelpUiViews'>Views</a> for the Request header and body.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/view_split.png' />  Split display for header and body</h3>
This changes the display so that separate panes are used for the header and body.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/view_all.png' />  Combined display for header and body</h3>
This changes the display so that the header and body are shown in one pane.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/cookie.png' />  Use current tracking session</h3>
See the 'Enable session tracking (Cookie)' menu item in the <a href='HelpUiTlmenuEdit'>Edit menu</a>.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/118.png' />  Follow redirect</h3>
If selected automatically follows any redirects sent to the browser.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/layout_tabbed.png' />  Request and Response tabs side by side</h3>
This changes the display so that the request and response tabs are side by side.<br>This increases the information<br>
that can be displayed but means you cannot see both the request and response at the same time.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/layout_vertical_split.png' />  Request shown above Response</h3>
This changes the display so that the request panel is shown above the response panel.<br>This decreases the<br>
information that can be displayed but means you can see both the request and response at the same time.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/layout_horizontal_split.png' />  Request and Response panels side by side</h3>
This changes the display so that the request panel is shown to the left of the response panel.<br>This decreases<br>
the information that can be displayed but means you can see both the request and response at the same<br>
time.<br>
<h2>Response tab</h2>
This shows the data sent to your browser in response to the request that you submitted, either in one<br>
or two panels depending on the options chosen.<br><br>Pull downs allow you to select different <a href='HelpUiViews'>Views</a> for the Response header and body.<br>
<h2>Right click menu</h2>
Right clicking will bring up a menu which will allow you to:<br>
<h3>Find...</h3>
This will bring up the <a href='HelpUiDialogsFind'>Find dialog</a>.<br>
<h3>Encode/Decode...</h3>
This will bring up the <a href='HelpUiDialogsEnc_dec'>Encode/Decode dialog</a>.<br>If you have highlighted any text then this will be automatically included in the dialog.<br>
<h2>Accessed via</h2>
<table>
<tr><td></td><td><a href='HelpUiTlmenuTools'>Top level Tools menu</a></td><td>'Manual Request Editor ...' menu item</td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsDialogs'>Dialogs</a></td><td>for details of the dialogs or popups </td></tr>
</table>