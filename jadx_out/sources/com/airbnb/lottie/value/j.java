package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes2.dex */
public class j<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f1809a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<?, ?> f1810b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    protected T f1811c;

    public j() {
        this.f1809a = new b<>();
        this.f1811c = null;
    }

    @Nullable
    public T a(b<T> bVar) {
        return this.f1811c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f5, float f6, T t5, T t6, float f7, float f8, float f9) {
        return a(this.f1809a.h(f5, f6, t5, t6, f7, f8, f9));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@Nullable com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f1810b = aVar;
    }

    public final void d(@Nullable T t5) {
        this.f1811c = t5;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVar = this.f1810b;
        if (aVar != null) {
            aVar.l();
        }
    }

    public j(@Nullable T t5) {
        this.f1809a = new b<>();
        this.f1811c = t5;
    }
}
