# Introduction

Here we describe the **ContentMatcher** component available under the `org.zaproxy.zap.utils` package.

The component has been developed to supply a fast and efficient engine to search a _list of keywords_ or _regex based strings_ inside a specific content (usually an HTML response). The list could be loaded from an XML formatted file, then developers can find all matching elements simply calling one method.

Just to better support the developers on performance issues, the string based search is performed using a unicode based **Boyer-Moore** algorithm (see [Wikipedia](http://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_string_search_algorithm) for details).

# Details

Here's na example of this component usage inside a Plugin to search for errors:

```
String APP_ERRORS_FILE = "/app_errors.xml";

String content = msg.getResponseBody().toString();
ContentMatcher matcher = ContentMatcher.getInstance(APP_ERRORS_FILE);

String evidence = matcher.findInContent(content);

if (evidence != null) {
  // We found it!
}
```

And here is an example of the XML file that can be loaded by the component and used for strings and regex matching:

```
<?xml version="1.0" standalone="no"?>
<Patterns>
  <Pattern type="string">internal error</Pattern>
  <Pattern type="string">A syntax error has occurred</Pattern>
  ...
  <Pattern type="regex">(?i)Line\s\d+:\sIncorrect\ssyntax\snear\s'[^']*'</Pattern>
  <Pattern type="regex">(?i)&lt;h1&gt;Servlet\sError:\s\w+?&lt;/h1&gt;</Pattern>
  ...
<Patterns>
```

The component could be initialized using a getInstance() method starting from a name of a file or directly form a previously instantiated Inputstream object:

```
public static ContentMatcher getInstance(String xmlFileName);
public static ContentMatcher getInstance(InputStream xmlInputStream);
```

Then the search can be performed using one of these embedded methods:

```
public String findInContent(String content);
public List<String> findAllInContent(String content);
```

The first method gives back the first occurrence of the string or the regex that matches, according to the XML file definition, and stop searching.
The second one search for all the occurrences that can be found inside the specified content iterating along all the definitions specified inside the XML file.