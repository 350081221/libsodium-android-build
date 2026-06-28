package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.lifestyle.ApplicationStateEvent;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateListener;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import com.huawei.agconnect.apms.util.Session;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class v1 extends vwx implements ApplicationStateListener {
    public static volatile v1 def;
    public e1 cde = e1.cde();
    public Session abc = Session.getInstance();
    public final Set<u1> bcd = new HashSet();

    public static v1 jkl() {
        if (def == null) {
            synchronized (v1.class) {
                if (def == null) {
                    def = new v1();
                }
            }
        }
        return def;
    }

    public void abc(u1 u1Var) {
        synchronized (this.bcd) {
            this.bcd.add(u1Var);
        }
    }

    @Override // com.huawei.agconnect.apms.lifestyle.ApplicationStateListener
    public void applicationBackgrounded(ApplicationStateEvent applicationStateEvent) {
        if (this.abc.isExpired()) {
            bcd(true);
        } else {
            abc(true);
        }
    }

    @Override // com.huawei.agconnect.apms.lifestyle.ApplicationStateListener
    public void applicationForegrounded(ApplicationStateEvent applicationStateEvent) {
        bcd(false);
    }

    public void bcd(u1 u1Var) {
        synchronized (this.bcd) {
            this.bcd.remove(u1Var);
        }
    }

    public final void abc(boolean z4) {
        if (this.abc.isSampled()) {
            this.cde.abc(this.abc, z4);
        } else {
            this.cde.bcd();
        }
    }

    @Override // com.huawei.agconnect.apms.vwx, com.huawei.agconnect.apms.xyz
    public void bcd() {
        if (this.abc.isExpired()) {
            bcd(ApplicationStateMonitor.getInstance().isAppInBackground());
        }
    }

    public void bcd(boolean z4) {
        if (Agent.isDisabled()) {
            return;
        }
        this.abc = Session.getInstance();
        synchronized (this.bcd) {
            for (u1 u1Var : this.bcd) {
                if (u1Var != null) {
                    u1Var.addNewSession(this.abc);
                }
            }
        }
        abc(z4);
    }
}
