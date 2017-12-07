
package bloombox.client.internals.err

import bloombox.client.interfaces.ClientError


/**
 * Specifies an exception that occurred within a service client, known by a ClientError-compliant error case.
 */
class ServiceClientException(
        err: ClientError,
        cause: Throwable? = null): Exception(formatErr(err), cause) {
  companion object {
    /**
     * Format a ClientError.
     */
    private fun formatErr(err: ClientError): String = "Code ${err.code()}: ${err.message()}"
  }
}
