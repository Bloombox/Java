
## API Keys

Bloombox APIs are hosted on Google Cloud, and are published as Endpoints. As such, API key authentication is powered by
Google and supported through their Cloud Console.

### Setup

To get setup, from scratch, with an API key:
 
1) Head over to the [Google Cloud Console](https://console.cloud.google.com).

2) Login with a Google account, and create a project.<br />
   _Note: It is best to create a fresh project, for stronger isolation._

3) Navigate to the [API Credentials](https://console.cloud.google.com/apis/credentials) section.

4) Create an API key, by doing the following:

    - Click _Create credentials_.
    - From the dropdown, select _API key_.
    - A dialog will pop up with your new API key. Copy it to your clipboard and then into your code.
    - Adjust the HTTP referrers, allowed APIs, or source IPs to lock down the API key.<br />
      _Note: it is strongly recommended to lock the API key down, and required for PCI compliance._


#### Locking down the API key

Naturally, since you are currently reading the Java docs, you would probably want to lock this down by source IP. If
that isn't feasible for your environment, you can still lock it down by API.

If you _do_ choose to lock it down by API, **make sure** the following APIs are enabled for proper operation of the Java
and [JavaScript](https://bloombox.github.io/JS) libraries. All of the following services must be enabled:

- [Shop API](https://console.cloud.google.com/apis/library/shop.api.bloombox.cloud)
- [Telemetry API](https://console.cloud.google.com/apis/library/telemetry.api.bloombox.cloud) 


### Partner and Location

The values `partner` and `location` are frequently referenced in the code and docs. These values describe your partner
acocunt with Bloombox, and can be acquired via the [Bloombox Dashboard](https://manage.bloombox.io).

Both are short strings. Your `partner` code identifies your organization, and the `location` code identifies which
Bloombox location you wish to work with for whatever underlying API operation you're executing.
