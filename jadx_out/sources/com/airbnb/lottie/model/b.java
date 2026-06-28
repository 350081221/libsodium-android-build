package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f1383a;

    /* renamed from: b, reason: collision with root package name */
    public String f1384b;

    /* renamed from: c, reason: collision with root package name */
    public float f1385c;

    /* renamed from: d, reason: collision with root package name */
    public a f1386d;

    /* renamed from: e, reason: collision with root package name */
    public int f1387e;

    /* renamed from: f, reason: collision with root package name */
    public float f1388f;

    /* renamed from: g, reason: collision with root package name */
    public float f1389g;

    /* renamed from: h, reason: collision with root package name */
    @ColorInt
    public int f1390h;

    /* renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f1391i;

    /* renamed from: j, reason: collision with root package name */
    public float f1392j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1393k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public PointF f1394l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public PointF f1395m;

    /* loaded from: classes2.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f5, a aVar, int i5, float f6, float f7, @ColorInt int i6, @ColorInt int i7, float f8, boolean z4, PointF pointF, PointF pointF2) {
        a(str, str2, f5, aVar, i5, f6, f7, i6, i7, f8, z4, pointF, pointF2);
    }

    public void a(String str, String str2, float f5, a aVar, int i5, float f6, float f7, @ColorInt int i6, @ColorInt int i7, float f8, boolean z4, PointF pointF, PointF pointF2) {
        this.f1383a = str;
        this.f1384b = str2;
        this.f1385c = f5;
        this.f1386d = aVar;
        this.f1387e = i5;
        this.f1388f = f6;
        this.f1389g = f7;
        this.f1390h = i6;
        this.f1391i = i7;
        this.f1392j = f8;
        this.f1393k = z4;
        this.f1394l = pointF;
        this.f1395m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f1383a.hashCode() * 31) + this.f1384b.hashCode()) * 31) + this.f1385c)) * 31) + this.f1386d.ordinal()) * 31) + this.f1387e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f1388f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f1390h;
    }

    public b() {
    }
}
