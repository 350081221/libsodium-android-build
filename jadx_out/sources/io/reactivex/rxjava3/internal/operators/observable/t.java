package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t<T, R> extends io.reactivex.rxjava3.core.i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T>[] f18098a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.n0<? extends T>> f18099b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f18100c;

    /* renamed from: d, reason: collision with root package name */
    final int f18101d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f18102e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final b<T, R> parent;

        a(b<T, R> bVar, int i5) {
            this.parent = bVar;
            this.index = i5;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.parent.innerNext(this.index, t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final m3.o<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        Object[] latest;
        final a<T, R>[] observers;
        final io.reactivex.rxjava3.internal.queue.c<Object[]> queue;

        b(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super Object[], ? extends R> oVar, int i5, int i6, boolean z4) {
            this.downstream = p0Var;
            this.combiner = oVar;
            this.delayError = z4;
            this.latest = new Object[i5];
            a<T, R>[] aVarArr = new a[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                aVarArr[i7] = new a<>(this, i7);
            }
            this.observers = aVarArr;
            this.queue = new io.reactivex.rxjava3.internal.queue.c<>(i6);
        }

        void cancelSources() {
            for (a<T, R> aVar : this.observers) {
                aVar.dispose();
            }
        }

        void clear(io.reactivex.rxjava3.internal.queue.c<?> cVar) {
            synchronized (this) {
                this.latest = null;
            }
            cVar.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                drain();
            }
        }

        void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.c<Object[]> cVar = this.queue;
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            boolean z5 = this.delayError;
            int i5 = 1;
            while (!this.cancelled) {
                if (!z5 && this.errors.get() != null) {
                    cancelSources();
                    clear(cVar);
                    this.errors.tryTerminateConsumer(p0Var);
                    return;
                }
                boolean z6 = this.done;
                Object[] poll = cVar.poll();
                if (poll == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z6 && z4) {
                    clear(cVar);
                    this.errors.tryTerminateConsumer(p0Var);
                    return;
                }
                if (z4) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.combiner.apply(poll);
                        Objects.requireNonNull(apply, "The combiner returned a null value");
                        p0Var.onNext(apply);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.errors.tryAddThrowableOrReport(th);
                        cancelSources();
                        clear(cVar);
                        this.errors.tryTerminateConsumer(p0Var);
                        return;
                    }
                }
            }
            clear(cVar);
            this.errors.tryTerminateAndReport();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        
            if (r2 == r0.length) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void innerComplete(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch: java.lang.Throwable -> L25
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                return
            L7:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L25
                r1 = 1
                if (r4 != 0) goto Le
                r4 = r1
                goto Lf
            Le:
                r4 = 0
            Lf:
                if (r4 != 0) goto L19
                int r2 = r3.complete     // Catch: java.lang.Throwable -> L25
                int r2 = r2 + r1
                r3.complete = r2     // Catch: java.lang.Throwable -> L25
                int r0 = r0.length     // Catch: java.lang.Throwable -> L25
                if (r2 != r0) goto L1b
            L19:
                r3.done = r1     // Catch: java.lang.Throwable -> L25
            L1b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                if (r4 == 0) goto L21
                r3.cancelSources()
            L21:
                r3.drain()
                return
            L25:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.t.b.innerComplete(int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r1 == r4.length) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void innerError(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                io.reactivex.rxjava3.internal.util.c r0 = r2.errors
                boolean r4 = r0.tryAddThrowableOrReport(r4)
                if (r4 == 0) goto L35
                boolean r4 = r2.delayError
                r0 = 1
                if (r4 == 0) goto L2d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.latest     // Catch: java.lang.Throwable -> L2a
                if (r4 != 0) goto L14
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                return
            L14:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L1a
                r3 = r0
                goto L1b
            L1a:
                r3 = 0
            L1b:
                if (r3 != 0) goto L25
                int r1 = r2.complete     // Catch: java.lang.Throwable -> L2a
                int r1 = r1 + r0
                r2.complete = r1     // Catch: java.lang.Throwable -> L2a
                int r4 = r4.length     // Catch: java.lang.Throwable -> L2a
                if (r1 != r4) goto L27
            L25:
                r2.done = r0     // Catch: java.lang.Throwable -> L2a
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r0 = r3
                goto L2d
            L2a:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                throw r3
            L2d:
                if (r0 == 0) goto L32
                r2.cancelSources()
            L32:
                r2.drain()
            L35:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.t.b.innerError(int, java.lang.Throwable):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void innerNext(int i5, T t5) {
            boolean z4;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i5];
                int i6 = this.active;
                if (obj == null) {
                    i6++;
                    this.active = i6;
                }
                objArr[i5] = t5;
                if (i6 == objArr.length) {
                    this.queue.offer(objArr.clone());
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    drain();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr) {
            a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            this.downstream.onSubscribe(this);
            for (int i5 = 0; i5 < length && !this.done && !this.cancelled; i5++) {
                n0VarArr[i5].subscribe(aVarArr[i5]);
            }
        }
    }

    public t(io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr, Iterable<? extends io.reactivex.rxjava3.core.n0<? extends T>> iterable, m3.o<? super Object[], ? extends R> oVar, int i5, boolean z4) {
        this.f18098a = n0VarArr;
        this.f18099b = iterable;
        this.f18100c = oVar;
        this.f18101d = i5;
        this.f18102e = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        int length;
        io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr = this.f18098a;
        if (n0VarArr == null) {
            n0VarArr = new io.reactivex.rxjava3.core.n0[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.n0<? extends T> n0Var : this.f18099b) {
                    if (length == n0VarArr.length) {
                        io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr2 = new io.reactivex.rxjava3.core.n0[(length >> 2) + length];
                        System.arraycopy(n0VarArr, 0, n0VarArr2, 0, length);
                        n0VarArr = n0VarArr2;
                    }
                    int i5 = length + 1;
                    Objects.requireNonNull(n0Var, "The Iterator returned a null ObservableSource");
                    n0VarArr[length] = n0Var;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                return;
            }
        } else {
            length = n0VarArr.length;
        }
        int i6 = length;
        if (i6 == 0) {
            io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
        } else {
            new b(p0Var, this.f18100c, i6, this.f18101d, this.f18102e).subscribe(n0VarArr);
        }
    }
}
