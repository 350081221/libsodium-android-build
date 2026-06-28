package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.au;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f12967a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f12968b;

    /* renamed from: c, reason: collision with root package name */
    private static String f12969c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f12970d = au.b().b("user");

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f12971a = new b();

        private a() {
        }
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f12968b == null && context != null) {
                f12968b = context.getApplicationContext();
            }
            if (f12968b != null) {
                f12969c = context.getPackageName();
            }
            bVar = a.f12971a;
        }
        return bVar;
    }

    private SharedPreferences e() {
        Context context = f12968b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f12970d + f12969c, 0);
    }

    public void b() {
        SharedPreferences e5 = e();
        if (e5 != null) {
            e5.edit().remove("au_p").remove("au_u").commit();
        }
    }

    public String c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12968b);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("st", null);
    }

    public int d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12968b);
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt("vt", 0);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = e().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }

    public String[] a() {
        SharedPreferences e5 = e();
        if (e5 == null) {
            return null;
        }
        String string = e5.getString("au_p", null);
        String string2 = e5.getString("au_u", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new String[]{string, string2};
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12968b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(int i5) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12968b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i5).commit();
        }
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) ? "" : sharedPreferences.getString(str2, "");
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString(str2, str3);
        edit.commit();
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
        edit.remove("debugkey");
        edit.remove("period");
        edit.remove(AnalyticsConfig.RTD_START_TIME);
        edit.clear();
        edit.commit();
    }
}
