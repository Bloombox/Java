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

import bloombox.client.Bloombox
import bloombox.client.ClientException
import io.grpc.StatusRuntimeException
import java.util.logging.Logger
import java.util.concurrent.Executor


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
   * Test executor that immediately executes each runnable on the current
   * thread.
   */
  class CurrentThreadExecutor: Executor {
    override fun execute(r: Runnable) {
      r.run()
    }
  }

  /**
   * RPC client object.
   */
  class RPCClient(settings: Bloombox.Settings? = null) {
    private val directExecutor = CurrentThreadExecutor()

    /**
     * Local client.
     */
    val local: Bloombox = Bloombox(
          settings ?: Bloombox.Settings(
                testApiKey, testPartner, testLocation, executor = directExecutor),
          Bloombox.ClientTarget.LOCAL)

    /**
     * Sandbox client.
     */
    val sandbox: Bloombox = Bloombox(
          settings ?: Bloombox.Settings(
                testApiKey, testPartner, testLocation, executor = directExecutor),
          Bloombox.ClientTarget.SANDBOX)

    /**
     * Production client.
     */
    val platform: Bloombox = Bloombox(
          settings ?: Bloombox.Settings(
                testApiKey, testPartner, testLocation, executor = directExecutor),
          Bloombox.ClientTarget.PRODUCTION)

    /**
     * Reference to all supported clients.
     */
    private val _allClients: Array<Bloombox> = arrayOf(local, sandbox, platform)

    /**
     * Close connections on all clients.
     */
    fun close() {
      _allClients.forEach { it.close() }
    }
  }

  /**
   * Provide a callback with a setup client, and then immediately
   * close it afterwards.
   */
  fun withClient(block: (RPCClient) -> Unit) {
    withClient(null, block)
  }

  /**
   * Provide a callback with a setup client, and then immediately
   * close it afterwards.
   */
  fun withClient(settings: Bloombox.Settings? = null, block: (RPCClient) -> Unit) {
    var client: RPCClient? = null
    try {
      client = RPCClient(settings)
      block(client)
    } catch (e: java.util.concurrent.ExecutionException) {
      val inner = e.cause
      if (inner != null) {
        if (inner is StatusRuntimeException) {
          logging.warning("Call failed (status: ${inner.status.code}): ${inner.message?.replace("${inner.status.code}: ", "")}")
          throw ClientException.fromStatusRuntimeException(inner)
        }
        throw ClientException.fromUncaughtException(inner)
      }
    } finally {
      client?.close()
    }
  }
}
