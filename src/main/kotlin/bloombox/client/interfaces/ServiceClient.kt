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

package bloombox.client.interfaces

import bloombox.client.internals.rpc.RPCClient
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit


/**
 * Specifies the interface that a service RPC client must comply with, to make it usable and testable by the greater
 * API client system.
 */
internal interface ServiceClient {
  /**
   * Host to send RPCs to.
   */
  val host: String

  /**
   * Port to send RPCs to.
   */
  val port: Int

  /**
   * API key to specify.
   */
  val apiKey: String

  /**
   * Executor for followup and RPC client activities.
   */
  val executor: Executor

  /**
   * RPC request timeout to apply.
   */
  val timeout: Duration

  /**
   * Transport mode setting.
   */
  val transportMode: RPCClient.TransportMode

  /**
   * Client TLS auth mode.
   */
  val clientAuth: ClientAuth

  /**
   * Client credential information. First position is the private client key, second is the certificate.
   */
  val clientCredentials: RPCClient.ClientCredentials?

  /**
   * Authority roots to accept from the client-side. Defaults to the embedded 'authority-roots.pem'.
   */
  val clientAuthorityRoots: InputStream?

  /**
   * Utility function to close any existing client connection.
   */
  fun close(soft: Boolean, block: Boolean, timeout: Pair<Long, TimeUnit>)
}
