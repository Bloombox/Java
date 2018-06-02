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

package bloombox.client.telemetry

import bloombox.client.services.telemetry.TelemetryClient
import bloombox.client.test.ClientRPCTest
import com.google.protobuf.Struct
import com.google.protobuf.Value
import org.junit.Test as test


/**
 * Test submission of generic telemetry events and error reports.
 */
class TelemetryGenericEventTest: ClientRPCTest() {
  companion object {
    /**
     * Partner ID to test hours with.
     */
    private const val partnerID = "mm"

    /**
     * Location ID to test hours with.
     */
    private const val locationID = "sacramento"
  }

//  @test
//  fun testBasicEvent() {
//    withClient({ client ->
//      // we should be able to send a basic event
//      client.platform.telemetry().event(
//            "testsuite",
//            occurred = System.currentTimeMillis(),
//            payload = mapOf(
//                  Pair("sample", Value.newBuilder().setNumberValue(5.0).build()),
//                  Pair("sample_string", Value.newBuilder().setStringValue("hello").build()),
//                  Pair("sample_so", Value.newBuilder().setStructValue(Struct.newBuilder()
//                        .putFields("sample_substring", Value.newBuilder().setStringValue("hello2").build())
//                        .putFields("sample_sn", Value.newBuilder().setNumberValue(5.0).build()).build())
//                        .build())),
//            context = TelemetryClient.EventContext(
//                  partner = partnerID,
//                  location = locationID))
//    })
//  }
}
