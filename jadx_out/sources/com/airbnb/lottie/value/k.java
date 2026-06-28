package com.airbnb.lottie.value;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private float f1812a;

    /* renamed from: b, reason: collision with root package name */
    private float f1813b;

    public k(float f5, float f6) {
        this.f1812a = f5;
        this.f1813b = f6;
    }

    public boolean a(float f5, float f6) {
        return this.f1812a == f5 && this.f1813b == f6;
    }

    public float b() {
        return this.f1812a;
    }

    public float c() {
        return this.f1813b;
    }

    public void d(float f5, float f6) {
        this.f1812a = f5;
        this.f1813b = f6;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
