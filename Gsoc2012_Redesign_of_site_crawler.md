# Contents

---



# Introduction

---

Currently ZAP Project is using a website crawler that is a bit outdated and doesn’t have all the required features up-to-date. Some of the current issues include an old design, missing the ability of comparing two crawling sessions of two logged in users (associate requests with different sessions). During the Google of Summer of Code, my project consists of redesigning the existing crawler and adding sessions awareness.

These initial goals of the project have changed slightly and the details can be found below.


# Project Goals

---

  * redesigned (or possibly replaced) site crawler
  * the crawler has the capability of identifying requests from different sessions
  * thorough documentation for the crawler
  * thorough testing for the crawler implementation
  * ZAP Plugin that allows users to view the crawled URLs for each session independently, and show which URLs are unique to each session.

# About me

---

I'm Cosmin and I'm currently a final year student at the Politehnica University of Bucharest, studying Computer Science.

I'm really passionate about programming, mobile, Web and IT in general, but I'm also a big fun of outdoor activities (biking, skiing, jogging, hicking, basketball and many others). I really enjoy spending quality time with my friends and family and I never say no to a good movie.

Regarding IT, I have around 7 years of experience programming, the most used languages being C and Java. I enjoy contributing to different projects and writing my code in a documented and structured manner.

As it's my first time participating to the GSOC project, my goal is to learn as much as possible, finish my project as soon and possible and (if possible) contribute to other parts of Zaproxy and, why not, enjoy this time.

# Achievements

---

During the three months of the program a lot of unplanned changes to the initial plans have occurred and some important decisions regarding the direction of the development were made together with my mentor, Simon Bennetts. A lot of work was put into making all the code easy to understand and to extend by anyone and into making sure the final product is easy to use and of high quality.

An important decision taken at some point was to break the session handling part from the spider development and create it as an independent extension. The most important advantage is that, in this way, it can be used to offer Http Sessions awareness to any ZAP component/extension.

In the end, the most important achievements and developed features are:
  * **completely rewrite the core Spider**
    * highly modular and easy to extend design
    * optimized code and increased speed
    * memory efficiency and support for huge websites
    * detection and canonicalization of URIs
    * easy to extend filters for skipping processing of resources before fetching or before parsing
    * usable by any other extension
    * proper parsing of html files (tags and comments) and detection of URIs
    * proper parsing of html forms (including html 5.0 input tags) and generation of valid data for submitting
    * proper parsing of non-html tags and support for detecting URIs using the 'robots.txt' files
  * heavy refactoring of Spider Extension classes and rewrite of the UI
  * create new detailed help pages and update existing ones for Spider
  * create a set of test pages that can be integrated into Wavsep and that can be used to test various cases for spiders
  * **created Http Sessions Extension**
    * implemented as Extension and usable by any other component
    * works with any other ZAP component and allows Http Session management for them
    * support for obtaining and managing session tokens
    * detection of Http Sessions
    * creation of new Http Sessions
    * forcing of communication on a particular Http Session
    * new UI tab for viewing and managing Http Sessions
  * create new detailed help pages and update existing ones for the Http Sessions extension
  * extensive JavaDocs for all the written code
  * various other small core changes and optimizations

# Internal details

---

Internal details regarding the two important components developed during the summer can be found below:
  * [Spider Internal Details](InternalSpider)
  * [Http Sessions Extension Internal Details](InternalHttpSessions)

Moreover, two pages describing the important concepts of the two components/extensions are:
  * [Spider Concepts](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsSpider)
  * [Http Sessions Concepts](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsHttpSessions)

# Weekly status updates

---

This section is used for keeping an up-to-date status of the project, my goals and the things that were being worked on in each week. It is only a summary of the most important achievements and it is not meant to be a full and detailed log.

<!---
|| *Goal* ||  *Status*||
||  || <font color="green"> *Done* </font> ||
||  || <font color="red"> *Delayed* </font> ||
||  || <font color="orange"> *Pending* </font> ||
||  || <font color="blue"> *Scheduled* </font> ||
-->

## Week 13 (13th August - 18th August) & 20th of August
| **Goal** | **Status**|
|:---------|:----------|
| Added wiki pages with internal documentation for the Spider and the Http Sessions Extension | <font color='green'> <b>Done</b> </font> |
| Created new help pages and updated existing ones for both the Spider and the Http Sessions Extension | <font color='green'> <b>Done</b> </font> |
| Updated some Javadocs to reflect all the changes and provide more details | <font color='green'> <b>Done</b> </font> |
| Done a lot of testing and bug fixing for both Spider and the Http Sessions Extension | <font color='green'> <b>Done</b> </font> |
| Added a huge patch with a lot of changes to both the Spider and the Http Sessions Extension. Thanks to Ricardo Pereira. | <font color='green'> <b>Done</b> </font> |

