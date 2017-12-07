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
// source: temporal/Date.proto

package io.bloombox.schema.temporal;

public interface DateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:temporal.Date)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ISO8601 date format.
   * </pre>
   *
   * <code>string iso8601 = 1;</code>
   */
  java.lang.String getIso8601();
  /**
   * <pre>
   * ISO8601 date format.
   * </pre>
   *
   * <code>string iso8601 = 1;</code>
   */
  com.google.protobuf.ByteString
      getIso8601Bytes();

  public io.bloombox.schema.temporal.Date.SpecCase getSpecCase();
}