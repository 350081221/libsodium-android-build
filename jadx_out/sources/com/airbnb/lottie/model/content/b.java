package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1402a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f1403b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f1404c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1405d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1406e;

    public b(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z4, boolean z5) {
        this.f1402a = str;
        this.f1403b = mVar;
        this.f1404c = fVar;
        this.f1405d = z4;
        this.f1406e = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(x0Var, bVar, this);
    }

    public String b() {
        return this.f1402a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> c() {
        return this.f1403b;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f1404c;
    }

    public boolean e() {
        return this.f1406e;
    }

    public boolean f() {
        return this.f1405d;
    }
}
