# Database

## Introduction
ZAProxy uses [HSQLDB](http://hsqldb.org/) to store its session data. For those who do not know HSQLDB - you can use it like SQLite. You just open an existing - or non-existing - database file and can start to create tables, insert data, etc.
ZAP includes HSQLDB version 1.8.0. The current trunk by 20th of August already contains version 2.2.9.


## Details

There is a template database under `src/db`, that is named _zapdb_. When ZAP is opened it creates a new database from this _zapdb_ template e.g.: under `~/.ZAP/session/` for Linux and names it _untitled1_ or _untitled2_, etc. if it was already created during the current session.

In the `org.parosproxy.paros.db.Database` class, all _`Table*`_ instances are added as database listener. The _`Table*`_ classes itself have to extend _`AbstractTable`_ and often create new columns or even tables when a new connection is set up.


## Inspect Database

You can use [SQL Workbench](http://www.sql-workbench.net/downloads.html), which is free software, to open HSQLDB database files. This is not possible if it is currently in use by ZAProxy.

Set the hsqldb.jar under _Manage Drivers_ first, before connecting:
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/sql-workbench1.jpeg' width='600' />


View database structure & data and change it:
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/sql-workbench2.jpeg' width='600' />


## Upgrading
The upgrade to version 2.2.9 was done due to better transaction support, full support for the powerful MERGE command, real BLOB & CLOB support and many more features.


There is also an open [Issue 321](https://github.com/zaproxy/zaproxy/issues/321) to support more than one database.