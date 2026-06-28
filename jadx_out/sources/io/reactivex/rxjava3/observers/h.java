package io.reactivex.rxjava3.observers;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class h implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.reactivex.rxjava3.disposables.e> f18719a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final io.reactivex.rxjava3.internal.disposables.e f18720b = new io.reactivex.rxjava3.internal.disposables.e();

    public final void a(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(eVar, "resource is null");
        this.f18720b.b(eVar);
    }

    protected void b() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        if (io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18719a)) {
            this.f18720b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f18719a.get());
    }

    @Override // io.reactivex.rxjava3.core.f
    public final void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.util.i.c(this.f18719a, eVar, getClass())) {
            b();
        }
    }
}
