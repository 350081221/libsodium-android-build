package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class m4<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.subjects.i<T> f17865a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f17866b = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m4(io.reactivex.rxjava3.subjects.i<T> iVar) {
        this.f17865a = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I8() {
        return !this.f17866b.get() && this.f17866b.compareAndSet(false, true);
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17865a.subscribe(p0Var);
        this.f17866b.set(true);
    }
}
