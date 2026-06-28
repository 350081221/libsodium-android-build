package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d1 {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public static d1 ghi;
    public ScheduledExecutorService abc;
    public Runtime bcd;
    public ScheduledFuture cde;
    public long def;
    public ConcurrentLinkedQueue<f1> efg;

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public abc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.efg.offer(d1.abc(d1.this, System.currentTimeMillis()));
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements Runnable {
        public bcd() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.efg.offer(d1.abc(d1.this, System.currentTimeMillis()));
        }
    }

    public d1() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("MemoryCollector"));
        Runtime runtime = Runtime.getRuntime();
        this.cde = null;
        this.def = -1L;
        this.abc = newSingleThreadScheduledExecutor;
        this.bcd = runtime;
        this.efg = new ConcurrentLinkedQueue<>();
    }

    public static boolean cde(int i5) {
        return i5 <= 0;
    }

    public void abc(int i5) {
        if (cde(i5)) {
            return;
        }
        if (this.cde != null) {
            if (i5 == this.def) {
                return;
            } else {
                abc();
            }
        }
        bcd(i5);
    }

    public final synchronized void bcd(int i5) {
        long j5 = i5;
        this.def = j5;
        try {
            this.cde = this.abc.scheduleAtFixedRate(new abc(), 0L, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            fgh.warn(String.format(Locale.ENGLISH, "unable to start collecting memory metrics: %s", e5.getMessage()));
        }
    }

    public final synchronized void bcd() {
        try {
            this.abc.schedule(new bcd(), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            fgh.warn(String.format(Locale.ENGLISH, "unable to start collecting memory metrics: %s", e5.getMessage()));
        }
    }

    public void abc() {
        ScheduledFuture scheduledFuture = this.cde;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.cde = null;
        this.def = -1L;
    }

    public static /* synthetic */ f1 abc(d1 d1Var, long j5) {
        return new f1(j5, d1Var.bcd.totalMemory() - d1Var.bcd.freeMemory(), d1Var.bcd.maxMemory());
    }
}
