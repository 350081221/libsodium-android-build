package org.jdeferred.multiple;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f21610a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21611b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21612c;

    public b(int i5, int i6, int i7) {
        this.f21610a = i5;
        this.f21611b = i6;
        this.f21612c = i7;
    }

    public int a() {
        return this.f21610a;
    }

    public int b() {
        return this.f21611b;
    }

    public int c() {
        return this.f21612c;
    }

    public String toString() {
        return "MasterProgress [done=" + this.f21610a + ", fail=" + this.f21611b + ", total=" + this.f21612c + "]";
    }
}
