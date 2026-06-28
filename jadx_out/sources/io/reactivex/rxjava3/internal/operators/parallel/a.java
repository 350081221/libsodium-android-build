package io.reactivex.rxjava3.internal.operators.parallel;

import java.util.Objects;
import m3.s;

/* loaded from: classes3.dex */
public final class a<T, C> extends io.reactivex.rxjava3.parallel.b<C> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<? extends T> f18206a;

    /* renamed from: b, reason: collision with root package name */
    final s<? extends C> f18207b;

    /* renamed from: c, reason: collision with root package name */
    final m3.b<? super C, ? super T> f18208c;

    /* renamed from: io.reactivex.rxjava3.internal.operators.parallel.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0518a<T, C> extends io.reactivex.rxjava3.internal.subscribers.h<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        C collection;
        final m3.b<? super C, ? super T> collector;
        boolean done;

        C0518a(org.reactivestreams.p<? super C> pVar, C c5, m3.b<? super C, ? super T> bVar) {
            super(pVar);
            this.collection = c5;
            this.collector = bVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c5 = this.collection;
            this.collection = null;
            complete(c5);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.collection = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                this.collector.accept(this.collection, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public a(io.reactivex.rxjava3.parallel.b<? extends T> bVar, s<? extends C> sVar, m3.b<? super C, ? super T> bVar2) {
        this.f18206a = bVar;
        this.f18207b = sVar;
        this.f18208c = bVar2;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18206a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super C>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super Object>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            try {
                C c5 = this.f18207b.get();
                Objects.requireNonNull(c5, "The initialSupplier returned a null value");
                pVarArr2[i5] = new C0518a(pVarArr[i5], c5, this.f18208c);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                c0(pVarArr, th);
                return;
            }
        }
        this.f18206a.X(pVarArr2);
    }

    void c0(org.reactivestreams.p<?>[] pVarArr, Throwable th) {
        for (org.reactivestreams.p<?> pVar : pVarArr) {
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
