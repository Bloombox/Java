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
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

public interface SubjectiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.labtesting.Subjective)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Subjective description of using this product.
   * </pre>
   *
   * <code>.opencannabis.content.Content description = 1;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * Subjective description of using this product.
   * </pre>
   *
   * <code>.opencannabis.content.Content description = 1;</code>
   */
  io.opencannabis.schema.content.GenericContent.Content getDescription();
  /**
   * <pre>
   * Subjective description of using this product.
   * </pre>
   *
   * <code>.opencannabis.content.Content description = 1;</code>
   */
  io.opencannabis.schema.content.GenericContent.ContentOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Subjective description of the taste of this product.
   * </pre>
   *
   * <code>.opencannabis.content.Content taste = 2;</code>
   */
  boolean hasTaste();
  /**
   * <pre>
   * Subjective description of the taste of this product.
   * </pre>
   *
   * <code>.opencannabis.content.Content taste = 2;</code>
   */
  io.opencannabis.schema.content.GenericContent.Content getTaste();
  /**
   * <pre>
   * Subjective description of the taste of this product.
   * </pre>
   *
   * <code>.opencannabis.content.Content taste = 2;</code>
   */
  io.opencannabis.schema.content.GenericContent.ContentOrBuilder getTasteOrBuilder();

  /**
   * <pre>
   * Subjective potency estimate for this product.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.PotencyEstimate potency = 3;</code>
   */
  int getPotencyValue();
  /**
   * <pre>
   * Subjective potency estimate for this product.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.PotencyEstimate potency = 3;</code>
   */
  io.opencannabis.schema.product.struct.testing.PotencyEstimate getPotency();

  /**
   * <pre>
   * Subjective feeling tags for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 4;</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.testing.Feeling> getFeelingList();
  /**
   * <pre>
   * Subjective feeling tags for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 4;</code>
   */
  int getFeelingCount();
  /**
   * <pre>
   * Subjective feeling tags for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 4;</code>
   */
  io.opencannabis.schema.product.struct.testing.Feeling getFeeling(int index);
  /**
   * <pre>
   * Subjective feeling tags for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 4;</code>
   */
  java.util.List<java.lang.Integer>
  getFeelingValueList();
  /**
   * <pre>
   * Subjective feeling tags for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 4;</code>
   */
  int getFeelingValue(int index);

  /**
   * <pre>
   * Subjective taste or aroma notes for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote aroma = 5;</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.testing.TasteNote> getAromaList();
  /**
   * <pre>
   * Subjective taste or aroma notes for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote aroma = 5;</code>
   */
  int getAromaCount();
  /**
   * <pre>
   * Subjective taste or aroma notes for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote aroma = 5;</code>
   */
  io.opencannabis.schema.product.struct.testing.TasteNote getAroma(int index);
  /**
   * <pre>
   * Subjective taste or aroma notes for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote aroma = 5;</code>
   */
  java.util.List<java.lang.Integer>
  getAromaValueList();
  /**
   * <pre>
   * Subjective taste or aroma notes for this product.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote aroma = 5;</code>
   */
  int getAromaValue(int index);
}
