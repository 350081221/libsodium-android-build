package com.huawei.hms.support.hianalytics;

import android.content.Context;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;
import java.util.Map;

/* loaded from: classes3.dex */
public class HiAnalyticsClient extends a {
    @Deprecated
    public static String reportEntry(Context context, String str) {
        return reportEntry(context, str, Util.getAppId(context), 0);
    }

    public static void reportExit(Context context, String str, String str2, int i5, int i6) {
        reportExit(context, str, str2, Util.getAppId(context), i5, i6, 0);
    }

    public static String reportEntry(Context context, String str, int i5) {
        return reportEntry(context, str, Util.getAppId(context), i5);
    }

    public static void reportExit(Context context, String str, String str2, int i5, int i6, int i7) {
        reportExit(context, str, str2, Util.getAppId(context), i5, i6, i7);
    }

    public static String reportEntry(Context context, String str, String str2, int i5) {
        String id = TransactionIdCreater.getId(str2, str);
        Map<String, String> mapForBi = a.getMapForBi(context, str);
        mapForBi.put("appid", str2);
        mapForBi.put("transId", id);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapForBi.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i5)));
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapForBi);
        return id;
    }

    public static void reportExit(Context context, String str, String str2, String str3, int i5, int i6, int i7) {
        Map<String, String> mapForBi = a.getMapForBi(context, str);
        mapForBi.put("appid", str3);
        mapForBi.put("transId", str2);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(i5));
        mapForBi.put("result", String.valueOf(i6));
        mapForBi.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i7)));
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapForBi);
    }
}
