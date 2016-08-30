# Security Regression Tests Demo Setup

ZAP can be used to create [Security Regression Tests](SecRegTests).

The reasons why this is such a great idea will be documented elsewhere.

This page is just concerned with how you can see it working for yourself using:
  * ZAP (not surprisingly)
  * Eclipse (as the IDE)
  * The Bodge It Store (a vulnerable web app)
  * Tomcat (the web server hosting the Bodge It Store)
  * Firefox (as the browser)
Note that you should be able to use ZAP in this way using any IDE, web app, web server and browser - the above are just the ones used in this demo.

There are quite a few steps, but you will be able to skip some of them if you already have some or all of the above software installed.

And the instructions are fairly terse, but if you're a developer or tester then you should be able to follow them ok.

All of the software used is cross platform and will work on Windows, Linux and Mac OS machines.

  1. [Download](http://www.java.com) and install Java
  1. [Download](Downloads) and install ZAP
  1. Run ZAP
    * OK the license agreement
    * Its up to you whether you create a Root CA certificate, its not required for this demo
    * Select Tools / Options... / Local proxy
    * Change the Port to 8090
  1. [Download](http://tomcat.apache.org/) and install Tomcat
    * The latest one is best, but older ones will probably still work
  1. Start Tomcat
    * Connect to Tomcat to make sure its working properly: http://localhost:8080
  1. [Download](http://www.eclipse.org/downloads/) and install Eclipse
  1. Start Eclipse
  1. Checkout the [BodgeIt Store](https://github.com/psiinon/bodgeit) as an Eclipse project
    * Check that the bodgeit/local.properties file has the right paths to Tomcat and ZAP for your installation
  1. Run the build.xml 'deploy' task
    * Connect to http://localhost:8080/bodgeit - you should see the Bodgeit store application
  1. Run the build.xml 'test' task
    * This should cause run the functional tests which use Selenium to drive Firefox to test the functionality of the Bodgeit Store
    * These tests should pass
  1. Run the build.xml 'zap-test' task
    * This should do the same as the 'test' task but proxy everything via ZAP and then use ZAP functionality to find security vulnerabilities
    * The tests should fail as there will be security vulnerabilities:
```
Alert: Password Autocomplete in browser, Risk: Low, Reliability: Warning, Url: http://localhost:8080/bodgeit/login.jsp, Param: input, Other: 
Alert: Password Autocomplete in browser, Risk: Low, Reliability: Warning, Url: http://localhost:8080/bodgeit/register.jsp, Param: input, Other: 
Alert: Weak HTTP authentication over an unsecured connection, Risk: Medium, Reliability: Warning, Url: http://localhost:8080/manager/status, Param: , Other: 
Alert: Weak HTTP authentication over an unsecured connection, Risk: Medium, Reliability: Warning, Url: http://localhost:8080/manager/html, Param: , Other: 
Alert: Password Autocomplete in browser, Risk: Low, Reliability: Warning, Url: http://localhost:8080/bodgeit/password.jsp, Param: input, Other: 
Alert: SQL Injection, Risk: High, Reliability: Warning, Url: http://localhost:8080/bodgeit/login.jsp, Param: password, Other: 
Alert: Cross Site Scripting, Risk: High, Reliability: Warning, Url: http://localhost:8080/bodgeit/search.jsp?q=%3C/font%3E%3Cscript%3Ealert(1);%3C/script%3E%3Cfont%3E, Param: q, Other: 
```
  1. Pour yourself a beer or other beverage of your choice :)

Having problems getting this working? Post to the [dev group](https://groups.google.com/group/zaproxy-develop)!