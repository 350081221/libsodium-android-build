package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s1<T, K, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.flowables.b<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends K> f17029c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super T, ? extends V> f17030d;

    /* renamed from: e, reason: collision with root package name */
    final int f17031e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f17032f;

    /* renamed from: g, reason: collision with root package name */
    final m3.o<? super m3.g<Object>, ? extends Map<K, Object>> f17033g;

    /* loaded from: classes3.dex */
    static final class a<K, V> implements m3.g<c<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        final Queue<c<K, V>> f17034a;

        a(Queue<c<K, V>> queue) {
            this.f17034a = queue;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(c<K, V> cVar) {
            this.f17034a.offer(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<K, T> extends io.reactivex.rxjava3.flowables.b<K, T> {

        /* renamed from: c, reason: collision with root package name */
        final d<T, K> f17035c;

        protected c(K k5, d<T, K> dVar) {
            super(k5);
            this.f17035c = dVar;
        }

        public static <T, K> c<K, T> o9(K k5, int i5, b<?, K, T> bVar, boolean z4) {
            return new c<>(k5, new d(i5, bVar, k5, z4));
        }

        @Override // io.reactivex.rxjava3.core.o
        protected void O6(org.reactivestreams.p<? super T> pVar) {
            this.f17035c.subscribe(pVar);
        }

        public void onComplete() {
            this.f17035c.onComplete();
        }

        public void onError(Throwable th) {
            this.f17035c.onError(th);
        }

        public void onNext(T t5) {
            this.f17035c.onNext(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<T, K> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements org.reactivestreams.o<T> {
        static final int ABANDONED = 2;
        static final int ABANDONED_HAS_SUBSCRIBER = 3;
        static final int FRESH = 0;
        static final int HAS_SUBSCRIBER = 1;
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        boolean outputFused;
        final b<?, K, T> parent;
        int produced;
        final io.reactivex.rxjava3.internal.queue.c<T> queue;
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<org.reactivestreams.p<? super T>> actual = new AtomicReference<>();
        final AtomicInteger once = new AtomicInteger();

        d(int i5, b<?, K, T> bVar, K k5, boolean z4) {
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            this.parent = bVar;
            this.key = k5;
            this.delayError = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                cancelParent();
                drain();
            }
        }

        void cancelParent() {
            if ((this.once.get() & 2) == 0) {
                this.parent.cancel(this.key);
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<? super T> pVar, boolean z6, long j5) {
            if (this.cancelled.get()) {
                while (this.queue.poll() != null) {
                    j5++;
                }
                if (j5 != 0) {
                    requestParent(j5);
                }
                return true;
            }
            if (z4) {
                if (z6) {
                    if (z5) {
                        Throwable th = this.error;
                        if (th != null) {
                            pVar.onError(th);
                        } else {
                            pVar.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    pVar.onError(th2);
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
            io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
            while (cVar.poll() != null) {
                this.produced++;
            }
            tryReplenish();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        void drainFused() {
            Throwable th;
            io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
            org.reactivestreams.p<? super T> pVar = this.actual.get();
            int i5 = 1;
            while (true) {
                if (pVar != null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    boolean z4 = this.done;
                    if (z4 && !this.delayError && (th = this.error) != null) {
                        cVar.clear();
                        pVar.onError(th);
                        return;
                    }
                    pVar.onNext(null);
                    if (z4) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            pVar.onError(th2);
                            return;
                        } else {
                            pVar.onComplete();
                            return;
                        }
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
                if (pVar == null) {
                    pVar = this.actual.get();
                }
            }
        }

        void drainNormal() {
            long j5;
            boolean z4;
            io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
            boolean z5 = this.delayError;
            org.reactivestreams.p<? super T> pVar = this.actual.get();
            int i5 = 1;
            while (true) {
                if (pVar != null) {
                    long j6 = this.requested.get();
                    long j7 = 0;
                    while (true) {
                        if (j7 == j6) {
                            break;
                        }
                        boolean z6 = this.done;
                        T poll = cVar.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        long j8 = j7;
                        if (checkTerminated(z6, z4, pVar, z5, j7)) {
                            return;
                        }
                        if (z4) {
                            j7 = j8;
                            break;
                        } else {
                            pVar.onNext(poll);
                            j7 = j8 + 1;
                        }
                    }
                    if (j7 == j6) {
                        j5 = j7;
                        if (checkTerminated(this.done, cVar.isEmpty(), pVar, z5, j7)) {
                            return;
                        }
                    } else {
                        j5 = j7;
                    }
                    if (j5 != 0) {
                        io.reactivex.rxjava3.internal.util.d.e(this.requested, j5);
                        requestParent(j5);
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
                if (pVar == null) {
                    pVar = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            if (this.queue.isEmpty()) {
                tryReplenish();
                return true;
            }
            tryReplenish();
            return false;
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null) {
                this.produced++;
                return poll;
            }
            tryReplenish();
            return null;
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
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        void requestParent(long j5) {
            if ((this.once.get() & 2) == 0) {
                this.parent.requestGroup(j5);
            }
        }

        @Override // org.reactivestreams.o
        public void subscribe(org.reactivestreams.p<? super T> pVar) {
            int i5;
            do {
                i5 = this.once.get();
                if ((i5 & 1) != 0) {
                    io.reactivex.rxjava3.internal.subscriptions.g.error(new IllegalStateException("Only one Subscriber allowed!"), pVar);
                    return;
                }
            } while (!this.once.compareAndSet(i5, i5 | 1));
            pVar.onSubscribe(this);
            this.actual.lazySet(pVar);
            if (this.cancelled.get()) {
                this.actual.lazySet(null);
            } else {
                drain();
            }
        }

        boolean tryAbandon() {
            return this.once.get() == 0 && this.once.compareAndSet(0, 2);
        }

        void tryReplenish() {
            int i5 = this.produced;
            if (i5 != 0) {
                this.produced = 0;
                requestParent(i5);
            }
        }
    }

    public s1(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends K> oVar2, m3.o<? super T, ? extends V> oVar3, int i5, boolean z4, m3.o<? super m3.g<Object>, ? extends Map<K, Object>> oVar4) {
        super(oVar);
        this.f17029c = oVar2;
        this.f17030d = oVar3;
        this.f17031e = i5;
        this.f17032f = z4;
        this.f17033g = oVar4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.flowables.b<K, V>> pVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> apply;
        try {
            if (this.f17033g == null) {
                apply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                apply = this.f17033g.apply(new a(concurrentLinkedQueue));
            }
            this.f16598b.N6(new b(pVar, this.f17029c, this.f17030d, this.f17031e, this.f17032f, apply, concurrentLinkedQueue));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            pVar.onSubscribe(io.reactivex.rxjava3.internal.util.h.INSTANCE);
            pVar.onError(th);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<T, K, V> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        boolean done;
        final org.reactivestreams.p<? super io.reactivex.rxjava3.flowables.b<K, V>> downstream;
        long emittedGroups;
        final Queue<c<K, V>> evictedGroups;
        final Map<Object, c<K, V>> groups;
        final m3.o<? super T, ? extends K> keySelector;
        final int limit;
        org.reactivestreams.q upstream;
        final m3.o<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicInteger groupCount = new AtomicInteger(1);
        final AtomicLong groupConsumed = new AtomicLong();

        public b(org.reactivestreams.p<? super io.reactivex.rxjava3.flowables.b<K, V>> pVar, m3.o<? super T, ? extends K> oVar, m3.o<? super T, ? extends V> oVar2, int i5, boolean z4, Map<Object, c<K, V>> map, Queue<c<K, V>> queue) {
            this.downstream = pVar;
            this.keySelector = oVar;
            this.valueSelector = oVar2;
            this.bufferSize = i5;
            this.limit = i5 - (i5 >> 2);
            this.delayError = z4;
            this.groups = map;
            this.evictedGroups = queue;
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i5 = 0;
                while (true) {
                    c<K, V> poll = this.evictedGroups.poll();
                    if (poll == null) {
                        break;
                    }
                    poll.onComplete();
                    i5++;
                }
                if (i5 != 0) {
                    this.groupCount.addAndGet(-i5);
                }
            }
        }

        static String groupHangWarning(long j5) {
            return "Unable to emit a new group (#" + j5 + ") due to lack of requests. Please make sure the downstream can always accept a new group as well as each group is consumed in order for the whole operator to be able to proceed.";
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                Iterator<c<K, V>> it = this.groups.values().iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                this.groups.clear();
                Queue<c<K, V>> queue = this.evictedGroups;
                if (queue != null) {
                    queue.clear();
                }
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            Iterator<c<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.groups.clear();
            Queue<c<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.downstream.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            Object obj;
            boolean z4;
            if (this.done) {
                return;
            }
            try {
                K apply = this.keySelector.apply(t5);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                c cVar = this.groups.get(obj);
                if (cVar == null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    cVar = c.o9(apply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, cVar);
                    this.groupCount.getAndIncrement();
                    z4 = true;
                } else {
                    z4 = false;
                }
                try {
                    cVar.onNext(io.reactivex.rxjava3.internal.util.k.d(this.valueSelector.apply(t5), "The valueSelector returned a null value."));
                    completeEvictions();
                    if (z4) {
                        if (this.emittedGroups != get()) {
                            this.emittedGroups++;
                            this.downstream.onNext(cVar);
                            if (cVar.f17035c.tryAbandon()) {
                                cancel(apply);
                                cVar.onComplete();
                                requestGroup(1L);
                                return;
                            }
                            return;
                        }
                        this.upstream.cancel();
                        onError(new io.reactivex.rxjava3.exceptions.c(groupHangWarning(this.emittedGroups)));
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.upstream.cancel();
                    if (z4) {
                        if (this.emittedGroups != get()) {
                            this.downstream.onNext(cVar);
                        } else {
                            io.reactivex.rxjava3.exceptions.c cVar2 = new io.reactivex.rxjava3.exceptions.c(groupHangWarning(this.emittedGroups));
                            cVar2.initCause(th);
                            onError(cVar2);
                            return;
                        }
                    }
                    onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(this.bufferSize);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
            }
        }

        void requestGroup(long j5) {
            long j6;
            long c5;
            AtomicLong atomicLong = this.groupConsumed;
            int i5 = this.limit;
            do {
                j6 = atomicLong.get();
                c5 = io.reactivex.rxjava3.internal.util.d.c(j6, j5);
            } while (!atomicLong.compareAndSet(j6, c5));
            while (true) {
                long j7 = i5;
                if (c5 < j7) {
                    return;
                }
                if (atomicLong.compareAndSet(c5, c5 - j7)) {
                    this.upstream.request(j7);
                }
                c5 = atomicLong.get();
            }
        }

        public void cancel(K k5) {
            if (k5 == null) {
                k5 = (K) NULL_KEY;
            }
            this.groups.remove(k5);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }
}
