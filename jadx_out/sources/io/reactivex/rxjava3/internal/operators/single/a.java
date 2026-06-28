package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class a<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final io.reactivex.rxjava3.core.x0<? extends T>[] f18312a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> f18313b;

    /* renamed from: io.reactivex.rxjava3.internal.operators.single.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0521a<T> implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f18314a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18315b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f18316c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18317d;

        C0521a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.disposables.c cVar, AtomicBoolean atomicBoolean) {
            this.f18315b = u0Var;
            this.f18314a = cVar;
            this.f18316c = atomicBoolean;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f18316c.compareAndSet(false, true)) {
                this.f18314a.c(this.f18317d);
                this.f18314a.dispose();
                this.f18315b.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18317d = eVar;
            this.f18314a.b(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            if (this.f18316c.compareAndSet(false, true)) {
                this.f18314a.c(this.f18317d);
                this.f18314a.dispose();
                this.f18315b.onSuccess(t5);
            }
        }
    }

    public a(io.reactivex.rxjava3.core.x0<? extends T>[] x0VarArr, Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> iterable) {
        this.f18312a = x0VarArr;
        this.f18313b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        int length;
        io.reactivex.rxjava3.core.x0<? extends T>[] x0VarArr = this.f18312a;
        if (x0VarArr == null) {
            x0VarArr = new io.reactivex.rxjava3.core.x0[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.x0<? extends T> x0Var : this.f18313b) {
                    if (x0Var == null) {
                        io.reactivex.rxjava3.internal.disposables.d.error(new NullPointerException("One of the sources is null"), u0Var);
                        return;
                    }
                    if (length == x0VarArr.length) {
                        io.reactivex.rxjava3.core.x0<? extends T>[] x0VarArr2 = new io.reactivex.rxjava3.core.x0[(length >> 2) + length];
                        System.arraycopy(x0VarArr, 0, x0VarArr2, 0, length);
                        x0VarArr = x0VarArr2;
                    }
                    int i5 = length + 1;
                    x0VarArr[length] = x0Var;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
                return;
            }
        } else {
            length = x0VarArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        u0Var.onSubscribe(cVar);
        for (int i6 = 0; i6 < length; i6++) {
            io.reactivex.rxjava3.core.x0<? extends T> x0Var2 = x0VarArr[i6];
            if (cVar.isDisposed()) {
                return;
            }
            if (x0Var2 == null) {
                cVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    u0Var.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            x0Var2.a(new C0521a(u0Var, cVar, atomicBoolean));
        }
    }
}
