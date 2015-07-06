# How do you configure ZAP logging

ZAP logs to a file called "zap.log" in the ZAP ['home' directory](https://github.com/zaproxy/zaproxy/wiki/FAQconfig).

The logging is configured by the [log4j.properties](https://github.com/zaproxy/zaproxy/blob/develop/src/xml/log4j.properties) file in the same directory.

By default the 'main' logging levels are set to "INFO" by these 2 lines:
```
log4j.logger.org.parosproxy.paros=INFO
log4j.logger.org.zaproxy.zap=INFO
```
Changing these to "DEBUG" (and restarting ZAP) will _significantly_ increase the amount of logging performed:
```
log4j.logger.org.parosproxy.paros=DEBUG
log4j.logger.org.zaproxy.zap=DEBUG
```


---

[Back to the FAQ](FAQtoplevel)