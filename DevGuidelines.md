# Development Rules and Guidelines

As we get more and more people contributing to ZAP we need a set of rules and guidelines to help us work as effectively together as possible.

  * Ease of use is key. New functionality is great too, but it should not make ZAP more complicated to use.

  * All strings that are displayed on the UI must be internationalized.

  * Only check in a consistent set of changes. They dont have to fully implement new functionality, but they must not break existing functionality.

  * All significant new code should be under the [org.zaproxy.zap](https://github.com/zaproxy/zaproxy/tree/develop/src/org/zaproxy/zap) package.

  * All code under the [org.zaproxy.zap](https://github.com/zaproxy/zaproxy/tree/develop/src/org/zaproxy/zap) package should compile without any warnings.

  * Any changes to the [org.parosproxy.paros](https://github.com/zaproxy/zaproxy/tree/develop/src/org/parosproxy/paros) packages should be commented at the beginning of the class (This is a requirement of the Paros licence), and the comments should start with // ZAP: YYYY/MM/DD

  * Make sure that any 3rd party code and libraries you introduce is licensed in a compatible way with the Apache v2 license. GPL code and libraries _can_ be used but only with the explicit consent of the original authors. Ask on the [Dev group](https://groups.google.com/group/zaproxy-develop) if you are unsure.

  * If you copy code (having checked the license as above) you should always acknowledge the original author and if possible include a link to the original version

  * Any significant changes (as opposed to additions) to the UI should initially be checked in as a non default option. Once everyone else has had a chance to try the changes out we can come to a collective decision as to which option should be the new default (old options can also be completely dropped).

  * The UI should be consistent, so all controls should look similar and act in the same way. We can change the UI look and feel, but see the above point.

  * All functionality should be fully documented in the [help pages](https://github.com/zaproxy/zap-core-help/tree/master/src/help/zaphelp). However the documentation can be added after the code has been checked in as long as this is done before the next release. Note that the wiki help pages must not be changed manually - these reflect the last release, and are generated from the help pages using a script.

  * Please create [Issues](https://github.com/zaproxy/zaproxy/issues) for all significant changes and post messages to the [development group](https://groups.google.com/group/zaproxy-develop) so that everyone knows whats going on

  * There should be a clean split between the functionality and the UI. OK, so thats not true of a lot of the existing code, but new code should have that split, and hopefully over time we'll be able to update all of the old code as well. This will make it much easier to create regression tests and make more of the functionality accessible in headless mode.

  * Extensions should not expose graphical elements, such as Panels. Instead public methods should provide full access to as much of the functionality the extension provides via non graphical classes.

  * Where possible all developments should include regression tests. There are not enough at the moment, and we need to change that.

  * The @Override annotation should precede all the method declarations that are intended to implement or override another method declaration.
<a name="cleancode"></a>
  * Check in code that is cleaner than you checked out, aka 'Clean Code' (http://www.cleancoders.com/)
<a name="format"></a><a name="formatting"></a>
  * Do not format/indent the code on the same commit as code changes, either format before or after committing the code changes.

    Formatting/indenting the code includes, but is not limited to (specially if it's done on files that don't have code changes):
      * reorder instance and class variables and methods;
      * remove trailing spaces;
      * change indentation of code blocks;
      * replace spaces with tabs or tabs with spaces;

    This also applies to other files whose structure may be indented (example: XML).

  * Eclipse only:
    * Do not add "(non-Javadoc)" comments to overriding methods (the default comment automatically added when overriding a method).

  * ZAP and ZAP add-ons should not depend on an internet connection to work, so all resources required should be bundled with ZAP or the add-on

  * Add-ons should not make unsolicited external requests except for the purposes of checking for updates to resources, and even then only if explicitly approved by the user

## Unit Test Specific Guidelines

  * Function names should be descriptive, and use standard camelCaps (camelCase). Examples: `shouldRaiseAlertIfPasswordFieldAndFormHasNoAutocomplete()`, `shouldSetValuesToFieldsWithNoValueWhenParsingGetForm()`, `shouldAppendSessionFiletypeAndRetrieveSessionFileFromRelativePath()`.
  * Comments can be used to aide in increasing readability and classifying/tagging portions of Unit Test functions, such as: `\\Given`, `\\When`, `\\Then`. Example: 
    * [1 - SessionUtilsUnitTest.java](https://github.com/thc202/zaproxy/blob/75d94411f14209db272dc05b4cd73ae2de9ce466/test/org/zaproxy/zap/model/SessionUtilsUnitTest.java#L28)
  * Unit Tests should cover at least all the main functionality of the item under test.

## Style Guidelines
**_This section is a work-in-progress as of Sept. 2016._** If you have contributions/feedback/ideas please refer to this thread in the Dev Group - https://groups.google.com/forum/#!topic/zaproxy-develop/FPwvyHY5rb4 .

The following guidelines apply to ZAP's text elements as represented in English (en-GB, en-US, and en-CA).

### Text: Titles, Menu Items, Options, and Tool Tips
Titles, menu items, options, and tool tips text should be represented using Title Capitalization as defined by the 'Chicago Manual of Style'. For quick reference you can use this online tool: https://capitalizemytitle.com/#Chicago (make sure you select the "Chicago" tab).

***

Suggestions as to how the above can be improved will be gratefully received!