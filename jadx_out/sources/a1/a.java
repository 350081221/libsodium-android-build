package a1;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import i0.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f87a = "ap_req";

    /* renamed from: b, reason: collision with root package name */
    public static final String f88b = "ap_args";

    /* renamed from: c, reason: collision with root package name */
    public static final String f89c = "ap_resp";

    public static a0.a a() {
        try {
            try {
                return c0.a.c("NP", System.currentTimeMillis(), new c0.c(y0.b.e().d()), (short) a.c.a(y0.b.e().c()), new c0.f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return c0.a.d();
        }
    }

    public static HashMap<String, String> b(y0.a aVar) {
        Context context;
        String str;
        String str2;
        String str3;
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            a0.a a5 = a();
            JSONObject jSONObject = new JSONObject();
            if (aVar != null) {
                context = aVar.a();
            } else {
                context = null;
            }
            if (context == null) {
                context = y0.b.e().c().getApplicationContext();
            }
            String o5 = n.o(aVar, context);
            String c5 = c1.b.c(aVar, context);
            String str4 = "";
            if (a5 == null) {
                str = "";
            } else {
                str = a5.a();
            }
            jSONObject.put("ap_q", str);
            if (aVar == null) {
                str2 = "";
            } else {
                str2 = aVar.f22662d;
            }
            jSONObject.put(y0.a.f22658z, str2);
            jSONObject.put("u_pd", String.valueOf(n.Z()));
            jSONObject.put("u_lk", String.valueOf(n.S(n.D())));
            if (aVar != null) {
                str3 = aVar.f22665g;
            } else {
                str3 = "_";
            }
            jSONObject.put("u_pi", String.valueOf(str3));
            jSONObject.put("u_fu", o5);
            jSONObject.put("u_oi", c5);
            hashMap.put(f87a, jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            if (a5 != null) {
                str4 = a5.a();
            }
            sb.append(str4);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(o5);
            i0.a.d(aVar, i0.b.f16157l, "ap_q", sb.toString());
        } catch (Exception e5) {
            i0.a.e(aVar, i0.b.f16157l, "APMEx1", e5);
        }
        return hashMap;
    }

    public static JSONObject c(y0.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(f89c);
        try {
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            return new JSONObject(optString);
        } catch (JSONException e5) {
            i0.a.e(aVar, i0.b.f16157l, "APMEx2", e5);
            return null;
        }
    }

    public static void d(y0.a aVar, HashMap<String, String> hashMap) {
        JSONObject b5 = m0.a.J().b();
        if (hashMap != null && b5 != null) {
            i0.a.d(aVar, i0.b.f16157l, "ap_r", b5.optString("ap_r"));
            hashMap.putAll(n.s(b5));
        }
    }

    public static void e(y0.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                jSONObject.putOpt(f88b, jSONObject2);
            } catch (JSONException e5) {
                i0.a.e(aVar, i0.b.f16157l, "APMEx2", e5);
            }
        }
    }
}
