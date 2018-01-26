# Bloombox for Java

[![Build Status](https://travis-ci.org/Bloombox/Java.svg?branch=master)](https://travis-ci.org/Bloombox/Java) [![Maven Central](https://img.shields.io/maven-central/v/io.bloombox/java-client.svg)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22io.bloombox%22%20AND%20a%3A%22java-client%22) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/e76289cfda1c44deb7fed137f504e164)](https://www.codacy.com/app/bloombox/Java?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Bloombox/Java&amp;utm_campaign=Badge_Grade) [![Test Coverage](https://api.codeclimate.com/v1/badges/97f47bd5c867f368414a/test_coverage)](https://codeclimate.com/github/Bloombox/Java/test_coverage)

Latest Version: `1.0`

This Maven project and resulting JAR provide Java clients API access to the [Bloombox](https://bloombox.io) platform.
Bloombox APIs are built and served using [gRPC](https://grpc.io) and exposed in client libraries like this one with a
more fluid interface to work with.

That being said, you can always opt to use the lower level gRPC APIs, either via gRPC (docs coming soon) or via JSON
REST, using transcoding (docs coming soon on this too).

In terms of Javaland, this client is built on Kotlin/Java and tested on JDK8. There isn't any particular reason it
wouldn't work in earlier versions of the JDK or JRE, but YMMV as it's tested for now on Open JDK and Oracle JDK 8.


### Using the code

Library JARs, source JARs, and documentation JARs are available via [Maven Central](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22io.bloombox%22%20AND%20a%3A%22java-client%22) and, if you want snapshots or a faster release track, Nexus.

Via Maven:

```xml
  <dependencies>
    <dependency>
      <groupId>io.bloombox</groupId>
      <artifactId>java-client</artifactId>
      <version>1.0</version>
    </dependency>
  </dependencies>
```

Via Gradle:

```
  compile 'io.bloombox:java-client:1.0'
```


### Building the code

Building the code is easy and follows standard Maven conventions, i.e. `mvn clean package install`.
If you're developing on the code, you'll use `make`.

#### Required tools:

- `java` (Oracle or OpenJDK 8)
- `maven`


#### Optional tools:

Steps:

- `git clone [...] && cd [project root]`
- `git submodule update --init --remote`
- `make`


#### Debug mode

Add a note here about debug mode, and how to activate it.


## Services


### Shop API

Demo code coming soon.


### Telemetry API

Demo code coming soon.


## Licensing

Copyright © 2017 Bloombox, LLC.

A copy of the Apache 2.0 license is enclosed at `LICENSE.txt`, along with
additional notices in `NOTICE.txt`.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
