package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static i1 f8565c;

    /* renamed from: a, reason: collision with root package name */
    public Context f8566a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8567b = new Object();

    public static i1 a() {
        if (f8565c == null) {
            b();
        }
        return f8565c;
    }

    public static synchronized void b() {
        synchronized (i1.class) {
            if (f8565c == null) {
                f8565c = new i1();
            }
        }
    }

    public final JSONObject a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                y.b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    public void a(Context context) {
        synchronized (this.f8567b) {
            if (this.f8566a != null) {
                return;
            }
            this.f8566a = context;
            h0.a().a(context);
        }
    }

    public void a(String str, int i5) {
        h0.a().a(str, i5);
    }

    public void a(String str, int i5, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h0.a().a(str, i5, str2, a(linkedHashMap));
    }

    public void a(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            h0.a().a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            y.f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }
}
