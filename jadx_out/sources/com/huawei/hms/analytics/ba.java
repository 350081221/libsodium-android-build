package com.huawei.hms.analytics;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ba {
    private static final Map<String, Boolean> lmn = new HashMap();
    private static boolean klm = false;

    public static boolean ijk() {
        Context context = ar.lmn().lmn.ghi;
        return dl.lmn(context, "global_v2", "is_restriction_enabled") ? dl.klm(context, "global_v2", "is_restriction_enabled", false) : !dl.klm(context, "global_v2", "is_analytics_enabled", true);
    }

    public static void ikl() {
        klm = true;
    }

    public static boolean klm() {
        return klm;
    }

    public static boolean klm(String str) {
        return lmn(str);
    }

    public static void lmn(String str, Boolean bool) {
        lmn.put(str, bool);
    }

    public static boolean lmn() {
        return lmn("_openness_config_tag");
    }

    public static boolean lmn(String str) {
        Boolean bool;
        Map<String, Boolean> map = lmn;
        if (!map.containsKey(str) || (bool = map.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
