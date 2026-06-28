package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.resource.CPUMemoryEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import com.huawei.agconnect.apms.util.Session;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class e1 {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public static e1 ghi;
    public c1 bcd;
    public d1 cde;
    public ScheduledExecutorService abc = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("ResourceManager"));
    public Session def = null;
    public ScheduledFuture efg = null;

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public abc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1 e1Var = e1.this;
            e1Var.abc(e1Var.def);
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements Runnable {
        public final /* synthetic */ Session abc;

        public bcd(Session session) {
            this.abc = session;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.abc(this.abc);
        }
    }

    public e1() {
        if (c1.ijk == null) {
            c1.ijk = new c1();
        }
        this.bcd = c1.ijk;
        if (d1.ghi == null) {
            d1.ghi = new d1();
        }
        this.cde = d1.ghi;
    }

    public static synchronized e1 cde() {
        e1 e1Var;
        synchronized (e1.class) {
            if (ghi == null) {
                ghi = new e1();
            }
            e1Var = ghi;
        }
        return e1Var;
    }

    public void bcd() {
        if (this.def == null) {
            return;
        }
        this.bcd.abc();
        this.cde.abc();
        ScheduledFuture scheduledFuture = this.efg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.abc.schedule(new bcd(this.def), 20L, TimeUnit.MILLISECONDS);
        this.def = null;
    }

    public void abc(Session session, boolean z4) {
        if (Agent.isDisabled()) {
            return;
        }
        if (this.def != null) {
            bcd();
        }
        if (z4) {
            fgh.debug("stop report cpu and memory metrics when in background.");
            return;
        }
        ghi def = ghi.def();
        int i5 = def.abc.getInt("collect_cpu_frequency_fg_ms", 100);
        if (!def.abc(i5)) {
            i5 = 0;
        }
        if (c1.bcd(i5)) {
            i5 = -1;
        }
        if (i5 > 0) {
            c1 c1Var = this.bcd;
            if (c1Var.efg > 0 && !c1.bcd(i5)) {
                if (c1Var.bcd != null) {
                    if (i5 != c1Var.cde) {
                        c1Var.abc();
                    }
                }
                c1Var.abc(i5);
            }
        } else {
            fgh.debug(String.format(Locale.ENGLISH, "invalid cpu metrics collection frequency-%d. Did not report cpu metrics.", Integer.valueOf(i5)));
        }
        ghi def2 = ghi.def();
        int i6 = def2.abc.getInt("collect_memory_frequency_fg_ms", 100);
        if (!def2.abc(i6)) {
            i6 = 0;
        }
        int i7 = d1.cde(i6) ? -1 : i6;
        if (i7 > 0) {
            this.cde.abc(i7);
        } else {
            fgh.debug(String.format(Locale.ENGLISH, "invalid memory metrics collection frequency-%d. Did not report memory metrics.", Integer.valueOf(i7)));
        }
        if (i5 != -1) {
            i7 = Math.min(i5, i7);
        }
        long j5 = i7;
        if (j5 == -1) {
            fgh.warn("invalid resource collection frequency. Unable to start collecting resource metrics.");
            return;
        }
        this.def = session;
        try {
            long j6 = j5 * 20;
            this.efg = this.abc.scheduleAtFixedRate(new abc(), j6, j6, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            fgh.error(String.format(Locale.ENGLISH, "unable to start collecting metrics: %s", e5.getMessage()));
        }
    }

    public final void abc(Session session) {
        CPUMemoryEvent cPUMemoryEvent = new CPUMemoryEvent();
        cPUMemoryEvent.addSession(session);
        cPUMemoryEvent.setTimestamp(System.currentTimeMillis());
        while (!this.bcd.fgh.isEmpty()) {
            cPUMemoryEvent.getCpuResourceList().add(this.bcd.fgh.poll());
        }
        while (!this.cde.efg.isEmpty()) {
            cPUMemoryEvent.getAppMemoryResourceList().add(this.cde.efg.poll());
        }
        yza.abc(cPUMemoryEvent);
    }

    public void abc() {
        c1 c1Var = this.bcd;
        if (c1Var != null) {
            c1Var.bcd();
        }
        d1 d1Var = this.cde;
        if (d1Var != null) {
            d1Var.bcd();
        }
    }
}
