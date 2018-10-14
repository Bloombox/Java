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
// source: crypto/primitives/Keypair.proto

package io.opencannabis.schema.crypto.primitives.pki;

public interface KeyMaterialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.crypto.primitives.pki.KeyMaterial)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cryptographic hash of the key in question.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash fingerprint = 1;</code>
   */
  boolean hasFingerprint();
  /**
   * <pre>
   * Cryptographic hash of the key in question.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash fingerprint = 1;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.Hash getFingerprint();
  /**
   * <pre>
   * Cryptographic hash of the key in question.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.integrity.Hash fingerprint = 1;</code>
   */
  io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder getFingerprintOrBuilder();

  /**
   * <pre>
   * Parameters regarding the subject key.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.pki.KeyParameters params = 2;</code>
   */
  boolean hasParams();
  /**
   * <pre>
   * Parameters regarding the subject key.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.pki.KeyParameters params = 2;</code>
   */
  io.opencannabis.schema.crypto.primitives.pki.KeyParameters getParams();
  /**
   * <pre>
   * Parameters regarding the subject key.
   * </pre>
   *
   * <code>.opencannabis.crypto.primitives.pki.KeyParameters params = 2;</code>
   */
  io.opencannabis.schema.crypto.primitives.pki.KeyParametersOrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * Raw bytes of the key itself.
   * </pre>
   *
   * <code>bytes raw = 10;</code>
   */
  com.google.protobuf.ByteString getRaw();

  /**
   * <pre>
   * Key, encoded in PEM format.
   * </pre>
   *
   * <code>string pem = 11;</code>
   */
  java.lang.String getPem();
  /**
   * <pre>
   * Key, encoded in PEM format.
   * </pre>
   *
   * <code>string pem = 11;</code>
   */
  com.google.protobuf.ByteString
      getPemBytes();

  public io.opencannabis.schema.crypto.primitives.pki.KeyMaterial.DataCase getDataCase();
}
