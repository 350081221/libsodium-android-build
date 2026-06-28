package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class cy {

    /* renamed from: b, reason: collision with root package name */
    protected JSONObject f11648b = new JSONObject();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (a(obj)) {
                return;
            }
            this.f11648b.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public Object b() {
        return this.f11648b;
    }

    protected void a(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        try {
            if (jSONObject.has(str)) {
                jSONObject.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    protected boolean a(Object obj) {
        return obj instanceof JSONObject ? ((JSONObject) obj).length() <= 0 : (obj instanceof JSONArray) && ((JSONArray) obj).length() <= 0;
    }
}
