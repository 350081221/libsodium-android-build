package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;

/* loaded from: classes3.dex */
public final class aj extends ad {
    private Object hij;
    private Class<?> ijk;

    public aj(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.ijk = cls;
            this.hij = cls.newInstance();
        } catch (Exception unused) {
            HiLog.w("miOaid", "invoke class Exception");
        }
    }

    private String ijk() {
        try {
            Object invoke = this.ijk.getMethod("getOAID", Context.class).invoke(this.hij, this.klm);
            return invoke instanceof String ? (String) invoke : "";
        } catch (Exception unused) {
            HiLog.w("miOaid", "invoke method Exception");
            return "";
        }
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return this.hij != null;
    }

    @Override // com.huawei.hms.analytics.ad
    public final void lmn() {
        String ijk = ijk();
        this.lmn.lmn(ijk, TextUtils.isEmpty(ijk) ? "false" : "", "oaid");
    }
}
