package com.huawei.hms.hatool;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f1 extends o {

    /* renamed from: g, reason: collision with root package name */
    public String f8547g = "";

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "1");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f8644d);
        jSONObject.put("appid", this.f8641a);
        jSONObject.put("hmac", this.f8547g);
        jSONObject.put("chifer", this.f8646f);
        jSONObject.put("timestamp", this.f8642b);
        jSONObject.put("servicetag", this.f8643c);
        jSONObject.put("requestid", this.f8645e);
        return jSONObject;
    }

    public void g(String str) {
        this.f8547g = str;
    }
}
