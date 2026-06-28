package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class s<T, U> extends io.reactivex.rxjava3.core.r0<U> implements io.reactivex.rxjava3.internal.fuseable.d<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17018a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends U> f17019b;

    /* renamed from: c, reason: collision with root package name */
    final m3.b<? super U, ? super T> f17020c;

    /* loaded from: classes3.dex */
    static final class a<T, U> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super U> f17021a;

        /* renamed from: b, reason: collision with root package name */
        final m3.b<? super U, ? super T> f17022b;

        /* renamed from: c, reason: collision with root package name */
        final U f17023c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f17024d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17025e;

        a(io.reactivex.rxjava3.core.u0<? super U> u0Var, U u4, m3.b<? super U, ? super T> bVar) {
            this.f17021a = u0Var;
            this.f17022b = bVar;
            this.f17023c = u4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17024d.cancel();
            this.f17024d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17024d == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f17025e) {
                return;
            }
            this.f17025e = true;
            this.f17024d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17021a.onSuccess(this.f17023c);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17025e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f17025e = true;
            this.f17024d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17021a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f17025e) {
                return;
            }
            try {
                this.f17022b.accept(this.f17023c, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17024d.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17024d, qVar)) {
                this.f17024d = qVar;
                this.f17021a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public s(io.reactivex.rxjava3.core.o<T> oVar, m3.s<? extends U> sVar, m3.b<? super U, ? super T> bVar) {
        this.f17018a = oVar;
        this.f17019b = sVar;
        this.f17020c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super U> u0Var) {
        try {
            U u4 = this.f17019b.get();
            Objects.requireNonNull(u4, "The initialSupplier returned a null value");
            this.f17018a.N6(new a(u0Var, u4, this.f17020c));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<U> d() {
        return io.reactivex.rxjava3.plugins.a.P(new r(this.f17018a, this.f17019b, this.f17020c));
    }
}
