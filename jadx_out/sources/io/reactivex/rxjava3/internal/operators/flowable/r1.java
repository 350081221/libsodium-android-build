package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class r1<T, S> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<S> f17001b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<S, io.reactivex.rxjava3.core.k<T>, S> f17002c;

    /* renamed from: d, reason: collision with root package name */
    final m3.g<? super S> f17003d;

    /* loaded from: classes3.dex */
    static final class a<T, S> extends AtomicLong implements io.reactivex.rxjava3.core.k<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 7565982551505011832L;
        volatile boolean cancelled;
        final m3.g<? super S> disposeState;
        final org.reactivestreams.p<? super T> downstream;
        final m3.c<S, ? super io.reactivex.rxjava3.core.k<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        a(org.reactivestreams.p<? super T> pVar, m3.c<S, ? super io.reactivex.rxjava3.core.k<T>, S> cVar, m3.g<? super S> gVar, S s5) {
            this.downstream = pVar;
            this.generator = cVar;
            this.disposeState = gVar;
            this.state = s5;
        }

        private void dispose(S s5) {
            try {
                this.disposeState.accept(s5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (io.reactivex.rxjava3.internal.util.d.a(this, 1L) == 0) {
                    S s5 = this.state;
                    this.state = null;
                    dispose(s5);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onComplete() {
            if (!this.terminate) {
                this.terminate = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onError(Throwable th) {
            if (this.terminate) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
            }
            this.terminate = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.k
        public void onNext(T t5) {
            if (!this.terminate) {
                if (this.hasNext) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (t5 == null) {
                    onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
                } else {
                    this.hasNext = true;
                    this.downstream.onNext(t5);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            r9.state = r0;
            r10 = addAndGet(-r4);
         */
        @Override // org.reactivestreams.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void request(long r10) {
            /*
                r9 = this;
                boolean r0 = io.reactivex.rxjava3.internal.subscriptions.j.validate(r10)
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = io.reactivex.rxjava3.internal.util.d.a(r9, r10)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L12
                return
            L12:
                S r0 = r9.state
                m3.c<S, ? super io.reactivex.rxjava3.core.k<T>, S> r1 = r9.generator
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L4d
                boolean r6 = r9.cancelled
                r7 = 0
                if (r6 == 0) goto L26
                r9.state = r7
                r9.dispose(r0)
                return
            L26:
                r6 = 0
                r9.hasNext = r6
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3e
                boolean r8 = r9.terminate
                if (r8 == 0) goto L3a
                r9.cancelled = r6
                r9.state = r7
                r9.dispose(r0)
                return
            L3a:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L3e:
                r10 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r10)
                r9.cancelled = r6
                r9.state = r7
                r9.onError(r10)
                r9.dispose(r0)
                return
            L4d:
                long r10 = r9.get()
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 != 0) goto L17
                r9.state = r0
                long r10 = -r4
                long r10 = r9.addAndGet(r10)
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.r1.a.request(long):void");
        }
    }

    public r1(m3.s<S> sVar, m3.c<S, io.reactivex.rxjava3.core.k<T>, S> cVar, m3.g<? super S> gVar) {
        this.f17001b = sVar;
        this.f17002c = cVar;
        this.f17003d = gVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            pVar.onSubscribe(new a(pVar, this.f17002c, this.f17003d, this.f17001b.get()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
