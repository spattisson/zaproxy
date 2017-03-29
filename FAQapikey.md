# [FAQ:](FAQtoplevel) Why is an API key required by default?

Since version 2.4.1 ZAP has required an API key by default in order to invoke API operations that make changes to ZAP. Since version 2.6.0 an API key is required by default in order to invoke any of the API operations. This is a security feature to prevent malicious sites from invoking the ZAP API. ZAP Version 2.6.0 also introduced additional security options. All of the API security options, including the API key, can be found in the [API Options screen](https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsOptionsApi).

You can also set the API key from the command line using an option like:
<pre>-config api.key=change-me-9203935709</pre>
This is not recommended unless you are using ZAP in a completely isolated environment, as it allows malicious sites to access the ZAP API. However, you can disable it via the UI or via the command line option:
<pre>-config api.disablekey=true</pre>
By default ZAP will now also only allow connections from the local machine. You can set which IP addresses can connect to the API using the command line:
<pre>-config api.addrs.addr.name=123.456.789.123</pre>
If you using ZAP in a completely isolated environment you can allow all IP addresses to connect to the ZAP API using:
<pre>-config api.addrs.addr.name=.* -config api.addrs.addr.regex=true</pre>

An overview of the vulnerabilities that necessitated the additional security features are given in the [2.6.0 Release Notes](https://github.com/zaproxy/zap-core-help/wiki/HelpReleases2_6_0)

---

[Back to the FAQ](FAQtoplevel)
