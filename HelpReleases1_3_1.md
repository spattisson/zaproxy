# Release 1.3.1

The following changes were made in this release:
## Bug fixes:
### Issue 97 (on Google Code): Working Directory for Applications
### Issue 98 (on Google Code): Not possible to cancel check for updates
### Issue 100 (on Google Code): Alerts tab has 2 'Resend...' right click popups
### Issue 104 (on Google Code): Display warning dialog, when no root CA certificate exists
### Issue 110 (on Google Code): Choosing user's language by default, when starting the first time
### Issue 112 (on Google Code): Provide a way to apply language packs on Mac OS
### Issue 121 (on Google Code): Session compare report javascript broken in Firefox 3
### Issue 123 (on Google Code): Cant select https site from Active scan window if theres an http equivalent
### Issue 127 (on Google Code): CSRF token feature does not work in fuzz - added help explanation for partial fix
### Issue 140 (on Google Code): The Display options shouldnt include the advanced or windows manager options
### SSL Bug which prevented SSL connections from being established in any browser
## Known issues:
### Mac OS X: Dynamic SSL and Google Chrome
Currently Dynamic SSL is not working when using Google Chrome. This is because of an unresolved known
issue with Google Chrome and Mac OS X Keychain. When importing OWASP ZAP's Root CA into the keychain
and requesting a SSL website, an "Invalid certificate" error message is shown.
## See also
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>