The ZAP API scan is a script that is available in the ZAP Live [[Docker]] image.

It is tuned for performing scans against APIs defined by either OpenAPI or SOAP via either a local file or a URL.

It imports the definition that you specify and them runs an Active Scan against the URLs found.
The Active Scan is tuned to APIs, so it doesnt bother looking for things like XSSs.

It also includes 2 new scripts that:

* Raise alerts for any HTTP Server Error response codes
* Raise alerts for any URLs that return content types that are not usually associated with APIs

### Usage
```
Usage: zap-api-scan.py -t <target> -f <format> [options]
    -t target         target API definition, currently only an OpenAPI URL, eg https://www.example.com/openapi.json
    -f format         either openapi or soap
Options:
    -c config_file    config file to use to INFO, IGNORE or FAIL warnings
    -u config_url     URL of config file to use to INFO, IGNORE or FAIL warnings
    -g gen_file       generate default config file (all rules set to WARN)
    -r report_html    file to write the full ZAP HTML report
    -w report_md      file to write the full ZAP Wiki (Markdown) report
    -x report_xml     file to write the full ZAP XML report
    -a                include the alpha passive scan rules as well
    -d                show debug messages
    -P                specify listen port
    -D                delay in seconds to wait for passive scanning 
    -i                default rules not in the config file to INFO
    -l level          minimum level to show: PASS, IGNORE, INFO, WARN or FAIL, use with -s to hide example URLs
    -n context_file   context file which will be loaded prior to scanning the target
    -p progress_file  progress file which specifies issues that are being addressed
    -s                short output format - dont show PASSes or example URLs
    -z zap_options    ZAP command line options e.g. -z "-config aaa=bbb -config ccc=ddd"
```

### Configuration
The configuration works in thew same way as the [Baseline Scan](ZAP-Baseline-Scan) so see the Baseline wiki page for more details.