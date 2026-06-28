package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class m0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16547a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16548b;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.rxjava3.core.f downstream;
        final io.reactivex.rxjava3.core.i source;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();

        a(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.core.i iVar) {
            this.downstream = fVar;
            this.source = iVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.task.dispose();
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
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.a(this);
        }
    }

    public m0(io.reactivex.rxjava3.core.i iVar, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f16547a = iVar;
        this.f16548b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar, this.f16547a);
        fVar.onSubscribe(aVar);
        aVar.task.replace(this.f16548b.e(aVar));
    }
}
