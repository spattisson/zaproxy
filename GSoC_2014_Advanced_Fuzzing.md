# Contents

---



# Introduction

---

This project aims to improve the fuzzing functionality provided by ZAP. A stable version of the current HTTP-multifuzz add-on
will be created and several new features will be added (detailed list below). Beyond that, the same fuzzing options will be
provided in all other add-ons employing fuzzing mechanisms (i.e. plugnhack, SSE and Websockets).

# Project Goals

---

In the course of this project the following new features will be provided:
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/gsoc2014_fuzzing_dialog-sketch.png' align='right' width='500' height='200'>
<ul><li>Development of a stable HTTP - multifuzzing add-on<br>
</li><li>Revised choice and administration of payloads:<br>
<ul><li>Revised UI (see sketch)<br>
</li><li>Use of regular expressions as payloads<br>
</li><li>Inclusion of scripts as payload resources<br>
</li><li>Inclusion of scripts for request manipulation<br>
</li><li>Inclusion of scripts for the detection of changes in response<br>
</li></ul></li><li>New administration / manipulation of fuzzing results based on JBroFuzz-project<br>
<ul><li>Additional user interfaces<br>
</li><li>Grouping of results and summarize category distinctions<br>
</li><li>Graphing results<br>
</li></ul></li><li>Ex- and import of results into external (.csv)-files<br>
</li><li>Documentation of the fuzzing tool and its use</li></ul>


<h1>Timeline and Progress</h1>
<hr />
<!---
|| *Goal* ||  *Status*||
||  || <font color="green"> *Done* </font> ||
||  || <font color="red"> *Delayed* </font> ||
||  || <font color="orange"> *Pending* </font> ||
||  || <font color="blue"> *Scheduled* </font> ||
-->
<br>
This section presents an overview of when the individual features are planned to be implemented.<br>
In addition to the listed steps, a new version of the multi-fuzzing add-on will be released at the end of each week.<br>
Changes to core files will be kept to a minimum and specifically listed in the tables below.<br>
Please note however, that this is not a final schedule and may be subject to changes should new features be added or problems arise.<br>
<br>
<h2>Week 0 (Preparatory phase)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Introduction to community</td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Setup of project wiki page </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Specification of add-on design e.g. UML diagram / flow chart </td><td> <font color='green'> <b>Ongoing</b> </font> </td></tr>
<tr><td>Preparation of current add-on </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 1 (19th May - 23rd May)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Final preparation of HTTP multi-fuzzing add-on </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>1. Shift of files to core </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 2 (26th May - 30th May)</h2>

<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Design and implementation of GUI (similar to sketch)</td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Implementation of search option for request field</td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Reconciliation with HTTP add-on </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>


<h2>Week 3 (2nd June - 6th June)</h2>

<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Implementation of length based fuzzing; <a href='https://github.com/zaproxy/zaproxy/issues/625'>Issue 625</a> </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Implementation of regular expression payloads </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 4 (9th June - 13th June)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Study of usage of scripts in e.g. Active Scan Rules </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Adaptation for fuzzing purposes (request manipulation)</td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Implementation of scripting payloads </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 5 (16th June - 20th June)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Implementation of response inspection by scripts </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Testing / Feedback </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>2. Shift of files to core </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>


