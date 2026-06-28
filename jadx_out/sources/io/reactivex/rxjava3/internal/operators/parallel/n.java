package io.reactivex.rxjava3.internal.operators.parallel;

import java.util.Objects;
import m3.s;

/* loaded from: classes3.dex */
public final class n<T, R> extends io.reactivex.rxjava3.parallel.b<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<? extends T> f18299a;

    /* renamed from: b, reason: collision with root package name */
    final s<R> f18300b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<R, ? super T, R> f18301c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.h<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        R accumulator;
        boolean done;
        final m3.c<R, ? super T, R> reducer;

        a(org.reactivestreams.p<? super R> pVar, R r5, m3.c<R, ? super T, R> cVar) {
            super(pVar);
            this.accumulator = r5;
            this.reducer = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                R r5 = this.accumulator;
                this.accumulator = null;
                complete(r5);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.accumulator = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.done) {
                try {
                    R apply = this.reducer.apply(this.accumulator, t5);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.accumulator = apply;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    onError(th);
                }
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

    public n(io.reactivex.rxjava3.parallel.b<? extends T> bVar, s<R> sVar, m3.c<R, ? super T, R> cVar) {
        this.f18299a = bVar;
        this.f18300b = sVar;
        this.f18301c = cVar;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18299a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super R>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super Object>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            try {
                R r5 = this.f18300b.get();
                Objects.requireNonNull(r5, "The initialSupplier returned a null value");
                pVarArr2[i5] = new a(pVarArr[i5], r5, this.f18301c);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                c0(pVarArr, th);
                return;
            }
        }
        this.f18299a.X(pVarArr2);
    }

    void c0(org.reactivestreams.p<?>[] pVarArr, Throwable th) {
        for (org.reactivestreams.p<?> pVar : pVarArr) {
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
