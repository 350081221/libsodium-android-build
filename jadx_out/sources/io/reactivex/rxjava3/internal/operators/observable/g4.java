package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class g4<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.core.r0<U> implements io.reactivex.rxjava3.internal.fuseable.f<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17717a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<U> f17718b;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super U> f17719a;

        /* renamed from: b, reason: collision with root package name */
        U f17720b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17721c;

        a(io.reactivex.rxjava3.core.u0<? super U> u0Var, U u4) {
            this.f17719a = u0Var;
            this.f17720b = u4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17721c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17721c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            U u4 = this.f17720b;
            this.f17720b = null;
            this.f17719a.onSuccess(u4);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17720b = null;
            this.f17719a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17720b.add(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17721c, eVar)) {
                this.f17721c = eVar;
                this.f17719a.onSubscribe(this);
            }
        }
    }

    public g4(io.reactivex.rxjava3.core.n0<T> n0Var, int i5) {
        this.f17717a = n0Var;
        this.f17718b = io.reactivex.rxjava3.internal.functions.a.f(i5);
    }

    @Override // io.reactivex.rxjava3.core.r0
    public void M1(io.reactivex.rxjava3.core.u0<? super U> u0Var) {
        try {
            this.f17717a.subscribe(new a(u0Var, (Collection) io.reactivex.rxjava3.internal.util.k.d(this.f17718b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<U> b() {
        return io.reactivex.rxjava3.plugins.a.R(new f4(this.f17717a, this.f17718b));
    }

    public g4(io.reactivex.rxjava3.core.n0<T> n0Var, m3.s<U> sVar) {
        this.f17717a = n0Var;
        this.f17718b = sVar;
    }
}
