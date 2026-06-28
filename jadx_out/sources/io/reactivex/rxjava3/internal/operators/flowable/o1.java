package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class o1<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f16919b;

    public o1(org.reactivestreams.o<? extends T> oVar) {
        this.f16919b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16919b.subscribe(pVar);
    }
}
