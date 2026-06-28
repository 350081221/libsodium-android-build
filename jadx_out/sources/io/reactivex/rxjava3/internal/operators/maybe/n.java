package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<U> f17354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.downstream = a0Var;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f17355a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.core.d0<T> f17356b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f17357c;

        b(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.core.d0<T> d0Var) {
            this.f17355a = new a<>(a0Var);
            this.f17356b = d0Var;
        }

        void a() {
            io.reactivex.rxjava3.core.d0<T> d0Var = this.f17356b;
            this.f17356b = null;
            d0Var.a(this.f17355a);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17357c.cancel();
            this.f17357c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f17355a);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f17355a.get());
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            org.reactivestreams.q qVar = this.f17357c;
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                this.f17357c = jVar;
                a();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            org.reactivestreams.q qVar = this.f17357c;
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                this.f17357c = jVar;
                this.f17355a.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            org.reactivestreams.q qVar = this.f17357c;
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                qVar.cancel();
                this.f17357c = jVar;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17357c, qVar)) {
                this.f17357c = qVar;
                this.f17355a.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public n(io.reactivex.rxjava3.core.d0<T> d0Var, org.reactivestreams.o<U> oVar) {
        super(d0Var);
        this.f17354b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17354b.subscribe(new b(a0Var, this.f17232a));
    }
}
