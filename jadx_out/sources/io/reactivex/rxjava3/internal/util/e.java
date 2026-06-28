package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class e {
    private e() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(CountDownLatch countDownLatch, io.reactivex.rxjava3.disposables.e eVar) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            b();
            countDownLatch.await();
        } catch (InterruptedException e5) {
            eVar.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e5);
        }
    }

    public static void b() {
        if (io.reactivex.rxjava3.plugins.a.L()) {
            if ((Thread.currentThread() instanceof io.reactivex.rxjava3.internal.schedulers.j) || io.reactivex.rxjava3.plugins.a.W()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
