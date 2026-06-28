package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class h4<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17744b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 1015244841293359600L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final io.reactivex.rxjava3.core.q0 scheduler;
        io.reactivex.rxjava3.disposables.e upstream;

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0507a implements Runnable {
            RunnableC0507a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.upstream.dispose();
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = p0Var;
            this.scheduler = q0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.e(new RunnableC0507a());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (get()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (!get()) {
                this.downstream.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public h4(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        super(n0Var);
        this.f17744b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17744b));
    }
}
