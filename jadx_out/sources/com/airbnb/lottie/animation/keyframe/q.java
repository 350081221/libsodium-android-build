package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.Nullable;
import java.util.Collections;

/* loaded from: classes2.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f1135i;

    public q(com.airbnb.lottie.value.j<A> jVar) {
        this(jVar, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public A h() {
        com.airbnb.lottie.value.j<A> jVar = this.f1073e;
        A a5 = this.f1135i;
        return jVar.b(0.0f, 0.0f, a5, a5, f(), f(), f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    A i(com.airbnb.lottie.value.a<K> aVar, float f5) {
        return h();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void l() {
        if (this.f1073e != null) {
            super.l();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void n(float f5) {
        this.f1072d = f5;
    }

    public q(com.airbnb.lottie.value.j<A> jVar, @Nullable A a5) {
        super(Collections.emptyList());
        o(jVar);
        this.f1135i = a5;
    }
}
