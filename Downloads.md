Not sure how to start using ZAP? Read the [Getting Started Guide](https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAPGettingStartedGuide-2.8.pdf) (pdf).

Checksums for all of the ZAP downloads are maintained on the [2.8.0 Release Page](https://github.com/zaproxy/zaproxy/releases/tag/v2.8.0) and in the relevant [version files](https://github.com/zaproxy/zaproxy/wiki/Downloads#latest-versions).

_As with all software we strongly recommend that ZAP is only installed and used on operating systems and JREs that are fully patched and actively maintained._

### ZAP 2.8.0 Standard

<table width='80%'>
<tr>
<td width='30%'>Windows (64) Installer</td><td width='15%'>2019-06-07</td><td width='15%'>176 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAP_2_8_0_windows.exe'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Windows (32) Installer</td><td width='15%'>2019-06-07</td><td width='15%'>75 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAP_2_8_0_windows-x32.exe'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Linux Installer</td><td width='15%'>2019-06-07</td><td width='15%'>135 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAP_2_8_0_unix.sh'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Linux Package</td><td width='15%'>2019-08-26</td><td width='15%'>133 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.1/ZAP_2.8.1_Linux.tar.gz'>Download now</a></td>
</tr>
<tr>
<td width='30%'>MacOS Installer</td><td width='15%'>2019-06-07</td><td width='15%'>173 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAP_2.8.0.dmg'>Download now</a></td>
</tr>
<tr>
<td width='30%'>Cross Platform Package</td><td width='15%'>2019-06-07</td><td width='15%'>321 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAP_2.8.0_Crossplatform.zip'>Download now</a></td>
</tr>

</table>

_This contains the core set of functionality, and you can add more functionality at any time via the ZAP Marketplace._<br>
The Windows and Linux versions require Java 8 or higher to run.<br>
The installers are built using a <a href='https://www.ej-technologies.com/products/install4j/overview.html'>multi-platform installer builder</a>.<br>
The MacOS version includes Java 8 - you can use the Linux or Cross Platform versions if you do not want to download this.<br>
For more information about this release see the <a href='https://github.com/zaproxy/zap-core-help/wiki/HelpReleases2_8_0'>release notes</a>.<br>
The Linux Package is actually [2.8.1](https://github.com/zaproxy/zaproxy/releases/tag/v2.8.1) which was released to fix an [issue](https://github.com/zaproxy/zaproxy/issues/5526) that is known to affect Kali - some other Linux distributions may also be affected.
<br>
<h3>ZAP 2.8.0 Core</h3>

<table width='80%'>
<tr>
<td width='30%'>Cross platform</td><td width='15%'>2019-06-07</td><td width='15%'>34.3 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/v2.8.0/ZAP_2.8.0_Core.zip'>Download now</a></td>
</tr>
</table>

<i>This contains the minimal set of functionality to get you started and is ideal for people new to ZAP.</i><br>
You can add more functionality at any time via the ZAP Marketplace.<br>
It is cross platform (Mac OS X, Linux, and Windows) but does not include any installers.<br>
It requires Java 8 or higher to run.<br>
<br>
<h3>Docker</h3>

There are 4 Docker images available:<br>
<ul>
<li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-stable/'>zap2docker-stable</a> : full 2.8.0 release</li>
<li><a href='https://hub.docker.com/r/owasp/zap2docker-bare/'>zap2docker-bare</a> : minimal 2.8.0 release - ideal for CI environments</li>
<li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-weekly/'>zap2docker-weekly</a> : the latest weekly release</li>
<li><a href='https://registry.hub.docker.com/u/owasp/zap2docker-live/'>zap2docker-live</a> : the very latest source code</li>
</ul>

See <a href='Docker'>Docker</a> for more details.<br>
<br>
<h3>Linux Repos</h3>
We now also have <a href='https://software.opensuse.org/download.html?project=home%3Acabelo&package=owasp-zap'>official ZAP Linux Repos</a> :)<br>
<br>
<h3>Homebrew Cask</h3>
On Mac OS X you can also install ZAP using <a href='https://brew.sh/'>Homebrew Cask</a>:<br>
<pre><code>brew cask install owasp-zap</code></pre>

<h3>Snapcraft</h3>
On Linux systems you can also use <a href="https://snapcraft.io/zaproxy">Snapcraft</a>.<br>
The latest version of ZAP is now on the stable channel, so you can install it using:<br>
<pre><code>snap install zaproxy --classic</code></pre>
You'll then be able to run ZAP using <pre><code>zaproxy</code></pre>

<h3>Flathub</h3>
On Linux systems you can also use <a href="https://flathub.org/apps/details/org.zaproxy.ZAP">Flathub</a>.<br>
You can install the latest version of ZAP using:<br>
<pre><code>flatpak install flathub org.zaproxy.ZAP</code></pre>
You'll then be able to run ZAP using <pre><code>flatpak run org.zaproxy.ZAP</code></pre>

<a name="weekly"></a>
<h3>ZAP Weekly</h3>

<table width='80%'>
<tr>
<td width='30%'>Weekly - cross platform</td><td width='15%'>2019-10-14</td><td width='15%'>106 MB</td><td><a href='https://github.com/zaproxy/zaproxy/releases/download/w2019-10-14/ZAP_WEEKLY_D-2019-10-14.zip'>Download now</a></td>
</tr>
</table>

<i>We generate weekly releases of ZAP from the `develop` branch, typically every Monday.</i><br>
These are just intended for people who want to use all of the features we've added since the last 'full' release but don't want the hassle of building ZAP from the source code.<br>
While we endeavor to ensure that weekly releases are robust, things may be broken or only partially implemented.<br>
It is cross platform (Windows, Linux and Mac OS) but does not include any installers.<br>
It requires Java 8 or higher to run.<br>

<h3>Latest Versions</h3>

We maintain a page containing XML with links to the latest ZAP release files: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZapVersions.xml<br>
You can use this to automatically pull down the latest ZAP release for the platform you need.

ZAP uses similar URLs when checking for updates.<br>
These are version specific and define the add-on on the ZAP Marketplace for that release stream.<br>
The 2.8 release stream uses: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZapVersions-2.8.xml<br>
The development code uses: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZapVersions-dev.xml<br>
At the moment these files are the same, but it does allow us to maintain different versions of add-ons for different versions of ZAP, if we need to support this in the future.
