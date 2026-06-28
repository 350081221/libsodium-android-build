package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f18203b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f18204c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18205d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.e upstream;
        final q0.c worker;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, q0.c cVar) {
            this.downstream = p0Var;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (!this.gate) {
                this.gate = true;
                this.downstream.onNext(t5);
                io.reactivex.rxjava3.disposables.e eVar = get();
                if (eVar != null) {
                    eVar.dispose();
                }
                io.reactivex.rxjava3.internal.disposables.c.replace(this, this.worker.c(this, this.timeout, this.unit));
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }
    }

    public z3(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        super(n0Var);
        this.f18203b = j5;
        this.f18204c = timeUnit;
        this.f18205d = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(new io.reactivex.rxjava3.observers.m(p0Var), this.f18203b, this.f18204c, this.f18205d.c()));
    }
}
