package com.ss.android.socialbase.downloader.h;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f10829a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f10830b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10831c;

    public a(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f10829a + "-" + this.f10830b.incrementAndGet());
        if (!this.f10831c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public a(String str, boolean z4) {
        this.f10830b = new AtomicInteger();
        this.f10829a = str;
        this.f10831c = z4;
    }
}
