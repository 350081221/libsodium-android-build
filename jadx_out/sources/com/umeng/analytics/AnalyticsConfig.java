package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.j;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static final String DEBUG_KEY = "debugkey";
    public static final String DEBUG_MODE_PERIOD = "sendaging";
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";
    public static final String RTD_PERIOD = "period";
    public static final String RTD_START_TIME = "startTime";

    /* renamed from: a, reason: collision with root package name */
    static double[] f12042a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f12043b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f12044c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f12045d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f12046e = 0;
    public static boolean enable = true;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;
    public static final String RTD_SP_FILE = au.b().b(au.A);

    /* renamed from: f, reason: collision with root package name */
    private static Object f12047f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static boolean f12048g = false;

    /* renamed from: h, reason: collision with root package name */
    private static String f12049h = "";

    static void a(String str) {
        f12044c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double[] getLocation() {
        return f12042a;
    }

    public static String getRealTimeDebugKey() {
        String str;
        synchronized (f12047f) {
            str = f12049h;
        }
        return str;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f12045d)) {
            f12045d = com.umeng.common.b.a(context).c();
        }
        return f12045d;
    }

    public static int getVerticalType(Context context) {
        if (f12046e == 0) {
            f12046e = com.umeng.common.b.a(context).d();
        }
        return f12046e;
    }

    public static boolean isRealTimeDebugMode() {
        boolean z4;
        synchronized (f12047f) {
            z4 = f12048g;
        }
        return z4;
    }

    public static void turnOffRealTimeDebug() {
        synchronized (f12047f) {
            f12048g = false;
            f12049h = "";
        }
    }

    public static void turnOnRealTimeDebug(Map<String, String> map) {
        synchronized (f12047f) {
            f12048g = true;
            if (map != null && map.containsKey("debugkey")) {
                f12049h = map.get("debugkey");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f12045d = str;
            com.umeng.common.b.a(context).a(f12045d);
        } else {
            UMLog.aq(j.A, 0, "\\|");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, int i5) {
        f12046e = i5;
        com.umeng.common.b.a(context).a(f12046e);
    }
}
