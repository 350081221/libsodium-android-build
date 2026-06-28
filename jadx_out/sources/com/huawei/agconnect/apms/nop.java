package com.huawei.agconnect.apms;

import android.os.FileObserver;
import com.huawei.agconnect.apms.log.AgentLog;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class nop extends lmn {
    public static nop ghi;
    public FileObserver efg = null;
    public long fgh = 0;

    /* loaded from: classes3.dex */
    public class abc extends FileObserver {
        public abc(String str, int i5) {
            super(str, i5);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i5, String str) {
            if (str == null) {
                return;
            }
            try {
                if (("/data/anr/" + str).contains("trace")) {
                    nop.this.bcd();
                }
            } catch (Exception e5) {
                AgentLog agentLog = lmn.cde;
                StringBuilder abc = com.huawei.agconnect.apms.abc.abc("failed to observer anr file, ");
                abc.append(e5.getMessage());
                agentLog.error(abc.toString());
            }
        }
    }

    public nop() {
        this.bcd = new HashSet();
    }

    public static synchronized nop cde() {
        nop nopVar;
        synchronized (nop.class) {
            if (ghi == null) {
                ghi = new nop();
            }
            nopVar = ghi;
        }
        return nopVar;
    }

    public final void bcd() {
        if (Agent.isDisabled()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.fgh < 15000 || !abc("")) {
            return;
        }
        this.fgh = currentTimeMillis;
    }

    public void abc(boolean z4) {
        if (Agent.isDisabled() || !z4) {
            lmn.cde.warn("APMS agent or anr monitor is disabled, please enable.");
        }
    }
}
