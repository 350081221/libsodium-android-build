package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cde {
    private static final Map<String, cde> ikl = new HashMap();
    String klm;
    final String lmn;

    private cde(Context context, String str) {
        this.lmn = str;
        String klm = dl.klm(context, "Privacy_MY", str + "_region", "");
        this.klm = klm;
        if (TextUtils.isEmpty(klm)) {
            this.klm = ar.lmn().lmn.f8152n.ghi;
            dl.lmn(context, "Privacy_MY", str + "_region", this.klm);
        }
    }

    public static cde lmn(Context context, String str) {
        Map<String, cde> map = ikl;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        cde cdeVar = new cde(context, str);
        map.put(str, cdeVar);
        return cdeVar;
    }

    public final void lmn() {
        bh lmn = fgh.lmn().lmn(this.lmn);
        if (lmn != null) {
            if ("_openness_config_tag".equals(this.lmn)) {
                lmn.lmn(this.klm);
            }
            lmn.klm(this.klm);
        }
    }

    public final boolean lmn(String str) {
        return (TextUtils.isEmpty(this.klm) || str.equals(this.klm)) ? false : true;
    }
}
