package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.c;
import com.huawei.hms.support.log.HMSLog;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class HiAnalyticsUtils {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8788c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8789d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HiAnalyticsUtils f8790e;

    /* renamed from: a, reason: collision with root package name */
    public int f8791a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8792b = c.a();

    public static LinkedHashMap<String, String> a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f8788c) {
            if (f8790e == null) {
                f8790e = new HiAnalyticsUtils();
            }
            hiAnalyticsUtils = f8790e;
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.f8792b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HiAnalyticTools.enableLog(context);
        }
    }

    public boolean getInitFlag() {
        if (!this.f8792b) {
            return HmsHiAnalyticsUtils.getInitFlag();
        }
        return HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public boolean hasError(Context context) {
        return com.huawei.hms.stats.a.c(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        if (!hasError(context) && context != null) {
            onEvent2(context, str, str2);
        }
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        if (!hasError(context) && map != null && !map.isEmpty() && context != null && getInitFlag()) {
            if (!this.f8792b) {
                HmsHiAnalyticsUtils.onEvent(0, str, a(map));
                HmsHiAnalyticsUtils.onEvent(1, str, a(map));
            } else {
                com.huawei.hms.stats.b.a(context, 0, str, a(map));
                com.huawei.hms.stats.b.a(context, 1, str, a(map));
            }
            a(context);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        if (!hasError(context) && context != null && getInitFlag()) {
            if (!this.f8792b) {
                HmsHiAnalyticsUtils.onEvent(context, str, str2);
            } else {
                com.huawei.hms.stats.b.a(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f8792b) {
            HmsHiAnalyticsUtils.onEvent(0, str, a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onEvent(1, str, a((Map<String, String>) map));
        } else {
            com.huawei.hms.stats.b.a(context, 0, str, a((Map<String, String>) map));
            com.huawei.hms.stats.b.a(context, 1, str, a((Map<String, String>) map));
        }
        a(context);
    }

    public void onReport(Context context, String str, Map map) {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f8792b) {
            HmsHiAnalyticsUtils.onEvent(0, str, a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onEvent(1, str, a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onReport();
        } else {
            com.huawei.hms.stats.b.a(context, 0, str, a((Map<String, String>) map));
            com.huawei.hms.stats.b.a(context, 1, str, a((Map<String, String>) map));
            com.huawei.hms.stats.b.a(context, 0);
            com.huawei.hms.stats.b.a(context, 1);
        }
    }

    public void enableLog() {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.f8792b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    public final void a(Context context) {
        synchronized (f8789d) {
            int i5 = this.f8791a;
            if (i5 < 60) {
                this.f8791a = i5 + 1;
            } else {
                this.f8791a = 0;
                if (!this.f8792b) {
                    HmsHiAnalyticsUtils.onReport();
                } else {
                    com.huawei.hms.stats.b.a(context, 0);
                    com.huawei.hms.stats.b.a(context, 1);
                }
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i5) {
        if (hasError(context)) {
            return;
        }
        if (i5 != 0 && i5 != 1) {
            HMSLog.e("HiAnalyticsUtils", "Data reporting type is not supported");
            return;
        }
        if (map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f8792b) {
            HmsHiAnalyticsUtils.onEvent(i5, str, a((Map<String, String>) map));
        } else {
            com.huawei.hms.stats.b.a(context, i5, str, a((Map<String, String>) map));
        }
        a(context);
    }

    public void onReport(Context context, String str, Map map, int i5) {
        if (hasError(context)) {
            return;
        }
        if (i5 != 0 && i5 != 1) {
            HMSLog.e("HiAnalyticsUtils", "Data reporting type is not supported");
            return;
        }
        if (map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f8792b) {
            HmsHiAnalyticsUtils.onEvent(i5, str, a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onReport();
        } else {
            com.huawei.hms.stats.b.a(context, i5, str, a((Map<String, String>) map));
            com.huawei.hms.stats.b.a(context, i5);
        }
    }
}
