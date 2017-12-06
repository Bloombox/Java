
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
