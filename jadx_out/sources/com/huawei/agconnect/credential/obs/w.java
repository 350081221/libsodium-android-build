package com.huawei.agconnect.credential.obs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7961a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7962b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7963c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f7964d = 1;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f7961a = availableProcessors;
        f7962b = (availableProcessors * 2) + 1;
        f7963c = availableProcessors + 1;
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f7963c, f7962b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
