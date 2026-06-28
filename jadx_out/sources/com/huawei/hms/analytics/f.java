package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {
    private static void klm(Context context, JSONObject jSONObject) {
        if (ba.lmn()) {
            bh lmn = fgh.lmn().lmn("_openness_config_tag");
            if (lmn instanceof ghi) {
                jSONObject.remove(com.umeng.analytics.pro.bi.aL);
                ((ghi) lmn).klm("$CampaignPushClick", new dj("$CampaignPushClick", jSONObject), System.currentTimeMillis());
                return;
            }
            return;
        }
        String klm = dl.klm(context, "Privacy_MY", "_openness_config_tag_region", "");
        if (TextUtils.isEmpty(klm)) {
            HiAnalytics.getInstance(context);
        } else {
            HiAnalytics.getInstance(context, klm);
        }
    }

    private static d lmn(bw bwVar, Context context) {
        return z.ghi() ? new e(bwVar, context) : new c(bwVar, context);
    }

    private static JSONObject lmn(bw bwVar) {
        String lmn = cz.lmn(bwVar);
        if (!TextUtils.isEmpty(lmn) && lmn.length() <= 20480) {
            try {
                JSONObject jSONObject = new JSONObject(lmn);
                if (jSONObject.has(com.umeng.analytics.pro.bi.aL)) {
                    return jSONObject;
                }
                HiLog.w("PshCamp", "The time key is missing.");
                return null;
            } catch (Throwable unused) {
                HiLog.w("PshCamp", "JSONException: Failed to format Json.");
            }
        }
        return null;
    }

    public static void lmn(Context context, bw bwVar) {
        if (bwVar == null) {
            return;
        }
        cz.klm(bwVar);
        JSONObject lmn = lmn(bwVar);
        if (lmn != null) {
            new c(bwVar, context).lmn(lmn, (JSONObject) null);
            return;
        }
        d lmn2 = lmn(bwVar, context);
        ao lmn3 = lmn2.lmn();
        if (lmn3 == null) {
            return;
        }
        JSONObject lmn4 = lmn2.lmn(lmn3).lmn();
        lmn2.lmn(lmn3.lmn(), lmn4);
        lmn(context, lmn4);
    }

    private static void lmn(Context context, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        klm(context, jSONObject);
    }
}
