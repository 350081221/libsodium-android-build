package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class x0<T> extends io.reactivex.rxjava3.core.r0<io.reactivex.rxjava3.schedulers.d<T>> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18478a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f18479b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18480c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18481d;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super io.reactivex.rxjava3.schedulers.d<T>> f18482a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f18483b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f18484c;

        /* renamed from: d, reason: collision with root package name */
        final long f18485d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18486e;

        a(io.reactivex.rxjava3.core.u0<? super io.reactivex.rxjava3.schedulers.d<T>> u0Var, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            long j5;
            this.f18482a = u0Var;
            this.f18483b = timeUnit;
            this.f18484c = q0Var;
            if (z4) {
                j5 = q0Var.d(timeUnit);
            } else {
                j5 = 0;
            }
            this.f18485d = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18486e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18486e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(@l3.f Throwable th) {
            this.f18482a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18486e, eVar)) {
                this.f18486e = eVar;
                this.f18482a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(@l3.f T t5) {
            this.f18482a.onSuccess(new io.reactivex.rxjava3.schedulers.d(t5, this.f18484c.d(this.f18483b) - this.f18485d, this.f18483b));
        }
    }

    public x0(io.reactivex.rxjava3.core.x0<T> x0Var, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        this.f18478a = x0Var;
        this.f18479b = timeUnit;
        this.f18480c = q0Var;
        this.f18481d = z4;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(@l3.f io.reactivex.rxjava3.core.u0<? super io.reactivex.rxjava3.schedulers.d<T>> u0Var) {
        this.f18478a.a(new a(u0Var, this.f18479b, this.f18480c, this.f18481d));
    }
}
