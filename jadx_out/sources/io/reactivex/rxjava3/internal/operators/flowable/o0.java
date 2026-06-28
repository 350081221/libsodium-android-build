package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class o0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super T> f16916c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.g<? super T> f16917f;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, m3.g<? super T> gVar) {
            super(cVar);
            this.f16917f = gVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f18631a.onNext(t5);
            if (this.f18635e == 0) {
                try {
                    this.f16917f.accept(t5);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.f18633c.poll();
            if (poll != null) {
                this.f16917f.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            boolean tryOnNext = this.f18631a.tryOnNext(t5);
            try {
                this.f16917f.accept(t5);
            } catch (Throwable th) {
                c(th);
            }
            return tryOnNext;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.g<? super T> f16918f;

        b(org.reactivestreams.p<? super T> pVar, m3.g<? super T> gVar) {
            super(pVar);
            this.f16918f = gVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18639d) {
                return;
            }
            this.f18636a.onNext(t5);
            if (this.f18640e == 0) {
                try {
                    this.f16918f.accept(t5);
                } catch (Throwable th) {
                    c(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll = this.f18638c.poll();
            if (poll != null) {
                this.f16918f.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public o0(io.reactivex.rxjava3.core.o<T> oVar, m3.g<? super T> gVar) {
        super(oVar);
        this.f16916c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16916c));
        } else {
            this.f16598b.N6(new b(pVar, this.f16916c));
        }
    }
}
