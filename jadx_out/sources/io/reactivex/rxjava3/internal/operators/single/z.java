package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z<T, U, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18496a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends U>> f18497b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super T, ? super U, ? extends R> f18498c;

    /* loaded from: classes3.dex */
    static final class a<T, U, R> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends U>> f18499a;

        /* renamed from: b, reason: collision with root package name */
        final C0526a<T, U, R> f18500b;

        /* renamed from: io.reactivex.rxjava3.internal.operators.single.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0526a<T, U, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<U> {
            private static final long serialVersionUID = -2897979525538174559L;
            final io.reactivex.rxjava3.core.u0<? super R> downstream;
            final m3.c<? super T, ? super U, ? extends R> resultSelector;
            T value;

            C0526a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.c<? super T, ? super U, ? extends R> cVar) {
                this.downstream = u0Var;
                this.resultSelector = cVar;
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(U u4) {
                T t5 = this.value;
                this.value = null;
                try {
                    R apply = this.resultSelector.apply(t5, u4);
                    Objects.requireNonNull(apply, "The resultSelector returned a null value");
                    this.downstream.onSuccess(apply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.downstream.onError(th);
                }
            }
        }

        a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends U>> oVar, m3.c<? super T, ? super U, ? extends R> cVar) {
            this.f18500b = new C0526a<>(u0Var, cVar);
            this.f18499a = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18500b);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f18500b.get());
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18500b.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f18500b, eVar)) {
                this.f18500b.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.x0<? extends U> apply = this.f18499a.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.x0<? extends U> x0Var = apply;
                if (io.reactivex.rxjava3.internal.disposables.c.replace(this.f18500b, null)) {
                    C0526a<T, U, R> c0526a = this.f18500b;
                    c0526a.value = t5;
                    x0Var.a(c0526a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18500b.downstream.onError(th);
            }
        }
    }

    public z(io.reactivex.rxjava3.core.x0<T> x0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends U>> oVar, m3.c<? super T, ? super U, ? extends R> cVar) {
        this.f18496a = x0Var;
        this.f18497b = oVar;
        this.f18498c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        this.f18496a.a(new a(u0Var, this.f18497b, this.f18498c));
    }
}
