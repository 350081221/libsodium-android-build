package com.huawei.hms.analytics;

import com.huawei.hms.analytics.bx;

/* loaded from: classes3.dex */
public final class ci implements Runnable {
    private final String lmn;

    /* loaded from: classes3.dex */
    public static class lmn implements bx.lmn {
        @Override // com.huawei.hms.analytics.bx.lmn
        public final void lmn() {
            bh lmn = fgh.lmn().lmn("_openness_config_tag");
            bh lmn2 = fgh.lmn().lmn("AGC_TAG");
            if (lmn != null) {
                lmn.lmn();
            }
            if (lmn2 != null) {
                lmn2.lmn();
            }
        }
    }

    public ci(String str) {
        this.lmn = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bx bxVar = new bx(this.lmn);
        bxVar.lmn = new lmn();
        bxVar.klm();
    }
}
