package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class g implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f1745d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f1746a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f1747b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f1748c;

    public g() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f1746a = threadGroup;
        this.f1748c = "lottie-" + f1745d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f1746a, runnable, this.f1748c + this.f1747b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
