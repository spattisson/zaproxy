# Development rules and guidelines

As we get more and more people contributing to ZAP we need a set of rules and guidelines to help us work as effectively together as possible.

  * Ease of use is key. New functionality is great too, but it should not make ZAP more complicated to use.

  * All strings that are displayed on the UI must be internationalized.

  * Only check in a consistent set of changes. They dont have to fully implement new functionality, but they must not break existing functionality.

  * All significant new code should be under the [org.zaproxy.zap](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fzaproxy%2Fzap) package.

  * All code under the [org.zaproxy.zap](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fzaproxy%2Fzap) package should compile without any warnings.

  * Any changes to the [org.parosproxy.paros](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fparosproxy%2Fparos) packages should be commented at the beginning of the class (This is a requirement of the Paros licence), and the comments should start with // ZAP: YYYY/MM/DD

  * Make sure that any 3rd party code and libraries you introduce is licensed in a compatible way with the Apache v2 license. GPL code and libraries _can_ be used but only with the explicit consent of the original authors. Ask on the [Dev group](http://groups.google.com/group/zaproxy-develop) if you are unsure.

  * If you copy code (having checked the license as above) you should always acknowledge the original author and if possible include a link to the original version

  * Any significant changes (as opposed to additions) to the UI should initially be checked in as a non default option. Once everyone else has had a chance to try the changes out we can come to a collective decision as to which option should be the new default (old options can also be completely dropped).

  * The UI should be consistent, so all controls should look similar and act in the same way. We can change the UI look and feel, but see the above point.

  * All functionality should be fully documented in the [help pages](http://code.google.com/p/zaproxy/source/browse/#svn%2Ftrunk%2Fsrc%2Fhelp%2Fzaphelp%2Fzaphelp). However the documentation can be added after the code has been checked in as long as this is done before the next release. Note that the wiki help pages must not be changed manually - these reflect the last release, and are generated from the help pages using a script.

  * Please create [Issues](http://code.google.com/p/zaproxy/issues/list) for all significant changes and post messages to the [development group](http://groups.google.com/group/zaproxy-develop) so that everyone knows whats going on

  * There should be a clean split between the functionality and the UI. OK, so thats not true of a lot of the existing code, but new code should have that split, and hopefully over time we'll be able to update all of the old code as well. This will make it much easier to create regression tests and make more of the functionality accessible in headless mode.

  * Extensions should not expose graphical elements, such as Panels. Instead public methods should provide full access to as much of the functionality the extension provides via non graphical classes.

  * Ideally we should be creating regression tests for all significant developments. There are virtually none at the moment, and we need to change that.

  * The @Override annotation should precede all the method declarations that are intended to implement or override another method declaration.

  * Check in code that cleaner than you checked out, aka 'Clean Code' (http://www.cleancoders.com/)

  * Do not format/indent the code on the same commit as code changes, either format before or after committing the code changes.
> > Formatting/indenting the code includes, but is not limited to (specially if it's done on files that don't have code changes):
      * reorder instance and class variables and methods;
      * remove trailing spaces;
      * change indentation of code blocks;
      * replace spaces with tabs or tabs with spaces;
> > This also applies to other files whose structure may be indented (example: XML).

  * Eclipse only:
    * Do not add "(non-Javadoc)" comments to overriding methods (the default comment automatically added when overriding a method).

  * ZAP and ZAP add-ons should not depend on an internet connection to work, so all resources required should be bundled with ZAP or the add-on

  * Add-ons should not make unsolicited external requests except for the purposes of checking for updates to resources, and even then only if explicitly approved by the user

Suggestions as to how the above can be improved will be gratefully received!