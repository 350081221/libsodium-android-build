package com.tendcloud.tenddata;

/* loaded from: classes3.dex */
public class df extends cy {

    /* renamed from: j, reason: collision with root package name */
    private static volatile df f11678j;

    /* renamed from: a, reason: collision with root package name */
    private final String f11679a = "oaid";

    /* renamed from: c, reason: collision with root package name */
    private final String f11680c = "vaid";

    /* renamed from: d, reason: collision with root package name */
    private final String f11681d = com.huawei.agconnect.credential.obs.c.f7851a;

    /* renamed from: e, reason: collision with root package name */
    private final String f11682e = "udid";

    /* renamed from: f, reason: collision with root package name */
    private volatile String f11683f = "";

    /* renamed from: g, reason: collision with root package name */
    private volatile String f11684g = "";

    /* renamed from: h, reason: collision with root package name */
    private volatile String f11685h = "";

    /* renamed from: i, reason: collision with root package name */
    private volatile String f11686i = "";

    private df() {
    }

    public static df a() {
        if (f11678j == null) {
            synchronized (df.class) {
                if (f11678j == null) {
                    f11678j = new df();
                }
            }
        }
        return f11678j;
    }

    public String c() {
        return this.f11683f;
    }

    public String d() {
        return this.f11684g;
    }

    public String e() {
        return this.f11685h;
    }

    public String f() {
        return this.f11686i;
    }

    public void setAAID(String str) {
        this.f11684g = str;
        a(com.huawei.agconnect.credential.obs.c.f7851a, str);
    }

    public void setOAID(String str) {
        this.f11683f = str;
        a("oaid", str);
    }

    public void setUDID(String str) {
        this.f11686i = str;
        a("udid", str);
    }

    public void setVAID(String str) {
        this.f11685h = str;
        a("vaid", str);
    }
}
