package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e0<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r<T> f16710b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.b f16711c;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16712a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.core.b.values().length];
            f16712a = iArr;
            try {
                iArr[io.reactivex.rxjava3.core.b.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16712a[io.reactivex.rxjava3.core.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16712a[io.reactivex.rxjava3.core.b.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16712a[io.reactivex.rxjava3.core.b.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<T> extends AtomicLong implements io.reactivex.rxjava3.core.q<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 7326289992464377023L;
        final org.reactivestreams.p<? super T> downstream;
        final io.reactivex.rxjava3.internal.disposables.f serial = new io.reactivex.rxjava3.internal.disposables.f();

        b(org.reactivestreams.p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        protected void completeDownstream() {
            if (isCancelled()) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                this.serial.dispose();
            }
        }

        protected boolean errorDownstream(Throwable th) {
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }

        @Override // io.reactivex.rxjava3.core.q
        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            completeDownstream();
        }

        @Override // io.reactivex.rxjava3.core.k
        public final void onError(Throwable th) {
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
            }
            if (!signalError(th)) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void onRequested() {
        }

        void onUnsubscribed() {
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
                onRequested();
            }
        }

        @Override // io.reactivex.rxjava3.core.q
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.q
        public final io.reactivex.rxjava3.core.q<T> serialize() {
            return new i(this);
        }

        @Override // io.reactivex.rxjava3.core.q
        public final void setCancellable(m3.f fVar) {
            setDisposable(new io.reactivex.rxjava3.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.q
        public final void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            this.serial.update(eVar);
        }

        public boolean signalError(Throwable th) {
            return errorDownstream(th);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.q
        public final boolean tryOnError(Throwable th) {
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.k.b("tryOnError called with a null Throwable.");
            }
            return signalError(th);
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final io.reactivex.rxjava3.internal.queue.c<T> queue;
        final AtomicInteger wip;

        c(org.reactivestreams.p<? super T> pVar, int i5) {
            super(pVar);
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i5);
            this.wip = new AtomicInteger();
        }

        void drain() {
            boolean z4;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.downstream;
            io.reactivex.rxjava3.internal.queue.c<T> cVar = this.queue;
            int i5 = 1;
            do {
                long j5 = get();
                long j6 = 0;
                while (j6 != j5) {
                    if (isCancelled()) {
                        cVar.clear();
                        return;
                    }
                    boolean z5 = this.done;
                    T poll = cVar.poll();
                    if (poll == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        Throwable th = this.error;
                        if (th != null) {
                            errorDownstream(th);
                            return;
                        } else {
                            completeDownstream();
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
                    if (isCancelled()) {
                        cVar.clear();
                        return;
                    }
                    boolean z6 = this.done;
                    boolean isEmpty = cVar.isEmpty();
                    if (z6 && isEmpty) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            errorDownstream(th2);
                            return;
                        } else {
                            completeDownstream();
                            return;
                        }
                    }
                }
                if (j6 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this, j6);
                }
                i5 = this.wip.addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b, io.reactivex.rxjava3.core.k
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (!this.done && !isCancelled()) {
                if (t5 == null) {
                    onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
                } else {
                    this.queue.offer(t5);
                    drain();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b
        void onRequested() {
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b
        void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b
        public boolean signalError(Throwable th) {
            if (!this.done && !isCancelled()) {
                this.error = th;
                this.done = true;
                drain();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        d(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.h
        void onOverflow() {
        }
    }

    /* loaded from: classes3.dex */
    static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        e(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.h
        void onOverflow() {
            onError(new io.reactivex.rxjava3.exceptions.c("create: could not emit value due to lack of requests"));
        }
    }

    /* loaded from: classes3.dex */
    static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        f(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.downstream;
            AtomicReference<T> atomicReference = this.queue;
            int i5 = 1;
            do {
                long j5 = get();
                long j6 = 0;
                while (true) {
                    z4 = false;
                    if (j6 == j5) {
                        break;
                    }
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z6 = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    if (andSet == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z6 && z5) {
                        Throwable th = this.error;
                        if (th != null) {
                            errorDownstream(th);
                            return;
                        } else {
                            completeDownstream();
                            return;
                        }
                    }
                    if (z5) {
                        break;
                    }
                    pVar.onNext(andSet);
                    j6++;
                }
                if (j6 == j5) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z7 = this.done;
                    if (atomicReference.get() == null) {
                        z4 = true;
                    }
                    if (z7 && z4) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            errorDownstream(th2);
                            return;
                        } else {
                            completeDownstream();
                            return;
                        }
                    }
                }
                if (j6 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(this, j6);
                }
                i5 = this.wip.addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b, io.reactivex.rxjava3.core.k
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (!this.done && !isCancelled()) {
                if (t5 == null) {
                    onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
                } else {
                    this.queue.set(t5);
                    drain();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b
        void onRequested() {
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b
        void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.e0.b
        public boolean signalError(Throwable th) {
            if (!this.done && !isCancelled()) {
                this.error = th;
                this.done = true;
                drain();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        g(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            long j5;
            if (isCancelled()) {
                return;
            }
            if (t5 != null) {
                this.downstream.onNext(t5);
                do {
                    j5 = get();
                    if (j5 == 0) {
                        return;
                    }
                } while (!compareAndSet(j5, j5 - 1));
                return;
            }
            onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
        }
    }

    /* loaded from: classes3.dex */
    static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        h(org.reactivestreams.p<? super T> pVar) {
            super(pVar);
        }

        @Override // io.reactivex.rxjava3.core.k
        public final void onNext(T t5) {
            if (isCancelled()) {
                return;
            }
            if (t5 == null) {
                onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
            } else if (get() != 0) {
                this.downstream.onNext(t5);
                io.reactivex.rxjava3.internal.util.d.e(this, 1L);
            } else {
                onOverflow();
            }
        }

        abstract void onOverflow();
    }

    /* loaded from: classes3.dex */
    static final class i<T> extends AtomicInteger implements io.reactivex.rxjava3.core.q<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final b<T> emitter;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final io.reactivex.rxjava3.internal.fuseable.p<T> queue = new io.reactivex.rxjava3.internal.queue.c(16);

        i(b<T> bVar) {
            this.emitter = bVar;
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            boolean z4;
            b<T> bVar = this.emitter;
            io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            int i5 = 1;
            while (!bVar.isCancelled()) {
                if (cVar.get() != null) {
                    pVar.clear();
                    cVar.tryTerminateConsumer(bVar);
                    return;
                }
                boolean z5 = this.done;
                T poll = pVar.poll();
                if (poll == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z5 && z4) {
                    bVar.onComplete();
                    return;
                } else if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    bVar.onNext(poll);
                }
            }
            pVar.clear();
        }

        @Override // io.reactivex.rxjava3.core.q
        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            if (!this.emitter.isCancelled() && !this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (t5 == null) {
                    onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.emitter.onNext(t5);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
                    synchronized (pVar) {
                        pVar.offer(t5);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        @Override // io.reactivex.rxjava3.core.q
        public long requested() {
            return this.emitter.requested();
        }

        @Override // io.reactivex.rxjava3.core.q
        public io.reactivex.rxjava3.core.q<T> serialize() {
            return this;
        }

        @Override // io.reactivex.rxjava3.core.q
        public void setCancellable(m3.f fVar) {
            this.emitter.setCancellable(fVar);
        }

        @Override // io.reactivex.rxjava3.core.q
        public void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            this.emitter.setDisposable(eVar);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.emitter.toString();
        }

        @Override // io.reactivex.rxjava3.core.q
        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th == null) {
                    th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
                }
                if (this.errors.tryAddThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }
    }

    public e0(io.reactivex.rxjava3.core.r<T> rVar, io.reactivex.rxjava3.core.b bVar) {
        this.f16710b = rVar;
        this.f16711c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        b gVar;
        int i5 = a.f16712a[this.f16711c.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        gVar = new c(pVar, io.reactivex.rxjava3.core.o.c0());
                    } else {
                        gVar = new f(pVar);
                    }
                } else {
                    gVar = new d(pVar);
                }
            } else {
                gVar = new e(pVar);
            }
        } else {
            gVar = new g(pVar);
        }
        pVar.onSubscribe(gVar);
        try {
            this.f16710b.a(gVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            gVar.onError(th);
        }
    }
}
