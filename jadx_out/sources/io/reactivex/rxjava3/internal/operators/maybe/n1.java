package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n1<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<U> f17359b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T> f17360c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.downstream = a0Var;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5955289211445418871L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final io.reactivex.rxjava3.core.d0<? extends T> fallback;
        final c<T, U> other = new c<>(this);
        final a<T> otherObserver;

        b(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var) {
            a<T> aVar;
            this.downstream = a0Var;
            this.fallback = d0Var;
            if (d0Var != null) {
                aVar = new a<>(a0Var);
            } else {
                aVar = null;
            }
            this.otherObserver = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            a<T> aVar = this.otherObserver;
            if (aVar != null) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(aVar);
            }
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

        public void otherComplete() {
            if (io.reactivex.rxjava3.internal.disposables.c.dispose(this)) {
                io.reactivex.rxjava3.core.d0<? extends T> d0Var = this.fallback;
                if (d0Var == null) {
                    this.downstream.onError(new TimeoutException());
                } else {
                    d0Var.a(this.otherObserver);
                }
            }
        }

        public void otherError(Throwable th) {
            if (io.reactivex.rxjava3.internal.disposables.c.dispose(this)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T, U> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final b<T, U> parent;

        c(b<T, U> bVar) {
            this.parent = bVar;
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
            get().cancel();
            this.parent.otherComplete();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    public n1(io.reactivex.rxjava3.core.d0<T> d0Var, org.reactivestreams.o<U> oVar, io.reactivex.rxjava3.core.d0<? extends T> d0Var2) {
        super(d0Var);
        this.f17359b = oVar;
        this.f17360c = d0Var2;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        b bVar = new b(a0Var, this.f17360c);
        a0Var.onSubscribe(bVar);
        this.f17359b.subscribe(bVar.other);
        this.f17232a.a(bVar);
    }
}
