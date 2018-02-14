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
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

public interface ShopSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.ShopSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies hours that apply to this storefront.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopHoursSettings hours = 1;</code>
   */
  boolean hasHours();
  /**
   * <pre>
   * Specifies hours that apply to this storefront.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopHoursSettings hours = 1;</code>
   */
  io.bloombox.schema.partner.settings.ShopHoursSettings getHours();
  /**
   * <pre>
   * Specifies hours that apply to this storefront.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopHoursSettings hours = 1;</code>
   */
  io.bloombox.schema.partner.settings.ShopHoursSettingsOrBuilder getHoursOrBuilder();

  /**
   * <pre>
   * Specifies the services offered by this shop, digital or physical.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopServiceSettings services = 2;</code>
   */
  boolean hasServices();
  /**
   * <pre>
   * Specifies the services offered by this shop, digital or physical.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopServiceSettings services = 2;</code>
   */
  io.bloombox.schema.partner.settings.ShopServiceSettings getServices();
  /**
   * <pre>
   * Specifies the services offered by this shop, digital or physical.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopServiceSettings services = 2;</code>
   */
  io.bloombox.schema.partner.settings.ShopServiceSettingsOrBuilder getServicesOrBuilder();

  /**
   * <pre>
   * Specifies settings that apply to digital and physical sale of goods.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.StorefrontSettings storefront = 3;</code>
   */
  boolean hasStorefront();
  /**
   * <pre>
   * Specifies settings that apply to digital and physical sale of goods.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.StorefrontSettings storefront = 3;</code>
   */
  io.bloombox.schema.partner.settings.StorefrontSettings getStorefront();
  /**
   * <pre>
   * Specifies settings that apply to digital and physical sale of goods.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.StorefrontSettings storefront = 3;</code>
   */
  io.bloombox.schema.partner.settings.StorefrontSettingsOrBuilder getStorefrontOrBuilder();
}
