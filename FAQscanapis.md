# [FAQ:](FAQtoplevel) How can you use ZAP to scan APIs?

ZAP understands API formats like JSON and XML and so can be used to scan APIs.

The problem is usually how to effectively explore the APIs.

There are various options:

* If your API has a WSDL then you can import this using the 'SOAP Scanner' add-on available from the [ZAP Marketplace](https://github.com/zaproxy/zap-extensions/wiki)

* If you have a list of endpoint URLs then you can import these using the 'Import files containing URLs' add-on available from the [ZAP Marketplace](https://github.com/zaproxy/zap-extensions/wiki)

* If you have regression tests for you API then you can proxy these through ZAP

Once ZAP knows about the URL endpoints it can scan them in the same way as it scans HTML based web sites.

If you dont have any of these things then post to the [ZAP User Group](http://groups.google.com/group/zaproxy-users) explaining what you are trying to do and the problems you are having.

---

[Back to the FAQ](FAQtoplevel)