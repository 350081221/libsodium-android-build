package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static b a(String str) {
        try {
            if (!f1.a.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
            }
        } catch (Exception e5) {
            com.alipay.apmobilesecuritysdk.c.a.a(e5);
        }
        return null;
    }

    public static synchronized void a() {
        synchronized (a.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f2791a);
                jSONObject.put("deviceInfoHash", bVar.f2792b);
                jSONObject.put("timestamp", bVar.f2793c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e5) {
                com.alipay.apmobilesecuritysdk.c.a.a(e5);
            }
        }
    }

    public static synchronized b b() {
        synchronized (a.class) {
            String a5 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (f1.a.c(a5)) {
                return null;
            }
            return a(a5);
        }
    }

    public static synchronized b b(Context context) {
        b a5;
        synchronized (a.class) {
            String a6 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (f1.a.c(a6)) {
                a6 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
            a5 = a(a6);
        }
        return a5;
    }

    public static synchronized b c(Context context) {
        synchronized (a.class) {
            String a5 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (f1.a.c(a5)) {
                return null;
            }
            return a(a5);
        }
    }
}
