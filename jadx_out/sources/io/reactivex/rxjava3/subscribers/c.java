package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public abstract class c<T> implements t<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<q> f18925a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final io.reactivex.rxjava3.internal.disposables.e f18926b = new io.reactivex.rxjava3.internal.disposables.e();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f18927c = new AtomicLong();

    public final void a(io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(eVar, "resource is null");
        this.f18926b.b(eVar);
    }

    protected void b() {
        c(Long.MAX_VALUE);
    }

    protected final void c(long j5) {
        j.deferredRequest(this.f18925a, this.f18927c, j5);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        if (j.cancel(this.f18925a)) {
            this.f18926b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return this.f18925a.get() == j.CANCELLED;
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public final void onSubscribe(q qVar) {
        if (i.d(this.f18925a, qVar, getClass())) {
            long andSet = this.f18927c.getAndSet(0L);
            if (andSet != 0) {
                qVar.request(andSet);
            }
            b();
        }
    }
}
