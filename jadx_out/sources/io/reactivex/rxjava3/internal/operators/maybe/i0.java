package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i0<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> f17317b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.rxjava3.core.a0<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.e upstream;

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0482a implements io.reactivex.rxjava3.core.a0<R> {
            C0482a() {
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
            public void onComplete() {
                a.this.downstream.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(a.this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                a.this.downstream.onSuccess(r5);
            }
        }

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar) {
            this.downstream = a0Var;
            this.mapper = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.upstream.dispose();
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
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.d0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends R> d0Var = apply;
                if (!isDisposed()) {
                    d0Var.a(new C0482a());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public i0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar) {
        super(d0Var);
        this.f17317b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17317b));
    }
}
