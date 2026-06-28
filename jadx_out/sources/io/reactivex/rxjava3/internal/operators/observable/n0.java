package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class n0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.a f17870b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.b<T> implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final m3.a onFinally;
        io.reactivex.rxjava3.internal.fuseable.l<T> qd;
        boolean syncFused;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.a aVar) {
            this.downstream = p0Var;
            this.onFinally = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.qd.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                    this.qd = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.qd.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.qd;
            boolean z4 = false;
            if (lVar == null || (i5 & 4) != 0) {
                return 0;
            }
            int requestFusion = lVar.requestFusion(i5);
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

    public n0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.a aVar) {
        super(n0Var);
        this.f17870b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17870b));
    }
}
