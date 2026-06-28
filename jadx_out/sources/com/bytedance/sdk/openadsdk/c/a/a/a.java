package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.CSJAdError;

/* loaded from: classes2.dex */
public class a extends CSJAdError {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4887a;

    public a(Bridge bridge) {
        this.f4887a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.CSJAdError
    public int getCode() {
        return this.f4887a.values().intValue(263001);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJAdError
    public String getMsg() {
        return (String) this.f4887a.values().objectValue(263002, String.class);
    }
}
