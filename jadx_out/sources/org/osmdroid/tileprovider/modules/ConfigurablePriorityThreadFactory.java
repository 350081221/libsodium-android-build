package org.osmdroid.tileprovider.modules;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public class ConfigurablePriorityThreadFactory implements ThreadFactory {
    private final String mName;
    private final int mPriority;

    public ConfigurablePriorityThreadFactory(int i5, String str) {
        this.mPriority = i5;
        this.mName = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.mPriority);
        String str = this.mName;
        if (str != null) {
            thread.setName(str);
        }
        return thread;
    }
}
