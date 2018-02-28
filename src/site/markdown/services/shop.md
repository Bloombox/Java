
## Shop API for Java

The Shop API is what powers online ordering services with Bloombox. It enables features for **managing and operating an
integrated digital storefront**, with user signup, login, support for hours, zipcode verification, and full on pickup or
delivery ordering orchestration.


### Getting hours info

Each Bloombox digital storefront maintains a set of hours that the user can control. Using the *info()* method, an
integrating system can check to see the current status of the storefront, according to those hours:

##### Java
```java
  // with our client object, obtain shop info synchronously
  final ShopInfo.Response infoResponse = client.shop().info();
  if (infoResponse.getStatus() == ShopStatus.OPEN) System.out.println("The shop is OPEN.");
```

##### Kotlin
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


### Checking zipcodes

Coming soon.


### Verifying members

Coming soon.


### Enrolling members

Coming soon.


### Submitting orders

Coming soon.
