package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T> f17311b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -2223459372976438024L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final io.reactivex.rxjava3.core.d0<? extends T> other;

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.h1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0481a<T> implements io.reactivex.rxjava3.core.a0<T> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.rxjava3.core.a0<? super T> f17312a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.rxjava3.disposables.e> f17313b;

            C0481a(io.reactivex.rxjava3.core.a0<? super T> a0Var, AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference) {
                this.f17312a = a0Var;
                this.f17313b = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.f17312a.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.f17312a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f17313b, eVar);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
            public void onSuccess(T t5) {
                this.f17312a.onSuccess(t5);
            }
        }

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var) {
            this.downstream = a0Var;
            this.other = d0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            io.reactivex.rxjava3.disposables.e eVar = get();
            if (eVar != io.reactivex.rxjava3.internal.disposables.c.DISPOSED && compareAndSet(eVar, null)) {
                this.other.a(new C0481a(this.downstream, this));
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }
    }

    public h1(io.reactivex.rxjava3.core.d0<T> d0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var2) {
        super(d0Var);
        this.f17311b = d0Var2;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17311b));
    }
}
