package com.huawei.agconnect.apms;

import android.os.Process;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes3.dex */
public class srq {
    public final StringBuilder abc = new StringBuilder();

    public synchronized String abc(int i5, String str, String str2) {
        StringBuilder sb;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.abc.length() > 0) {
            StringBuilder sb2 = this.abc;
            sb2.delete(0, sb2.length());
        }
        sb = this.abc;
        sb.append(currentTimeMillis);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(Process.myPid());
        sb.append(":");
        sb.append(Process.myTid());
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(b1.abc(i5));
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(str);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(str2);
        sb.append('\n');
        return sb.toString();
    }
}
