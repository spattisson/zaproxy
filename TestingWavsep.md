# Testing - wavsep

ZAP is designed to be as effective as possible when used against real applications.

But it also makes sense for us to test it against well known test suites and vulnerable applications.

[wavsep](https://github.com/sectooladdict/wavsep) is the most comprehensive open source evaluation project we are aware of, and so we test ZAP against wavsep, and will keep this page updated with the latest results.

To run these tests yourself:
  1. Download and install [wavsep](https://github.com/sectooladdict/wavsep)
  1. Start ZAP
  1. Open the 2 main top pages in your browser while proxying through ZAP, eg
    * http://localhost:8080/wavsep/index-active.jsp
    * http://localhost:8080/wavsep/index-passive.jsp
  1. Spider from the top node, eg http://localhost:8080/wavsep/
  1. Set the active scan options you want to test with
  1. Active scan the subtree http://localhost:8080/wavsep/

For these tests ZAP was run against wavsep 1.2 with just the release quality rules and the default options except for using 20 threads per host. The attack strength was also set as per the Strength column (the default is Medium).

The html reports were created using the [wavsep.py](https://github.com/zaproxy/zaproxy/blob/develop/python/scripts/wavsep/wavsep.py) script which retrieves the alerts via the ZAP REST API, works out which tests passed and failed and then generates the html page.

| **Strength** | **# Reqs 2.0.0** | **2.0.0** | **# Reqs 2.2.`*`** | **2.2.`*`** |
|:-------------|:-----------------|:----------|:-------------------|:------------|
| Low          | 40,490           | [31%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.0.0-low.html) | 134,296            | [32%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.2.1-low.html) |
| Medium       | 58,013           | [58%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.0.0-medium.html) | 221,991            | [61%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.2.1-medium.html) |
| High         | 79,852           | [76%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.0.0-high.html) | 279,928            | [76%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.2.1-high.html) |
| Insane       | 185,042          | [86%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.0.0-insane.html) | 875,397            | [87%](https://github.com/zaproxy/zaproxy/tree/develop/python/scripts/wavsep/report-v2.2.1-insane.html) |

Click %'s for full reports.

Note that at 2.2.`*` header fields are also scanned by default (this can be disabled) - hence the significant increase in the number of requests.


| **Category** | **1.4.1** | **2.1.0** | **2.2.0** | **Trunk** | **Notes** |
|:-------------|:----------|:----------|:----------|:----------|:----------|
| Audit Features Comparison (33) | [9](http://www.sectoolmarket.com/audit-features-comparison-unified-list.html) | 13        | 13        | 13        | 2.0.0 adds support for RFI, LDAPi, CSRF. [Alpha Ascan rules](https://github.com/zaproxy/zap-extensions/wiki/HelpAddonsAscanrulesAlphaAscanalpha) add support for PXSS |
| Input Vector Support (19) | [2](http://www.sectoolmarket.com/input-vector-support-unified-list.html) | 3         | 6         | 6         | 2.0.0 adds support for: `WebSock`, 2.2.0 adds support for Header, XML, JSON |
| Coverage Features Comparison (15) | [3](http://www.sectoolmarket.com/coverage-features-comparison-unified-list.html) | 4         | 4         |  4        | 2.0.0 adds support for: Ajax Crawler |
| Authentication Features Comparison (17) | [14](http://www.sectoolmarket.com/authentication-features-comparison-unified-list.html) | 15        | 15        | 15        | 2.0.0 adds support for: Logout Detection |



See the [Testing](https://github.com/zaproxy/zaproxy/wiki/Testing) page for more information about tests run.