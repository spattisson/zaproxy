# How to connect to an HTTPS site that reports a handshake failure?

First of all try checking the 'Enable unsafe SSL/TLS renegotiation' checkbox in the Certificate Options screen and trying again.

If this doesn't help and an HTTPS site reports a handshake failure then try installing the 'Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files':

* Java 7 : http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html
* Java 8 : http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

You will need to restart ZAP for these to take effect.

Note that on OS X we include the JRE with the ZAP application, so you'll need to start ZAP with an installed JRE from the command line, or you can edit `zap.sh` located under `/Applications/OWASP ZAP.app/Contents/Java` and comment out the last IF, the script will launch automatically using the JRE from the system:

```
#if [ "$OS" = "Darwin" ]; then
#exec ../PlugIns/jre*/Contents/Home/bin/java ${JMEM} -XX:PermSize=256M -Xdock:icon="../Resources/ZAP.icns" -jar "${BASEDIR}/zap-2.4.1.jar" "$@"
#else
  exec java ${JMEM} -XX:PermSize=256M -jar "${BASEDIR}/zap-2.4.1.jar" "$@"
#fi
```

Java 8 users note you may encounter SSLHandshakeException, on sites that support RC4 ciphers. More info [here](https://github.com/zaproxy/zaproxy/issues/1892#issuecomment-139906996), and [here](http://stackoverflow.com/questions/32009083/javax-net-ssl-sslhandshakeexception-handshake-failure-when-using-jmeter-with-ss). Solution(s): Disable RC4 on the server, or switch to Java 7 for ZAP.

If this doesn't help then get in touch via one of the user groups.


---

[Back to the FAQ](FAQtoplevel)