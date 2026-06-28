package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f0<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18369b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f18370c;

    public f0(io.reactivex.rxjava3.core.x0<T> x0Var, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar) {
        this.f18369b = x0Var;
        this.f18370c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f18369b.a(new a(pVar, this.f18370c));
    }

    /* loaded from: classes3.dex */
    static final class a<S, T> extends AtomicLong implements io.reactivex.rxjava3.core.u0<S>, io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 7759721921468635667L;
        io.reactivex.rxjava3.disposables.e disposable;
        final org.reactivestreams.p<? super T> downstream;
        final m3.o<? super S, ? extends org.reactivestreams.o<? extends T>> mapper;
        final AtomicReference<org.reactivestreams.q> parent = new AtomicReference<>();

        a(org.reactivestreams.p<? super T> pVar, m3.o<? super S, ? extends org.reactivestreams.o<? extends T>> oVar) {
            this.downstream = pVar;
            this.mapper = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.disposable.dispose();
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.parent);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.disposable = eVar;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(S s5) {
            try {
                org.reactivestreams.o<? extends T> apply = this.mapper.apply(s5);
                Objects.requireNonNull(apply, "the mapper returned a null Publisher");
                org.reactivestreams.o<? extends T> oVar = apply;
                if (this.parent.get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                    oVar.subscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.parent, this, j5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.parent, this, qVar);
        }
    }
}
