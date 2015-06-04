# Extending ZAP

There are various ways you can extend ZAP, as documented below.

Note that this is just an overview, there are some basic working examples in the [ZAP Extensions](https://code.google.com/p/zap-extensions/) project which will be added to in the future.

If you have any questions then please ask them on the [zaproxy-develop](http://groups.google.com/group/zaproxy-develop) Google Group.

## Auto tag regexs

You can get ZAP to automatically [tag](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsTags) requests and responses via:
> Tools / Options... / Passive Scan / "Add / Edit scan definition"

## Invoking other applications

You can invoke other applications from ZAP passing across the context information.

For more details see the [Options Application screen](https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsOptionsInvokeapp) in the User Guide.

## Custom Fuzzing files

You can add your own [fuzzing](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsFuzz) files by via:
> Tools / Options... / Fuzzer / Add custom Fuzz file

## Custom Forced Browse files

You can add your own [forced browse](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsBruteforce) files by via:
> Tools / Options... / Forced Browse / Add custom Forced Browse file

## API

The REST based API allows 'external' applications to access ZAP data and to invoke ZAP functionality.

For more details see the [ZAP API](ApiDetails) section of this wiki.

## Filters

Filters add extra features that can be applied to every request and response.

To implement a new Filter extend the class [FilterAdaptor](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/extension/filter/FilterAdaptor.java)

For examples see the [org.parosproxy.paros.extension.filter](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fparosproxy%2Fparos%2Fextension%2Ffilter) package.

Filters are loaded from the 'filters' directory.

## Active Scan Rules

Active Scan rules find potential vulnerabilities by attacking the target application.

Many of the existing [Active Scan](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsAscan) rules are defined in the [org.parosproxy.paros.core.scanner.plugin](http://code.google.com/p/zaproxy/source/browse/#svn/trunk/src/org/parosproxy/paros/core/scanner/plugin) package, but new rules should be added to the [org.zaproxy.zap.scanner.plugin](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/#org%2Fzaproxy%2Fzap%2Fscanner%2Fplugin) package.

Active scan rules are loaded from the 'plugins' directory.

## Passive Scan Rules

Passive Scan rules find potential vulnerabilities just by examining the requests and responses in a background thread. They should not make any changes.

The [Passive Scan](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsPscan) rules are defined in the [org.zaproxy.zap.extension.pscan.scanner](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fzaproxy%2Fzap%2Fextension%2Fpscan%2Fscanner) package.

Passive scan rules are loaded from the 'plugins' directory.

## Extensions

Full extensions can add functionality to ZAP, including new tabs, pop windows, menu items etc.

For more details see [ZAP Extensions](ZapExtensions)