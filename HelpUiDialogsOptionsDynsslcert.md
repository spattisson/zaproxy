# Option Dynamic SSL Certificates

OWASP ZAP allows you to transparently decrypt SSL connections. For doing so, ZAP has to encrypt each
request before sending to the server and decrypt each response, which comes back. But, this is already
done by the browser. That's why, the only way to decrypt or intercept the transmission, is to do a 'man
in the middle' approach.
## Overview

> ![https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/maninthemiddle.png](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/maninthemiddle.png)

In short words, every data send to and received from the server is encrypted/decrypted by using the original
server's certificate inside ZAP. This way, ZAP knows the plain text. To establish a SSL protected session
from you (your browser), ZAP is using it's own certificate. This is the one you can create. Every certificate
created by ZAP will be signed for the same server name. In the example above, ZAP will create a certificate
for the server's name "www.example.com". This way, your browser will do regular SSL encryption.
## ZAP Root CA certificate

Imagine your're visiting multiple SSL protected sites. Every time your browser connects such a site,
a new SSL certificate is created. But, these certificates are not trusted by anyone (because self created
by ZAP). In other words, your browser will not accept such certificates in the first place. You may familiar
with such situations, when your browser complains certificate error but you manually can create an exception
rule for that server.

Every certificate created by ZAP is in the direct chain of trust from the "ZAP Root CA" certificate.
(For more details about chain of trust, use your favorite search engine ;-) ) This means, you (your browser)
only have to trust the ZAP Root CA once, and any further certificates are automatically trusted. In other
words, once you've added the ZAP Root CA certificate to your list of trusted Root CAs, your browser doesn't
recognize the man in the middle.
### Generate

