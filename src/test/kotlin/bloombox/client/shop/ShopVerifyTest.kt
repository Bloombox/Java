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
import bloombox.client.services.shop.ShopClient
import bloombox.client.test.ClientRPCTest
import io.bloombox.schema.services.shop.v1.VerifyMember
import java.util.concurrent.TimeUnit
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
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
//  @test
//  fun testGoodAccountVerify() {
//    // prep a client for prod
//    val prodClient = Bloombox(Bloombox.Settings(
//          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
//          partner = "caliva",
//          location = "sjc"),
//          Bloombox.ClientTarget.PRODUCTION)
//
//    // run a known-good account verification
//    val response = testMemberVerifyGoodAccount(prodClient.shop())
//
//    assertNotNull(response, "response from server for known-good verify should not be null")
//    assertTrue(response.verified, "known-good account should verify correctly")
//
//    prodClient.close(false)
//  }

  /**
   * Test verifying a known good account with a second partner.
   */
//  @test
//  fun testGoodAccountVerifyOtherPartner() {
//    // prep a client for prod
//    val prodClient = Bloombox(Bloombox.Settings(
//          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
//          partner = "abatin",
//          location = "sacramento"),
//          Bloombox.ClientTarget.PRODUCTION)
//
//    // run a known-good account verification
//    val response = testMemberVerifyGoodAccount(prodClient.shop())
//
//    assertNotNull(response, "response from server for known-good alternate partner verify should not be null")
//    assertTrue(response.verified, "known-good alternate partner account should verify correctly")
//
//    prodClient.close(false)
//  }

  /**
   * Test verifying a known good account, asynchronously.
   */
//  @test
//  fun testGoodAccountVerifyAsync() {
//    // prep a client for prod
//    val prodClient = Bloombox(Bloombox.Settings(
//          "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
//          partner = "caliva",
//          location = "sjc"),
//          Bloombox.ClientTarget.PRODUCTION)
//
//    try {
//      // run a known-good account verification
//      val operation = prodClient
//            .shop()
//            .verifyMember("sam@bloombox.io", { response ->
//              assertNotNull(response, "response from server for known-good verify should not be null")
//              assertTrue(response.verified, "known-good account should verify correctly")
//            }, { err ->
//              logging.severe("Severe error fetching order: $err")
//            })
//
//      // make sure it executes, with a 10-second timeout
//      operation.get(10, TimeUnit.SECONDS)
//    } finally {
//      prodClient.close(false)
//    }
//  }

  /**
   * Test verifying a known bad account.
   */
//  @test
//  fun testBadAccountVerify() {
//    withClient({ client ->
//      // run a known-good account verification
//      val response = testMemberVerifyBadAccount(client.platform.shop())
//      assertNotNull(response, "response from server for known-bad verify should not be null")
//      assertTrue(!response.verified, "known-bad account should fail verification")
//    })
//  }

  /**
   * Test verifying a known bad account, asynchronously.
   */
//  @test
//  fun testBadAccountVerifyAsync() {
//    withClient({ client ->
//      // run a known-good account verification
//      val operation = client.platform.shop().verifyMember("does-not-exist@error.com", { response ->
//        assertNotNull(response, "response from server for known-bad verify should not be null")
//        assertTrue(!response.verified, "known-bad account should fail verification")
//      }, { err ->
//        logging.severe("Severe error fetching order: $err")
//      })
//
//      // make sure it executes, with a 10-second timeout
//      operation.get(10, TimeUnit.SECONDS)
//    })
//  }
}
