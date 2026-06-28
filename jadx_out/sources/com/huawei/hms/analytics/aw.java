package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class aw {
    public static JSONArray lmn() {
        String klm = dl.klm(ar.lmn().lmn.ghi, "global_v2", "ab_info", "");
        if (klm.isEmpty()) {
            return new JSONArray();
        }
        try {
            return new JSONArray(klm);
        } catch (JSONException unused) {
            HiLog.w("ABTskIdHolder", "cache abProperty is error, json exception");
            dl.lmn(ar.lmn().lmn.ghi, "global_v2", "ab_info");
            return new JSONArray();
        }
    }

    public static JSONArray lmn(JSONArray jSONArray) {
        int length = jSONArray.length();
        JSONArray jSONArray2 = new JSONArray();
        for (int i5 = length - 25; i5 < length; i5++) {
            try {
                jSONArray2.put(jSONArray.get(i5));
            } catch (JSONException unused) {
                HiLog.w("ABTskIdHolder", "cache ab info is error");
            }
        }
        return jSONArray2;
    }
}
