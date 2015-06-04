# Spider

The spider is a tool than is used to automatically discover new resources (URLs) on a particular Site.
It begins with a list of URLs to visit, called the seeds, which depends on how the Spider is started.
The Spider then visits these URLs, it identifies all the hyperlinks in the page and adds them to the
list of URLs to visit and the process continues recursively as long as new resources are found.

There are 4 methods of starting the Spider, differentiated by the seed list with which it starts:
  * Spider Site - The seed list contains all the existing URIs already found for the selected site.
  * Spider Subtree - The seed list contains all the existing URIs already found and present in the subtree of the selected node.
  * Spider URL - The seed list contains only the URI corresponding to the selected node (in the Site Tree).
  * Spider all in Scope - The seed list contains all the URIs the user has selected as being 'In Scope'.
  * Spider all in Context... - The seed list contains all the URIs user has selected as being in the selected context.
_More details can be found below, in the "Accessed via" section_

During the processing of an URL, the Spider makes a request to fetch the resource and then parses the
response, identifying hyperlinks. It currently has the following behavior when processing types of responses:
#### HTML
Processes the specific tags, identifying links to new resources:
  * Base - Proper handling
  * A, Link, Area - 'href' attribute
  * Frame, IFrame, Script, Img - 'src' attribute
  * Meta - 'http-equiv' for 'location' and 'refresh'
  * Form - proper handling of Forms with both GET and POST method. The fields values are generated validly, including [HTML 5.0 input types](http://www.w3schools.com/html5/html5_form_input_types.asp).
  * Comments - Valid tags found in comments are also analyzed, if specified in the [Options Spider screen](HelpUiDialogsOptionsSpider)
#### Robots.txt file
If set in the [Options Spider screen](HelpUiDialogsOptionsSpider), it also analyzes the 'Robots.txt' file and tries to identify new resources using the specified rules. It has to be mentioned that the Spider does not follow the rules specified in the 'Robots.txt' file.
#### OData Atom format
OData content using the Atom format is currently supported. All included links (relative or absolute)
are processed.
#### Non-HTML Text Response
Text responses are parsed scanning for the URL pattern
#### Non-Text response
Currently, the Spider does not process this type of resources.
## Other aspects
  * When checking if an URL was already visited, the behaviour regarding how parameters are handled can be configured on the Spider Options screen.
  * When checking if an URL was already visited, there are a few common parameters which are ignored: jsessionid, phpsessid, aspsessionid, utm`_``*`
  * The Spider's behaviour regarding cookies is defined by the option present in the _Edit -`>` Enable Session Tracking_ option. If that option is enabled, the Spider will properly handle any cookies received from the server and will send them back accordingly. If the option is disabled, the Spider will not send any cookies in its requests.

The spider is configured using the [Spider Options screen](HelpUiDialogsOptionsSpider).
## See also
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsSpider'>Spider Options screen</a></td><td>for an overview of the Spider Options</td></tr>
</table>