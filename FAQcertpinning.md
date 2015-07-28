# [FAQ:](FAQtoplevel) How can ZAP test sites that use certificate pinning?

Certificate pinning (also known as [Public Key Pinning](https://wiki.mozilla.org/SecurityEngineering/Public_Key_Pinning) "is a mechanism for sites to specify which certificate authorities have issued valid certs for that site, and for user-agents to reject TLS connections to those sites if the certificate is not issued by a known-good CA." - see https://wiki.mozilla.org/SecurityEngineering/Public_Key_Pinning for more details.

Sites that use certificate pinning will typically not be loaded in your browser if you are proxying it through ZAP.

In Firefox you can change the [About:config](http://kb.mozillazine.org/About:config) pref:

`security.cert_pinning.enforcement_level` from '1' to '0'

This article: https://www.imperialviolet.org/2011/05/04/pinning.html states that Chrome will allow user installed root CA certificates to override pins.

Advice and guidance for other browsers appreciated :)

---

[Back to the FAQ](FAQtoplevel)