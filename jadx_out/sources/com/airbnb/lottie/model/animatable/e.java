package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<PointF>> f1365a;

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.f1365a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        if (this.f1365a.get(0).i()) {
            return new com.airbnb.lottie.animation.keyframe.k(this.f1365a);
        }
        return new com.airbnb.lottie.animation.keyframe.j(this.f1365a);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        return this.f1365a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f1365a.size() == 1 && this.f1365a.get(0).i();
    }
}
