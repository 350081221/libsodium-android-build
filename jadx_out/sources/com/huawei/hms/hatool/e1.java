package com.huawei.hms.hatool;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e1 extends n {

    /* renamed from: b, reason: collision with root package name */
    public String f8534b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f8535c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f8536d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f8537e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f8538f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f8539g;

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f8640a);
        jSONObject.put("oaid", this.f8539g);
        jSONObject.put("uuid", this.f8538f);
        jSONObject.put("upid", this.f8537e);
        jSONObject.put("imei", this.f8534b);
        jSONObject.put("sn", this.f8535c);
        jSONObject.put("udid", this.f8536d);
        return jSONObject;
    }

    public void b(String str) {
        this.f8534b = str;
    }

    public void c(String str) {
        this.f8539g = str;
    }

    public void d(String str) {
        this.f8535c = str;
    }

    public void e(String str) {
        this.f8536d = str;
    }

    public void f(String str) {
        this.f8537e = str;
    }

    public void g(String str) {
        this.f8538f = str;
    }
}
