# Testing ZAP

We have just created a new project, **[zaproxy-test](https://github.com/zaproxy/zaproxy-test/)** for all of the test code related to [zaproxy](https://github.com/zaproxy/zaproxy/) and [zap-extensions](https://github.com/zaproxy/zap-extensions/).

This will include (but is not limited to)

  * Unit Tests for ensuring the intended behavior of individual classes
  * Integration Tests verifying correct interaction between classes or components
  * Supporting classes like builders, matchers etc.


There are also some test scripts that can be used to see how ZAP scores against well known test applications and sites.

The plan is to steadily increase the number of such tests in time.

Note that these test show how good ZAP is vs these tests, rather than an overall measure of quality ;)

Completely automated testing will only ever find a subset of vulnerabilities, which is why ZAP provides manual tools as well!

**For [wavsep](https://github.com/sectooladdict/wavsep) results please see the [[TestingWavsep]] page**

TODO: update these results for 2.0.0 :)

| **Test app/site** | **Script** | **1.4.0.1** | **Trunk** | **Notes** |
|:------------------|:-----------|:------------|:----------|:----------|
| [Watcher](http://www.nottrusted.com/watcher/) | [script](https://github.com/zaproxy/zaproxy/blob/develop/python/scripts/watcher/watcher.py) | [26%](https://github.com/zaproxy/zaproxy/blob/develop/python/scripts/watcher/report-v1.4.0.1.html) | 26%       |  The test pages are now here: http://www.testcases.org/watcher/ |
| [WIVET](https://github.com/bedirhan/wivet) |            | [10%](http://www.sectoolmarket.com/wivet-score-unified-list.html) | [72%](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/wivit-ajax-spider.png) | Trunk - using the Ajax Spider |

Other vulnerable apps / test suites we should test against:
  * [OWASP BWA](https://www.owasp.org/index.php/OWASP_Broken_Web_Applications_Project) (which includes lots of apps)
  * [sqli-labs](https://github.com/Audi-1/sqli-labs)