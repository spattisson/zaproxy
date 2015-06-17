Not sure how to start using ZAP? Read the [Getting Started Guide](http://sourceforge.net/projects/zaproxy/files/docs/ZAPGettingStartedGuide.pdf/download) (pdf download link).

You can check the file hashes of any of the downloads via Sourceforge: https://sourceforge.net/projects/zaproxy/files/

### ZAP 2.4.0 Standard

<table width='80%'>
<tr>
<td width='5%'></td><td width='30%'>Windows</td><td width='15%'>2015-04-15</td><td width='15%'>73.3 MB</td><td><a href='http://sourceforge.net/projects/zaproxy/files/2.4.0/ZAP_2.4.0_Windows.exe/download'>Download now</a></td>
</tr>
<tr>
<td width='5%'></td><td width='30%'>Linux / cross platform</td><td width='15%'>2015-04-15</td><td width='15%'>79.5 MB</td><td><a href='http://sourceforge.net/projects/zaproxy/files/2.4.0/ZAP_2.4.0_Linux.tar.gz/download'>Download now</a></td>
</tr>
<tr>
<td width='5%'></td><td width='30%'>Mac OS/X</td><td width='15%'>2015-04-15</td><td width='15%'>117.8 MB</td><td><a href='http://sourceforge.net/projects/zaproxy/files/2.4.0/ZAP_2.4.0_Mac_OS_X.dmg/download'>Download now</a></td>
</tr>
</table>

_This contains the core set of functionality, and you can add more functionality at any time via the ZAP Marketplace._<br>
The Windows and Linux versions require Java 7 to run.<br>
The Mac OS version includes Java 7 - you can use the 'Linux / cross platform' version if you do not want to download this.<br>
For more information about this release see the <a href='https://github.com/zaproxy/zaproxy/wiki/HelpReleases2_4_0'>release notes</a>.<br>
<br>
<h3>ZAP 2.4.0 Core</h3>

<table width='80%'>
<tr>
<td width='5%'></td><td width='30%'>Cross platform</td><td width='15%'>2015-04-15</td><td width='15%'>42.4 MB</td><td><a href='http://sourceforge.net/projects/zaproxy/files/2.4.0/ZAP_2.4.0_Core.tar.gz/download'>Download now</a></td>
</tr>
</table>

<i>This contains the minimal set of functionality to get you started and is ideal for people new to ZAP.</i><br>
You can add more functionality at any time via the ZAP Marketplace.<br>
It is cross platform (Windows, Linux and Mac OS X) but does not include any installers.<br>
It requires Java 7 to run<br>
<br>
<h3>Docker</h3>

There are 2 Docker images available:<br>
<ul><li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-stable/'>zap2docker-stable</a> : the 2.4.0 release<br>
</li><li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-weekly/'>zap2docker-weekly</a> : the latest weekly release</li></ul>

See <a href='Docker'>Docker</a> for more details.<br>
<br>
<h3>Homebrew Cask</h3>
On Mac OS X you can also install ZAP using <a href='http://caskroom.io/'>Homebrew Cask</a>:<br>
<pre><code>brew cask install owasp-zap<br>
</code></pre>

<h3>ZAP Weekly</h3>

<table width='80%'>
<tr>
<td width='5%'></td><td width='30%'>Weekly - cross platform</td><td width='15%'>2015-06-15</td><td width='15%'>93.4 MB</td><td><a href='http://sourceforge.net/projects/zaproxy/files/weekly/ZAP_WEEKLY_D-2015-06-15.zip/download'>Download now</a></td>
</tr>
</table>

<i>We generate weekly releases of ZAP from the trunk, typically every Monday.</i><br>
These are just intended for people who want to use all of the features we've added since the last 'full' release but dont want the hassle of building ZAP from the source code.<br>
While we endeavor to ensure that weekly releases are robust, things may be broken or only partially implemented.<br>
It is cross platform (Windows, Linux and Mac OS but does not include any installers.<br>
It requires Java 7 to run<br>

<h3>ZAP Workspace</h3>
You can now import ZAP projects into Eclipse using just one URL.

See the [Building](Building) page for details about this and information about other IDEs.