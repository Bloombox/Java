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

import io.grpc.Status


/**
 * Specifies a Bloombox client error that is known and identifiable. This interface is implemented by service-specific
 * error enumerations. Each enumeration must define properties to export its own domain, code, and message.
 */
interface ClientError {
  /**
   * Underlying gRPC status code that resulted from this error. These error codes rougly map to HTTP errors, and can be
   * found in gRPC's docs at https://grpc.io.
   */
  fun status(): Status

  /**
   * Error message to return or display. The service's error code is sent for this value. In rare circumstances, the
   * name of the resulting gRPC status may be returned if no specific error status is available.
   */
  fun message(): String
}
