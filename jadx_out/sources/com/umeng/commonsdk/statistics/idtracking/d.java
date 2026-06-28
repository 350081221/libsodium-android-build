package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* loaded from: classes3.dex */
public class d extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13314a = "idmd5";

    /* renamed from: b, reason: collision with root package name */
    private Context f13315b;

    public d(Context context) {
        super("idmd5");
        this.f13315b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f13315b);
    }
}
