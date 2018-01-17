/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_UserKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_UserKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_User_IdentitiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_User_IdentitiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_User_MediaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_User_MediaEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_UserFlags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_UserFlags_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_UserIdentity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_UserIdentity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ConsumerProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ConsumerProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_MenuPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_MenuPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ConsumerPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ConsumerPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ConsumerMembership_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ConsumerMembership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_IndustryProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_IndustryProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_IndustryProfile_PartnersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_IndustryProfile_PartnersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023identity/User.proto\022\010identity\032\016bq_fiel" +
      "d.proto\032\025media/MediaItem.proto\032\026temporal" +
      "/Instant.proto\032\023person/Person.proto\032\021ide" +
      "ntity/ID.proto\032 identity/ids/UserDoctorR" +
      "ec.proto\032\033products/menu/Section.proto\032\022s" +
      "tructs/Grow.proto\032\025structs/Species.proto" +
      "\032$structs/labtesting/TestResults.proto\032(" +
      "security/access/PartnerPermissions.proto" +
      "\"g\n\007UserKey\022\'\n\003uid\030\001 \001(\tB\032\212@\027Unique ID f" +
      "or the user.\0223\n\010identity\030\002 \001(\tB!\212@\036Speci" +
      "fic user identity in use.\"\230\010\n\004User\022\'\n\003ui" +
      "d\030\001 \001(\tB\032\212@\027Unique ID for the user.\022C\n\005f" +
      "lags\030\002 \001(\0132\023.identity.UserFlagsB\037\212@\034Bool" +
      "ean flags for this user.\022M\n\006person\030\003 \001(\013" +
      "2\016.person.PersonB-\212@*Person\'s informatio" +
      "n that backs this user.\022T\n\016identificatio" +
      "n\030\024 \003(\0132\014.identity.IDB.\200@\001\212@(Government " +
      "ID associated with this user.\022j\n\ndoctor_" +
      "rec\030\025 \003(\0132\033.identity.ids.UserDoctorRecB9" +
      "\200@\001\212@3Doctor\'s recommendations associate" +
      "d with this user.\022`\n\004seen\030\036 \001(\0132\021.tempor" +
      "al.InstantB?\212@<Last time this user was s" +
      "een, via auth/login/enrollment etc.\022O\n\006s" +
      "ignup\030\037 \001(\0132\021.temporal.InstantB,\212@)Times" +
      "tamp for when this user was created.\022_\n\n" +
      "identities\030( \003(\0132\036.identity.User.Identit" +
      "iesEntryB+\200@\001\212@%Identities associated wi" +
      "th this user.\022P\n\005media\030) \003(\0132\031.identity." +
      "User.MediaEntryB&\200@\001\212@ Media associated " +
      "with this user.\022O\n\010consumer\030d \001(\0132\031.iden" +
      "tity.ConsumerProfileB\"\212@\037Consumer profil" +
      "e for this user.\022O\n\010industry\030e \001(\0132\031.ide" +
      "ntity.IndustryProfileB\"\212@\037Industry profi" +
      "le for this user.\032I\n\017IdentitiesEntry\022\013\n\003" +
      "key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.identity.User" +
      "Identity:\0028\001\032>\n\nMediaEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\037\n\005value\030\002 \001(\0132\020.media.MediaItem:\0028\001\"\367\002\n" +
      "\tUserFlags\022D\n\tvalidated\030\001 \001(\010B1\212@.Indica" +
      "tes that the account has been validated." +
      "\022H\n\tsuspended\030\002 \001(\010B5\212@2Indicates that t" +
      "he account is currently suspended.\022B\n\005ad" +
      "min\030\003 \001(\010B3\212@0Indicates that the account" +
      " has admin privileges.\022G\n\004beta\030\004 \001(\010B9\212@" +
      "6Indicates that the account has access t" +
      "o beta systems.\022M\n\007sandbox\030\005 \001(\010B<\212@9Ind" +
      "icates that the account has access to sa" +
      "ndbox systems.\"\255\002\n\014UserIdentity\022\\\n\010provi" +
      "der\030\001 \001(\0162\032.identity.IdentityProviderB.\212" +
      "@+Provider for this external/foreign acc" +
      "ount.\022F\n\002id\030\002 \001(\tB:\212@7Unique ID for this" +
      " account with the specified provider.\022w\n" +
      "\004seen\030\003 \001(\0132\021.temporal.InstantBV\212@STimes" +
      "tamp for when this identity was last use" +
      "r to authenticate the underlying user.\"\312" +
      "\003\n\017ConsumerProfile\0220\n\006active\030\001 \001(\010B \212@\035P" +
      "rofile active/inactive flag.\022N\n\025favorite" +
      "_dispensaries\030\002 \003(\tB/\212@,Enumerates favor" +
      "ite dispensaries for a user.\022n\n\021enrollme" +
      "nt_source\030\003 \001(\0162\032.identity.EnrollmentSou" +
      "rceB7\212@4Specifies enrollment source attr" +
      "ibution information.\022a\n\022enrollment_chann" +
      "el\030\004 \001(\tBE\212@BArbitrary string for the ch" +
      "annel through which this user enrolled.\022" +
      "b\n\013preferences\030\005 \001(\0132\035.identity.Consumer" +
      "PreferencesB.\212@+Preferences attached to " +
      "a consumer account.\"\315\004\n\017MenuPreferences\022" +
      "]\n\007section\030\001 \003(\0162\036.products.menu.section" +
      ".SectionB,\212@)Preferred menu sections or " +
      "product types.\022[\n\007feeling\030\002 \003(\0162\033.struct" +
      "s.labtesting.FeelingB-\212@*Preferred feeli" +
      "ngs or experiential states.\022N\n\ntaste_not" +
      "e\030\003 \003(\0162\035.structs.labtesting.TasteNoteB\033" +
      "\212@\030Preferred tasting notes.\022W\n\017desired_p" +
      "otency\030\004 \001(\0162#.structs.labtesting.Potenc" +
      "yEstimateB\031\212@\026Desired potency level.\022^\n\021" +
      "cannabinoid_ratio\030\005 \001(\0162$.structs.labtes" +
      "ting.CannabinoidRatioB\035\212@\032Desired cannab" +
      "inoid ratio.\022>\n\007species\030\006 \003(\0162\020.structs." +
      "SpeciesB\033\212@\030Preferred species types.\0225\n\004" +
      "grow\030\007 \003(\0162\r.structs.GrowB\030\212@\025Preferred " +
      "grow types.\"t\n\023ConsumerPreferences\022]\n\004me" +
      "nu\030\n \001(\0132\031.identity.MenuPreferencesB4\212@1" +
      "Preferred menu sections/product types, a" +
      "nd so on.\"\341\003\n\022ConsumerMembership\022\\\n\017refe" +
      "rral_source\030\001 \001(\0162\032.identity.EnrollmentS" +
      "ourceB\'\212@$Referral source for this enrol" +
      "lment.\022^\n\020referral_channel\030\002 \001(\tBD\212@ARef" +
      "erral channel token - an artbirary, end-" +
      "system provided value.\022U\n\014signed_up_at\030\003" +
      " \001(\0132\021.temporal.InstantB,\212@)Timestamp fo" +
      "r when this profile enrolled.\022R\n\004seen\030\004 " +
      "\001(\0132\021.temporal.InstantB1\212@.Timestamp for" +
      " when this profile was last seen.\022b\n\nfor" +
      "eign_id\030\005 \001(\tBN\212@KForeign ID for this me" +
      "mbership, in the partner-colocated membe" +
      "rship system.\"\206\002\n\017IndustryProfile\0222\n\006act" +
      "ive\030\001 \001(\010B\"\212@\037Profile inactive/active st" +
      "atus.\022n\n\010partners\030\002 \003(\0132\'.identity.Indus" +
      "tryProfile.PartnersEntryB3\212@0Map of part" +
      "ner accesses levels to partner codes.\032O\n" +
      "\rPartnersEntry\022\013\n\003key\030\001 \001(\t\022-\n\005value\030\002 \001" +
      "(\0132\036.security.access.PartnerAccess:\0028\001*A" +
      "\n\rUserMediaType\022\013\n\007PICTURE\020\000\022\023\n\017DRIVERS_" +
      "LICENSE\020\001\022\016\n\nDOCTOR_REC\020\002*D\n\020IdentityPro" +
      "vider\022\t\n\005EMAIL\020\000\022\n\n\006GOOGLE\020\001\022\014\n\010FACEBOOK" +
      "\020\002\022\013\n\007TWITTER\020\003*l\n\020EnrollmentSource\022\017\n\013U" +
      "NSPECIFIED\020\000\022\n\n\006ONLINE\020\001\022\020\n\014INTERNAL_APP" +
      "\020\002\022\017\n\013PARTNER_APP\020\003\022\014\n\010IN_STORE\020\004\022\n\n\006IMP" +
      "ORT\020\005B!\n\033io.bloombox.schema.identityH\001P\001" +
      "b\006proto3"
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
          gen_bq_schema.BqField.getDescriptor(),
          io.bloombox.schema.media.AttachedMedia.getDescriptor(),
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.person.PersonOuterClass.getDescriptor(),
          io.bloombox.schema.identity.IDOuterClass.getDescriptor(),
          io.bloombox.schema.identity.ids.UserDoctorRecOuterClass.getDescriptor(),
          io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor(),
          io.bloombox.schema.product.struct.MaterialGrow.getDescriptor(),
          io.bloombox.schema.product.struct.MaterialSpecies.getDescriptor(),
          io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor(),
          io.bloombox.schema.security.access.PartnerPermissions.getDescriptor(),
        }, assigner);
    internal_static_identity_UserKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identity_UserKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_UserKey_descriptor,
        new java.lang.String[] { "Uid", "Identity", });
    internal_static_identity_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_identity_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_User_descriptor,
        new java.lang.String[] { "Uid", "Flags", "Person", "Identification", "DoctorRec", "Seen", "Signup", "Identities", "Media", "Consumer", "Industry", });
    internal_static_identity_User_IdentitiesEntry_descriptor =
      internal_static_identity_User_descriptor.getNestedTypes().get(0);
    internal_static_identity_User_IdentitiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_User_IdentitiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_identity_User_MediaEntry_descriptor =
      internal_static_identity_User_descriptor.getNestedTypes().get(1);
    internal_static_identity_User_MediaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_User_MediaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_identity_UserFlags_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_identity_UserFlags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_UserFlags_descriptor,
        new java.lang.String[] { "Validated", "Suspended", "Admin", "Beta", "Sandbox", });
    internal_static_identity_UserIdentity_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_identity_UserIdentity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_UserIdentity_descriptor,
        new java.lang.String[] { "Provider", "Id", "Seen", });
    internal_static_identity_ConsumerProfile_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_identity_ConsumerProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ConsumerProfile_descriptor,
        new java.lang.String[] { "Active", "FavoriteDispensaries", "EnrollmentSource", "EnrollmentChannel", "Preferences", });
    internal_static_identity_MenuPreferences_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_identity_MenuPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_MenuPreferences_descriptor,
        new java.lang.String[] { "Section", "Feeling", "TasteNote", "DesiredPotency", "CannabinoidRatio", "Species", "Grow", });
    internal_static_identity_ConsumerPreferences_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_identity_ConsumerPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ConsumerPreferences_descriptor,
        new java.lang.String[] { "Menu", });
    internal_static_identity_ConsumerMembership_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_identity_ConsumerMembership_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ConsumerMembership_descriptor,
        new java.lang.String[] { "ReferralSource", "ReferralChannel", "SignedUpAt", "Seen", "ForeignId", });
    internal_static_identity_IndustryProfile_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_identity_IndustryProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_IndustryProfile_descriptor,
        new java.lang.String[] { "Active", "Partners", });
    internal_static_identity_IndustryProfile_PartnersEntry_descriptor =
      internal_static_identity_IndustryProfile_descriptor.getNestedTypes().get(0);
    internal_static_identity_IndustryProfile_PartnersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_IndustryProfile_PartnersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    registry.add(gen_bq_schema.BqField.ignore);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.bloombox.schema.media.AttachedMedia.getDescriptor();
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.person.PersonOuterClass.getDescriptor();
    io.bloombox.schema.identity.IDOuterClass.getDescriptor();
    io.bloombox.schema.identity.ids.UserDoctorRecOuterClass.getDescriptor();
    io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor();
    io.bloombox.schema.product.struct.MaterialGrow.getDescriptor();
    io.bloombox.schema.product.struct.MaterialSpecies.getDescriptor();
    io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor();
    io.bloombox.schema.security.access.PartnerPermissions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
