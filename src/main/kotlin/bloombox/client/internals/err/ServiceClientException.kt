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

package bloombox.client.internals.err

import bloombox.client.interfaces.ClientError


/**
 * Specifies an exception that occurred within a service client, known by a ClientError-compliant error case.
 */
class ServiceClientException(
      err: ClientError,
      cause: Throwable? = null) : Exception(formatErr(err, cause), cause) {
  companion object {
    /**
     * Format a ClientError.
     */
    private fun formatErr(err: ClientError,
                          cause: Throwable?): String =
          "Error '${err.domain(cause)}::${err.code(cause)}': " +
                err.message(cause)
  }
}
