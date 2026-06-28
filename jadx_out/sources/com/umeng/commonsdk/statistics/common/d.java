package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.au;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f13284a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f13285b;

    /* renamed from: c, reason: collision with root package name */
    private static String f13286c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f13287d = au.b().b("user");

    public d(Context context) {
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            f13285b = context.getApplicationContext();
            f13286c = context.getPackageName();
            if (f13284a == null) {
                f13284a = new d(context);
            }
            dVar = f13284a;
        }
        return dVar;
    }

    private SharedPreferences f() {
        return f13285b.getSharedPreferences(f13287d + f13286c, 0);
    }

    public String b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f13285b);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("st", null);
    }

    public boolean c() {
        return UMFrUtils.envelopeFileNumber(f13285b) > 0;
    }

    public String[] d() {
        try {
            SharedPreferences f5 = f();
            String string = f5.getString("au_p", null);
            String string2 = f5.getString("au_u", null);
            if (string != null && string2 != null) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void e() {
        f().edit().remove("au_p").remove("au_u").commit();
    }

    public void a(int i5) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f13285b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i5).commit();
        }
    }

    public int a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f13285b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f13285b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = f().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }
}
