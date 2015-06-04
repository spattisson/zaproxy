# `GitHub` Migration

**This is work in progress!**

Unfortunately Google Code is being closed, so we are migrating to `GitHub`.

This is a non trivial process for a project as large as ZAP, hence this page which is an attempt to document the proposed process.

We'd like to use this 'opportunity' to restructure the build route, but the initial priority will be to just get off Google Code

### Objectives
  * Completely move the ZAP projects away from Google Code
  * Maintain as much of the history as possible
  * Adopt a suitable dependency management tool
  * Restructure the projects to something a bit more sensible

### Completed tasks
  * Downloads migrated to [SourceForge](http://sourceforge.net/projects/zaproxy/files/)
  * zaproxy-test migrated to https://github.com/zaproxy/zaproxy-test
  * zap-extensions migrated to https://github.com/zaproxy/zap-extensions

### Outstanding tasks
  * Migrate zaproxy code
    * This is harder as the Google migration tool fails :(
    * Problems include the large number of issues and large binary files
    * So we may well have to adopt Maven before we can move
  * Migrate zaproxy issues
  * Migrate zaproxy wiki
  * Adopt a dependency management tool (possibly Gradle)
  * Publish ZAP core release jar in Maven Central
  * Publish ZAP add-ons in Maven Central
  * Publish ZAP project (core plus main add-ons) in Maven Central
  * Publish ZAP snapshot jars in Maven Central
  * Create a new set of homepages
  * Changing the project structure (possibly one project per add-on?)
  * Gradual migration of all of the Ant tasks to Gradle?
  * Move javadocs to http://www.javadoc.io/
  * Normalise the formatting in the code base (to be agreed;)

### Reference Documentation
  * [Dev Group discussion](https://groups.google.com/d/msg/zaproxy-develop/H3GzoTf9MEI/Jco2UljUTkoJ)
  * Gradle - https://gradle.org/