package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class e extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i[] f16497a;

    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.f {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.rxjava3.core.f downstream;
        int index;
        final io.reactivex.rxjava3.internal.disposables.f sd = new io.reactivex.rxjava3.internal.disposables.f();
        final io.reactivex.rxjava3.core.i[] sources;

        a(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.core.i[] iVarArr) {
            this.downstream = fVar;
            this.sources = iVarArr;
        }

        void next() {
            if (this.sd.isDisposed() || getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.i[] iVarArr = this.sources;
            while (!this.sd.isDisposed()) {
                int i5 = this.index;
                this.index = i5 + 1;
                if (i5 == iVarArr.length) {
                    this.downstream.onComplete();
                    return;
                } else {
                    iVarArr[i5].a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            next();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.sd.replace(eVar);
        }
    }

    public e(io.reactivex.rxjava3.core.i[] iVarArr) {
        this.f16497a = iVarArr;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar, this.f16497a);
        fVar.onSubscribe(aVar.sd);
        aVar.next();
    }
}
