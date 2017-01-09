Not sure how to start using ZAP? Read the [Getting Started Guide](https://github.com/zaproxy/zaproxy/releases/download/2.5.0/ZAPGettingStartedGuide-2.5.pdf) (pdf).

_As with all software we strongly recommend that ZAP is only installed and used on operating systems and JREs that are fully patched and actively maintained._

### ZAP 2.5.0 Standard

<table width='80%'>
<tr>
<td width='30%'>Windows</td><td width='15%'>2016-06-03</td><td width='15%'>71.8 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/2.5.0/ZAP_2.5.0_Windows.exe'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Linux</td><td width='15%'>2016-06-03</td><td width='15%'>75.8 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/2.5.0/ZAP_2.5.0_Linux.tar.gz'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Mac OS/X</td><td width='15%'>2016-06-03</td><td width='15%'>124 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/2.5.0/ZAP_2.5.0_Mac_OS_X.dmg'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Cross platform</td><td width='15%'>2016-06-03</td><td width='15%'>75.9 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/2.5.0/ZAP_2.5.0_Cross_Platform.zip'>Download now</a></td>
</tr>

</table>

_This contains the core set of functionality, and you can add more functionality at any time via the ZAP Marketplace._<br>
The Windows and Linux versions require Java 7 or higher to run.<br>
The Cross Platform version is the same as the Linux version but compressed using ZIP.<br>
The Mac OS version includes Java 8 - you can use the Linux or Cross Platform versions if you do not want to download this.<br>
For more information about this release see the <a href='https://github.com/zaproxy/zap-core-help/wiki/HelpReleases2_5_0'>release notes</a>.<br>
<br>
<h3>ZAP 2.5.0 Core</h3>

<table width='80%'>
<tr>
<td width='30%'>Cross platform</td><td width='15%'>2016-06-03</td><td width='15%'>42.2 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/2.5.0/ZAP_2.5.0_Core.tar.gz'>Download now</a></td>
</tr>
</table>

<i>This contains the minimal set of functionality to get you started and is ideal for people new to ZAP.</i><br>
You can add more functionality at any time via the ZAP Marketplace.<br>
It is cross platform (Windows, Linux and Mac OS X) but does not include any installers.<br>
It requires Java 7 or higher to run.<br>
<br>
<h3>Docker</h3>

There are 2 Docker images available:<br>
<ul><li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-stable/'>zap2docker-stable</a> : the 2.5.0 release<br>
</li><li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-weekly/'>zap2docker-weekly</a> : the latest weekly release</li></ul>

See <a href='Docker'>Docker</a> for more details.<br>
<br>
<h3>Linux Repos</h3>
We now also have <a href='https://software.opensuse.org/download.html?project=home%3Acabelo&package=owasp-zap'>official ZAP Linux Repos</a> :)<br>
<br>
<h3>Homebrew Cask</h3>
On Mac OS X you can also install ZAP using <a href='http://caskroom.io/'>Homebrew Cask</a>:<br>
<pre><code>brew cask install owasp-zap<br>
</code></pre>

<h3>ZAP Weekly</h3>

<table width='80%'>
<tr>
<td width='30%'>Weekly - cross platform</td><td width='15%'>2017-01-09</td><td width='15%'>80.4 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/w2017-01-09/ZAP_WEEKLY_D-2017-01-09.zip'>Download now</a></td>
</tr>
</table>

<i>We generate weekly releases of ZAP from the `develop` branch, typically every Monday.</i><br>
These are just intended for people who want to use all of the features we've added since the last 'full' release but dont want the hassle of building ZAP from the source code.<br>
While we endeavor to ensure that weekly releases are robust, things may be broken or only partially implemented.<br>
It is cross platform (Windows, Linux and Mac OS but does not include any installers.<br>
It requires Java 7 or higher to run.<br>

<h3>Latest Versions</h3>
We maintain a page containing XML with links to the latest ZAP release files: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZapVersions.xml<br>
You can use this to automatically pull down the latest ZAP release for the platform you need.

ZAP uses similar URLs when checking for updates.<br>
These are version specific and define the add-on on the ZAP Marketplace for that release stream.<br>
The 2.5 release stream uses: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZapVersions-2.5.xml<br>
The development code uses: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZapVersions-dev.xml<br>
At the moment these files are the same, but it does allow us to maintain different versions of add-ons for different versions of ZAP, if we need to support this in the future.

<h3>ZAP Workspace</h3>
You can now import ZAP projects into Eclipse using just one URL.

See the [Building](Building) page for details about this and information about other IDEs.