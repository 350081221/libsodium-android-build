package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class q0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super T> f16971c;

    /* renamed from: d, reason: collision with root package name */
    final m3.g<? super Throwable> f16972d;

    /* renamed from: e, reason: collision with root package name */
    final m3.a f16973e;

    /* renamed from: f, reason: collision with root package name */
    final m3.a f16974f;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.g<? super T> f16975f;

        /* renamed from: g, reason: collision with root package name */
        final m3.g<? super Throwable> f16976g;

        /* renamed from: h, reason: collision with root package name */
        final m3.a f16977h;

        /* renamed from: i, reason: collision with root package name */
        final m3.a f16978i;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2) {
            super(cVar);
            this.f16975f = gVar;
            this.f16976g = gVar2;
            this.f16977h = aVar;
            this.f16978i = aVar2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.p
        public void onComplete() {
            if (this.f18634d) {
                return;
            }
            try {
                this.f16977h.run();
                this.f18634d = true;
                this.f18631a.onComplete();
                try {
                    this.f16978i.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18634d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            boolean z4 = true;
            this.f18634d = true;
            try {
                this.f16976g.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f18631a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
                z4 = false;
            }
            if (z4) {
                this.f18631a.onError(th);
            }
            try {
                this.f16978i.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.plugins.a.Y(th3);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18634d) {
                return;
            }
            if (this.f18635e != 0) {
                this.f18631a.onNext(null);
                return;
            }
            try {
                this.f16975f.accept(t5);
                this.f18631a.onNext(t5);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            try {
                T poll = this.f18633c.poll();
                if (poll != null) {
                    try {
                        this.f16975f.accept(poll);
                    } catch (Throwable th) {
                        try {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            try {
                                this.f16976g.accept(th);
                                throw io.reactivex.rxjava3.internal.util.k.g(th);
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                throw new io.reactivex.rxjava3.exceptions.a(th, th2);
                            }
                        } finally {
                            this.f16978i.run();
                        }
                    }
                } else if (this.f18635e == 1) {
                    this.f16977h.run();
                }
                return poll;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                try {
                    this.f16976g.accept(th3);
                    throw io.reactivex.rxjava3.internal.util.k.g(th3);
                } catch (Throwable th4) {
                    io.reactivex.rxjava3.exceptions.b.b(th4);
                    throw new io.reactivex.rxjava3.exceptions.a(th3, th4);
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
            try {
                this.f16975f.accept(t5);
                return this.f18631a.tryOnNext(t5);
            } catch (Throwable th) {
                c(th);
                return false;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.g<? super T> f16979f;

        /* renamed from: g, reason: collision with root package name */
        final m3.g<? super Throwable> f16980g;

        /* renamed from: h, reason: collision with root package name */
        final m3.a f16981h;

        /* renamed from: i, reason: collision with root package name */
        final m3.a f16982i;

        b(org.reactivestreams.p<? super T> pVar, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2) {
            super(pVar);
            this.f16979f = gVar;
            this.f16980g = gVar2;
            this.f16981h = aVar;
            this.f16982i = aVar2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.p
        public void onComplete() {
            if (this.f18639d) {
                return;
            }
            try {
                this.f16981h.run();
                this.f18639d = true;
                this.f18636a.onComplete();
                try {
                    this.f16982i.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18639d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            boolean z4 = true;
            this.f18639d = true;
            try {
                this.f16980g.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f18636a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
                z4 = false;
            }
            if (z4) {
                this.f18636a.onError(th);
            }
            try {
                this.f16982i.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.plugins.a.Y(th3);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18639d) {
                return;
            }
            if (this.f18640e != 0) {
                this.f18636a.onNext(null);
                return;
            }
            try {
                this.f16979f.accept(t5);
                this.f18636a.onNext(t5);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            try {
                T poll = this.f18638c.poll();
                if (poll != null) {
                    try {
                        this.f16979f.accept(poll);
                    } catch (Throwable th) {
                        try {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            try {
                                this.f16980g.accept(th);
                                throw io.reactivex.rxjava3.internal.util.k.g(th);
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                throw new io.reactivex.rxjava3.exceptions.a(th, th2);
                            }
                        } finally {
                            this.f16982i.run();
                        }
                    }
                } else if (this.f18640e == 1) {
                    this.f16981h.run();
                }
                return poll;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                try {
                    this.f16980g.accept(th3);
                    throw io.reactivex.rxjava3.internal.util.k.g(th3);
                } catch (Throwable th4) {
                    io.reactivex.rxjava3.exceptions.b.b(th4);
                    throw new io.reactivex.rxjava3.exceptions.a(th3, th4);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public q0(io.reactivex.rxjava3.core.o<T> oVar, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2) {
        super(oVar);
        this.f16971c = gVar;
        this.f16972d = gVar2;
        this.f16973e = aVar;
        this.f16974f = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16971c, this.f16972d, this.f16973e, this.f16974f));
        } else {
            this.f16598b.N6(new b(pVar, this.f16971c, this.f16972d, this.f16973e, this.f16974f));
        }
    }
}
