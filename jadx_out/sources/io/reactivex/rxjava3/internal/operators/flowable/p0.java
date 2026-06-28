package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class p0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.a f16939c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements io.reactivex.rxjava3.internal.fuseable.c<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;
        final m3.a onFinally;
        io.reactivex.rxjava3.internal.fuseable.n<T> qs;
        boolean syncFused;
        org.reactivestreams.q upstream;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, m3.a aVar) {
            this.downstream = cVar;
            this.onFinally = aVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.qs.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    this.qs = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.upstream.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            io.reactivex.rxjava3.internal.fuseable.n<T> nVar = this.qs;
            boolean z4 = false;
            if (nVar == null || (i5 & 4) != 0) {
                return 0;
            }
            int requestFusion = nVar.requestFusion(i5);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z4 = true;
                }
                this.syncFused = z4;
            }
            return requestFusion;
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            return this.downstream.tryOnNext(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscriptions.c<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final org.reactivestreams.p<? super T> downstream;
        final m3.a onFinally;
        io.reactivex.rxjava3.internal.fuseable.n<T> qs;
        boolean syncFused;
        org.reactivestreams.q upstream;

        b(org.reactivestreams.p<? super T> pVar, m3.a aVar) {
            this.downstream = pVar;
            this.onFinally = aVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.qs.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                    this.qs = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.upstream.request(j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            io.reactivex.rxjava3.internal.fuseable.n<T> nVar = this.qs;
            boolean z4 = false;
            if (nVar == null || (i5 & 4) != 0) {
                return 0;
            }
            int requestFusion = nVar.requestFusion(i5);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z4 = true;
                }
                this.syncFused = z4;
            }
            return requestFusion;
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }
    }

    public p0(io.reactivex.rxjava3.core.o<T> oVar, m3.a aVar) {
        super(oVar);
        this.f16939c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16939c));
        } else {
            this.f16598b.N6(new b(pVar, this.f16939c));
        }
    }
}
