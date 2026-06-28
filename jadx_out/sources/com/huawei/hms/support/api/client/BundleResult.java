package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes3.dex */
public class BundleResult {

    /* renamed from: a, reason: collision with root package name */
    private int f8775a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f8776b;

    public BundleResult(int i5, Bundle bundle) {
        this.f8775a = i5;
        this.f8776b = bundle;
    }

    public int getResultCode() {
        return this.f8775a;
    }

    public Bundle getRspBody() {
        return this.f8776b;
    }

    public void setResultCode(int i5) {
        this.f8775a = i5;
    }

    public void setRspBody(Bundle bundle) {
        this.f8776b = bundle;
    }
}
