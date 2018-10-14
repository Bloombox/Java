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
          Bloombox.Endpoints.grpcPort,
          "grpc port should be 465")
  }

  @test
  fun testApiRegionCodes() {
    assertEquals(
          "usw1",
          Bloombox.APIRegion.USW1.code,
          "USW1 region code should be 'usw1'")

    assertEquals(
          "usc1",
          Bloombox.APIRegion.USC1.code,
          "USC1 region code should be 'usc1'")
  }

  @test
  fun testApiEnvironmentCodes() {
    assertEquals(
          "prod",
          Bloombox.APIEnvironment.PRODUCTION.code,
          "PRODUCTION environment code should be 'prod'")

    assertEquals(
          "staging",
          Bloombox.APIEnvironment.STAGING.code,
          "STAGING environment code should be 'staging'")

    assertEquals(
          "sandbox",
          Bloombox.APIEnvironment.SANDBOX.code,
          "SANDBOX environment code should be 'sandbox'")
  }

  @test
  fun testClientDefaultSettings() {
    val defauls = Bloombox.Settings.defaults(
          "apikey123", "partner123", "location123")
    assertEquals(
          "apikey123",
          defauls.apiKey,
          "API key should be adopted via 'defaults'")

    assertEquals(
          "partner123",
          defauls.partner,
          "partner code should be adopted via 'defaults'")

    assertEquals(
          "location123",
          defauls.location,
          "location code should be adopted via 'defaults'")

    assertEquals(
          false,
          defauls.enableLogging,
          "logging should default to being off")
  }

  @test
  fun testClientEnableLogging() {
    val defauls = Bloombox.Settings.withLogging(
          "apikey123", "partner123", "location123")
    assertEquals(
          "apikey123",
          defauls.apiKey,
          "API key should be adopted via 'defaults'")

    assertEquals(
          "partner123",
          defauls.partner,
          "partner code should be adopted via 'defaults'")

    assertEquals(
          "location123",
          defauls.location,
          "location code should be adopted via 'defaults'")

    assertEquals(
          true,
          defauls.enableLogging,
          "logging should be active when it is requested")
  }

  @test
  fun testProductionSandboxEndpoints() {
    assertEquals(
          "api.bloombox.cloud",
          Bloombox.Endpoints.production,
          "production endpoint domain should be set to api.bloombox.cloud")

    assertTrue(
          Bloombox.Endpoints.sandbox.contains("sandbox")
                && Bloombox.Endpoints.sandbox.contains("bloombox.services"),
          "sandbox endpoint domain should contain sandbox and bloombox.services")
  }

  @test
  fun testConfigPassthroughProduction() {
    withClient { client ->
      assertEquals(
            "api.bloombox.cloud",
            client.platform.telemetry().host,
            "production telemetry domain should be properly set")

      assertEquals(
            "api.bloombox.cloud",
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
  }

  @test
  fun testConfigEnvironments() {
    // prod
    withClient { client ->
      assertEquals(
            "api.bloombox.cloud",
            client.platform.telemetry().host,
            "production telemetry domain should be properly set")

      assertEquals(
            "api.bloombox.cloud",
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
}
