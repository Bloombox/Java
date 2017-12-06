
package bloombox.client.test

import bloombox.client.BloomboxClient
import org.junit.After as after


/**
 * Sets up various details related to gRPC testing from the client-side.
 */
open class ClientRPCTest {
  companion object {
    const val testApiKey = "AIzaSyA17mIw4tWGe-GsqRhdpUDfLAn_KZ_zbcM"
    const val testPartner = "mm"
    const val testLocation = "sacramento"
  }

  /**
   * RPC client object.
   */
  protected class RPCClient {
    /**
     * Local client.
     */
    val local: BloomboxClient = BloomboxClient(
            BloomboxClient.Settings(testApiKey, true, testPartner, testLocation),
            BloomboxClient.ClientTarget.LOCAL)

    /**
     * Sandbox client.
     */
    val sandbox: BloomboxClient = BloomboxClient(
            BloomboxClient.Settings(testApiKey, true, testPartner, testLocation),
            BloomboxClient.ClientTarget.SANDBOX)

    /**
     * Production client.
     */
    val platform: BloomboxClient = BloomboxClient(
            BloomboxClient.Settings(testApiKey, true, testPartner, testLocation),
            BloomboxClient.ClientTarget.PRODUCTION)

    /**
     * Reference to all supported clients.
     */
    private val _allClients: Array<BloomboxClient> = arrayOf(local, sandbox, platform)

    /**
     * Close connections on all clients.
     */
    fun close() {
      _allClients.forEach { it.close() }
    }
  }

  /**
   * API client object.
   */
  protected val client = RPCClient()

  @after
  fun teardownClient() {
    client.close()
  }
}
