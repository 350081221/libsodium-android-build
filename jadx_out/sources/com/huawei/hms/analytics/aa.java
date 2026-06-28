package com.huawei.hms.analytics;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.analytics.i;
import com.huawei.hms.analytics.x;
import v0.a;

/* loaded from: classes3.dex */
public final class aa extends ad {
    /* JADX INFO: Access modifiers changed from: protected */
    public aa(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        this.ikl = new x(context, intent, this);
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return klm("com.zui.deviceidservice");
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
            ae aeVar = new ae(a.AbstractBinderC0664a.f22580a, lmnVar.lmn());
            if (!aeVar.klm()) {
                throw new IllegalAccessException("is supported is false");
            }
            String lmn = aeVar.lmn(new String[0]);
            if (TextUtils.isEmpty(lmn)) {
                throw new IllegalArgumentException("oaid is mepty");
            }
            this.lmn.lmn(lmn, "", "oaid");
        } catch (Throwable th) {
            try {
                throw new IllegalAccessException(th.getMessage());
            } finally {
                ikl();
            }
        }
    }
}
