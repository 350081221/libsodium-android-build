package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class d0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i[] f16491a;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16492a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f16493b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.util.c f16494c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f16495d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.internal.util.c cVar2, AtomicInteger atomicInteger) {
            this.f16492a = fVar;
            this.f16493b = cVar;
            this.f16494c = cVar2;
            this.f16495d = atomicInteger;
        }

        void a() {
            if (this.f16495d.decrementAndGet() == 0) {
                this.f16494c.tryTerminateConsumer(this.f16492a);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f16494c.tryAddThrowableOrReport(th)) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16493b.b(eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.util.c f16496a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(io.reactivex.rxjava3.internal.util.c cVar) {
            this.f16496a = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16496a.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16496a.isTerminated();
        }
    }

    public d0(io.reactivex.rxjava3.core.i[] iVarArr) {
        this.f16491a = iVarArr;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        AtomicInteger atomicInteger = new AtomicInteger(this.f16491a.length + 1);
        io.reactivex.rxjava3.internal.util.c cVar2 = new io.reactivex.rxjava3.internal.util.c();
        cVar.b(new b(cVar2));
        fVar.onSubscribe(cVar);
        for (io.reactivex.rxjava3.core.i iVar : this.f16491a) {
            if (cVar.isDisposed()) {
                return;
            }
            if (iVar == null) {
                cVar2.tryAddThrowableOrReport(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                iVar.a(new a(fVar, cVar, cVar2, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            cVar2.tryTerminateConsumer(fVar);
        }
    }
}
