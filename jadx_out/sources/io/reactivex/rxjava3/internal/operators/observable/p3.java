package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17959b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8094547886072529208L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final a<T> f17960a;

        b(a<T> aVar) {
            this.f17960a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p3.this.f17528a.subscribe(this.f17960a);
        }
    }

    public p3(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        super(n0Var);
        this.f17959b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        aVar.setDisposable(this.f17959b.e(new b(aVar)));
    }
}
