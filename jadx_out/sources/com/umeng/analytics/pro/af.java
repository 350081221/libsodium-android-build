package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;

/* loaded from: classes3.dex */
public class af implements aa {

    /* renamed from: a, reason: collision with root package name */
    private int f12127a;

    public af(int i5) {
        this.f12127a = i5;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        long j5 = 0;
        try {
            SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                j5 = a5.getLong(ar.f12181a, 0L);
                if (j5 >= this.f12127a) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "launch times skipped. times: " + j5 + " ; config: " + this.f12127a);
        return false;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.aa
    public long c() {
        return 0L;
    }
}
