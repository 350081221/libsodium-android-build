package com.umeng.analytics.pro;

import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ab extends z {

    /* renamed from: a, reason: collision with root package name */
    private String f12121a;

    /* renamed from: b, reason: collision with root package name */
    private String f12122b;

    public ab(String str, ArrayList<aa> arrayList) {
        super(str, arrayList);
        this.f12121a = "";
        this.f12122b = "";
    }

    @Override // com.umeng.analytics.pro.z, com.umeng.analytics.pro.ag
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject a5 = super.a(str, jSONObject);
        if (a5 != null) {
            try {
                a5.put(com.umeng.ccg.a.f12840s, this.f12121a);
                a5.put("action", this.f12122b);
            } catch (Throwable unused) {
            }
        }
        return a5;
    }

    public void c(String str) {
        this.f12121a = str;
    }

    public String d() {
        return this.f12121a;
    }

    public String e() {
        return this.f12122b;
    }

    public void d(String str) {
        this.f12122b = str;
    }
}
