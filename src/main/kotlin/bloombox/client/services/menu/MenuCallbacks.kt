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

package bloombox.client.services.menu

import bloombox.client.ClientException
import io.bloombox.schema.services.menu.v1beta1.GetMenu


/**
 * Callback type that provides an asynchronous response to a menu retrieval request. Accepts a response value - a `null`
 * response is itself considered an error - and provides no return value.
 */
typealias MenuCallback = (GetMenu.Response) -> Unit

/**
 * Error case callback type that handles `ServiceClientException`-compliant throwables. Accepts a compliant instance of
 * `ServiceClientException` and provides no return value.
 */
typealias MenuErrorCallback = (ClientException?) -> Unit
