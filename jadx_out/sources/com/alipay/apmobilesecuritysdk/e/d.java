package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    public static c a(String str) {
        try {
            if (!f1.a.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString(k0.b.f19026g));
            }
        } catch (Exception e5) {
            com.alipay.apmobilesecuritysdk.c.a.a(e5);
        }
        return null;
    }

    public static synchronized void a() {
        synchronized (d.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (d.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.f2794a);
                jSONObject.put("deviceInfoHash", cVar.f2795b);
                jSONObject.put("timestamp", cVar.f2796c);
                jSONObject.put("tid", cVar.f2797d);
                jSONObject.put(k0.b.f19026g, cVar.f2798e);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e5) {
                com.alipay.apmobilesecuritysdk.c.a.a(e5);
            }
        }
    }

    public static synchronized c b() {
        synchronized (d.class) {
            String a5 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            if (f1.a.c(a5)) {
                return null;
            }
            return a(a5);
        }
    }

    public static synchronized c b(Context context) {
        c a5;
        synchronized (d.class) {
            String a6 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (f1.a.c(a6)) {
                a6 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            a5 = a(a6);
        }
        return a5;
    }

    public static synchronized c c(Context context) {
        synchronized (d.class) {
            String a5 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (f1.a.c(a5)) {
                return null;
            }
            return a(a5);
        }
    }
}
