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
