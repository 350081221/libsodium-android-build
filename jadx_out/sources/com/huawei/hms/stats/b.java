package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static HiAnalyticsInstance f8760a;

    public static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f8760a = analyticsInstance;
        return analyticsInstance;
    }

    public static void a(Context context, String str, String str2) {
        if (a(context) != null) {
            f8760a.onEvent(context, str, str2);
        }
    }

    public static void a(Context context, int i5, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f8760a.onEvent(i5, str, linkedHashMap);
        }
    }

    public static void a(Context context, int i5) {
        if (a(context) != null) {
            f8760a.onReport(i5);
        }
    }
}
