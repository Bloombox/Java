
package bloombox.client.shop

import bloombox.client.BloomboxClient
import org.junit.Test as test
import bloombox.client.internals.services.shop.ShopClient
import bloombox.client.test.ClientRPCTest
import io.bloombox.schema.services.shop.VerifyMember
import kotlin.test.assertTrue
import kotlin.test.assertNotNull


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
  @test
  fun testGoodAccountVerify() {
    // prep a client for prod
    val prodClient = BloomboxClient(BloomboxClient.Settings(
            "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM",
            false,
            partner = "caliva",
            location = "sjc"),
            BloomboxClient.ClientTarget.PRODUCTION)

    // run a known-good account verification
    val response = testMemberVerifyGoodAccount(prodClient.shop())

    assertNotNull(response, "response from server for known-good verify should not be null")
    assertTrue(response.verified, "known-good account should verify correctly")
  }

  @test
  fun testBadAccountVerify() {
    // run a known-good account verification
    val response = testMemberVerifyBadAccount(client.platform.shop())
    assertNotNull(response, "response from server for known-bad verify should not be null")
    assertTrue(!response.verified, "known-bad account should fail verification")
  }
}
