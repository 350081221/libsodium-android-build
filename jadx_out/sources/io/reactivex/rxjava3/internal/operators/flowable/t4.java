package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class t4<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final m3.s<U> f17066c;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscriptions.f<U> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -8134157938864266736L;
        org.reactivestreams.q upstream;

        /* JADX WARN: Multi-variable type inference failed */
        a(org.reactivestreams.p<? super U> pVar, U u4) {
            super(pVar);
            this.value = u4;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            complete(this.value);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            Collection collection = (Collection) this.value;
            if (collection != null) {
                collection.add(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public t4(io.reactivex.rxjava3.core.o<T> oVar, m3.s<U> sVar) {
        super(oVar);
        this.f17066c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        try {
            this.f16598b.N6(new a(pVar, (Collection) io.reactivex.rxjava3.internal.util.k.d(this.f17066c.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
