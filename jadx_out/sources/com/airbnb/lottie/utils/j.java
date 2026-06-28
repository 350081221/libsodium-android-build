package com.airbnb.lottie.utils;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private float f1765a;

    /* renamed from: b, reason: collision with root package name */
    private int f1766b;

    public void a(float f5) {
        float f6 = this.f1765a + f5;
        this.f1765a = f6;
        int i5 = this.f1766b + 1;
        this.f1766b = i5;
        if (i5 == Integer.MAX_VALUE) {
            this.f1765a = f6 / 2.0f;
            this.f1766b = i5 / 2;
        }
    }

    public float b() {
        int i5 = this.f1766b;
        if (i5 == 0) {
            return 0.0f;
        }
        return this.f1765a / i5;
    }
}
