
package bloombox.client.telemetry

import bloombox.client.internals.services.telemetry.TelemetryClient
import bloombox.client.test.ClientRPCTest
import org.junit.Test as test
import org.junit.Ignore as ignore


/**
 * Test PING calls through the Telemetry service.
 */
class TelemetryPingTest: ClientRPCTest() {
  /**
   * Test a PING call.
   */
  private fun testPing(client: TelemetryClient) {
    client.Generic().ping()
  }

  @test @ignore
  fun testBasicPing() {
    testPing(client.platform.telemetry())
  }
}
