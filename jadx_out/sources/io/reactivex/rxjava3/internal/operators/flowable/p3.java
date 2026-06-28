package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class p3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.c<T, T, T> f16945c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16946a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<T, T, T> f16947b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16948c;

        /* renamed from: d, reason: collision with root package name */
        T f16949d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16950e;

        a(org.reactivestreams.p<? super T> pVar, m3.c<T, T, T> cVar) {
            this.f16946a = pVar;
            this.f16947b = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16948c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16950e) {
                return;
            }
            this.f16950e = true;
            this.f16946a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16950e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16950e = true;
                this.f16946a.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16950e) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.f16946a;
            T t6 = this.f16949d;
            if (t6 == null) {
                this.f16949d = t5;
                pVar.onNext(t5);
                return;
            }
            try {
                T apply = this.f16947b.apply(t6, t5);
                Objects.requireNonNull(apply, "The value returned by the accumulator is null");
                this.f16949d = apply;
                pVar.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16948c.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16948c, qVar)) {
                this.f16948c = qVar;
                this.f16946a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16948c.request(j5);
        }
    }

    public p3(io.reactivex.rxjava3.core.o<T> oVar, m3.c<T, T, T> cVar) {
        super(oVar);
        this.f16945c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16945c));
    }
}
