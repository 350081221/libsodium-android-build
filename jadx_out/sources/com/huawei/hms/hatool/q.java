package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public String f8665a;

    /* renamed from: b, reason: collision with root package name */
    public String f8666b;

    /* renamed from: c, reason: collision with root package name */
    public String f8667c;

    /* renamed from: d, reason: collision with root package name */
    public String f8668d;

    /* renamed from: e, reason: collision with root package name */
    public String f8669e;

    /* renamed from: f, reason: collision with root package name */
    public String f8670f;

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f8665a);
        jSONObject.put("eventtime", this.f8668d);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f8666b);
        jSONObject.put("event_session_name", this.f8669e);
        jSONObject.put("first_session_event", this.f8670f);
        if (TextUtils.isEmpty(this.f8667c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f8667c));
        return jSONObject;
    }

    public void a(String str) {
        this.f8667c = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f8666b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
        this.f8667c = jSONObject.optString("properties");
        this.f8667c = d.a(this.f8667c, d0.f().a());
        this.f8665a = jSONObject.optString("type");
        this.f8668d = jSONObject.optString("eventtime");
        this.f8669e = jSONObject.optString("event_session_name");
        this.f8670f = jSONObject.optString("first_session_event");
    }

    public String b() {
        return this.f8668d;
    }

    public void b(String str) {
        this.f8666b = str;
    }

    public String c() {
        return this.f8665a;
    }

    public void c(String str) {
        this.f8668d = str;
    }

    public JSONObject d() {
        JSONObject a5 = a();
        a5.put("properties", d.b(this.f8667c, d0.f().a()));
        return a5;
    }

    public void d(String str) {
        this.f8665a = str;
    }

    public void e(String str) {
        this.f8670f = str;
    }

    public void f(String str) {
        this.f8669e = str;
    }
}
