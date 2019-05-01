/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bloombox.client.interfaces

import bloombox.client.internals.mtls.ClientCredentials
import bloombox.client.internals.rpc.RPCClient
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit


/**
 * Specifies the interface that a service RPC client must comply with, to make it usable and testable by the greater API
 * client system. Underlying transport/connection details are also made available via this interface.
 */
internal interface ServiceClient {
  /**
   * Host to send RPCs to. This is a regular hostname string, and can be a raw IP address (in the case of "127.0.0.1")
   * or a DNS name.
   */
  val host: String

  /**
   * Port to send RPCs to. In some circumstances this may be a service-specific value, and so it is specified here, but
   * by and large RPC traffic occurs over ports 443 and 465.
   */
  val port: Int

  /**
   * API key in use by this client. Identifies the implementing/integrating project that is operating this client. Can
   * be obtained via the Bloombox Dashboard or a properly integrated Google Cloud Platform project.
   */
  val apiKey: String

  /**
   * Executor for followup and RPC client activities. Defaults to a single-threaded executor that conducts API requests
   * and any related followup in a background thread.
   */
  val executor: Executor

  /**
   * RPC request timeout to apply. After this duration, an in-flight RPC request with no server response data will be
   * considered failed due to a "time-out."
   */
  val timeout: Duration

  /**
   * Transport mode setting. Available options are "INTERNAL" and "SECURE." In nearly all circumstances, including
   * network-internal traffic, "SECURE" should be used, which enforces end-to-end SSL. "INTERNAL" mode is only useful
   * during development and for machine-internal traffic.
   */
  val transportMode: RPCClient.TransportMode

  /**
   * Client TLS auth mode. This specifies whether client auth is enabled or not for a given API client object. The
   * default value is no client auth. Client authentication (mTLS) is required in some circumstances.
   */
  val clientAuth: ClientAuth

  /**
   * Client credential information. This specifies the client-side portion of mTLS (Mutual Transport-Layer Security)
   * credential data. In particular, this includes a private key and identity certificate chain. First position is the
   * private client key, second is the certificate.
   */
  val clientCredentials: ClientCredentials?

  /**
   * Authority roots to accept from the client-side. Defaults to the embedded 'authority-roots.pem', which includes
   * issuing authority certificates for all Bloombox endpoints.
   */
  val clientAuthorityRoots: InputStream?

  /**
   * Utility function to close any existing client connection. Offers a timeout and "soft" shutdown functionality, which
   * waits for any pending request traffic to finish before terminating.
   */
  fun close(soft: Boolean, block: Boolean, timeout: Pair<Long, TimeUnit>)
}
