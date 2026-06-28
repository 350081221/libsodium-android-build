package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId;

/* loaded from: classes3.dex */
public class ba implements av {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12245a = 1;

    /* renamed from: b, reason: collision with root package name */
    private OpenDeviceId f12246b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12247c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12248d = false;

    @Override // com.umeng.analytics.pro.av
    public String a(Context context) {
        boolean z4;
        if (context == null) {
            return null;
        }
        if (!this.f12247c) {
            OpenDeviceId openDeviceId = new OpenDeviceId();
            this.f12246b = openDeviceId;
            if (openDeviceId.a(context, (OpenDeviceId.CallBack<String>) null) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f12248d = z4;
            this.f12247c = true;
        }
        bh.a("getOAID", "isSupported", Boolean.valueOf(this.f12248d));
        if (!this.f12248d || !this.f12246b.c()) {
            return null;
        }
        return this.f12246b.a();
    }
}
