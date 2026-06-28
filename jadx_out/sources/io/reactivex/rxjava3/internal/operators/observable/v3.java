package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class v3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f18135b;

    /* renamed from: c, reason: collision with root package name */
    final long f18136c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f18137d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f18138e;

    /* renamed from: f, reason: collision with root package name */
    final int f18139f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f18140g;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.internal.queue.c<Object> queue;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final long time;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
            this.downstream = p0Var;
            this.count = j5;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = q0Var;
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            this.delayError = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (compareAndSet(false, true)) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            boolean z4;
            Throwable th;
            if (!compareAndSet(false, true)) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            boolean z5 = this.delayError;
            long d5 = this.scheduler.d(this.unit) - this.time;
            while (!this.cancelled) {
                if (!z5 && (th = this.error) != null) {
                    cVar.clear();
                    p0Var.onError(th);
                    return;
                }
                Object poll = cVar.poll();
                if (poll == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        p0Var.onError(th2);
                        return;
                    } else {
                        p0Var.onComplete();
                        return;
                    }
                }
                Object poll2 = cVar.poll();
                if (((Long) poll).longValue() >= d5) {
                    p0Var.onNext(poll2);
                }
            }
            cVar.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.error = th;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            boolean z4;
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            long d5 = this.scheduler.d(this.unit);
            long j5 = this.time;
            long j6 = this.count;
            if (j6 == Long.MAX_VALUE) {
                z4 = true;
            } else {
                z4 = false;
            }
            cVar.offer(Long.valueOf(d5), t5);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.peek()).longValue() <= d5 - j5 || (!z4 && (cVar.m() >> 1) > j6)) {
                    cVar.poll();
                    cVar.poll();
                } else {
                    return;
                }
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

    public v3(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, long j6, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
        super(n0Var);
        this.f18135b = j5;
        this.f18136c = j6;
        this.f18137d = timeUnit;
        this.f18138e = q0Var;
        this.f18139f = i5;
        this.f18140g = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18135b, this.f18136c, this.f18137d, this.f18138e, this.f18139f, this.f18140g));
    }
}
