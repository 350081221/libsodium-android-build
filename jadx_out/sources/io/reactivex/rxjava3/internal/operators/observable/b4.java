package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b4<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.schedulers.d<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17565b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17566c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.schedulers.d<T>> f17567a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f17568b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f17569c;

        /* renamed from: d, reason: collision with root package name */
        long f17570d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17571e;

        a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.schedulers.d<T>> p0Var, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            this.f17567a = p0Var;
            this.f17569c = q0Var;
            this.f17568b = timeUnit;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17571e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17571e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17567a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17567a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            long d5 = this.f17569c.d(this.f17568b);
            long j5 = this.f17570d;
            this.f17570d = d5;
            this.f17567a.onNext(new io.reactivex.rxjava3.schedulers.d(t5, d5 - j5, this.f17568b));
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17571e, eVar)) {
                this.f17571e = eVar;
                this.f17570d = this.f17569c.d(this.f17568b);
                this.f17567a.onSubscribe(this);
            }
        }
    }

    public b4(io.reactivex.rxjava3.core.n0<T> n0Var, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        super(n0Var);
        this.f17565b = q0Var;
        this.f17566c = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.schedulers.d<T>> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17566c, this.f17565b));
    }
}
