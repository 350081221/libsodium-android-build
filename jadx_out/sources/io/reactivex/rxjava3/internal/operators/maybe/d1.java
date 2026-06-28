package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends T>> f17266b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 2026620218879969836L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends T>> resumeFunction;

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.d1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0479a<T> implements io.reactivex.rxjava3.core.a0<T> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.rxjava3.core.a0<? super T> f17267a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.rxjava3.disposables.e> f17268b;

            C0479a(io.reactivex.rxjava3.core.a0<? super T> a0Var, AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference) {
                this.f17267a = a0Var;
                this.f17268b = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.f17267a.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.f17267a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f17268b, eVar);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
            public void onSuccess(T t5) {
                this.f17267a.onSuccess(t5);
            }
        }

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends T>> oVar) {
            this.downstream = a0Var;
            this.resumeFunction = oVar;
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
            try {
                io.reactivex.rxjava3.core.d0<? extends T> apply = this.resumeFunction.apply(th);
                Objects.requireNonNull(apply, "The resumeFunction returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends T> d0Var = apply;
                io.reactivex.rxjava3.internal.disposables.c.replace(this, null);
                d0Var.a(new C0479a(this.downstream, this));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
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

    public d1(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends T>> oVar) {
        super(d0Var);
        this.f17266b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17266b));
    }
}
