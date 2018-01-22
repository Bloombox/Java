/*
 * Copyright 2018, Bloombox, LLC.
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

package bloombox.client.menu

import bloombox.client.internals.err.ServiceClientException
import bloombox.client.services.menu.MenuClient
import bloombox.client.test.ClientRPCTest
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

import org.junit.Ignore as ignore
import org.junit.Test as test


/**
 * Test menu retrieval methods on the Menu API.
 */
class GetMenuTest: ClientRPCTest() {
  companion object {
    /**
     * Partner ID to test the menu with.
     */
    private const val partnerID = "mm"

    /**
     * Location ID to test the menu with.
     */
    private const val locationID = "sacramento"
  }

  /**
   * Test fetching basic menu.
   */
  @test @ignore
  fun testGetBasicMenu() {
    val response = client.platform.menu().retrieve(
          MenuClient.MenuContext(
                partner = partnerID,
                location = locationID))

    assertNotNull(response, "response from server for menu should not be null")
    assertTrue(response.hasCatalog(), "response from server should specify menu data")
  }

  /**
   * Test fetching basic menu with default context.
   */
  @test @ignore
  fun testGetBasicMenuDefaultContext() {
    val response = client.platform.menu().retrieve()
    assertNotNull(response, "response from server for menu should not be null")
    assertTrue(response.hasCatalog(), "response from server should specify menu data")
  }

  /**
   * Test fetching basic menu, but with an invalid partner.
   */
  @test(expected = ServiceClientException::class) @ignore
  fun testGetBasicMenuInvalidPartner() {
    client.platform.menu().retrieve(
          MenuClient.MenuContext(
                partner = "",
                location = locationID))
  }

  /**
   * Test fetching basic menu, but with an invalid location.
   */
  @test(expected = ServiceClientException::class) @ignore
  fun testGetBasicMenuInvalidLocation() {
    client.platform.menu().retrieve(
          MenuClient.MenuContext(
                partner = partnerID,
                location = ""))
  }
}
