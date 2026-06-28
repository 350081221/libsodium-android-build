package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
abstract class f<T> extends j<T> {

    /* renamed from: d, reason: collision with root package name */
    private final T f1805d;

    /* renamed from: e, reason: collision with root package name */
    private final T f1806e;

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator f1807f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(T t5, T t6) {
        this(t5, t6, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.j
    public T a(b<T> bVar) {
        return e(this.f1805d, this.f1806e, this.f1807f.getInterpolation(bVar.e()));
    }

    abstract T e(T t5, T t6, float f5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(T t5, T t6, Interpolator interpolator) {
        this.f1805d = t5;
        this.f1806e = t6;
        this.f1807f = interpolator;
    }
}
