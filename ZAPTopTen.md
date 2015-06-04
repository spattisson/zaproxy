# ZAPping the OWASP Top 10

The [OWASP Top Ten Project](https://www.owasp.org/index.php/Category:OWASP_Top_Ten_Project) represents a broad consensus about what the most critical web application security flaws are.

This table summaries which components of ZAP are most useful for each category.

Please note that this is _work in progress_ and should not be taken as the definitive list just yet!

| **Risk** | **ZAP Component** |
|:---------|:------------------|
| A1: Injection | Active scanner, Intercepting proxy, Fuzzer |
| A2: Cross-Site Scripting (XSS) | Active scanner, Intercepting proxy, Fuzzer |
| A3: Broken Authentication and Session Management | Active scanner, Passive Scanner, Intercepting proxy, Fuzzer, Session handling |
| A4: Insecure Direct Object References | Intercepting proxy, Spider, Session handling, Fuzzer, Session Compare report |
| A5: Cross-Site Request Forgery (CSRF) | Active scanner, Passive Scanner, Intercepting proxy, Fuzzer, CSRF Form Generator |
| A6: Security Misconfiguration | Active Scanner, Passive Scanner, Spider, Force Browsing |
| A7: Insecure Cryptographic Storage | Token Generator and Analyser, Encode/Decode/Hash |
| A8: Failure to Restrict URL Access | Spider, Forced Browsing, Fuzzer, Session handling, Session Compare report |
| A9: Insufficient Transport Layer Protection | Passive Scanner, Sites tree |
| A10: Unvalidated Redirects and Forwards  | Active Scanner, Fuzzer |