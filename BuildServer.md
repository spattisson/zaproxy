# Build Server

Mozilla have donated a build server for ZAP which we're in the process of setting up.

The plan is for this to be publicly visible, but right now its only available on the Mozilla intranet.

You are welcome to replicate our setup locally - the current job configuration config.xml files are (minus the alert email addresses):
  * [zap-extensions](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/zap-extensions-config.xml)
  * [zap-extensions-alpha](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/zap-extensions-alpha-config.xml)
  * [zap-extensions-beta](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/zap-extensions-beta-config.xml)
  * [zaproxy](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/zaproxy-config.xml)
  * [zaproxy-2.2](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/zaproxy-2.2-config.xml)
  * [zaproxy-test](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/zaproxy-test-config.xml)
  * [Zest](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/docs/jenkins/Zest-config.xml)

The following tasks have been completed:
  * Install Jenkins
  * Set up jobs for the projects:
    * zaproxy (trunk)
    * zaproxy (branch: 2.0)
    * zap-extensions (trunk)
    * zap-extensions (branch: beta)
    * zap-extensions (branch: alpha)
    * zaproxy-test (trunk)
  * Send out alert emails (within Mozilla)
  * Send out alert emails (externally)
The following tasks are still to do:
  * Expose UI externally
  * Run integration tests against vulnerable applications
  * Generate nightly builds
  * Generate metrics for test coverage and code quality