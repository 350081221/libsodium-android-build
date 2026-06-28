package com.ss.android.socialbase.appdownloader;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f10182a;

    /* renamed from: b, reason: collision with root package name */
    public int f10183b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f10184c;

    /* renamed from: d, reason: collision with root package name */
    public String f10185d;

    /* renamed from: e, reason: collision with root package name */
    public String f10186e;

    public String a() {
        return b().toString();
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        return jSONObject;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ah_plan_type", this.f10182a);
            jSONObject.put("error_code", String.valueOf(this.f10183b));
            jSONObject.put("error_msg", this.f10184c);
            jSONObject.put("real_device_plan", this.f10185d);
            jSONObject.put("device_plans", this.f10186e);
        } catch (Throwable unused) {
        }
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.f10186e = jSONObject.optString("device_plans", null);
            aVar.f10185d = jSONObject.optString("real_device_plan", null);
            aVar.f10184c = jSONObject.optString("error_msg", null);
            aVar.f10182a = jSONObject.optString("ah_plan_type", null);
            String optString = jSONObject.optString("error_code");
            if (TextUtils.isEmpty(optString)) {
                aVar.f10183b = -1;
            } else {
                aVar.f10183b = Integer.parseInt(optString);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return aVar;
    }
}
