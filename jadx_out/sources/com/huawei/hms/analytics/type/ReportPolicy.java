package com.huawei.hms.analytics.type;

import com.huawei.hms.analytics.core.log.HiLog;

/* loaded from: classes3.dex */
public enum ReportPolicy {
    ON_SCHEDULED_TIME_POLICY(60),
    ON_APP_LAUNCH_POLICY(-1),
    ON_MOVE_BACKGROUND_POLICY(-1),
    ON_CACHE_THRESHOLD_POLICY(30);

    private long threshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.analytics.type.ReportPolicy$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] lmn;

        static {
            int[] iArr = new int[ReportPolicy.values().length];
            lmn = iArr;
            try {
                iArr[ReportPolicy.ON_CACHE_THRESHOLD_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lmn[ReportPolicy.ON_SCHEDULED_TIME_POLICY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    ReportPolicy(long j5) {
        this.threshold = j5;
    }

    private long checkThreshold(long j5) {
        long j6;
        String str;
        String str2;
        int i5 = AnonymousClass1.lmn[ordinal()];
        if (i5 == 1) {
            j6 = 1000;
            if (j5 > 1000) {
                str = "The number of automatically reported thresholds is too large. Use the maximum  default value.";
            } else {
                j6 = 30;
                if (j5 >= 30) {
                    return j5;
                }
                str = "The number of automatically reported thresholds is too small. Use the minimum  default value.";
            }
            HiLog.i("PolicyToolsKit", str);
        } else {
            if (i5 != 2) {
                return -1L;
            }
            j6 = 1800;
            if (j5 > 1800) {
                str2 = "The auto-reporting period is too long.Use the default value.";
            } else {
                j6 = 60;
                if (j5 >= 60) {
                    return j5;
                }
                str2 = "The auto-reporting period is too short. Use the default value.";
            }
            HiLog.w("PolicyToolsKit", str2);
        }
        return j6;
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final void setThreshold(long j5) {
        this.threshold = checkThreshold(j5);
    }
}
