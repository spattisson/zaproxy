# Release 2.1.0

The following changes were made in this release:
## Minor changes:
### Issue 355 (on Google Code): Allow Positional Fuzzing
### Issue 475 (on Google Code): Http Sessions custom cookie value
### Issue 484 (on Google Code): Check java version in zap.sh
### Issue 496 (on Google Code): Allow to see the request and response at the same time in the main window
### Issue 505 (on Google Code): Http Session API Implementation
### Issue 515 (on Google Code): Change add-ons to make use of automatic load of messages
### Issue 516 (on Google Code): Change add-ons messages keys to have unique prefix
### Issue 518 (on Google Code): Add OData support
### Issue 537 (on Google Code): Option to Force Browse files/resources with user-defined extensions
### Issue 538 (on Google Code): Allow non sequential lines to be selected in the history log
### Issue 542 (on Google Code): browse api - prompt window to enable
### Issue 551 (on Google Code): Add csrfmiddlewaretoken to list of default Anti csrf tokens
### Issue 552 (on Google Code): Make ZapPortNumberSpinner a subclass of ZapNumberSpinner
### Issue 553 (on Google Code): Add option to filter alerts by scope
### Issue 561 (on Google Code): Copy URLs right click option
### Issue 566 (on Google Code): Abstract class for creating generic popups
### Issue 568 (on Google Code): Allow extensions to run from the command line
### Issue 569 (on Google Code): Allow Spider Scan to start without prior visit
### Issue 587 (on Google Code): Upgrade to JBroFuzz 2.5
### Issue 592 (on Google Code): Do not show the main pop up menu if it doesn't have visible pop up menu items
### Issue 597 (on Google Code): Shown "Author" field on available add-ons ("Marketplace" tab)
### Issue 602 (on Google Code): Allow to (explicitly) choose the file type when exporting URLs to file
### Issue 621 (on Google Code): Handle requests to the proxy URL (and generate a PAC file)
### Issue 638 (on Google Code): Persist and snapshot sessions instead of saving them
## Bug Fixes:
### Issue 150 (on Google Code): java.io.IOException at org.owasp.jbrofuzz.system.Logger.checkOrCreateDirs
### Issue 205 (on Google Code): A previously saved option (Toolbar) is not set on start up when "Prompt for proxy credentials on start up" is checked.
### Issue 317 (on Google Code): Move (or protect) the 'Bin' button
### Issue 452 (on Google Code): API - shutdown asynchronously
### Issue 488 (on Google Code): Fuzz categories available for the default category not updated after installing/uninstalling an add-on (with fuzz files)
### Issue 490 (on Google Code): Re-authentication only works with the active scanner
### Issue 499 (on Google Code): NullPointerException while uninstalling an add-on with a manual request editor
### Issue 500 (on Google Code): NullPointerException while uninstalling an add-on manually installed
### Issue 501 (on Google Code): ExtensionFactory keeps references to uninstalled add-ons (with extensions)
### Issue 502 (on Google Code): Manually installed add-ons don't remain installed
### Issue 504 (on Google Code): Table of installed add-ons may not update after manually installing an add-on
### Issue 507 (on Google Code): Quick start tab doesnt have a scroll pane
### Issue 508 (on Google Code): Some add-ons are not unloading all its components when uninstalled
### Issue 509 (on Google Code): Remove add-on ResourceBundle when an add-on is uninstalled
### Issue 510 (on Google Code): Remove add-on HelpSet when an add-on is uninstalled
### Issue 511 (on Google Code): Allow add-ons to remove footer status labels
### Issue 512 (on Google Code): Allow to remove the footer status label added by the ScanPanel
### Issue 513 (on Google Code): Footer status labels not immediately shown when an add-on is installed
### Issue 514 (on Google Code): Forced Browse footer status label still uses spanner icon
### Issue 517 (on Google Code): Add-ons are added to "main" class loader when installed
### Issue 520 (on Google Code): MissingResourceException when generating "Alerts" report
### Issue 524 (on Google Code): Host authentication is used even when disabled
### Issue 525 (on Google Code): "Report / Export all URLs to File ..." fails
### Issue 528 (on Google Code): Scan progress dialog can show negative progress times
### Issue 533 (on Google Code): Default ports 80 and 443 are appended to sites in site tree
### Issue 540 (on Google Code): Maximised work tabs hidden when response tab position changed
### Issue 548 (on Google Code): Diff messages are appended to the "Diff" dialogue
### Issue 549 (on Google Code): Diff menu item enabled when "Sites" tree root node and a child node are selected
### Issue 550 (on Google Code): Fuzzer - Buffer Overflow stops because of java.sql.SQLDataException: data exception: string data, right truncation
### Issue 558 (on Google Code): Auto tagging broken
### Issue 564 (on Google Code): Active scanner can hang if dependencies used
### Issue 565 (on Google Code): Marketplace: Downloads won't use configured upstream Proxy
### Issue 567 (on Google Code): Spelling mistake
### Issue 574 (on Google Code): Spider fails when invoked via the API
### Issue 579 (on Google Code): Some (build) targets are incorrectly relying on the platform default encoding
### Issue 582 (on Google Code): NullPointerException while opening a session in daemon mode
### Issue 583 (on Google Code): NullPointerException while managing a session in daemon mode with "WebSockets" add-on installed
### Issue 588 (on Google Code): ExtensionHistory.historyIdToRef should be cleared when changing session
### Issue 593 (on Google Code): Quick Start may start the active scan before waiting for the spider to finish
### Issue 614 (on Google Code): SessionFixation labels wrong
### Issue 616 (on Google Code): Spider handles incorrectly form actions containing fragments (#)
### Issue 617 (on Google Code): NullPointerException when spidering a context
### Issue 622 (on Google Code): Local proxy unable to correctly detect requests to itself
### Issue 626 (on Google Code): Scroll bar of alert text areas is always at the bottom
### Issue 627 (on Google Code): Allow add-ons to remove main tool bar buttons/separators
### Issue 628 (on Google Code): Allow add-ons to remove the registered API
### Issue 632 (on Google Code): Manual Request Editor dialogue (HTTP) configurations not saved correctly
### Issue 633 (on Google Code): Auto tag scanners are shown in passive scanners table
### Issue 634 (on Google Code): Empty passive scanner shown in the passive scanners table
## See also
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>