# How do I handle a False Positive?

False positives are where ZAP raises alerts for things that are not really vulnerabilities.
You should make sure that you understand the potential vulnerability being reported and manually test it before concluding that it is not a real vulnerability.

Please [report](https://github.com/zaproxy/zaproxy/issues/new?labels=bug&template=Bug_report.md) any false positives that you identify supplying as much information as you can, while obfuscating any sensitive information. This will help us improve ZAP.

Many scan rules support [Alert Thresholds](https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsScanpolicy#threshold) and specific [Rule Configuration options](https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsOptionsRuleconfig) which allow you to configure some of the conditions under which alerts are reported. Check the help for the relevant rule - this is included with ZAP and is also available [online](https://github.com/zaproxy/zap-extensions/wiki).

If you are using ZAP manually then you can double click alerts in the desktop UI and change the confidence level to False Positive.

If you are automating ZAP and the relevant scan rule does not support a suitable threshold level then you can use [Context Alert Filters](https://github.com/zaproxy/zap-extensions/wiki/HelpAddonsAlertFiltersAlertFilter) to change alerts that match specific criteria to have a confidence level of False Positive.

The [packaged scans](https://github.com/zaproxy/zaproxy/wiki/Packaged-Scans) also support regex expressions in the [configuration file](https://github.com/zaproxy/zaproxy/wiki/ZAP-Baseline-Scan#configuration-file) which allow you to ignore alerts for the URLs you specify.

---

[Back to the FAQ](FAQtoplevel)