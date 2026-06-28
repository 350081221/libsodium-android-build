package com.umeng.commonsdk.statistics.idtracking;

import android.annotation.TargetApi;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* loaded from: classes3.dex */
public class i extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13337a = "serial";

    public i() {
        super(f13337a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    @TargetApi(9)
    public String f() {
        return DeviceConfig.getSerial();
    }
}
