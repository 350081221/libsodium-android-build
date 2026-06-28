package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class a extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    private final io.reactivex.rxjava3.core.i[] f16468a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.rxjava3.core.i> f16469b;

    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0455a implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f16470a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f16471b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16472c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16473d;

        C0455a(AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.core.f fVar) {
            this.f16470a = atomicBoolean;
            this.f16471b = cVar;
            this.f16472c = fVar;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.f16470a.compareAndSet(false, true)) {
                this.f16471b.c(this.f16473d);
                this.f16471b.dispose();
                this.f16472c.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f16470a.compareAndSet(false, true)) {
                this.f16471b.c(this.f16473d);
                this.f16471b.dispose();
                this.f16472c.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16473d = eVar;
            this.f16471b.b(eVar);
        }
    }

    public a(io.reactivex.rxjava3.core.i[] iVarArr, Iterable<? extends io.reactivex.rxjava3.core.i> iterable) {
        this.f16468a = iVarArr;
        this.f16469b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        int length;
        io.reactivex.rxjava3.core.i[] iVarArr = this.f16468a;
        if (iVarArr == null) {
            iVarArr = new io.reactivex.rxjava3.core.i[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.i iVar : this.f16469b) {
                    if (iVar == null) {
                        io.reactivex.rxjava3.internal.disposables.d.error(new NullPointerException("One of the sources is null"), fVar);
                        return;
                    }
                    if (length == iVarArr.length) {
                        io.reactivex.rxjava3.core.i[] iVarArr2 = new io.reactivex.rxjava3.core.i[(length >> 2) + length];
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                        iVarArr = iVarArr2;
                    }
                    int i5 = length + 1;
                    iVarArr[length] = iVar;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, fVar);
                return;
            }
        } else {
            length = iVarArr.length;
        }
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.onSubscribe(cVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i6 = 0; i6 < length; i6++) {
            io.reactivex.rxjava3.core.i iVar2 = iVarArr[i6];
            if (cVar.isDisposed()) {
                return;
            }
            if (iVar2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    cVar.dispose();
                    fVar.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            iVar2.a(new C0455a(atomicBoolean, cVar, fVar));
        }
        if (length == 0) {
            fVar.onComplete();
        }
    }
}
