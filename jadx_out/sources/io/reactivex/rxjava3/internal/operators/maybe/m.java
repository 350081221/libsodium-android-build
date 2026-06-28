package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class m<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<U> f17345b;

    /* loaded from: classes3.dex */
    static final class a<T, U> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final b<T> f17346a;

        /* renamed from: b, reason: collision with root package name */
        final org.reactivestreams.o<U> f17347b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17348c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, org.reactivestreams.o<U> oVar) {
            this.f17346a = new b<>(a0Var);
            this.f17347b = oVar;
        }

        void a() {
            this.f17347b.subscribe(this.f17346a);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17348c.dispose();
            this.f17348c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.f17346a);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17346a.get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17348c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            a();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17348c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17346a.error = th;
            a();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17348c, eVar)) {
                this.f17348c = eVar;
                this.f17346a.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f17348c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17346a.value = t5;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        Throwable error;
        T value;

        b(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.downstream = a0Var;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t5 = this.value;
            if (t5 != null) {
                this.downstream.onSuccess(t5);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            Throwable th2 = this.error;
            if (th2 == null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th2, th));
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            org.reactivestreams.q qVar = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                lazySet(jVar);
                qVar.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    public m(io.reactivex.rxjava3.core.d0<T> d0Var, org.reactivestreams.o<U> oVar) {
        super(d0Var);
        this.f17345b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17345b));
    }
}
