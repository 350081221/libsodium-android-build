package com.huawei.agconnect.apms;

import android.os.Looper;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.o0;

/* loaded from: classes3.dex */
public class m0 implements q0 {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public o0 abc = new o0();
    public l0 bcd;
    public g0 cde;
    public volatile boolean def;
    public boolean efg;

    public m0(c cVar, g0 g0Var) {
        l0 l0Var;
        this.cde = g0Var;
        if (g0Var == g0.APP_START) {
            l0Var = new l0(cVar, g0Var);
        } else {
            l0Var = new l0(cVar, g0Var);
            l0Var.def.abc(2);
        }
        this.bcd = l0Var;
        this.def = false;
        this.efg = false;
    }

    public void abc(j0 j0Var) {
        int ordinal = j0Var.ordinal();
        if (ordinal == 0) {
            if (!this.def) {
                bcd(j0Var);
            }
            this.efg = true;
        } else {
            if (ordinal != 1) {
                return;
            }
            if (!this.efg) {
                bcd(j0Var);
            }
            this.def = true;
        }
    }

    public void bcd(c cVar) {
        if (this.def) {
            return;
        }
        c abc = this.abc.abc();
        if (abc == null) {
            abc = this.abc.cde;
        }
        cVar.abc(abc.efg);
        abc.cde.add(cVar.efg);
        this.abc.abc(cVar, false);
    }

    public void cde(c cVar) {
        boolean z4;
        if (this.def || this.bcd == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            bcd(cVar);
            return;
        }
        c abc = this.abc.abc();
        if (abc != null) {
            cVar.abc(abc.efg);
            this.bcd.bcd.add(cVar.efg);
            AgentLog agentLog = fgh;
            StringBuilder abc2 = abc.abc("enterMethod, new node: ");
            abc2.append(cVar.efg);
            abc2.append(", metricName: ");
            abc2.append(cVar.def);
            agentLog.debug(abc2.toString());
            abc.cde.add(cVar.efg);
            this.abc.abc(cVar, true);
        }
    }

    public void abc() {
        c abc = this.abc.abc();
        if (abc == null) {
            return;
        }
        if (this.def && bcd()) {
            return;
        }
        abc(abc);
    }

    public final void abc(c cVar) {
        if (this.bcd == null) {
            return;
        }
        if (cVar.def.equals("pageLoading") && this.bcd.cde) {
            return;
        }
        cVar.bcd = System.currentTimeMillis();
        this.bcd.abc(cVar);
        o0 o0Var = this.abc;
        o0Var.abc.remove();
        o0.bcd<c> bcdVar = o0Var.bcd.get();
        if (bcdVar == null) {
            return;
        }
        c pop = bcdVar.pop();
        AgentLog agentLog = o0.def;
        StringBuilder abc = abc.abc("load stack node: ");
        abc.append(pop.efg);
        abc.append(", metricName: ");
        abc.append(pop.def);
        agentLog.debug(abc.toString());
        o0.bcd<c> bcdVar2 = o0Var.bcd.get();
        if (bcdVar2 != null && !bcdVar2.isEmpty()) {
            c peek = bcdVar2.peek();
            o0Var.abc.set(peek);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o0Var.cde = peek;
                return;
            }
            return;
        }
        o0Var.abc.set(null);
    }

    public final void bcd(j0 j0Var) {
        if (this.bcd == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        l0 l0Var = this.bcd;
        l0Var.ghi = currentTimeMillis;
        long abc = l0Var.abc();
        ghi.def().cde();
        if (abc >= a1.b.f90a) {
            c cVar = new c(j0Var.abc, i0.OTHER.abc);
            cVar.abc = currentTimeMillis;
            cde(cVar);
            abc();
            cVar.bcd = currentTimeMillis;
        }
    }

    public final boolean bcd() {
        l0 l0Var = this.bcd;
        if (l0Var == null) {
            return false;
        }
        if (this.cde == g0.PAGE_LOADING) {
            return l0Var.ghi > 0 && System.currentTimeMillis() - this.bcd.ghi >= 2000;
        }
        return (Looper.myLooper() == Looper.getMainLooper()) || System.currentTimeMillis() - this.bcd.ghi >= 2000;
    }
}
