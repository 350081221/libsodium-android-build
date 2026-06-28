package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class i1<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final T[] f16796b;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i1.c
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            for (int i5 = this.index; i5 != length; i5++) {
                if (this.cancelled) {
                    return;
                }
                T t5 = tArr[i5];
                if (t5 == null) {
                    cVar.onError(new NullPointerException("The element at index " + i5 + " is null"));
                    return;
                }
                cVar.tryOnNext(t5);
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.i1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.array
                int r1 = r0.length
                int r2 = r10.index
                io.reactivex.rxjava3.internal.fuseable.c<? super T> r3 = r10.downstream
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L44
                if (r2 == r1) goto L44
                boolean r8 = r10.cancelled
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The element at index "
                r12.append(r0)
                r12.append(r2)
                java.lang.String r0 = " is null"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                r3.onError(r11)
                return
            L38:
                boolean r8 = r3.tryOnNext(r8)
                if (r8 == 0) goto L41
                r8 = 1
                long r6 = r6 + r8
            L41:
                int r2 = r2 + 1
                goto La
            L44:
                if (r2 != r1) goto L4e
                boolean r11 = r10.cancelled
                if (r11 != 0) goto L4d
                r3.onComplete()
            L4d:
                return
            L4e:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.index = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.i1.a.slowPath(long):void");
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.p<? super T> downstream;

        b(org.reactivestreams.p<? super T> pVar, T[] tArr) {
            super(tArr);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i1.c
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            for (int i5 = this.index; i5 != length; i5++) {
                if (this.cancelled) {
                    return;
                }
                T t5 = tArr[i5];
                if (t5 == null) {
                    pVar.onError(new NullPointerException("The element at index " + i5 + " is null"));
                    return;
                }
                pVar.onNext(t5);
            }
            if (this.cancelled) {
                return;
            }
            pVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.i1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void slowPath(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.array
                int r1 = r0.length
                int r2 = r10.index
                org.reactivestreams.p<? super T> r3 = r10.downstream
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L41
                if (r2 == r1) goto L41
                boolean r8 = r10.cancelled
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The element at index "
                r12.append(r0)
                r12.append(r2)
                java.lang.String r0 = " is null"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                r3.onError(r11)
                return
            L38:
                r3.onNext(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L41:
                if (r2 != r1) goto L4b
                boolean r11 = r10.cancelled
                if (r11 != 0) goto L4a
                r3.onComplete()
            L4a:
                return
            L4b:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.index = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.i1.b.slowPath(long):void");
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<T> extends io.reactivex.rxjava3.internal.subscriptions.d<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        c(T[] tArr) {
            this.array = tArr;
        }

        @Override // org.reactivestreams.q
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final void clear() {
            this.index = this.array.length;
        }

        abstract void fastPath();

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public final T poll() {
            int i5 = this.index;
            T[] tArr = this.array;
            if (i5 == tArr.length) {
                return null;
            }
            this.index = i5 + 1;
            T t5 = tArr[i5];
            Objects.requireNonNull(t5, "array element is null");
            return t5;
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

    public i1(T[] tArr) {
        this.f16796b = tArr;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            pVar.onSubscribe(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16796b));
        } else {
            pVar.onSubscribe(new b(pVar, this.f16796b));
        }
    }
}
