package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.i;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public abstract class b<T> implements t<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<q> f18924a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        dispose();
    }

    protected void b() {
        this.f18924a.get().request(Long.MAX_VALUE);
    }

    protected final void c(long j5) {
        this.f18924a.get().request(j5);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        j.cancel(this.f18924a);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return this.f18924a.get() == j.CANCELLED;
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public final void onSubscribe(q qVar) {
        if (i.d(this.f18924a, qVar, getClass())) {
            b();
        }
    }
}
