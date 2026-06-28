package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class w3<T> extends io.reactivex.rxjava3.core.r0<T> implements io.reactivex.rxjava3.internal.fuseable.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17118a;

    /* renamed from: b, reason: collision with root package name */
    final T f17119b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f17120a;

        /* renamed from: b, reason: collision with root package name */
        final T f17121b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f17122c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17123d;

        /* renamed from: e, reason: collision with root package name */
        T f17124e;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, T t5) {
            this.f17120a = u0Var;
            this.f17121b = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17122c.cancel();
            this.f17122c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17122c == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f17123d) {
                return;
            }
            this.f17123d = true;
            this.f17122c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            T t5 = this.f17124e;
            this.f17124e = null;
            if (t5 == null) {
                t5 = this.f17121b;
            }
            if (t5 != null) {
                this.f17120a.onSuccess(t5);
            } else {
                this.f17120a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17123d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17123d = true;
            this.f17122c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17120a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f17123d) {
                return;
            }
            if (this.f17124e != null) {
                this.f17123d = true;
                this.f17122c.cancel();
                this.f17122c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f17120a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f17124e = t5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17122c, qVar)) {
                this.f17122c = qVar;
                this.f17120a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public w3(io.reactivex.rxjava3.core.o<T> oVar, T t5) {
        this.f17118a = oVar;
        this.f17119b = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f17118a.N6(new a(u0Var, this.f17119b));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<T> d() {
        return io.reactivex.rxjava3.plugins.a.P(new u3(this.f17118a, this.f17119b, true));
    }
}
