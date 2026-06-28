package com.airbnb.lottie.utils;

import androidx.core.os.TraceCompat;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    private static final int f1749e = 5;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f1750a = new String[5];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f1751b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    private int f1752c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f1753d = 0;

    public void a(String str) {
        int i5 = this.f1752c;
        if (i5 == 5) {
            this.f1753d++;
            return;
        }
        this.f1750a[i5] = str;
        this.f1751b[i5] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.f1752c++;
    }

    public float b(String str) {
        int i5 = this.f1753d;
        if (i5 > 0) {
            this.f1753d = i5 - 1;
            return 0.0f;
        }
        int i6 = this.f1752c - 1;
        this.f1752c = i6;
        if (i6 != -1) {
            if (str.equals(this.f1750a[i6])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - this.f1751b[this.f1752c])) / 1000000.0f;
            }
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f1750a[this.f1752c] + ".");
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }
}
