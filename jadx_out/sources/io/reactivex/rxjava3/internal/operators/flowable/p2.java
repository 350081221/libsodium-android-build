package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class p2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16941c;

    /* renamed from: d, reason: collision with root package name */
    final m3.a f16942d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.a f16943e;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16944a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.core.a.values().length];
            f16944a = iArr;
            try {
                iArr[io.reactivex.rxjava3.core.a.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16944a[io.reactivex.rxjava3.core.a.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.p<? super T> downstream;
        Throwable error;
        final m3.a onOverflow;
        final io.reactivex.rxjava3.core.a strategy;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final Deque<T> deque = new ArrayDeque();

        b(org.reactivestreams.p<? super T> pVar, m3.a aVar, io.reactivex.rxjava3.core.a aVar2, long j5) {
            this.downstream = pVar;
            this.onOverflow = aVar;
            this.strategy = aVar2;
            this.bufferSize = j5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        void clear(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        void drain() {
            boolean isEmpty;
            T poll;
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.deque;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            int i5 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z5 = this.done;
                    synchronized (deque) {
                        poll = deque.poll();
                    }
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        Throwable th = this.error;
                        if (th != null) {
                            clear(deque);
                            pVar.onError(th);
                            return;
                        } else if (z4) {
                            pVar.onComplete();
                            return;
                        }
                    }
                    if (z4) {
                        break;
                    }
                    pVar.onNext(poll);
                    j6++;
                }
                if (j6 == j5) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z6 = this.done;
                    synchronized (deque) {
                        isEmpty = deque.isEmpty();
                    }
                    if (z6) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            clear(deque);
                            pVar.onError(th2);
                            return;
                        } else if (isEmpty) {
                            pVar.onComplete();
                            return;
                        }
                    }
                }
                if (j6 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            boolean z4;
            boolean z5;
            if (this.done) {
                return;
            }
            Deque<T> deque = this.deque;
            synchronized (deque) {
                z4 = false;
                if (deque.size() == this.bufferSize) {
                    int i5 = a.f16944a[this.strategy.ordinal()];
                    z5 = true;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            deque.poll();
                            deque.offer(t5);
                        }
                    } else {
                        deque.pollLast();
                        deque.offer(t5);
                    }
                    z5 = false;
                    z4 = true;
                } else {
                    deque.offer(t5);
                    z5 = false;
                }
            }
            if (z4) {
                m3.a aVar = this.onOverflow;
                if (aVar != null) {
                    try {
                        aVar.run();
                        return;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.upstream.cancel();
                        onError(th);
                        return;
                    }
                }
                return;
            }
            if (z5) {
                this.upstream.cancel();
                onError(new io.reactivex.rxjava3.exceptions.c());
            } else {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }
    }

    public p2(io.reactivex.rxjava3.core.o<T> oVar, long j5, m3.a aVar, io.reactivex.rxjava3.core.a aVar2) {
        super(oVar);
        this.f16941c = j5;
        this.f16942d = aVar;
        this.f16943e = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new b(pVar, this.f16942d, this.f16943e, this.f16941c));
    }
}
