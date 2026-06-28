package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.au;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13201a = au.b().b(au.f12210r);

    /* renamed from: b, reason: collision with root package name */
    private static final String f13202b = "um_common_strength";

    /* renamed from: c, reason: collision with root package name */
    private static final String f13203c = "um_common_battery";

    public static String a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f13201a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f13203c, null);
    }

    public static void a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f13201a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(f13203c, str).commit();
    }
}
