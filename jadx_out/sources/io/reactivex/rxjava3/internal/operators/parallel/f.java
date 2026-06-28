package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.internal.operators.flowable.z0;

/* loaded from: classes3.dex */
public final class f<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18244a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f18245b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18246c;

    /* renamed from: d, reason: collision with root package name */
    final int f18247d;

    /* renamed from: e, reason: collision with root package name */
    final int f18248e;

    public f(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, boolean z4, int i5, int i6) {
        this.f18244a = bVar;
        this.f18245b = oVar;
        this.f18246c = z4;
        this.f18247d = i5;
        this.f18248e = i6;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18244a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super R>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            pVarArr2[i5] = z0.n9(pVarArr[i5], this.f18245b, this.f18246c, this.f18247d, this.f18248e);
        }
        this.f18244a.X(pVarArr2);
    }
}
