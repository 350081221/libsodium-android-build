package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a4<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17540b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17541c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17542d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17543e;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.e upstream;
        final q0.c worker;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, q0.c cVar, boolean z4) {
            this.downstream = p0Var;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
            this.emitLast = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.downstream;
            int i5 = 1;
            while (!this.cancelled) {
                boolean z5 = this.done;
                if (z5 && this.error != null) {
                    atomicReference.lazySet(null);
                    p0Var.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                if (atomicReference.get() == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z4 && this.emitLast) {
                        p0Var.onNext(andSet);
                    }
                    p0Var.onComplete();
                    this.worker.dispose();
                    return;
                }
                if (z4) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    p0Var.onNext(atomicReference.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.c(this, this.timeout, this.unit);
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.latest.set(t5);
            drain();
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
            this.timerFired = true;
            drain();
        }
    }

    public a4(io.reactivex.rxjava3.core.i0<T> i0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(i0Var);
        this.f17540b = j5;
        this.f17541c = timeUnit;
        this.f17542d = q0Var;
        this.f17543e = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17540b, this.f17541c, this.f17542d.c(), this.f17543e));
    }
}
