package com.huawei.agconnect.apms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class pon implements onm {
    public final List<tsr> abc = new ArrayList();

    public void abc(tsr tsrVar) {
        if (tsrVar != null) {
            this.abc.add(tsrVar);
        }
    }

    @Override // com.huawei.agconnect.apms.onm
    public void flush() {
        Iterator<tsr> it = this.abc.iterator();
        while (it.hasNext()) {
            ((uts) it.next()).def.abc();
        }
    }

    @Override // com.huawei.agconnect.apms.onm
    public void release() {
        Iterator<tsr> it = this.abc.iterator();
        while (it.hasNext()) {
            ((uts) it.next()).def.bcd();
        }
        this.abc.clear();
    }

    @Override // com.huawei.agconnect.apms.onm
    public void abc(int i5, String str, String str2) {
        int i6;
        boolean z4;
        Iterator<tsr> it = this.abc.iterator();
        while (it.hasNext()) {
            vut vutVar = (vut) it.next();
            Iterator<rqp> it2 = vutVar.bcd.iterator();
            while (true) {
                i6 = 0;
                if (!it2.hasNext()) {
                    z4 = false;
                    break;
                } else {
                    z4 = true;
                    if (i5 < ((qpo) it2.next()).abc) {
                        break;
                    }
                }
            }
            if (!z4) {
                if (str2.length() <= vutVar.abc) {
                    vutVar.abc(i5, str, str2);
                } else {
                    int length = str2.length();
                    int i7 = vutVar.abc + 0;
                    while (i6 < length) {
                        vutVar.abc(i5, str, str2.substring(i6, i7));
                        i6 = i7;
                        i7 = Math.min(vutVar.abc + i7, length);
                    }
                }
            }
        }
    }

    @Override // com.huawei.agconnect.apms.onm
    public void abc(String str) {
        Iterator<tsr> it = this.abc.iterator();
        while (it.hasNext()) {
            ((uts) it.next()).def.abc(str);
        }
    }
}
