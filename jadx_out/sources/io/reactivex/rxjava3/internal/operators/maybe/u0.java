package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class u0<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.h<T>, io.reactivex.rxjava3.internal.fuseable.e<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17409a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f17410a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17411b;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
            this.f17410a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17411b.dispose();
            this.f17411b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17411b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17411b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17410a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17411b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17410a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17411b, eVar)) {
                this.f17411b = eVar;
                this.f17410a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17411b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17410a.onSuccess(Boolean.FALSE);
        }
    }

    public u0(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17409a = d0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f17409a.a(new a(u0Var));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.e
    public io.reactivex.rxjava3.core.x<Boolean> c() {
        return io.reactivex.rxjava3.plugins.a.Q(new t0(this.f17409a));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17409a;
    }
}
