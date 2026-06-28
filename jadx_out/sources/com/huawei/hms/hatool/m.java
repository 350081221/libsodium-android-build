package com.huawei.hms.hatool;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public k f8630a;

    /* renamed from: b, reason: collision with root package name */
    public k f8631b;

    /* renamed from: c, reason: collision with root package name */
    public k f8632c;

    /* renamed from: d, reason: collision with root package name */
    public k f8633d;

    public m(String str) {
    }

    public k a() {
        return this.f8632c;
    }

    public k a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        y.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public void a(k kVar) {
        this.f8630a = kVar;
    }

    public k b() {
        return this.f8630a;
    }

    public void b(k kVar) {
        this.f8631b = kVar;
    }

    public k c() {
        return this.f8631b;
    }

    public k d() {
        return this.f8633d;
    }
}
