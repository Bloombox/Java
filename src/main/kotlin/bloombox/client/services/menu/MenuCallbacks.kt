/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
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
