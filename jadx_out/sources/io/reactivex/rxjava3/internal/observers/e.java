package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class e<T> extends CountDownLatch implements p0<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    T f16421a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f16422b;

    /* renamed from: c, reason: collision with root package name */
    io.reactivex.rxjava3.disposables.e f16423c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f16424d;

    public e() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                dispose();
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }
        Throwable th = this.f16422b;
        if (th == null) {
            return this.f16421a;
        }
        throw io.reactivex.rxjava3.internal.util.k.i(th);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        this.f16424d = true;
        io.reactivex.rxjava3.disposables.e eVar = this.f16423c;
        if (eVar != null) {
            eVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return this.f16424d;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public final void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        this.f16423c = eVar;
        if (this.f16424d) {
            eVar.dispose();
        }
    }
}
