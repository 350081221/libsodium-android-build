package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a0<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18318a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f18319b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -2177128922851101253L;
        final io.reactivex.rxjava3.core.f downstream;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> mapper;

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar) {
            this.downstream = fVar;
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

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.i apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.i iVar = apply;
                if (!isDisposed()) {
                    iVar.a(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                onError(th);
            }
        }
    }

    public a0(io.reactivex.rxjava3.core.x0<T> x0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar) {
        this.f18318a = x0Var;
        this.f18319b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar, this.f18319b);
        fVar.onSubscribe(aVar);
        this.f18318a.a(aVar);
    }
}
