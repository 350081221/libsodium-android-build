package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class h<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17302a;

    /* renamed from: b, reason: collision with root package name */
    final Object f17303b;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.a0<Object>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f17304a;

        /* renamed from: b, reason: collision with root package name */
        final Object f17305b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17306c;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, Object obj) {
            this.f17304a = u0Var;
            this.f17305b = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17306c.dispose();
            this.f17306c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17306c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17306c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17304a.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17306c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17304a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17306c, eVar)) {
                this.f17306c = eVar;
                this.f17304a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(Object obj) {
            this.f17306c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17304a.onSuccess(Boolean.valueOf(Objects.equals(obj, this.f17305b)));
        }
    }

    public h(io.reactivex.rxjava3.core.d0<T> d0Var, Object obj) {
        this.f17302a = d0Var;
        this.f17303b = obj;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f17302a.a(new a(u0Var, this.f17303b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17302a;
    }
}
