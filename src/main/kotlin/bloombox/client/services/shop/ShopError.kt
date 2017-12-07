
package bloombox.client.services.shop

import bloombox.client.interfaces.ClientError


/**
 * Enumerates known or otherwise identifiable shop errors that might occur.
 */
enum class ShopError: ClientError {
  /**
   * Specifies that the partner code was missing or invalid.
   */
  PARTNER_INVALID {
    override fun domain(): String = shopDomain
    override fun code(): Int = 0
    override fun message(): String = "Must provide a partner code."
  },

  /**
   * Specifies that the location code was missing or invalid.
   */
  LOCATION_INVALID {
    override fun domain(): String = shopDomain
    override fun code(): Int = 1
    override fun message(): String = "Must provide a location code."
  },

  /**
   * Specifies that a connection was refused.
   */
  CONNECTION_REFUSED {
    override fun domain(): String = shopDomain
    override fun code(): Int = 2
    override fun message(): String = "Connection refused."
  };

  companion object {
    const val shopDomain = "services.Shop"
  }
}
