# تحسين أداء التطبيق وتقليل حجمه
-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose

# الاحتفاظ ببعض الفئات والطرق الضرورية للتطبيق
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.Fragment
-keep public class * extends androidx.fragment.app.Fragment
-keep class androidx.appcompat.** { *; }
-keep class com.google.android.material.** { *; }
-keep class org.tensorflow.** { *; }
-keep class okhttp3.** { *; }
-keep class okio.** { *; }
-keep class mystery.anonymous.lungcancerdetection.** { *; }

# الاحتفاظ بأسماء الفئات المستخدمة في انعكاس Java
-keepattributes Signature
-keepattributes *Annotation*
-keepattributes EnclosingMethod

# الاحتفاظ بأسماء الفئات المستخدمة في OkHttp
-keepnames class okhttp3.*
-keepnames class okio.*