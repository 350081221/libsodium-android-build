package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1461a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<Float, Float> f1462b;

    public n(String str, com.airbnb.lottie.model.animatable.m<Float, Float> mVar) {
        this.f1461a = str;
        this.f1462b = mVar;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.r(x0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.m<Float, Float> b() {
        return this.f1462b;
    }

    public String c() {
        return this.f1461a;
    }
}