<h2>Week 6 (23rd June - 27th June)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Implementation of SSE </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 7 (30th June - 4th July</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Study of JBroFuzz  </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>GUI design for result manipulation </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 8 (7th July - 11th July)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>GUI design for result manipulation </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Implementation of result manipulation </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 9 (14th July - 18th July)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Implementation of result manipulation </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Testing / Feedback </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 10 (21st July - 25th July)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Overall structure of Fuzz results  </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Implementation of ex-/import options </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 11 (28th July - 1st August)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Finalizing fuzz result ex-/import </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Clean up of code base </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>

<h2>Week 12 (4th August- 11th August)</h2>
<table><thead><th> <b>Goal</b> </th><th> <b>Status</b></th></thead><tbody>
<tr><td>Update project documentation </td><td> <font color='green'> <b>Done</b> </font> </td></tr>
<tr><td>Final commit </td><td> <font color='green'> <b>Done</b> </font> </td></tr></tbody></table>


<h1>Documentation</h1>
<hr />
In the course of the project this section will be updated to provide guidance for the use of the features created and point to further documentation.<br>
<br>
The new features that have been implemented so far are:<br>
<h3>New Dialog Layout</h3>
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/gsoc2014_fuzzing_dialog.png' width='500' height='200'>

This dialog is opened by right-clicking on the request to be fuzzed and selecting "Advanced Fuzz...". On the left side, the initial request is displayed and selected targets are marked up. Furthermore, it is possible to search through the request using the search bar underneath. On the right hand side two tabs are defined:<br>
<br><br><i>Targets</i><br>
This tab contains an overview of the defined target sections. To add a new target simply select the appropriate section on the left side and press "Add Fuzz Target". This will automatically open the payload definition dialog (see below). Already defined target sections can be edited by selecting an entry in the table which will open a payload definition dialog for the matching target section.<br>
<br><br><i>General</i><br>
This tab contains the options affecting the entire request that have been included in previous versions of the fuzzing tool.<br>
<br><br>
Once at least one non-empty target section has been defined the fuzzing process can be started using the "Start"-button.<br>
<h3>The Payload Definition Dialog</h3>
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/gsoc2014_payload_dialog.png' width='500' height='200'>

This dialog administrates the payloads inserted for one particular target. On top there is an overview of already defined payloads. Underneath there are four possible ways of adding new payloads:<br>
<br>
<i>1. Single Payloads</i>

Inserting a string in the text field and clicking add will replace the target with that exact string during the fuzz process. No further options need to be selected.<br>
<br>
<i>2. Regular Expressions</i>

This will generate (all) strings matching the particular expression and insert them instead of the target. However, due to the use of a custom generator only a limited number of operators is accessible. Valid expressions can contain:<br>
<br>
<ul><li>literals<br>
</li><li>concatenation and bracketing<br>
</li><li>the union operator '|'<br>
</li><li>'?', '<code>*</code>' and '+' as usual repetition operators<br>
</li><li>[b-c] as a range of possible characters<br>
</li><li>'.', '\w' for any character or letter<br>
</li><li>'\d' for any digit<br>
</li><li>'\s' for any whitespace</li></ul>

To define a regex payload enter the expression in the first field and choose a maximum number of tokens that are in fact generated (if this is set higher than the actual number of matching strings less payloads are created). Click 'Add' and choose a maximum number of signs generated tokens can have.<br>
<br>
<i>3. Fuzz Files</i>

To insert payloads from a pre-defined file choose the appropriate category and file in the drop-down menu and click "add".<br>
<br>
<i>4. Payload Scripts</i>

To generate payloads via a script, a script has to be created and enabled previous to the start of the fuzzing process. Instructions how this can be done are included in the template. Active scripts will be shown in a drop down menu and can be added by selecting the appropriate one and clicking "Add".<br>
<br>
Beyond that, string payloads and payloads from a file can be trimmed to a specific length, by setting the length parameter of the payload to the desired length.<br>
This can also be combined with the recursive fuzzing option which is available for file payloads only. If set, the payloads from this file will be recursively concatenated / trimmed to reach a certain target length (The default value is the length of the target section, but can be overruled by the length field).<br>
<br>
<h3>Result handling</h3>

<i>1. Grouping and Graphical presentation</i>

Once the fuzzing is completed, a list of the results will be shown in the fuzzing tab:<br>
<br>
<br>
Selecting and right-clicking on an entry will allow to change its label or assign it to a new group of results or to an existing one. Groups can be collapsed and expanded in the table at will.<br>
<br>
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/gsoc2014_fuzzing_tab.png' width='800' height='150'>

The "Result Diagram" button opens a new dialog consisting of three components.<br>
On the bottom of that dialog the same table of all fuzzing results is shown. Groups and names that are defined in this dialog will be available after closing it.<br>
Furthermore, the dialog shows the message, corresponding to the currently selected entry, for closer inspection.<br>
Lastly, there is a tabbed panel which contains several different diagrams. The specific diagrams that are available vary with the message type. The data sets which are used to construct these diagrams correspond to the results with a selected "Include"-option.<br>
<br>
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/gsoc2014_result_dialog.png' width='500' height='250'>

<i>2. Result ex-/import</i>

Apart from the Diagrams button, two buttons for the ex- and import of fuzzing results have been created. These save the requests currently contained in the table into a file of your choice and load them at a later point from those files. While the assigned labels for requests are kept, group information is lost in that process.