package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.interaction.PageLoadEvent;

/* loaded from: classes3.dex */
public class u0 extends k0 {
    public String cde;

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public final /* synthetic */ l0 abc;

        public abc(l0 l0Var) {
            this.abc = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            yza.abc(new PageLoadEvent(u0.this.cde, this.abc));
        }
    }

    @Override // com.huawei.agconnect.apms.k0
    public l0 bcd() {
        l0 bcd = super.bcd();
        if (bcd == null) {
            return null;
        }
        Agent.getExecutor().execute(new abc(bcd));
        return bcd;
    }

    @Override // com.huawei.agconnect.apms.k0
    public void cde(String str, String str2) {
        super.cde(str, str2);
        this.cde = str;
    }
}
