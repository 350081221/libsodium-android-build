package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16475a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16476b;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f16477a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16478b;

        a(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.core.f fVar) {
            this.f16477a = atomicReference;
            this.f16478b = fVar;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16478b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16478b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this.f16477a, eVar);
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0456b extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -4101678820158072998L;
        final io.reactivex.rxjava3.core.f actualObserver;
        final io.reactivex.rxjava3.core.i next;

        C0456b(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.core.i iVar) {
            this.actualObserver = fVar;
            this.next = iVar;
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
            this.next.a(new a(this, this.actualObserver));
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.actualObserver.onSubscribe(this);
            }
        }
    }

    public b(io.reactivex.rxjava3.core.i iVar, io.reactivex.rxjava3.core.i iVar2) {
        this.f16475a = iVar;
        this.f16476b = iVar2;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16475a.a(new C0456b(fVar, this.f16476b));
    }
}
