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

public interface ProductBrandSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.ProductBrandSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  java.util.List<io.bloombox.schema.partner.settings.InHouseBrand> 
      getInhouseList();
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  io.bloombox.schema.partner.settings.InHouseBrand getInhouse(int index);
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  int getInhouseCount();
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  java.util.List<? extends io.bloombox.schema.partner.settings.InHouseBrandOrBuilder> 
      getInhouseOrBuilderList();
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  io.bloombox.schema.partner.settings.InHouseBrandOrBuilder getInhouseOrBuilder(
      int index);
}
