# Bloombox for Java

![Build Status](https://travis-ci.org/Bloombox/Java.svg?branch=master) ![Maven Central](https://img.shields.io/maven-central/v/io.bloombox/java-client.svg) ![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg) ![Codacy Badge](https://api.codacy.com/project/badge/Grade/e76289cfda1c44deb7fed137f504e164) ![Test Coverage](https://api.codeclimate.com/v1/badges/97f47bd5c867f368414a/test_coverage)

This Java project and resulting JAR provide Java clients API access to the [Bloombox](https://bloombox.io) platform.
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
```gradle
  compile 'io.bloombox:java-client:1.0'
```

Then, in your app, simply create a client (with your desired settings), and begin using services:

Java:

```java
  final Bloombox client = new Bloombox(
    Bloombox.Settings.defaults("[your-api-key]", "[your-partner-id]", "[your-location-id]"))
```

Kotlin:
```kotlin
  val client = Bloombox(
        settings = Bloombox.Settings(
              apiKey = "[your-api-key]",
              partner = "[your-partner-id]",
              location = "[your-location-id]"))
```


### Building the code

Building the code is easy and follows standard Maven conventions, i.e. `mvn clean package install`.
If you're developing on the code, you'll use `make`.

#### Required tools:

- `java` (Oracle or OpenJDK 8)
- `maven` or `gradle`


## Services

After you've setup the SDK and client object, you can access a given service via a top-level function named after the
service. For instance, the Shop API is available at `client.shop()`.

The object handed back by this method call is structured with callable methods for each API call available for the given
service. Below you'll find some samples.


### Shop API

The Shop API is what powers online ordering services with Bloombox. It enables features for **managing and operating an
integrated digital storefront**, with user signup, login, support for hours, zipcode verification, and full on pickup or
delivery ordering orchestration.

#### Getting hours info

Each Bloombox digital storefront maintains a set of hours that the user can control. Using the *info()* method, an
integrating system can check to see the current status of the storefront, according to those hours:

###### Java
```java
  // with our client object, obtain shop info synchronously
  final ShopInfo.Response infoResponse = client.shop().info();
  if (infoResponse.getStatus() == ShopStatus.OPEN) System.out.println("The shop is OPEN.");
```

###### Kotlin
```kotlin
  // with our client object, obtain shop info synchronously
  val info = client.shop().info()
  if (info.getStatus() == ShopStatus.OPEN) print("The shop is OPEN.")
```

#### Enumerated shop statuses

According to the current set of _regular hours_ (recurring hours rules that apply everyday, on weekdays, weekends, or
specific days of the week), and _special hours_ (hours for specific dates, like _New Year's Day_ or _Thanksgiving_), a
digital storefront may take on the following statuses:

##### Shop statuses
- `OPEN`: The storefront is open for any and all configured order types.
- `DELIVERY_ONLY`: The storefront is currently open only for delivery orders.
- `PICKUP_ONLY`: The storefront is currently open only for pickup orders.
- `CLOSED`: The storefront is currently closed and not accepting orders of any type.

When an order is submitted to a shop that is `CLOSED` (or a `PICKUP` order is submitted during `DELIVERY_ONLY`, or a
`DELIVERY` order is submitted during `PICKUP_ONLY`), Bloombox will reject the order with an error.

### Telemetry API

Using the Telemetry system, developers can send telemetry event data to Bloombox. This allows events from in-house
systems to be considered during event analysis. Developers can also send their own events for later ad-hoc querying
using the *Generic Events* service:

###### Java
```java
// make an event payload map...
final HashMap<String, Value> eventMap = new HashMap<>();
eventMap.put("some-key", Value.newBuilder().setStringValue("string-value").build());

client.telemetry().event("[event-collection-name]", eventMap);
```

###### Kotlin
```kotlin
client.telemetry().event(
   collection = "[event-collection-name]",
   context = TelemetryClient.EventContext(
         partner = "[partner-code]",
         location = "[location-key]"),
   payload = hashMapOf(
         Pair("some-key", Value.newBuilder().setStringValue("string-value").build()),
         Pair("subobject-key", Value.newBuilder().setStructValue(Struct.newBuilder()
               .putFields("number-key", Value.newBuilder().setNumberValue(id).build())).build())))
```

### Tooling nodes

#### Debug mode

Setting the `enableLogging` property to `true` in your `Bloombox.Settings` object will enable a bunch of logging to
stdout (by default), via the standard Java logging interface. If you install a default adapter via Log4j2 or another
mechanism, it should work fine and begin receiving logs from the `Bloombox` object and it's child service objects.


### Development tools:

This is an open source codebase. If you'd like to file a PR or just get it building, here's how you do that:

- `git clone [...] && cd [project root]`
- `git submodule update --init --remote`
- `make`


## Licensing

Copyright © 2018 Bloombox, LLC.

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
