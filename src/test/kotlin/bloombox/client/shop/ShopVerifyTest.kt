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

import bloombox.client.BloomboxClient
import bloombox.client.services.shop.ShopClient
import bloombox.client.test.ClientRPCTest
import io.bloombox.schema.services.shop.v1.VerifyMember
import java.util.concurrent.TimeUnit
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.Ignore as ignore
import org.junit.Test as test


/**
 * Test shop verification routines with known-bad and known-good test accounts.
 */
class ShopVerifyTest: ClientRPCTest() {
  // -- RPC Routines -- //
  /**
   * Test verification of a known-good account.
   */
  private fun testMemberVerifyGoodAccount(client: ShopClient): VerifyMember.Response =
        client.verifyMember("sam@bloombox.io")

  /**
   * Test verification of a known-bad account.
   */
  private fun testMemberVerifyBadAccount(client: ShopClient): VerifyMember.Response =
        client.verifyMember("does-not-exist@error.com")

  // -- Tests -- //
  /**
   * Test verifying a known good account.
   */
  @test
  fun testGoodAccountVerify() {
    // prep a client for prod
    val prodClient = BloomboxClient(BloomboxClient.Settings(
          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
          partner = "caliva",
          location = "sjc"),
          BloomboxClient.ClientTarget.PRODUCTION)

    // run a known-good account verification
    val response = testMemberVerifyGoodAccount(prodClient.shop())

    assertNotNull(response, "response from server for known-good verify should not be null")
    assertTrue(response.verified, "known-good account should verify correctly")

    prodClient.close(false)
  }

  /**
   * Test verifying a known good account with a second partner.
   */
  @test
  fun testGoodAccountVerifyOtherPartner() {
    // prep a client for prod
    val prodClient = BloomboxClient(BloomboxClient.Settings(
          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
          partner = "abatin",
          location = "sacramento"),
          BloomboxClient.ClientTarget.PRODUCTION)

    // run a known-good account verification
    val response = testMemberVerifyGoodAccount(prodClient.shop())

    assertNotNull(response, "response from server for known-good alternate partner verify should not be null")
    assertTrue(response.verified, "known-good alternate partner account should verify correctly")

    prodClient.close(false)
  }

  /**
   * Test verifying a known good account, asynchronously.
   */
  @test
  fun testGoodAccountVerifyAsync() {
    // prep a client for prod
    val prodClient = BloomboxClient(BloomboxClient.Settings(
          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
          partner = "caliva",
          location = "sjc"),
          BloomboxClient.ClientTarget.PRODUCTION)

    try {
      // run a known-good account verification
      val operation = prodClient
            .shop()
            .verifyMember("sam@bloombox.io", { response ->
              assertNotNull(response, "response from server for known-good verify should not be null")
              assertTrue(response.verified, "known-good account should verify correctly")
            }, { err ->
              logging.severe("Severe error fetching order: $err")
            })

      // make sure it executes, with a 10-second timeout
      operation.get(10, TimeUnit.SECONDS)
    } finally {
      prodClient.close(false)
    }
  }

  /**
   * Test verifying a known bad account.
   */
  @test
  fun testBadAccountVerify() {
    // run a known-good account verification
    val response = testMemberVerifyBadAccount(client.platform.shop())
    assertNotNull(response, "response from server for known-bad verify should not be null")
    assertTrue(!response.verified, "known-bad account should fail verification")
  }

  /**
   * Test verifying a known bad account, asynchronously.
   */
  @test
  fun testBadAccountVerifyAsync() {
    // run a known-good account verification
    val operation = client.platform.shop().verifyMember("does-not-exist@error.com", { response ->
      assertNotNull(response, "response from server for known-bad verify should not be null")
      assertTrue(!response.verified, "known-bad account should fail verification")
    }, { err ->
      logging.severe("Severe error fetching order: $err")
    })

    // make sure it executes, with a 10-second timeout
    operation.get(10, TimeUnit.SECONDS)
  }
}
