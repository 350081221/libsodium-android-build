package com.umeng.cconfig.c;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static BlockingQueue<Runnable> f12956d = new ArrayBlockingQueue(64);

    /* renamed from: a, reason: collision with root package name */
    private static int f12953a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static int f12954b = 64;

    /* renamed from: c, reason: collision with root package name */
    private static int f12955c = 5;

    /* renamed from: e, reason: collision with root package name */
    private static ThreadPoolExecutor f12957e = new ThreadPoolExecutor(f12953a, f12954b, f12955c, TimeUnit.SECONDS, f12956d);

    public static void a(Runnable runnable) {
        f12957e.execute(runnable);
    }
}
