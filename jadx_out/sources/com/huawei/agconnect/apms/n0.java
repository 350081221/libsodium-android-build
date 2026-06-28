package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.agconnect.apms.o0;

/* loaded from: classes3.dex */
public class n0 implements b {
    public m0 abc;

    public void abc(g0 g0Var) {
        String str = g0Var.abc;
        m0.fgh.debug("start trace: " + str);
        c cVar = new c(str);
        m0 m0Var = new m0(cVar, g0Var);
        m0Var.abc.abc(cVar, true);
        this.abc = m0Var;
        TraceManager.addListener(this);
    }

    public l0 bcd() {
        if (this.abc == null) {
            return null;
        }
        TraceManager.clearListener();
        m0 m0Var = this.abc;
        if (m0Var.bcd == null) {
            return null;
        }
        if (m0Var.cde == g0.APP_START) {
            m0Var.def = true;
        }
        o0 o0Var = m0Var.abc;
        if (o0Var != null) {
            o0Var.abc.remove();
            o0.bcd<c> bcdVar = o0Var.bcd.get();
            if (bcdVar != null) {
                bcdVar.clear();
            }
        }
        l0 l0Var = m0Var.bcd;
        if (l0Var.cde) {
            return null;
        }
        l0Var.cde = true;
        l0Var.def.abc(System.currentTimeMillis());
        l0Var.ghi = l0Var.def.bcd;
        return l0Var;
    }

    public void abc() {
        m0 m0Var = this.abc;
        if (m0Var == null) {
            return;
        }
        m0Var.abc();
    }
}
