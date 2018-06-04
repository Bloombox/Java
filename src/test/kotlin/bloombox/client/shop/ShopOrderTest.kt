/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bloombox.client.shop

import bloombox.client.services.shop.ShopClient
import bloombox.client.test.ClientRPCTest
import io.opencannabis.schema.base.BaseProductKey.ProductKey
import io.opencannabis.schema.base.BaseProductKind.ProductKind
import io.opencannabis.schema.commerce.CommercialOrder
import io.opencannabis.schema.commerce.OrderCustomer
import io.opencannabis.schema.commerce.OrderDelivery
import io.opencannabis.schema.commerce.OrderItem
import io.opencannabis.schema.contact.GenericContact.ContactInfo
import io.opencannabis.schema.contact.ContactEmail.EmailAddress
import io.opencannabis.schema.contact.ContactPhone.PhoneNumber
import io.opencannabis.schema.geo.Address
import io.opencannabis.schema.person.Name
import io.opencannabis.schema.person.Person
import io.opencannabis.schema.temporal.TemporalInstant.Instant
import io.bloombox.schema.services.shop.v1.SubmitOrder
import io.opencannabis.schema.product.struct.PricingWeightTier
import org.junit.Test as test


/**
 * Tests related to orders.
 */
class ShopOrderTest: ClientRPCTest() {
  companion object {
    /**
     * Known-good order ID.
     */
    private const val knownOrderId = "abc123"
  }

  /**
   * Test an order submission operation.
   */
  @Suppress("unused")
  private fun testOrderSubmit(client: ShopClient,
                              order: CommercialOrder.Order? = null): SubmitOrder.Response {
    val now = java.time.Instant.now()

    val orderObj = order ?: CommercialOrder.Order.newBuilder()

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
                      .setType(ProductKind.FLOWERS))

                .setCount(1)

                .addVariant(OrderItem.VariantSpec.newBuilder()
                      .setVariant(OrderItem.ProductVariant.WEIGHT)
                      .setWeight(PricingWeightTier.EIGHTH)))

          .addItem(OrderItem.Item.newBuilder()
                .setKey(ProductKey.newBuilder()
                      .setId("-Ke1AGB-CUApxLHqi-9X")
                      .setType(ProductKind.FLOWERS))

                .setCount(1)

                .addVariant(OrderItem.VariantSpec.newBuilder()
                      .setVariant(OrderItem.ProductVariant.WEIGHT)
                      .setWeight(PricingWeightTier.EIGHTH))).build()

    return client.submitOrder(orderObj)
  }

//  @test
//  fun testFetchKnownOrder() {
//    withClient({ client ->
//      // fetch a known-good order ID
//      val response = client.platform.shop().getOrder(knownOrderId)
//      assertNotNull(response, "response from server for known-good order fetch should not be null")
//      assertTrue(response.success, "response from server for known-good order fetch should be successful")
//      assertNotNull(response.order, "response from server for known-good order should contain order")
//      assertEquals(response.order.id, knownOrderId, "response from server for known-good order should match requested ID")
//    })
//  }

//  @test
//  fun testFetchKnownOrderAsync() {
//    withClient({ client ->
//      // fetch a known-good order ID
//      val operation = client.platform.shop().getOrder(knownOrderId, { response ->
//        assertNotNull(response, "response from server for known-good order fetch should not be null")
//        assertTrue(response.success, "response from server for known-good order fetch should be successful")
//        assertNotNull(response.order, "response from server for known-good order should contain order")
//        assertEquals(response.order.id, knownOrderId, "response from server for known-good order should match requested ID")
//      }, { err ->
//        logging.severe("Severe error fetching order: $err")
//      })
//
//      // make sure it executes, with a 10-second timeout
//      operation.get(10, TimeUnit.SECONDS)
//    })
//  }

//  @test(expected = ClientException::class)
//  fun testFetchOrderNotFound() {
//    withClient({ client ->
//      // fetch a known-good order ID
//      val response = client.platform.shop().getOrder("blablablanotfound")
//      assertNotNull(response, "response from server for known-not-found order fetch should not be null")
//      assertTrue(!response.success, "response from server for known-good order fetch should be unsuccessful")
//    })
//  }

//  @test(expected = ClientException::class)
//  fun testFetchOrderNotFoundAsync() {
//    withClient({ client ->
//      // fetch a known-good order ID
//      val operation = client.platform.shop().getOrder("blablablanotfound", { response ->
//        assertNotNull(response, "response from server for known-not-found order fetch should not be null")
//        assertTrue(!response.success, "response from server for known-good order fetch should be unsuccessful")
//      }, { err ->
//        logging.severe("Severe error fetching order: $err")
//      })
//
//      // make sure it executes, with a 10-second timeout
//      operation.get(10, TimeUnit.SECONDS)
//    })
//  }
}
