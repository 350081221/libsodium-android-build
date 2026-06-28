package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i1<T> extends io.reactivex.rxjava3.core.r0<T> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17319a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f17320b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4603919676453758899L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final io.reactivex.rxjava3.core.x0<? extends T> other;

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.i1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0483a<T> implements io.reactivex.rxjava3.core.u0<T> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.rxjava3.core.u0<? super T> f17321a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.rxjava3.disposables.e> f17322b;

            C0483a(io.reactivex.rxjava3.core.u0<? super T> u0Var, AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference) {
                this.f17321a = u0Var;
                this.f17322b = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.f17321a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f17322b, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(T t5) {
                this.f17321a.onSuccess(t5);
            }
        }

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
            this.downstream = u0Var;
            this.other = x0Var;
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
                this.other.a(new C0483a(this.downstream, this));
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

    public i1(io.reactivex.rxjava3.core.d0<T> d0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var) {
        this.f17319a = d0Var;
        this.f17320b = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f17319a.a(new a(u0Var, this.f17320b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17319a;
    }
}
