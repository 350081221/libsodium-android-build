package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g1<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends Iterable<? extends R>> f16763c;

    /* renamed from: d, reason: collision with root package name */
    final int f16764d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends io.reactivex.rxjava3.internal.subscriptions.c<R> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        int fusionMode;
        final int limit;
        final m3.o<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        org.reactivestreams.q upstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends Iterable<? extends R>> oVar, int i5) {
            this.downstream = pVar;
            this.mapper = oVar;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<?> pVar, io.reactivex.rxjava3.internal.fuseable.q<?> qVar) {
            if (this.cancelled) {
                this.current = null;
                qVar.clear();
                return true;
            }
            if (z4) {
                if (this.error.get() != null) {
                    Throwable f5 = io.reactivex.rxjava3.internal.util.k.f(this.error);
                    this.current = null;
                    qVar.clear();
                    pVar.onError(f5);
                    return true;
                }
                if (z5) {
                    pVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        void consumedOne(boolean z4) {
            if (z4) {
                int i5 = this.consumed + 1;
                if (i5 == this.limit) {
                    this.consumed = 0;
                    this.upstream.request(i5);
                } else {
                    this.consumed = i5;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
        
            if (r13 != r9) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
        
            r5 = r18.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
        
            if (r3.isEmpty() == false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
        
            if (r6 != null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
        
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
        
            if (checkTerminated(r5, r8, r2, r3) == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
        
            r8 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        
            if (r13 == 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
        
            if (r9 == Long.MAX_VALUE) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
        
            r18.requested.addAndGet(-r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
        
            if (r6 != null) goto L70;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drain() {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.g1.a.drain():void");
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (!this.done && io.reactivex.rxjava3.internal.util.k.a(this.error, th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0 && !this.queue.offer(t5)) {
                onError(new io.reactivex.rxjava3.exceptions.c("Queue is full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                    int requestFusion = nVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = nVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = nVar;
                        this.downstream.onSubscribe(this);
                        qVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                this.downstream.onSubscribe(this);
                qVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public R poll() throws Throwable {
            Iterator<? extends R> it = this.current;
            while (true) {
                if (it == null) {
                    T poll = this.queue.poll();
                    if (poll == null) {
                        return null;
                    }
                    it = this.mapper.apply(poll).iterator();
                    if (!it.hasNext()) {
                        it = null;
                    } else {
                        this.current = it;
                        break;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return next;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return ((i5 & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }
    }

    public g1(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends Iterable<? extends R>> oVar2, int i5) {
        super(oVar);
        this.f16763c = oVar2;
        this.f16764d = i5;
    }

    public static <T, R> org.reactivestreams.p<T> n9(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends Iterable<? extends R>> oVar, int i5) {
        return new a(pVar, oVar, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super R> pVar) {
        io.reactivex.rxjava3.core.o<T> oVar = this.f16598b;
        if (oVar instanceof m3.s) {
            try {
                Object obj = ((m3.s) oVar).get();
                if (obj == null) {
                    io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                    return;
                }
                try {
                    m1.n9(pVar, this.f16763c.apply(obj).iterator());
                    return;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th2, pVar);
                return;
            }
        }
        oVar.N6(new a(pVar, this.f16763c, this.f16764d));
    }
}
