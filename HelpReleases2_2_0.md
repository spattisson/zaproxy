# Release 2.2.0

The following changes were made in this release:
## Major changes:
### Issue 717 (on Google Code) : Scripts: support multiple scripts and embedding within ZAP components
### Support for Mozilla Zest: https://developer.mozilla.org/en-US/docs/Zest
### Support for Mozilla Plug-n-Hack: https://developer.mozilla.org/en-US/docs/Plug-n-Hack
### Support for scanning headers as well as JSON and XML formats
## Minor changes:
### Issue 711 (on Google Code) : Support scanning of XML requests
### Issue 713 (on Google Code) : Add CWE and WASC numbers to issues
### Issue 719 (on Google Code) : Custom http break points with more options
### Issue 738 (on Google Code) : Options to hide tabs / windows
### Issue 750 (on Google Code) : Upgrade script console to support non textbased scripting languages
### Issue 752 (on Google Code) : Create a new root CA when first run
### Issue 775 (on Google Code) : Allow host to be set via the command line
## Bug Fixes:
### Issue 555 (on Google Code) : Http panels default to hex view
### Issue 599 (on Google Code) : The save session api does not allow to overwrite session already has same name
### Issue 630 (on Google Code) : URLCanonicalizer.getCanonicalURL produces URIs "half" decoded
### Issue 631 (on Google Code) : URLCanonicalizer.buildCleanedParametersURIRepresentation returns URIs in percent-encoded form and decoded
### Issue 652 (on Google Code) : Shutdown after a big scan takes too long (deleting ascan records)
### Issue 655 (on Google Code) : API encoding issues
### Issue 665 (on Google Code) : NullPointerException while proxying with a URI with an empty path component
### Issue 666 (on Google Code) : JSONException while calling an API action without the required parameter(s)
### Issue 669 (on Google Code) : Certificate algorithm constraints in Java 1.7
### Issue 674 (on Google Code) : Add HttpSessionAPI to ApiGeneratorUtils
### Issue 685 (on Google Code) : Add dummy file to "fuzzers" directory
### Issue 686 (on Google Code) : Log HttpException (as error) in the ProxyThread
### Issue 687 (on Google Code) : Change HTTP response header parser to be less strict
### Issue 690 (on Google Code) : Context Authentication URLs don't fail manual overwriting.
### Issue 691 (on Google Code) : Handle old plugins
### Issue 692 (on Google Code) : Report the version of java found by zap.sh
### Issue 693 (on Google Code) : Command line should show all options
### Issue 694 (on Google Code) : API UI fails on IE
### Issue 695 (on Google Code) : Sites tree doesnt clear on new session created by API
### Issue 696 (on Google Code) : Change "Ajax Spider" add-on options to use ZapNumberSpinner
### Issue 697 (on Google Code) : API action "proxy.pac" might return wrong domain/port
### Issue 698 (on Google Code) : Passive Scanner API view "recordsToScan" returns -1 after finish scanning the messages
### Issue 699 (on Google Code) : Fix HTML errors in the help pages
### Issue 702 (on Google Code) : Do not load newer add-on versions if they are not targeted for the running ZAP version
### Issue 703 (on Google Code) : Add-on ZAP version constraints "not-before-version" and "not-from-version" are not respected for already "installed" add-ons
### Issue 706 (on Google Code) : ZAP API doesn't parse correctly query parameters with "&" characters
### Issue 710 (on Google Code) : URLCanonicalizer.getCanonicalURL fails to correctly parse query parameters with "&" and "=" characters
### Issue 712 (on Google Code) : HttpSessions API action "setSessionTokenValue" should add the session token name to the site's session tokens
### Issue 720 (on Google Code) : Cannot send non standard http methods
### Issue 721 (on Google Code) : Non POST and PUT requests receive a 504 when server expects a request body
### Issue 724 (on Google Code) : Do not clone the alert's message that will be shown in message panels
### Issue 725 (on Google Code) : Clear alert's panel fields
### Issue 726 (on Google Code) : Catch active scanner variants' exceptions
### Issue 727 (on Google Code) : Name of automatically created HTTP sessions is always in English
### Issue 728 (on Google Code) : Allow to create a session with a given name through the HttpSessions API
### Issue 729 (on Google Code) : Update NTLM authentication code
### Issue 730 (on Google Code) : MissingResourceException while selecting a disabled extension (from an add-on) in the "Extensions" options panel
### Issue 731 (on Google Code) : MissingResourceException with ExtensionFuzz enabled and ExtensionBruteForce disabled
### Issue 736 (on Google Code) : Change add-on class loading strategy to parent-last
### Issue 737 (on Google Code) : Restore "Ajax spider" add-on dependencies
### Issue 756 (on Google Code) : Allow Context Panels intercommunication
### Issue 763 (on Google Code) : XML report empty when used in daemon mode
### Issue 764 (on Google Code) : HTTP fuzz results dont support right click menus
### Issue 766 (on Google Code) : Searching fuzz results doesnt include the header
### Issue 767 (on Google Code) : HTTP Session API could be less strict
### Issue 772 (on Google Code) : Restructuring of Saving/Loading Context Data
### Issue 774 (on Google Code) : Build doesnt include scripts directory
### Issue 776 (on Google Code) : Allow add-ons to warn user if they're closing ZAP with unsaved resources open
### Issue 777 (on Google Code) : Unable to cancel changes when using Include in/Exclude from Context
### Issue 782 (on Google Code) : NoSuchMethodError when excluding a WebSocket channel URL from context
### Issue 785 (on Google Code) : Change zap.sh to cope with Java 1.8
### Issue 786 (on Google Code) : Snapshot session menu item not working
## See also
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>