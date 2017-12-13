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
import bloombox.client.test.ClientRPCTest
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.Ignore as ignore
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
    private const val partnerID = "mm"

    /**
     * Location ID to test hours with.
     */
    private const val locationID = "sacramento"
  }

  /**
   * Test fetching shop hours.
   */
  @test
  fun testShopHours() {
    val response = client.platform.shop().shopInfo(
          ShopClient.ShopContext(
                partner = partnerID,
                location = locationID))

    assertNotNull(response, "response from server for hours should not be null")
    assertNotNull(response.shopStatus, "response from server should specify shop status")
  }

  /**
   * Test a known-good zipcode via zipcheck.
   */
  @test
  fun testZipcheckKnownGood() {
    val responseOne = client.platform.shop().zipCheck("95120", ShopClient.ShopContext(
          partner = partnerID,
          location = locationID))

    val responseTwo = client.platform.shop().zipCheck("94404", ShopClient.ShopContext(
          partner = partnerID,
          location = locationID))

    assertNotNull(responseOne, "response from server for zipcheck 1 should not be null")
    assertNotNull(responseTwo, "response from server for zipcheck 2 should not be null")
    assertTrue(responseOne.supported, "response from server for zipcheck 1 should grant access")
    assertTrue(responseTwo.supported, "response from server for zipcheck 2 should grant access")
    assertEquals(responseOne.deliveryMinimum, (50.0).toFloat(), "response should specify correct delivery minimum for zipcheck 1")
    assertEquals(responseTwo.deliveryMinimum, (200.0).toFloat(), "response should specify correct delivery minimum for zipcheck 2")
  }

  /**
   * Test a known-bad zipcode via zipcheck.
   */
  @test
  fun testZipcheckKnownBad() {
    val responseOne = client.platform.shop().zipCheck("12345", ShopClient.ShopContext(
          partner = partnerID,
          location = locationID))

    assertNotNull(responseOne, "response from server for bad zipcheck should not be null")
    assertTrue(!responseOne.supported, "response from server for bad zipcheck should withhold access")
  }
}
