# Options Spider screen

This screen allows you to configure the [spider](HelpStartConceptsSpider) options.

It should be noted that modifying most of these options also affects the running Spider.
### Maximum depth to crawl
The parameter defines the maximum depth in the crawling process where a page must be found in order for
it to be processed. Resources found deeper than this level are not fetched and parsed by the spider.

The depth is calculated starting from the seeds, so, if a Spider scan starts with only a single URL (eg.
Spider URL), the depth is calculated from this one. However, if the scan starts with multiple seeds (eg.
Spider site), a resource is processed if it's depth relative to _any_ of the seeds is less than the defined
one.
### Number of threads used
The spider is multi-threaded and this is the number that defines the maximum number of worker threads
used in the crawling process. Changing this parameter does not have any effect on any crawling is in
progress.
### Domain Pattern
The normal behavior of the spider is to only follow links to resources found on the same domain as the
page where the scan started. However, this option allows you to define additional domains that are considered
"in scope" during the crawling process. Pages on these domains are processed during the scan.
### Query parameters handling
When crawling, the Spider has an internal mechanism that marks which pages were already visited, so they
are not processed again. When this check is made, the way the URIs parameters are handled is set using
this option. There are three available options:
  * **Ignore parameters completely** - if www.example.org/?bar=456 is visited, then www.example.org/?foo=123 will not be visited
  * **Consider only parameter's name** (ignore parameter's value) - if www.example.org/?foo=123 is visited, then www.example.org/?foo=456 will not be visited, but www.example.org/?bar=789 or www.example.org/?foo=456&bar=123 will be visited
  * **Consider both parameter's name and value** - if www.example.org/?123 is visited, any other uri that is different (including, for example, www.example.org/?foo=456 or www.example.org/?bar=abc) will be visited
### Send "Referer" header
If the spider requests should be sent with the "Referer" header.
### Process forms
During the crawling process, the behaviour of the spider when it encounters HTML forms is defined by
this option. If disabled, the HTML forms will not be processed at all. If enabled, the HTML forms with
the method defined as HTTP GET will be submitted with some generated values. The behaviour when encountering
forms with the method defined as HTTP POST is configured by the next option.
### POST forms
As briefly described in the previous paragraph (Process Forms), this option configures the behaviour
of the spider when _Process Forms_ is enabled and when encountering HTML forms that have to be POSTed.
### Parse HTML Comments
This option defines whether the spider should also spider the HTML comments searching for links to resources.
Only the resources found in commented valid HTML tags will be processed.
### Parse 'robots.txt' files
This option defines whether the spider should also spider the robots.txt files found on websites, searching
for links to resources. This option does not define whether the spider should follow the rules imposed
by the robots.txt file.
### Handle OData-specific parameters
This options defines whether the spider should try to detect OData-specific parameters (i.e. resources
identifiers) in order to properly process them according to the rule defined by the "Query parameters
handling" option.
## See also
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsSpider'>Spider</a></td><td>for an overview of the Spider</td></tr>
<tr><td></td><td><a href='HelpUiTabsSpider'>Spider Tab</a></td><td>for an overview of the Spider tab</td></tr>
</table>