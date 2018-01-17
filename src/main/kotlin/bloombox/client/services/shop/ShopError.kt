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

package bloombox.client.services.shop

import bloombox.client.interfaces.ClientError


/**
 * Enumerates known or otherwise identifiable shop errors that might occur.
 */
enum class ShopError : ClientError {
  /**
   * Specifies that the partner code was missing or invalid.
   */
  PARTNER_INVALID {
    override fun domain(cause: Throwable?): String = shopDomain
    override fun code(cause: Throwable?): Int = 0
    override fun message(cause: Throwable?): String = "Must provide a valid partner code."
  },

  /**
   * Specifies that the location code was missing or invalid.
   */
  LOCATION_INVALID {
    override fun domain(cause: Throwable?): String = shopDomain
    override fun code(cause: Throwable?): Int = 1
    override fun message(cause: Throwable?): String = "Must provide a valid location code."
  },

  /**
   * An error was encountered in the underlying framework.
   */
  RUNTIME_ERROR {
    override fun domain(cause: Throwable?): String = shopDomain
    override fun code(cause: Throwable?): Int = 2
    override fun message(cause: Throwable?): String =
          cause?.localizedMessage ?: cause?.message ?: "Runtime error."
  };

  companion object {
    const val shopDomain = "services.Shop"
  }
}
