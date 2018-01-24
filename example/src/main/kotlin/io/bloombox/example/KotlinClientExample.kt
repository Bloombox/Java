package io.bloombox.example

import bloombox.client.BloomboxClient
import java.util.logging.Logger


/**
 * Shows how to use the Bloombox Java API Client from Kotlin.
 */
object KotlinClientExample {
  /**
   * API key to use. You can acquire this via the Google Cloud Console. Take a look at "API Keys" on the Java dev site,
   * available in the left-side navigation at [Bloombox Client for Java](https://bloombox.github.io/Java). This value
   * is required before making any API calls.
   */
  private val apiKey: String? = System.getProperty("example.apiKey") ?: "AIzaSyAEOsmEqQP5vX8aPvrlZH0f3AN7eGubL60"

  /**
   * Partner code to use. You can get this from the Bloombox Dashboard after logging in. It's a short string that
   * uniquely identifies your organization to Bloombox. This value is required before making any API calls.
   */
  private val partnerCode: String? = System.getProperty("example.partnerCode") ?: "mm"

  /**
   * Location code to use. You can also get this from the Bloombox Dashboard. It's also a short string that indicates
   * the location you want to use. This value is required before making any API calls.
   */
  private val locationCode: String? = System.getProperty("example.locationCode") ?: "sacramento"

  /**
   * API client. This is where we set everything up. There are a lot more options, all specified on
   * `Bloombox.Settings`. Of note:
   *
   * - You can set your own `Executor` for dispatching RPCs.
   * - You can set a custom request or close timeout for RPCs.
   */
  private val client = BloomboxClient(
        settings = BloomboxClient.Settings(
              apiKey = apiKey!!,
              enableLogging = true,
              partner = partnerCode!!,
              location = locationCode!!),
        target = BloomboxClient.ClientTarget.PRODUCTION)

  /**
   * Private logger.
   */
  private val logging = Logger.getAnonymousLogger()

  /**
   * CLI tool. Run it, with definitions set for `example.apiKey`, `example.partnerCode`, and `example.locationCode`. For
   * example:
   *
   * `java -Dexample.apiKey="xyz" -Dexample.partnerCode="mm" -Dexample.locationCode="sacramento"`
   */
  @JvmStatic
  fun main(args: Array<String>) {
    logging.info(
    """
      Running Kotlin sample for Bloombox. Settings:
      - Partner: $partnerCode
      - Location: $locationCode
      """)

    logging.info("Sending telemetry ping...")
    client.telemetry().Generic().ping()

    logging.info("Verifying known-good user...")
    val response = client.shop().verifyMember("sam@bloombox.io")
    logging.info("- Verified: ${response.verified}")

    logging.info("Done with sample. Closing connection.")
    client.close(false)
  }
}
