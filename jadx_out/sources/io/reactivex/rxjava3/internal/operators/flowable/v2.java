package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class v2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends T> f17099c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.t<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final m3.o<? super Throwable, ? extends T> valueSupplier;

        a(org.reactivestreams.p<? super T> pVar, m3.o<? super Throwable, ? extends T> oVar) {
            super(pVar);
            this.valueSupplier = oVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            try {
                T apply = this.valueSupplier.apply(th);
                Objects.requireNonNull(apply, "The valueSupplier returned a null value");
                complete(apply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }
    }

    public v2(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super Throwable, ? extends T> oVar2) {
        super(oVar);
        this.f17099c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17099c));
    }
}
