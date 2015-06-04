# Introduction

---

The Http Sessions Extension was developed as part of a Google Summer of Code 2012 project. This wiki page aims to present some general internal details of how the extension works and can be used for any subsequent modifications.

The Http Sessions Extension keeps track of the existing Http Sessions on a particular Site and allows the Zaproxy user to easily switch between user sessions on a Site, to create a new Session without "destroying" the existing ones or to force all requests to be on a particular session.

The details about what it does, how it is used, what are session tokens and how they can be set can be found on the user page for this extension: [HelpStartConceptsHttpSessions](HelpStartConceptsHttpSessions)

# General concepts

---

As mentioned on the user wiki page, there are 2 types of session tokens this extension is working with: default session tokens and site session tokens. Internally, for an Http Session, the most important data to store is a mapping between session tokens (cookie names) and the values these tokens have to have. The extension processes the incoming or outgoing http messages analyzing the headers. It automatically detects default session tokens and user-set site session tokens and tries to make a match between this http message and any existing Http Session detected before. If no matching is done, a new Http Session is created.

An important aspect that has to be mentioned is that the HttpMessage (org.parosproxy.paros.network) has been modified so that it includes a reference to the matching session. When an outgoing HTTP request-message is processed, if a matching session is found or a new one is created, its reference is saved in the messaged. Thus, when the response message is processed, if the matching has already been done, this step is skipped and the processing time is reduced. NOTE: This field is not currently saved in the database when the message is stored with a HistoryReference.

When an active session is set, all the http messages are processed and the headers are modified so that the required session tokens are set to force the message to be associated by the HTTP server with the session marked as active.

To allow the extension to be used with any other extension, it implements the HttpSenderListener interface and registers itself as a listener to any message sent or received through a HttpSender. Therefore, it can detect and manipulate Http Sessions for any other ZAP extension.

One other very important aspect of the extension is that it offers an interface for any other ZAP component to obtain and manage the session tokens for a particular Site.

## HTTP message processing
The processing for every HTTP message aims to:
  * match messages to sessions, if possible, or detect and create new sessions.
  * modify HTTP requests so that the token values set in the message match the session token values stored in the Active Session, if any is set so.
  * modify stored session tokens values, if needed (e.g. the response contains a Set-Cookie header changing the value for a session token).

## Session Detection/Matching
One of the most important processes this extension performs is that matching of an HTTP message with an existing session. This matching uses the list of existing Http Sessions previously detected by the extension and the list of values for tokens from the HTTP message. The current version of the extension only uses the cookies, therefore the list of values is actually the list of cookies present in the request message.

The steps of this matching are the following:
  * for every session token T
    * find the value V of the token from the HTTP message
    * create the list of matching sessions with any of the following conditions
  * if the value V does not exist (there is no value for the T token set in the message), the session does not have a stored value for that token as well
  * if the session does not have a stored value for the T token
  * if the session has a value for the T token, it matches the value V found in the message

In other words, the matching sessions are all those that have the same value (including null) for all the session tokens as the message or don't have a value for the token at all. If more sessions are matching, the one with the most matching token values is chosen.

## Session Tokens
The two types of session tokens (site and default) can be managed by the user either through other extension (e.g. Params Extension for site session tokens) or through Options Panel (for the default session tokens). As mentioned, the Http Session extension offers an interface to obtain an manipulate the session tokens for a particular Site. The methods available on the ExtensionHttpSessions object are the following:
```
public boolean isDefaultSessionToken(String token);
public boolean isSessionToken(String site, String token);
public void addHttpSessionToken(String site, String token);
public void removeHttpSessionToken(String site, String token);
```

Internally, for every Site a list of session tokens is kept. Furthermore, to allow users to override the default session tokens and unset them as session tokens for a particular Site, a list of overriden default session tokens is also kept.

# Implementation details

---

The extension is implemented in the org.zaproxy.zap.extension.httpsessions package. The description of the most important classes is the following:
  * ExtensionHttpSessions - the main interaction point and implementation for ExtensionAdapter
  * HttpSession - stores all the necessary details about an http session. The most important element is the map between session tokens and the reqired values. It also keeps track of the count of HTTP messages that were matched with this session.
  * HttpSessionsSite - contains all the HTTP sessions and the related information about a particular Site. This handles the active session for a Site, the creation of new sessions and also the processing of the HTTP messages that have been matched with the corresponding Site. It also keeps an updated HttpSessionsTableModel used when displaying information about sessions for a particular Site.
  * HttpSessionsPanel - the UI panel used for displaying Http Sessions related information and for allowing users to manage the sessions
  * OptionsHttpSessionsPanel and OptionsHttpSessionsTableModel - the UI panel used for showing options for the extension and the table model used for displaying default session tokens.
  * HttpSessionsParams - keeps track of options for this extension
  * PopupMenu`*` - popup menus used to remove existing sessions or set/unset the active session.


---

Go to this [GSOC 2012 Project's wiki page](Gsoc2012_Redesign_of_site_crawler)

Go to the [Http Sessions General Concepts](HelpStartConceptsHttpSessions) wiki page.