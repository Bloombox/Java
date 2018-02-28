
## Telemetry API for Java

Using the Telemetry system, developers can send telemetry event data to Bloombox. This allows events from in-house
systems to be considered during event analysis. Developers can also send their own events for later ad-hoc querying
using the *Generic Events* service:

##### Java
```java
// make an event payload map...
final HashMap<String, Value> eventMap = new HashMap<>();
eventMap.put("some-key", Value.newBuilder().setStringValue("string-value").build());

client.telemetry().event("[event-collection-name]", eventMap);
```

##### Kotlin
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
