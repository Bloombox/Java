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
// source: crypto/primitives/Integrity.proto

package io.opencannabis.schema.crypto.primitives.integrity;

public interface HashOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.crypto.Hash)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the algorithm in use.
   * </pre>
   *
   * <code>.opencannabis.crypto.HashAlgorithm algorithm = 1;</code>
   */
  int getAlgorithmValue();
  /**
   * <pre>
   * Specifies the algorithm in use.
   * </pre>
   *
   * <code>.opencannabis.crypto.HashAlgorithm algorithm = 1;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.HashAlgorithm getAlgorithm();

  /**
   * <pre>
   * Raw binary output of the hash algorithm.
   * </pre>
   *
   * <code>bytes raw = 2;</code>
   */
  com.google.protobuf.ByteString getRaw();

  /**
   * <pre>
   * Hex-encoded digest value.
   * </pre>
   *
   * <code>string hex = 3;</code>
   */
  java.lang.String getHex();
  /**
   * <pre>
   * Hex-encoded digest value.
   * </pre>
   *
   * <code>string hex = 3;</code>
   */
  com.google.protobuf.ByteString
      getHexBytes();

  /**
   * <pre>
   * Base64-encoded digest value.
   * </pre>
   *
   * <code>string b64 = 4;</code>
   */
  java.lang.String getB64();
  /**
   * <pre>
   * Base64-encoded digest value.
   * </pre>
   *
   * <code>string b64 = 4;</code>
   */
  com.google.protobuf.ByteString
      getB64Bytes();

  public io.opencannabis.schema.crypto.primitives.integrity.Hash.DigestCase getDigestCase();
}
