package bloombox.client

import bloombox.client.test.ClientRPCTest
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.Test as test


/**
 * Tests basic configuration of the Java client.
 */
class ClientConfigTests : ClientRPCTest() {
  companion object {
    const val expectedPort = 443
    const val expectedLocalShopPort = 1091
    const val expectedLocalTelemetryPort = 1090
  }

  @test
  fun testDefaultGrpcPort() {
    assertEquals(
          expectedPort,
          BloomboxClient.Endpoints.grpcPort,
          "grpc port should be 465")
  }

  @test
  fun testProductionSandboxEndpoints() {
    assertEquals(
          "api.bloombox.cloud",
          BloomboxClient.Endpoints.production,
          "production endpoint domain should be set to api.bloombox.cloud")

    assertTrue(
          BloomboxClient.Endpoints.sandbox.contains("sandbox")
                && BloomboxClient.Endpoints.sandbox.contains("bloombox.services"),
          "sandbox endpoint domain should contain sandbox and bloombox.services")
  }

  @test
  fun testConfigPassthroughProduction() {
    assertEquals(
          "telemetry.api.bloombox.cloud",
          client.platform.telemetry().host,
          "production telemetry domain should be properly set")

    assertEquals(
          "shop.api.bloombox.cloud",
          client.platform.shop().host,
          "production shop domain should be properly set")

    assertEquals(
          expectedPort,
          client.platform.telemetry().port,
          "production telemetry port should be properly set")

    assertEquals(
          expectedPort,
          client.platform.shop().port,
          "production shop port should be properly set")
  }

  @test
  fun testConfigEnvironments() {
    // prod
    assertEquals(
          "telemetry.api.bloombox.cloud",
          client.platform.telemetry().host,
          "production telemetry domain should be properly set")

    assertEquals(
          "shop.api.bloombox.cloud",
          client.platform.shop().host,
          "production shop domain should be properly set")

    assertEquals(
          expectedPort,
          client.platform.telemetry().port,
          "production telemetry port should be properly set")

    assertEquals(
          expectedPort,
          client.platform.shop().port,
          "production shop port should be properly set")

    // sandbox
    assertEquals(
          "telemetry.rpc.sandbox.usw1.bloombox.services",
          client.sandbox.telemetry().host,
          "sandbox telemetry domain should be properly set")

    assertEquals(
          "shop.rpc.sandbox.usw1.bloombox.services",
          client.sandbox.shop().host,
          "sandbox shop domain should be properly set")

    assertEquals(
          expectedPort,
          client.sandbox.telemetry().port,
          "sandbox telemetry port should be properly set")

    assertEquals(
          expectedPort,
          client.sandbox.shop().port,
          "sandbox shop port should be properly set")

    // local
    assertEquals(
          "127.0.0.1",
          client.local.telemetry().host,
          "local telemetry domain should be properly set")

    assertEquals(
          "127.0.0.1",
          client.local.shop().host,
          "local shop domain should be properly set")

    assertEquals(
          expectedLocalTelemetryPort,
          client.local.telemetry().port,
          "local telemetry port should be properly set")

    assertEquals(
          expectedLocalShopPort,
          client.local.shop().port,
          "local shop port should be properly set")
  }
}
