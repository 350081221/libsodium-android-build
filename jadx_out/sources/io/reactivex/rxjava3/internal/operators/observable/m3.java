package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class m3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17860b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17861c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17862d;

    /* renamed from: e, reason: collision with root package name */
    final int f17863e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f17864f;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.internal.queue.c<Object> queue;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final long time;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
            this.downstream = p0Var;
            this.time = j5;
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
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<Object> cVar = this.queue;
            boolean z5 = this.delayError;
            TimeUnit timeUnit = this.unit;
            io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
            long j5 = this.time;
            int i5 = 1;
            while (!this.cancelled) {
                boolean z6 = this.done;
                Long l5 = (Long) cVar.peek();
                if (l5 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long d5 = q0Var.d(timeUnit);
                if (!z4 && l5.longValue() > d5 - j5) {
                    z4 = true;
                }
                if (z6) {
                    if (z5) {
                        if (z4) {
                            Throwable th = this.error;
                            if (th != null) {
                                p0Var.onError(th);
                                return;
                            } else {
                                p0Var.onComplete();
                                return;
                            }
                        }
                    } else {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.queue.clear();
                            p0Var.onError(th2);
                            return;
                        } else if (z4) {
                            p0Var.onComplete();
                            return;
                        }
                    }
                }
                if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    cVar.poll();
                    p0Var.onNext(cVar.poll());
                }
            }
            this.queue.clear();
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
            this.queue.offer(Long.valueOf(this.scheduler.d(this.unit)), t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public m3(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
        super(n0Var);
        this.f17860b = j5;
        this.f17861c = timeUnit;
        this.f17862d = q0Var;
        this.f17863e = i5;
        this.f17864f = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17860b, this.f17861c, this.f17862d, this.f17863e, this.f17864f));
    }
}
