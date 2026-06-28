package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class u2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends org.reactivestreams.o<? extends T>> f17073c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.i implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        boolean done;
        final org.reactivestreams.p<? super T> downstream;
        final m3.o<? super Throwable, ? extends org.reactivestreams.o<? extends T>> nextSupplier;
        boolean once;
        long produced;

        a(org.reactivestreams.p<? super T> pVar, m3.o<? super Throwable, ? extends org.reactivestreams.o<? extends T>> oVar) {
            super(false);
            this.downstream = pVar;
            this.nextSupplier = oVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.once) {
                if (this.done) {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.once = true;
            try {
                org.reactivestreams.o<? extends T> apply = this.nextSupplier.apply(th);
                Objects.requireNonNull(apply, "The nextSupplier returned a null Publisher");
                org.reactivestreams.o<? extends T> oVar = apply;
                long j5 = this.produced;
                if (j5 != 0) {
                    produced(j5);
                }
                oVar.subscribe(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (!this.once) {
                this.produced++;
            }
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            setSubscription(qVar);
        }
    }

    public u2(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super Throwable, ? extends org.reactivestreams.o<? extends T>> oVar2) {
        super(oVar);
        this.f17073c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar, this.f17073c);
        pVar.onSubscribe(aVar);
        this.f16598b.N6(aVar);
    }
}
