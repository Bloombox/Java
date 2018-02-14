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
// source: partner/PartnerScope.proto

package io.bloombox.schema.partner;

/**
 * <pre>
 * Specifies authentication scopes at the partner level.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.partner.PartnerScope}
 */
public enum PartnerScope
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Basic authentication as a member of a partner. This includes partner staff, managers, owners, and so on.
   * </pre>
   *
   * <code>AUTH = 0;</code>
   */
  AUTH(0),
  /**
   * <pre>
   * Authorizes the sharing of contact information related to a partner account.
   * </pre>
   *
   * <code>CONTACT = 1;</code>
   */
  CONTACT(1),
  /**
   * <pre>
   * Authorizes access to the Dashboard for a given partner account.
   * </pre>
   *
   * <code>DASHBOARD = 2;</code>
   */
  DASHBOARD(2),
  /**
   * <pre>
   * Authorizes access to read menu data for a given partner account.
   * </pre>
   *
   * <code>MENU_DATA_READ = 10;</code>
   */
  MENU_DATA_READ(10),
  /**
   * <pre>
   * Authorizes access to write menu data for a given partner account.
   * </pre>
   *
   * <code>MENU_DATA_WRITE = 20;</code>
   */
  MENU_DATA_WRITE(20),
  /**
   * <pre>
   * Authorizes access to read partner-level settings.
   * </pre>
   *
   * <code>SETTINGS_READ = 50;</code>
   */
  SETTINGS_READ(50),
  /**
   * <pre>
   * Authorizes access to write to partner-level settings.
   * </pre>
   *
   * <code>SETTINGS_WRITE = 51;</code>
   */
  SETTINGS_WRITE(51),
  /**
   * <pre>
   * Specifies complete and total admin access to a given partner account.
   * </pre>
   *
   * <code>ADMIN = 100;</code>
   */
  ADMIN(100),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Basic authentication as a member of a partner. This includes partner staff, managers, owners, and so on.
   * </pre>
   *
   * <code>AUTH = 0;</code>
   */
  public static final int AUTH_VALUE = 0;
  /**
   * <pre>
   * Authorizes the sharing of contact information related to a partner account.
   * </pre>
   *
   * <code>CONTACT = 1;</code>
   */
  public static final int CONTACT_VALUE = 1;
  /**
   * <pre>
   * Authorizes access to the Dashboard for a given partner account.
   * </pre>
   *
   * <code>DASHBOARD = 2;</code>
   */
  public static final int DASHBOARD_VALUE = 2;
  /**
   * <pre>
   * Authorizes access to read menu data for a given partner account.
   * </pre>
   *
   * <code>MENU_DATA_READ = 10;</code>
   */
  public static final int MENU_DATA_READ_VALUE = 10;
  /**
   * <pre>
   * Authorizes access to write menu data for a given partner account.
   * </pre>
   *
   * <code>MENU_DATA_WRITE = 20;</code>
   */
  public static final int MENU_DATA_WRITE_VALUE = 20;
  /**
   * <pre>
   * Authorizes access to read partner-level settings.
   * </pre>
   *
   * <code>SETTINGS_READ = 50;</code>
   */
  public static final int SETTINGS_READ_VALUE = 50;
  /**
   * <pre>
   * Authorizes access to write to partner-level settings.
   * </pre>
   *
   * <code>SETTINGS_WRITE = 51;</code>
   */
  public static final int SETTINGS_WRITE_VALUE = 51;
  /**
   * <pre>
   * Specifies complete and total admin access to a given partner account.
   * </pre>
   *
   * <code>ADMIN = 100;</code>
   */
  public static final int ADMIN_VALUE = 100;


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
  public static PartnerScope valueOf(int value) {
    return forNumber(value);
  }

  public static PartnerScope forNumber(int value) {
    switch (value) {
      case 0: return AUTH;
      case 1: return CONTACT;
      case 2: return DASHBOARD;
      case 10: return MENU_DATA_READ;
      case 20: return MENU_DATA_WRITE;
      case 50: return SETTINGS_READ;
      case 51: return SETTINGS_WRITE;
      case 100: return ADMIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartnerScope>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartnerScope> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartnerScope>() {
          public PartnerScope findValueByNumber(int number) {
            return PartnerScope.forNumber(number);
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
    return io.bloombox.schema.partner.PartnerScopeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PartnerScope[] VALUES = values();

  public static PartnerScope valueOf(
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

  private PartnerScope(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.partner.PartnerScope)
}

