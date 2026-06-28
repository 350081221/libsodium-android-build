package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16541a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.i> f16542b;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 5018523762564524046L;
        final io.reactivex.rxjava3.core.f downstream;
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.i> errorMapper;
        boolean once;

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.i> oVar) {
            this.downstream = fVar;
            this.errorMapper = oVar;
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

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.once) {
                this.downstream.onError(th);
                return;
            }
            this.once = true;
            try {
                io.reactivex.rxjava3.core.i apply = this.errorMapper.apply(th);
                Objects.requireNonNull(apply, "The errorMapper returned a null CompletableSource");
                apply.a(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }
    }

    public l0(io.reactivex.rxjava3.core.i iVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.i> oVar) {
        this.f16541a = iVar;
        this.f16542b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar, this.f16542b);
        fVar.onSubscribe(aVar);
        this.f16541a.a(aVar);
    }
}
