package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class s<T, U> extends io.reactivex.rxjava3.core.r0<U> implements io.reactivex.rxjava3.internal.fuseable.f<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18044a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends U> f18045b;

    /* renamed from: c, reason: collision with root package name */
    final m3.b<? super U, ? super T> f18046c;

    /* loaded from: classes3.dex */
    static final class a<T, U> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super U> f18047a;

        /* renamed from: b, reason: collision with root package name */
        final m3.b<? super U, ? super T> f18048b;

        /* renamed from: c, reason: collision with root package name */
        final U f18049c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18050d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18051e;

        a(io.reactivex.rxjava3.core.u0<? super U> u0Var, U u4, m3.b<? super U, ? super T> bVar) {
            this.f18047a = u0Var;
            this.f18048b = bVar;
            this.f18049c = u4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18050d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18050d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f18051e) {
                return;
            }
            this.f18051e = true;
            this.f18047a.onSuccess(this.f18049c);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18051e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18051e = true;
                this.f18047a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18051e) {
                return;
            }
            try {
                this.f18048b.accept(this.f18049c, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18050d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18050d, eVar)) {
                this.f18050d = eVar;
                this.f18047a.onSubscribe(this);
            }
        }
    }

    public s(io.reactivex.rxjava3.core.n0<T> n0Var, m3.s<? extends U> sVar, m3.b<? super U, ? super T> bVar) {
        this.f18044a = n0Var;
        this.f18045b = sVar;
        this.f18046c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super U> u0Var) {
        try {
            U u4 = this.f18045b.get();
            Objects.requireNonNull(u4, "The initialSupplier returned a null value");
            this.f18044a.subscribe(new a(u0Var, u4, this.f18046c));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<U> b() {
        return io.reactivex.rxjava3.plugins.a.R(new r(this.f18044a, this.f18045b, this.f18046c));
    }
}
