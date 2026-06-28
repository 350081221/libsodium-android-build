package com.tendcloud.tenddata;

import com.efs.sdk.base.core.util.NetworkUtil;

/* loaded from: classes3.dex */
public enum di {
    WIFI(NetworkUtil.NETWORK_TYPE_WIFI),
    CELLULAR("cellular"),
    BLUETOOTH("bluetooth");


    /* renamed from: d, reason: collision with root package name */
    private String f11693d;

    di(String str) {
        this.f11693d = str;
    }

    public String a() {
        return this.f11693d;
    }
}
