package com.ss.android.socialbase.appdownloader.f;

import android.content.Context;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f10347a;

    /* renamed from: b, reason: collision with root package name */
    private static String f10348b;

    /* renamed from: c, reason: collision with root package name */
    private static String f10349c;

    /* renamed from: d, reason: collision with root package name */
    private static String f10350d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f10351e;

    public static boolean a(Context context) {
        return context != null && c(context) == 0 && e();
    }

    public static boolean b(Context context) {
        return context != null && d(context) == 0 && f();
    }

    public static String c() {
        if (f10349c == null) {
            f10349c = a("getReleaseType");
        }
        return f10349c;
    }

    public static String d() {
        if (f10350d == null) {
            f10350d = a("getBuildVersion");
        }
        return f10350d;
    }

    public static boolean e() {
        boolean z4;
        if (f10351e == null) {
            f10351e = Boolean.FALSE;
            try {
                if ("156".equals(a("ro.config.hw_optb", "0")) && "true".equals(a("hw_mc.pure_mode.enable", "false"))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                f10351e = Boolean.valueOf(z4);
            } catch (Exception unused) {
            }
        }
        return f10351e.booleanValue();
    }

    public static boolean f() {
        return e() && b(b(), a()) && a(Process.myUid()) == 0;
    }

    public static String g() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a() {
        if (f10347a == null) {
            f10347a = a("getApiVersion");
        }
        return f10347a;
    }

    public static String b() {
        if (f10348b == null) {
            f10348b = a("getVersion");
        }
        return f10348b;
    }

    public static int c(Context context) {
        if (context == null) {
            return 1;
        }
        if (b(b(), a())) {
            return Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state", 1) == 0 ? 0 : 1;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state", 0);
    }

    public static int d(Context context) {
        return (context == null || Settings.Secure.getInt(context.getContentResolver(), "pure_enhanced_mode_state", 1) != 0) ? 1 : 0;
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Throwable unused) {
            return str2;
        }
    }

    private static boolean b(String str, String str2) {
        return !TextUtils.isEmpty(str2) && str.startsWith("3");
    }

    private static int a(int i5) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.UserHandleEx");
            return ((Integer) cls.getMethod("getUserId", Integer.TYPE).invoke(cls, Integer.valueOf(i5))).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 1;
        }
    }

    private static String a(String str) {
        try {
            Class<?> cls = Class.forName("ohos.system.version.SystemVersion");
            return cls.getMethod(str, new Class[0]).invoke(cls, new Object[0]).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
