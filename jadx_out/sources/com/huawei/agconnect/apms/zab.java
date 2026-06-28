package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class zab implements Runnable {
    public static final AgentLog hij = AgentLogManager.getAgentLog();
    public final zyx def;
    public long efg;
    public final ScheduledExecutorService abc = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("Collector"));
    public ScheduledFuture bcd = null;
    public long cde = OpenStreetMapTileProviderConstants.ONE_MINUTE;
    public Lock ghi = new ReentrantLock();
    public long fgh = 0;

    /* loaded from: classes3.dex */
    public static class abc implements Runnable {
        public zab abc;

        public abc(zab zabVar) {
            this.abc = zabVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.abc.def();
            HiAnalyticsManager.getInstance().onReport();
        }
    }

    public zab(zyx zyxVar) {
        this.def = zyxVar;
    }

    public void bcd() {
        boolean z4;
        if (ApplicationStateMonitor.getInstance().isAppInBackground()) {
            hij.debug("collector will start when app in foreground.");
            return;
        }
        if (this.bcd != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        if (this.cde <= 0) {
            hij.error("refusing to start with period 0 ms.");
            return;
        }
        AgentLog agentLog = hij;
        StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("starting collector with period ");
        abc2.append(this.cde);
        abc2.append("ms.");
        agentLog.debug(abc2.toString());
        this.fgh = System.currentTimeMillis();
        try {
            this.bcd = this.abc.scheduleAtFixedRate(this, 0L, this.cde, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            hij.error("reporter timer started failed. message: " + th);
        }
        this.def.ijk();
    }

    public void cde() {
        boolean z4;
        if (this.bcd != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return;
        }
        abc();
        hij.debug("collector stopped.");
        this.fgh = 0L;
        this.def.jkl();
    }

    public final void def() {
        boolean z4;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (ApplicationStateMonitor.getInstance().isAppInBackground()) {
                hij.info("skipping collection while app in background.");
            } else {
                this.def.bcd();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while executing collect: "), hij);
        }
        if (4 == this.def.abc) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            cde();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        hij.debug("tick took " + currentTimeMillis2 + "ms.");
    }

    public final void efg() {
        long currentTimeMillis;
        if (this.efg == 0) {
            currentTimeMillis = -1;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.efg;
        }
        if (1000 + currentTimeMillis < this.cde && currentTimeMillis != -1) {
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            def();
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred when tick: "), hij);
        }
        this.efg = currentTimeMillis2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.ghi.lock();
            efg();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void abc() {
        try {
            this.ghi.lock();
            ScheduledFuture scheduledFuture = this.bcd;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.bcd = null;
            }
        } finally {
            this.ghi.unlock();
        }
    }
}
