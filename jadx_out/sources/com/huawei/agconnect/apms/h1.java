package com.huawei.agconnect.apms;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import com.huawei.agconnect.apms.collect.model.event.interaction.ApplicationStartEvent;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.lang.ref.WeakReference;
import java.util.Random;

/* loaded from: classes3.dex */
public class h1 {
    public static final int[] hij;
    public static volatile h1 ijk;
    public long cde;
    public long def;
    public long efg;
    public long fgh;
    public long ghi;
    public long bcd = Agent.getCreateTime();
    public boolean abc = true;

    /* loaded from: classes3.dex */
    public static class bcd implements Runnable {
        public /* synthetic */ bcd(abc abcVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!x1.cde()) {
                return;
            }
            r1.def().abc();
            r1.def().cde();
        }
    }

    /* loaded from: classes3.dex */
    public static class cde implements Runnable {
        public final long abc;
        public final String bcd;
        public final String cde;
        public final long def;
        public final long efg;
        public final long fgh;

        public cde(long j5, String str, String str2, long j6, long j7, long j8) {
            this.abc = j5;
            this.bcd = str;
            this.cde = str2;
            this.def = j6;
            this.efg = j7;
            this.fgh = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            yza.abc(new ApplicationStartEvent(this.abc, this.bcd, this.cde, this.def, -1L, -1L, this.efg, this.fgh));
        }
    }

    static {
        AgentLogManager.getAgentLog();
        hij = new int[]{0, 10, 20, 30, 40, 50};
    }

    public static h1 fgh() {
        if (ijk == null) {
            synchronized (h1.class) {
                if (ijk == null) {
                    ijk = new h1();
                }
            }
        }
        return ijk;
    }

    public final void abc(long j5, String str, String str2, long j6, long j7, long j8) {
        if (ghi.def().abc.getBoolean("activity_instrument_enabled", true)) {
            return;
        }
        if (j6 > 0 && j6 < uvw.bcd().fgh) {
            Agent.getExecutor().execute(new cde(j5, str, str2, j6, j7, j8));
        }
    }

    public void bcd(WeakReference<Activity> weakReference) {
        this.cde = System.currentTimeMillis();
        if (weakReference == null || weakReference.get() == null || Build.VERSION.SDK_INT > 28) {
            return;
        }
        def();
        Activity activity = weakReference.get();
        if (Agent.isDisabled()) {
            efg();
            return;
        }
        String abc2 = abc(activity);
        long j5 = this.bcd;
        if (j5 != 0) {
            abc(j5, abc2, "cold_start", this.cde - j5, -1L, -1L);
        } else {
            long j6 = this.fgh;
            if (j6 != 0 && this.abc) {
                abc(j6, abc2, "hot_start", this.cde - j6, -1L, -1L);
            }
        }
        efg();
    }

    public void cde() {
        this.efg = System.currentTimeMillis();
    }

    public final void def() {
        if (this.bcd == 0 || !r1.def().cde) {
            return;
        }
        new Handler().postDelayed(new bcd(null), hij[new Random().nextInt(6)] * 1000);
    }

    public final void efg() {
        this.bcd = 0L;
        this.cde = 0L;
        this.def = 0L;
        this.efg = 0L;
        this.fgh = 0L;
        this.ghi = 0L;
    }

    public void abc(WeakReference<Activity> weakReference) {
        this.def = System.currentTimeMillis();
        if (weakReference == null || weakReference.get() == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        def();
        Activity activity = weakReference.get();
        if (Agent.isDisabled()) {
            efg();
            return;
        }
        String abc2 = abc(activity);
        long j5 = this.bcd;
        if (j5 != 0) {
            long j6 = this.def;
            long j7 = this.ghi;
            abc(j5, abc2, "cold_start", j6 - j5, j7 - j5, j6 - j7);
        } else {
            long j8 = this.efg;
            if (j8 != 0 && this.abc) {
                long j9 = this.def;
                long j10 = this.ghi;
                abc(j8, abc2, "hot_start", j9 - j8, j10 - j8, j9 - j10);
            }
        }
        efg();
    }

    public void bcd() {
        this.ghi = System.currentTimeMillis();
    }

    public void abc() {
        this.fgh = System.currentTimeMillis();
        this.abc = ApplicationStateMonitor.getInstance().isAppInBackground();
    }

    public final String abc(Activity activity) {
        return activity.getClass().getSimpleName().length() != 0 ? activity.getClass().getSimpleName() : "";
    }
}
