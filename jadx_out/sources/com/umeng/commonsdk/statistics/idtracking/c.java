package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13312a = "idfa";

    /* renamed from: b, reason: collision with root package name */
    private Context f13313b;

    public c(Context context) {
        super(f13312a);
        this.f13313b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getIdfa(this.f13313b);
    }
}
