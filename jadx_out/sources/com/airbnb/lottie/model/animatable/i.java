package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final b f1366a;

    /* renamed from: b, reason: collision with root package name */
    private final b f1367b;

    public i(b bVar, b bVar2) {
        this.f1366a = bVar;
        this.f1367b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f1366a.a(), this.f1367b.a());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f1366a.c() && this.f1367b.c();
    }
}
