package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r3<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f18033b;

    /* renamed from: c, reason: collision with root package name */
    final int f18034c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18035d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final b<T, R> parent;
        volatile io.reactivex.rxjava3.internal.fuseable.q<R> queue;

        a(b<T, R> bVar, long j5, int i5) {
            this.parent = bVar;
            this.index = j5;
            this.bufferSize = i5;
        }

        public void cancel() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(R r5) {
            if (this.index == this.parent.unique) {
                if (r5 != null) {
                    this.queue.offer(r5);
                }
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                    int requestFusion = lVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.queue = lVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.queue = lVar;
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.c(this.bufferSize);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        static final a<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> mapper;
        volatile long unique;
        io.reactivex.rxjava3.disposables.e upstream;
        final AtomicReference<a<T, R>> active = new AtomicReference<>();
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            CANCELLED = aVar;
            aVar.cancel();
        }

        b(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, int i5, boolean z4) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.bufferSize = i5;
            this.delayErrors = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                disposeInner();
                this.errors.tryTerminateAndReport();
            }
        }

        void disposeInner() {
            a aVar = (a) this.active.getAndSet(CANCELLED);
            if (aVar != null) {
                aVar.cancel();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drain() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.rxjava3.core.p0<? super R> r0 = r13.downstream
                java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.internal.operators.observable.r3$a<T, R>> r1 = r13.active
                boolean r2 = r13.delayErrors
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r13.cancelled
                if (r5 == 0) goto L14
                return
            L14:
                boolean r5 = r13.done
                r6 = 0
                if (r5 == 0) goto L4e
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L21
                r5 = r3
                goto L22
            L21:
                r5 = r6
            L22:
                if (r2 == 0) goto L38
                if (r5 == 0) goto L4e
                io.reactivex.rxjava3.internal.util.c r1 = r13.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L34
                r0.onError(r1)
                goto L37
            L34:
                r0.onComplete()
            L37:
                return
            L38:
                io.reactivex.rxjava3.internal.util.c r7 = r13.errors
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L48
                io.reactivex.rxjava3.internal.util.c r1 = r13.errors
                r1.tryTerminateConsumer(r0)
                return
            L48:
                if (r5 == 0) goto L4e
                r0.onComplete()
                return
            L4e:
                java.lang.Object r5 = r1.get()
                io.reactivex.rxjava3.internal.operators.observable.r3$a r5 = (io.reactivex.rxjava3.internal.operators.observable.r3.a) r5
                if (r5 == 0) goto Lb7
                io.reactivex.rxjava3.internal.fuseable.q<R> r7 = r5.queue
                if (r7 == 0) goto Lb7
                r8 = r6
            L5b:
                boolean r9 = r13.cancelled
                if (r9 == 0) goto L60
                return
            L60:
                java.lang.Object r9 = r1.get()
                if (r5 == r9) goto L68
            L66:
                r8 = r3
                goto Laf
            L68:
                if (r2 != 0) goto L7a
                io.reactivex.rxjava3.internal.util.c r9 = r13.errors
                java.lang.Object r9 = r9.get()
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                if (r9 == 0) goto L7a
                io.reactivex.rxjava3.internal.util.c r1 = r13.errors
                r1.tryTerminateConsumer(r0)
                return
            L7a:
                boolean r9 = r5.done
                r10 = 0
                java.lang.Object r11 = r7.poll()     // Catch: java.lang.Throwable -> L82
                goto La0
            L82:
                r8 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r8)
                io.reactivex.rxjava3.internal.util.c r11 = r13.errors
                r11.tryAddThrowableOrReport(r8)
                androidx.compose.animation.core.h.a(r1, r5, r10)
                if (r2 != 0) goto L9b
                r13.disposeInner()
                io.reactivex.rxjava3.disposables.e r8 = r13.upstream
                r8.dispose()
                r13.done = r3
                goto L9e
            L9b:
                r5.cancel()
            L9e:
                r8 = r3
                r11 = r10
            La0:
                if (r11 != 0) goto La4
                r12 = r3
                goto La5
            La4:
                r12 = r6
            La5:
                if (r9 == 0) goto Lad
                if (r12 == 0) goto Lad
                androidx.compose.animation.core.h.a(r1, r5, r10)
                goto L66
            Lad:
                if (r12 == 0) goto Lb3
            Laf:
                if (r8 == 0) goto Lb7
                goto Lf
            Lb3:
                r0.onNext(r11)
                goto L5b
            Lb7:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.r3.b.drain():void");
        }

        void innerError(a<T, R> aVar, Throwable th) {
            if (aVar.index == this.unique && this.errors.tryAddThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.done = true;
                }
                aVar.done = true;
                drain();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (!this.done && this.errors.tryAddThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            a<T, R> aVar;
            long j5 = this.unique + 1;
            this.unique = j5;
            a<T, R> aVar2 = this.active.get();
            if (aVar2 != null) {
                aVar2.cancel();
            }
            try {
                io.reactivex.rxjava3.core.n0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The ObservableSource returned is null");
                io.reactivex.rxjava3.core.n0<? extends R> n0Var = apply;
                a aVar3 = new a(this, j5, this.bufferSize);
                do {
                    aVar = this.active.get();
                    if (aVar == CANCELLED) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.active, aVar, aVar3));
                n0Var.subscribe(aVar3);
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
    }

    public r3(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, int i5, boolean z4) {
        super(n0Var);
        this.f18033b = oVar;
        this.f18034c = i5;
        this.f18035d = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        if (c3.b(this.f17528a, p0Var, this.f18033b)) {
            return;
        }
        this.f17528a.subscribe(new b(p0Var, this.f18033b, this.f18034c, this.f18035d));
    }
}
