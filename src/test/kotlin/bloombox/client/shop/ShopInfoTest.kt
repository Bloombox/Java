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

import bloombox.client.Bloombox
import bloombox.client.ClientException
import bloombox.client.services.shop.ShopClient
import bloombox.client.test.ClientRPCTest
import java.util.concurrent.TimeUnit
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.Test as test


/**
 * Test shop info methods like zipcheck and regular info, which returns basic
 * store metadata and open/closed status.
 */
class ShopInfoTest: ClientRPCTest() {
  companion object {
    /**
     * Partner ID to test hours with.
     */
    private const val partnerID = "caliva"

    /**
     * Location ID to test hours with.
     */
    private const val locationID = "sjc"
  }

  /**
   * Test fetching shop hours.
   */
  @test
  fun testShopHours() {
    withClient { client ->
      val response = client.platform.shop().info(
            ShopClient.ShopContext(
                  partner = partnerID,
                  location = locationID))

      assertNotNull(response, "response from server for hours should not be null")
      assertNotNull(response.shopStatus, "response from server should specify shop status")
    }
  }

  /**
   * Test fetching shop hours asynchronously.
   */
  @test
  fun testShopHoursAsync() {
    withClient { client ->
      val operation = client.platform.shop().info({ response ->
        assertNotNull(response, "response from server for hours should not be null")
        assertNotNull(response.shopStatus, "response from server should specify shop status")
      }, { err ->
        logging.severe("Severe error fetching order: $err")
      }, ShopClient.ShopContext(partner = partnerID, location = locationID))

      // make sure it executes, with a 10-second timeout
      operation.get(10, TimeUnit.SECONDS)
    }
  }

  /**
   * Test fetching shop hours, but with an invalid partner.
   */
  @test(expected = ClientException::class)
  fun testShopHoursInvalidPartner() {
    // prep a client for prod
    val prodClient = Bloombox(Bloombox.Settings(
          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM"),
          Bloombox.ClientTarget.PRODUCTION)
    try {
      prodClient.shop().info()
    } finally {
      prodClient.close()
    }
  }

  /**
   * Test fetching shop hours, but with an invalid location.
   */
  @test(expected = ClientException::class)
  fun testShopHoursInvalidLocation() {
    // prep a client for prod
    val prodClient = Bloombox(Bloombox.Settings(
          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
          partner = "mm"),
          Bloombox.ClientTarget.PRODUCTION)
    try {
      prodClient.shop().info()
    } finally {
      prodClient.close()
    }
  }

  /**
   * Test a known-good zipcode via zipcheck.
   */
  @test
  fun testZipcheckKnownGood() {
    withClient { client ->
      val responseOne = client.platform.shop().checkZipcode("95120", ShopClient.ShopContext(
            partner = partnerID,
            location = locationID))

      val responseTwo = client.platform.shop().checkZipcode("94404", ShopClient.ShopContext(
            partner = partnerID,
            location = locationID))

      assertNotNull(responseOne, "response from server for zipcheck 1 should not be null")
      assertNotNull(responseTwo, "response from server for zipcheck 2 should not be null")
      assertTrue(responseOne.supported, "response from server for zipcheck 1 should grant access")
      assertTrue(responseTwo.supported, "response from server for zipcheck 2 should grant access")
      assertEquals(responseOne.deliveryMinimum, (50.0).toFloat(), "response should specify correct delivery minimum for zipcheck 1")
      assertEquals(responseTwo.deliveryMinimum, (200.0).toFloat(), "response should specify correct delivery minimum for zipcheck 2")
    }
  }

  /**
   * Test a known-good zipcode via zipcheck, asynchronously.
   */
  @test
  fun testZipcheckKnownGoodAsync() {
    withClient { client ->
      val opOne = client.platform.shop().checkZipcode("95120", { response ->
        assertNotNull(response, "response from server for zipcheck 1 should not be null")
        assertTrue(response.supported, "response from server for zipcheck 1 should grant access")
        assertEquals(response.deliveryMinimum, (50.0).toFloat(), "response should specify correct delivery minimum for zipcheck 1")
      }, { err ->
        logging.severe("Severe error fetching order: $err")
      }, ShopClient.ShopContext(partner = partnerID, location = locationID))

      val opTwo = client.platform.shop().checkZipcode("94404", { response ->
        assertNotNull(response, "response from server for zipcheck 2 should not be null")
        assertTrue(response.supported, "response from server for zipcheck 2 should grant access")
        assertEquals(response.deliveryMinimum, (200.0).toFloat(), "response should specify correct delivery minimum for zipcheck 2")
      }, { err ->
        logging.severe("Severe error fetching order: $err")
      }, ShopClient.ShopContext(partner = partnerID, location = locationID))

      // make sure both ops execute, with a 5-second timeout each
      opOne.get(5, TimeUnit.SECONDS)
      opTwo.get(5, TimeUnit.SECONDS)
    }
  }

  /**
   * Test a known-bad zipcode via zipcheck.
   */
  @test
  fun testZipcheckKnownBad() {
    withClient { client ->
      val responseOne = client.platform.shop().checkZipcode("12345",
            ShopClient.ShopContext(partner = partnerID, location = locationID))

      assertNotNull(responseOne, "response from server for bad zipcheck should not be null")
      assertTrue(!responseOne.supported, "response from server for bad zipcheck should withhold access")
    }
  }

  /**
   * Test a known-bad zipcode via zipcheck.
   */
  @test
  fun testZipcheckKnownBadAsync() {
    withClient { client ->
      val operation = client.platform.shop().checkZipcode("12345", { response ->
        assertNotNull(response, "response from server for bad zipcheck should not be null")
        assertTrue(!response.supported, "response from server for bad zipcheck should withhold access")
      }, { err ->
        logging.severe("Severe error fetching order: $err")
      }, ShopClient.ShopContext(partner = partnerID, location = locationID))

      // make sure it executes, with a 10-second timeout
      operation.get(10, TimeUnit.SECONDS)
    }
  }
}
