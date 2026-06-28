package com.bytedance.tools.c;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f6298a;

    /* renamed from: b, reason: collision with root package name */
    private String f6299b;

    /* renamed from: c, reason: collision with root package name */
    private String f6300c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f6298a = jSONObject.optString("preview_style");
            this.f6299b = jSONObject.optString("preview_cid");
            this.f6300c = jSONObject.optString("image_mode");
        }
    }

    public String a() {
        return this.f6300c;
    }

    public String b() {
        return this.f6299b;
    }

    public String c() {
        return this.f6298a;
    }

    public String d() {
        return String.format("%s(%s)", c(), b());
    }
}
