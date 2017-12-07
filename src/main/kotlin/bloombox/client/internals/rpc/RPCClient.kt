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
