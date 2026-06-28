package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m1<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends T> f16876b;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends io.reactivex.rxjava3.internal.subscriptions.d<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> iterator;
        boolean once;

        a(Iterator<? extends T> it) {
            this.iterator = it;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final void clear() {
            this.iterator = null;
        }

        abstract void fastPath();

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.iterator;
            if (it != null) {
                if (this.once && !it.hasNext()) {
                    clear();
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public final T poll() {
            Iterator<? extends T> it = this.iterator;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.iterator.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.q
        public final void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5) && io.reactivex.rxjava3.internal.util.d.a(this, j5) == 0) {
                if (j5 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public final int requestFusion(int i5) {
            return i5 & 1;
        }

        abstract void slowPath(long j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.m1.a
        void fastPath() {
            Iterator<? extends T> it = this.iterator;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    cVar.tryOnNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        cVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.m1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.iterator
                io.reactivex.rxjava3.internal.fuseable.c<? super T> r1 = r8.downstream
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.tryOnNext(r6)
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L3c
                r1.onComplete()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r9)
                r1.onError(r9)
                return
            L53:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.m1.b.slowPath(long):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final org.reactivestreams.p<? super T> downstream;

        c(org.reactivestreams.p<? super T> pVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.m1.a
        void fastPath() {
            Iterator<? extends T> it = this.iterator;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        pVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    pVar.onNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.cancelled) {
                                pVar.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        pVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    pVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.m1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.iterator
                org.reactivestreams.p<? super T> r1 = r8.downstream
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                r1.onNext(r6)
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L3b
                r1.onComplete()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r9)
                r1.onError(r9)
                return
            L50:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.m1.c.slowPath(long):void");
        }
    }

    public m1(Iterable<? extends T> iterable) {
        this.f16876b = iterable;
    }

    public static <T> void n9(org.reactivestreams.p<? super T> pVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
            } else if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
                pVar.onSubscribe(new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, it));
            } else {
                pVar.onSubscribe(new c(pVar, it));
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            n9(pVar, this.f16876b.iterator());
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
