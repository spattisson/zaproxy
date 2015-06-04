<h2><b>Contents</b></h2>



---

## Goals of this project

As per the enhancement request [432](https://github.com/zaproxy/zaproxy/issues/432), this mentorship project is focused on allowing [ModSecurity](http://www.modsecurity.org) users to import their logs into the Zap Sites tree for passive scanning, Zap will analyze the tree as if the data was received directly from the proxy, Zap will not attempt any active scanning unless explicitly requested by the user.

## Project Outline
_I intend to flesh this plan out once I have more context about each task_

  * Create import functionality in Zap, requires filechooser extension to `paros.view`, this should be agnostic of the log format where possible, this may be an extension at first, then worked on further to add to the Zap main project.
  * Utilize [web.audit api](http://jwall.org/web/audit/index.jsp) or some other external/custom tool to parse the imported Modsecurity logs.
  * Re-hydrate the parsed logs into objects in the Zap Sites tree, passive scanning will then be available to these objects.
  * Add functionality for importing logs via Zap's Java rest API.
    * `ImportZAPLogFromFile(), ImportModSecLogFromFile() and ImportZAPRequestResponsePair()`
    * Then need to allow the API actions to accept HTTP POST/PUT so that a ModSec user can configure a ConsuleURI endpoint to send logs to for analysis.

### Potential Follow-up Work
  * Investigate ModSecurity alerts and their event hook, with the intent that Zap could feed results back to ModSecurity.
  * Improve the generic use case for importing of logs into Zap for post event scanning.

## Project Updates
_I will attempt to add weekly summaries on the progress made for each task and note new impediments._

  * **June 19th** - Locally added the extension to alpha extension branch and updated to ZAP 2.0 packaging format. Some minor additions needed to Zap trunk but add-on works with marketplace, except for one ZAP API method that I still need to smoke test.

  * **June 6th** - Need to use "Other" API method instead of "action" for handling POST functionality, also focusing on extracting existing import functionality from my side branch to the latest zap extension packaging format.

  * **May 1st** - Updated ZAP API to accept HTTP POST and tested receiving ModSec POST data to a specific action URI. Currently the Zap WebUI actions use HTTP GET, I do not want to do a breaking change for other extensions. Therefore unfortunately need to accept the POST data as an accumulated parameter in the get request, and also from a direct POST to the URI. Also updated the [API WebUI](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/zaproxy/zap/extension/api/WebUI.java) to use text area HTML in the actions instead of the current table rows, so that you can work with multi-line text. I now have all the API and UI components of this extension working in some capacity, next need to fine tune the HTTP POST API action use case and separate what code needs to be added to Zap trunk and what is ok to stay in my extension.

  * **March 30th** - Working to complete a ZAP API method for receiving HTTP POST/PUT of a ModSec Audit log. That way a ConsoleURI endpoint can be defined in the [mlogc-default.config](https://github.com/SpiderLabs/ModSecurity/blob/master/mlogc/mlogc-default.conf) so that there is a live feed from ModSec into ZAP. Need to look at the [Api](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/zaproxy/zap/extension/api/API.java) and [ApiImplementor](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/zaproxy/zap/extension/api/ApiImplementor.java) classes in org.zaproxy as there is currently not POST support in the API.

  * **March 8th** - Resolved the issues that I had with the jwall api. ModSecurity logs import correctly through the UI piece now. Although as they don't include a http response body tag the ZAP analysis is not as rich as it could be. Completed the first method of the REST api for importing ZAP logs from a file, toiled over adhering to REST concepts that server side implementation should not preserve client side state. In this context if the file is streamed to the server should it be stored as a static resource, such that the REST request URL is always valid after the upload? This is a difficult thing to do as it requires comparing a hash of the contents to see if the file was already added even with a different filename. Discussed with the project lead Simon Bennetts and agreed that the filename check is sufficient for the de-duping and in the case of the http request response pair method allow the client to deal with the case where they add a duplicate pair to ZAP and do not persist the pair request as a static resource on the server, as it is persisted in ZAPs history DB and can be queried via other REST API methods. I will now look to complete the basic implementation of the remaining API methods [`ImportModSecLogFromFile(), ImportZAPRequestResponsePair() and ImportModSecRequestResponsePair()`].

  * **February 19th** - jwall provided samples and details on why the API was failing previously, I setup the basic functionality for parsing ModSec files in ZAP UI. Unfortunately the logs do not have httpresponsebody data available for scanning, this would no doubt yield some more ZAP alerts when scanned. I'm assuming that this is by design that ModSecurity doesn't capture that data. Also setup a temporary branch of Zaproxy so that I can ask for code reviews from other members of the zap team. Started work on the REST API implementation of the features, most likely will just expose methods for the ModSecurity logs to start with as there is not a motivating use case for the zap logs over Rest. jwall's ModSecurity2AuditReader, does have some functionality for parsing stream data for scanning so hopefully I can leverage that with the REST calls. A note about testing and playing with the REST methods in the browser is that Firefox 18 errors with "Zap: Zap error" very frequently when clicking on links, whereas on Internet explorer 10 I have no problems.

  * **February 9th** - Added in the pattern matching when importing ZAP logs for httprequestbody (POST tokens usually) and also for httpresponsebody (html payload). Added options for importing ModSecurity2 data format logs, attempted to use the jwall web audit API for this but some errors occurred with the ModSec example logs that I tried. Got in touch with ModSecurity team to obtain some other sample logs and was contacted by jwall team offering to help resolve my problems with the API.

  * **January 31st** - Got the end to end parsing of the log into the Zap sites tree working, as I was parsing raw text I had to make some assumptions about the content and format of the http log, so I stuck with [RFC2616](http://tools.ietf.org/html/rfc2616) (I was surprised that protocol spec hasn't changed much since 1999). The imported sites appear to have some passive parsing displayed in the UI after the import however I will need to refresh some UI elements post import. Now I can try parsing some ModSec headers, perhaps using the 3rd party API.

  * **January 22nd** - Created a Zap extension that is called from the analyze menu in the UI to import http request and response logs that were previously exported from Zap (Attempting to close the loop). Used [JFileChooser](http://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html) for opening the file and Java's [Scanner](http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html) parser util to regex parse the streamed data from the log file, now need to create a history db object and add the message to the tree as part of the import.

  * **January 17th** - Reading through zaproxy and zapextensions source code, familiarized myself with some of the zap extension [examples](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fzaproxy%2Fzap%2Fextension). Now looking at how to import generic logs such as the ones that Zap exports back into the Sites tree using the `SiteMap.java` class.

## Useful Links
  * [Bugzilla  - 825445](https://bugzilla.mozilla.org/show_bug.cgi?id=825445)
  * [Zap enhancement - 432](https://github.com/zaproxy/zaproxy/issues/432)
