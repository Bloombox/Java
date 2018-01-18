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
// source: structs/labtesting/TestResults.proto

package io.bloombox.schema.product.struct.testing;

public interface TestResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:structs.labtesting.TestResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool available = 1;</code>
   */
  boolean getAvailable();

  /**
   * <code>repeated .structs.labtesting.TestMedia media = 2;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.TestMedia> 
      getMediaList();
  /**
   * <code>repeated .structs.labtesting.TestMedia media = 2;</code>
   */
  io.bloombox.schema.product.struct.testing.TestMedia getMedia(int index);
  /**
   * <code>repeated .structs.labtesting.TestMedia media = 2;</code>
   */
  int getMediaCount();
  /**
   * <code>repeated .structs.labtesting.TestMedia media = 2;</code>
   */
  java.util.List<? extends io.bloombox.schema.product.struct.testing.TestMediaOrBuilder> 
      getMediaOrBuilderList();
  /**
   * <code>repeated .structs.labtesting.TestMedia media = 2;</code>
   */
  io.bloombox.schema.product.struct.testing.TestMediaOrBuilder getMediaOrBuilder(
      int index);

  /**
   * <code>.temporal.Instant last_updated = 3;</code>
   */
  boolean hasLastUpdated();
  /**
   * <code>.temporal.Instant last_updated = 3;</code>
   */
  io.bloombox.schema.temporal.Instant getLastUpdated();
  /**
   * <code>.temporal.Instant last_updated = 3;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getLastUpdatedOrBuilder();

  /**
   * <pre>
   * --- Testing Extensions
   * </pre>
   *
   * <code>.structs.labtesting.Cannabinoids cannabinoids = 30;</code>
   */
  boolean hasCannabinoids();
  /**
   * <pre>
   * --- Testing Extensions
   * </pre>
   *
   * <code>.structs.labtesting.Cannabinoids cannabinoids = 30;</code>
   */
  io.bloombox.schema.product.struct.testing.Cannabinoids getCannabinoids();
  /**
   * <pre>
   * --- Testing Extensions
   * </pre>
   *
   * <code>.structs.labtesting.Cannabinoids cannabinoids = 30;</code>
   */
  io.bloombox.schema.product.struct.testing.CannabinoidsOrBuilder getCannabinoidsOrBuilder();

  /**
   * <code>.structs.labtesting.Terpenes terpenes = 31;</code>
   */
  boolean hasTerpenes();
  /**
   * <code>.structs.labtesting.Terpenes terpenes = 31;</code>
   */
  io.bloombox.schema.product.struct.testing.Terpenes getTerpenes();
  /**
   * <code>.structs.labtesting.Terpenes terpenes = 31;</code>
   */
  io.bloombox.schema.product.struct.testing.TerpenesOrBuilder getTerpenesOrBuilder();

  /**
   * <code>.structs.labtesting.Pesticides pesticides = 32;</code>
   */
  boolean hasPesticides();
  /**
   * <code>.structs.labtesting.Pesticides pesticides = 32;</code>
   */
  io.bloombox.schema.product.struct.testing.Pesticides getPesticides();
  /**
   * <code>.structs.labtesting.Pesticides pesticides = 32;</code>
   */
  io.bloombox.schema.product.struct.testing.PesticidesOrBuilder getPesticidesOrBuilder();

  /**
   * <code>.structs.labtesting.Moisture moisture = 33;</code>
   */
  boolean hasMoisture();
  /**
   * <code>.structs.labtesting.Moisture moisture = 33;</code>
   */
  io.bloombox.schema.product.struct.testing.Moisture getMoisture();
  /**
   * <code>.structs.labtesting.Moisture moisture = 33;</code>
   */
  io.bloombox.schema.product.struct.testing.MoistureOrBuilder getMoistureOrBuilder();

  /**
   * <code>repeated .structs.labtesting.TasteNote aroma = 34;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.TasteNote> getAromaList();
  /**
   * <code>repeated .structs.labtesting.TasteNote aroma = 34;</code>
   */
  int getAromaCount();
  /**
   * <code>repeated .structs.labtesting.TasteNote aroma = 34;</code>
   */
  io.bloombox.schema.product.struct.testing.TasteNote getAroma(int index);
  /**
   * <code>repeated .structs.labtesting.TasteNote aroma = 34;</code>
   */
  java.util.List<java.lang.Integer>
  getAromaValueList();
  /**
   * <code>repeated .structs.labtesting.TasteNote aroma = 34;</code>
   */
  int getAromaValue(int index);

  /**
   * <code>.structs.labtesting.Subjective subjective = 35;</code>
   */
  boolean hasSubjective();
  /**
   * <code>.structs.labtesting.Subjective subjective = 35;</code>
   */
  io.bloombox.schema.product.struct.testing.Subjective getSubjective();
  /**
   * <code>.structs.labtesting.Subjective subjective = 35;</code>
   */
  io.bloombox.schema.product.struct.testing.SubjectiveOrBuilder getSubjectiveOrBuilder();
}
