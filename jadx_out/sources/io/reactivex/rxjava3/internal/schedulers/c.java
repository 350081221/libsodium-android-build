package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class c implements Future<Object> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.disposables.e f18533a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(io.reactivex.rxjava3.disposables.e eVar) {
        this.f18533a = eVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        this.f18533a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j5, @l3.f TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
