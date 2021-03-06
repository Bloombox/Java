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
import org.junit.Test as test


/**
 * Test PING calls through the Telemetry service.
 */
class TelemetryPingTest : ClientRPCTest() {
  /**
   * Test a PING call.
   */
  private fun testPing(client: TelemetryClient) {
    client.ping()
  }

//  @test
//  fun testBasicPing() {
//    withClient({ client ->
//      testPing(client.platform.telemetry())
//    })
//  }
}
