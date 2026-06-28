package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class hgf {
    public static ExecutorService abc = Executors.newSingleThreadExecutor(new NamedThreadFactory("ApmsHiLog"));

    public static void abc(Runnable runnable) {
        if (runnable != null) {
            Agent.getExecutor().execute(runnable);
        }
    }

    public static void bcd(Runnable runnable) {
        if (runnable != null) {
            abc.execute(runnable);
        }
    }
}
