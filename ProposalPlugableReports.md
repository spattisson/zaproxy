# Pluggable Report data Proposal

## Summary

This proposal is a change to the way ZAP manages report data.
It does not address how reports are generated or presented - this is for the data behind reports.

Currently ZAP provides only a limited set of report data. While this can be extended dynamically this feature is not currently used, and theres no way for users to choose what data they get back.
It also provides a set of API calls, some of which return data that could be incorporated into reports, and some of which allow the fixed report to be accessed.

## Feedback
Feedback can be added via comments on this page or posted to the related Dev group post here: https://groups.google.com/d/msg/zaproxy-develop/TOgkaWw4zpQ/6JC0ghy2YzgJ

## What is this proposal trying to solve

  * Allow add-ons to define sets of report data
  * Users cannot select what data types to include in reports
  * Users cannot select which sites / contexts report data should apply to

## The proposal

Proposed changes:
  * Report data will be a distinct type of data returned via API calls
  * Any add-on can provide report data - so this becomes 'plugable'
  * Report data and meta data should be fully internationalized
  * Users can specify which sites / contexts report data should apply to

What this will not provide
  * Report presentation - this will be left to add-ons like the BIRT reporting
  * Fine grained data selection - this will be left to report consumers (like BIRT reporting)

Example report types:
  * Alerts (ie, as now)
  * Port scan results
  * Brute forced files and directories
  * SSL details
  * Application technology

Implementation (exact details may vary;)

  * api.`ApiReportProvider`	A new interface, which is expected to be used by classes extending `ApiImplementor`
    * `ApiResponseSet getReportTypes`(String locale)
      * Will return a structure descripting the report types supported by this provider
      * locale - optional, used for i18n
      * `ApiResponseSet` The report types + i18n description
    * `ApiResponse getReport(String sites, String contexts, boolean inScopeOnly, String reportTypes)`
      * Returns the report data
      * sites, contexts, `inScopeOnly` - optional, see below
      * `reportTypes - mandatory, the report types (comma separated), which must be ones returned by getReportTypes`

  * `report.ReportAPI	 A new ApiImplementor for reporting (in a new ZAP package)`
    * `ApiResponseSet getReportTypes(String locale)`
      * Will return a structure descripting the report data supported by all providers
      * locale - optional, used for i18n
      * `ApiResponseSet` The report types + i18n description
    * `ApiResponse getReport(String url, String context, boolean inScopeOnly, String reportTypes)`
      * sites - optional, comma separated list of sites which all report data will apply to
      * contexts - optional, comma separated list of contexts which all report data will apply to
    * `inScopeOnly` - optional, if true, only return report data for in scope urls
      * `reportTypes` - mandatory, the report types (comma separated), which must be ones returned by `getReportTypes`

Questions
  * Are these notes clear enough, or too 'cryptic'? ;)
  * Do we need to provide meta data about the structure of the report data returned?
  * If no report types are specified should we return:
    * Nothing
    * Everything
    * A default, eg just the alerts