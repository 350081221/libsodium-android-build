package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w0<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> f18145b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18146c;

    /* renamed from: d, reason: collision with root package name */
    final int f18147d;

    /* renamed from: e, reason: collision with root package name */
    final int f18148e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final b<T, U> parent;
        volatile io.reactivex.rxjava3.internal.fuseable.q<U> queue;

        a(b<T, U> bVar, long j5) {
            this.id = j5;
            this.parent = bVar;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.parent.errors.tryAddThrowableOrReport(th)) {
                b<T, U> bVar = this.parent;
                if (!bVar.delayErrors) {
                    bVar.disposeAll();
                }
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(U u4) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u4, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar) && (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l)) {
                io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                int requestFusion = lVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = lVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = lVar;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        final boolean delayErrors;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super U> downstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        int lastIndex;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<a<?, ?>[]> observers;
        volatile io.reactivex.rxjava3.internal.fuseable.p<U> queue;
        Queue<io.reactivex.rxjava3.core.n0<? extends U>> sources;
        long uniqueId;
        io.reactivex.rxjava3.disposables.e upstream;
        int wip;
        static final a<?, ?>[] EMPTY = new a[0];
        static final a<?, ?>[] CANCELLED = new a[0];

        b(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar, boolean z4, int i5, int i6) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.delayErrors = z4;
            this.maxConcurrency = i5;
            this.bufferSize = i6;
            if (i5 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i5);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        boolean addInner(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.observers.get();
                if (aVarArr == CANCELLED) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.compose.animation.core.h.a(this.observers, aVarArr, aVarArr2));
            return true;
        }

        boolean checkTerminate() {
            if (this.disposed) {
                return true;
            }
            Throwable th = this.errors.get();
            if (!this.delayErrors && th != null) {
                disposeAll();
                this.errors.tryTerminateConsumer(this.downstream);
                return true;
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            if (disposeAll()) {
                this.errors.tryTerminateAndReport();
            }
        }

        boolean disposeAll() {
            this.upstream.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.observers;
            a<?, ?>[] aVarArr = CANCELLED;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet == aVarArr) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.dispose();
            }
            return true;
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
        
            if (r11 != null) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        
            r11 = r10.done;
            r12 = r10.queue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        
            if (r11 == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        
            if (r12 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
        
            if (r12.isEmpty() == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        
            removeInner(r10);
            r7 = r7 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
        
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
        
            if (r3 != r6) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
        
            r3 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
        
            r4 = r4 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0074, code lost:
        
            r12 = r11.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0078, code lost:
        
            if (r12 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
        
            r0.onNext(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0082, code lost:
        
            if (checkTerminate() == false) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0086, code lost:
        
            io.reactivex.rxjava3.exceptions.b.b(r11);
            r10.dispose();
            r13.errors.tryAddThrowableOrReport(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0095, code lost:
        
            if (checkTerminate() != false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0098, code lost:
        
            removeInner(r10);
            r7 = r7 + 1;
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x009f, code lost:
        
            if (r3 != r6) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0097, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drainLoop() {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.w0.b.drainLoop():void");
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                io.reactivex.rxjava3.core.n0<? extends U> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.n0<? extends U> n0Var = apply;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i5 = this.wip;
                        if (i5 == this.maxConcurrency) {
                            this.sources.offer(n0Var);
                            return;
                        }
                        this.wip = i5 + 1;
                    }
                }
                subscribeInner(n0Var);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void removeInner(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.observers.get();
                int length = aVarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (aVarArr[i5] == aVar) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = EMPTY;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                    System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!androidx.compose.animation.core.h.a(this.observers, aVarArr, aVarArr2));
        }

        void subscribeInner(io.reactivex.rxjava3.core.n0<? extends U> n0Var) {
            boolean z4;
            while (n0Var instanceof m3.s) {
                if (tryEmitScalar((m3.s) n0Var) && this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        n0Var = this.sources.poll();
                        if (n0Var == null) {
                            z4 = true;
                            this.wip--;
                        } else {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        drain();
                        return;
                    }
                } else {
                    return;
                }
            }
            long j5 = this.uniqueId;
            this.uniqueId = 1 + j5;
            a<T, U> aVar = new a<>(this, j5);
            if (addInner(aVar)) {
                n0Var.subscribe(aVar);
            }
        }

        void tryEmit(U u4, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u4);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.rxjava3.internal.fuseable.q qVar = aVar.queue;
                if (qVar == null) {
                    qVar = new io.reactivex.rxjava3.internal.queue.c(this.bufferSize);
                    aVar.queue = qVar;
                }
                qVar.offer(u4);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        boolean tryEmitScalar(m3.s<? extends U> sVar) {
            try {
                U u4 = sVar.get();
                if (u4 == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(u4);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    io.reactivex.rxjava3.internal.fuseable.p<U> pVar = this.queue;
                    if (pVar == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            pVar = new io.reactivex.rxjava3.internal.queue.c<>(this.bufferSize);
                        } else {
                            pVar = new io.reactivex.rxjava3.internal.queue.b<>(this.maxConcurrency);
                        }
                        this.queue = pVar;
                    }
                    pVar.offer(u4);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.errors.tryAddThrowableOrReport(th);
                drain();
                return true;
            }
        }
    }

    public w0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar, boolean z4, int i5, int i6) {
        super(n0Var);
        this.f18145b = oVar;
        this.f18146c = z4;
        this.f18147d = i5;
        this.f18148e = i6;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        if (c3.b(this.f17528a, p0Var, this.f18145b)) {
            return;
        }
        this.f17528a.subscribe(new b(p0Var, this.f18145b, this.f18146c, this.f18147d, this.f18148e));
    }
}
