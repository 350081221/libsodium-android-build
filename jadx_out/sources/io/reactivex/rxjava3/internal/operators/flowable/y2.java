package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class y2 extends io.reactivex.rxjava3.core.o<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final int f17199b;

    /* renamed from: c, reason: collision with root package name */
    final int f17200c;

    /* loaded from: classes3.dex */
    static abstract class a extends io.reactivex.rxjava3.internal.subscriptions.d<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        a(int i5, int i6) {
            this.index = i5;
            this.end = i6;
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
        public final Integer poll() {
            int i5 = this.index;
            if (i5 == this.end) {
                return null;
            }
            this.index = i5 + 1;
            return Integer.valueOf(i5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super Integer> downstream;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super Integer> cVar, int i5, int i6) {
            super(i5, i6);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y2.a
        void fastPath() {
            int i5 = this.end;
            io.reactivex.rxjava3.internal.fuseable.c<? super Integer> cVar = this.downstream;
            for (int i6 = this.index; i6 != i5; i6++) {
                if (this.cancelled) {
                    return;
                }
                cVar.tryOnNext(Integer.valueOf(i6));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.y2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r10) {
            /*
                r9 = this;
                int r0 = r9.end
                int r1 = r9.index
                io.reactivex.rxjava3.internal.fuseable.c<? super java.lang.Integer> r2 = r9.downstream
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.cancelled
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                boolean r7 = r2.tryOnNext(r7)
                if (r7 == 0) goto L21
                r7 = 1
                long r5 = r5 + r7
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                if (r1 != r0) goto L2e
                boolean r10 = r9.cancelled
                if (r10 != 0) goto L2d
                r2.onComplete()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.index = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.y2.b.slowPath(long):void");
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.p<? super Integer> downstream;

        c(org.reactivestreams.p<? super Integer> pVar, int i5, int i6) {
            super(i5, i6);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.y2.a
        void fastPath() {
            int i5 = this.end;
            org.reactivestreams.p<? super Integer> pVar = this.downstream;
            for (int i6 = this.index; i6 != i5; i6++) {
                if (this.cancelled) {
                    return;
                }
                pVar.onNext(Integer.valueOf(i6));
            }
            if (this.cancelled) {
                return;
            }
            pVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.y2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r10) {
            /*
                r9 = this;
                int r0 = r9.end
                int r1 = r9.index
                org.reactivestreams.p<? super java.lang.Integer> r2 = r9.downstream
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.cancelled
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                int r1 = r1 + 1
                goto L9
            L21:
                if (r1 != r0) goto L2b
                boolean r10 = r9.cancelled
                if (r10 != 0) goto L2a
                r2.onComplete()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.index = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.y2.c.slowPath(long):void");
        }
    }

    public y2(int i5, int i6) {
        this.f17199b = i5;
        this.f17200c = i5 + i6;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super Integer> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            pVar.onSubscribe(new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f17199b, this.f17200c));
        } else {
            pVar.onSubscribe(new c(pVar, this.f17199b, this.f17200c));
        }
    }
}
