package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1451a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f1452b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f1453c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1454d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1455e;

    public l(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z4) {
        this.f1451a = str;
        this.f1452b = mVar;
        this.f1453c = mVar2;
        this.f1454d = bVar;
        this.f1455e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.p(x0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f1454d;
    }

    public String c() {
        return this.f1451a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> d() {
        return this.f1452b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> e() {
        return this.f1453c;
    }

    public boolean f() {
        return this.f1455e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f1452b + ", size=" + this.f1453c + '}';
    }
}
