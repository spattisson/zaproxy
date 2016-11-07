# Open Projects

This page is a list of projects suitable for:
  * Student course work
  * Google summer of code (if/when we take part)
  * Mozilla Winter of Security
  * OWASP Code Sprints
  * Anyone who would like a non trivial ZAP project to work on ;)

If you are interested in any of these projects please post to the relevant issue or post to the [ZAP Developer Group](https://groups.google.com/group/zaproxy-develop).


## Convert active and passive scan rules to scripts
ZAP has a large number of active and passive scan rules (the code that detects potential vulnerabilities) written in Java.

Converting these into one or more of the scripting languages that ZAP supports (which includes Javascript, Jython, Jruby and Zest) would allow users to easily tweak these rules to from within ZAP without having to use a full development environment.

This would be particularly useful for experienced pentesters who want to tune ZAP for a particular target application and/or vulnerability.

## Field enumeration
This would allow a user to iterate though a set of (user defined) characters in order to identify the ones that are filtered out and/or escaped.

The user should be able to define the character sets to test and will probably need to configure the success and failure conditions, as well as valid values for other fields in the form.

[Issue 1405](https://github.com/zaproxy/zaproxy/issues/1405)

## Form handling
The ZAP traditional and Ajax spiders explore an application by putting basic default values in all forms. These may often not be valid values, for example using "ZAP" when an email address is required.

The enhancement would allow the user to define default values based on pattern matching against the field names and/or ids.

It would also be very useful if it could show the user all forms and their associated fields for an application, and then allow the user to update the default values.

## Gauntlet integration
Gauntlt is a framework for controlling security tools for testing web apps.

It is increasingly being used in 'secdevops' and therefore providing a plugin which allows ZAP to be run would be very desirable.

[Issue 439](https://github.com/zaproxy/zaproxy/issues/439)

## Support java as a scripting language
It would be very useful to support Java in addition to the JSR223 scripting languages within the ZAP script console'

It should be possible to provide much better auto complete support than will be possible with dynamically typed scripting languages.

## Zest text representation and parser
Zest is a graphical scripting language from the Mozilla Security team, and is used as the ZAP macro language.

A standardized text representation and parser would be very useful and help its adoption.

[Zest Issue 23](https://github.com/mozilla/zest/issues/23)

# Active Projects
The following projects are no longer 'open' as they are being actively worked on..

## Script console code completion
ZAP provides a very powerful scripting interface. Unfortunately to use it effectively is only really possible with a good knowledge of the ZAP internals. Adding code completion (eg using a project like https://github.com/bobbylight/AutoComplete) would significantly help users.

[Issue 1402](https://github.com/zaproxy/zaproxy/issues/1402)

Students blog: https://sytrik.wordpress.com/

## Testing guide integration
The first part of this project would involve working with the OWASP Testing Guide team to make it much more easily consumable by web testing tools like ZAP.

The second part would involve integrating the OWASP Testing Guide with ZAP, for example as a new 'TO DO' checklist with the relevant sections of the Testing Guide.

