package io.reactivex.rxjava3.internal.subscribers;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class c<T> extends CountDownLatch implements io.reactivex.rxjava3.core.t<T> {

    /* renamed from: a, reason: collision with root package name */
    T f18641a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f18642b;

    /* renamed from: c, reason: collision with root package name */
    org.reactivestreams.q f18643c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f18644d;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.e.b();
                await();
            } catch (InterruptedException e5) {
                org.reactivestreams.q qVar = this.f18643c;
                this.f18643c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                if (qVar != null) {
                    qVar.cancel();
                }
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }
        Throwable th = this.f18642b;
        if (th == null) {
            return this.f18641a;
        }
        throw io.reactivex.rxjava3.internal.util.k.i(th);
    }

    @Override // org.reactivestreams.p
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public final void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18643c, qVar)) {
            this.f18643c = qVar;
            if (!this.f18644d) {
                qVar.request(Long.MAX_VALUE);
                if (this.f18644d) {
                    this.f18643c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                    qVar.cancel();
                }
            }
        }
    }
}
