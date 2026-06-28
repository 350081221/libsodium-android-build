package com.huawei.hms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.receiver.SafeIntent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fgh {
    private static fgh lmn = new fgh();
    private final Map<String, bh> klm = new LinkedHashMap();

    public static void klm(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            SafeIntent safeIntent = new SafeIntent(activity.getIntent());
            bw lmn2 = cz.lmn(activity);
            if (TextUtils.isEmpty(ar.lmn().lmn.f8142d)) {
                cz.lmn(activity, lmn2);
            }
            if (TextUtils.isEmpty(ar.lmn().lmn.f8143e)) {
                cz.klm(lmn2);
            }
            ar.lmn().lmn.cde = safeIntent.getAction();
        }
    }

    public static fgh lmn() {
        return lmn;
    }

    public static void lmn(Context context) {
        dl.lmn(context, "global_v2", "is_analytics_initialized", 1);
    }

    public static void lmn(Context context, bh bhVar) {
        Application lmn2 = context instanceof Application ? (Application) context : dg.lmn();
        a lmn3 = a.lmn(lmn2);
        lmn3.ikl = bhVar;
        if (lmn3.lmn) {
            lmn3.lmn();
        }
        bcd.lmn().def = bhVar;
        abc.lmn().lmn(lmn2);
    }

    public static void lmn(hij hijVar) {
        cx.lmn().lmn(hijVar);
    }

    public static boolean lmn(String str, String str2) {
        if (str.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN)) {
            str = ar.lmn().lmn.f8152n.ghi;
        }
        return cde.lmn(ar.lmn().lmn.ghi, str2).lmn(str);
    }

    public final void klm() {
        for (Map.Entry<String, bh> entry : this.klm.entrySet()) {
            String key = entry.getKey();
            if (!key.equals("_openness_config_tag")) {
                if (ar.lmn().lmn(key).ikl) {
                    entry.getValue().lmn();
                } else {
                    HiLog.w("HiAnalyticsInstanceCommander", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled. serviceTag: ".concat(key));
                }
            }
        }
    }

    public final bh lmn(String str) {
        return this.klm.get(str);
    }

    public final void lmn(String str, bh bhVar) {
        this.klm.put(str, bhVar);
    }
}
