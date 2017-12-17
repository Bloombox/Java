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

package bloombox.client


/**
 * Specifies basic information about Bloombox.
 */
object Bloombox {
  /**
   * Information about the company.
   */
  object Company {
    /**
     * Human-friendly company name.
     */
    const val name = "Bloombox"

    /**
     * Company legal name.
     */
    const val legalName = "Bloombox, LLC"
  }

  /**
   * Statically-set RPC client endpoints.
   */
  internal object Endpoints {
    /**
     * Production client endpoint.
     */
    internal const val production = "api.bloombox.cloud"

    /**
     * Sandbox endpoint. Requires special auth.
     */
    internal const val sandbox = "sandbox.usw1.bloombox.services"

    /**
     * Port to use for TLS-wrapped gRPC traffic.
     */
    internal const val grpcPort = 443

    /**
     * Port to use locally for the Telemetry service.
     */
    internal const val localTelemetryPort = 1090

    /**
     * Port to use locally for the Shop service.
     */
    internal const val localShopPort = 1091
  }
}
