package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;
import com.huawei.hms.analytics.x;

/* loaded from: classes3.dex */
public final class y extends ad {
    public y(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
        this.ikl = new x(context, "com.uodis.opendevice.OPENIDS_SERVICE", "com.huawei.hwid", this);
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return klm("com.huawei.hwid");
    }

    @Override // com.huawei.hms.analytics.ad
    public final void lmn() {
        try {
            this.ikl.lmn();
        } catch (Exception unused) {
            lmn("getOaid,bindService error, begin get gaid");
        }
    }

    @Override // com.huawei.hms.analytics.ad, com.huawei.hms.analytics.w
    public final void lmn(x.lmn lmnVar) {
        try {
            ae aeVar = new ae(s.b.f22321a, lmnVar.lmn());
            boolean lmn = aeVar.lmn();
            String lmn2 = aeVar.lmn(new String[0]);
            if (TextUtils.isEmpty(lmn2) && !lmn) {
                HiLog.w("hwDeviceidHelper", "oaid is empty");
                throw new IllegalArgumentException();
            }
            this.lmn.lmn(lmn2, String.valueOf(lmn ? false : true), "oaid");
        } catch (Throwable th) {
            try {
                throw new IllegalArgumentException(th.getMessage());
            } finally {
                ikl();
            }
        }
    }
}
