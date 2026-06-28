package com.yuanqi.group.widgets;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public static final int f14377f = 4369;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14378g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14379h = 16;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14380i = 256;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14381j = 4096;

    /* renamed from: a, reason: collision with root package name */
    private int f14382a;

    /* renamed from: b, reason: collision with root package name */
    private int f14383b;

    /* renamed from: c, reason: collision with root package name */
    private int f14384c;

    /* renamed from: d, reason: collision with root package name */
    private int f14385d;

    /* renamed from: e, reason: collision with root package name */
    private int f14386e = f14377f;

    public int a() {
        return this.f14382a;
    }

    public int b() {
        return this.f14384c;
    }

    public int c() {
        return this.f14385d;
    }

    public int d() {
        return e() * 2;
    }

    public int e() {
        if (this.f14383b <= 0) {
            return 0;
        }
        return Math.max(this.f14384c, this.f14385d) + this.f14383b;
    }

    public int f() {
        return this.f14383b;
    }

    public int g() {
        return this.f14386e;
    }

    public j h(int i5) {
        this.f14382a = i5;
        return this;
    }

    public j i(int i5) {
        this.f14384c = i5;
        return this;
    }

    public j j(int i5) {
        this.f14385d = i5;
        return this;
    }

    public j k(int i5) {
        this.f14383b = i5;
        return this;
    }

    public j l(int i5) {
        this.f14386e = i5;
        return this;
    }
}
