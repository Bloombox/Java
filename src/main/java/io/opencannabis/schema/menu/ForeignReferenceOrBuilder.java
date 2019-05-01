/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products/menu/Menu.proto

package io.opencannabis.schema.menu;

public interface ForeignReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.products.menu.ForeignReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Foreign key value for a reference between an in-network product and an out-of-network representation of that same
   * product in a different computer system.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Foreign key value for a reference between an in-network product and an out-of-network representation of that same
   * product in a different computer system.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Domain for the integrating system. This is usually set to a unique domain value that corresponds to the foreign
   * system, and can be used to identify it later.
   * </pre>
   *
   * <code>string domain = 2;</code>
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * Domain for the integrating system. This is usually set to a unique domain value that corresponds to the foreign
   * system, and can be used to identify it later.
   * </pre>
   *
   * <code>string domain = 2;</code>
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * URL to this product in the foreign system, if applicable. Can also be a link to a REST URL payload representing
   * this product's data in the foreign system.
   * </pre>
   *
   * <code>string link = 3;</code>
   */
  java.lang.String getLink();
  /**
   * <pre>
   * URL to this product in the foreign system, if applicable. Can also be a link to a REST URL payload representing
   * this product's data in the foreign system.
   * </pre>
   *
   * <code>string link = 3;</code>
   */
  com.google.protobuf.ByteString
      getLinkBytes();

  /**
   * <pre>
   * Timestamp for when this foreign reference was attached to a given menu product. This timestamp should only be set
   * once, upon original creation/linking of the foreign reference.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant attached = 4;</code>
   */
  boolean hasAttached();
  /**
   * <pre>
   * Timestamp for when this foreign reference was attached to a given menu product. This timestamp should only be set
   * once, upon original creation/linking of the foreign reference.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant attached = 4;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getAttached();
  /**
   * <pre>
   * Timestamp for when this foreign reference was attached to a given menu product. This timestamp should only be set
   * once, upon original creation/linking of the foreign reference.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant attached = 4;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getAttachedOrBuilder();

  /**
   * <pre>
   * Timestamp indicating when this foreign product reference was last validated with the foreign system. Each time an
   * item is fetched or otherwise synchronized, this should be updated.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant validated = 5;</code>
   */
  boolean hasValidated();
  /**
   * <pre>
   * Timestamp indicating when this foreign product reference was last validated with the foreign system. Each time an
   * item is fetched or otherwise synchronized, this should be updated.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant validated = 5;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getValidated();
  /**
   * <pre>
   * Timestamp indicating when this foreign product reference was last validated with the foreign system. Each time an
   * item is fetched or otherwise synchronized, this should be updated.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant validated = 5;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getValidatedOrBuilder();
}
