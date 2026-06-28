package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class s1<T> extends io.reactivex.rxjava3.core.r0<T> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17392a;

    /* renamed from: b, reason: collision with root package name */
    final T f17393b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f17394a;

        /* renamed from: b, reason: collision with root package name */
        final T f17395b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17396c;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, T t5) {
            this.f17394a = u0Var;
            this.f17395b = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17396c.dispose();
            this.f17396c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17396c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17396c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            T t5 = this.f17395b;
            if (t5 != null) {
                this.f17394a.onSuccess(t5);
            } else {
                this.f17394a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17396c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17394a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17396c, eVar)) {
                this.f17396c = eVar;
                this.f17394a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17396c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17394a.onSuccess(t5);
        }
    }

    public s1(io.reactivex.rxjava3.core.d0<T> d0Var, T t5) {
        this.f17392a = d0Var;
        this.f17393b = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f17392a.a(new a(u0Var, this.f17393b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17392a;
    }
}
