package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class f<T> extends CountDownLatch implements io.reactivex.rxjava3.core.a0<T>, u0<T>, io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    T f16425a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f16426b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.disposables.f f16427c;

    public f() {
        super(1);
        this.f16427c = new io.reactivex.rxjava3.internal.disposables.f();
    }

    public void a(io.reactivex.rxjava3.core.f fVar) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                dispose();
                fVar.onError(e5);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.f16426b;
        if (th != null) {
            fVar.onError(th);
        } else {
            fVar.onComplete();
        }
    }

    public void b(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                dispose();
                a0Var.onError(e5);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.f16426b;
        if (th != null) {
            a0Var.onError(th);
            return;
        }
        T t5 = this.f16425a;
        if (t5 == null) {
            a0Var.onComplete();
        } else {
            a0Var.onSuccess(t5);
        }
    }

    public void c(u0<? super T> u0Var) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                dispose();
                u0Var.onError(e5);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.f16426b;
        if (th != null) {
            u0Var.onError(th);
        } else {
            u0Var.onSuccess(this.f16425a);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f16427c.dispose();
        countDown();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f16427c.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        this.f16427c.lazySet(io.reactivex.rxjava3.disposables.e.h());
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(@l3.f Throwable th) {
        this.f16426b = th;
        this.f16427c.lazySet(io.reactivex.rxjava3.disposables.e.h());
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f16427c, eVar);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(@l3.f T t5) {
        this.f16425a = t5;
        this.f16427c.lazySet(io.reactivex.rxjava3.disposables.e.h());
        countDown();
    }
}
