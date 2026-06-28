package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.h3;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class l3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super io.reactivex.rxjava3.core.o<Throwable>, ? extends org.reactivestreams.o<?>> f16856c;

    /* loaded from: classes3.dex */
    static final class a<T> extends h3.c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.processors.c<Throwable> cVar, org.reactivestreams.q qVar) {
            super(pVar, cVar, qVar);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            again(th);
        }
    }

    public l3(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super io.reactivex.rxjava3.core.o<Throwable>, ? extends org.reactivestreams.o<?>> oVar2) {
        super(oVar);
        this.f16856c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e(pVar);
        io.reactivex.rxjava3.processors.c<T> r9 = io.reactivex.rxjava3.processors.h.u9(8).r9();
        try {
            org.reactivestreams.o<?> apply = this.f16856c.apply(r9);
            Objects.requireNonNull(apply, "handler returned a null Publisher");
            org.reactivestreams.o<?> oVar = apply;
            h3.b bVar = new h3.b(this.f16598b);
            a aVar = new a(eVar, r9, bVar);
            bVar.subscriber = aVar;
            pVar.onSubscribe(aVar);
            oVar.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
