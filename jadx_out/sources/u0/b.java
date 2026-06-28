package u0;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends s0.e {
    @Override // s0.e
    public String d(y0.a aVar, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.putAll(a1.a.b(aVar));
        a1.e.i(k0.a.A, "cf " + hashMap2);
        return super.d(aVar, hashMap, hashMap2);
    }

    @Override // s0.e
    public JSONObject f() throws JSONException {
        return s0.e.g("sdkConfig", "obtain");
    }

    @Override // s0.e
    public String n() {
        return "5.0.0";
    }

    @Override // s0.e
    public boolean o() {
        return true;
    }
}
