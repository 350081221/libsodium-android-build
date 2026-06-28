package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w0<T, U> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18475a;

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<U> f18476b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -622603812305745221L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final b other = new b(this);

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.downstream = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.other.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.other.dispose();
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && getAndSet(cVar) != cVar) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.other.dispose();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (getAndSet(cVar) != cVar) {
                this.downstream.onSuccess(t5);
            }
        }

        void otherError(Throwable th) {
            io.reactivex.rxjava3.disposables.e andSet;
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && (andSet = getAndSet(cVar)) != cVar) {
                if (andSet != null) {
                    andSet.dispose();
                }
                this.downstream.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final a<?> parent;

        b(a<?> aVar) {
            this.parent = aVar;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            org.reactivestreams.q qVar = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                lazySet(jVar);
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.cancel(this)) {
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    public w0(io.reactivex.rxjava3.core.x0<T> x0Var, org.reactivestreams.o<U> oVar) {
        this.f18475a = x0Var;
        this.f18476b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        a aVar = new a(u0Var);
        u0Var.onSubscribe(aVar);
        this.f18476b.subscribe(aVar.other);
        this.f18475a.a(aVar);
    }
}
