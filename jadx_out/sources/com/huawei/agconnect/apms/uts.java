package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.hilog.HiLogAbility;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class uts extends vut {
    public final HiLogAbility def;
    public srq efg;

    /* loaded from: classes3.dex */
    public static class abc {
        public String abc;
        public String bcd;
        public int cde = 2;
        public int def = 4096;
        public final List<rqp> efg = new ArrayList();
        public srq fgh;
        public boolean ghi;
    }

    public uts(abc abcVar) {
        this.def = new HiLogAbility(abcVar.abc, abcVar.def, abcVar.bcd, abcVar.ghi);
        this.cde.abc = abcVar.cde;
        List<rqp> list = abcVar.efg;
        if (list != null) {
            for (rqp rqpVar : list) {
                if (rqpVar != null) {
                    this.bcd.add(rqpVar);
                }
            }
        }
        srq srqVar = abcVar.fgh;
        if (srqVar != null) {
            this.efg = srqVar;
        }
    }

    @Override // com.huawei.agconnect.apms.vut
    public void abc(int i5, String str, String str2) {
        this.def.bcd(this.efg.abc(i5, str, str2));
    }
}
