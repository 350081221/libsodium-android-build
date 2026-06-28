package com.huawei.agconnect.apms.lifestyle;

import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class ApplicationStateMonitor {
    public static ApplicationStateMonitor instance;
    public final Set<ApplicationStateListener> applicationStateListeners = new HashSet();
    public AtomicBoolean foregrounded = new AtomicBoolean(false);
    public AtomicLong activityCount = new AtomicLong(0);
    public ExecutorService executor = Executors.newSingleThreadExecutor(new NamedThreadFactory("AppStateMonitor"));

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public abc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApplicationStateMonitor.this.foregrounded.get()) {
                ApplicationStateMonitor.this.notifyApplicationInBackground();
                ApplicationStateMonitor.this.foregrounded.set(false);
                AppInstrumentation.isBackground = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements Runnable {
        public bcd() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApplicationStateMonitor.this.activityCount.incrementAndGet() == 1 && !ApplicationStateMonitor.this.foregrounded.get()) {
                ApplicationStateMonitor.this.foregrounded.set(true);
                ApplicationStateMonitor.this.notifyApplicationInForeground();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class cde implements Runnable {
        public cde() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApplicationStateMonitor.this.activityCount.decrementAndGet() == 0) {
                ApplicationStateMonitor.this.uiHidden();
            }
        }
    }

    public static ApplicationStateMonitor getInstance() {
        if (instance == null) {
            setInstance(new ApplicationStateMonitor());
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyApplicationInBackground() {
        HashSet hashSet;
        synchronized (this.applicationStateListeners) {
            hashSet = new HashSet(this.applicationStateListeners);
        }
        ApplicationStateEvent applicationStateEvent = new ApplicationStateEvent(this);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ApplicationStateListener) it.next()).applicationBackgrounded(applicationStateEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyApplicationInForeground() {
        HashSet hashSet;
        synchronized (this.applicationStateListeners) {
            hashSet = new HashSet(this.applicationStateListeners);
        }
        ApplicationStateEvent applicationStateEvent = new ApplicationStateEvent(this);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ApplicationStateListener) it.next()).applicationForegrounded(applicationStateEvent);
        }
    }

    public static void setInstance(ApplicationStateMonitor applicationStateMonitor) {
        instance = applicationStateMonitor;
    }

    public void activityStarted() {
        this.executor.execute(new bcd());
    }

    public void activityStopped() {
        this.executor.execute(new cde());
    }

    public void addApplicationStateListener(ApplicationStateListener applicationStateListener) {
        synchronized (this.applicationStateListeners) {
            this.applicationStateListeners.add(applicationStateListener);
        }
    }

    public boolean isAppInBackground() {
        return !this.foregrounded.get();
    }

    public void uiHidden() {
        this.executor.execute(new abc());
    }
}
