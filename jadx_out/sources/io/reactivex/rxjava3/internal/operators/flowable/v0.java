package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class v0<T> extends io.reactivex.rxjava3.core.r0<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17088a;

    /* renamed from: b, reason: collision with root package name */
    final long f17089b;

    /* renamed from: c, reason: collision with root package name */
    final T f17090c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f17091a;

        /* renamed from: b, reason: collision with root package name */
        final long f17092b;

        /* renamed from: c, reason: collision with root package name */
        final T f17093c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f17094d;

        /* renamed from: e, reason: collision with root package name */
        long f17095e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17096f;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, long j5, T t5) {
            this.f17091a = u0Var;
            this.f17092b = j5;
            this.f17093c = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17094d.cancel();
            this.f17094d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17094d == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17094d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (!this.f17096f) {
                this.f17096f = true;
                T t5 = this.f17093c;
                if (t5 != null) {
                    this.f17091a.onSuccess(t5);
                } else {
                    this.f17091a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17096f) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17096f = true;
            this.f17094d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17091a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f17096f) {
                return;
            }
            long j5 = this.f17095e;
            if (j5 == this.f17092b) {
                this.f17096f = true;
                this.f17094d.cancel();
                this.f17094d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f17091a.onSuccess(t5);
                return;
            }
            this.f17095e = j5 + 1;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17094d, qVar)) {
                this.f17094d = qVar;
                this.f17091a.onSubscribe(this);
                qVar.request(this.f17092b + 1);
            }
        }
    }

    public v0(io.reactivex.rxjava3.core.o<T> oVar, long j5, T t5) {
        this.f17088a = oVar;
        this.f17089b = j5;
        this.f17090c = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f17088a.N6(new a(u0Var, this.f17089b, this.f17090c));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new s0(this.f17088a, this.f17089b, this.f17090c, true));
    }
}
