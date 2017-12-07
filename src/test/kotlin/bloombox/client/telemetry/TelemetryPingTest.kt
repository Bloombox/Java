/*
 * Copyright 2017, Bloombox, LLC.
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

package bloombox.client.telemetry

import bloombox.client.services.telemetry.TelemetryClient
import bloombox.client.test.ClientRPCTest
import org.junit.Ignore as ignore
import org.junit.Test as test


/**
 * Test PING calls through the Telemetry service.
 */
class TelemetryPingTest : ClientRPCTest() {
  /**
   * Test a PING call.
   */
  private fun testPing(client: TelemetryClient) {
    client.Generic().ping()
  }

  @test
  @ignore
  fun testBasicPing() {
    testPing(client.platform.telemetry())
  }
}
