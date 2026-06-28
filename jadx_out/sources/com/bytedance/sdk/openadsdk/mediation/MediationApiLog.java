package com.bytedance.sdk.openadsdk.mediation;

import android.util.Log;

/* loaded from: classes2.dex */
public class MediationApiLog {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5042a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String f5043b = "MEDIATION_LOG";

    public static void e(String str, String str2) {
        if (f5042a) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (f5042a) {
            Log.i(str, str2);
        }
    }

    public static void setDebug(Boolean bool) {
        f5042a = bool.booleanValue();
    }

    public static void e(String str) {
        if (f5042a) {
            Log.e(f5043b, str);
        }
    }

    public static void i(String str) {
        if (f5042a) {
            Log.i(f5043b, str);
        }
    }
}
