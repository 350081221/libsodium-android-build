package io.reactivex.rxjava3.internal.operators.observable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class s0<T> extends io.reactivex.rxjava3.core.r0<T> implements io.reactivex.rxjava3.internal.fuseable.f<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18052a;

    /* renamed from: b, reason: collision with root package name */
    final long f18053b;

    /* renamed from: c, reason: collision with root package name */
    final T f18054c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18055a;

        /* renamed from: b, reason: collision with root package name */
        final long f18056b;

        /* renamed from: c, reason: collision with root package name */
        final T f18057c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18058d;

        /* renamed from: e, reason: collision with root package name */
        long f18059e;

        /* renamed from: f, reason: collision with root package name */
        boolean f18060f;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, long j5, T t5) {
            this.f18055a = u0Var;
            this.f18056b = j5;
            this.f18057c = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18058d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18058d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f18060f) {
                this.f18060f = true;
                T t5 = this.f18057c;
                if (t5 != null) {
                    this.f18055a.onSuccess(t5);
                } else {
                    this.f18055a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18060f) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18060f = true;
                this.f18055a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18060f) {
                return;
            }
            long j5 = this.f18059e;
            if (j5 == this.f18056b) {
                this.f18060f = true;
                this.f18058d.dispose();
                this.f18055a.onSuccess(t5);
                return;
            }
            this.f18059e = j5 + 1;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18058d, eVar)) {
                this.f18058d = eVar;
                this.f18055a.onSubscribe(this);
            }
        }
    }

    public s0(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, T t5) {
        this.f18052a = n0Var;
        this.f18053b = j5;
        this.f18054c = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    public void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18052a.subscribe(new a(u0Var, this.f18053b, this.f18054c));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<T> b() {
        return io.reactivex.rxjava3.plugins.a.R(new q0(this.f18052a, this.f18053b, this.f18054c, true));
    }
}
