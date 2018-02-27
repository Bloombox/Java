/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
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

package bloombox.client

import bloombox.client.services.menu.MenuClientError
import io.grpc.Status
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import org.junit.Test as test


/**
 * Tests behavior of the ClientException class.
 */
class ClientExceptionTests {
  @test
  fun testClientExceptionUncaught() {
    val exc = ClientException.fromUncaughtException(IllegalStateException("testing 123"))
    assertEquals("testing 123", exc.message(), "exception message should make it through")
    assertNotNull(exc.cause, "client exception should take on its cause when created from an uncaught exception")
    assertEquals(exc.toString(), exc.message(), "toString() should match exception message")
  }

  @test
  fun testStatusRuntimeException() {
    val statusExc = Status.ABORTED.asRuntimeException()
    val exc = ClientException.fromStatusRuntimeException(statusExc)
    assertEquals(Status.ABORTED, exc.status(), "cause should pass through for ClientException from StatusRuntimeException")
    assertNotNull(exc.message, "ClientException message for StatusRuntimeException should not be null")
    assertNotNull(exc.cause, "ClientException cause for StatusRuntimeException should not be null")
    assertEquals(exc.toString(), exc.message(), "toString() should match exception message")
  }

  @test
  fun testClientError() {
    val exc = ClientException.fromClientError(MenuClientError.PARTNER_INVALID)
    assertEquals(MenuClientError.PARTNER_INVALID.message(), exc.message(), "client error message should be adopted in wrapped exception")
    assertEquals(exc.toString(), exc.message(), "toString() should match exception message")
  }
}