If you're running ZAP the first time, you should generate a Root CA certificate first. Once you've generated
one, you have to install it within your browser or HTTP client application. See section [installation](HelpUiDialogsOptionsDynsslcert#install) for more details.

Every generated Root CA certificate is valid for one year. After that period you have to create a new
one.<br>Every generated Root CA certificate is 2048 bit strong (RSA with SHA1).<br>Every generated Root CA certificate<br>
starts with serial number "1". Every generated Root CA certificate consists of the following identifiers:<br>
<br>
<br>
<pre><code><br>
CN = OWASP Zed Attack Proxy Root CA<br>
L = 87b77fe834b0a301<br>
O = OWASP Root CA<br>
OU = OWASP ZAP Root CA<br>
C = XX<br>
</code></pre>

As you can see, there's a Location identifier (L) which is only a hexadecimal number. This number is<br>
constructed out of two 32bit hash codes: user's name and user's home directory. This way you can identify<br>
your own certificate when using multiple installations. But there's no way, that anyone can figure out<br>
your name from this hash code.<br>
<h3>Import</h3>

When you're using multiple ZAP installation and you want to use the same Root CA certificate, so you<br>
can import it. Simply use one installation of OWASP ZAP to generate one Root CA certificate.<br>Copy the<br>
file 'OWASP ZAP/config.xml' from your users home directory to the PC, where you want to use the same<br>
certificate and press 'import' to import it.<br>
<br>
You can also import certificates stored in pem files as long as they include both the certificate and<br>
the unencrypted private key in the following format:<br><pre><code><br>
<br>
-----BEGIN CERTIFICATE-----<br>
MIIC9TCCAl6gAwIBAgIJANL8E4epRNznMA0GCSqGSIb3DQEBBQUAMFsxGDAWBgNV<br>
BAoTD1N1cGVyZmlzaCwgSW5jLjELMAkGA1UEBxMCU0YxCzAJBgNVBAgTAkNBMQsw<br>
CQYDVQQGEwJVUzEYMBYGA1UEAxMPU3VwZXJmaXNoLCBJbmMuMB4XDTE0MDUxMjE2<br>
MjUyNloXDTM0MDUwNzE2MjUyNlowWzEYMBYGA1UEChMPU3VwZXJmaXNoLCBJbmMu<br>
MQswCQYDVQQHEwJTRjELMAkGA1UECBMCQ0ExCzAJBgNVBAYTAlVTMRgwFgYDVQQD<br>
Ew9TdXBlcmZpc2gsIEluYy4wgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAOjz<br>
Shh2Xxk/sc9Y6X9DBwmVgDXFD/5xMSeBmRImIKXfj2r8QlU57gk4idngNsSsAYJb<br>
1Tnm+Y8HiN/+7vahFM6pdEXY/fAXVyqC4XouEpNarIrXFWPRt5tVgA9YvBxJ7SBi<br>
3bZMpTrrHD2g/3pxptMQeDOuS8Ic/ZJKocPnQaQtAgMBAAGjgcAwgb0wDAYDVR0T<br>
BAUwAwEB/zAdBgNVHQ4EFgQU+5izU38URC7o7tUJml4OVoaoNYgwgY0GA1UdIwSB<br>
hTCBgoAU+5izU38URC7o7tUJml4OVoaoNYihX6RdMFsxGDAWBgNVBAoTD1N1cGVy<br>
ZmlzaCwgSW5jLjELMAkGA1UEBxMCU0YxCzAJBgNVBAgTAkNBMQswCQYDVQQGEwJV<br>
UzEYMBYGA1UEAxMPU3VwZXJmaXNoLCBJbmMuggkA0vwTh6lE3OcwDQYJKoZIhvcN<br>
AQEFBQADgYEApHyg7ApKx3DEcWjzOyLi3JyN0JL+c35yK1VEmxu0Qusfr76645Oj<br>
1IsYwpTws6a9ZTRMzST4GQvFFQra81eLqYbPbMPuhC+FCxkUF5i0DNSWi+kczJXJ<br>
TtCqSwGl9t9JEoFqvtW+znZ9TqyLiOMw7TGEUI+88VAqW0qmXnwPcfo=<br>
-----END CERTIFICATE-----<br>
-----BEGIN PRIVATE KEY-----<br>
MIICXgIBAAKBgQDo80oYdl8ZP7HPWOl/QwcJlYA1xQ/+cTEngZkSJiCl349q/EJV<br>
Oe4JOInZ4DbErAGCW9U55vmPB4jf/u72oRTOqXRF2P3wF1cqguF6LhKTWqyK1xVj<br>
0bebVYAPWLwcSe0gYt22TKU66xw9oP96cabTEHgzrkvCHP2SSqHD50GkLQIDAQAB<br>
AoGBAKepW14J7F5e0ppa8wvOcUU7neCVafKHA4rcoxBF8t+P7UhiMVfn7uQiFk2D<br>
K8gXyKpLcEdRb7K7CI+3i8RkoXTRDEZU5XPMJnZsE5LWgNQ+pi3HwMEdR0vD2Iyv<br>
vIH3tq6mNKgDu+vozm8DWsEP96jrhVbo1U1rzyEtX46afo79AkEA/VXanGaqj4ua<br>
EsqfY6n/7+MTm4iPOM7qfoyI4EppJXZklc/FbcV2lAjY2Jl9U6X7WnqCPn+/zg44<br>
6lKWTnhAawJBAOtmi6nw8WjY6uyXZosE/0r4SkSSo20EJbBCJcgdofKT+VCGB4hp<br>
h6XwGdls0ca+qa5ZE1a196dpwwVre0hm88cCQQDrUm3QbHmw/39uRzOJs6dfYPKc<br>
vlwz69jdFpQqrFRBjVlf4/FDx3IfjpxHj0RgiEUUxcnoXmh/8qwh1fdzCrbjAkB4<br>
afg/chTLQUrKw5ecvW2p9+Blu20Fsv1kcDHLb/0LjU4XNrhbuz+8TlmqstOMCrPZ<br>
j48o5+RLKvqrpxNlMeS5AkEA6qIdW/yp5N8b1j2OxYZ9u5O//BvspwRITGM60Cps<br>
yemZE/ua8wm34SKvDHf5uxcmofShW17PLICrsLJ7P35y/A==<br>
-----END PRIVATE KEY-----<br>
</code></pre><br>And yes, that example will work - its the Superfish certificate!<br>
<h3>View</h3>

In the options dialog of ZAP you're seeing the raw bytes (hexa-decimal encoded) of the certificate. The<br>
option "view" tries to use your system's default viewing tool for ".CER" files. On Windows, this is typically<br>
the same, when exporting the certificate and double clicking on it.<br>
<h3>Save/Export</h3>

In the options dialog of ZAP you're seeing the raw bytes (hexa-decimal encoded) of the certificate. Many<br>
programs are using this simple format for import/export functions. When clicking 'export', these bytes<br>
are saved to disk. This is equal to selecting all and doing CTRL+C (copy to clipboard) and save it into<br>
a new .CER file (which is simple text as you see in the dialog).<br>
<h2>Dynamic certificates</h2>

Each ZAP instance is using it's own root certificate. Of course, you can import root certificates, to<br>
use them on multiple machines. When running, there will be sub-certificated created, each time a HTTPS<br>
resource is requested. That means, the Root CA certificate is used as an issuer.<br>
<br>
Every dynamically generated certificate is valid for 1000 days.<br>Every dynamically generated certificate<br>
is 1024 bit strong (RSA with SHA1).<br>Every dynamically generated certificate has a random serial number.<br>
Every dynamically generated certificate consists of the following identifiers:<br>
<br>
<pre><code><br>
CN = www.example.com<br>
E = owasp-zed-attack-proxy@lists.owasp.org<br>
C = XX<br>
O = OWASP<br>
OU = Zed Attack Proxy Project<br>
</code></pre>

<i>Side note: Each time you start ZAP, internally a random serial number offset is generated. Every dynamically<br>
generated certificate will use this offset plus an increasing counter. For example, first dynamically<br>
certificate has serial number 2314, the second one 2315, the third one 2316 and so on. The reason for<br>
this is simple: browsers are also caching certificates. When you restart ZAP but don't restart your browser,<br>
it could happen, the the browser sees the same certificate but with different serial number. In the end,<br>
the browser would complain about and reject the certificate. By using the random offset (internally 48bit<br>
random number), the chances are 1 to 281.474.976.710.656 that when restarting ZAP, the serial number<br>
offset is a different one.</i><br>So in the rare case, you are discovering that you browser complains about a<br>
broken serial number within the certificate, just restart your browser ;-) <i>.<br>
<h2>Install ZAP Root CA certificate</h2></i>

