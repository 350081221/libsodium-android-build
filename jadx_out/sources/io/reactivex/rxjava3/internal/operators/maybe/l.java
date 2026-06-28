package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17329b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17330c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17331d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17332e;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;
        final long delay;
        final boolean delayError;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final TimeUnit unit;
        T value;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.downstream = a0Var;
            this.delay = j5;
            this.unit = timeUnit;
            this.scheduler = q0Var;
            this.delayError = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            schedule(this.delay);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            long j5;
            this.error = th;
            if (this.delayError) {
                j5 = this.delay;
            } else {
                j5 = 0;
            }
            schedule(j5);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.value = t5;
            schedule(this.delay);
        }

        @Override // java.lang.Runnable
        public void run() {
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

        void schedule(long j5) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, this.scheduler.g(this, j5, this.unit));
        }
    }

    public l(io.reactivex.rxjava3.core.d0<T> d0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(d0Var);
        this.f17329b = j5;
        this.f17330c = timeUnit;
        this.f17331d = q0Var;
        this.f17332e = z4;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17329b, this.f17330c, this.f17331d, this.f17332e));
    }
}
