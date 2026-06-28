package com.huawei.agconnect.https;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8001a = new e() { // from class: com.huawei.agconnect.https.e.1

        /* renamed from: b, reason: collision with root package name */
        Executor f8002b = new ThreadPoolExecutor(0, 8, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.huawei.agconnect.https.e.1.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AGC-Https-Thread");
            }
        });

        @Override // com.huawei.agconnect.https.e
        public Executor a() {
            return this.f8002b;
        }
    };

    Executor a();
}
