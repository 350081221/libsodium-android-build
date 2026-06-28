package u0;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends s0.e {

    /* renamed from: t, reason: collision with root package name */
    public static final String f22560t = "log_v";

    @Override // s0.e
    public String b(y0.a aVar) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put(s0.e.f22350l, "1.0.0");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(f22560t, "1.0");
        return d(aVar, hashMap, hashMap2);
    }

    @Override // s0.e
    public String c(y0.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // s0.e
    public Map<String, String> e(boolean z4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(s0.e.f22341c, String.valueOf(z4));
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put(s0.e.f22347i, "CBC");
        return hashMap;
    }

    @Override // s0.e
    public JSONObject f() throws JSONException {
        return null;
    }

    @Override // s0.e
    public s0.b i(y0.a aVar, Context context, String str) throws Throwable {
        return k(aVar, context, str, k0.a.f18997d, true);
    }

    @Override // s0.e
    public boolean o() {
        return false;
    }
}
