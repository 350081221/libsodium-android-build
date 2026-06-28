package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class u4<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.core.r0<U> implements io.reactivex.rxjava3.internal.fuseable.d<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17076a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<U> f17077b;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super U> f17078a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f17079b;

        /* renamed from: c, reason: collision with root package name */
        U f17080c;

        a(io.reactivex.rxjava3.core.u0<? super U> u0Var, U u4) {
            this.f17078a = u0Var;
            this.f17080c = u4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17079b.cancel();
            this.f17079b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17079b == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17079b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17078a.onSuccess(this.f17080c);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17080c = null;
            this.f17079b = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f17078a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f17080c.add(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17079b, qVar)) {
                this.f17079b = qVar;
                this.f17078a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public u4(io.reactivex.rxjava3.core.o<T> oVar) {
        this(oVar, io.reactivex.rxjava3.internal.util.b.asSupplier());
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super U> u0Var) {
        try {
            this.f17076a.N6(new a(u0Var, (Collection) io.reactivex.rxjava3.internal.util.k.d(this.f17077b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<U> d() {
        return io.reactivex.rxjava3.plugins.a.P(new t4(this.f17076a, this.f17077b));
    }

    public u4(io.reactivex.rxjava3.core.o<T> oVar, m3.s<U> sVar) {
        this.f17076a = oVar;
        this.f17077b = sVar;
    }
}
