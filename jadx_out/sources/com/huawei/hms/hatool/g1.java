package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g1 extends p {

    /* renamed from: f, reason: collision with root package name */
    public String f8548f;

    /* renamed from: g, reason: collision with root package name */
    public String f8549g;

    /* renamed from: h, reason: collision with root package name */
    public String f8550h;

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f8550h);
        jSONObject.put("_emui_ver", this.f8658a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f8548f);
        jSONObject.put("_mnc", this.f8549g);
        jSONObject.put("_package_name", this.f8659b);
        jSONObject.put("_app_ver", this.f8660c);
        jSONObject.put("_lib_ver", "2.2.0.313");
        jSONObject.put("_channel", this.f8661d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f8662e);
        return jSONObject;
    }

    public void f(String str) {
        this.f8548f = str;
    }

    public void g(String str) {
        this.f8549g = str;
    }

    public void h(String str) {
        this.f8550h = str;
    }
}
