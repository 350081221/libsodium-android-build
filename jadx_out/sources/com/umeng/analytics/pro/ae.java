package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;

/* loaded from: classes3.dex */
public class ae implements aa {

    /* renamed from: a, reason: collision with root package name */
    private String f12125a;

    /* renamed from: b, reason: collision with root package name */
    private long f12126b;

    public ae(String str, long j5) {
        this.f12125a = str;
        this.f12126b = j5;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        try {
            String str = ar.f12182b + this.f12125a;
            SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                long currentTimeMillis = System.currentTimeMillis() - a5.getLong(str, 0L);
                if (currentTimeMillis > this.f12126b * 1000) {
                    return true;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "internal period skipped. elapse: " + currentTimeMillis + "; config: " + (this.f12126b * 1000));
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
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
