package com.tendcloud.tenddata;

/* loaded from: classes3.dex */
public class dd extends cy {

    /* renamed from: a, reason: collision with root package name */
    public static dc f11670a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f11671c = "type";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11672d = "deviceId";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11673e = "runtimeConfig";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11674f = "hardwareConfig";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11675g = "softwareConfig";

    /* renamed from: h, reason: collision with root package name */
    private de f11676h = new de();

    /* renamed from: i, reason: collision with root package name */
    private db f11677i = new db();

    public dd() {
        d();
    }

    private void d() {
        a("type", "mobile");
        dc dcVar = new dc();
        f11670a = dcVar;
        a(f11672d, dcVar.b());
        a(f11673e, new dg().b());
        a(f11674f, this.f11677i.b());
        a(f11675g, this.f11676h.b());
    }

    public de a() {
        return this.f11676h;
    }

    public db c() {
        return this.f11677i;
    }
}
