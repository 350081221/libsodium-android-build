package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c0<T, U, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends U>> f17256b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super T, ? super U, ? extends R> f17257c;

    /* loaded from: classes3.dex */
    static final class a<T, U, R> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends U>> f17258a;

        /* renamed from: b, reason: collision with root package name */
        final C0478a<T, U, R> f17259b;

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.c0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0478a<T, U, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<U> {
            private static final long serialVersionUID = -2897979525538174559L;
            final io.reactivex.rxjava3.core.a0<? super R> downstream;
            final m3.c<? super T, ? super U, ? extends R> resultSelector;
            T value;

            C0478a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.c<? super T, ? super U, ? extends R> cVar) {
                this.downstream = a0Var;
                this.resultSelector = cVar;
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

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends U>> oVar, m3.c<? super T, ? super U, ? extends R> cVar) {
            this.f17259b = new C0478a<>(a0Var, cVar);
            this.f17258a = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17259b);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f17259b.get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17259b.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17259b.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f17259b, eVar)) {
                this.f17259b.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.d0<? extends U> apply = this.f17258a.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends U> d0Var = apply;
                if (io.reactivex.rxjava3.internal.disposables.c.replace(this.f17259b, null)) {
                    C0478a<T, U, R> c0478a = this.f17259b;
                    c0478a.value = t5;
                    d0Var.a(c0478a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17259b.downstream.onError(th);
            }
        }
    }

    public c0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends U>> oVar, m3.c<? super T, ? super U, ? extends R> cVar) {
        super(d0Var);
        this.f17256b = oVar;
        this.f17257c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17256b, this.f17257c));
    }
}
