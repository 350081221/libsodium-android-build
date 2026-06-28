package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class a2<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends U> f17534b;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends io.reactivex.rxjava3.internal.observers.a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, ? extends U> f17535f;

        a(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.o<? super T, ? extends U> oVar) {
            super(p0Var);
            this.f17535f = oVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f16411d) {
                return;
            }
            if (this.f16412e != 0) {
                this.f16408a.onNext(null);
                return;
            }
            try {
                U apply = this.f17535f.apply(t5);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f16408a.onNext(apply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public U poll() throws Throwable {
            T poll = this.f16410c.poll();
            if (poll != null) {
                U apply = this.f17535f.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public a2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends U> oVar) {
        super(n0Var);
        this.f17534b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17534b));
    }
}
