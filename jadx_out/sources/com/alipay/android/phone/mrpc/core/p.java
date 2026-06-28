package com.alipay.android.phone.mrpc.core;

/* loaded from: classes2.dex */
public final class p extends u {

    /* renamed from: c, reason: collision with root package name */
    public int f2746c;

    /* renamed from: d, reason: collision with root package name */
    public String f2747d;

    /* renamed from: e, reason: collision with root package name */
    public long f2748e;

    /* renamed from: f, reason: collision with root package name */
    public long f2749f;

    /* renamed from: g, reason: collision with root package name */
    public String f2750g;

    /* renamed from: h, reason: collision with root package name */
    public HttpUrlHeader f2751h;

    public p(HttpUrlHeader httpUrlHeader, int i5, String str, byte[] bArr) {
        this.f2751h = httpUrlHeader;
        this.f2746c = i5;
        this.f2747d = str;
        this.f2772a = bArr;
    }

    public final HttpUrlHeader a() {
        return this.f2751h;
    }

    public final void a(long j5) {
        this.f2748e = j5;
    }

    public final void a(String str) {
        this.f2750g = str;
    }

    public final void b(long j5) {
        this.f2749f = j5;
    }
}
