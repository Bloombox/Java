-libraryjars <java.home>/lib/rt.jar
-libraryjars <java.home>/lib/jce.jar
-printmapping out.map

-dontskipnonpubliclibraryclasses
-keepparameternames
-renamesourcefileattribute SourceFile
-keepattributes Exceptions,InnerClasses,Signature,Deprecated,
                SourceFile,LineNumberTable,*Annotation*,EnclosingMethod

-optimizationpasses 5
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

-keep public class * {
      public protected *;
}

-keepclassmembernames class * {
    java.lang.Class class$(java.lang.String);
    java.lang.Class class$(java.lang.String, boolean);
}

-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}

-keepclassmembers,allowoptimization enum * {
    public static **[] values(); public static ** valueOf(java.lang.String);
}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keep public class io.bloombox.schema.** {
    public *;
}

-keep public class io.opencannabis.** {
    public *;
}

-keep class bloombox.client.Bloombox { public *; }
-keep class bloombox.client.BloomboxClient { public *; }
-keep class bloombox.client.CLITool { public *; }
-keep class bloombox.client.services.** { public *; }
-keep class bloombox.client.interfaces.** { *; }
-keep,allowoptimization,allowshrinking,allowobfuscation class bloombox.client.internals.** { *; }

-keep class io.grpc.**
-keep class io.grpc.netty.**
-keep class io.netty.**
-keep class org.slf4j.** { *; }
-keep class kotlin.** { *; }
-keep class org.apache.log4j.** { *; }
-keep class io.opencensus.** { *; }
-keep class com.google.auth.** { *; }
-keep class org.apache.commons.logging.** { *; }
-keep class com.google.instrumentation.stats.* { *; }

-keepclassmembernames class * {
    java.lang.Class class$(java.lang.String);
    java.lang.Class class$(java.lang.String, boolean);
}

-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}

-keepclassmembers enum * {
    public static **[] values(); public static ** valueOf(java.lang.String);
}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# Retrofit-provided rules
-dontnote retrofit2.Platform
-dontwarn retrofit2.Platform$Java8
-keepattributes Signature
-keepattributes Exceptions

-dontwarn android.test.**
-dontwarn com.google.common.**
-dontwarn javax.naming.**
-dontwarn org.junit.**
-dontwarn org.mockito.**
-dontwarn sun.reflect.**
-dontwarn com.google.errorprone.annotations.**

-keepattributes InnerClasses
-keepattributes *Annotation*

# Okio-provided rules
-dontwarn okio.**
-dontwarn javax.annotation.Nullable
-dontwarn javax.annotation.ParametersAreNonnullByDefault
-dontwarn kotlin.**
-dontwarn io.opencensus.**
-dontwarn org.apache.commons.logging.**
-dontwarn com.google.instrumentation.stats.*

-dontnote kotlin.**
-dontnote io.netty.**
-dontnote io.opencensus.**
-dontnote io.grpc.**
-dontnote org.apache.commons.logging.**
-dontnote com.google.instrumentation.stats.*

-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
    static void checkParameterIsNotNull(java.lang.Object, java.lang.String);
}

-keepclassmembers class **$WhenMappings {
    <fields>;
}
