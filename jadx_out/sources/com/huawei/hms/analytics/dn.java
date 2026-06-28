package com.huawei.hms.analytics;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class dn {
    private static final Object lmn = new Object();
    private static final CountDownLatch klm = new CountDownLatch(1);
    private static boolean ikl = false;

    public static void ikl() {
        synchronized (lmn) {
            ikl = true;
        }
    }

    public static boolean klm() {
        boolean z4;
        synchronized (lmn) {
            z4 = ikl;
        }
        return z4;
    }

    public static CountDownLatch lmn() {
        return klm;
    }
}
