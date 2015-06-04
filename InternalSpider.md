# Introduction

---

The current version of the Spider was developed during as part of a Google Summer of Code 2012 project. This wiki page aims to present some general internal details of how the Spider works and can be used for any subsequent modification.

To start it, the Spider was developed with extensibility and modularity in mind, thus being built as a core spider which can be easily extended with new parsers, filters and other functionality.

Generally speaking, the Spider is broken into 2 pieces:
  * the core spider, in the org.zaproxy.zap.spider.`*` packages
  * the spider extension, in the org.zaproxy.zap.extension.spider package

The core Spider is the module that actually does the crawling of web pages, while the extension is the one that integrates the core module with the GUI interface and with the other extensions of ZAP.

# Core Spider

---

## General concepts

As stated before, the core Spider is the actual module that crawls the web pages. The general process of spidering a website follows the steps:
  1. a set of seed URIs are added to the "to-visit-queue"
  1. each URL to visit is processed as follows:
    1. a series of fetch filters are checked to see if the resource should be fetched (e.g. if it's out of scope or is excluded by a rule)
    1. the resource is fetched
    1. a series of Parse Filters are checked to see if the resource should be parsed (e.g. if it's unsupported protocol or is too big)
    1. the resource is parsed by a set of Parsers.
    1. every valid URI found in the resource is added in the "to-visit-queue", if it wasn't processed already
    1. the process continues until there are no more elements in the "to-visit-queue"

During a Spider scan, the most time-consuming step is the fetching of resources. So, in order to speed up the overall module, multiple threads have been used, each one processing a single URI (the 2.x steps above). For an easier and more efficient implementation, a Java thread pool (Executor.newFixedThreadPool), with a size that can be set by the user, has been used. Each of the tasks that the threads process is completely processing an URI, from the initial checking of filters to fetching it, parsing it and finally adding the newly found resources.

As it can be noticed from the process described above, two types of filters were used. The _Fetch Filters_ are a set of Filters used to check if a particular URI should be processed by the Spider. It is used before fetching and the decision is mainly based on the URI. The _Parse Filters_ are a set of Filters which are used to verify if a fetched resource (actually the response from the server) should be parsed. The decision can be based on the response type, the size of the response, the contents of the response header and so on. These two types of filters have been integrated into the spider in an abstract way and developers can easily add a new Filter just by implementing the appropriate interfaces, thus controlling the decission-making part of the spidering process.

The last important step in the process is how resources are processed. With modularity in mind, the parsing step is also performed abstract by the Spider and new parsers can be implemented and easily added to the spider. This makes processing of new types of responses very easy for developers.

For allowing other components to get informed of the Spider scan progress and events, the SpiderListener interface is used. Any component that needs to be notified of spider related events can register itself as a Spider Listener.

## Extending the Spider
The Spider can also be extended with custom resource parsers or filters.

In order to do this, a few steps need to be followed:
  * extend the **SpiderParser** abstract class or implement the **FetchFilter** or **ParseFilter** classes, implementing the required behaviour.
  * get a reference to the ExtensionSpider (be sure to null check if it's been loaded)
  * add the custom parser or filter via _ExensionSpider#addCustomParser()_, _ExensionSpider#addCustomFetchFilter()_ or _ExensionSpider#addCustomParseFilter()_.

Then, a custom parser or filter will be automatically invoked by the Spider for every message. For more details check the JavaDocs of the mentioned classes.

## Implementation
The implementation for the core spider is done in the org.zaproxy.zap.spider.`*` packages. A short description of the classes and interfaces is done below:

### org.zaproxy.zap.spider package:
  * Spider - this is the main control of the Spider and this is the class that should be instantiated to use the spider. It keeps track of the threads (through the Thread Pool) and allows external classes to manage (start, stop, pause) the process. Also, it's the class that handles SpiderListeners and notifies them of spider related events.
  * SpiderTask - this is a task processed by threads in the thread pool and is associated with a particular URI. The entire, described above, is being executed by the threads.
  * SpiderController - this is used to manage the resources found, keep track of which resources were processed and manages the filters and parsers, providing them to the Spider Tasks when needed. Also, it's the class where the the steps executed when a new resource is found are defined.
  * SpiderParam - keeps track of Spider options.
  * URLCanonicalizer and URLRezolver - these two classes are used to bring an URL to its canonical form and to resolve relative URIs to absolute ones.

### org.zaproxy.zap.spider.filters package:
  * FetchFilter - an abstract class defining the required methods for a Fetch Filter and some necessary constants. The fetch status is used to state if the uri is accepted or, if not, why was it not accepted. To create a fetch filter, it's necessary to extend this class and implement the following method:
```
public abstract FetchStatus checkFilter(URI uri);
```
  * DefaultFetchFilter - a default implementation, which checks the protocol of the URI, whether it's in scope or not and whether it's excluded by a user rule.
  * ParseFilter - similar to FetchFilter, defines the required methods for a Parse filter. To create a parse filter, it's necessary to extend this class and implement the following method:
```
public abstract boolean isFiltered(HttpMessage responseMessage);
```
  * DefaultParseFilter - a default implementation, checking for a maximum response size and for the resource to be of a parsable-text type (text, html, xml, javascript).


### org.zaproxy.zap.spider.parsers package:
  * SpiderParser - the base for parsers used by the spider. The main purpose of these Parsers is to find links (uris) to resources in the provided content. Uses the Jericho Library for parsing. Provides some already implemented useful methods. To create a parser, it's necessary to extend this class and implement the following methods:
```
public abstract boolean parseResource(final HttpMessage message, Source source, int depth);
public abstract boolean canParseResource(final HttpMessage message, String path, boolean wasAlreadyConsumed);
```
  * SpiderParserListener - this interface is used to define the methods required by the classes listening to a parser. It's used to create an abstraction level between the parsers and the actual spider implementation, so any subsequent modifications to either of them has a mininimal effect on the other. So far, the SpiderController is implementing this interface and handles the finding of a new resource (URI).
  * Spider Implementations - a couple of spider implementations are provided, each used for processing different types of resources and/or elements (HTML, Simple Text, Robots.txt file and HTML Froms in an HTML page).

# Spider Extension

---

This is similar to other extensions of ZAP:
  * ExtensionSpider - the main interaction point and implementation for ExtensionAdapter
  * SpiderPanel - the UI panel used for displaying Spider related information and for allowing users to control the spider
  * OptionsSpiderPanel - the UI panel used for allowing the users to specify spider options
  * SpiderThread - a wrapper around the Spider that is implementing the SpiderListener interface and that interacts with the Panel and Extension.
  * SpiderAPI - allows the Spider to be usable through the API
  * SpiderTableModel - the UI uses a table for showing spider related information and this is the table model that keeps track of the found results.


---

Go to this [GSOC 2012 Project's wiki page](Gsoc2012_Redesign_of_site_crawler)

Go to the [Spider General Concepts](HelpStartConceptsSpider) wiki page.