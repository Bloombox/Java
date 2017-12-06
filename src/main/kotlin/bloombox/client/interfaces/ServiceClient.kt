
package bloombox.client.interfaces

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
   * Setting to control logging.
   */
  val enableLogging: Boolean

  /**
   * Executor for followup and RPC client activities.
   */
  val executor: Executor

  /**
   * Utility function to close any existing client connection.
   */
  fun close(soft: Boolean, block: Boolean, timeout: Pair<Long, TimeUnit>)
}
