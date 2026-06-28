package com.huawei.agconnect.apms;

import android.app.Activity;
import android.os.Build;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateEvent;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateListener;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class s1 implements ApplicationStateListener {
    public static final AgentLog mno = AgentLogManager.getAgentLog();
    public static volatile s1 nop;
    public long fgh;
    public long ghi;
    public long hij;
    public long ijk;
    public long jkl;
    public long klm;
    public long lmn;
    public int cde = 0;
    public int def = 0;
    public int efg = 0;
    public n1 abc = new n1();
    public WeakHashMap<Activity, Long> bcd = new WeakHashMap<>();

    /* loaded from: classes3.dex */
    public static class abc implements Runnable {
        public long abc;
        public String bcd;
        public String cde;
        public long def;
        public long efg;
        public long fgh;

        public abc(long j5, String str, String str2, long j6, long j7, long j8) {
            this.abc = j5;
            this.bcd = str;
            this.cde = str2;
            this.def = j6;
            this.efg = j7;
            this.fgh = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            yza.abc(new ActivityLoadEvent(this.abc, this.bcd, this.cde, this.def, this.efg, this.fgh));
        }
    }

    public s1() {
        ApplicationStateMonitor.getInstance().addApplicationStateListener(this);
    }

    public static s1 efg() {
        if (nop == null) {
            synchronized (s1.class) {
                if (nop == null) {
                    nop = new s1();
                }
            }
        }
        return nop;
    }

    public final void abc(long j5, String str, String str2, long j6, long j7, long j8) {
        Agent.getExecutor().execute(new abc(j5, str, str2, j6, j7, j8));
    }

    @Override // com.huawei.agconnect.apms.lifestyle.ApplicationStateListener
    public void applicationBackgrounded(ApplicationStateEvent applicationStateEvent) {
        this.klm = System.currentTimeMillis();
        AgentLog agentLog = mno;
        StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("backgroundStartTime: ");
        abc2.append(this.klm);
        agentLog.debug(abc2.toString());
        abc(ForeAndBackgroundEvent.FOREGROUND, this.lmn, this.klm);
    }

    @Override // com.huawei.agconnect.apms.lifestyle.ApplicationStateListener
    public void applicationForegrounded(ApplicationStateEvent applicationStateEvent) {
        this.lmn = System.currentTimeMillis();
        AgentLog agentLog = mno;
        StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("foregroundStartTime: ");
        abc2.append(this.lmn);
        agentLog.debug(abc2.toString());
        abc(ForeAndBackgroundEvent.BACKGROUND, this.klm, this.lmn);
    }

    public void bcd(WeakReference<Activity> weakReference) {
        this.hij = System.currentTimeMillis();
        if (weakReference == null || weakReference.get() == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Activity activity = weakReference.get();
        if (Agent.isDisabled() || this.ijk == 0) {
            return;
        }
        String abc2 = abc(activity);
        long j5 = this.hij;
        long j6 = this.ijk;
        long j7 = this.fgh;
        abc(j6, abc2, ActivityLoadEvent.LoadType.COLD_LOAD, j5 - j6, j7 - j6, j5 - j7);
        def();
    }

    public void cde() {
        this.fgh = System.currentTimeMillis();
    }

    public final void def() {
        this.ijk = 0L;
        this.jkl = 0L;
    }

    public void abc(WeakReference<Activity> weakReference) {
        this.ghi = System.currentTimeMillis();
        if (weakReference == null || weakReference.get() == null || Build.VERSION.SDK_INT > 28) {
            return;
        }
        Activity activity = weakReference.get();
        if (Agent.isDisabled() || this.jkl == 0) {
            return;
        }
        String abc2 = abc(activity);
        long j5 = this.ghi;
        long j6 = this.jkl;
        abc(j6, abc2, ActivityLoadEvent.LoadType.COLD_LOAD, j5 - j6, -1L, -1L);
        def();
    }

    public void abc() {
        this.jkl = System.currentTimeMillis();
    }

    public void bcd() {
        this.ijk = System.currentTimeMillis();
    }

    public final String abc(Activity activity) {
        return (activity == null || activity.getClass().getSimpleName().length() == 0) ? "" : activity.getClass().getSimpleName();
    }

    public final boolean bcd(Activity activity) {
        return (activity == null || activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    public final void abc(String str, long j5, long j6) {
        if (!Agent.isDisabled() && j5 > 0 && j6 > 0) {
            long j7 = j6 - j5;
            if (j7 <= 0) {
                return;
            }
            yza.abc(new ForeAndBackgroundEvent(j5, str, j7));
        }
    }
}
