package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n1<T, K, V> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.observables.b<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends K> f17871b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends V> f17872c;

    /* renamed from: d, reason: collision with root package name */
    final int f17873d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17874e;

    /* loaded from: classes3.dex */
    public static final class a<T, K, V> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.observables.b<K, V>> downstream;
        final m3.o<? super T, ? extends K> keySelector;
        io.reactivex.rxjava3.disposables.e upstream;
        final m3.o<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final Map<Object, b<K, V>> groups = new ConcurrentHashMap();

        public a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.observables.b<K, V>> p0Var, m3.o<? super T, ? extends K> oVar, m3.o<? super T, ? extends V> oVar2, int i5, boolean z4) {
            this.downstream = p0Var;
            this.keySelector = oVar;
            this.valueSelector = oVar2;
            this.bufferSize = i5;
            this.delayError = z4;
            lazySet(1);
        }

        public void cancel(K k5) {
            if (k5 == null) {
                k5 = (K) NULL_KEY;
            }
            this.groups.remove(k5);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            Object obj;
            boolean z4;
            try {
                K apply = this.keySelector.apply(t5);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                b<K, V> bVar = this.groups.get(obj);
                if (bVar == null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    bVar = b.J8(apply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, bVar);
                    getAndIncrement();
                    z4 = true;
                } else {
                    z4 = false;
                }
                try {
                    V apply2 = this.valueSelector.apply(t5);
                    Objects.requireNonNull(apply2, "The value supplied is null");
                    bVar.onNext(apply2);
                    if (z4) {
                        this.downstream.onNext(bVar);
                        if (bVar.f17875b.tryAbandon()) {
                            cancel(apply);
                            bVar.onComplete();
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.upstream.dispose();
                    if (z4) {
                        this.downstream.onNext(bVar);
                    }
                    onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.upstream.dispose();
                onError(th2);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<K, T> extends io.reactivex.rxjava3.observables.b<K, T> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, K> f17875b;

        protected b(K k5, c<T, K> cVar) {
            super(k5);
            this.f17875b = cVar;
        }

        public static <T, K> b<K, T> J8(K k5, int i5, a<?, K, T> aVar, boolean z4) {
            return new b<>(k5, new c(i5, aVar, k5, z4));
        }

        @Override // io.reactivex.rxjava3.core.i0
        protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.f17875b.subscribe(p0Var);
        }

        public void onComplete() {
            this.f17875b.onComplete();
        }

        public void onError(Throwable th) {
            this.f17875b.onError(th);
        }

        public void onNext(T t5) {
            this.f17875b.onNext(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T, K> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.core.n0<T> {
        static final int ABANDONED = 2;
        static final int ABANDONED_HAS_SUBSCRIBER = 3;
        static final int FRESH = 0;
        static final int HAS_SUBSCRIBER = 1;
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final a<?, K, T> parent;
        final io.reactivex.rxjava3.internal.queue.c<T> queue;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<io.reactivex.rxjava3.core.p0<? super T>> actual = new AtomicReference<>();
        final AtomicInteger once = new AtomicInteger();

        c(int i5, a<?, K, T> aVar, K k5, boolean z4) {
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            this.parent = aVar;
            this.key = k5;
            this.delayError = z4;
        }

        void cancelParent() {
            if ((this.once.get() & 2) == 0) {
                this.parent.cancel(this.key);
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, io.reactivex.rxjava3.core.p0<? super T> p0Var, boolean z6) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.actual.lazySet(null);
                cancelParent();
                return true;
            }
            if (z4) {
                if (z6) {
                    if (z5) {
                        Throwable th = this.error;
                        this.actual.lazySet(null);
                        if (th != null) {
                            p0Var.onError(th);
                        } else {
                            p0Var.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    this.actual.lazySet(null);
                    p0Var.onError(th2);
                    return true;
                }
                if (z5) {
                    this.actual.lazySet(null);
                    p0Var.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                cancelParent();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
            boolean z5 = this.delayError;
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.actual.get();
            int i5 = 1;
            while (true) {
                if (p0Var != null) {
                    while (true) {
                        boolean z6 = this.done;
                        T poll = cVar.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (checkTerminated(z6, z4, p0Var, z5)) {
                            return;
                        }
                        if (z4) {
                            break;
                        } else {
                            p0Var.onNext(poll);
                        }
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
                if (p0Var == null) {
                    p0Var = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled.get();
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

        @Override // io.reactivex.rxjava3.core.n0
        public void subscribe(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            int i5;
            do {
                i5 = this.once.get();
                if ((i5 & 1) != 0) {
                    io.reactivex.rxjava3.internal.disposables.d.error(new IllegalStateException("Only one Observer allowed!"), p0Var);
                    return;
                }
            } while (!this.once.compareAndSet(i5, i5 | 1));
            p0Var.onSubscribe(this);
            this.actual.lazySet(p0Var);
            if (this.cancelled.get()) {
                this.actual.lazySet(null);
            } else {
                drain();
            }
        }

        boolean tryAbandon() {
            return this.once.get() == 0 && this.once.compareAndSet(0, 2);
        }
    }

    public n1(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends K> oVar, m3.o<? super T, ? extends V> oVar2, int i5, boolean z4) {
        super(n0Var);
        this.f17871b = oVar;
        this.f17872c = oVar2;
        this.f17873d = i5;
        this.f17874e = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.observables.b<K, V>> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17871b, this.f17872c, this.f17873d, this.f17874e));
    }
}
