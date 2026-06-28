package com.huawei.agconnect.common.network;

import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f7738a = new b();

    @SharedPreference(fileName = "AGConnectAccessNetwork", key = "enableAccessNetwork")
    boolean enableAccessNetwork = false;

    private b() {
    }

    public static b a() {
        return f7738a;
    }

    public void a(boolean z4) {
        this.enableAccessNetwork = z4;
        c.a().b(f7738a);
    }

    public boolean b() {
        c.a().d(f7738a);
        return this.enableAccessNetwork;
    }
}
