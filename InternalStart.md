# Internals - getting started

ZAP is based around a set of core functionality and a series of extensions that build on the core.

If you want a access and internal data programmatically then you typically need to find out which extension 'owns' the data and then get a reference to it.

Note that users can easily disable extensions, so you should always check that the extension is available.

For example, to get hold of the entries in the history table:
```
ExtensionHistory extHist = org.parosproxy.paros.control.Control.getSingleton().
        getExtensionLoader().getExtension(ExtensionHistory.NAME);

if (extHist != null) {
    // You can now access the history list via:
    extHist.getHistoryList();
}
```

Extensions _should_ expose data and functionality via public methods, but _should not_ expose UI elements.

However many extensions do now follow these conventions - we will be changing these extensions, but if you find and extensions that do not expose their data or functionality in a useful way then please let us know via the [developer group](https://groups.google.com/group/zaproxy-develop).

For full details of all of the classes see the JavaDocs or (of course) the [source code](https://github.com/zaproxy/zaproxy/tree/develop/).

Links:
  * Back: [Script Examples](InternalScripting)
  * Home: [Internal Details](InternalDetails)
  * Next: [Dialog Windows](InternalDialogs)