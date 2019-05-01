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
// source: products/menu/Section.proto

package io.opencannabis.schema.menu.section;

public interface CustomSectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.products.menu.section.CustomSection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String ID for a custom section.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * String ID for a custom section.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Filtered section specification.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.FilteredSection filter = 2;</code>
   */
  int getFilterValue();
  /**
   * <pre>
   * Filtered section specification.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.FilteredSection filter = 2;</code>
   */
  io.opencannabis.schema.menu.section.FilteredSection getFilter();
}
