package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {
    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        String a5 = com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (f1.a.c(a5)) {
            a5 = com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key");
        }
        if (f1.a.c(a5)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a5);
            f fVar = new f();
            fVar.a(jSONObject.getString("imei"));
            fVar.b(jSONObject.getString("imsi"));
            fVar.c(jSONObject.getString("mac"));
            fVar.d(jSONObject.getString("bluetoothmac"));
            fVar.e(jSONObject.getString("gsi"));
            return fVar;
        } catch (Exception e5) {
            com.alipay.apmobilesecuritysdk.c.a.a(e5);
            return null;
        }
    }
}
