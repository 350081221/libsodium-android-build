package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class r0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    private final m3.g<? super org.reactivestreams.q> f16993c;

    /* renamed from: d, reason: collision with root package name */
    private final m3.q f16994d;

    /* renamed from: e, reason: collision with root package name */
    private final m3.a f16995e;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16996a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super org.reactivestreams.q> f16997b;

        /* renamed from: c, reason: collision with root package name */
        final m3.q f16998c;

        /* renamed from: d, reason: collision with root package name */
        final m3.a f16999d;

        /* renamed from: e, reason: collision with root package name */
        org.reactivestreams.q f17000e;

        a(org.reactivestreams.p<? super T> pVar, m3.g<? super org.reactivestreams.q> gVar, m3.q qVar, m3.a aVar) {
            this.f16996a = pVar;
            this.f16997b = gVar;
            this.f16999d = aVar;
            this.f16998c = qVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            org.reactivestreams.q qVar = this.f17000e;
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                this.f17000e = jVar;
                try {
                    this.f16999d.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
                qVar.cancel();
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f17000e != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                this.f16996a.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17000e != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                this.f16996a.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f16996a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            try {
                this.f16997b.accept(qVar);
                if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17000e, qVar)) {
                    this.f17000e = qVar;
                    this.f16996a.onSubscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                qVar.cancel();
                this.f17000e = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, this.f16996a);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            try {
                this.f16998c.a(j5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f17000e.request(j5);
        }
    }

    public r0(io.reactivex.rxjava3.core.o<T> oVar, m3.g<? super org.reactivestreams.q> gVar, m3.q qVar, m3.a aVar) {
        super(oVar);
        this.f16993c = gVar;
        this.f16994d = qVar;
        this.f16995e = aVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16993c, this.f16994d, this.f16995e));
    }
}
