package com.huawei.hms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class cz {
    private static String ijk(bw bwVar) {
        String str;
        String lmn = lmn(bwVar, "$CampaignPushInfo", "activityId");
        if (TextUtils.isEmpty(lmn)) {
            lmn = dd.lmn(lmn(bwVar), "aid");
            if (TextUtils.isEmpty(lmn)) {
                String lmn2 = lmn(bwVar, "analyticInfo", "taskId");
                if (TextUtils.isEmpty(lmn2)) {
                    HiLog.d("ActivityReferrerToolsKit", "get taskId is empty");
                    return "";
                }
                HiLog.i("ActivityReferrerToolsKit", "get taskId by push");
                return lmn2;
            }
            str = "get taskId by HMS push";
        } else {
            str = "get taskId by camp";
        }
        HiLog.i("ActivityReferrerToolsKit", str);
        return lmn;
    }

    private static String ikl(Activity activity) {
        try {
            return activity.getCallingPackage();
        } catch (Throwable th) {
            HiLog.w("ActivityReferrerToolsKit", "getCallingPackage exception. " + th.getMessage());
            return "";
        }
    }

    private static String ikl(bw bwVar) {
        String lmn = dd.lmn(lmn(bwVar), com.umeng.analytics.pro.bi.aE);
        return !TextUtils.isEmpty(lmn) ? lmn : lmn(bwVar, "analyticInfo", "source");
    }

    private static String klm(Activity activity) {
        String str;
        try {
            Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mReferrer");
            declaredField.setAccessible(true);
            str = (String) declaredField.get(activity);
        } catch (Throwable unused) {
            HiLog.w("ActivityReferrerToolsKit", "No referrer.");
            str = "";
        }
        return str == null ? "" : str;
    }

    private static String klm(Activity activity, bw bwVar) {
        String str;
        String str2;
        String lmn = lmn(bwVar, "AnalyticsKit-Info", "_s");
        if (TextUtils.isEmpty(lmn)) {
            lmn = lmn(bwVar, "$CampaignPushInfo", "source");
            if (TextUtils.isEmpty(lmn)) {
                String ikl = ikl(bwVar);
                if (TextUtils.isEmpty(ikl)) {
                    ikl = klm(activity);
                    if (TextUtils.isEmpty(ikl)) {
                        String ikl2 = ikl(activity);
                        if (TextUtils.isEmpty(ikl2)) {
                            HiLog.d("ActivityReferrerToolsKit", "get start info empty");
                            return "";
                        }
                        HiLog.i("ActivityReferrerToolsKit", "get start info by pkg");
                        return ikl2;
                    }
                    str = "get start info by reflect";
                } else {
                    str = "get start info by push";
                }
                HiLog.i("ActivityReferrerToolsKit", str);
                return ikl;
            }
            str2 = "get start info by camp";
        } else {
            str2 = "get start info by custom";
        }
        HiLog.i("ActivityReferrerToolsKit", str2);
        return lmn;
    }

    public static void klm(bw bwVar) {
        if (bwVar == null) {
            return;
        }
        String ijk = ijk(bwVar);
        if (TextUtils.isEmpty(ijk)) {
            return;
        }
        ar.lmn().lmn.f8143e = ijk;
    }

    public static bw lmn(Activity activity) {
        Intent intent;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        try {
            return new bw(intent.getExtras());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String lmn(bw bwVar) {
        String lmn = dd.lmn(lmn(bwVar, "analyticInfo"), "analyticsLabel");
        return TextUtils.isEmpty(lmn) ? "" : dd.lmn(da.klm(lmn), "hw_hms_push_campaign");
    }

    private static String lmn(bw bwVar, String str) {
        if (bwVar == null || TextUtils.isEmpty(str)) {
            HiLog.w("ActivityReferrerToolsKit", "input bundle extras or key is empty.");
            return "";
        }
        String klm = bwVar.klm(str);
        return klm == null ? "" : klm;
    }

    private static String lmn(bw bwVar, String str, String str2) {
        return dd.lmn(lmn(bwVar, str), str2);
    }

    public static void lmn(Activity activity, bw bwVar) {
        if (activity == null && bwVar == null) {
            return;
        }
        String klm = klm(activity, bwVar);
        if (TextUtils.isEmpty(klm)) {
            return;
        }
        ar.lmn().lmn.f8142d = klm;
    }
}
