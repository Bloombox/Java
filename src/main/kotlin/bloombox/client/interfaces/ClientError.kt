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


/**
 * Specifies a Bloombox client error that is known and identifiable. This interface is implemented by service-specific
 * error enumerations. Each enumeration must define properties to export its own domain, code, and message.
 */
interface ClientError {
  /**
   * The "domain" of the error is usually the name of the service.
   */
  fun domain(cause: Throwable?): String

  /**
   * Integer error code. Usually derived from an enum's value.
   */
  fun code(cause: Throwable?): Int

  /**
   * Error message to return or display.
   */
  fun message(cause: Throwable?): String
}
