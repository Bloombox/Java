// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

public interface CannabinoidsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.labtesting.Cannabinoids)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opencannabis.structs.labtesting.TestValue thc = 1;</code>
   */
  boolean hasThc();
  /**
   * <code>.opencannabis.structs.labtesting.TestValue thc = 1;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValue getThc();
  /**
   * <code>.opencannabis.structs.labtesting.TestValue thc = 1;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValueOrBuilder getThcOrBuilder();

  /**
   * <code>.opencannabis.structs.labtesting.TestValue cbd = 2;</code>
   */
  boolean hasCbd();
  /**
   * <code>.opencannabis.structs.labtesting.TestValue cbd = 2;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValue getCbd();
  /**
   * <code>.opencannabis.structs.labtesting.TestValue cbd = 2;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValueOrBuilder getCbdOrBuilder();

  /**
   * <code>repeated .opencannabis.structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.testing.Cannabinoids.Result> 
      getResultsList();
  /**
   * <code>repeated .opencannabis.structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  io.opencannabis.schema.product.struct.testing.Cannabinoids.Result getResults(int index);
  /**
   * <code>repeated .opencannabis.structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .opencannabis.structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  java.util.List<? extends io.opencannabis.schema.product.struct.testing.Cannabinoids.ResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .opencannabis.structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  io.opencannabis.schema.product.struct.testing.Cannabinoids.ResultOrBuilder getResultsOrBuilder(
      int index);
}
