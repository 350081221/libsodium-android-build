package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;

/* loaded from: classes3.dex */
public class HiAnalyticsTools {
    public static void enableLog() {
        enableLog(3);
    }

    public static void enableLog(int i5) {
        HiLog.init(i5, "HiAnalyticsSDK");
    }
}
