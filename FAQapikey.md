# [FAQ:](FAQtoplevel) Why is an API key created by default from ZAP 2.4.1?

Starting from version 2.4.1 ZAP creates an API key by default.<br>
Applications that use the ZAP API will only work if they supply the correct key.<br>
This is a security feature to prevent malicious sites from invoking the ZAP API.

The API key can be found in the <a href="https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsOptionsApi">API Options screen</a><br>
You can also set it from the command line using an option like: 
<pre>-config api.key=change-me-9203935709</pre>
You can disable it via the UI or via the command line option: 
<pre>-config api.disablekey=true</pre>
This is not recommended unless you are using ZAP in a completely isolated environment, as it allows malicious sites to access the ZAP API.

---

[Back to the FAQ](FAQtoplevel)
