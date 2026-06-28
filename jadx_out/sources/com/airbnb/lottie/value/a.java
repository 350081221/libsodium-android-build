package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final float f1779q = -3987645.8f;

    /* renamed from: r, reason: collision with root package name */
    private static final int f1780r = 784923401;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.k f1781a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f1782b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public T f1783c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final Interpolator f1784d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final Interpolator f1785e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final Interpolator f1786f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1787g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Float f1788h;

    /* renamed from: i, reason: collision with root package name */
    private float f1789i;

    /* renamed from: j, reason: collision with root package name */
    private float f1790j;

    /* renamed from: k, reason: collision with root package name */
    private int f1791k;

    /* renamed from: l, reason: collision with root package name */
    private int f1792l;

    /* renamed from: m, reason: collision with root package name */
    private float f1793m;

    /* renamed from: n, reason: collision with root package name */
    private float f1794n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f1795o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f1796p;

    public a(com.airbnb.lottie.k kVar, @Nullable T t5, @Nullable T t6, @Nullable Interpolator interpolator, float f5, @Nullable Float f6) {
        this.f1789i = f1779q;
        this.f1790j = f1779q;
        this.f1791k = f1780r;
        this.f1792l = f1780r;
        this.f1793m = Float.MIN_VALUE;
        this.f1794n = Float.MIN_VALUE;
        this.f1795o = null;
        this.f1796p = null;
        this.f1781a = kVar;
        this.f1782b = t5;
        this.f1783c = t6;
        this.f1784d = interpolator;
        this.f1785e = null;
        this.f1786f = null;
        this.f1787g = f5;
        this.f1788h = f6;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return f5 >= f() && f5 < c();
    }

    public a<T> b(T t5, T t6) {
        return new a<>(t5, t6);
    }

    public float c() {
        if (this.f1781a == null) {
            return 1.0f;
        }
        if (this.f1794n == Float.MIN_VALUE) {
            if (this.f1788h == null) {
                this.f1794n = 1.0f;
            } else {
                this.f1794n = f() + ((this.f1788h.floatValue() - this.f1787g) / this.f1781a.e());
            }
        }
        return this.f1794n;
    }

    public float d() {
        if (this.f1790j == f1779q) {
            this.f1790j = ((Float) this.f1783c).floatValue();
        }
        return this.f1790j;
    }

    public int e() {
        if (this.f1792l == f1780r) {
            this.f1792l = ((Integer) this.f1783c).intValue();
        }
        return this.f1792l;
    }

    public float f() {
        com.airbnb.lottie.k kVar = this.f1781a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f1793m == Float.MIN_VALUE) {
            this.f1793m = (this.f1787g - kVar.r()) / this.f1781a.e();
        }
        return this.f1793m;
    }

    public float g() {
        if (this.f1789i == f1779q) {
            this.f1789i = ((Float) this.f1782b).floatValue();
        }
        return this.f1789i;
    }

    public int h() {
        if (this.f1791k == f1780r) {
            this.f1791k = ((Integer) this.f1782b).intValue();
        }
        return this.f1791k;
    }

    public boolean i() {
        return this.f1784d == null && this.f1785e == null && this.f1786f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f1782b + ", endValue=" + this.f1783c + ", startFrame=" + this.f1787g + ", endFrame=" + this.f1788h + ", interpolator=" + this.f1784d + '}';
    }

    public a(com.airbnb.lottie.k kVar, @Nullable T t5, @Nullable T t6, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f5, @Nullable Float f6) {
        this.f1789i = f1779q;
        this.f1790j = f1779q;
        this.f1791k = f1780r;
        this.f1792l = f1780r;
        this.f1793m = Float.MIN_VALUE;
        this.f1794n = Float.MIN_VALUE;
        this.f1795o = null;
        this.f1796p = null;
        this.f1781a = kVar;
        this.f1782b = t5;
        this.f1783c = t6;
        this.f1784d = null;
        this.f1785e = interpolator;
        this.f1786f = interpolator2;
        this.f1787g = f5;
        this.f1788h = f6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(com.airbnb.lottie.k kVar, @Nullable T t5, @Nullable T t6, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f5, @Nullable Float f6) {
        this.f1789i = f1779q;
        this.f1790j = f1779q;
        this.f1791k = f1780r;
        this.f1792l = f1780r;
        this.f1793m = Float.MIN_VALUE;
        this.f1794n = Float.MIN_VALUE;
        this.f1795o = null;
        this.f1796p = null;
        this.f1781a = kVar;
        this.f1782b = t5;
        this.f1783c = t6;
        this.f1784d = interpolator;
        this.f1785e = interpolator2;
        this.f1786f = interpolator3;
        this.f1787g = f5;
        this.f1788h = f6;
    }

    public a(T t5) {
        this.f1789i = f1779q;
        this.f1790j = f1779q;
        this.f1791k = f1780r;
        this.f1792l = f1780r;
        this.f1793m = Float.MIN_VALUE;
        this.f1794n = Float.MIN_VALUE;
        this.f1795o = null;
        this.f1796p = null;
        this.f1781a = null;
        this.f1782b = t5;
        this.f1783c = t5;
        this.f1784d = null;
        this.f1785e = null;
        this.f1786f = null;
        this.f1787g = Float.MIN_VALUE;
        this.f1788h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(T t5, T t6) {
        this.f1789i = f1779q;
        this.f1790j = f1779q;
        this.f1791k = f1780r;
        this.f1792l = f1780r;
        this.f1793m = Float.MIN_VALUE;
        this.f1794n = Float.MIN_VALUE;
        this.f1795o = null;
        this.f1796p = null;
        this.f1781a = null;
        this.f1782b = t5;
        this.f1783c = t6;
        this.f1784d = null;
        this.f1785e = null;
        this.f1786f = null;
        this.f1787g = Float.MIN_VALUE;
        this.f1788h = Float.valueOf(Float.MAX_VALUE);
    }
}