## Week 12 (6th August - 11th August)
| **Goal** | **Status**|
|:---------|:----------|
| Merge a lot of changes (=> a lot of conflicts) to the trunk in the dev\_spider branch | <font color='green'> <b>Done</b> </font> |
| Added feature for Spider to start the scan on URL, Site, Subtree and all In Scope | <font color='green'> <b>Done</b> </font> |
| Added feature for Spider to run multiple parallel scans on different Sites | <font color='green'> <b>Done</b> </font> |
| Fixed some issues with Spider saving unnecessary data into the database (through HistoryReference) | <font color='green'> <b>Done</b> </font> |
| Fix some issues for spider | <font color='green'> <b>Done</b> </font> |
| Heavy refactoring, adding proper documentation and optimizations for ExtensionSpider related classes (org.zaproxy.zap.extension.spider package) | <font color='green'> <b>Done</b> </font> |
| Adapt ExtensionHttpSessions to work with all extensions using HttpSenderListener | <font color='green'> <b>Done</b> </font> |
| Merge HttpSessions extension into trunk | <font color='green'> <b>Done</b> </font> |
| Proper cleanup of duplicate sessions and removal of not used tokens when updating session tokens for a Site| <font color='green'> <b>Done</b> </font> |


## Week 11 (30th July - 3rd July)
| **Goal** | **Status**|
|:---------|:----------|
| Add Http Session Tokens management, with changes in ExtensionSession and ExtensionParams | <font color='green'> <b>Done</b> </font> |
| Add support for forcing the creation of a new session  | <font color='green'> <b>Done</b> </font> |
| Add feature that allows users to force all requests on a particular session  | <font color='green'> <b>Done</b> </font> |
| Finish first functional version of ExtensionHttpSessions | <font color='green'> <b>Done</b> </font> |
| Finish UI for the Http Sessions Extension | <font color='green'> <b>Done</b> </font> |

## Week 10 (23th July - 27th July)
| **Goal** | **Status**|
|:---------|:----------|
| Some inactivity time due to summer holiday | <font color='green'> <b>Done</b> </font> |
| Fix some minor issues for Spider | <font color='green'> <b>Done</b> </font> |
| Finish sessions detection for the ExtensionHttpSessions | <font color='green'> <b>Done</b> </font> |

## Week 9 (16th July - 20th July)
| **Goal** | **Status**|
|:---------|:----------|
| Start work on Http Sessions Extension that handles user sessions | <font color='green'> <b>Done</b> </font> |
| Fix existing bugs and implement feedback for Spider | <font color='green'> <b>Done</b> </font> |
| Start work on UI for the new Extension | <font color='green'> <b>Done</b> </font> |

## Week 8 (9th July - 13th July)
| **Goal** | **Status**|
|:---------|:----------|
| Document on how Zaproxy core proxy works and on how to implement proper session handling | <font color='green'> <b>Done</b> </font> |
| Fix bug with non-ASCII characters in URIs | <font color='green'> <b>Done</b> </font> |
| Fix existing bugs and implement some suggestions from Simon | <font color='green'> <b>Done</b> </font> |
| Implement parsers and proper handling for non-HTML files | <font color='green'> <b>Done</b> </font> |
| Added support for HTML base tag changing base url for relative links | <font color='green'> <b>Done</b> </font> |
| Rigurous testing on a multitude of real-life websites | <font color='green'> <b>Done</b> </font> |
| Merge the spider into trunk | <font color='green'> <b>Done</b> </font> |
| Fixed some URL encoding issues | <font color='green'> <b>Done</b> </font> |

## Week 7 (2nd July - 7th July)
| **Goal** | **Status**|
|:---------|:----------|
| Handling of HTML forms | <font color='green'> <b>Done</b> </font> |
| <dd> Handle all HTML4 input types with the help of Jericho library</dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Handle new HTML5 input types </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Process forms with GET method </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Process forms with POST method </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Create options for users to control form submission while crawling </dd> | <font color='green'> <b>Done</b> </font> |
| Cleanup (documenting, bug fixing, code refactoring) of Spider related classes  | <font color='green'> <b>Done</b> </font> |
| <dd> Spider Options Panel </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Spider Panel </dd> | <font color='green'> <b>Done</b> </font> |
| Finish integration of all features so far and create fully functional version | <font color='green'> <b>Done</b> </font> |
| Merge trunk into branch | <font color='green'> <b>Done</b> </font> |


## Week 6 (25th June - 30th June)
| **Goal** | **Status**|
|:---------|:----------|
| Document on Form Handling, including POST and multipart/form-data| <font color='green'> <b>Done</b> </font> |
| (Inactivity period due to Diploma Thesis at the University) | <font color='green'> <b>Done</b> </font> |


## Week 5 (18th June - 23rd June)
| **Goal** | **Status**|
|:---------|:----------|
| Finish work on the ability of spider to process cookies from the response messages and send them properly in subsequent requests | <font color='green'> <b>Done</b> </font> |
| Created additional Wavsep tests for test some Cookie scenarios | <font color='green'> <b>Done</b> </font> |
| Add parsing for new HTML elements (img, link, script, area)  | <font color='green'> <b>Done</b> </font> |
| Create some additional test cases | <font color='green'> <b>Done</b> </font> |
| Added new option for cookie handling in Spider Options Panel. | <font color='green'> <b>Done</b> </font> |
| Various fixes, bug solving and code optimizations in different sections | <font color='green'> <b>Done</b> </font> |


