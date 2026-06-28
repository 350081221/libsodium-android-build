package com.huawei.hms.analytics;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;
import com.huawei.hms.analytics.x;
import j0.a;

/* loaded from: classes3.dex */
public final class ah extends ad {
    public ah(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        this.ikl = new x(context, intent, this);
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return klm("com.samsung.android.deviceidservice");
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
            String lmn = new ae(a.AbstractBinderC0538a.f18942a, lmnVar.lmn()).lmn(new String[0]);
            if (TextUtils.isEmpty(lmn)) {
                HiLog.w("SamSungDeviceIdHelper", "oaid is empty");
                throw new IllegalArgumentException();
            }
            this.lmn.lmn(lmn, "", "oaid");
        } finally {
            ikl();
        }
    }
}
