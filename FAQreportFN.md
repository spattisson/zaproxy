# How do I report a False Negative?

False Negatives are where ZAP fails to identify an issue when it should.

Reporting these problems to us for passive scan rules is straightforward - just let us know the full request and/or response that ZAP should have raised the problem for.

Reporting problems with active scan rules is a bit more tricky, as ZAP will potentially send several requests to detect a specific problem and we need to know how your application responded to each one.

Ideally we would like a ZAP unit test which reproduces the problem. An example of one of these is [TestCrossSiteScriptV2UnitTest.java](https://github.com/zaproxy/zap-extensions/blob/master/addOns/ascanrules/src/test/java/org/zaproxy/zap/extension/ascanrules/TestCrossSiteScriptV2UnitTest.java)
However these are not easy for non programmers to write.

An alternative is to record a Zest script of the rule that you think should have detected the problem scanning the relevant URL:

Find the relevant URL in the Sites (or History) tree.
This must correspond to the request that is actually vulnerable, ie it must have the same method (GET, PUT etc)
and the correct parameter names.
If you cant find it then there is a problem exploring your application. This could be the way you are using ZAP or a problem with ZAP itself and is out of scope for this FAQ.

1. Right click the relevant URL and select 'Attack / Active Scan...'
1. Check the 'Show advanced options' box if it is not already selected.
1. Select the 'Policy' tab.
1. Select: 'Apply "OFF" Threshold to "All" Rules' and click 'Go'.
1. Find the rule you want to test in the relevant category and change its Threshold to 'Default' by clicking on it in the table.
1. Click 'Start Scan'. You should now see one or more requests in the 'Active Scan' tab.

1. Select all of the requests in the 'Active Scan' tab, eg by clicking the first, then clicking the last with the shift key pressed.
1. Right click and select 'Add to Zest Script -> New Zest Script...'
1. Give the script a suitable title and 'Save'. You should now see the new script in the 'Scripts' tab and the 'Script Console' tab.

1. Right click the top panel in the 'Script Console' tab and select 'Select All'.
1. Right click again and select 'Copy'.

You can now paste this script into an issue, email, ZAP group post etc.

If the script contains sensitive information then prior to performing 'Select All':

1. Find the relevant strings in the Zest requests or responses
1. Highlight them
1. Right click and select 'Redact text...'
1. Press 'Save'. If you leave the default 'Apply to all current requests' box checked then you will only need to do this once per string.

---

[Back to the FAQ](FAQtoplevel)