package com.umeng.umlink.a;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private static BlockingQueue<Runnable> f13623d = new ArrayBlockingQueue(64);

    /* renamed from: a, reason: collision with root package name */
    private static int f13620a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static int f13621b = 64;

    /* renamed from: c, reason: collision with root package name */
    private static int f13622c = 5;

    /* renamed from: e, reason: collision with root package name */
    private static ThreadPoolExecutor f13624e = new ThreadPoolExecutor(f13620a, f13621b, f13622c, TimeUnit.SECONDS, f13623d);

    public static void a(Runnable runnable) {
        f13624e.execute(runnable);
    }
}
