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

package bloombox.client.internals.rpc

import io.grpc.ManagedChannel
import java.util.concurrent.TimeUnit


/**
 * Base RPC client logic, specifies the client-side operator of an RPC connection with the Bloombox Platform.
 */
@Suppress("unused")
abstract class RPCClient {
  /**
   * Managed channel.
   */
  abstract val channel: ManagedChannel

  /**
   * Close active connections.
   */
  fun close(soft: Boolean,
            block: Boolean,
            timeout: Pair<Long, TimeUnit>) {
    if (!channel.isShutdown) {
      if (soft) {
        channel.shutdown()
      } else {
        channel.shutdownNow()
      }
      if (block)
        channel.awaitTermination(timeout.first, timeout.second)
    }
  }
}
