package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l1<T> extends io.reactivex.rxjava3.core.x<io.reactivex.rxjava3.schedulers.d<T>> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17336a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f17337b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17338c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17339d;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super io.reactivex.rxjava3.schedulers.d<T>> f17340a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f17341b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f17342c;

        /* renamed from: d, reason: collision with root package name */
        final long f17343d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17344e;

        a(io.reactivex.rxjava3.core.a0<? super io.reactivex.rxjava3.schedulers.d<T>> a0Var, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            long j5;
            this.f17340a = a0Var;
            this.f17341b = timeUnit;
            this.f17342c = q0Var;
            if (z4) {
                j5 = q0Var.d(timeUnit);
            } else {
                j5 = 0;
            }
            this.f17343d = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17344e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17344e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17340a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(@l3.f Throwable th) {
            this.f17340a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17344e, eVar)) {
                this.f17344e = eVar;
                this.f17340a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(@l3.f T t5) {
            this.f17340a.onSuccess(new io.reactivex.rxjava3.schedulers.d(t5, this.f17342c.d(this.f17341b) - this.f17343d, this.f17341b));
        }
    }

    public l1(io.reactivex.rxjava3.core.d0<T> d0Var, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        this.f17336a = d0Var;
        this.f17337b = timeUnit;
        this.f17338c = q0Var;
        this.f17339d = z4;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(@l3.f io.reactivex.rxjava3.core.a0<? super io.reactivex.rxjava3.schedulers.d<T>> a0Var) {
        this.f17336a.a(new a(a0Var, this.f17337b, this.f17338c, this.f17339d));
    }
}
