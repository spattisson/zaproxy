# How to connect to an HTTPS site that reports a handshake failure?

First of all try checking the 'Enable unsafe SSL/TLS renegotiation' checkbox in the Certificate Options screen and trying again.

If this doesn't help and an HTTPS site reports a handshake failure then try installing the 'Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files':

* Java 7 : http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html
* Java 8 : http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

You will need to restart ZAP for these to take effect.

Note that on OS X we include the JRE with the ZAP application, so you'll need to start ZAP with an installed JRE from the command line.

If this doesn't help then get in touch via one of the user groups.


---

[Back to the FAQ](FAQtoplevel)