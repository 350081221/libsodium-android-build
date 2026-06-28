package com.lody.virtual.client.core;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lody.virtual.client.env.VirtualRuntime;

/* loaded from: classes3.dex */
public class ANRWatchDog extends Thread {
    private static final int ANR_TIMEOUT = 5000;
    private static final int MESSAGE_WATCHDOG_TIME_TICK = 0;
    private static int lastTimeTick = -1;
    private static int timeTick;
    private boolean makeCrash;

    @SuppressLint({"HandlerLeak"})
    private final Handler watchDogHandler;

    /* loaded from: classes3.dex */
    public static class ANRException extends RuntimeException {
        public ANRException() {
            super("========= ANR =========" + getAnrDesc());
            setStackTrace(Looper.getMainLooper().getThread().getStackTrace());
        }

        private static String getAnrDesc() {
            return VirtualCore.get().isVAppProcess() ? VirtualRuntime.getProcessName() : VirtualCore.get().getProcessName();
        }
    }

    public ANRWatchDog(boolean z4) {
        this.watchDogHandler = new Handler() { // from class: com.lody.virtual.client.core.ANRWatchDog.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ANRWatchDog.access$008();
                ANRWatchDog.timeTick %= Integer.MAX_VALUE;
            }
        };
        this.makeCrash = z4;
    }

    static /* synthetic */ int access$008() {
        int i5 = timeTick;
        timeTick = i5 + 1;
        return i5;
    }

    private void triggerANR() {
        if (this.makeCrash) {
            throw new ANRException();
        }
        try {
            throw new ANRException();
        } catch (ANRException e5) {
            e5.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            this.watchDogHandler.sendEmptyMessage(0);
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            int i5 = timeTick;
            if (i5 == lastTimeTick) {
                triggerANR();
            } else {
                lastTimeTick = i5;
            }
        }
    }

    public ANRWatchDog() {
        this(false);
    }
}
