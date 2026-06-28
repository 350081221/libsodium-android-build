package com.huawei.hms.analytics.core.log;

import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes3.dex */
public final class a implements LogAdapter {

    /* renamed from: c, reason: collision with root package name */
    private String f8197c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8195a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f8196b = 4;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8198d = false;

    private static void a(int i5, String str, String str2) {
        int length = str2.length();
        int i6 = 3000;
        int i7 = 0;
        for (int i8 = 0; i8 < (length / 3000) + 1; i8++) {
            if (length > i6) {
                if (i5 != 3) {
                    String substring = str2.substring(i7, i6);
                    if (i5 == 5) {
                        Log.w(str, substring);
                    } else if (i5 != 6) {
                        Log.i(str, substring);
                    } else {
                        Log.e(str, substring);
                    }
                } else {
                    Log.d(str, str2.substring(i7, i6));
                }
                int i9 = i6;
                i6 += 3000;
                i7 = i9;
            } else if (i5 == 3) {
                Log.d(str, str2.substring(i7, length));
            } else if (i5 == 5) {
                Log.w(str, str2.substring(i7, length));
            } else if (i5 != 6) {
                Log.i(str, str2.substring(i7, length));
            } else {
                Log.e(str, str2.substring(i7, length));
            }
        }
    }

    @Override // com.huawei.hms.analytics.core.log.LogAdapter
    public final void init(int i5, String str) {
        if (this.f8198d) {
            this.f8196b = i5;
            this.f8197c = str;
            return;
        }
        this.f8198d = true;
        this.f8196b = i5;
        this.f8195a = true;
        this.f8197c = str;
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("line.separator", "\n") + "=======================================" + System.getProperty("line.separator", "\n") + " ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8197c);
        sb2.append("_6.7.0.300");
        sb.append(sb2.toString());
        sb.append(System.getProperty("line.separator", "\n") + "=======================================");
        Log.i(str, sb.toString());
    }

    @Override // com.huawei.hms.analytics.core.log.LogAdapter
    public final boolean isLoggable(int i5) {
        return this.f8195a && i5 >= this.f8196b;
    }

    @Override // com.huawei.hms.analytics.core.log.LogAdapter
    public final void println(int i5, String str, String str2) {
        a(i5, this.f8197c, str + "=> " + str2);
    }

    @Override // com.huawei.hms.analytics.core.log.LogAdapter
    public final void println(int i5, String str, String str2, String str3) {
        a(i5, this.f8197c, str + "=> " + str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3);
    }
}
