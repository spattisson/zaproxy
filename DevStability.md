# Stability

Stability is key.

No one likes using a tool that crashes, hangs, or acts in an inconsistent way.

Unfortunately there are (virtually) no unit tests for ZAP, one of the standard ways of improving software stability.

There is actually one regression test, based around the API: https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/junit/TestDaemonWave.java

More unit tests should be written as the API is developed.

However we _really_ need a set of unit tests which drive the Swing UI - any suggestions, or experience with:

  * http://www.uispec4j.org/
  * http://abbot.sourceforge.net/doc/overview.shtml
  * http://code.google.com/p/fest/
  * http://jfcunit.sourceforge.net/ - last updated 2004 :(

## Related Enhancements and Defects

[Stability enhancements](https://github.com/zaproxy/zaproxy/issues?q=is%3Aopen+label%3AType-Enhancement+label%3AStability)

[Stability defects](https://github.com/zaproxy/zaproxy/issues?q=is%3Aopen+label%3AType-Defect+label%3AStability)