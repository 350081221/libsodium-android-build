package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d0<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18341a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> f18342b;

    /* loaded from: classes3.dex */
    static final class a<R> implements io.reactivex.rxjava3.core.a0<R> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f18343a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f18344b;

        a(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.core.a0<? super R> a0Var) {
            this.f18343a = atomicReference;
            this.f18344b = a0Var;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f18344b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18344b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this.f18343a, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(R r5) {
            this.f18344b.onSuccess(r5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5843758257109742742L;
        final io.reactivex.rxjava3.core.a0<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> mapper;

        b(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar) {
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
                io.reactivex.rxjava3.core.d0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends R> d0Var = apply;
                if (!isDisposed()) {
                    d0Var.a(new a(this, this.downstream));
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                onError(th);
            }
        }
    }

    public d0(io.reactivex.rxjava3.core.x0<? extends T> x0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar) {
        this.f18342b = oVar;
        this.f18341a = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f18341a.a(new b(a0Var, this.f18342b));
    }
}
