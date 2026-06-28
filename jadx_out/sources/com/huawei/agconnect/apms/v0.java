package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.event.interaction.ApplicationStartEvent;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* loaded from: classes3.dex */
public class v0 {
    public static final AgentLog mno = AgentLogManager.getAgentLog();
    public static volatile v0 nop;
    public String bcd;
    public long efg;
    public long fgh;
    public long ghi;
    public long hij;
    public long ijk;
    public long jkl;
    public long klm;
    public long lmn;
    public n0 abc = new n0();
    public long cde = Agent.getCreateTime();
    public long def = Agent.getCreateTime();

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public final /* synthetic */ long abc;
        public final /* synthetic */ String bcd;
        public final /* synthetic */ String cde;
        public final /* synthetic */ long def;
        public final /* synthetic */ long efg;
        public final /* synthetic */ long fgh;
        public final /* synthetic */ long ghi;
        public final /* synthetic */ long hij;

        public abc(long j5, String str, String str2, long j6, long j7, long j8, long j9, long j10) {
            this.abc = j5;
            this.bcd = str;
            this.cde = str2;
            this.def = j6;
            this.efg = j7;
            this.fgh = j8;
            this.ghi = j9;
            this.hij = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationStartEvent applicationStartEvent;
            l0 bcd;
            ApplicationStartEvent applicationStartEvent2 = new ApplicationStartEvent(this.abc, this.bcd, this.cde, this.def, this.efg, this.fgh, this.ghi, this.hij);
            if (AppInstrumentation.selfApplication && (bcd = v0.this.abc.bcd()) != null) {
                applicationStartEvent = applicationStartEvent2;
                applicationStartEvent.setPageLoadInfo(bcd);
            } else {
                applicationStartEvent = applicationStartEvent2;
            }
            yza.abc(applicationStartEvent);
        }
    }

    public static v0 ijk() {
        if (nop == null) {
            synchronized (v0.class) {
                if (nop == null) {
                    nop = new v0();
                }
            }
        }
        return nop;
    }

    public final String abc(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getApplicationInfo().className;
        } catch (Throwable unused) {
            mno.error("getApplicationClassName fail");
            return "";
        }
    }

    public void bcd(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        this.efg = currentTimeMillis;
        this.cde = currentTimeMillis;
        this.abc.abc(g0.APP_START);
        String abc2 = abc(context);
        n0 n0Var = this.abc;
        c cVar = new c(abc2 + str, i0.OTHER.abc);
        m0 m0Var = n0Var.abc;
        if (m0Var == null) {
            return;
        }
        m0Var.cde(cVar);
    }

    public void cde() {
        System.currentTimeMillis();
        if (AppInstrumentation.selfApplication) {
            this.abc.abc();
        }
    }

    public void def() {
        this.ghi = System.currentTimeMillis();
        this.abc.abc();
    }

    public void efg() {
        this.fgh = System.currentTimeMillis();
        this.abc.abc();
    }

    public final long fgh() {
        if (AppInstrumentation.selfApplication) {
            long j5 = this.efg;
            if (0 != j5) {
                return this.lmn - j5;
            }
        } else if (0 != this.def) {
            return this.lmn - this.cde;
        }
        long j6 = this.hij;
        if (0 == j6) {
            return this.lmn - this.jkl;
        }
        return this.lmn - j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ghi() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.v0.ghi():void");
    }

    public final void hij() {
        this.def = 0L;
        this.cde = 0L;
        this.efg = 0L;
        this.fgh = 0L;
        this.ghi = 0L;
        this.hij = 0L;
        this.ijk = 0L;
        this.lmn = 0L;
        this.jkl = 0L;
        this.klm = 0L;
    }

    public void abc(Context context, String str) {
        System.currentTimeMillis();
        String abc2 = abc(context);
        n0 n0Var = this.abc;
        c cVar = new c(abc2 + str, i0.OTHER.abc);
        m0 m0Var = n0Var.abc;
        if (m0Var == null) {
            return;
        }
        m0Var.cde(cVar);
    }

    public void def(String str, String str2) {
        System.currentTimeMillis();
        if (AppInstrumentation.selfApplication) {
            n0 n0Var = this.abc;
            c cVar = new c(str + str2, i0.OTHER.abc);
            m0 m0Var = n0Var.abc;
            if (m0Var == null) {
                return;
            }
            m0Var.cde(cVar);
        }
    }

    public void cde(String str, String str2) {
        this.bcd = str;
        System.currentTimeMillis();
        if (AppInstrumentation.selfApplication) {
            n0 n0Var = this.abc;
            c cVar = new c(str + str2, i0.OTHER.abc);
            m0 m0Var = n0Var.abc;
            if (m0Var == null) {
                return;
            }
            m0Var.cde(cVar);
        }
    }

    public void abc(String str, String str2) {
        this.hij = System.currentTimeMillis();
        if (!AppInstrumentation.selfApplication) {
            if (0 == this.cde) {
                this.cde = this.hij;
                return;
            }
            return;
        }
        if (0 == this.efg) {
            this.cde = this.hij;
            this.abc.abc(g0.APP_START);
        }
        n0 n0Var = this.abc;
        c cVar = new c(str + str2, i0.OTHER.abc);
        m0 m0Var = n0Var.abc;
        if (m0Var == null) {
            return;
        }
        m0Var.cde(cVar);
    }

    public void bcd(String str, String str2) {
        if (0 != this.jkl) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.jkl = currentTimeMillis;
        this.cde = currentTimeMillis;
        if (AppInstrumentation.selfApplication) {
            this.abc.abc(g0.APP_START);
            n0 n0Var = this.abc;
            c cVar = new c(str + str2, i0.OTHER.abc);
            m0 m0Var = n0Var.abc;
            if (m0Var == null) {
                return;
            }
            m0Var.cde(cVar);
        }
    }

    public void bcd() {
        try {
            try {
                if (AppInstrumentation.selfApplication) {
                    this.abc.abc();
                }
                ghi();
            } catch (Exception e5) {
                mno.warn("application trace error: " + e5.getMessage());
            }
        } finally {
            AppInstrumentation.isBackground = false;
            hij();
        }
    }

    public void abc() {
        this.ijk = System.currentTimeMillis();
        if (AppInstrumentation.selfApplication) {
            this.abc.abc();
        }
    }
}
