package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class u3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final T f17074c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17075d;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, T t5, boolean z4) {
            super(pVar);
            this.defaultValue = t5;
            this.failOnEmpty = z4;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t5 = this.value;
            this.value = null;
            if (t5 == null) {
                t5 = this.defaultValue;
            }
            if (t5 == null) {
                if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                    return;
                } else {
                    this.downstream.onComplete();
                    return;
                }
            }
            complete(t5);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.value != null) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.value = t5;
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

    public u3(io.reactivex.rxjava3.core.o<T> oVar, T t5, boolean z4) {
        super(oVar);
        this.f17074c = t5;
        this.f17075d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17074c, this.f17075d));
    }
}
