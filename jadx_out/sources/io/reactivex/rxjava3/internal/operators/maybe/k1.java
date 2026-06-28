package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k1<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<U> f17328b;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final C0485a<U> other = new C0485a<>(this);

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.k1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0485a<U> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final a<?, U> parent;

            C0485a(a<?, U> aVar) {
                this.parent = aVar;
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // org.reactivestreams.p
            public void onNext(Object obj) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
                this.parent.otherComplete();
            }

            @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
            public void onSubscribe(org.reactivestreams.q qVar) {
                io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
            }
        }

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.downstream = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (getAndSet(cVar) != cVar) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (getAndSet(cVar) != cVar) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (getAndSet(cVar) != cVar) {
                this.downstream.onSuccess(t5);
            }
        }

        void otherComplete() {
            if (io.reactivex.rxjava3.internal.disposables.c.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        void otherError(Throwable th) {
            if (io.reactivex.rxjava3.internal.disposables.c.dispose(this)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    public k1(io.reactivex.rxjava3.core.d0<T> d0Var, org.reactivestreams.o<U> oVar) {
        super(d0Var);
        this.f17328b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        a aVar = new a(a0Var);
        a0Var.onSubscribe(aVar);
        this.f17328b.subscribe(aVar.other);
        this.f17232a.a(aVar);
    }
}
