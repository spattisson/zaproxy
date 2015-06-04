# [FAQ:](FAQtoplevel) How can I use ZAP with a Java application which connects to a web service over SSL?

You'll need to [generate a dynamic root CA certificate](https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsOptionsDynsslcert).

Export it into a file.

Import it in to the JRE cacerts keystore.

Assuming the Java keytool is on the system path, JAVA\_HOME is set to the
location of a JRE and the Zaproxy CA cert is exported to
"~/owasp\_zap\_root\_ca.cer", then the command is:

```
 $ keytool -importcert -keystore $JAVA_HOME/lib/security/cacerts -file ~/owasp_zap_root_ca.cer -alias owasp_zap_root_ca
```

When you run your application you'll need to make sure its using ZAP as a proxy.

If it doesnt have specific proxy settings then you can do that by setting the "http.proxyHost" and "http.proxyPort" Java system variables to the right values, eg "localhost" and "8080"