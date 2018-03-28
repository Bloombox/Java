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
// source: content/Name.proto

package io.opencannabis.schema.content;

public interface NameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.content.Name)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Primary name.
   * </pre>
   *
   * <code>string primary = 1;</code>
   */
  java.lang.String getPrimary();
  /**
   * <pre>
   * Primary name.
   * </pre>
   *
   * <code>string primary = 1;</code>
   */
  com.google.protobuf.ByteString
      getPrimaryBytes();

  /**
   * <pre>
   * Display name, if different from the 'primary name'.
   * </pre>
   *
   * <code>string display = 2;</code>
   */
  java.lang.String getDisplay();
  /**
   * <pre>
   * Display name, if different from the 'primary name'.
   * </pre>
   *
   * <code>string display = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayBytes();
}
