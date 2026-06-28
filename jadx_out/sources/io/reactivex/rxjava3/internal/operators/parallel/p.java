package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.schedulers.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class p<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<? extends T> f18304a;

    /* renamed from: b, reason: collision with root package name */
    final q0 f18305b;

    /* renamed from: c, reason: collision with root package name */
    final int f18306c;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends AtomicInteger implements t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final io.reactivex.rxjava3.internal.queue.b<T> queue;
        final AtomicLong requested = new AtomicLong();
        org.reactivestreams.q upstream;
        final q0.c worker;

        a(int i5, io.reactivex.rxjava3.internal.queue.b<T> bVar, q0.c cVar) {
            this.prefetch = i5;
            this.queue = bVar;
            this.limit = i5 - (i5 >> 2);
            this.worker = cVar;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // org.reactivestreams.p
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // org.reactivestreams.p
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new io.reactivex.rxjava3.exceptions.c("Queue is full?!"));
            } else {
                schedule();
            }
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                schedule();
            }
        }

        final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class b implements o.a {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T>[] f18307a;

        /* renamed from: b, reason: collision with root package name */
        final org.reactivestreams.p<T>[] f18308b;

        b(org.reactivestreams.p<? super T>[] pVarArr, org.reactivestreams.p<T>[] pVarArr2) {
            this.f18307a = pVarArr;
            this.f18308b = pVarArr2;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.o.a
        public void a(int i5, q0.c cVar) {
            p.this.c0(i5, this.f18307a, this.f18308b, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        c(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, int i5, io.reactivex.rxjava3.internal.queue.b<T> bVar, q0.c cVar2) {
            super(i5, bVar, cVar2);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            Throwable th;
            int i5 = this.consumed;
            io.reactivex.rxjava3.internal.queue.b<T> bVar = this.queue;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            int i6 = this.limit;
            int i7 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        bVar.clear();
                        return;
                    }
                    boolean z5 = this.done;
                    if (z5 && (th = this.error) != null) {
                        bVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = bVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z4) {
                            break;
                        }
                        if (cVar.tryOnNext(poll)) {
                            j6++;
                        }
                        i5++;
                        if (i5 == i6) {
                            this.upstream.request(i5);
                            i5 = 0;
                        }
                    }
                }
                if (j6 == j5) {
                    if (this.cancelled) {
                        bVar.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            bVar.clear();
                            cVar.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j6 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                }
                this.consumed = i5;
                i7 = addAndGet(-i7);
            } while (i7 != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final org.reactivestreams.p<? super T> downstream;

        d(org.reactivestreams.p<? super T> pVar, int i5, io.reactivex.rxjava3.internal.queue.b<T> bVar, q0.c cVar) {
            super(i5, bVar, cVar);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            Throwable th;
            int i5 = this.consumed;
            io.reactivex.rxjava3.internal.queue.b<T> bVar = this.queue;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            int i6 = this.limit;
            int i7 = 1;
            while (true) {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        bVar.clear();
                        return;
                    }
                    boolean z5 = this.done;
                    if (z5 && (th = this.error) != null) {
                        bVar.clear();
                        pVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = bVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        pVar.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z4) {
                            break;
                        }
                        pVar.onNext(poll);
                        j6++;
                        i5++;
                        if (i5 == i6) {
                            this.upstream.request(i5);
                            i5 = 0;
                        }
                    }
                }
                if (j6 == j5) {
                    if (this.cancelled) {
                        bVar.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            bVar.clear();
                            pVar.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            pVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j6 != 0 && j5 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j6);
                }
                int i8 = get();
                if (i8 == i7) {
                    this.consumed = i5;
                    i7 = addAndGet(-i7);
                    if (i7 == 0) {
                        return;
                    }
                } else {
                    i7 = i8;
                }
            }
        }
    }

    public p(io.reactivex.rxjava3.parallel.b<? extends T> bVar, q0 q0Var, int i5) {
        this.f18304a = bVar;
        this.f18305b = q0Var;
        this.f18306c = i5;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18304a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super T>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<T>[] pVarArr2 = new org.reactivestreams.p[length];
        Object obj = this.f18305b;
        if (obj instanceof io.reactivex.rxjava3.internal.schedulers.o) {
            ((io.reactivex.rxjava3.internal.schedulers.o) obj).a(length, new b(pVarArr, pVarArr2));
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                c0(i5, pVarArr, pVarArr2, this.f18305b.c());
            }
        }
        this.f18304a.X(pVarArr2);
    }

    void c0(int i5, org.reactivestreams.p<? super T>[] pVarArr, org.reactivestreams.p<T>[] pVarArr2, q0.c cVar) {
        org.reactivestreams.p<? super T> pVar = pVarArr[i5];
        io.reactivex.rxjava3.internal.queue.b bVar = new io.reactivex.rxjava3.internal.queue.b(this.f18306c);
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            pVarArr2[i5] = new c((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f18306c, bVar, cVar);
        } else {
            pVarArr2[i5] = new d(pVar, this.f18306c, bVar, cVar);
        }
    }
}
