package io.reactivex.rxjava3.internal.jdk8;

import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class b0<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f16299a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16300b;

    /* renamed from: c, reason: collision with root package name */
    final int f16301c;

    public b0(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, ? extends Stream<? extends R>> oVar, int i5) {
        this.f16299a = bVar;
        this.f16300b = oVar;
        this.f16301c = i5;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f16299a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super R>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            pVarArr2[i5] = f.n9(pVarArr[i5], this.f16300b, this.f16301c);
        }
        this.f16299a.X(pVarArr2);
    }
}
