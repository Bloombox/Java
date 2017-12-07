
package bloombox.client

import org.junit.Test as test


/**
 * Tests basic aspects of the client.
 */
class BasicClientTest {
  @test
  fun testBloomboxStaticValues() {
    assertEquals(
         "Bloombox", Bloombox.Company.name, "company name should be 'Bloombox'")
    assertEquals(
         "Bloombox, LLC", Bloombox.Company.legalName, "company legal name should be 'Bloombox LLC'")
  }
}
