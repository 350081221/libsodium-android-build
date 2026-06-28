package com.lody.virtual.helper.utils;

import android.os.Handler;

/* loaded from: classes3.dex */
public abstract class SchedulerTask implements Runnable {
    private long mDelay;
    private Handler mHandler;
    private final Runnable mInnerRunnable = new Runnable() { // from class: com.lody.virtual.helper.utils.SchedulerTask.1
        @Override // java.lang.Runnable
        public void run() {
            SchedulerTask.this.run();
            if (SchedulerTask.this.mDelay > 0) {
                SchedulerTask.this.mHandler.postDelayed(this, SchedulerTask.this.mDelay);
            }
        }
    };

    public SchedulerTask(Handler handler, long j5) {
        this.mHandler = handler;
        this.mDelay = j5;
    }

    public void cancel() {
        this.mHandler.removeCallbacks(this.mInnerRunnable);
    }

    public void schedule() {
        this.mHandler.post(this.mInnerRunnable);
    }
}
