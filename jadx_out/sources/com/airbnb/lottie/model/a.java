package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f1362a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f1363b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f1364c;

    public a() {
        this.f1362a = new PointF();
        this.f1363b = new PointF();
        this.f1364c = new PointF();
    }

    public PointF a() {
        return this.f1362a;
    }

    public PointF b() {
        return this.f1363b;
    }

    public PointF c() {
        return this.f1364c;
    }

    public void d(float f5, float f6) {
        this.f1362a.set(f5, f6);
    }

    public void e(float f5, float f6) {
        this.f1363b.set(f5, f6);
    }

    public void f(a aVar) {
        PointF pointF = aVar.f1364c;
        g(pointF.x, pointF.y);
        PointF pointF2 = aVar.f1362a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f1363b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f5, float f6) {
        this.f1364c.set(f5, f6);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f1364c.x), Float.valueOf(this.f1364c.y), Float.valueOf(this.f1362a.x), Float.valueOf(this.f1362a.y), Float.valueOf(this.f1363b.x), Float.valueOf(this.f1363b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f1362a = pointF;
        this.f1363b = pointF2;
        this.f1364c = pointF3;
    }
}
