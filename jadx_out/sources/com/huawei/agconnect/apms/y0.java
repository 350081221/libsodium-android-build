package com.huawei.agconnect.apms;

import android.content.ComponentCallbacks2;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class y0 implements ComponentCallbacks2 {
    public ScheduledExecutorService abc = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("UIBackgroundListener"));

    /* loaded from: classes3.dex */
    public static class bcd implements Runnable {
        public /* synthetic */ bcd(abc abcVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationStateMonitor.getInstance().uiHidden();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        if (i5 == 20) {
            this.abc.submit(new bcd(null));
        }
    }
}
