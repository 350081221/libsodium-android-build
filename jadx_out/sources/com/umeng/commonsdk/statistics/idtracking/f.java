package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* loaded from: classes3.dex */
public class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13328a = "imei";

    /* renamed from: b, reason: collision with root package name */
    private Context f13329b;

    public f(Context context) {
        super(f13328a);
        this.f13329b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.f13329b);
    }
}
