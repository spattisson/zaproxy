<div>
<h2>How To Build/Run/Debug ZAP and zap-extensions with IntelliJ</h2>
<div class="outline-text-4" id="text-5-1-1">
<ol>
<li>Get zaproxy &amp; zap-extensions source code 
<ul>
<li>First of all, keep zaproxy, zap-extensions and other ZAP's modules under the same top directory.
<div>
<pre>
mkdir zap-project 
cd zap-project
git clone https://github.com/zaproxy/zaproxy.git
git clone https://github.com/zaproxy/zap-extensions.git
</pre>
</div>
</li>
</ul>
</li>
<li>Import Project to IntelliJ
<ul>
<li>Import zaproxy 
<ul>
<li><code>File -&gt; New -&gt; Project From Existing Source..</code>
</li>
<li>Select <code>.project</code> file which is into zaproxy directory and hit next.
</li>
<li>Check <code>Create Modules files near classpath files</code>
</li>
<li>Add all the libraries that were found
</li>
<li>Include all the modules that were found
</li>
<li>Use JDK 1.8 as the project SDK
</li>
<li>Use the web framework if you're prompted for it
</li>
</ul>
</li>
<li>Import zap-extensions &amp; other modules
<ul>
<li>Open project structure (<code>File -&gt; Project Structure...</code>).
</li>
<li>Select <code>Modules</code> and hit <code>Add Module</code>.
</li>
<li>Import the module you want as before. 
</li>
</ul>
</li>
</ul>
</li>
<li>Configure Output Building Paths 
<ul class="org-ul">
<li>Open <code>Project Structure</code> and select <code>Modules</code> Tab
</li>
<li>Select <code>zaproxy</code> module and go to <code>Paths</code> tab.
<ul>
<li>Select <code>Use Module Compile Output Path</code>
</li>
<li>Output path: <code>zap-project/zaproxy/build</code>
</li>
</ul>
</li>
<li>Select <code>zap-extensions</code> module and go to <code>Paths</code> tab.
<ul>
<li>Select <code>Use Module Compile Output Path</code>
</li>
<li>Output path: <code>zap-project/zap-extensions/build</code>
</li>
</ul>
</li>
<li>Repeat that for every module you got, using the appropriate compile output path.
</li>
</ul>
</li>
<li>Build Project with Ant 
<ul class="org-ul">
<li>Open <code>Ant Build Tool Window</code>
</li>
<li>Add the Ant build files (<code>build.xml</code>)
<ul>
<li>For zaproxy: <code>zap-project/zaproxy/build/build.xml</code>
</li>
<li>For zap-extensions: <code>zap-project/zap-extensions/build/build.xml</code>
</li>
</ul>
</li>
<li>Run tasks from <code>Ant Build Tool Window</code>
</li>
</ul>
</li>
<li>Run/Debug configuration for zaproxy 
<ul class="org-ul">
<li>Open <code>Run/Debug Configuration</code>
<ul class="org-ul">
<li>Add to Main Class: <code>org.zaproxy.zap.ZAP</code>
</li>
<li>Working Directory: <code>zap-project/zaproxy</code>
</li>
<li>Use class path of module: <code>zaproxy</code>
</li>
</ul>
</li>
</ul>
</li>
<li>Run/Debug add-ons
<ul>
<li>Open <code>Run/Debug Configuration</code> for zaproxy
<ul>
<li>Add the specific add-on's Ant task in the <code>before launch</code> panel
</li>
</ul>
</li>
</ul>
</li>
</ol>
</div>
</div>
</div>
