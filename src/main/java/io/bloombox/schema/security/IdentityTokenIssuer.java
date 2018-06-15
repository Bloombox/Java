// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security/IdentityToken.proto

package io.bloombox.schema.security;

/**
 * <pre>
 * Enumerates identity token issuers, or authorizing IdPs (Identity Providers). Internal authorization refers to systems
 * internal to Bloombox, where a system account is authorizing some resource. Otherwise, Firebase is the main auth
 * mechanism for end-users.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.security.IdentityTokenIssuer}
 */
public enum IdentityTokenIssuer
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Internal, Bloombox-system account authentication.
   * </pre>
   *
   * <code>INTERNAL = 0;</code>
   */
  INTERNAL(0),
  /**
   * <pre>
   * Firebase end-user authentication.
   * </pre>
   *
   * <code>FIREBASE = 1;</code>
   */
  FIREBASE(1),
  /**
   * <pre>
   * Auth0-powered authentication.
   * </pre>
   *
   * <code>AUTH0 = 2;</code>
   */
  AUTH0(2),
  /**
   * <pre>
   * GSuite-powered authentication.
   * </pre>
   *
   * <code>GOOGLE = 3;</code>
   */
  GOOGLE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Internal, Bloombox-system account authentication.
   * </pre>
   *
   * <code>INTERNAL = 0;</code>
   */
  public static final int INTERNAL_VALUE = 0;
  /**
   * <pre>
   * Firebase end-user authentication.
   * </pre>
   *
   * <code>FIREBASE = 1;</code>
   */
  public static final int FIREBASE_VALUE = 1;
  /**
   * <pre>
   * Auth0-powered authentication.
   * </pre>
   *
   * <code>AUTH0 = 2;</code>
   */
  public static final int AUTH0_VALUE = 2;
  /**
   * <pre>
   * GSuite-powered authentication.
   * </pre>
   *
   * <code>GOOGLE = 3;</code>
   */
  public static final int GOOGLE_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static IdentityTokenIssuer valueOf(int value) {
    return forNumber(value);
  }

  public static IdentityTokenIssuer forNumber(int value) {
    switch (value) {
      case 0: return INTERNAL;
      case 1: return FIREBASE;
      case 2: return AUTH0;
      case 3: return GOOGLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentityTokenIssuer>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IdentityTokenIssuer> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IdentityTokenIssuer>() {
          public IdentityTokenIssuer findValueByNumber(int number) {
            return IdentityTokenIssuer.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.bloombox.schema.security.IdentityTokenOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final IdentityTokenIssuer[] VALUES = values();

  public static IdentityTokenIssuer valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IdentityTokenIssuer(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.security.IdentityTokenIssuer)
}

