package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class i<T> extends CountDownLatch implements u0<T>, io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.core.a0<T> {

    /* renamed from: a, reason: collision with root package name */
    T f16428a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f16429b;

    /* renamed from: c, reason: collision with root package name */
    io.reactivex.rxjava3.disposables.e f16430c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f16431d;

    public i() {
        super(1);
    }

    public boolean a(long j5, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                if (!await(j5, timeUnit)) {
                    e();
                    return false;
                }
            } catch (InterruptedException e5) {
                e();
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }
        Throwable th = this.f16429b;
        if (th == null) {
            return true;
        }
        throw io.reactivex.rxjava3.internal.util.k.i(th);
    }

    public void b(m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar) {
        try {
            if (getCount() != 0) {
                try {
                    io.reactivex.rxjava3.internal.util.e.b();
                    await();
                } catch (InterruptedException e5) {
                    e();
                    gVar2.accept(e5);
                    return;
                }
            }
            Throwable th = this.f16429b;
            if (th != null) {
                gVar2.accept(th);
                return;
            }
            T t5 = this.f16428a;
            if (t5 != null) {
                gVar.accept(t5);
            } else {
                aVar.run();
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(th2);
        }
    }

    public T c() {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                e();
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }
        Throwable th = this.f16429b;
        if (th == null) {
            return this.f16428a;
        }
        throw io.reactivex.rxjava3.internal.util.k.i(th);
    }

    public T d(T t5) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                e();
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }
        Throwable th = this.f16429b;
        if (th == null) {
            T t6 = this.f16428a;
            if (t6 != null) {
                return t6;
            }
            return t5;
        }
        throw io.reactivex.rxjava3.internal.util.k.i(th);
    }

    void e() {
        this.f16431d = true;
        io.reactivex.rxjava3.disposables.e eVar = this.f16430c;
        if (eVar != null) {
            eVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        this.f16429b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        this.f16430c = eVar;
        if (this.f16431d) {
            eVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        this.f16428a = t5;
        countDown();
    }
}
