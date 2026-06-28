package com.bytedance.pangle.util.b.b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f4627a;

    /* renamed from: e, reason: collision with root package name */
    public int f4631e;

    /* renamed from: f, reason: collision with root package name */
    public int f4632f;

    /* renamed from: g, reason: collision with root package name */
    public int f4633g;

    /* renamed from: h, reason: collision with root package name */
    public String f4634h;

    /* renamed from: i, reason: collision with root package name */
    public long f4635i;

    /* renamed from: b, reason: collision with root package name */
    public long f4628b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f4629c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f4630d = 0;

    /* renamed from: j, reason: collision with root package name */
    private final long f4636j = 30;

    public final long a() {
        long j5 = this.f4629c;
        if (j5 <= 0) {
            return this.f4630d;
        }
        return j5;
    }

    public final long b() {
        return c() + a();
    }

    public final long c() {
        return this.f4631e + 30 + this.f4633g;
    }
}
