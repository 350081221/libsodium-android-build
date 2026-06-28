package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class j0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f8576a = b.i();

    /* renamed from: b, reason: collision with root package name */
    public String f8577b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f8578c;

    /* renamed from: d, reason: collision with root package name */
    public String f8579d;

    /* renamed from: e, reason: collision with root package name */
    public String f8580e;

    /* renamed from: f, reason: collision with root package name */
    public String f8581f;

    /* renamed from: g, reason: collision with root package name */
    public String f8582g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f8583h;

    public j0(String str, JSONObject jSONObject, String str2, String str3, long j5) {
        this.f8577b = str;
        this.f8578c = jSONObject;
        this.f8579d = str2;
        this.f8580e = str3;
        this.f8581f = String.valueOf(j5);
        if (a.i(str2, "oper")) {
            f0 a5 = e0.a().a(str2, j5);
            this.f8582g = a5.a();
            this.f8583h = Boolean.valueOf(a5.b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        y.c("hmsSdk", "Begin to run EventRecordTask...");
        int h5 = b.h();
        int k5 = c.k(this.f8579d, this.f8580e);
        if (q0.a(this.f8576a, "stat_v2_1", h5 * 1048576)) {
            y.c("hmsSdk", "stat sp file reach max limited size, discard new event");
            h0.a().a("", "alltype");
            return;
        }
        q qVar = new q();
        qVar.b(this.f8577b);
        qVar.a(this.f8578c.toString());
        qVar.d(this.f8580e);
        qVar.c(this.f8581f);
        qVar.f(this.f8582g);
        Boolean bool = this.f8583h;
        qVar.e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject d5 = qVar.d();
            String a5 = u0.a(this.f8579d, this.f8580e);
            String a6 = g0.a(this.f8576a, "stat_v2_1", a5, "");
            try {
                jSONArray = !TextUtils.isEmpty(a6) ? new JSONArray(a6) : new JSONArray();
            } catch (JSONException unused) {
                y.d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(d5);
            g0.b(this.f8576a, "stat_v2_1", a5, jSONArray.toString());
            if (jSONArray.toString().length() > k5 * 1024) {
                h0.a().a(this.f8579d, this.f8580e);
            }
        } catch (JSONException unused2) {
            y.e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
