package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.internal.operators.flowable.g1;

/* loaded from: classes3.dex */
public final class g<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18249a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Iterable<? extends R>> f18250b;

    /* renamed from: c, reason: collision with root package name */
    final int f18251c;

    public g(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, ? extends Iterable<? extends R>> oVar, int i5) {
        this.f18249a = bVar;
        this.f18250b = oVar;
        this.f18251c = i5;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18249a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super R>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            pVarArr2[i5] = g1.n9(pVarArr[i5], this.f18250b, this.f18251c);
        }
        this.f18249a.X(pVarArr2);
    }
}
