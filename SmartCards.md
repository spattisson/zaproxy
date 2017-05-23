# Introduction

OWASP ZAP provides smartcard-based authentication support for web applications using HTTPS (SSL/TLS) and X.509 client digital certificates.

Web applications using client digital certificates to authenticate users can request a standard X.509 digital certificate from a file (PKCS#12) or a X.509 digital certificate stored on a smartcard or token (PKCS#11).

# Details

When a target web application requests client authentication through digital certificates during the SSL/TLS handshake (re)negotiation, ZAP is able to access the local smartcard and authenticate the user as she would do when no interception proxy is in place.

ZAP provides support for multiple smartcard types under different operating systems (Windows, Linux, and Mac OS X) thanks to the Java smartcard built-in capabilities and its integration with PKCS#11 hardware modules.

Note that smartcard support _does_ work on 64 bit Windows with the Oracle JVM (despite the Oracle docs saying otherwise) just make sure you use the 32bit JVM  add your 64bit driver to ZAPs driver.xml

The original ZAP smartcard support ([from version 1.1.0](https://github.com/zaproxy/zap-core-help/wiki/HelpReleases1_1_0)) was merged by Axel from Andiparos.

The purpose of this new (April 2012) project ("OWASP ZAP SmartCard Project") is to extend the currently available smartcard support within ZAP to other national eID cards worldwide (apart from the Belgium, Swiss, and Spanish eID's), as well as, to other proprietary smartcard solutions from commercial vendors (apart from ActivIdentity, Aladdin, or Axalto). The goal is for ZAP to provide the widest smartcard support within the web application security industry to be able to assess the security of any web application using smartcards and eIDs for authentication purposes through HTTPS (SSL/TLS). Besides that, the complementary goal is to extend ZAP with new features that might be required to deal with and manage the different smartcard types.

# drivers.xml

ZAP's drivers.xml configuration file centralizes and simplifies ZAP smartcard support. This XML file allows users and developers to easily extend ZAP's smartcard architecture and add support for new smartcards.

Since version 1.4.0.1 ZAP provides support for multiple smartcards using the new naming scheme. New smartcards have been added to the SVN repository, and as a result got into the latest stable ZAP versions too. As new smartcard entries are added to ZAP, we try to keep the list below (in alphabetical order) updated:

NOTE: List updated up to OWASP ZAP version 2.6.0.

  * ActivIdentity - Windows (x86)
  * Aladdin eToken - Mac OS X
  * Aladdin eToken - Windows (x86)
  * Axalto - Windows
  * Belgium eID - Windows (x86)
  * Belgium eID - Linux (x86)
  * Belgium eID - Linux (x64)
  * CSPid - Windows (x64)
  * CSPid - Windows (x86)
  * CSPid - Linux
  * Portuguese Cartão de Cidadão - Windows (x86)
  * Portuguese Cartão de Cidadão - Windows (x64)
  * Portuguese Cartão de Cidadão - Linux
  * Spanish DNIe - Windows (x86)
  * Spanish DNIe - Windows (x64)
  * Spanish DNIe - Linux (x86)
  * Spanish DNIe - Linux (x64)
  * Spanish DNIe - Mac OS X
  * Switzerland SuisseID - Windows (x86)

The drivers.xml contents and smartcard support can be found within ZAP GUI under the "Tools - Options" menu, within the "Certificate" category, and specifically, on the "PCKS#11" tab.

This file contains an alphabetically ordered list of smartcard currently supported by ZAP, using the following naming scheme:

<Name - OS (Architecture)>

Where:
  * The "Name" includes the vendor name and model for commercial smartcards and the country and eID name for national smartcards (eID's).
  * The "OS" (Operating System) includes the operating system associated to the smartcard driver, commonly Windows, Linux or Mac OS X.
  * The "Architecture" includes the operating system architecture used if different drivers are available, such as "x86" for 32-bit (x86) Windows versions, or "x64" for 64-bit Windows versions.

Note that 32-bit drivers are commonly stored under "C:\Windows\System32\" or "/usr/lib/", while 64-bit drivers can be found at "C:\WINDOWS\SysWOW64\" or "/usr/lib64/". If no architecture is provided, it means that the driver is architecture-agnostic, and it is commonly stored (for Windows) under the applications directory: "C:\Program Files\".

The most current version of the drivers.xml configuration file is available on the official ZAP SVN repository: https://github.com/zaproxy/zaproxy/blob/develop/src/xml/drivers.xml


# How can I contribute to ZAP SmartCard Project?

The new "OWASP ZAP SmartCard Project" requires the implication of the community around the world to provide details and help to test new smartcard types. If you are interested on contributing to it, [send me an e-mail](http://code.google.com/u/raul.siles@gmail.com/) or write to the [OWASP ZAP Google group (mailing list)](https://groups.google.com/group/zaproxy-develop).

You can contribute in very different ways:
  1. Provide details about the existence of a new smartcard or eID that is used in your country of origin or residence for web-based authentication.
  1. Provide general and/or technical details about an specific country eID, plus the link to the official e-ID web page for that country, so that anyone interested can get more details about how the eID has been deployed in that country.
  1. Provide details about commercial smartcards used for web-based authentication.
  1. Use ZAP to evaluate the security of smartcard-based web applications on your penetration testing engagements and [report bugs or any other issues you may find](https://github.com/zaproxy/zaproxy/issues/).
  1. Suggest or/and provide new drivers.xml entries for new smartcards or additional operating systems.
  1. More...

# Contributors

  * Axel Neumann (ZAP founder and core smartcard developer, plus Switzerland SuisseID and original commercial entries)
  * Raul Siles (Core ZAP smartcard developer, plus Spanish DNIe entries)
  * Tran Vien-Ha (Belgium eID Windows entry)
  * Tim Vaes (Belgium eID Linux entries)
  * Those people who contributed but choose to remain anonymous - you know who you are :) Many thanks!

# Working On...

People that are currently working on adding support for new smartcards and eIDs into OWASP ZAP.

# More information

[OWASP ZAP SmartCard Project: Goals](http://blog.taddong.com/2012/04/owasp-zap-smartcard-project.html)

[Official OWASP ZAP SmartCard Project Launch](https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/1DpU7eS2zqo)

# List of countries using digital certificates or smartcards

Various countries around the world provide a digital or electronic identity to their citizens, known as eID (electronic ID), in the form of a standard X.509 digital certificate stored in a file (PKCS#12), or within a hardware token or smartcard (PKCS#11).

Countries and eID name: (alphabetically ordered) - **DRAFT** -
  * Austria (smartcard or mobile) - Buergerkarte: http://www.buergerkarte.at/index.en.php
  * Belgium (smartcard) - eID: http://eid.belgium.be
  * Czech Republic (?)
  * Denmark (?)
  * Estonia (smartcard)
  * Finland (smartcard)
  * Germany (smartcard) - Personalausweis: http://www.personalausweisportal.de
  * Hong-Kong (smartcard)
  * Iceland (?)
  * Italy (smartcard) - Carta d'Identità Elettronica (CIE): http://www.servizidemografici.interno.it
  * Liechtenstein (?)
  * Lithuania (?)
  * Luxembourg (?)
  * Morocco (smartcard)
  * The Netherlands (username/password [+ SMS code]) - DigiD: http://www.digid.nl/english/
  * Portugal (smartcard) - Cartão de Cidadão: http://www.cartaodecidadao.pt
  * Saudi Arabia (smartcard)
  * Slovakia (?)
  * Slovenia (?)
  * South Korea (cert)
  * Spain (smartcard) - DNIe: http://www.dnie.es
  * Sweden (?)
  * Switzerland (smartcard) - SuisseID: http://www.suisseid.ch
  * United Arab Emirates (smartcard)

## References: (in English, unless otherwise reflected)

  * Digital Agenda: new Regulation to enable cross-border electronic signatures and to get more value out of electronic identification in Digital Single Market: http://europa.eu/rapid/pressReleasesAction.do?reference=IP/12/558
  * Electronic identification, signatures and trust services: Questions & Answers: http://europa.eu/rapid/pressReleasesAction.do?reference=MEMO/12/403
  * STORK: https://www.eid-stork.eu
  * ENISA eID: http://www.enisa.europa.eu/activities/identity-and-trust/privacy-and-trust/eid
  * IDABC - eID Interoperability for PEGS:
    * (2010) http://ec.europa.eu/idabc/en/document/6484/5938/#achieve
    * Study: http://www.epractice.eu/files/Study%20on%20eID%20Interoperability%20for%20PEGS_Update%20of%20Country%20Profiles%20-%20Analysis%20and%20Assessement%20report.pdf
    * (2009) http://www.epractice.eu/en/library/307000
    * (2007) http://www.epractice.eu/en/library/281619
  * Electronic ID Cards: http://en.wikipedia.org/wiki/Electronic_identity_card
  * ID Cards: http://en.wikipedia.org/wiki/ID_Card
  * Spain 25M e-IDs: http://www.interior.gob.es/press/la-policia-nacional-supera-los-25-%20millones-de-dni-electronicos-expedidos-12920 (Spanish)
  * The Netherlands (Holland): DigID 4.0 (July 2012) http://e-overheid.nl/actueel/i-nup-toppers/intItem/digid-klaar-voor-de-toekomst-/1580
  * Austria: Buergerkarte http://www.buergerkarte.at/index.en.php & http://demo.a-sit.at/buergerkarte/index.html (German)