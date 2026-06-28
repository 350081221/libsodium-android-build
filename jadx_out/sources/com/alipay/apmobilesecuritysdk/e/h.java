package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static String f2804a = "";

    public static long a(Context context) {
        String a5 = r.a.a(context, "vkeyid_settings", "update_time_interval");
        if (!f1.a.f(a5)) {
            return 86400000L;
        }
        try {
            return Long.parseLong(a5);
        } catch (Exception unused) {
            return 86400000L;
        }
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void a(Context context, String str, long j5) {
        r.a.b(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j5));
    }

    public static void a(Context context, String str, String str2) {
        r.a.b(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z4) {
        a(context, "log_switch", z4 ? "1" : "0");
    }

    public static String b(Context context) {
        return r.a.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static boolean c(Context context) {
        String a5 = r.a.a(context, "vkeyid_settings", "log_switch");
        return a5 != null && "1".equals(a5);
    }

    public static String d(Context context) {
        return r.a.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static String e(Context context) {
        return r.a.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor edit;
        synchronized (h.class) {
            if (f1.a.c(f2804a)) {
                String a5 = r.e.a(context, "alipay_vkey_random", "random", "");
                f2804a = a5;
                if (f1.a.c(a5)) {
                    String a6 = e1.b.a(UUID.randomUUID().toString());
                    f2804a = a6;
                    if (a6 != null && (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                        edit.putString("random", a6);
                        edit.commit();
                    }
                }
            }
            str = f2804a;
        }
        return str;
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String a5 = r.a.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (f1.a.c(a5)) {
                return 0L;
            }
            return Long.parseLong(a5);
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
