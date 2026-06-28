package com.huawei.hms.analytics;

import android.content.Context;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;
import com.huawei.hms.analytics.x;

/* loaded from: classes3.dex */
public abstract class ad implements w {
    private final ad ijk;
    protected x ikl;
    protected final Context klm;
    protected final i.lmn lmn;

    /* JADX INFO: Access modifiers changed from: protected */
    public ad(Context context, i.lmn lmnVar, ad adVar) {
        this.klm = context;
        this.lmn = lmnVar;
        this.ijk = adVar;
    }

    private boolean lmn(ad adVar) {
        if (adVar == null) {
            return false;
        }
        if (adVar.klm()) {
            adVar.lmn();
            return true;
        }
        lmn(adVar.ijk);
        return false;
    }

    public final void ikl() {
        x xVar = this.ikl;
        if (xVar == null) {
            return;
        }
        try {
            x.lmn lmnVar = xVar.klm;
            if (lmnVar != null) {
                xVar.lmn.unbindService(lmnVar);
            }
        } catch (Exception unused) {
            HiLog.w("oaidHelper", "unBind service exception");
        }
    }

    public abstract boolean klm();

    public final boolean klm(String str) {
        return this.klm.getPackageManager().getPackageInfo(str, 16384) != null;
    }

    public abstract void lmn();

    @Override // com.huawei.hms.analytics.w
    public void lmn(x.lmn lmnVar) {
    }

    @Override // com.huawei.hms.analytics.w
    public void lmn(String str) {
        HiLog.w("oaidHelper", str);
        if (lmn(this.ijk)) {
            return;
        }
        this.lmn.lmn("", "", "");
    }
}
