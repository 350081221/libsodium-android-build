package com.huawei.hms.analytics.framework.c.a;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f8230a;

    /* renamed from: b, reason: collision with root package name */
    public String f8231b;

    /* renamed from: c, reason: collision with root package name */
    public String f8232c;

    /* renamed from: d, reason: collision with root package name */
    public String f8233d;

    /* renamed from: e, reason: collision with root package name */
    public String f8234e;

    /* renamed from: f, reason: collision with root package name */
    public String f8235f;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("protocol_version", "1");
            jSONObject.put("compress_mode", "1");
            jSONObject.put("serviceid", this.f8235f);
            jSONObject.put("appid", this.f8231b);
            jSONObject.put("chifer", this.f8230a);
            jSONObject.put("timestamp", this.f8233d);
            jSONObject.put("servicetag", this.f8232c);
            jSONObject.put("requestid", this.f8234e);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