## Week 4 (11th June - 16th June)
| **Goal** | **Status**|
|:---------|:----------|
| Finish integration of Spider in the API & optimizations | <font color='green'> <b>Done</b> </font> |
| Add new features to Spider API |           |
| <dd> New View for obtaining the results for a crawling </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> New Action for stopping the spidering process </dd> | <font color='green'> <b>Done</b> </font> |
| Add support for Frames | <font color='green'> <b>Done</b> </font> |
| Create test cases for Frames | <font color='green'> <b>Done</b> </font> |
| Start work on cookie awareness. Implemented initial version, saving request cookies in the History Table. Unfortunately not the right track so changes required. | <font color='green'> <b>Done</b> </font> |
| Start work on proper handling of cookies (Cookies Pool) with support for cookie attributes like "Path", "Domain" and "Expires"/"Max-age" | <font color='green'> <b>Done</b> </font> |

## Week 3 (4th June - 9th June)
| **Goal** | **Status**|
|:---------|:----------|
| Finish very basic crawler and wrap-up integration with the rest of Zaproxy | <font color='green'> <b>Done</b> </font> |
| Add additional filters/features to the new spider: |           |
| <dd> Maximum depth of crawling </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Filtering by MIME type of response - implemented with Parse Filters </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Proper handling of binary resources (filters after fetch, before processing) - implemented with Parse Filters </dd> | <font color='green'> <b>Done</b> </font> |
| Update API for new spider | <font color='green'> <b>Done</b> </font> |
| Start work on a designing adequate tests in Wavsep for evaluating the spider and for creating regression tests| <font color='green'> <b>Done</b> </font> |
| <dd> Create testing framework </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Setup a method for the testing framework to offer some statistics regarding spider performance </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Implement some very basic/simple cases tests  </dd> | <font color='green'> <b>Done</b> </font> |

## Week 2 (28th May - 2nd June)
| **Goal** | **Status**|
|:---------|:----------|
| Very basic version of crawler with updated structure | <font color='green'> <b>Done</b> </font> |
| <dd> Fetch of resources </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Parsing of HTML files using Jericho, searching for links </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Create very basic Fetch Filters which control which URL's should be fetched and which shouldn't (Protocol and scope) </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> URL/URI processing/canonicalization </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Control of the spidering process </dd> | <font color='green'> <b>Done</b> </font> |
| Update of the Zaproxy Spider extensions to accommodate changes | <font color='green'> <b>Done</b> </font> |

## Week 1 (21st May - 27th May)
| **Goal** | **Status**|
|:---------|:----------|
| Test current spider/crawler using an existing testing framework | <font color='green'> <b>Done</b> </font> |
| Research existing testing frameworks/solutions for spiders/crawlers and setup testing environment | <font color='green'> <b>Done</b> </font> |
| <dd> Setup Wivet Testing environment and make initial assessment of existing spider </dd> | <font color='green'> <b>Done</b> </font> |
| <dd> Setup Wavsep Testing environment </dd> | <font color='green'> <b>Done</b> </font> |
| Research regarding jericho parsing library | <font color='green'> <b>Done</b> </font> |
| Study similar open-source crawling solutions | <font color='green'> <b>Done</b> </font> |
| Finish understanding how the Spider integrates with the the rest of the components | <font color='green'> <b>Done</b> </font> |
| First meeting with mentor, Simon | <font color='green'> <b>Done</b> </font> |

## Pre-Coding period (1st May - 20th May)
| **Goal** | **Status**|
|:---------|:----------|
| get up-to date with existing spider used by ZAP | <font color='green'> <b>Done</b> </font> |
| get acquainted with the ZAP codebase | <font color='green'> <b>Done</b> </font> |
| get in contact with the community | <font color='green'> <b>Done</b> </font> |
| research features for spiders/crawlers | <font color='green'> <b>Done</b> </font> |

<!---
=Features to be implemented in the new crawler=
This is just a log of features/things to consider that will be implemented in the crawler. The order is random:
* proper care of frames
* HTML5 features
* follow robots.txt
* server politeness
* proper handling of relative/absolute links - > URL canonicalizer
* customizable multi-threading
* minimal java-script parsing (onmouseover, window.location, etc)
* crawl depth
* character encoding (e.g. non UTF-8 pages)
* HTTP status codes handling (redirection, moved permanently, etc)
* custom user agent string
* page limitations (depth or count)
* proper file-types handling
* cookies/sessions handling
* caching of checksum for pages, to avoid parsing same page multiple times.
* path-ascending crawling - a crawler would ascend to every path in each URL that it intends to crawl. For example, when given a seed URL of http://example.org/a/b/page.html, it will attempt to crawl /a/b/, /a/, and /.
-->