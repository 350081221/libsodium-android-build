package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class x implements w {

    /* renamed from: a, reason: collision with root package name */
    private long f12765a = AnalyticsConfig.kContinueSessionMillis;

    @Override // com.umeng.analytics.pro.w
    public void a(long j5) {
        this.f12765a = j5;
    }

    @Override // com.umeng.analytics.pro.w
    public long a() {
        return this.f12765a;
    }

    @Override // com.umeng.analytics.pro.w
    public String a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            return UMUtils.MD5(currentTimeMillis + appkey + "02:00:00:00:00:00");
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    @Override // com.umeng.analytics.pro.w
    public boolean a(long j5, long j6) {
        long currentTimeMillis = System.currentTimeMillis();
        return (j5 == 0 || currentTimeMillis - j5 >= this.f12765a) && j6 > 0 && currentTimeMillis - j6 > this.f12765a;
    }

    @Override // com.umeng.analytics.pro.w
    public void a(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString("session_id", str);
            edit.putLong(u.f12746b, 0L);
            edit.putLong(u.f12749e, currentTimeMillis);
            edit.putLong(u.f12750f, 0L);
            edit.commit();
        } catch (Exception unused) {
        }
    }
}
