package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* loaded from: classes3.dex */
public class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13330a = "mac";

    /* renamed from: b, reason: collision with root package name */
    private Context f13331b;

    public g(Context context) {
        super(f13330a);
        this.f13331b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            return DeviceConfig.getMac(this.f13331b);
        } catch (Exception e5) {
            if (AnalyticsConstants.UM_DEBUG) {
                e5.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f13331b, e5);
            return null;
        }
    }
}
