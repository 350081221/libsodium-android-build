package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final d0<T> f17495b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f17496c;

    public p(d0<T> d0Var, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar) {
        this.f17495b = d0Var;
        this.f17496c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f17495b.a(new a(pVar, this.f17496c));
    }

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<R>, a0<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -8948264376121066672L;
        final org.reactivestreams.p<? super R> downstream;
        final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        io.reactivex.rxjava3.disposables.e upstream;

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar) {
            this.downstream = pVar;
            this.mapper = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.dispose();
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(R r5) {
            this.downstream.onNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                org.reactivestreams.o<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                org.reactivestreams.o<? extends R> oVar = apply;
                if (get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                    oVar.subscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this, this.requested, j5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this, this.requested, qVar);
        }
    }
}
