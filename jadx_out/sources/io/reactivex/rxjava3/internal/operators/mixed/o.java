package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.d0;
import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.n0;
import io.reactivex.rxjava3.core.p0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final d0<T> f17493a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends n0<? extends R>> f17494b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements p0<R>, a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8948264376121066672L;
        final p0<? super R> downstream;
        final m3.o<? super T, ? extends n0<? extends R>> mapper;

        a(p0<? super R> p0Var, m3.o<? super T, ? extends n0<? extends R>> oVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(R r5) {
            this.downstream.onNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                n0<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                n0<? extends R> n0Var = apply;
                if (!isDisposed()) {
                    n0Var.subscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public o(d0<T> d0Var, m3.o<? super T, ? extends n0<? extends R>> oVar) {
        this.f17493a = d0Var;
        this.f17494b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super R> p0Var) {
        a aVar = new a(p0Var, this.f17494b);
        p0Var.onSubscribe(aVar);
        this.f17493a.a(aVar);
    }
}
