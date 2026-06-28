package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class ar {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12181a = "cl_count";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12182b = "interval_";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12183c = "config_ts";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12184d = "iucc_s1";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12185e = "iucc_s2";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12186f = "sdk_type_ver";

    /* renamed from: g, reason: collision with root package name */
    public static final String f12187g = "should_fetch";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12188h = "ccg_sp_config_file";

    private ar() {
    }

    public static SharedPreferences a(Context context) {
        if (context != null) {
            try {
                return context.getSharedPreferences(f12188h, 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
