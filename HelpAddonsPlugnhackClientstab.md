# Plug-n-Hack Clients tab

Plug-n-Hack allows you to monitor client (browser) events in order to help test HTML5 applications.<br>In<br>
order to support as wide a range of modern browsers as possible this is implemented by injecting javascript<br>
into the response returned to the browser.<br>As it means changing the response this functionality has to<br>
be manually enabled.<br>
<br>
To receive client events:<br>
<ul><li>Access the pages you want to monitor while proxying through ZAP<br>
</li><li>Right click in the relevant node(s) in the Sites tree and select 'Monitor clients -> Include subtree'<br>
</li><li>Force your browser to reload those pages<br>
</li><li>Client events (such as postMessage, click, mouseover etc) will then be listed in this tab - select them to see the full details.</li></ul>


The injected javascript sends a heartbeat to ZAP, so ZAP can display all of the 'active' clients in this<br>
tab.<br>In this case 'active' clients are pages that are currently open in a browser tab.<br>You can edit and<br>
resend any event via a right click menu item as long as the original client is active.<br>

You can also intercept and change postMessages on the fly.<br>Client messages are intercepted if the ‘break<br>
on all requests’ button is selected on the top level toolbar.<br>You can also set custom client breakpoints<br>
via a button on the Clients tab.<br><br>You can fuzz postMessages in the same way as any other message - highlight<br>
the string you want to fuzz in the Request tab, right click and select “Fuzz”.<br>This option will only be<br>
available if the relevant browser still has that page open,as PnH sends the payloads to the browser.<br>Standard<br>
‘XSS’ payloads can be used to detect DOM XSS vulnerabilities, but you will need to manually monitor the<br>
UI to see if any of them are successful.<br><br>PnH also adds a Custom fuzzing file called “PlugnHack DOM XSS<br>
Oracle”.<br>This file is based on the OWASP XSS cheatsheet and invokes an ‘xss’ JavaScript method that is<br>
injected into the page. <br>This method invokes the ZAP API which in turn flags the relevant attack in the<br>
UI - these are confirmed DOM XSS vulnerabilities, although (as always) you should check that they can<br>
really be exploited in the application you are testing without a tool like ZAP.<br>