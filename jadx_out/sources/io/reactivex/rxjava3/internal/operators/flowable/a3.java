package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class a3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.c<T, T, T> f16607c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -4663883003264602070L;
        final m3.c<T, T, T> reducer;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, m3.c<T, T, T> cVar) {
            super(pVar);
            this.reducer = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
            this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            org.reactivestreams.q qVar = this.upstream;
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar == jVar) {
                return;
            }
            this.upstream = jVar;
            T t5 = this.value;
            if (t5 != null) {
                complete(t5);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            org.reactivestreams.q qVar = this.upstream;
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar == jVar) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.upstream = jVar;
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.upstream == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                return;
            }
            T t6 = this.value;
            if (t6 == null) {
                this.value = t5;
                return;
            }
            try {
                T apply = this.reducer.apply(t6, t5);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.value = apply;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                onError(th);
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

    public a3(io.reactivex.rxjava3.core.o<T> oVar, m3.c<T, T, T> cVar) {
        super(oVar);
        this.f16607c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16607c));
    }
}
