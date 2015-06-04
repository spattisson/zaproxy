# Selenium

The Selenium add-on provides WebDrivers, for other add-ons, to invoke and remotely control web browsers.
It's also bundled the HtmlUnit web browser, an headless Java based web browser.

The following web browsers are supported:
  * Chrome
  * Firefox
  * HtmlUnit
  * Internet Explorer
  * Opera
  * PhantomJS
  * Safari

To use Firefox, Chrome, Internet Explorer, Opera, PhantomJS and Safari, you must have them installed
in your system.

Some of the web browsers require extra configurations, done in [Options Selenium screen](HelpAddonsSeleniumOptions), to access and control them:
  * Chrome - requires ChromeDriver, if not on the system's PATH, it can be set in the options. For more information on ChromeDriver and how to obtain it refer to [ChromeDriver website](https://sites.google.com/a/chromium.org/chromedriver/).
  * PhantomJS - requires PhantomJS binary, if not on the system's PATH, it can be set in the options. For more information on PhantomJS and how to obtain it refer to [PhantomJS website](http://phantomjs.org/) (see footer note for caveat when using PhantomJS).
  * Internet Explorer - requires IEDriverServer, if not on the system's PATH, it can be set in the options. For more information on IEDriverServer refer to [IEDriverServer website](https://code.google.com/p/selenium/wiki/InternetExplorerDriver) (see footer note for caveat when using Internet Explorer).

**PhantomJS Note:** There's an issue ([Issue #11342](https://github.com/ariya/phantomjs/issues/11342)) that prevents sites at localhost, 127.0.0.1 and ::1 from being proxied through ZAP. Until a fix is available is advised to not use it in those cases. Some add-ons might choose to show warning message when that happens.

**Internet Explorer Note:** Not all versions of Internet Explorer work out of the box, refer to [IEDriverServer website](https://code.google.com/p/selenium/wiki/InternetExplorerDriver#Required_Configuration) for more details on how to configure them.
## See also
<table>
<tr><td></td><td><a href='HelpAddonsSeleniumOptions'>Options Selenium screen</a></td><td>for an overview of the Selenium Options</td></tr>
<tr><td></td><td><a href='HelpAddonsSeleniumApi'>API</a></td><td>for an overview of the Selenium API</td></tr>
</table>