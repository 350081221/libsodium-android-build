package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class n0<T, K> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, K> f16890c;

    /* renamed from: d, reason: collision with root package name */
    final m3.d<? super K, ? super K> f16891d;

    /* loaded from: classes3.dex */
    static final class a<T, K> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, K> f16892f;

        /* renamed from: g, reason: collision with root package name */
        final m3.d<? super K, ? super K> f16893g;

        /* renamed from: h, reason: collision with root package name */
        K f16894h;

        /* renamed from: i, reason: collision with root package name */
        boolean f16895i;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, m3.o<? super T, K> oVar, m3.d<? super K, ? super K> dVar) {
            super(cVar);
            this.f16892f = oVar;
            this.f16893g = dVar;
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
            while (true) {
                T poll = this.f18633c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f16892f.apply(poll);
                if (!this.f16895i) {
                    this.f16895i = true;
                    this.f16894h = apply;
                    return poll;
                }
                if (!this.f16893g.a(this.f16894h, apply)) {
                    this.f16894h = apply;
                    return poll;
                }
                this.f16894h = apply;
                if (this.f18635e != 1) {
                    this.f18632b.request(1L);
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
                return this.f18631a.tryOnNext(t5);
            }
            try {
                K apply = this.f16892f.apply(t5);
                if (this.f16895i) {
                    boolean a5 = this.f16893g.a(this.f16894h, apply);
                    this.f16894h = apply;
                    if (a5) {
                        return false;
                    }
                } else {
                    this.f16895i = true;
                    this.f16894h = apply;
                }
                this.f18631a.onNext(t5);
                return true;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, K> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements io.reactivex.rxjava3.internal.fuseable.c<T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, K> f16896f;

        /* renamed from: g, reason: collision with root package name */
        final m3.d<? super K, ? super K> f16897g;

        /* renamed from: h, reason: collision with root package name */
        K f16898h;

        /* renamed from: i, reason: collision with root package name */
        boolean f16899i;

        b(org.reactivestreams.p<? super T> pVar, m3.o<? super T, K> oVar, m3.d<? super K, ? super K> dVar) {
            super(pVar);
            this.f16896f = oVar;
            this.f16897g = dVar;
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
            while (true) {
                T poll = this.f18638c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f16896f.apply(poll);
                if (!this.f16899i) {
                    this.f16899i = true;
                    this.f16898h = apply;
                    return poll;
                }
                if (!this.f16897g.a(this.f16898h, apply)) {
                    this.f16898h = apply;
                    return poll;
                }
                this.f16898h = apply;
                if (this.f18640e != 1) {
                    this.f18637b.request(1L);
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
                this.f18636a.onNext(t5);
                return true;
            }
            try {
                K apply = this.f16896f.apply(t5);
                if (this.f16899i) {
                    boolean a5 = this.f16897g.a(this.f16898h, apply);
                    this.f16898h = apply;
                    if (a5) {
                        return false;
                    }
                } else {
                    this.f16899i = true;
                    this.f16898h = apply;
                }
                this.f18636a.onNext(t5);
                return true;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    public n0(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, K> oVar2, m3.d<? super K, ? super K> dVar) {
        super(oVar);
        this.f16890c = oVar2;
        this.f16891d = dVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16890c, this.f16891d));
        } else {
            this.f16598b.N6(new b(pVar, this.f16890c, this.f16891d));
        }
    }
}
