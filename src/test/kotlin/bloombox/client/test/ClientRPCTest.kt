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

package bloombox.client.test

import bloombox.client.BloomboxClient
import java.util.logging.Logger
import org.junit.After as after


/**
 * Sets up various details related to gRPC testing from the client-side.
 */
open class ClientRPCTest {
  companion object {
    const val testApiKey = "AIzaSyBC4ZQVM3JnnS4P-wu6MHKi5oc0NcEuWxE"
    const val testPartner = "mm"
    const val testLocation = "sacramento"
    val logging: Logger = Logger.getAnonymousLogger()
  }

  /**
   * RPC client object.
   */
  protected class RPCClient {
    /**
     * Local client.
     */
    val local: BloomboxClient = BloomboxClient(
          BloomboxClient.Settings(testApiKey, testPartner, testLocation),
          BloomboxClient.ClientTarget.LOCAL)

    /**
     * Sandbox client.
     */
    val sandbox: BloomboxClient = BloomboxClient(
          BloomboxClient.Settings(testApiKey, testPartner, testLocation),
          BloomboxClient.ClientTarget.SANDBOX)

    /**
     * Production client.
     */
    val platform: BloomboxClient = BloomboxClient(
          BloomboxClient.Settings(testApiKey, testPartner, testLocation),
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
