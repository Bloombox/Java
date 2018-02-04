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
    internal_static_bloombox_schema_identity_UserKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_UserKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_User_IdentitiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_User_IdentitiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_User_MediaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_User_MediaEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_UserFlags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_UserFlags_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_UserIdentity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_UserIdentity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_ConsumerProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_ConsumerProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_MenuPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_MenuPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_ConsumerPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_ConsumerPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_ConsumerMembership_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_ConsumerMembership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_IndustryProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_IndustryProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_IndustryProfile_PartnersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_IndustryProfile_PartnersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023identity/User.proto\022\030bloombox.schema.i" +
      "dentity\032\016bq_field.proto\032\025media/MediaItem" +
      ".proto\032\026temporal/Instant.proto\032\023person/P" +
      "erson.proto\032\021identity/ID.proto\032 identity" +
      "/ids/UserDoctorRec.proto\032\033products/menu/" +
      "Section.proto\032\022structs/Grow.proto\032\025struc" +
      "ts/Species.proto\032$structs/labtesting/Tes" +
      "tResults.proto\032(security/access/PartnerP" +
      "ermissions.proto\"g\n\007UserKey\022\'\n\003uid\030\001 \001(\t" +
      "B\032\212@\027Unique ID for the user.\0223\n\010identity" +
      "\030\002 \001(\tB!\212@\036Specific user identity in use" +
      ".\"\314\t\n\004User\022\'\n\003uid\030\001 \001(\tB\032\212@\027Unique ID fo" +
      "r the user.\022S\n\005flags\030\002 \001(\0132#.bloombox.sc" +
      "hema.identity.UserFlagsB\037\212@\034Boolean flag" +
      "s for this user.\022Z\n\006person\030\003 \001(\0132\033.openc" +
      "annabis.person.PersonB-\212@*Person\'s infor" +
      "mation that backs this user.\022d\n\016identifi" +
      "cation\030\024 \003(\0132\034.bloombox.schema.identity." +
      "IDB.\200@\001\212@(Government ID associated with " +
      "this user.\022z\n\ndoctor_rec\030\025 \003(\0132+.bloombo" +
      "x.schema.identity.ids.UserDoctorRecB9\200@\001" +
      "\212@3Doctor\'s recommendations associated w" +
      "ith this user.\022m\n\004seen\030\036 \001(\0132\036.opencanna" +
      "bis.temporal.InstantB?\212@<Last time this " +
      "user was seen, via auth/login/enrollment" +
      " etc.\022\\\n\006signup\030\037 \001(\0132\036.opencannabis.tem" +
      "poral.InstantB,\212@)Timestamp for when thi" +
      "s user was created.\022o\n\nidentities\030( \003(\0132" +
      "..bloombox.schema.identity.User.Identiti" +
      "esEntryB+\200@\001\212@%Identities associated wit" +
      "h this user.\022`\n\005media\030) \003(\0132).bloombox.s" +
      "chema.identity.User.MediaEntryB&\200@\001\212@ Me" +
      "dia associated with this user.\022_\n\010consum" +
      "er\030d \001(\0132).bloombox.schema.identity.Cons" +
      "umerProfileB\"\212@\037Consumer profile for thi" +
      "s user.\022_\n\010industry\030e \001(\0132).bloombox.sch" +
      "ema.identity.IndustryProfileB\"\212@\037Industr" +
      "y profile for this user.\032Y\n\017IdentitiesEn" +
      "try\022\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.bloomb" +
      "ox.schema.identity.UserIdentity:\0028\001\032K\n\nM" +
      "ediaEntry\022\013\n\003key\030\001 \001(\t\022,\n\005value\030\002 \001(\0132\035." +
      "opencannabis.media.MediaItem:\0028\001\"\367\002\n\tUse" +
      "rFlags\022D\n\tvalidated\030\001 \001(\010B1\212@.Indicates " +
      "that the account has been validated.\022H\n\t" +
      "suspended\030\002 \001(\010B5\212@2Indicates that the a" +
      "ccount is currently suspended.\022B\n\005admin\030" +
      "\003 \001(\010B3\212@0Indicates that the account has" +
      " admin privileges.\022G\n\004beta\030\004 \001(\010B9\212@6Ind" +
      "icates that the account has access to be" +
      "ta systems.\022M\n\007sandbox\030\005 \001(\010B<\212@9Indicat" +
      "es that the account has access to sandbo" +
      "x systems.\"\313\002\n\014UserIdentity\022l\n\010provider\030" +
      "\001 \001(\0162*.bloombox.schema.identity.Identit" +
      "yProviderB.\212@+Provider for this external" +
      "/foreign account.\022F\n\002id\030\002 \001(\tB:\212@7Unique" +
      " ID for this account with the specified " +
      "provider.\022\204\001\n\004seen\030\003 \001(\0132\036.opencannabis." +
      "temporal.InstantBV\212@STimestamp for when " +
      "this identity was last user to authentic" +
      "ate the underlying user.\"\332\004\n\017ConsumerPro" +
      "file\0220\n\006active\030\001 \001(\010B \212@\035Profile active/" +
      "inactive flag.\022N\n\025favorite_dispensaries\030" +
      "\002 \003(\tB/\212@,Enumerates favorite dispensari" +
      "es for a user.\022~\n\021enrollment_source\030\003 \001(" +
      "\0162*.bloombox.schema.identity.EnrollmentS" +
      "ourceB7\212@4Specifies enrollment source at" +
      "tribution information.\022a\n\022enrollment_cha" +
      "nnel\030\004 \001(\tBE\212@BArbitrary string for the " +
      "channel through which this user enrolled" +
      ".\022r\n\013preferences\030\005 \001(\0132-.bloombox.schema" +
      ".identity.ConsumerPreferencesB.\212@+Prefer" +
      "ences attached to a consumer account.\022n\n" +
      "\004type\030\006 \001(\0162&.bloombox.schema.identity.C" +
      "onsumerTypeB8\212@5Specifies the primary co" +
      "nsumer type for this account.\"\250\005\n\017MenuPr" +
      "eferences\022j\n\007section\030\001 \003(\0162+.opencannabi" +
      "s.products.menu.section.SectionB,\212@)Pref" +
      "erred menu sections or product types.\022h\n" +
      "\007feeling\030\002 \003(\0162(.opencannabis.structs.la" +
      "btesting.FeelingB-\212@*Preferred feelings " +
      "or experiential states.\022[\n\ntaste_note\030\003 " +
      "\003(\0162*.opencannabis.structs.labtesting.Ta" +
      "steNoteB\033\212@\030Preferred tasting notes.\022d\n\017" +
      "desired_potency\030\004 \001(\01620.opencannabis.str" +
      "ucts.labtesting.PotencyEstimateB\031\212@\026Desi" +
      "red potency level.\022k\n\021cannabinoid_ratio\030" +
      "\005 \001(\01621.opencannabis.structs.labtesting." +
      "CannabinoidRatioB\035\212@\032Desired cannabinoid" +
      " ratio.\022K\n\007species\030\006 \003(\0162\035.opencannabis." +
      "structs.SpeciesB\033\212@\030Preferred species ty" +
      "pes.\022B\n\004grow\030\007 \003(\0162\032.opencannabis.struct" +
      "s.GrowB\030\212@\025Preferred grow types.\"\204\001\n\023Con" +
      "sumerPreferences\022m\n\004menu\030\n \001(\0132).bloombo" +
      "x.schema.identity.MenuPreferencesB4\212@1Pr" +
      "eferred menu sections/product types, and" +
      " so on.\"\213\004\n\022ConsumerMembership\022l\n\017referr" +
      "al_source\030\001 \001(\0162*.bloombox.schema.identi" +
      "ty.EnrollmentSourceB\'\212@$Referral source " +
      "for this enrollment.\022^\n\020referral_channel" +
      "\030\002 \001(\tBD\212@AReferral channel token - an a" +
      "rtbirary, end-system provided value.\022b\n\014" +
      "signed_up_at\030\003 \001(\0132\036.opencannabis.tempor" +
      "al.InstantB,\212@)Timestamp for when this p" +
      "rofile enrolled.\022_\n\004seen\030\004 \001(\0132\036.opencan" +
      "nabis.temporal.InstantB1\212@.Timestamp for" +
      " when this profile was last seen.\022b\n\nfor" +
      "eign_id\030\005 \001(\tBN\212@KForeign ID for this me" +
      "mbership, in the partner-colocated membe" +
      "rship system.\"\246\002\n\017IndustryProfile\0222\n\006act" +
      "ive\030\001 \001(\010B\"\212@\037Profile inactive/active st" +
      "atus.\022~\n\010partners\030\002 \003(\01327.bloombox.schem" +
      "a.identity.IndustryProfile.PartnersEntry" +
      "B3\212@0Map of partner accesses levels to p" +
      "artner codes.\032_\n\rPartnersEntry\022\013\n\003key\030\001 " +
      "\001(\t\022=\n\005value\030\002 \001(\0132..bloombox.schema.sec" +
      "urity.access.PartnerAccess:\0028\001*A\n\rUserMe" +
      "diaType\022\013\n\007PICTURE\020\000\022\023\n\017DRIVERS_LICENSE\020" +
      "\001\022\016\n\nDOCTOR_REC\020\002*D\n\020IdentityProvider\022\t\n" +
      "\005EMAIL\020\000\022\n\n\006GOOGLE\020\001\022\014\n\010FACEBOOK\020\002\022\013\n\007TW" +
      "ITTER\020\003*l\n\020EnrollmentSource\022\017\n\013UNSPECIFI" +
      "ED\020\000\022\n\n\006ONLINE\020\001\022\020\n\014INTERNAL_APP\020\002\022\017\n\013PA" +
      "RTNER_APP\020\003\022\014\n\010IN_STORE\020\004\022\n\n\006IMPORT\020\005*>\n" +
      "\014ConsumerType\022\017\n\013UNVALIDATED\020\000\022\020\n\014RECREA" +
      "TIONAL\020\001\022\013\n\007MEDICAL\020\002B\'\n\033io.bloombox.sch" +
      "ema.identityH\001P\001\242\002\003BBSb\006proto3"
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
          io.opencannabis.schema.media.AttachedMedia.getDescriptor(),
          io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor(),
          io.opencannabis.schema.person.PersonOuterClass.getDescriptor(),
          io.bloombox.schema.identity.IDOuterClass.getDescriptor(),
          io.bloombox.schema.identity.ids.UserDoctorRecOuterClass.getDescriptor(),
          io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor(),
          io.opencannabis.schema.product.struct.MaterialGrow.getDescriptor(),
          io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor(),
          io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor(),
          io.bloombox.schema.security.access.PartnerPermissions.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_identity_UserKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_identity_UserKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_UserKey_descriptor,
        new java.lang.String[] { "Uid", "Identity", });
    internal_static_bloombox_schema_identity_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_identity_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_User_descriptor,
        new java.lang.String[] { "Uid", "Flags", "Person", "Identification", "DoctorRec", "Seen", "Signup", "Identities", "Media", "Consumer", "Industry", });
    internal_static_bloombox_schema_identity_User_IdentitiesEntry_descriptor =
      internal_static_bloombox_schema_identity_User_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_identity_User_IdentitiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_User_IdentitiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_bloombox_schema_identity_User_MediaEntry_descriptor =
      internal_static_bloombox_schema_identity_User_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_identity_User_MediaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_User_MediaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_bloombox_schema_identity_UserFlags_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_identity_UserFlags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_UserFlags_descriptor,
        new java.lang.String[] { "Validated", "Suspended", "Admin", "Beta", "Sandbox", });
    internal_static_bloombox_schema_identity_UserIdentity_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_identity_UserIdentity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_UserIdentity_descriptor,
        new java.lang.String[] { "Provider", "Id", "Seen", });
    internal_static_bloombox_schema_identity_ConsumerProfile_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_identity_ConsumerProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_ConsumerProfile_descriptor,
        new java.lang.String[] { "Active", "FavoriteDispensaries", "EnrollmentSource", "EnrollmentChannel", "Preferences", "Type", });
    internal_static_bloombox_schema_identity_MenuPreferences_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_schema_identity_MenuPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_MenuPreferences_descriptor,
        new java.lang.String[] { "Section", "Feeling", "TasteNote", "DesiredPotency", "CannabinoidRatio", "Species", "Grow", });
    internal_static_bloombox_schema_identity_ConsumerPreferences_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bloombox_schema_identity_ConsumerPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_ConsumerPreferences_descriptor,
        new java.lang.String[] { "Menu", });
    internal_static_bloombox_schema_identity_ConsumerMembership_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bloombox_schema_identity_ConsumerMembership_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_ConsumerMembership_descriptor,
        new java.lang.String[] { "ReferralSource", "ReferralChannel", "SignedUpAt", "Seen", "ForeignId", });
    internal_static_bloombox_schema_identity_IndustryProfile_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bloombox_schema_identity_IndustryProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_IndustryProfile_descriptor,
        new java.lang.String[] { "Active", "Partners", });
    internal_static_bloombox_schema_identity_IndustryProfile_PartnersEntry_descriptor =
      internal_static_bloombox_schema_identity_IndustryProfile_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_identity_IndustryProfile_PartnersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_IndustryProfile_PartnersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    registry.add(gen_bq_schema.BqField.ignore);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.media.AttachedMedia.getDescriptor();
    io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor();
    io.opencannabis.schema.person.PersonOuterClass.getDescriptor();
    io.bloombox.schema.identity.IDOuterClass.getDescriptor();
    io.bloombox.schema.identity.ids.UserDoctorRecOuterClass.getDescriptor();
    io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor();
    io.opencannabis.schema.product.struct.MaterialGrow.getDescriptor();
    io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor();
    io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor();
    io.bloombox.schema.security.access.PartnerPermissions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
