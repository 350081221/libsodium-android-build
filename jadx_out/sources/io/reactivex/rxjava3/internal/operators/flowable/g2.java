package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class g2<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends R> f16765c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends R> f16766d;

    /* renamed from: e, reason: collision with root package name */
    final m3.s<? extends R> f16767e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.t<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;
        final m3.s<? extends R> onCompleteSupplier;
        final m3.o<? super Throwable, ? extends R> onErrorMapper;
        final m3.o<? super T, ? extends R> onNextMapper;

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends R> oVar, m3.o<? super Throwable, ? extends R> oVar2, m3.s<? extends R> sVar) {
            super(pVar);
            this.onNextMapper = oVar;
            this.onErrorMapper = oVar2;
            this.onCompleteSupplier = sVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            try {
                R r5 = this.onCompleteSupplier.get();
                Objects.requireNonNull(r5, "The onComplete publisher returned is null");
                complete(r5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            try {
                R apply = this.onErrorMapper.apply(th);
                Objects.requireNonNull(apply, "The onError publisher returned is null");
                complete(apply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            try {
                R apply = this.onNextMapper.apply(t5);
                Objects.requireNonNull(apply, "The onNext publisher returned is null");
                this.produced++;
                this.downstream.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public g2(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends R> oVar2, m3.o<? super Throwable, ? extends R> oVar3, m3.s<? extends R> sVar) {
        super(oVar);
        this.f16765c = oVar2;
        this.f16766d = oVar3;
        this.f16767e = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16598b.N6(new a(pVar, this.f16765c, this.f16766d, this.f16767e));
    }
}
