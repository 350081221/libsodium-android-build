package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public final class cx {
    private final ThreadPoolExecutor hij;
    private static final cx lmn = new cx(1);
    private static final cx klm = new cx(3);
    private static final cx ikl = new cx(3);
    private static final cx ijk = new cx(1);

    /* loaded from: classes3.dex */
    static class lmn implements Runnable {
        private Runnable lmn;

        public lmn(Runnable runnable) {
            this.lmn = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = this.lmn;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    HiLog.w("ThreadStock", "InnerTask : Error has happened,From internal operations!" + th.getMessage());
                    di.lmn(th);
                }
            }
        }
    }

    private cx(int i5) {
        this.hij = new ThreadPoolExecutor(0, i5, OpenStreetMapTileProviderConstants.ONE_MINUTE, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(com.alipay.sdk.app.b.f3003h));
    }

    public static cx ijk() {
        return ijk;
    }

    public static cx ikl() {
        return ikl;
    }

    public static cx klm() {
        return klm;
    }

    public static cx lmn() {
        return lmn;
    }

    public final void lmn(Runnable runnable) {
        try {
            this.hij.execute(new lmn(runnable));
        } catch (RejectedExecutionException unused) {
            HiLog.w("ThreadStock", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
