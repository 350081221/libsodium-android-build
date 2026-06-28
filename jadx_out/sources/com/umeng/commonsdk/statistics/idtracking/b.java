package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* loaded from: classes3.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13310a = "android_id";

    /* renamed from: b, reason: collision with root package name */
    private Context f13311b;

    public b(Context context) {
        super(f13310a);
        this.f13311b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getAndroidId(this.f13311b);
    }
}
