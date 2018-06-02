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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contact/EmailAddress.proto

package io.opencannabis.schema.contact;

public interface EmailAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.contact.EmailAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Email address, in standard format ('example&#64;sample.com').
   * </pre>
   *
   * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Email address, in standard format ('example&#64;sample.com').
   * </pre>
   *
   * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Validation status. Usable by providers to indicate an email address that has already been validated, or that an
   * address remains unvalidated.
   * </pre>
   *
   * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this email address."];</code>
   */
  boolean getValidated();
}
