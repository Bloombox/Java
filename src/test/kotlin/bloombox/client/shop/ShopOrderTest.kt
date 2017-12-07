/*
 * Copyright 2017, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bloombox.client.shop

import bloombox.client.services.shop.ShopClient
import io.bloombox.schema.base.ProductKey
import io.bloombox.schema.base.ProductKind
import io.bloombox.schema.base.ProductType
import io.bloombox.schema.commerce.CommercialOrder
import io.bloombox.schema.commerce.OrderCustomer
import io.bloombox.schema.commerce.OrderDelivery
import io.bloombox.schema.commerce.OrderItem
import io.bloombox.schema.contact.ContactInfo
import io.bloombox.schema.contact.EmailAddress
import io.bloombox.schema.contact.PhoneNumber
import io.bloombox.schema.geo.Address
import io.bloombox.schema.person.Name
import io.bloombox.schema.person.Person
import io.bloombox.schema.services.shop.SubmitOrder
import io.bloombox.schema.temporal.Instant


/**
 * Tests related to orders.
 */
class ShopOrderTest {
  /**
   * Test an order submission operation.
   */
  private fun testOrderSubmit(client: ShopClient): SubmitOrder.Response {
    val now = java.time.Instant.now()

    val order = CommercialOrder.Order.newBuilder()

          .setCustomer(OrderCustomer.Customer.newBuilder()
                .setPerson(Person.newBuilder()
                      .setName(Name.newBuilder()
                            .setFirstName("James")
                            .setLastName("Clark"))
                      .setContact(ContactInfo.newBuilder()
                            .setEmail(EmailAddress.newBuilder().setAddress("sam@bloombox.io"))
                            .setPhone(PhoneNumber.newBuilder().setE164("+19163419482"))))
                .setForeignId("051578672994819"))

          .setCreatedAt(Instant.newBuilder()
                .setIso8601(now.toString()))

          .setType(CommercialOrder.OrderType.DELIVERY)

          .setScheduling(CommercialOrder.OrderScheduling.newBuilder()
                .setScheduling(CommercialOrder.SchedulingType.ASAP))

          .setDestination(OrderDelivery.DeliveryDestination.newBuilder()
                .setInstructions("Dial #075 to buzz in")
                .setAddress(Address.newBuilder()
                      .setFirstLine("524 K Street")
                      .setSecondLine("Apt #2")
                      .setCity("San Jose")
                      .setState("CA")
                      .setZipcode("95125")))

          .setStatus(CommercialOrder.OrderStatus.PENDING)

          .addItem(OrderItem.Item.newBuilder()
                .setKey(ProductKey.newBuilder()
                      .setId("-Ke0_QF5bpmyos_N6oK7")
                      .setType(ProductType.newBuilder()
                            .setKind(ProductKind.FLOWERS)))

                .setCount(1)

                .addVariant(OrderItem.VariantSpec.newBuilder()
                      .setVariant(OrderItem.ProductVariant.WEIGHT)
                      .setWeight(OrderItem.ProductWeight.EIGHTH)))

          .addItem(OrderItem.Item.newBuilder()
                .setKey(ProductKey.newBuilder()
                      .setId("-Ke1AGB-CUApxLHqi-9X")
                      .setType(ProductType.newBuilder()
                            .setKind(ProductKind.FLOWERS)))

                .setCount(1)

                .addVariant(OrderItem.VariantSpec.newBuilder()
                      .setVariant(OrderItem.ProductVariant.WEIGHT)
                      .setWeight(OrderItem.ProductWeight.EIGHTH))).build()

    return client.submitOrder(order)
  }
}
