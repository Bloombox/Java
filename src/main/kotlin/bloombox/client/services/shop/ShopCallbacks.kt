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

package bloombox.client.services.shop

import bloombox.client.ClientException
import io.bloombox.schema.services.shop.v1.*


/**
 * Shop info RPC callback. Provides the response to a shop info retrieval operation and expects no return value.
 */
typealias InfoCallback = (ShopInfo.Response) -> Unit

/**
 * Zipcode check RPC callback. Provides the response to a zipcode delivery eligibility check and expects no return
 * value.
 */
typealias ZipcheckCallback = (CheckZipcode.Response) -> Unit

/**
 * Commercial order retrieval callback. Provides the response to a request to retrieve a commercial order's data by ID,
 * and expects no return value.
 */
typealias GetOrderCallback = (GetOrder.Response) -> Unit

/**
 * Commercial order submission callback. Provides the order submission status and the resulting order ID, if applicable,
 * and expects no return value.
 */
typealias SubmitOrderCallback = (SubmitOrder.Response) -> Unit

/**
 * User/member verification callback. Provides user verification status and information about any error that occurred
 * while performing verification. Expects no return value.
 */
typealias VerifyMemberCallback = (VerifyMember.Response) -> Unit

/**
 * Error case callback type that handles `ServiceClientException`-compliant throwables. Accepts a compliant instance of
 * `ServiceClientException` and provides no return value.
 */
typealias ShopErrorCallback = (ClientException?) -> Unit
