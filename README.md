# Zebra
A schedule launcher to get the XML files from Japan Meteorological Agency.

## Overview
It's a Web application to get the XML files from JMA([Japan Meteorological Agency](https://www.jma.go.jp/jma/indexe.html)) by its [Atom feeds](http://xml.kishou.go.jp/xmlpull.html).

## Content
- source : APP Server by Jetty-plugin.

## How to build.
use Maven.
```sh
$ cd PathToThisREADME.md
$ cd source
$ mvn install
```

## How to run.
use Jetty-plugin via Maven.
```sh
$ cd PathToThisREADME.md
$ cd source/webapp
$ mvn jetty:run
```
the xml files to the directory below.
```sh
./var/www/html/zebra/
```

## License
It's released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).