package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class z2 extends io.reactivex.rxjava3.core.o<Long> {

    /* renamed from: b, reason: collision with root package name */
    final long f17217b;

    /* renamed from: c, reason: collision with root package name */
    final long f17218c;

    /* loaded from: classes3.dex */
    static abstract class a extends io.reactivex.rxjava3.internal.subscriptions.d<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        a(long j5, long j6) {
            this.index = j5;
            this.end = j6;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final void clear() {
            this.index = this.end;
        }

        abstract void fastPath();

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final boolean isEmpty() {
            return this.index == this.end;
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

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public final Long poll() {
            long j5 = this.index;
            if (j5 == this.end) {
                return null;
            }
            this.index = 1 + j5;
            return Long.valueOf(j5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super Long> downstream;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super Long> cVar, long j5, long j6) {
            super(j5, j6);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.z2.a
        void fastPath() {
            long j5 = this.end;
            io.reactivex.rxjava3.internal.fuseable.c<? super Long> cVar = this.downstream;
            for (long j6 = this.index; j6 != j5; j6++) {
                if (this.cancelled) {
                    return;
                }
                cVar.tryOnNext(Long.valueOf(j6));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            r12.index = r2;
            r13 = addAndGet(-r7);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.z2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r13) {
            /*
                r12 = this;
                long r0 = r12.end
                long r2 = r12.index
                io.reactivex.rxjava3.internal.fuseable.c<? super java.lang.Long> r4 = r12.downstream
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 == 0) goto L25
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L25
                boolean r9 = r12.cancelled
                if (r9 == 0) goto L16
                return
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                boolean r9 = r4.tryOnNext(r9)
                r10 = 1
                if (r9 == 0) goto L23
                long r7 = r7 + r10
            L23:
                long r2 = r2 + r10
                goto L9
            L25:
                int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r13 != 0) goto L31
                boolean r13 = r12.cancelled
                if (r13 != 0) goto L30
                r4.onComplete()
            L30:
                return
            L31:
                long r13 = r12.get()
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 != 0) goto L9
                r12.index = r2
                long r13 = -r7
                long r13 = r12.addAndGet(r13)
                int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.z2.b.slowPath(long):void");
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.p<? super Long> downstream;

        c(org.reactivestreams.p<? super Long> pVar, long j5, long j6) {
            super(j5, j6);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.z2.a
        void fastPath() {
            long j5 = this.end;
            org.reactivestreams.p<? super Long> pVar = this.downstream;
            for (long j6 = this.index; j6 != j5; j6++) {
                if (this.cancelled) {
                    return;
                }
                pVar.onNext(Long.valueOf(j6));
            }
            if (this.cancelled) {
                return;
            }
            pVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            r11.index = r2;
            r12 = addAndGet(-r7);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.z2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r12) {
            /*
                r11 = this;
                long r0 = r11.end
                long r2 = r11.index
                org.reactivestreams.p<? super java.lang.Long> r4 = r11.downstream
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 == 0) goto L22
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L22
                boolean r9 = r11.cancelled
                if (r9 == 0) goto L16
                return
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                r4.onNext(r9)
                r9 = 1
                long r7 = r7 + r9
                long r2 = r2 + r9
                goto L9
            L22:
                int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r12 != 0) goto L2e
                boolean r12 = r11.cancelled
                if (r12 != 0) goto L2d
                r4.onComplete()
            L2d:
                return
            L2e:
                long r12 = r11.get()
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 != 0) goto L9
                r11.index = r2
                long r12 = -r7
                long r12 = r11.addAndGet(r12)
                int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.z2.c.slowPath(long):void");
        }
    }

    public z2(long j5, long j6) {
        this.f17217b = j5;
        this.f17218c = j5 + j6;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super Long> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            pVar.onSubscribe(new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f17217b, this.f17218c));
        } else {
            pVar.onSubscribe(new c(pVar, this.f17217b, this.f17218c));
        }
    }
}
