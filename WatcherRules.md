# Checks supported by Watcher

[Issue 244](https://github.com/zaproxy/zaproxy/issues/244) has been raised to cover enhancing ZAP to support all of these rules.

Source code: http://websecuritytool.codeplex.com/

Test page: http://www.testcases.org/watcher/

Please let us know (or update the page yourself if you have the perms) if you are working on any of these rules.

Put your name in the ZAP column if you are working on them and then change it to 'committed' when the code is checked in.

Note that the scanners' IDs are currently recorded in this doc: https://github.com/zaproxy/zaproxy/blob/develop/src/doc/scanners.md so please update this as well.

| ZAP | Watcher Rule |
|:----|:-------------|
| Beta - [ViewstateScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/ViewstateScanner.java) | `Check.Pasv.Asp.Net.ViewState.Mac.cs tests if ASP.NET VIEWSTATE has MAC protection disabled.` |
| Beta - [CharsetMismatchScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/CharsetMismatchScanner.java) | `Check.Pasv.Charset.Mismatch.cs tests charset mismatches.`|
| | `Check.Pasv.Charset.Utf.cs test that UTF8 is set as the charset.`|
| Release - [CookieHttpOnlyScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/CookieHttpOnlyScanner.java) | `Check.Pasv.Cookie.HttpOnly.cs tests that HttpOnly flag is set on cookies.`|
| Beta - [CookieLooselyScopedScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/CookieLooselyScopedScanner.java) |  `Check.Pasv.Cookie.LooselyScoped.cs checks for loosely scoped cookies.`|
| Release - [CookieSecureFlagScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/CookieSecureFlagScanner.java) [1] |  `Check.Pasv.Cookie.Secure.cs test that the 'secure' flag is set on cookies over SSL.`|
|     |  `Check.Pasv.CrossDomain.FormSubmit.cs checks for cross-domain form post.`|
| Release - [CrossDomainScriptInclusionScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/CrossDomainScriptInclusionScanner.java) |  `Check.Pasv.CrossDomain.JavascriptReference.cs checks for cross-domain javascript references.`|
| Release - [CrossDomainScriptInclusionScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/CrossDomainScriptInclusionScanner.java) |  `Check.Pasv.CrossDomain.ScriptReference.cs checks for cross-domain javascript files inclusion.`|
| |  `Check.Pasv.CrossDomain.StyleSheetInclusion.cs checks for cross-domain stylesheets.`|
|     |  `Check.Pasv.Flash.AllowScriptAccess.cs checks Flash instantiation for the AllowScriptAccess setting.`|
| Beta (Active) - [CrossDomainScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/ascanrulesBeta/CrossDomainScanner.java) |  `Check.Pasv.Flash.CrossDomain.cs checks Flash crossdomain.xml file for insecure settings.`|
| Release - [CacheControlScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/CacheControlScanner.java) <br> & Alpha - [CacheControlScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/CacheControlScanner.java) |  `Check.Pasv.Header.CacheControl.cs checks HTTP cache-control header on SSL pages.`|
| Release - [ContentTypeMissingScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/ContentTypeMissingScanner.java) |  `Check.Pasv.Header.ContentTypeMissing.cs that the Content-Type HTTP header is not missing.`|
| Release - [XFrameOptionScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/XFrameOptionScanner.java) |  `Check.Pasv.Header.FrameOptions.cs checks that the X-FRAME-OPTIONS is not missing or insecurely set.`|
| Release - [TestInfoPrivateAddressDisclosure](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/TestInfoPrivateAddressDisclosure.java) |  `Check.Pasv.Header.InternalIp.cs checks HTTP headers for internal IP address disclosure`|
| Release - [HeaderXssProtectionScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/HeaderXssProtectionScanner.java) |  `Check.Pasv.Header.IeXssProtection.cs checks that the X-XSS-Protection has not been set to disable IE's XSS protection.`|
| Release - [XContentTypeOptionsScanner](https://github.com/zaproxy/zap-extensions/blob/master/src/org/zaproxy/zap/extension/pscanrules/XContentTypeOptionsScanner.java) |  `Check.Pasv.Header.MimeSniff.cs checks that the X-CONTENT-TYPE-OPTIONS has been set.`|
| Beta - [InsecureAuthenticationScan](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InsecureAuthenticationScan.java) [1] |  `Check.Pasv.Header.WeakAuth.cs alerts when weak HTTP authentication protocols like Basic or Digest are used.`|
| Beta - [InformationDisclosureSuspiciousComments](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InformationDisclosureSuspiciousComments.java) |  `Check.Pasv.InformationDisclosure.Comments.cs checks for suspicious comments.`|
| Beta - [InformationDisclosureDebugErrors](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InformationDisclosureDebugErrors.java) |  `Check.Pasv.InformationDisclosure.DatabaseErrors.cs checks for database error messages.`|
| Beta - [InformationDisclosureDebugErrors](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InformationDisclosureDebugErrors.java) |  `Check.Pasv.InformationDisclosure.DebugErrors.cs checks for debugging error messages.`|
| Beta - [InformationDisclosureInURL](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InformationDisclosureInURL.java) |  `Check.Pasv.InformationDisclosure.InUrl.cs checks for information disclosure in URL parameters.`|
| Beta - [InformationDisclosureReferrerScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InformationDisclosureReferrerScanner.java) |  `Check.Pasv.InformationDisclosure.ReferrerLeak.cs checks HTTP Referer header for information disclosure.`|
| Beta - [InsecureJSFViewStatePassiveScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/pscanrulesBeta/InsecureJSFViewStatePassiveScanner.java) |  `Check.Pasv.Java.ViewState.cs checks JavaServer Faces for insecure ViewState.`|
|     |  `Check.Pasv.Javascript.DomainLowering.cs checks JavaScript for domain lowering operations.`|
| |  `Check.Pasv.Javascript.Eval.cs checks JavaScript for use of eval() type methods.`|
|     |  `Check.Pasv.SharePoint.DocLib.cs checks for insecure SharePoint document libraries.`|
| Beta (Active) - [CrossDomainScanner](https://github.com/zaproxy/zap-extensions/blob/beta/src/org/zaproxy/zap/extension/ascanrulesBeta/CrossDomainScanner.java) |  `Check.Pasv.Silverlight.ClientAccessPolicy.cs checks Silverlight clientaccesspolicy.xml for insecure settings.`|
|     |  `Check.Pasv.Silverlight.EnableHtmlAccess.cs checks Silverlight instantiation for insecure EnableHtmlAcess setting.`|
|     |  `Check.Pasv.SSL.CertValidation.cs check for SSL certification validation errors.`|
| Alpha - [InsecureFormLoadScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/InsecureFormLoadScanner.java) |  `Check.Pasv.SSL.InsecureFormLoad.cs checks for SSL forms loaded on insecure pages.`|
| Alpha - [InsecureFormPostScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/InsecureFormPostScanner.java) |  `Check.Pasv.SSL.InsecureFormPost.cs checks for SSL pages with form post to insecure page.`|
|     |  `Check.Pasv.SSL.Version.cs tests if insecure versions of the SSL protocol are allowed.`|
| Alpha - [StrictTransportSecurityScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/StrictTransportSecurityScanner.java) |  `Check.Pasv.SSL.StrictTransportSecurity.cs checks that the Strict-Transport-Security HTTP header is set on SSL pages.`|
| |  `Check.Pasv.Unicode.InvalidUTF8.cs checks inspects content bytes for invalid UTF8 sequences.`|
| Alpha - [UserControlledCharsetScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/UserControlledCharsetScanner.java) |  `Check.Pasv.UserControlled.Charset.cs checks for user-controlled charset values.`|
| Alpha - [UserControlledCookieScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/UserControlledCookieScanner.java) |  `Check.Pasv.UserControlled.Cookie.cs checks for user-controlled cookie values.`|
| Alpha - [UserControlledHTMLAttributesScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/UserControlledHTMLAttributesScanner.java) |  `Check.Pasv.UserControlled.HtmlAttributes.cs checks for user-controlled HTML attribute values.`|
| Alpha - [UserControlledJavascriptEventScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/UserControlledJavascriptEventScanner.java) |  `Check.Pasv.UserControlled.JavascriptEvent.cs checks for user-controlled javascript event values.`|
|     |  `Check.Pasv.UserControlled.JavascriptProperty.cs checks for user-controlled javascript property values.`|
| Alpha - [UserControlledOpenRedirectScanner](https://github.com/zaproxy/zap-extensions/blob/alpha/src/org/zaproxy/zap/extension/pscanrulesAlpha/UserControlledOpenRedirectScanner.java) |  `Check.Pasv.UserControlled.OpenRedirect.cs checks for user-controlled Open Redirects.`|

`[1]` See [Issue 263](https://github.com/zaproxy/zaproxy/issues/263) and [Issue 262](https://github.com/zaproxy/zaproxy/issues/262).