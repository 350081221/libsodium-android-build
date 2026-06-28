package io.reactivex.rxjava3.internal.operators.observable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class j3<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17787a;

    /* renamed from: b, reason: collision with root package name */
    final T f17788b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f17789a;

        /* renamed from: b, reason: collision with root package name */
        final T f17790b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17791c;

        /* renamed from: d, reason: collision with root package name */
        T f17792d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17793e;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, T t5) {
            this.f17789a = u0Var;
            this.f17790b = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17791c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17791c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17793e) {
                return;
            }
            this.f17793e = true;
            T t5 = this.f17792d;
            this.f17792d = null;
            if (t5 == null) {
                t5 = this.f17790b;
            }
            if (t5 != null) {
                this.f17789a.onSuccess(t5);
            } else {
                this.f17789a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17793e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17793e = true;
                this.f17789a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17793e) {
                return;
            }
            if (this.f17792d != null) {
                this.f17793e = true;
                this.f17791c.dispose();
                this.f17789a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f17792d = t5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17791c, eVar)) {
                this.f17791c = eVar;
                this.f17789a.onSubscribe(this);
            }
        }
    }

    public j3(io.reactivex.rxjava3.core.n0<? extends T> n0Var, T t5) {
        this.f17787a = n0Var;
        this.f17788b = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    public void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f17787a.subscribe(new a(u0Var, this.f17788b));
    }
}
