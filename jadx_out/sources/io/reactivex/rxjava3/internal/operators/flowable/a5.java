package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a5<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.processors.c<T> f16609b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f16610c = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a5(io.reactivex.rxjava3.processors.c<T> cVar) {
        this.f16609b = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16609b.subscribe(pVar);
        this.f16610c.set(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n9() {
        return !this.f16610c.get() && this.f16610c.compareAndSet(false, true);
    }
}
