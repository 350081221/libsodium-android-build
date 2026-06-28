package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18487a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f18488b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 3258103020495908596L;
        final io.reactivex.rxjava3.core.u0<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> mapper;

        /* renamed from: io.reactivex.rxjava3.internal.operators.single.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0524a<R> implements io.reactivex.rxjava3.core.u0<R> {

            /* renamed from: a, reason: collision with root package name */
            final AtomicReference<io.reactivex.rxjava3.disposables.e> f18489a;

            /* renamed from: b, reason: collision with root package name */
            final io.reactivex.rxjava3.core.u0<? super R> f18490b;

            C0524a(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.core.u0<? super R> u0Var) {
                this.f18489a = atomicReference;
                this.f18490b = u0Var;
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.f18490b.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this.f18489a, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                this.f18490b.onSuccess(r5);
            }
        }

        a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar) {
            this.downstream = u0Var;
            this.mapper = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.x0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The single returned by the mapper is null");
                io.reactivex.rxjava3.core.x0<? extends R> x0Var = apply;
                if (!isDisposed()) {
                    x0Var.a(new C0524a(this, this.downstream));
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public y(io.reactivex.rxjava3.core.x0<? extends T> x0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar) {
        this.f18488b = oVar;
        this.f18487a = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        this.f18487a.a(new a(u0Var, this.f18488b));
    }
}
