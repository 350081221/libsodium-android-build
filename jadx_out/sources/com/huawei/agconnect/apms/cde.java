package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;

/* loaded from: classes3.dex */
public class cde implements Runnable {
    public cde(def defVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        ApplicationStateMonitor.getInstance().addApplicationStateListener(v1.jkl());
    }
}
