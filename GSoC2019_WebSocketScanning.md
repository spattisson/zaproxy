
# Table of Contents

1.  [WebSocket Scanning (Active - Passive)](#orgc00e8be)
    1.  [Project](#org405e004)
    2.  [WebSocket Passive Scanning [iss#5346]](#orgf58af3e)
        1.  [Completed Work](#org46b6778)
        2.  [Enhancements / To be done / Optional](#org3bfffbf)
    3.  [WebSocket Tree Map [iss#5539]](#org6b46d7d)
        1.  [Pending Work](#org1ef7198)
    4.  [WebSocket Active Scanning [iss#4276]](#orge25c005)
2.  [Weekly Update](#org617b26f)
3.  [Many, many thanks to my mentors!](#org310aa94)


<a id="orgc00e8be"></a>

# WebSocket Scanning (Active - Passive)

Mentors: [@psiinon](https://twitter.com/psiinon), [@kingthorin_rm</sub>](https://twitter.com/kingthorin_rm), [@thc202](https://github.com/thc202)


<a id="org405e004"></a>

## Project

The project is related with WebSocket Scanning and it's continuation of the
last year GSoC [WebSocket Scanning project](https://github.com/zaproxy/zaproxy/wiki/GSoC2018WebSocketScanner). To make a long story short, 
we want to create those tools which are going to give ZAP the ability to perform
Passive and Active Scan. 

> The passive scans rules are used to warn the user of potential vulnerability
> that can be detected passively - <span class="underline">they are not meant to send any new WebSocket</span>
> <span class="underline">message or manipulate the messages in any way</span>. They typically run against
> all of the WebSocket messages that flow through ZAP. Passive rules run in
> a separate background thread so that they have as little effect on performance
> as possible. 
> 
> *From [ZAP blog](https://zaproxy.blogspot.com/2014/04/hacking-zap-3-passive-scan-rules.html), (modified in order to fit the WebSocket Passive scan case)*

At the end, what we want from the WebSocket Passive scan is to check all
WebSocket message payloads for information which might reveal the
existence of an issue/vulnerability (e.x. an internal server error).

On the other hand, Active scan rules attack the server, and therefore are
only run when explicitly invoked by the user. The difference between
WebSocket Passive Scanning and Active scanning is the fact that in the Active
scanning we have to know the structure of the Payload in order to inject
our testing parameters. That's complicates this procedure is that the
WebSocket Protocol does no come with a specific Payload Format. Meaning that
even in the same channel, messages might have different formats. In
addition, some of the payloads might not even follow a formal format (e.g.
like JSON, XML, CSV etc) and have their own unique format, a custom format. 

That lead us to create the WebSocket TreeMap. Briefly, the tree map have to
represent WebSocket Messages in a Tree Structure and analyze their payloads.
Those analyzed payloads is going to be used for active scanning by inject
our active rules. Our goals was to create a mechanism which is going to
used as a infrastructure that will support plugins and scripts.


<a id="orgf58af3e"></a>

## WebSocket Passive Scanning [[iss#5346](https://github.com/zaproxy/zaproxy/issues/5346)]

The WebSocket Passive Scanning infrastructure have be released, in WebSocket
Add-On Release 22, and it's completely usable. Now we have the ability to
detect potential "threats" or interesting information in the WebSocket
Messages. A detailed guide, which is in my [blog,](https://manosmagnus.github.io/posts/websocket-passive-scan-using-scripts-with-zap/) presents step by step the
procedure to use and write your own passive scan script rules in ZAP. User
now has the ability to check their WebSocket messages for common patterns
which might have useful information or indicates an issues by using default
scripts. In addition, the infrastructure gives the ability to write and
deploy custom scripts in any of the languages ZAP supports.


<a id="org46b6778"></a>

### Completed Work

-   [Websocket Passive Scan] Script Mechanism ([PR#1718](https://github.com/zaproxy/zap-extensions/pull/1718))
    -   Refactored, add features (ex helper), make it more usable and
        easy-to-use.

-   [WS-Passive-Scan] Add WebSocket passive scripts by default ([PR#2089](https://github.com/zaproxy/zap-extensions/pull/2089))
    -   Loads the default script (following ones) at ZAP when it starts up.

-   WebSocket Passive Scan Scripts
    -   [WS-Passive-Scan] Base64 disclosure script with javascript ([PR#2088](https://github.com/zaproxy/zap-extensions/pull/2088))
    -   [WS-Passive-Scan] Email disclosure scan with javascript ([PR#2090](https://github.com/zaproxy/zap-extensions/pull/2090))
    -   [WS-Passive-Scan] Add Error Application Disclosure scan ([PR#2091](https://github.com/zaproxy/zap-extensions/pull/2091))
    -   [WS-Passive-Scan] Add Private IP Disclosure ([PR#2092](https://github.com/zaproxy/zap-extensions/pull/2092))
    -   [WS-Passive-Scan] Credit Card Disclosure ([PR#2093](https://github.com/zaproxy/zap-extensions/pull/2093))
    -   [WS-Passive-Scan] Add Username disclosure scan ([PR#2096](https://github.com/zaproxy/zap-extensions/pull/2096))
    -   [WS-Passive Scan] Add XML Suspicious comment disclosure ([PR#2098](https://github.com/zaproxy/zap-extensions/pull/2098))
    -   [WS-Passive-Scan] Add Debug Error Disclosure ([PR#2099](https://github.com/zaproxy/zap-extensions/pull/2099))

-   [WS-Passive-Scan] Override getName & getId ([PR#2104](https://github.com/zaproxy/zap-extensions/pull/2104))
    -   Provide to scripts the ability to use different names and IDs. When a
        script raises an alert, the alert panel shows the script's ID.

-   [WS-Passive-Scan] Tweak newAlert in WebSocketAlertRaiser ([PR#2112](https://github.com/zaproxy/zap-extensions/pull/2112))
    -   Hides method setPluginId to scripts.

-   Add Base Class for WebSocket Unit testing ([PR#2111](https://github.com/zaproxy/zap-extensions/pull/2111))

-   Write a step-by-step guide for WebSocket Passive Scan Scripting ([blog-post](https://manosmagnus.github.io/posts/websocket-passive-scan-using-scripts-with-zap/))

-   Minors:
    -   Add to scanners.md the Websocket Passive scan ID ([PR#5258](https://github.com/zaproxy/zaproxy/pull/5258))
        -   Add WebSocket Passive Scan scripts in scanners.md ([PR#5471](https://github.com/zaproxy/zaproxy/pull/5471))
            -   Add XML Suspicious Comments Disclosure ws-pscan in scanners.md ([PR#5472](https://github.com/zaproxy/zaproxy/pull/5472))
    -   Add WebSocket passive scripts in community scripts ([PR#156](https://github.com/zaproxy/community-scripts/pull/156))
    -   [WS-Passive-Scan] Add help content ([PR#2087](https://github.com/zaproxy/zap-extensions/pull/2087))
    -   [WS-Passive-Scan] Add websocketpassive script type in build.gradle.kts ([PR#162](https://github.com/zaproxy/community-scripts/pull/162))
    -   [WS-Passive-Scan] Add Debug Error Disclosure ([PR#2099](https://github.com/zaproxy/zap-extensions/pull/2099))
    -   Add Default WebSocket passive scripts in CHANGELOG ([PR#2102](https://github.com/zaproxy/zap-extensions/pull/2102))
    -   Remove unrelated escape char from help content ([PR#2103](https://github.com/zaproxy/zap-extensions/pull/2103))
    -   Merge Application Error scripts ([PR#2107](https://github.com/zaproxy/zap-extensions/pull/2107))
    -   Fix sendOutgoingMessage in WebSocketAddonTestUtils ([PR#2134](https://github.com/zaproxy/zap-extensions/pull/2134))


<a id="org3bfffbf"></a>

### Enhancements / To be done / Optional

-   Add more Passive Scan Scripts (even more, even better)
-   Support Java Plugins 
    -   Implement UI for the Passive Scan Infrastructure
-   Implement API


<a id="org6b46d7d"></a>

## WebSocket Tree Map [[iss#5539](https://github.com/zaproxy/zaproxy/issues/5539)]

WebSocket Tree Map is essential for Active Scanning. The Tree Map provides
the appropriate "tools" to the Active Scanners. Those tools are the
following: 

-   Analyzes WebSocket Messages and store them.
-   A way to inject values in the WebSocket Payloads.
-   Gives user the ability to write their own Analyzer in order to provide the
    structure to Active scanner and in order scanner to inject their
    rules.
-   Accumulates messages with the same Payload Structure

The WebSocket Tree Map is the backbone of the Active Scanning. Meaning that
firstly the WebSocket Messages are going to be stored as nodes of the tree and
then they will be passed to Active Scanner plugins and scripts. As the only
responsibility of the active scanner is to inject the testing rules, Tree Map
should provide the appropriate methods to inject them in the right place. At
the end, we want TreeMap to store items which are going to be injected with
the new values. As result, every message should be analyzed in those
convenient objects.


<a id="org1ef7198"></a>

### Pending Work

-   Infrastructure for WebSocket Tree Map ([PR#2135](https://github.com/zaproxy/zap-extensions/pull/2135)) - Reviewing
    -   This PR is a refactored of the [PR#1742](https://github.com/zaproxy/zap-extensions/pull/1742) which was created last year. In
        current implementation the tree structure have been change, and the code
        have been improved. In this PR is implemented only the
        functionality of the Tree Map. 
        -   Every time a new Channel is connected the `WebSocketTreeMap` creates
            new `HostNode` or return the existing one.
        
        -   Every time a new Message has been transmitted over an active channel the
            `WebSocketTreeMap` add it in the Tree if not exists or just updates
            the existing one.
        
        -   Currently the `WebSocketTreeMap` is done the jobs synchronous.

-   Payload Analyzer Infrastructure & JSON analyzer ([PR#2147](https://github.com/zaproxy/zap-extensions/pull/2147)) 
    -   Provides the Base classes for Payload Analyses
    -   Provides ways to store the analyzed payloads, naming `PayloadStructure`
    -   Provides a Mechanism to Analyze JSON formatted payloads

-   Infrastructure to support Plugins and Scripts for payload analysis
    ([ws_payload_analyzer_infra_rf](https://github.com/ManosMagnus/zap-extensions/tree/ws_payload_analyzer_infra_rf)) - Pending PR
    
    This is the combination of the above PRs. The goal of Tree Map is to store
    Payload Structure (when messages could be analyzed). In this
    branch there is a mechanism which allows the addition of plugins and a
    special plugin, the WebSocket Payload Analyzer Scripts plugin. There is
    also a helper which provides basic utility methods to scripts and
    plugins. Every time new a Message TreeNode is inserted into the Tree, the
    mechanism informs a background thread which runs the Payload Analyzer
    plugins. Those analyzers update the tree with the Analyzed payload.

-   Infrastructure for WebSocket Tree Map UI ([ws/treemap/rf/ui](https://github.com/ManosMagnus/zap-extensions/tree/ws/treemap/rf/ui)) - Pending PR 
    
    This is the User Interface in top of the WebSocket TreeMap. Is have been
    implemented using Java Swing and specifically [TreeModel](https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html).

-   A collection with WebSocket Payloads Examples([websocket-examples](https://github.com/ManosMagnus/websocket-examples))      
    
    This is a collection of Web Sites which are using WebSocket Protocol. In
    this repository, you can find several examples of websites which are using
    vary formats, mostly JSON, and a great number of those messages.
    For all web site examples is provided a summary with the most useful
    information and some related comments. In addition, the examples are
    classified according to theirs formats.

-   Tech Specs for WebSocket TreeMap and Payload Analyzers ([TreeMap Tech
    Specs](https://docs.google.com/document/d/1TllW7AkTUZHc5Au7fQDYQLMTfOiYwm-luhJNiSn1xvo/edit)) - Needs to be updated
    
    In this Tech Specs I am providing an overview of project's plan. There are
    goals, assumptions, open questions, implementations details and
    issues. There is document is used by mentors to provide me some feedback
    related with the projects goals and assumptions.


<a id="orge25c005"></a>

## WebSocket Active Scanning [[iss#4276](https://github.com/zaproxy/zaproxy/issues/4276)]

The active scanning should be based on WebSocket TreeMap. Unfortunately, I
didn't have much time to adapt the existing Active Scanner infrastructure
([PR#1768](https://github.com/zaproxy/zap-extensions/pull/1768)) into new improved WebSocket TreeMap. 


<a id="org617b26f"></a>

# Weekly Update

-   Community bonding period (6 May - 27 May)
    -   Create a [blog](https://manosmagnus.github.io/posts/build-zap-with-intelij/)
    -   Refactoring [Websocket Passive Scan] Script Mechanism [#1718](https://github.com/zaproxy/zap-extensions/pull/1718)
    -   Add WebSocket passive scripts [#156](https://github.com/zaproxy/community-scripts/pull/156)
    -   Write a [guide](https://manosmagnus.github.io/posts/build-zap-with-intelij/) for "Setting up a New ZAP Development Environment"
    -   Weekly meeting with my Mentors and ZAP team
    -   Open Tracking Issues [#5346](https://github.com/zaproxy/zaproxy/issues/5346)
    -   Start looking to Passive Scan rules 
        -   Release rules
            -   ApplicationErrorScanner.java
            -   InformationDisclosureDebugErrors.java
            -   TestInfoPrivateAddressDisclosure.java
        -   Beta rules
            -   InformationDisclosureSuspiciousComments.java
            -   UsernameIdorScanner.java
        -   Alpha rules
            -   Base64Disclosure.java
            -   PiiScanner.java

-   Week 1-2 (27 May - 9 June)
    -   Refactoring [Websocket Passive Scan] Script Mechanism [#1718](https://github.com/zaproxy/zap-extensions/pull/1718) 
        -   Fix in Script mechanism which are related with ZAP HUD
    -   Start working on WebSocket Passive Scan scripts 
        -   [WS-Passive-Scan] Base64 disclosure script with javascript ([PR#2088](https://github.com/zaproxy/zap-extensions/pull/2088))
        -   [WS-Passive-Scan] Email disclosure scan with javascript ([PR#2090](https://github.com/zaproxy/zap-extensions/pull/2090))
        -   [WS-Passive-Scan] Add Error Application Disclosure scan ([PR#2091](https://github.com/zaproxy/zap-extensions/pull/2091))
        -   [WS-Passive-Scan] Add Private IP Disclosure ([PR#2092](https://github.com/zaproxy/zap-extensions/pull/2092))
        -   [WS-Passive-Scan] Credit Card Disclosure ([PR#2093](https://github.com/zaproxy/zap-extensions/pull/2093))
        -   [WS-Passive-Scan] Add Username disclosure scan ([PR#2096](https://github.com/zaproxy/zap-extensions/pull/2096))
        -   [WS-Passive Scan] Add XML Suspicious comment disclosure ([PR#2098](https://github.com/zaproxy/zap-extensions/pull/2098))
        -   [WS-Passive-Scan] Add Debug Error Disclosure ([PR#2099](https://github.com/zaproxy/zap-extensions/pull/2099))
    -   Working on minor issues in WebSocket Passive Scanning

-   Week 3-4 (10 June - 23 June)
    -   Start looking for Web Sites which are using WebSocket
        -   Create a list and start document in ([websocket-examples](https://github.com/ManosMagnus/websocket-examples))
    -   Reviewing Scripts
    -   Working on Issues related with Passive Scanning
    -   Writing a step-by-step guide for WebSocket Passive Scan Scripting ([blog-post](https://manosmagnus.github.io/posts/websocket-passive-scan-using-scripts-with-zap/))
    -   Inactive due to Semester Exams

-   Week 5-6 (24 June - 7 July)
    -   [Websocket Passive Scan] Script Mechanism [#1718](https://github.com/zaproxy/zap-extensions/pull/1718) - Merged
    -   [WS-Passive-Scan] Override getName & getId ([PR#2104](https://github.com/zaproxy/zap-extensions/pull/2104)) - Merged
    -   Add Base Class for WebSocket Unit testing ([PR#2111](https://github.com/zaproxy/zap-extensions/pull/2111)) - Merged
    -   WebSocket Passive Scan Scripts - Merged
    -   [WS-Passive-Scan] Add WebSocket passive scripts by default ([PR#2089](https://github.com/zaproxy/zap-extensions/pull/2089)) - Merged
    -   Document Passive Scan Examples ([websocket-examples](https://github.com/ManosMagnus/websocket-examples))
    -   Open PRs for the WebSocket Passive Scan scripts 
    -   Open PRs for minor issues

-   Week 7-8 (8 July - 21 July)
    -   Merge ALL PRs are related with WebSocket Passive Scanning
    -   Discuss and opens issues for the following
        -   Alerts can't handle huge payloads and evidence ([iss#5460](https://github.com/zaproxy/zaproxy/issues/5460))
        -   Base64 Disclosure rule for WebSocket ([iss#5461](https://github.com/zaproxy/zaproxy/issues/5461))
        -   WebSocket default scipts behaviour ([iss#5462](https://github.com/zaproxy/zaproxy/issues/5462))
    -   Start working on Infrastructure for WebSocket Tree Map ([PR#2135](https://github.com/zaproxy/zap-extensions/pull/2135))
        -   Study Design Pattern ([book1](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/), [book2](https://www.oreilly.com/library/view/head-first-design/0596007124/), tutorials)
            -   Composite
            -   Abstract Factory
            -   Adapter - Decorator
            -   Virtual Proxy
            -   Builder
            -   Prototype
            -   Observer
            -   Strategy
            -   Visitor
        -   Study Java Generics ([tutorial](https://docs.oracle.com/javase/tutorial/java/generics/index.html))
-   Add more examples and beautify ([websocket-examples](https://github.com/ManosMagnus/websocket-examples))

-   Week 9-10 (22 July - 4 Aug)
    -   Add more examples and beautify ([websocket-examples](https://github.com/ManosMagnus/websocket-examples))
    -   Open PR for WebSocket Tree Map Infrastructure ([PR#2135](https://github.com/zaproxy/zap-extensions/pull/2135))
        -   Update Javadoc
        -   Fix LGTM
        -   Enhancements
        -   Add utilities to WebSocket Unit tests and write extensive tests
    -   Start Working on Payload Analyzer Infrastructure & JSON analyzer ([PR#2147](https://github.com/zaproxy/zap-extensions/pull/2147))
    -   Start Working on WebSocket Tree Map Infrastructure in order to support Plugins and Scripts ([ws_payload_analyzer_infra_rf](https://github.com/ManosMagnus/zap-extensions/tree/ws_payload_analyzer_infra_rf))  
        -   GSON Library tutorials
    -   Start writing [TreeMap Tech Specs](https://docs.google.com/document/d/1TllW7AkTUZHc5Au7fQDYQLMTfOiYwm-luhJNiSn1xvo/edit)
    -   Open PRs for minor issues

-   Week 11-12 (5 Aug - 18 Aug)
    -   Make change to WebSocket Tree Map Infrastructure ([PR#2135](https://github.com/zaproxy/zap-extensions/pull/2135)) after discussing [TreeMap Tech Specs](https://docs.google.com/document/d/1TllW7AkTUZHc5Au7fQDYQLMTfOiYwm-luhJNiSn1xvo/edit)
    -   Open PR for Payload Analyzer Infrastructure & JSON analyzer ([PR#2147](https://github.com/zaproxy/zap-extensions/pull/2147)) 
        -   Refactoring according to changes made in [PR#2135](https://github.com/zaproxy/zap-extensions/pull/2135)
        -   Improve Performance
    -   WebSocket Tree Map Infrastructure in order to support Plugins and Scripts ([ws_payload_analyzer_infra_rf](https://github.com/ManosMagnus/zap-extensions/tree/ws_payload_analyzer_infra_rf)) 
        -   Refactoring according to changes made in [PR#2135](https://github.com/zaproxy/zap-extensions/pull/2135)

-   Week 13 (19 Aug - 25 Aug)
    -   WebSocket Tree Map Infrastructure in order to support Plugins and Scripts ([ws_payload_analyzer_infra_rf](https://github.com/ManosMagnus/zap-extensions/tree/ws_payload_analyzer_infra_rf))
    -   Start working on WebSocket Tree Map UI ([ws/treemap/rf/ui](https://github.com/ManosMagnus/zap-extensions/tree/ws/treemap/rf/ui))
        -   Study Java Swing ([guide](https://www.comp.nus.edu.sg/~cs3283/ftp/Java/swingConnect/archive/what_is_arch/swing-arch/swing-arch.html#))
            -   Study TreeModel ([guide](https://www.comp.nus.edu.sg/~cs3283/ftp/Java/swingConnect/tech_topics/treemodel/treemodel.html))


<a id="org310aa94"></a>

# Many, many thanks to my mentors!

