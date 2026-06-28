package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class g {
    public static synchronized String a(Context context, String str) {
        synchronized (g.class) {
            String a5 = r.e.a(context, "openapi_file_pri", "openApi" + str, "");
            if (f1.a.c(a5)) {
                return "";
            }
            String e5 = e1.c.e(e1.c.a(), a5);
            return f1.a.c(e5) ? "" : e5;
        }
    }

    public static synchronized void a() {
        synchronized (g.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi" + str, e1.c.b(e1.c.a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
