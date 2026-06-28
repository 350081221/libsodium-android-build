package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class y0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.r<? super T> f17192c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.r<? super T> f17193f;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, m3.r<? super T> rVar) {
            super(cVar);
            this.f17193f = rVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f18632b.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            io.reactivex.rxjava3.internal.fuseable.n<T> nVar = this.f18633c;
            m3.r<? super T> rVar = this.f17193f;
            while (true) {
                T poll = nVar.poll();
                if (poll == null) {
                    return null;
                }
                if (rVar.test(poll)) {
                    return poll;
                }
                if (this.f18635e == 2) {
                    nVar.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f18634d) {
                return false;
            }
            if (this.f18635e != 0) {
                return this.f18631a.tryOnNext(null);
            }
            try {
                if (!this.f17193f.test(t5) || !this.f18631a.tryOnNext(t5)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements io.reactivex.rxjava3.internal.fuseable.c<T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.r<? super T> f17194f;

        b(org.reactivestreams.p<? super T> pVar, m3.r<? super T> rVar) {
            super(pVar);
            this.f17194f = rVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f18637b.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            io.reactivex.rxjava3.internal.fuseable.n<T> nVar = this.f18638c;
            m3.r<? super T> rVar = this.f17194f;
            while (true) {
                T poll = nVar.poll();
                if (poll == null) {
                    return null;
                }
                if (rVar.test(poll)) {
                    return poll;
                }
                if (this.f18640e == 2) {
                    nVar.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f18639d) {
                return false;
            }
            if (this.f18640e != 0) {
                this.f18636a.onNext(null);
                return true;
            }
            try {
                boolean test = this.f17194f.test(t5);
                if (test) {
                    this.f18636a.onNext(t5);
                }
                return test;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    public y0(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        super(oVar);
        this.f17192c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f17192c));
        } else {
            this.f16598b.N6(new b(pVar, this.f17192c));
        }
    }
}
