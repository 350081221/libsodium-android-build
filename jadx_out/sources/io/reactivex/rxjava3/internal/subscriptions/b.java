package io.reactivex.rxjava3.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class b extends AtomicLong implements q, io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<q> actual;
    final AtomicReference<io.reactivex.rxjava3.disposables.e> resource;

    public b() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        j.cancel(this.actual);
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.resource);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.actual.get() == j.CANCELLED;
    }

    public boolean replaceResource(io.reactivex.rxjava3.disposables.e eVar) {
        return io.reactivex.rxjava3.internal.disposables.c.replace(this.resource, eVar);
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        j.deferredRequest(this.actual, this, j5);
    }

    public boolean setResource(io.reactivex.rxjava3.disposables.e eVar) {
        return io.reactivex.rxjava3.internal.disposables.c.set(this.resource, eVar);
    }

    public void setSubscription(q qVar) {
        j.deferredSetOnce(this.actual, this, qVar);
    }

    public b(io.reactivex.rxjava3.disposables.e eVar) {
        this();
        this.resource.lazySet(eVar);
    }
}
