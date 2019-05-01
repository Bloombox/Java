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
// source: structs/Version.proto

package io.opencannabis.schema.struct;

public interface VersionSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.VersionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version specified by arbitrary name.
   * </pre>
   *
   * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Version specified by arbitrary name.
   * </pre>
   *
   * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  public io.opencannabis.schema.struct.VersionSpec.SpecCase getSpecCase();
}
