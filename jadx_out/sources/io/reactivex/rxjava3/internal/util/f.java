package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class f extends CountDownLatch implements m3.g<Throwable>, m3.a {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f18686a;

    public f() {
        super(1);
    }

    @Override // m3.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        this.f18686a = th;
        countDown();
    }

    @Override // m3.a
    public void run() {
        countDown();
    }
}
