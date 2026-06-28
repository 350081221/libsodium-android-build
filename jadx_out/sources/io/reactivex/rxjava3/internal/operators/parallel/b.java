package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.internal.operators.flowable.v;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18209a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f18210b;

    /* renamed from: c, reason: collision with root package name */
    final int f18211c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f18212d;

    public b(io.reactivex.rxjava3.parallel.b<T> bVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar, int i5, io.reactivex.rxjava3.internal.util.j jVar) {
        this.f18209a = bVar;
        Objects.requireNonNull(oVar, "mapper");
        this.f18210b = oVar;
        this.f18211c = i5;
        Objects.requireNonNull(jVar, "errorMode");
        this.f18212d = jVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18209a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super R>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            pVarArr2[i5] = v.n9(pVarArr[i5], this.f18210b, this.f18211c, this.f18212d);
        }
        this.f18209a.X(pVarArr2);
    }
}
