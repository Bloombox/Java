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

package bloombox.client.menu

import bloombox.client.ClientException
import bloombox.client.services.menu.MenuClient
import bloombox.client.services.menu.MenuClientError
import bloombox.client.test.ClientRPCTest
import io.grpc.Status
import java.util.concurrent.TimeUnit
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.Test as test


/**
 * Test menu retrieval methods on the Menu API.
 */
class GetMenuTest: ClientRPCTest() {
  companion object {
    /**
     * Partner ID to test the menu with.
     */
    private const val partnerID = "caliva"

    /**
     * Location ID to test the menu with.
     */
    private const val locationID = "sjc"
  }

  /**
   * Test fetching basic menu.
   */
//  @test
//  fun testGetBasicMenu() {
//    withClient { client ->
//      val response = client.platform.menu().retrieve(
//            MenuClient.MenuContext(
//                  partner = partnerID,
//                  location = locationID))
//
//      assertNotNull(response, "response from server for menu should not be null")
//      assertTrue(response.hasCatalog(), "response from server should specify menu data")
//    }
//  }

  /**
   * Test fetching basic menu asynchronously.
   */
//  @test
//  fun testGetBasicMenuAsync() {
//    withClient { client ->
//      val operation = client.platform.menu().retrieve(
//            MenuClient.MenuContext(
//                  partner = partnerID,
//                  location = locationID), false, {
//        // menu response
//        assertNotNull(it, "response from server for menu should not be null")
//        assertTrue(it.hasCatalog(), "response from server should specify menu data")
//      }, {
//        // error callback
//        assertTrue(false, "async menu retrieval failed")
//      })
//
//      operation.get(10000, TimeUnit.SECONDS)
//    }
//  }

  /**
   * Test fetching basic menu with default context.
   */
//  @test
//  fun testGetBasicMenuDefaultContext() {
//    withClient { client ->
//      val response = client.platform.menu().retrieve()
//      assertNotNull(response, "response from server for menu should not be null")
//      assertTrue(response.hasCatalog(), "response from server should specify menu data")
//    }
//  }

  /**
   * Test fetching basic menu, asynchronously, with default context.
   */
//  @test
//  fun testGetBasicMenuDefaultContextAsync() {
//    withClient { client ->
//      val response = client.platform.menu().retrieve()
//      assertNotNull(response, "response from server for menu should not be null")
//      assertTrue(response.hasCatalog(), "response from server should specify menu data")
//    }
//  }

  /**
   * Test fetching basic menu, but with an invalid partner.
   */
//  @test(expected = ClientException::class)
//  fun testGetBasicMenuInvalidPartner() {
//    withClient { client ->
//      try {
//        client.platform.menu().retrieve(
//              MenuClient.MenuContext(
//                    partner = "",
//                    location = locationID))
//      } catch (ce: ClientException) {
//        // make sure it fails for the right reasons
//        assertEquals(Status.INVALID_ARGUMENT, ce.status(), "status should match INVALID_ARGUMENT")
//        assertEquals(MenuClientError.PARTNER_INVALID.message(), ce.message(), "message for INVALID_PARTNER should be used")
//        throw ce
//      }
//    }
//  }

  /**
   * Test fetching basic menu, but with an invalid location.
   */
//  @test(expected = ClientException::class)
//  fun testGetBasicMenuInvalidLocation() {
//    withClient { client ->
//      try {
//        client.platform.menu().retrieve(
//              MenuClient.MenuContext(
//                    partner = partnerID,
//                    location = ""))
//      } catch (ce: ClientException) {
//        // make sure it fails for the right reasons
//        assertEquals(Status.INVALID_ARGUMENT, ce.status(), "status should match INVALID_ARGUMENT")
//        assertEquals(MenuClientError.LOCATION_INVALID.message(), ce.message(), "message for INVALID_LOCATION should be used")
//        throw ce
//      }
//    }
//  }

  /**
   * Test fetching basic menu, but with a partner and location that are known not to exist.
   */
//  @test(expected = ClientException::class)
//  fun testGetBasicMenuDoesNotExist() {
//    withClient { client ->
//      val result = client.platform.menu().retrieve(
//            MenuClient.MenuContext(
//                  partner = "bunk-partner-id",
//                  location = "bunk-location-id"))
//
//      assertFalse("catalog should not be returned when it could not be found", { result.hasCatalog() })
//    }
//  }
}