Any HTTPS client you want to use, has to know the OWASP Root CA certificate as 'trusted root certificate'.<br>
Typically you have to install manually the ZAP certificate into your browser's list of trusted root certificates.<br>
<br>
<h3>Windows / Internet Explorer</h3>

The easiest way is to click on <a href='HelpUiDialogsOptionsDynsslcert#view'>view</a> and choose 'Install certificate'. Alternatively, you can save/export your generated certificate (copy it to you target computer) and double click the .CER file. When doing so, the regular Windows wizard for certificate installation assistance is poping up. In the this wizard manually choose the certificate store. Do NOT let Windows choose automatically the certificate store. Choose 'trusted root certificates' as store and finalize the wizard.<br>
<br>
After successfully installation, you can check the certificate.<br>
<ol><li>Go to Internet options<br>
</li><li>Tab Content<br>
</li><li>Click certificates<br>
</li><li>Click tab trusted root certificates<br>
</li><li>The OWASP ZAP Root CA should be there<br>
<h3>Mozilla Firefox</h3></li></ol>

Firefox is using it's own certificate store. Thats why you have to import it twice, when you're using<br>
both browser on windows. Installation and late on validation is done in the same preferences dialog:<br>
<br>
<ol><li>Go to Preferences<br>
</li><li>Tab Advanced<br>
</li><li>Tab Cryptography/Certificates<br>
</li><li>Click View certificates<br>
</li><li>Click tab Trusted root certificates<br>
</li><li>Click Import and choose the saved <tt>owasp<code>_</code>zap<code>_</code>root<code>_</code>ca.cer</tt> file<br>
</li><li>In the wizard choose to trust this certificate to identify web sites (check on the boxes)<br>
</li><li>Finalize the wizard<br>
<h2>Risks</h2></li></ol>

<b>Attention, there are risks!</b><br>When adding self generated Root CA certificates to your list of trusted root<br>
certificates, everyone with the root certificate can smuggle data into your system (browser). In other<br>
words when you're not testing in a safe environment, but on productive machines, be aware that you're<br>
opening an additional attack vector to your system.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiDialogsOptionsCertificate'>Certificates</a></td><td>for SSL client certificates</td></tr>
</table>