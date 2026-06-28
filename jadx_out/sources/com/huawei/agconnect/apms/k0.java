package com.huawei.agconnect.apms;

import android.os.Looper;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* loaded from: classes3.dex */
public class k0 {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public n0 abc = new n0();

    public void abc() {
        this.abc.abc();
    }

    public void bcd(String str, String str2) {
        this.abc.abc(g0.PAGE_LOADING);
        n0 n0Var = this.abc;
        c cVar = new c(str + str2, i0.OTHER.abc);
        m0 m0Var = n0Var.abc;
        if (m0Var != null) {
            m0Var.cde(cVar);
        }
        abc(str);
    }

    public void cde() {
        this.abc.abc();
    }

    public void abc(String str, String str2) {
        n0 n0Var = this.abc;
        c cVar = new c(str + str2, i0.OTHER.abc);
        m0 m0Var = n0Var.abc;
        if (m0Var == null) {
            return;
        }
        m0Var.cde(cVar);
    }

    public void cde(String str, String str2) {
        n0 n0Var = this.abc;
        c cVar = new c(str + str2, i0.OTHER.abc);
        m0 m0Var = n0Var.abc;
        if (m0Var == null) {
            return;
        }
        m0Var.cde(cVar);
    }

    public void abc(String str) {
        try {
            Looper.myQueue().addIdleHandler(r0.abc(str, this.abc.abc));
        } catch (Exception e5) {
            AgentLog agentLog = bcd;
            StringBuilder abc = abc.abc("Looper.myQueue().addIdleHandler has an error, ");
            abc.append(e5.getMessage());
            agentLog.warn(abc.toString());
        }
    }

    public l0 bcd() {
        this.abc.abc();
        return this.abc.bcd();
    }
}
