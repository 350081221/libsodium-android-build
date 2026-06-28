package com.lody.virtual.client.hook.proxies.location;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
class GPSStatusListenerThread extends TimerTask {
    private static GPSStatusListenerThread INSTANCE = new GPSStatusListenerThread();
    private boolean isRunning = false;
    private Map<Object, Long> listeners = new HashMap();
    private Timer timer = new Timer();

    private GPSStatusListenerThread() {
    }

    public static GPSStatusListenerThread get() {
        return INSTANCE;
    }

    public void addListenerTransport(Object obj) {
        if (!this.isRunning) {
            synchronized (this) {
                if (!this.isRunning) {
                    this.isRunning = true;
                    this.timer.schedule(this, 100L, 800L);
                }
            }
        }
        this.listeners.put(obj, Long.valueOf(System.currentTimeMillis()));
    }

    public void removeListenerTransport(Object obj) {
        if (obj != null) {
            this.listeners.remove(obj);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (!this.listeners.isEmpty()) {
            Iterator<Map.Entry<Object, Long>> it = this.listeners.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Object key = it.next().getKey();
                    MockLocationHelper.invokeSvStatusChanged(key);
                    MockLocationHelper.invokeNmeaReceived(key);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void stop() {
        this.timer.cancel();
    }
}
