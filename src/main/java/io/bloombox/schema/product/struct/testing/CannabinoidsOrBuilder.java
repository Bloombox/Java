// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestResults.proto

package io.bloombox.schema.product.struct.testing;

public interface CannabinoidsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:structs.labtesting.Cannabinoids)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.structs.labtesting.TestValue thc = 1;</code>
   */
  boolean hasThc();
  /**
   * <code>.structs.labtesting.TestValue thc = 1;</code>
   */
  io.bloombox.schema.product.struct.testing.TestValue getThc();
  /**
   * <code>.structs.labtesting.TestValue thc = 1;</code>
   */
  io.bloombox.schema.product.struct.testing.TestValueOrBuilder getThcOrBuilder();

  /**
   * <code>.structs.labtesting.TestValue cbd = 2;</code>
   */
  boolean hasCbd();
  /**
   * <code>.structs.labtesting.TestValue cbd = 2;</code>
   */
  io.bloombox.schema.product.struct.testing.TestValue getCbd();
  /**
   * <code>.structs.labtesting.TestValue cbd = 2;</code>
   */
  io.bloombox.schema.product.struct.testing.TestValueOrBuilder getCbdOrBuilder();

  /**
   * <code>repeated .structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.Cannabinoids.Result> 
      getResultsList();
  /**
   * <code>repeated .structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  io.bloombox.schema.product.struct.testing.Cannabinoids.Result getResults(int index);
  /**
   * <code>repeated .structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  java.util.List<? extends io.bloombox.schema.product.struct.testing.Cannabinoids.ResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .structs.labtesting.Cannabinoids.Result results = 3;</code>
   */
  io.bloombox.schema.product.struct.testing.Cannabinoids.ResultOrBuilder getResultsOrBuilder(
      int index);
}
