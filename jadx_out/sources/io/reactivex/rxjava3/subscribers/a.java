package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.i;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public abstract class a<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    q f18923a;

    protected final void a() {
        q qVar = this.f18923a;
        this.f18923a = j.CANCELLED;
        qVar.cancel();
    }

    protected void b() {
        c(Long.MAX_VALUE);
    }

    protected final void c(long j5) {
        q qVar = this.f18923a;
        if (qVar != null) {
            qVar.request(j5);
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public final void onSubscribe(q qVar) {
        if (i.f(this.f18923a, qVar, getClass())) {
            this.f18923a = qVar;
            b();
        }
    }
}
