/*
 * Copyright 2018, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.bloombox.example.java;

import bloombox.client.Bloombox;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;


/**
 * Examples for using the Bloombox API client from Java.
 */
public final class JavaClientExample {
    /**
     * Setup the Bloombox client object, with your details. It can be statically placed (which is optimal) or at least
     * handled as a singleton.
     */
    private final Bloombox client;

    /**
     * Construct a Java client example with the requisite information to make calls to the Bloombox API.
     *
     * @param apiKey API key.
     * @param partnerId Partner ID.
     * @param locationId Location ID.
     */
    private JavaClientExample(final @NotNull String apiKey,
                              final @NotNull String partnerId,
                              final @NotNull String locationId) {
        client = new Bloombox(
                Bloombox.Settings.withLogging(apiKey, partnerId, locationId));
    }

    /**
     * Private logger.
     */
    private static final Logger logging = Logger.getAnonymousLogger();

    /**
     * CLI tool. Run it, with definitions set for `example.apiKey`, `example.partnerCode`, and `example.locationCode`.
     * For example:
     *
     * `java [...] -Dexample.apiKey="xyz" -Dexample.partnerCode="mm" -Dexample.locationCode="sacramento"`
     */
    public static void main(final String[] args) {
        final String partnerCode;
        final String locationCode;
        final String apiKey;

        // collect API key info
        if (System.getProperty("example.apiKey") != null) {
            apiKey = System.getProperty("example.apiKey");
        } else {
            apiKey = "AIzaSyAEOsmEqQP5vX8aPvrlZH0f3AN7eGubL60";
        }

        // collect partner code
        if (System.getProperty("example.partnerCode") != null) {
            partnerCode = System.getProperty("example.partnerCode");
        } else {
            partnerCode = "mm";
        }

        // collect location code
        if (System.getProperty("example.locationCode") != null) {
            locationCode = System.getProperty("example.locationCode");
        } else {
            locationCode = "sacramento";
        }

        logging.info("Running Java sample for Bloombox. Settings:\n" +
                     "- Partner: " + partnerCode + "\n" +
                     "- Location: " + locationCode);

        final Bloombox bloombox = new JavaClientExample(apiKey, partnerCode, locationCode).client;

        logging.info("Sending telemetry ping...");
        bloombox.telemetry().Generic().ping();

        logging.info("Verifying known-good user...");
        bloombox.shop().verifyMember("sam@bloombox.io");

        logging.info("Done with sample. Closing connection.");
        bloombox.close(false);
    }
}
