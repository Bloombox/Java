/*
 * Copyright 2017, Bloombox, LLC.
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
// source: structs/labtesting/TestResults.proto

package io.bloombox.schema.product.struct.testing;

public interface SubjectiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:structs.labtesting.Subjective)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.content.Content description = 1;</code>
   */
  boolean hasDescription();
  /**
   * <code>.content.Content description = 1;</code>
   */
  io.bloombox.schema.content.Content getDescription();
  /**
   * <code>.content.Content description = 1;</code>
   */
  io.bloombox.schema.content.ContentOrBuilder getDescriptionOrBuilder();

  /**
   * <code>.content.Content taste = 2;</code>
   */
  boolean hasTaste();
  /**
   * <code>.content.Content taste = 2;</code>
   */
  io.bloombox.schema.content.Content getTaste();
  /**
   * <code>.content.Content taste = 2;</code>
   */
  io.bloombox.schema.content.ContentOrBuilder getTasteOrBuilder();

  /**
   * <code>.structs.labtesting.PotencyEstimate potency = 3;</code>
   */
  int getPotencyValue();
  /**
   * <code>.structs.labtesting.PotencyEstimate potency = 3;</code>
   */
  io.bloombox.schema.product.struct.testing.PotencyEstimate getPotency();

  /**
   * <code>repeated .structs.labtesting.Feeling feeling_tags = 4;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.Feeling> getFeelingTagsList();
  /**
   * <code>repeated .structs.labtesting.Feeling feeling_tags = 4;</code>
   */
  int getFeelingTagsCount();
  /**
   * <code>repeated .structs.labtesting.Feeling feeling_tags = 4;</code>
   */
  io.bloombox.schema.product.struct.testing.Feeling getFeelingTags(int index);
  /**
   * <code>repeated .structs.labtesting.Feeling feeling_tags = 4;</code>
   */
  java.util.List<java.lang.Integer>
  getFeelingTagsValueList();
  /**
   * <code>repeated .structs.labtesting.Feeling feeling_tags = 4;</code>
   */
  int getFeelingTagsValue(int index);

  /**
   * <code>repeated .structs.labtesting.TasteNote tasting_notes = 5;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.TasteNote> getTastingNotesList();
  /**
   * <code>repeated .structs.labtesting.TasteNote tasting_notes = 5;</code>
   */
  int getTastingNotesCount();
  /**
   * <code>repeated .structs.labtesting.TasteNote tasting_notes = 5;</code>
   */
  io.bloombox.schema.product.struct.testing.TasteNote getTastingNotes(int index);
  /**
   * <code>repeated .structs.labtesting.TasteNote tasting_notes = 5;</code>
   */
  java.util.List<java.lang.Integer>
  getTastingNotesValueList();
  /**
   * <code>repeated .structs.labtesting.TasteNote tasting_notes = 5;</code>
   */
  int getTastingNotesValue(int index);
}
