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
// source: crypto/primitives/Keys.proto

package io.opencannabis.schema.crypto.primitives;

public final class Keys {
  private Keys() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_BlockCipherParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_BlockCipherParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_SymmetricKeyParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_SymmetricKeyParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_AsymmetricKeypairParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_AsymmetricKeypairParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_KeyParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_KeyParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_InitializationVector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_InitializationVector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_SymmetricKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_SymmetricKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_KeyMaterial_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_KeyMaterial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_Keypair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_Keypair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034crypto/primitives/Keys.proto\022\023opencann" +
      "abis.crypto\032!crypto/primitives/Integrity" +
      ".proto\"z\n\025BlockCipherParameters\0223\n\talgor" +
      "ithm\030\001 \001(\0162 .opencannabis.crypto.BlockCi" +
      "pher\022,\n\004mode\030\002 \001(\0162\036.opencannabis.crypto" +
      ".BlockMode\"\224\001\n\026SymmetricKeyParameters\0223\n" +
      "\006stream\030\001 \001(\0162!.opencannabis.crypto.Stre" +
      "amCipherH\000\022;\n\005block\030\002 \001(\0132*.opencannabis" +
      ".crypto.BlockCipherParametersH\000B\010\n\006ciphe" +
      "r\"\200\001\n\033AsymmetricKeypairParameters\0221\n\006sch" +
      "eme\030\001 \001(\0162!.opencannabis.crypto.KeyingSc" +
      "heme\022.\n\013fingerprint\030\002 \001(\0132\031.opencannabis" +
      ".crypto.Hash\"\255\002\n\rKeyParameters\022\021\n\talgori" +
      "thm\030\001 \001(\t\022\016\n\006format\030\002 \001(\t\022\014\n\004bits\030\003 \001(\r\022" +
      "*\n\004type\030\004 \001(\0162\034.opencannabis.crypto.KeyT" +
      "ype\0228\n\013disposition\030\005 \001(\0162#.opencannabis." +
      "crypto.KeyDisposition\0223\n\006scheme\030\n \001(\0162!." +
      "opencannabis.crypto.KeyingSchemeH\000\022@\n\tsy" +
      "mmetric\030\013 \001(\0132+.opencannabis.crypto.Symm" +
      "etricKeyParametersH\000B\016\n\014architecture\"\214\001\n" +
      "\024InitializationVector\022;\n\004mode\030\001 \001(\0162-.op" +
      "encannabis.crypto.InitializationVectorMo" +
      "de\022\r\n\003raw\030\n \001(\014H\000\022\r\n\003b64\030\013 \001(\tH\000\022\020\n\006numb" +
      "er\030\014 \001(\rH\000B\007\n\005value\"y\n\014SymmetricKey\022\014\n\004b" +
      "its\030\001 \001(\r\0225\n\002iv\030\002 \001(\0132).opencannabis.cry" +
      "pto.InitializationVector\022\r\n\003raw\030\n \001(\014H\000\022" +
      "\r\n\003b64\030\013 \001(\tH\000B\006\n\004data\"\227\001\n\013KeyMaterial\022." +
      "\n\013fingerprint\030\001 \001(\0132\031.opencannabis.crypt" +
      "o.Hash\0222\n\006params\030\002 \001(\0132\".opencannabis.cr" +
      "ypto.KeyParameters\022\r\n\003raw\030\n \001(\014H\000\022\r\n\003pem" +
      "\030\013 \001(\tH\000B\006\n\004data\"n\n\007Keypair\0220\n\006public\030\001 " +
      "\001(\0132 .opencannabis.crypto.KeyMaterial\0221\n" +
      "\007private\030\002 \001(\0132 .opencannabis.crypto.Key" +
      "Material*(\n\007KeyType\022\r\n\tSYMMETRIC\020\000\022\016\n\nAS" +
      "YMMETRIC\020\001*8\n\016KeyDisposition\022\013\n\007PRIVATE\020" +
      "\000\022\r\n\tEPHEMERAL\020\001\022\n\n\006PUBLIC\020\002*B\n\013BlockCip" +
      "her\022\034\n\030UNSPECIFIED_BLOCK_CIPHER\020\000\022\007\n\003AES" +
      "\020\001\022\014\n\010CAMELLIA\020\002*M\n\014StreamCipher\022\035\n\031UNSP" +
      "ECIFIED_STREAM_CIPHER\020\000\022\007\n\003RC5\020\001\022\007\n\003RC6\020" +
      "\002\022\014\n\010CHACHA20\020\003*A\n\014KeyAgreement\022\035\n\031UNSPE" +
      "CIFIED_KEY_AGREEMENT\020\000\022\007\n\003DHE\020\001\022\t\n\005ECDHE" +
      "\020\002*x\n\tBlockMode\022\032\n\026UNSPECIFIED_BLOCK_MOD" +
      "E\020\000\022\007\n\003ECB\020\001\022\007\n\003CBC\020\002\022\007\n\003CFB\020\003\022\007\n\003OFB\020\004\022" +
      "\007\n\003CTR\020\005\022\007\n\003CCM\020\006\022\007\n\003GCM\020\007\022\007\n\003XTS\020\010\022\007\n\003K" +
      "WP\020\t*4\n\014KeyingScheme\022\007\n\003RSA\020\000\022\007\n\003ECC\020\001\022\007" +
      "\n\003DSA\020\002\022\t\n\005EdDSA\020\003*@\n\030InitializationVect" +
      "orMode\022\r\n\tSTATIC_IV\020\000\022\010\n\004TOTP\020\001\022\013\n\007COUNT" +
      "ER\020\002B4\n(io.opencannabis.schema.crypto.pr" +
      "imitivesH\001P\001\242\002\003OCSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opencannabis.schema.crypto.primitives.integrity.Integrity.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_crypto_BlockCipherParameters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_crypto_BlockCipherParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_BlockCipherParameters_descriptor,
        new java.lang.String[] { "Algorithm", "Mode", });
    internal_static_opencannabis_crypto_SymmetricKeyParameters_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_crypto_SymmetricKeyParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_SymmetricKeyParameters_descriptor,
        new java.lang.String[] { "Stream", "Block", "Cipher", });
    internal_static_opencannabis_crypto_AsymmetricKeypairParameters_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_crypto_AsymmetricKeypairParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_AsymmetricKeypairParameters_descriptor,
        new java.lang.String[] { "Scheme", "Fingerprint", });
    internal_static_opencannabis_crypto_KeyParameters_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_crypto_KeyParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_KeyParameters_descriptor,
        new java.lang.String[] { "Algorithm", "Format", "Bits", "Type", "Disposition", "Scheme", "Symmetric", "Architecture", });
    internal_static_opencannabis_crypto_InitializationVector_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opencannabis_crypto_InitializationVector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_InitializationVector_descriptor,
        new java.lang.String[] { "Mode", "Raw", "B64", "Number", "Value", });
    internal_static_opencannabis_crypto_SymmetricKey_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opencannabis_crypto_SymmetricKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_SymmetricKey_descriptor,
        new java.lang.String[] { "Bits", "Iv", "Raw", "B64", "Data", });
    internal_static_opencannabis_crypto_KeyMaterial_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opencannabis_crypto_KeyMaterial_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_KeyMaterial_descriptor,
        new java.lang.String[] { "Fingerprint", "Params", "Raw", "Pem", "Data", });
    internal_static_opencannabis_crypto_Keypair_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opencannabis_crypto_Keypair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_Keypair_descriptor,
        new java.lang.String[] { "Public", "Private", });
    io.opencannabis.schema.crypto.primitives.integrity.Integrity.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
