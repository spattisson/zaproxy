# Scanner Rules

If you want to help improve the scanner rules then here are a few pointers.

At the moment all of the [Active Scan](HelpStartConceptsAscan) rules are defined in the [org.parosproxy.paros.core.scanner.plugin](http://code.google.com/p/zaproxy/source/browse/#svn/trunk/src/org/parosproxy/paros/core/scanner/plugin) package.

The [Passive Scan](HelpStartConceptsPscan) rules are defined in the [org.zaproxy.zap.extension.pscan.scanner](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fzaproxy%2Fzap%2Fextension%2Fpscan%2Fscanner) package.

Having a look at how these rules work would be a good place to start.

Note that the current Active rules tend to use regex expressions for analysing responses.

The Passive rules can use the [Jericho HTML parser](http://jericho.htmlparser.net/) which allows the rules to be defined in a more effective way. Jericho is tolerant of various HTML errors, but this comes at a cost: various elements of non-HTML files are parsed by Jericho as HTML.  For instance, a "form" element in a comment within a Javascript file will be reported by Jericho as a HTML form element.  To ensure that this does not occur, a simple "null" check on the parent object will determine if the element has a valid HTML parent.  Normal HTML comments seem to be parsed correctly, on the other hand.

[Issue 244](https://github.com/zaproxy/zaproxy/issues/244) has been raised to cover enhancing ZAP to support all of the WatcherRules.

The [OWASP Top 10 Coverage](OWASPTop10RisksCoverage) page maps all the vulnerabilities listed by the [OWASP Top Ten](https://www.owasp.org/index.php/Category:OWASP_Top_Ten_Project) project to the Active and Passive scanner rules.

Any suggestions for new rules or code that implements new rules or improves existing ones will be gratefully received!