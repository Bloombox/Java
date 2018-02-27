# Module java-client

This package provides a Java/Kotlin client for Bloombox Cloud services. Integrators have the option of using this (or 
other language SDKs, like [JS](https://bloombox.github.io/JS) or [Swift](https://github.com/bloombox/swift)), or
integration directly with the lower-level [gRPC](https://grpc.io)-based APIs.


# Package bloombox.client

Contains the main API client classes, service client implementations, and so on. This package exposes the actual client
library facade and methods to acquire service instances.

## Acquiring an API client

After installing the library, you can acquire an API client instance with an **API key**, **partner ID** and
**location ID**. These values can be found in your Bloombox Dashboard or you can get them via Bloombox support.

Once you have your details ready, construct a new API client:

#### Java
```java
  final Bloombox client = new Bloombox(
    Bloombox.Settings.defaults("[your-api-key]", "[your-partner-id]", "[your-location-id]"))
```

#### Kotlin
```kotlin
  val client = Bloombox(
        settings = Bloombox.Settings(
              apiKey = "[your-api-key]",
              partner = "[your-partner-id]",
              location = "[your-location-id]"))
```

### Client Lifecycle

Keep in mind that any services initialized via the Java client stay alive for the lifetime of the outer API client
object. This is to say, connections and other resources are kept around while the `client` variable above is.

It's best to use the client in a singleton pattern, and that exercise is left to the user and their application-level
architecture. Inside Bloombox, the library is either loaded statically or injected via Guice/Dagger.

### Closing Down

When you're ready to get rid of an API client, simply call `close()`. There are additional parameters to the method that
enable soft shutdown, blocking/non-blocking shutdown, and an optional await timeout.

The API client is also compatible with `Closeable` and `AutoCloseable`, so you can do stuff like this:

#### Java

Using `close()`:
```java
final Bloombox client = new Bloombox(...);
client.close();
```

Using `Closeable`/`AutoCloseable`:
```java
try(final Bloombox client = new Bloombox(...)) {
  // use your client
} catch (final ClientException exc) {
  // handle critical client errors
}
```

#### Kotlin

Using `close()`:
```kotlin
val client = Bloombox(settings = Bloombox.Settings(...))
client.close()
```

Using `Closeable`/`AutoCloseable`:
```kotlin
Bloombox(settings = Bloombox.Settings(...)).use {
  // perform any work here
}
```

Indeed, this is how the library's own testsuite easily stands up clients and shuts them down after they are no longer in
use (i.e. the lifecycle of an individual unit test terminates).

The API client will automatically keep track of any services initialized during its lifetime, and close them down when
you ask it to do so.


## Talking to Services

To talk to services using the API client, call the function for the appropriate service, which acquires an instance of
the service's implementation. Then, just call methods on that resulting object. Refer to individual service docs for the
particular method interfaces supported by each API.

For instance, with the Shop API:

#### Java

```java
final Bloombox client = new Bloombox(...);
final ShopClient shop = client.shop();
final ShopInfo.Response info = shop.info();
```

#### Kotlin

```kotlin
Bloombox(settings = Bloombox.Settings(...)).use {
  val shopInfo: ShopInfo.Response = it.shop().info();
}
```


# Package bloombox.client.interfaces

Provides basic interfaces, in particular `ServiceClient` and `ClientError`, that are used throughout the SDK.


# Package bloombox.client.services

Contains implementations of each supported API service. At the time of writing, this includes the **Shop API**,
**Menu API**, and **Telemetry API**. Consult individual service docs for particular method interfaces supported by each
API.

#### Shop API

Allows interaction with digital storefront features powered by Bloombox. Validate and enroll shop members, get info
about the storefront (i.e. hours and open/closed status), submit and retrieve commercial orders, and so on.


#### Menu API

Retrieve menu/product catalog data, either in full, or section by section. Also exposes methods for retrieving
individual product data from various perspectives.


#### Telemetry API

Used to emit telemetry data to the Bloombox Telemetry Service, which collects and ingests event data for later analysis.
Using methods in the Telemetry API, developers can add events to user timelines (for attribution with other system data)
or record their own events for later ad-hoc analysis.


# Package bloombox.client.services.shop

Allows interaction with digital storefront features powered by Bloombox. Validate and enroll shop members, get info
about the storefront (i.e. hours and open/closed status), submit and retrieve commercial orders, and so on.


# Package bloombox.client.services.menu

Retrieve menu/product catalog data, either in full, or section by section. Also exposes methods for retrieving
individual product data from various perspectives.


# Package bloombox.client.services.telemetry

Used to emit telemetry data to the Bloombox Telemetry Service, which collects and ingests event data for later analysis.
