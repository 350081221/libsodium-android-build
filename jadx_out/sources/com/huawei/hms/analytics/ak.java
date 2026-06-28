package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.instance.CallBack;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ak extends ijk {
    public ak(Context context, String str) {
        super(context, str);
        this.lmn = this.klm.build(str);
        ar.lmn().lmn(str).ikl = dl.klm(context, "global_v2", "is_analytics_enabled".concat(String.valueOf(str)), true);
    }

    public final void ikl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ha-sdk-service", str);
        ar.lmn().lmn(this.hij).klm = hashMap;
    }

    public final void lmn(CallBack callBack) {
        cx.lmn().lmn(new al(this.ghi, this.hij, callBack));
    }
}
