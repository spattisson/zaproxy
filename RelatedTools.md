# Related Tools

The following tools (in alphabetic order) and known to work well with (or even include explicit support for) ZAP:

## BDD-Security

[BDD-Security](http://www.continuumsecurity.net/bdd-intro.html) is framework for security testing web applications through Behaviour Driven Development techniques

BDD-Security is a framework written in Java and based on JBehave and Selenium 2 (`WebDriver`) that uses predefined security tests and an integrated security scanner to perform automated security assessments of web applications.

BDD-Security makes use of ZAP to perform the automated scanning in addition to the non-functional tests. Everything is driven from the JBehave stories, so it can all be executed from familiar build tools and integrated in continuous integration environments.

## bWAPP

[bWAPP](http://www.mmeit.be/bwapp/index.htm), or a buggy web application, is a free and open source deliberately insecure web application.
It helps security enthusiasts, developers and students to discover and to prevent web vulnerabilities.
bWAPP prepares one to conduct successful penetration testing and ethical hacking projects.
It has over 100 web vulnerabilities! It covers all major known web bugs, including all risks from the OWASP Top 10 project.

bWAPP includes ZAP as one of its tools of choice.

## Dradis

[Dradis](http://dradisframework.org/) is an open source framework to enable effective information sharing, specially during security assessments.

The [ZAP Proxy upload plugin](https://github.com/dradis/dradisframework/commit/7d7257d53bf9d9283fba00bca139086dccadd4c4) parses OWASP Zed Attack Proxy XML reports.

## Faraday

[Faraday](http://www.faradaysec.com/) introduces a new concept (IPE) Integrated Penetration-Test Environment a multiuser Penetration test IDE. Designed for distribution, indexation and analysis of the generated data during the process of a security audit.

The main purpose of Faraday is to re-use the available tools in the community to take advantages of them in a multiuser way.

## `ModSecurity` / OWASP `ModSecurity` Core Rule Set

The `SpiderLabs` Research Team has added an example script to the OWASP `ModSecurity` Core Rule Set (CRS) Project archive that will help users to quickly implement virtual patches for vulnerabilities identified by ZAP.

http://blog.spiderlabs.com/2012/03/modsecurity-advanced-topic-of-the-week-automated-virtual-patching-using-owasp-zed-attack-proxy.html

## Mozilla Minion

[Minion](https://wiki.mozilla.org/Security/Projects/Minion) is a security testing framework built by Mozilla to bridge the gap between developers and security testers. To do so, it enables developers to scan their projects using a friendly interface.

It includes explicit support for ZAP and essentially allows you to run ZAP 'in the cloud'.

## OWASP AJAX Crawling Tool

The [OWASP AJAX Crawling Tool](https://www.owasp.org/index.php/OWASP_AJAX_Crawling_Tool) is tool which automates the crawling of AJAX applications. It can be daisy-chained with ZAP to find aspects of a web app that are missed by the spider.

A demo of the tool working with ZAP is here: http://vimeo.com/31059474

## OWASP `EnDe`
[OWASP EnDE](https://www.owasp.org/index.php/Category:OWASP_EnDe) is a collection of tools for data encoding/decoding and conversion.

Achim (the project lead) has detailed how you can load `EnDe` into the ZAP Script Console here: https://groups.google.com/d/topic/zaproxy-develop/IBWucSMKnZ8/discussion

## OWASP O2

The [O2](https://www.owasp.org/index.php/OWASP_O2_Platform) platform represents a new paradigm for how to perform, document and distribute Web Application security reviews.

Dinis has written a blog post on controlling ZAP via O2: http://blog.diniscruz.com/2012/11/using-jni4net-part-2-controling-owasp.html

## OWASP Security Shepherd
[OWASP Security Shepherd](https://www.owasp.org/index.php/OWASP_Security_Shepherd)  is a computer based training application for web application security vulnerabilities. This project strives to hurde the lost sheep of the technological world back to the safe and sound ways of secure practices. Security Shepherd can be deployed as a CTF (Capture the Flag) game or as an open floor educational server.

ZAP is included in Security Shepherd as the security tool to use when solving its challenges.

## Seccubus

[Seccubus](https://www.seccubus.com/) automates vulnerability scanning with: Nessus, OpenVAS, NMap, SSLyze, Burp, Medusa, SkipFish and SSLlabs.

ZAP support was added in [v2.13](https://www.seccubus.com/2015/01/20/OWASP-ZAP-release/).

## Threadfix

[ThreadFix](http://code.google.com/p/threadfix/) is a software vulnerability aggregation and management system that helps organizations aggregate vulnerability data, generate virtual patches, and interact with software defect tracking systems.

ZAP is one of the dynamic scanners it explicitly supports:

http://code.google.com/p/threadfix/wiki/DynamicScanners#OWASP_Zed_Attack_Proxy