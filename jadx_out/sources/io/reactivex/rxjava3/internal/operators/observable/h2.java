package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.q0;

/* loaded from: classes3.dex */
public final class h2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17741b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17742c;

    /* renamed from: d, reason: collision with root package name */
    final int f17743d;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.b<T> implements io.reactivex.rxjava3.core.p0<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        Throwable error;
        boolean outputFused;
        io.reactivex.rxjava3.internal.fuseable.q<T> queue;
        int sourceMode;
        io.reactivex.rxjava3.disposables.e upstream;
        final q0.c worker;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, q0.c cVar, boolean z4, int i5) {
            this.downstream = p0Var;
            this.worker = cVar;
            this.delayError = z4;
            this.bufferSize = i5;
        }

        boolean checkTerminated(boolean z4, boolean z5, io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (z4) {
                Throwable th = this.error;
                if (this.delayError) {
                    if (z5) {
                        this.disposed = true;
                        if (th != null) {
                            p0Var.onError(th);
                        } else {
                            p0Var.onComplete();
                        }
                        this.worker.dispose();
                        return true;
                    }
                    return false;
                }
                if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    p0Var.onError(th);
                    this.worker.dispose();
                    return true;
                }
                if (z5) {
                    this.disposed = true;
                    p0Var.onComplete();
                    this.worker.dispose();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        void drainFused() {
            int i5 = 1;
            while (!this.disposed) {
                boolean z4 = this.done;
                Throwable th = this.error;
                if (!this.delayError && z4 && th != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z4) {
                    this.disposed = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        this.downstream.onError(th2);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drainNormal() {
            /*
                r7 = this;
                io.reactivex.rxjava3.internal.fuseable.q<T> r0 = r7.queue
                io.reactivex.rxjava3.core.p0<? super T> r1 = r7.downstream
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.done
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.checkTerminated(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.done
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.checkTerminated(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r3)
                r7.disposed = r2
                io.reactivex.rxjava3.disposables.e r2 = r7.upstream
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                io.reactivex.rxjava3.core.q0$c r0 = r7.worker
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.h2.a.drainNormal():void");
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t5);
            }
            schedule();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                    int requestFusion = lVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = lVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = lVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.c(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            return this.queue.poll();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }
    }

    public h2(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.q0 q0Var, boolean z4, int i5) {
        super(n0Var);
        this.f17741b = q0Var;
        this.f17742c = z4;
        this.f17743d = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.core.q0 q0Var = this.f17741b;
        if (q0Var instanceof io.reactivex.rxjava3.internal.schedulers.s) {
            this.f17528a.subscribe(p0Var);
        } else {
            this.f17528a.subscribe(new a(p0Var, q0Var.c(), this.f17742c, this.f17743d));
        }
    }
}
