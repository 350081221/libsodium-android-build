package s0;

import a1.m;
import a1.n;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q0.a;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f22341c = "msp-gzip";

    /* renamed from: d, reason: collision with root package name */
    public static final String f22342d = "Msp-Param";

    /* renamed from: e, reason: collision with root package name */
    public static final String f22343e = "Operation-Type";

    /* renamed from: f, reason: collision with root package name */
    public static final String f22344f = "content-type";

    /* renamed from: g, reason: collision with root package name */
    public static final String f22345g = "Version";

    /* renamed from: h, reason: collision with root package name */
    public static final String f22346h = "AppId";

    /* renamed from: i, reason: collision with root package name */
    public static final String f22347i = "des-mode";

    /* renamed from: j, reason: collision with root package name */
    public static final String f22348j = "namespace";

    /* renamed from: k, reason: collision with root package name */
    public static final String f22349k = "api_name";

    /* renamed from: l, reason: collision with root package name */
    public static final String f22350l = "api_version";

    /* renamed from: m, reason: collision with root package name */
    public static final String f22351m = "data";

    /* renamed from: n, reason: collision with root package name */
    public static final String f22352n = "params";

    /* renamed from: o, reason: collision with root package name */
    public static final String f22353o = "public_key";

    /* renamed from: p, reason: collision with root package name */
    public static final String f22354p = "device";

    /* renamed from: q, reason: collision with root package name */
    public static final String f22355q = "action";

    /* renamed from: r, reason: collision with root package name */
    public static final String f22356r = "type";

    /* renamed from: s, reason: collision with root package name */
    public static final String f22357s = "method";

    /* renamed from: a, reason: collision with root package name */
    public boolean f22358a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22359b = true;

    public static String a(a.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.f22291a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public static JSONObject g(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String optString = jSONObject.getJSONObject("params").optString(f22353o, null);
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            m0.b.d(optString);
            return true;
        } catch (JSONException e5) {
            a1.e.d(e5);
            return false;
        }
    }

    public static boolean m(a.b bVar) {
        return Boolean.valueOf(a(bVar, f22341c)).booleanValue();
    }

    public String b(y0.a aVar) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put(f22350l, n());
        return d(aVar, hashMap, new HashMap<>());
    }

    public String c(y0.a aVar, String str, JSONObject jSONObject) {
        y0.b e5 = y0.b.e();
        z0.a a5 = z0.a.a(e5.c());
        JSONObject a6 = a1.d.a(new JSONObject(), jSONObject);
        try {
            a6.put(k0.b.f19023d, str);
            a6.put("tid", a5.i());
            a6.put(k0.b.f19021b, e5.a().c(aVar, a5, o()));
            a6.put(k0.b.f19024e, n.y(aVar, e5.c(), g0.a.f16089d, false));
            a6.put(k0.b.f19025f, n.e0(e5.c()));
            a6.put(k0.b.f19027h, k0.a.f19000g);
            a6.put(k0.b.f19026g, e5.d());
            a6.put(k0.b.f19029j, a5.h());
            a6.put(k0.b.f19030k, m0.b.e(e5.c()));
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, "BodyErr", th);
            a1.e.d(th);
        }
        return a6.toString();
    }

    public String d(y0.a aVar, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public Map<String, String> e(boolean z4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(f22341c, String.valueOf(z4));
        hashMap.put(f22343e, "alipay.msp.cashier.dispatch.bytes");
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put(f22345g, "2.0");
        hashMap.put(f22346h, "TAOBAO");
        hashMap.put(f22342d, a.a(str));
        hashMap.put(f22347i, "CBC");
        return hashMap;
    }

    public abstract JSONObject f() throws JSONException;

    public b h(y0.a aVar, Context context) throws Throwable {
        return i(aVar, context, "");
    }

    public b i(y0.a aVar, Context context, String str) throws Throwable {
        return j(aVar, context, str, m.b(context));
    }

    public b j(y0.a aVar, Context context, String str, String str2) throws Throwable {
        return k(aVar, context, str, str2, true);
    }

    public b k(y0.a aVar, Context context, String str, String str2, boolean z4) throws Throwable {
        a1.e.g(k0.a.A, "Packet: " + str2);
        c cVar = new c(this.f22359b);
        b bVar = new b(b(aVar), c(aVar, str, f()));
        Map<String, String> e5 = e(false, str);
        d d5 = cVar.d(bVar, this.f22358a, e5.get("iSr"));
        a.b b5 = q0.a.b(context, new a.C0660a(str2, e(d5.b(), str), d5.a()));
        if (b5 != null) {
            b c5 = cVar.c(new d(m(b5), b5.f22293c), e5.get("iSr"));
            if (c5 != null && l(c5.b()) && z4) {
                return k(aVar, context, str, str2, false);
            }
            return c5;
        }
        throw new RuntimeException("Response is null.");
    }

    public String n() {
        return "4.9.0";
    }

    public abstract boolean o();
}
