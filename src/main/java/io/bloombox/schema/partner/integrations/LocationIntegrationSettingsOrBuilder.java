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
// source: partner/integrations/IntegrationSettings.proto

package io.bloombox.schema.partner.integrations;

public interface LocationIntegrationSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.integrations.LocationIntegrationSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies integrations that a specific location has setup.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.integrations.IntegrationPartner integrations = 1;</code>
   */
  java.util.List<io.bloombox.schema.partner.integrations.IntegrationPartner> getIntegrationsList();
  /**
   * <pre>
   * Specifies integrations that a specific location has setup.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.integrations.IntegrationPartner integrations = 1;</code>
   */
  int getIntegrationsCount();
  /**
   * <pre>
   * Specifies integrations that a specific location has setup.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.integrations.IntegrationPartner integrations = 1;</code>
   */
  io.bloombox.schema.partner.integrations.IntegrationPartner getIntegrations(int index);
  /**
   * <pre>
   * Specifies integrations that a specific location has setup.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.integrations.IntegrationPartner integrations = 1;</code>
   */
  java.util.List<java.lang.Integer>
  getIntegrationsValueList();
  /**
   * <pre>
   * Specifies integrations that a specific location has setup.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.integrations.IntegrationPartner integrations = 1;</code>
   */
  int getIntegrationsValue(int index);

  /**
   * <pre>
   * Generic settings, specified for each integration.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.integrations.GenericIntegrationSettings&gt; generic = 2;</code>
   */
  int getGenericCount();
  /**
   * <pre>
   * Generic settings, specified for each integration.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.integrations.GenericIntegrationSettings&gt; generic = 2;</code>
   */
  boolean containsGeneric(
      java.lang.String key);
  /**
   * Use {@link #getGenericMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.bloombox.schema.partner.integrations.GenericIntegrationSettings>
  getGeneric();
  /**
   * <pre>
   * Generic settings, specified for each integration.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.integrations.GenericIntegrationSettings&gt; generic = 2;</code>
   */
  java.util.Map<java.lang.String, io.bloombox.schema.partner.integrations.GenericIntegrationSettings>
  getGenericMap();
  /**
   * <pre>
   * Generic settings, specified for each integration.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.integrations.GenericIntegrationSettings&gt; generic = 2;</code>
   */

  io.bloombox.schema.partner.integrations.GenericIntegrationSettings getGenericOrDefault(
      java.lang.String key,
      io.bloombox.schema.partner.integrations.GenericIntegrationSettings defaultValue);
  /**
   * <pre>
   * Generic settings, specified for each integration.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.integrations.GenericIntegrationSettings&gt; generic = 2;</code>
   */

  io.bloombox.schema.partner.integrations.GenericIntegrationSettings getGenericOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Specifies location-specific integration settings with Greenbits.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings greenbits = 10;</code>
   */
  boolean hasGreenbits();
  /**
   * <pre>
   * Specifies location-specific integration settings with Greenbits.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings greenbits = 10;</code>
   */
  io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings getGreenbits();
  /**
   * <pre>
   * Specifies location-specific integration settings with Greenbits.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings greenbits = 10;</code>
   */
  io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOrBuilder getGreenbitsOrBuilder();
}
