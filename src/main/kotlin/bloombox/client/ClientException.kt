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

package bloombox.client

import bloombox.client.interfaces.ClientError
import io.grpc.Status
import io.grpc.StatusRuntimeException


/**
 * Exception object representing an error that occurred over-the-wire with a Bloombox Cloud API service. When a failure
 * happens, it bubbles up through the underlying RPC machinery, is caught, decoded, and re-thrown as this exception.
 * When invoking RPC methods, catch this exception, and use the embedded 'status' property to react accordingly.
 */
class ClientException private constructor (
      /**
       * Underlying exception provided by the gRPC runtime. This is generally just a wrapped Throwable around a gRPC
       * status, which is itself exposed through this class.
       */
      override val cause: Throwable?,

      /**
       * gRPC status that resulted from this exception. Returned as the error message for this error. An index of the
       * error codes specified here is available at https://grpc.io.
       */
      private val status: Status,

      /**
       * Error delegate, which is just an inner ClientError. If specified, values will be proxied to this item, which is
       * generally backed by a service-specific enum.
       */
      private val delegate: ClientError?) : Throwable(status.toString(), cause), ClientError {
  /**
   * Underlying gRPC status code that resulted from this error. These error codes roughly map to HTTP errors, and can be
   * found in gRPC's docs at https://grpc.io.
   */
  override fun status(): Status = delegate?.status() ?: status

  /**
   * Error message to return or display. The service's error code is sent for this value. In rare circumstances, the
   * name of the resulting gRPC status may be returned if no specific error status is available.
   */
  override fun message(): String = cause?.message ?: delegate?.message() ?: status.toString()

  /**
   * Return the status name of this error code for its string-ified form. An index of these error codes is available at
   * https://grpc.io. Basically, the name of the status is taken, and any cause-exception message is appended.
   */
  override fun toString(): String = message()

  companion object {
    /**
     * Create a new ClientException from a StatusRuntimeException caught during an in-flight RPC operation.
     */
    internal fun fromStatusRuntimeException(cause: StatusRuntimeException): ClientException
          = ClientException(cause, cause.status, null)

    /**
     * Create a new ClientException from some uncaught exception.
     */
    internal fun fromUncaughtException(cause: Throwable): ClientException
          = ClientException(cause, Status.INTERNAL, null)

    /**
     * Create a new ClientException from an error that occurred before communicating with remote services.
     */
    internal fun fromClientError(cause: ClientError): ClientException
          = ClientException(null, Status.INTERNAL, cause)
  }
}
