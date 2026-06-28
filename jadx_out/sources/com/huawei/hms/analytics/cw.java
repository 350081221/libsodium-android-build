package com.huawei.hms.analytics;

import android.content.Context;
import com.huawei.hms.analytics.core.log.HiLog;

/* loaded from: classes3.dex */
public abstract class cw {
    private final String ghi;
    private final String hij;
    private final bh ijk;
    protected Context ikl = ar.lmn().lmn.ghi;
    protected boolean klm;
    protected String lmn;

    public cw(bh bhVar, String str, String str2) {
        this.ijk = bhVar;
        this.hij = str;
        this.ghi = str2;
    }

    public abstract boolean klm();

    public abstract long lmn();

    public final void lmn(cv cvVar) {
        boolean klm = dl.klm(this.ikl, "global_v2", this.ghi, false);
        boolean ghi = dg.ghi(this.ikl);
        this.klm = ghi;
        if (ghi || !klm) {
            dj djVar = new dj(this.hij, cvVar.lmn());
            long lmn = lmn();
            if (this.klm) {
                HiLog.i(this.lmn, "debugview referrer event");
                this.ijk.lmn(this.hij, djVar, lmn);
                return;
            }
            HiLog.i(this.lmn, "normal referrer event");
            if (klm()) {
                ((ghi) this.ijk).klm(this.hij, djVar, lmn);
            } else {
                this.ijk.lmn(this.hij, djVar, lmn);
            }
            dl.lmn(this.ikl, "global_v2", this.ghi, true);
        }
    }
}
