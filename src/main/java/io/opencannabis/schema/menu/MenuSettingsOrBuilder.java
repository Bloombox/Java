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
// source: products/menu/Menu.proto

package io.opencannabis.schema.menu;

public interface MenuSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.products.menu.MenuSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flag indicating a full menu, including hidden/out-of-stock items.
   * </pre>
   *
   * <code>bool full = 1;</code>
   */
  boolean getFull();

  /**
   * <pre>
   * Only include menu keys, no detail data.
   * </pre>
   *
   * <code>bool keys_only = 2;</code>
   */
  boolean getKeysOnly();

  /**
   * <pre>
   * Don't return the menu if it's identical to this fingerprint.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash snapshot = 3;</code>
   */
  boolean hasSnapshot();
  /**
   * <pre>
   * Don't return the menu if it's identical to this fingerprint.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash snapshot = 3;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.Hash getSnapshot();
  /**
   * <pre>
   * Don't return the menu if it's identical to this fingerprint.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash snapshot = 3;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder getSnapshotOrBuilder();

  /**
   * <pre>
   * Bloom filter to consider when returning or processing menu items.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash fingerprint = 4;</code>
   */
  boolean hasFingerprint();
  /**
   * <pre>
   * Bloom filter to consider when returning or processing menu items.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash fingerprint = 4;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.Hash getFingerprint();
  /**
   * <pre>
   * Bloom filter to consider when returning or processing menu items.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash fingerprint = 4;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder getFingerprintOrBuilder();

  /**
   * <pre>
   * Sections to include in the menu. If unspecified, include all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 5;</code>
   */
  java.util.List<io.opencannabis.schema.menu.section.Section> getSectionList();
  /**
   * <pre>
   * Sections to include in the menu. If unspecified, include all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 5;</code>
   */
  int getSectionCount();
  /**
   * <pre>
   * Sections to include in the menu. If unspecified, include all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 5;</code>
   */
  io.opencannabis.schema.menu.section.Section getSection(int index);
  /**
   * <pre>
   * Sections to include in the menu. If unspecified, include all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 5;</code>
   */
  java.util.List<java.lang.Integer>
  getSectionValueList();
  /**
   * <pre>
   * Sections to include in the menu. If unspecified, include all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 5;</code>
   */
  int getSectionValue(int index);

  /**
   * <pre>
   * Hint for other available sections. Included on a sectioned menu payload with only one section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section available_section = 6;</code>
   */
  java.util.List<io.opencannabis.schema.menu.section.Section> getAvailableSectionList();
  /**
   * <pre>
   * Hint for other available sections. Included on a sectioned menu payload with only one section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section available_section = 6;</code>
   */
  int getAvailableSectionCount();
  /**
   * <pre>
   * Hint for other available sections. Included on a sectioned menu payload with only one section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section available_section = 6;</code>
   */
  io.opencannabis.schema.menu.section.Section getAvailableSection(int index);
  /**
   * <pre>
   * Hint for other available sections. Included on a sectioned menu payload with only one section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section available_section = 6;</code>
   */
  java.util.List<java.lang.Integer>
  getAvailableSectionValueList();
  /**
   * <pre>
   * Hint for other available sections. Included on a sectioned menu payload with only one section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section available_section = 6;</code>
   */
  int getAvailableSectionValue(int index);
}
