package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class u0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18460a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends T>> f18461b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5314538511045349925L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends T>> nextFunction;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends T>> oVar) {
            this.downstream = u0Var;
            this.nextFunction = oVar;
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
            try {
                io.reactivex.rxjava3.core.x0<? extends T> apply = this.nextFunction.apply(th);
                Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                apply.a(new io.reactivex.rxjava3.internal.observers.a0(this, this.downstream));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }
    }

    public u0(io.reactivex.rxjava3.core.x0<? extends T> x0Var, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends T>> oVar) {
        this.f18460a = x0Var;
        this.f18461b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18460a.a(new a(u0Var, this.f18461b));
    }
}
