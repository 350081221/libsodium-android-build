package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class da extends cy {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11669a = "accounts";

    public void a() {
        a(f11669a, x.d(ab.f11351g));
    }

    public void c() {
        try {
            if (((JSONObject) b()).has(f11669a)) {
                return;
            }
            a(f11669a, x.d(ab.f11351g));
        } catch (Throwable unused) {
        }
    }

    public void setUserAccount(cu cuVar) {
        if (cuVar != null && cuVar.b() != null) {
            if (this.f11648b.isNull(f11669a)) {
                new JSONArray().put(cuVar.b());
                a(f11669a, cuVar.b());
            } else {
                try {
                    this.f11648b.getJSONArray(f11669a).put(cuVar.b());
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }
}
