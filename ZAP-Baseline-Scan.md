The ZAP Baseline scan is a script that is available in the ZAP Weekly [[Docker]] image. It will be added to the stable image when that is re-released.

It runs the ZAP spider against the specified target for (by default) 1 minute and then waits for the passive scanning to complete before reporting the results.

This means that the script doesnt perform any actual 'attacks' and will run for a relatively short period of time (a few minutes at most).

By default it reports all alerts as WARNings but you can specify a config file which can change any rules to FAIL or IGNORE.

This script is intended to be ideal to run in a CI/CD environment, even against production sites.
```
Usage: zap-baseline.py -t <target> [options]
    -t target         target URL including the protocol, eg https://www.example.com
Options:
    -c config_file    config file to use to IGNORE or FAIL warnings
    -g gen_file       generate default config file (all rules set to WARN)
    -m mins           the number of minutes to spider for (default 1)
    -r report         file to write the full ZAP HTML report
    -a                include the alpha passive scan rules as well
    -d                show debug messages
    -s                short output format - dont show PASSes or example URLs
If any files are specified then they MUST be in a directory mounted to /zap/wrk/
eg using the 'docker run' option like: '-v $(pwd):/zap/wrk/:rw' for mounting the cwd.
```
To run it with no 'file' params use:
```
docker run -t owasp/zap2docker-weekly zap-baseline.py -t https://www.example.com
```
If you use 'file' params then you need to mount the directory those file are in or will be generated in, eg
```
docker run -v $(pwd):/zap/wrk/:rw -t owasp/zap2docker-weekly zap-baseline.py \
    -t https://www.example.com -g gen.conf -r testreport.html
```
Example output:
```
docker run -t owasp/zap2docker-weekly zap-baseline.py -t https://www.example.com
May 17, 2016 1:24:32 PM java.util.prefs.FileSystemPreferences$1 run
INFO: Created user preferences directory.
Total of 3 URLs
PASS: Cookie No HttpOnly Flag [10010]
PASS: Cookie Without Secure Flag [10011]
PASS: Password Autocomplete in Browser [10012]
PASS: Cross-Domain JavaScript Source File Inclusion [10017]
PASS: Content-Type Header Missing [10019]
PASS: Information Disclosure - Debug Error Messages [10023]
PASS: Information Disclosure - Sensitive Informations in URL [10024]
PASS: Information Disclosure - Sensitive Information in HTTP Referrer Header [10025]
PASS: HTTP Parameter Override [10026]
PASS: Information Disclosure - Suspicious Comments [10027]
PASS: Viewstate Scanner [10032]
PASS: Secure Pages Include Mixed Content [10040]
PASS: Weak Authentication Method [10105]
PASS: Private IP Disclosure [2]
PASS: Session ID in URL Rewrite [3]
PASS: Absence of Anti-CSRF Tokens [40014]
PASS: Script passive scan rules [50001]
PASS: Insecure JSF ViewState [90001]
PASS: Charset Mismatch [90011]
PASS: Application Error Disclosure [90022]
PASS: WSDL File Passive Scanner [90030]
PASS: Loosely Scoped Cookie [90033]
WARN: Incomplete or No Cache-control and Pragma HTTP Header Set [10015] x 3
	https://www.example.com
	https://www.example.com/robots.txt
	https://www.example.com/sitemap.xml
WARN: Web Browser XSS Protection Not Enabled [10016] x 3
	https://www.example.com
	https://www.example.com/robots.txt
	https://www.example.com/sitemap.xml
WARN: X-Frame-Options Header Not Set [10020] x 3
	https://www.example.com
	https://www.example.com/robots.txt
	https://www.example.com/sitemap.xml
WARN: X-Content-Type-Options Header Missing [10021] x 3
	https://www.example.com
	https://www.example.com/robots.txt
	https://www.example.com/sitemap.xml
FAIL: 0	WARN: 4	IGNORE: 0	PASS: 22
```
