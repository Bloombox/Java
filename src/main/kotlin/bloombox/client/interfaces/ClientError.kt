
package bloombox.client.interfaces


/**
 * Specifies a Bloombox client error that is known and identifiable. This interface is implemented by service-specific
 * error enumerations. Each enumeration must define properties to export its own domain, code, and message.
 */
interface ClientError {
  /**
   * The "domain" of the error is usually the name of the service.
   */
  fun domain(): String

  /**
   * Integer error code. Usually derived from an enum's value.
   */
  fun code(): Int

  /**
   * Error message to return or display.
   */
  fun message(): String
}
