package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes2.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f1859a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1860b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1861c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1862d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1863e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private Bitmap f1864f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public y0(int i5, int i6, String str, String str2, String str3) {
        this.f1859a = i5;
        this.f1860b = i6;
        this.f1861c = str;
        this.f1862d = str2;
        this.f1863e = str3;
    }

    public y0 a(float f5) {
        y0 y0Var = new y0((int) (this.f1859a * f5), (int) (this.f1860b * f5), this.f1861c, this.f1862d, this.f1863e);
        Bitmap bitmap = this.f1864f;
        if (bitmap != null) {
            y0Var.i(Bitmap.createScaledBitmap(bitmap, y0Var.f1859a, y0Var.f1860b, true));
        }
        return y0Var;
    }

    @Nullable
    public Bitmap b() {
        return this.f1864f;
    }

    public String c() {
        return this.f1863e;
    }

    public String d() {
        return this.f1862d;
    }

    public int e() {
        return this.f1860b;
    }

    public String f() {
        return this.f1861c;
    }

    public int g() {
        return this.f1859a;
    }

    public boolean h() {
        return this.f1864f != null || (this.f1862d.startsWith("data:") && this.f1862d.indexOf("base64,") > 0);
    }

    public void i(@Nullable Bitmap bitmap) {
        this.f1864f = bitmap;
    }
}
