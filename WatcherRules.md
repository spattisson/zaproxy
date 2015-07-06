# Checks supported by Watcher

[Issue 244](https://github.com/zaproxy/zaproxy/issues/244) has been raised to cover enhancing ZAP to support all of these rules.

Source code: http://websecuritytool.codeplex.com/

Test page: http://www.testcases.org/watcher/

Please let us know (or update the page yourself if you have the perms) if you are working on any of these rules.

Put your name in the ZAP column if you are working on them and then change it to 'committed' when the code is checked in.

Note that the ids are currently recorded in this doc: https://github.com/zaproxy/zaproxy/blob/develop/src/doc/alerts.xml so please update this as well.

| ZAP | Watcher Rule |
|:----|:-------------|
| Vitor | `Check.Pasv.Asp.Net.ViewState.Mac.cs tests if ASP.NET VIEWSTATE has MAC protection disabled.` |
| Beta | `Check.Pasv.Charset.Mismatch.cs tests charset mismatches.`|
| Vitor | `Check.Pasv.Charset.Utf.cs test that UTF8 is set as the charset.`|
| 1.3 | `Check.Pasv.Cookie.HttpOnly.cs tests that HttpOnly flag is set on cookies.`|
| Beta |  `Check.Pasv.Cookie.LooselyScoped.cs checks for loosely scoped cookies.`|
| 1.3 `[1]` |  `Check.Pasv.Cookie.Secure.cs test that the 'secure' flag is set on cookies over SSL.`|
|     |  `Check.Pasv.CrossDomain.FormSubmit.cs checks for cross-domain form post.`|
| Vitor |  `Check.Pasv.CrossDomain.JavascriptReference.cs checks for cross-domain javascript references.`|
| 1.4.0.1 |  `Check.Pasv.CrossDomain.ScriptReference.cs checks for cross-domain javascript files inclusion.`|
| Vitor |  `Check.Pasv.CrossDomain.StyleSheetInclusion.cs checks for cross-domain stylesheets.`|
|     |  `Check.Pasv.Flash.AllowScriptAccess.cs checks Flash instantiation for the AllowScriptAccess setting.`|
|     |  `Check.Pasv.Flash.CrossDomain.cs checks Flash crossdomain.xml file for insecure settings.`|
| 1.4.0.1 |  `Check.Pasv.Header.CacheControl.cs checks HTTP cache-control header on SSL pages.`|
| 1.4.0.1 |  `Check.Pasv.Header.ContentTypeMissing.cs that the Content-Type HTTP header is not missing.`|
| 1.4.0.1 |  `Check.Pasv.Header.FrameOptions.cs checks that the X-FRAME-OPTIONS is not missing or insecurely set.`|
| Serge |  `Check.Pasv.Header.InternalIp.cs checks HTTP headers for internal IP address disclosure`|
| 1.4.0.1 |  `Check.Pasv.Header.IeXssProtection.cs checks that the X-XSS-Protection has not been set to disable IE's XSS protection.`|
| 1.4.0.1 |  `Check.Pasv.Header.MimeSniff.cs checks that the X-CONTENT-TYPE-OPTIONS has been set.`|
| 1.3 `[1]` |  `Check.Pasv.Header.WeakAuth.cs alerts when weak HTTP authentication protocols like Basic or Digest are used.`|
| Committed |  `Check.Pasv.InformationDisclosure.Comments.cs checks for suspicious comments.`|
| 1.4.0.1 |  `Check.Pasv.InformationDisclosure.DatabaseErrors.cs checks for database error messages.`|
| 1.4.0.1 |  `Check.Pasv.InformationDisclosure.DebugErrors.cs checks for debugging error messages.`|
| 1.4.0.1 |  `Check.Pasv.InformationDisclosure.InUrl.cs checks for information disclosure in URL parameters.`|
| 1.4.0.1 |  `Check.Pasv.InformationDisclosure.ReferrerLeak.cs checks HTTP Referer header for information disclosure.`|
| Beta |  `Check.Pasv.Java.ViewState.cs checks JavaServer Faces for insecure ViewState.`|
|     |  `Check.Pasv.Javascript.DomainLowering.cs checks JavaScript for domain lowering operations.`|
| Vitor |  `Check.Pasv.Javascript.Eval.cs checks JavaScript for use of eval() type methods.`|
|     |  `Check.Pasv.SharePoint.DocLib.cs checks for insecure SharePoint document libraries.`|
|     |  `Check.Pasv.Silverlight.ClientAccessPolicy.cs checks Silverlight clientaccesspolicy.xml for insecure settings.`|
|     |  `Check.Pasv.Silverlight.EnableHtmlAccess.cs checks Silverlight instantiation for insecure EnableHtmlAcess setting.`|
|     |  `Check.Pasv.SSL.CertValidation.cs check for SSL certification validation errors.`|
| Serge |  `Check.Pasv.SSL.InsecureFormLoad.cs checks for SSL forms loaded on insecure pages.`|
| Serge |  `Check.Pasv.SSL.InsecureFormPost.cs checks for SSL pages with form post to insecure page.`|
|     |  `Check.Pasv.SSL.Version.cs tests if insecure versions of the SSL protocol are allowed.`|
| Alpha |  `Check.Pasv.SSL.StrictTransportSecurity.cs checks that the Strict-Transport-Security HTTP header is set on SSL pages.`|
| Vitor |  `Check.Pasv.Unicode.InvalidUTF8.cs checks inspects content bytes for invalid UTF8 sequences.`|
| Alpha |  `Check.Pasv.UserControlled.Charset.cs checks for user-controlled charset values.`|
| Alpha |  `Check.Pasv.UserControlled.Cookie.cs checks for user-controlled cookie values.`|
| Alpha |  `Check.Pasv.UserControlled.HtmlAttributes.cs checks for user-controlled HTML attribute values.`|
| Alpha |  `Check.Pasv.UserControlled.JavascriptEvent.cs checks for user-controlled javascript event values.`|
|     |  `Check.Pasv.UserControlled.JavascriptProperty.cs checks for user-controlled javascript property values.`|
| Alpha |  `Check.Pasv.UserControlled.OpenRedirect.cs checks for user-controlled Open Redirects.`|

`[1]` See [Issue 263](https://github.com/zaproxy/zaproxy/issues/263) and [Issue 262](https://github.com/zaproxy/zaproxy/issues/262).