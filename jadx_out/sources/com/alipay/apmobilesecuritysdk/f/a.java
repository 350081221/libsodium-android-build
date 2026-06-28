package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import r.e;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        String a5;
        if (context == null || f1.a.c(str)) {
            return null;
        }
        if (!f1.a.c(str2)) {
            try {
                a5 = e.a(context, str, str2, "");
                if (f1.a.c(a5)) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return e1.c.e(e1.c.a(), a5);
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (f1.a.c(str) || f1.a.c(str2)) {
                return null;
            }
            try {
                String a5 = r.b.a(str);
                if (f1.a.c(a5)) {
                    return null;
                }
                String string = new JSONObject(a5).getString(str2);
                if (f1.a.c(string)) {
                    return null;
                }
                return e1.c.e(e1.c.a(), string);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (!f1.a.c(str) && !f1.a.c(str2) && context != null) {
            try {
                String b5 = e1.c.b(e1.c.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, b5);
                e.b(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (f1.a.c(str) || f1.a.c(str2)) {
                return;
            }
            try {
                String a5 = r.b.a(str);
                JSONObject jSONObject = new JSONObject();
                if (f1.a.f(a5)) {
                    try {
                        jSONObject = new JSONObject(a5);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, e1.c.b(e1.c.a(), str3));
                jSONObject.toString();
                try {
                    System.clearProperty(str);
                } catch (Throwable unused2) {
                }
                if (r.c.b()) {
                    String str4 = ".SystemConfig" + File.separator + str;
                    if (r.c.b()) {
                        File file = new File(Environment.getExternalStorageDirectory(), str4);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
