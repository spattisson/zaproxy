# Someone is using ZAP to attack my website - what should I do?

ZAP is a free tool designed to help everyone secure their own websites. Unfortunately this means that other people can use it to attack your website as well.

ZAP is not designed to be a covert tool - it uses various variations of "ZAP" in its attacks, so if someone does use ZAP to attack your site then this should be apparent in your web server logs.

If someone is using ZAP to attack your site then there are 2 main questions:
* Do you have any evidence that your site might have been compromised?
* Has any approved security testing been performed on your site at any stage?

If there is no evidence of compromise and you have had your site security tested recently then theres probably not much to worry about.

If no security testing has been performed then you should into this asap.
There are many options, from performing your own testing (using ZAP or a similar tool) to paying a reputable security company to perform the testing for you. The latter would be ideal, but will cost money.
Note that its generally best not to test your production site - ideally you should use a development or staging site that is a copy of your production site.

If you think your site might have been compromised, eg by changes being made that should only be possible by an authenticated account, then you should definitely take stronger measures.
You will want to find your how the site was compromised - it could have been a weak password, but it could also have been via another vulnerability in the site. If its another vulnerability then just changing all of the passwords will not help.

---

[Back to the FAQ](FAQtoplevel)