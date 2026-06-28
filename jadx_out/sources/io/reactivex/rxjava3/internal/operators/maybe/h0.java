package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h0<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17307a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f17308b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4827726964688405508L;
        final io.reactivex.rxjava3.core.a0<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> mapper;

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar) {
            this.downstream = a0Var;
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
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.x0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.x0<? extends R> x0Var = apply;
                if (!isDisposed()) {
                    x0Var.a(new b(this, this.downstream));
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                onError(th);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<R> implements io.reactivex.rxjava3.core.u0<R> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f17309a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f17310b;

        b(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.core.a0<? super R> a0Var) {
            this.f17309a = atomicReference;
            this.f17310b = a0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17310b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this.f17309a, eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(R r5) {
            this.f17310b.onSuccess(r5);
        }
    }

    public h0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar) {
        this.f17307a = d0Var;
        this.f17308b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f17307a.a(new a(a0Var, this.f17308b));
    }
}
