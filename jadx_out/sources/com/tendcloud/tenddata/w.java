package com.tendcloud.tenddata;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f11818a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f11819b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f11820c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11821d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11822e = 30;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f11823f;

    /* renamed from: g, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f11824g;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f11819b = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f11820c = max;
        int i5 = (availableProcessors * 2) + 1;
        f11821d = i5;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.tendcloud.tenddata.w.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ThreadPoolUtils #" + this.mCount.getAndIncrement());
            }
        };
        f11823f = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f11824g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i5, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11818a = threadPoolExecutor;
    }
}
