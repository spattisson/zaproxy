# Authentication helper add-on for ZAP [#4705](https://github.com/zaproxy/zaproxy/issues/4705)
Mentors : [Simon Bennetts](https://twitter.com/psiinon?lang=en), [Ricardo Pereira](mailto:thc202@gmail.com), [Rick Mitchell](https://twitter.com/kingthorin_rm)

## About the project (what, why, how)
ZAP allows the penetration tester to set up authentication for the web application being tested. This allows ZAP to run tests from the point of an authenticated user. This is an excellent feature as with the ability of session management and automatic (re)authentication ZAP can check for vulnerabilities that are hidden in authorized resources. This is also a good feature to test broken authentication and session management.
 
However, as of now setting up authentication in ZAP is a multi-step process [1]. It is time-consuming and error-prone. This project targets to resolve this problem by adding three new features to ZAP.

1. Automated configuration
1. Guided configuration
1. Authentication status scanning

### Automated configuration
It is possible to automatically detect and configure an appropriate authentication method for the web application being tested. For HTTP based authentication schemes ZAP only needs to rely on the user to get correct credentials. For non-HTTP based authentication schemes, ZAP needs to rely on the user to get logged in or logged out indicator as well. Other steps can be automated.

### Guided configuration
As described earlier, configuring authentication in ZAP is a multi-step process and they need to be performed in an order. This feature targets to guide the user towards setting up authentication correctly. With the automated configuration in hand, the pen tester may not know the current configuration status. This feature will tell that and will guide the user on his next step.

### Authentication status scanning
Configuring everything does not necessarily mean ZAP is able to authenticate with the web application successfully. Provided credentials may be wrong or provided logged in or logged out indicator may lead to false positives (actually not authenticated but ZAP thinks authenticated). Hence, this feature targets to allow the user to check the authentication status with current configuration.

[1] https://github.com/zaproxy/zaproxy/wiki/FAQformauth


## Links to works carried out

- [authentication helper add-on 1.1.0](https://github.com/KajanM/zap-extensions/commits/authenticationhelper-addon-1.1.0)
- [required core changes for the authentication helper add-on](https://github.com/zaproxy/zaproxy/pull/4898)
- [authentication helper add-on 1.0.0](https://github.com/zaproxy/zap-extensions/pull/1712)
- [comprehensive list of web application authentication schemes](https://docs.google.com/document/d/1LSg8CMb4LI5yP-8jYDTVJw1ZIJD2W_WDWXLtJNk3rsQ/edit)
- [support reauthentication in the presence of an anti-CSRF token](https://github.com/zaproxy/zaproxy/pull/4682)
 

## Demo of the completed project

### Automated configuration

Automated configuration is only supported in **1.1.0** version of the add-on.

Version 1.1.0 also requires ZAP weekly build.

Configuring the `HTTP Basic` scheme is as simple as logging in to the application while proxying through ZAP. Following demo illustartes how ZAP can auto configure `HTTP Basic` scheme for you.
<br />
<br />

<img src='https://github.com/KajanM/demo-authenticationhelper/blob/master/1.1.0/http-basic-auto-config.gif' width="1080" height="608"/>

Auto configuration works for `digest`[2] and `NTLM`[3] as well. You just need to setup the `user` using `Session properties` dialog.

[2] Unlike the `HTTP Basic` scheme, in `HTTP Digest` scheme, transferred credentials is a hashed value. As hashing is a one-way trapdoor function, ZAP can't automatically set up a 'user' for you. 

[3] In `NTLM` scheme the password is not exposed over the wire, so ZAP can't automatically create a new `user` for you.

---

Autoconfiguring `post` based authentication schemes are also supported. It is simple as logging in to the application and providing `logged in/out` indicator. Below is a demonstration of autoconfiguration of form-based authentication scheme.

<img src='https://github.com/KajanM/demo-authenticationhelper/blob/master/1.1.0/form-based-auto-config.gif' width="1080" height="608"/>

<br />

---

If you have already `spider`ed the site, then correct authentication method is already configured for you. You just need to create a `user` and provide `logged in/out` indicator. Below is a demonstration of auto configuration with `spider`.

<img src='https://github.com/KajanM/demo-authenticationhelper/blob/master/1.1.0/spider-to-auto-configure.gif' width="1080" height="608"/>


### Authentication status scanning

Here is a demo illustrating the authentication status scanning feature.

<img src='https://github.com/KajanM/demo-authenticationhelper/blob/master/1.1.0/auth-status-scan.gif' width="1080" height="608"/>

### Guided configuration

Unfortunately, I can not completely illustrate the guided configuration feature using the 1.1.0 version of the add-on, as it will automatically detect and configure appropriate authentication method for you. Here is a demonstration using the 1.0.0 version of the add-on.

<img src='https://github.com/KajanM/demo-authenticationhelper/blob/master/1.0.0/guided-config.gif' width="1080" height="608"/>

<br />
<br />

## A word of thanks <3

This has been a great journey and an awesome experience. I learnt a lot and I have gained a lot.
I would like to express my gratitude to Google, my mentors, family, lecturers, friends and to all those who made it possible. Thank you very much :)

We received a lot of feedbacks and suggestions on the [web app authentication schemes list]("https://docs.google.com/document/d/1LSg8CMb4LI5yP-8jYDTVJw1ZIJD2W_WDWXLtJNk3rsQ/edit?usp=sharing") via emails and ZAP dev group. The doc is updated based on your comments and thank you all for sharing your knowledge.

This project is a great success. One main thing for the success is ZAP's architecture. ZAP is built in a manner such that it is easy to extend. The infrastructure is well built. This indicates ZAP will live longer. Thank you to the community for all your hard works.

## Weekly updates

### Coding week - 13 (06/08 - 13/08)

- [x] weekly meeting
- [x] create wiki page for GSoC project
- [x] update blog

### Coding week - 12 (30/07 - 05/08)

- [x] weekly meeting
- [x] PR: necessary core changes for the add-on ([#4898](https://github.com/zaproxy/zaproxy/pull/4898))
- [x] auto configuration logic for HTTP digest, NTLM
- [x] bug fix: in determining authentication status
- [x] write test cases for determining authentication status
- [x] auto configuration logic for post based authentication schemes
- [x] auto configuration when spidering

### Coding week - 11 (23/07 - 29/07)

- [x] weekly meeting
- [x] automatic configuration for HTTP basic scheme
- [x] brainstorm approach to auto configure post based authentication


### Coding week - 10 (16/07 - 22/07)

- [x] weekly meeting
- [x] requirement study using `reflection` in `Java`
- [x] fix alignment problem in `AuthenticationHelperDialog` using `reflection`
- [x] add `AuthenticationHelperOptionsPanel` that allows the pen tester to add regexes which are excluded from authentication status scanning
- [x] code improvements
- [x] start working on passive scan rule to auto configure HTTP authentication schemes

### Coding week - 09 (09/07 - 15/07)

- [x] weekly meeting
- [x] complete second evaluation
- [x] add links to relevant `Session properties` dialog for each checklist item in `AuthenticationConfigurationChecklistPanel`
- [x] remove redundant `ToolTip`s in `AuthenticationConfigurationChecklistPanel`
- [x] add `refresh` button in `AuthenticationConfigurationChecklistPanel` to rerun the checks with updated settings
- [x] internationalized the `String`s that are shown in UI
- [x] add a hint panel with settings button in `AuthenticationConfigurationChecklistPanel` that tells the next best step and leads to the relevant properties dialog when the button is clicked

### Coding week - 08 (02/07 - 08/07)

- [x] weekly meeting
- [x] code reworks due to extending `AuthenticationStatusScanner` with wrong class [`Scanner`](/zaproxy/src/org/parosproxy/paros/core/scanner/Scanner.java) which is coupled with active scannig logic
- [x] code improvements

### Coding week - 07 (25/06 - 01/07)

- [x] weekly meeting
- [x] move the add-on to master branch
- [x] code improvements
- [x] fix bug: authentication status scan results not properly updated to UI
- [x] render authentication, logged in/out indicator statuses using `Icon`

### Coding week - 06 (18/06 - 24/06)

- [x] weekly meeting
- [x] create `ExtensionAuthenticationHelper`
- [x] create `AuthenticaitonHelperDialog` UI from which the pen tester can select `Target`, `Context`, `User` and start authentication status scanning.
- [x] crete `AuthenticationConfigurationChecklistPanel` to indicate status of required configurations
- [x] create `PopupMenuItemCheckAuthentication` that allows the pen tester to initiate the `AuthenticationHelperDialog` by right clicking a `SiteNode` and selecting `Check authentication` option.
- [x] create `AuthenticationStatusTableModel`, `AuthenticationStatusTable` and `AuthenticationStatusTableEntry` classes to show necessary data to the pen tester
- [x] create `AuthenticationStatusPanel` UI in which the authentication status scan result will be updated and the pen tester can `start`, `stop`, `pause`, `resume`, and analyze the `HttpMessage` 
- [x] requirement study: `concurrency` in `Java`
- [x] create `AuthenticationStatusScanController` to control multiple authentication status scans
- [x] create `AuthenticationStatusScanner` that matches each `HttpMessage`'s `Header`, `Body` with provided `logged in indicator` or(and) `logged out indicator` and determine authentication status from it

### Coding week - 05 (11/06 - 17/06)

- [x] complete first evaluation
- inactive due to end semester exams

### Coding week - 04 (04/06 - 10/06)

- inactive due to end semester exams

### Coding week - 03 (28/05 - 03/06)

- [x] weekly meeting
- [x] go through existing code (as suggested in [this](https://github.com/zaproxy/zaproxy/issues/4705#issuecomment-393109195) comment) to get started with authentication status scanning
- [x] brainstorm UI for `AuthenticationHelperDialog`

### Coding week - 02 (21/05 - 27/05)

- [x] weekly meeting
- [x] [document](https://docs.google.com/document/d/1ZwJoIORtS10gvgJBJ4zuEKoQEMJ8mcMT1TlXlbmTCn8/edit?usp=sharing) setting up vulnerable apps for authentication
- [x] [create](https://github.com/KajanM/login-schemes) testing applications
- [x] improve authentication schemes [doc](https://docs.google.com/document/d/1LSg8CMb4LI5yP-8jYDTVJw1ZIJD2W_WDWXLtJNk3rsQ/edit) based on spring security reference
- [x] PR: refresh cookie before each login request ([#4696](https://github.com/zaproxy/zaproxy/pull/4696))
- [x] PR: help contents for automatic acsrf token submission support in form-based authentication ([#193](https://github.com/zaproxy/zap-core-help/pull/193))

### Coding week - 01 (14/05 - 20/05)

- [x] weekly meeting
- [x] PR: add support for dynamic fields in Form-based authentication method ([#4682](https://github.com/zaproxy/zaproxy/pull/4682))
- [ ] document setting up vulnerable apps for authentication (carried over to next week)
- [x] Spring security requirement study
- [ ] create testing applications (carried over to next week)
- [x] go through authentication related issues, posts in ZAP user, developer group

### Community bonding period (23/04 - 13/05)

- [x] go through [contributing.md](https://github.com/zaproxy/zaproxy/blob/develop/CONTRIBUTING.md), [development rules and guidelines](https://github.com/zaproxy/zaproxy/wiki/DevGuidelines), [add-on development](https://github.com/zaproxy/zap-extensions/wiki/AddOnDevelopment) wiki pages
- [x] start a [blog](https://kajanm.github.io/gsoc) for GSoC project
- [x] [introduce](https://groups.google.com/forum/#!topic/zaproxy-develop/P83P8d7GJLI) in the ZAP Dev Group
- [x] setup the development environment
- [x] start building up [a comprehensive list of different authentication mechanisms](https://docs.google.com/document/d/1LSg8CMb4LI5yP-8jYDTVJw1ZIJD2W_WDWXLtJNk3rsQ/edit?usp=sharing)
- [ ] start building up a list of vulnerable web applications with authentication feature for testing (carried over to next week)
- [x] add support for dynamic fields in Form-based authentication method ([#2182](https://github.com/zaproxy/zaproxy/issues/2182))
- [ ] ~~work on detailed plan for the project~~ (from start to end I was guided by the mentors :) )


### After submitting the proposal (28/03 - 22/04)

- [x] complete the Pluralsight course [Eclipse Guided Tour for Java](https://app.pluralsight.com/library/courses/guided-tour-eclipse-for-java/table-of-contents)
- [x] complete the Pluralsight course [Eclipse for Java Developers](https://www.pluralsight.com/courses/eclipse-java-developers)
- [x] open pull request for tighter DirBuster integration ([#1534](https://github.com/zaproxy/zap-extensions/pull/1534))
- [x] complete the Pluralsight course [Mastering Java Swing-Part 1](https://www.pluralsight.com/courses/mastering-java-swing-part1)
- [x] complete the Pluralsight course [Mastering Java Swing-Part 2](https://www.pluralsight.com/courses/mastering-java-swing-part2)
- [x] partially complete the Pluralsight course [Mastering Java Swing-Part 3](https://www.pluralsight.com/courses/mastering-java-swing-part3)
- [x] [practiced](https://github.com/KajanM/StepByStepSwing) learnt Swing concepts


### Prior to submitting the proposal (12/02 - 27/03)

- [x] go through the [guidelines](https://www.owasp.org/index.php/GSoC)
- [x] read the “ Hacking Zap” [blog posts](https://github.com/zaproxy/zaproxy/wiki/Development#Hacking_ZAP) 
- [ ] ~~look at IdealFirstBug [(#2332)](https://github.com/zaproxy/zaproxy/issues/2332)~~
- [x] look at IdealFirstBug [(#173)](https://github.com/zaproxy/zaproxy/issues/173)
- [x] complete the Pluralsight course [Getting Started with OWASP Zed Attack Proxy (ZAP) for Web Application Penetration Testing](https://www.pluralsight.com/courses/owasp-zap-web-app-pentesting-getting-started)
- [x] complete the Pluralsight course [Ethical Hacking: Hacking Web Applications](https://www.pluralsight.com/courses/ethical-hacking-web-applications)
- [x] play with OWASP-BWA and ZAP
- [x] contact mentors and clarify doubts
- [x] submit draft proposal and get it reviewed from mentors
- [x] address review comments and submit proposal