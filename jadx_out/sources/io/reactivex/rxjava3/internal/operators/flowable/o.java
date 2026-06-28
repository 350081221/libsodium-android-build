package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class o<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<B> f16913c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<U> f16914d;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.subscribers.b<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f16915b;

        a(b<T, U, B> bVar) {
            this.f16915b = bVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16915b.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16915b.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(B b5) {
            this.f16915b.v();
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.subscribers.n<T, U, U> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> C0;
        final org.reactivestreams.o<B> D0;
        org.reactivestreams.q E0;
        io.reactivex.rxjava3.disposables.e F0;
        U G0;

        b(org.reactivestreams.p<? super U> pVar, m3.s<U> sVar, org.reactivestreams.o<B> oVar) {
            super(pVar, new io.reactivex.rxjava3.internal.queue.a());
            this.C0 = sVar;
            this.D0 = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.f18650z0) {
                this.f18650z0 = true;
                this.F0.dispose();
                this.E0.cancel();
                if (b()) {
                    this.f18649y0.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18650z0;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            synchronized (this) {
                U u4 = this.G0;
                if (u4 == null) {
                    return;
                }
                this.G0 = null;
                this.f18649y0.offer(u4);
                this.A0 = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.v.e(this.f18649y0, this.f18648x0, false, this, this);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            cancel();
            this.f18648x0.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            synchronized (this) {
                U u4 = this.G0;
                if (u4 == null) {
                    return;
                }
                u4.add(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (!io.reactivex.rxjava3.internal.subscriptions.j.validate(this.E0, qVar)) {
                return;
            }
            this.E0 = qVar;
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The buffer supplied is null");
                this.G0 = u4;
                a aVar = new a(this);
                this.F0 = aVar;
                this.f18648x0.onSubscribe(this);
                if (!this.f18650z0) {
                    qVar.request(Long.MAX_VALUE);
                    this.D0.subscribe(aVar);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18650z0 = true;
                qVar.cancel();
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, this.f18648x0);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            t(j5);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.n, io.reactivex.rxjava3.internal.util.u
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean g(org.reactivestreams.p<? super U> pVar, U u4) {
            this.f18648x0.onNext(u4);
            return true;
        }

        void v() {
            try {
                U u4 = this.C0.get();
                Objects.requireNonNull(u4, "The buffer supplied is null");
                U u5 = u4;
                synchronized (this) {
                    U u6 = this.G0;
                    if (u6 == null) {
                        return;
                    }
                    this.G0 = u5;
                    r(u6, false, this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                this.f18648x0.onError(th);
            }
        }
    }

    public o(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<B> oVar2, m3.s<U> sVar) {
        super(oVar);
        this.f16913c = oVar2;
        this.f16914d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super U> pVar) {
        this.f16598b.N6(new b(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16914d, this.f16913c));
    }
}
