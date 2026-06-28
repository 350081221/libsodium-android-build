package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class b<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    private final io.reactivex.rxjava3.core.d0<? extends T>[] f17238a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.rxjava3.core.d0<? extends T>> f17239b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.a0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17240a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicBoolean f17241b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f17242c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17243d;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.disposables.c cVar, AtomicBoolean atomicBoolean) {
            this.f17240a = a0Var;
            this.f17242c = cVar;
            this.f17241b = atomicBoolean;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.f17241b.compareAndSet(false, true)) {
                this.f17242c.c(this.f17243d);
                this.f17242c.dispose();
                this.f17240a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f17241b.compareAndSet(false, true)) {
                this.f17242c.c(this.f17243d);
                this.f17242c.dispose();
                this.f17240a.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17243d = eVar;
            this.f17242c.b(eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            if (this.f17241b.compareAndSet(false, true)) {
                this.f17242c.c(this.f17243d);
                this.f17242c.dispose();
                this.f17240a.onSuccess(t5);
            }
        }
    }

    public b(io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr, Iterable<? extends io.reactivex.rxjava3.core.d0<? extends T>> iterable) {
        this.f17238a = d0VarArr;
        this.f17239b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        int length;
        io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr = this.f17238a;
        if (d0VarArr == null) {
            d0VarArr = new io.reactivex.rxjava3.core.d0[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.d0<? extends T> d0Var : this.f17239b) {
                    if (d0Var == null) {
                        io.reactivex.rxjava3.internal.disposables.d.error(new NullPointerException("One of the sources is null"), a0Var);
                        return;
                    }
                    if (length == d0VarArr.length) {
                        io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr2 = new io.reactivex.rxjava3.core.d0[(length >> 2) + length];
                        System.arraycopy(d0VarArr, 0, d0VarArr2, 0, length);
                        d0VarArr = d0VarArr2;
                    }
                    int i5 = length + 1;
                    d0VarArr[length] = d0Var;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, a0Var);
                return;
            }
        } else {
            length = d0VarArr.length;
        }
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        a0Var.onSubscribe(cVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i6 = 0; i6 < length; i6++) {
            io.reactivex.rxjava3.core.d0<? extends T> d0Var2 = d0VarArr[i6];
            if (cVar.isDisposed()) {
                return;
            }
            if (d0Var2 == null) {
                cVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    a0Var.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            d0Var2.a(new a(a0Var, cVar, atomicBoolean));
        }
        if (length == 0) {
            a0Var.onComplete();
        }
    }
}
