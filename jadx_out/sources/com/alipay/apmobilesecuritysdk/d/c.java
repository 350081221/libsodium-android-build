package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        p.b c5 = p.b.c(APSecuritySdk.getInstance(context));
        HashMap hashMap = new HashMap();
        f a5 = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String b5 = c5.b(context);
        String j5 = c5.j(context);
        if (a5 != null) {
            if (f1.a.c(b5)) {
                b5 = a5.b();
            }
            if (f1.a.c(j5)) {
                j5 = a5.e();
            }
        }
        f fVar = new f("", b5, "", "", j5);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put("imsi", fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e5) {
                com.alipay.apmobilesecuritysdk.c.a.a(e5);
            }
        }
        hashMap.put("AD1", "");
        hashMap.put("AD2", b5);
        hashMap.put("AD3", p.b.r(context));
        hashMap.put("AD5", p.b.v(context));
        hashMap.put("AD6", p.b.x(context));
        hashMap.put("AD7", p.b.z(context));
        hashMap.put("AD9", c5.h(context));
        hashMap.put("AD10", j5);
        hashMap.put("AD11", p.b.i());
        hashMap.put("AD12", c5.a());
        hashMap.put("AD13", p.b.k());
        hashMap.put("AD14", p.b.o());
        hashMap.put("AD15", p.b.q());
        hashMap.put("AD16", p.b.s());
        hashMap.put("AD17", "");
        hashMap.put("AD19", p.b.B(context));
        hashMap.put("AD20", p.b.u());
        hashMap.put("AD22", "");
        hashMap.put("AD24", f1.a.k(p.b.t(context)));
        hashMap.put("AD26", c5.f(context));
        hashMap.put("AD27", p.b.E());
        hashMap.put("AD28", p.b.I());
        hashMap.put("AD29", p.b.K());
        hashMap.put("AD30", p.b.G());
        hashMap.put("AD31", p.b.J());
        hashMap.put("AD32", p.b.A());
        hashMap.put("AD33", p.b.C());
        hashMap.put("AD34", p.b.D(context));
        hashMap.put("AD35", p.b.F(context));
        hashMap.put("AD36", c5.l(context));
        hashMap.put("AD37", p.b.y());
        hashMap.put("AD38", p.b.w());
        hashMap.put("AD39", p.b.n(context));
        hashMap.put("AD40", p.b.p(context));
        hashMap.put("AD41", p.b.e());
        hashMap.put("AD42", p.b.g());
        return hashMap;
    }
}
