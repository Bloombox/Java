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

import bloombox.client.interfaces.ClientError
import io.grpc.Status


/**
 * Enumerates known or otherwise identifiable shop errors that might occur.
 */
enum class ShopClientError : ClientError {
  /**
   * Specifies that the partner code was missing or invalid.
   */
  PARTNER_INVALID {
    override fun status(): Status = Status.INVALID_ARGUMENT
    override fun message(): String = "Must provide a valid partner code."
  },

  /**
   * Specifies that the location code was missing or invalid.
   */
  LOCATION_INVALID {
    override fun status(): Status = Status.INVALID_ARGUMENT
    override fun message(): String = "Must provide a valid location code."
  }
}
