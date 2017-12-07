
## Bloombox Client for Java

This Maven project and resulting JAR provide Java clients API access to the [Bloombox](https://bloombox.io) platform.
Bloombox APIs are built and served using [gRPC](https://grpc.io) and exposed in client libraries like this one with a
more fluid interface to work with.

That being said, you can always opt to use the lower level gRPC APIs, either via gRPC (docs coming soon) or via JSON
REST, using transcoding (docs coming soon on this too).

In terms of Javaland, this client is built on Kotlin/Java and tested on JDK8. There isn't any particular reason it
wouldn't work in earlier versions of the JDK or JRE, but YMMV as it's tested for now on JDK8.


### Using the code

Published libs coming soon. In the meantime, see `Building the code`.


### Building the code

Required tools:
- `java` (tested on JDK8)
- `maven`

Optional tools:

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
