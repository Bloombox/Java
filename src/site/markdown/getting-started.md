
## Getting started with Bloombox in Java

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

Of course, you are also welcome to download and build yourself (for this topic, see below, in _Building the code_).
When you are ready to use the client, in your app, simply acquire a client instance (with your desired settings), and
begin using services:

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

Building the code is easy. Both Gradle and Maven are supported, and follow standard conventions, i.e.
`mvn clean package install` / `gradle build install`. If you're developing on the code, you'll use `make`.

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

#### Shop reference docs

Shop API access is provided through [ShopClient](https://bloombox.github.io/Java/client/java-client/bloombox.client.services.shop/-shop-client/index.html).
Take a look at the API docs via Dokka to learn more.

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

#### Telemetry reference docs

Telemetry API access is provided through [TelemetryClient](https://bloombox.github.io/Java/client/java-client/bloombox.client.services.telemetry/-telemetry-client/index.html).
Take a look at the API docs via Dokka to learn more.

### Tooling nodes

#### Debug mode

Setting the `enableLogging` property to `true` in your `Bloombox.Settings` object will enable a bunch of logging to
stdout (by default), via the standard Java logging interface. If you install a default adapter via Log4j2 or another
mechanism, it should work fine and begin receiving logs from the `Bloombox` object and it's child service objects.


### Client Lifecycle

Keep in mind that any services initialized via the Java client stay alive for the lifetime of the outer API client
object. This is to say, connections and other resources are kept around while the `client` variable above is.

It's best to use the client in a singleton pattern, and that exercise is left to the user and their application-level
architecture. Inside Bloombox, the library is either loaded statically or injected via Guice/Dagger.

#### Closing Down

When you're ready to get rid of an API client, simply call `close()`. There are additional parameters to the method that
enable soft shutdown, blocking/non-blocking shutdown, and an optional await timeout.

The API client is also compatible with `Closeable` and `AutoCloseable`, so you can do stuff like this:
