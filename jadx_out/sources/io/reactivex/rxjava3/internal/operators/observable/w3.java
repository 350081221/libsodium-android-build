package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w3<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends U> f18167b;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 1418547743690811973L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();
        final a<T, U>.C0513a otherObserver = new C0513a();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w3$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0513a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            C0513a() {
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                a.this.otherComplete();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                a.this.otherError(th);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(U u4) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                a.this.otherComplete();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            io.reactivex.rxjava3.internal.util.l.e(this.downstream, t5, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        void otherComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.error);
        }

        void otherError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.error);
        }
    }

    public w3(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<? extends U> n0Var2) {
        super(n0Var);
        this.f18167b = n0Var2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        this.f18167b.subscribe(aVar.otherObserver);
        this.f17528a.subscribe(aVar);
    }
}
