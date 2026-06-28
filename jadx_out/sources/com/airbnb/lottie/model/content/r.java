package com.airbnb.lottie.model.content;

import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1475a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1476b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f1477c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1478d;

    public r(String str, int i5, com.airbnb.lottie.model.animatable.h hVar, boolean z4) {
        this.f1475a = str;
        this.f1476b = i5;
        this.f1477c = hVar;
        this.f1478d = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.s(x0Var, bVar, this);
    }

    public String b() {
        return this.f1475a;
    }

    public com.airbnb.lottie.model.animatable.h c() {
        return this.f1477c;
    }

    public boolean d() {
        return this.f1478d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f1475a + ", index=" + this.f1476b + '}';
    }
}
