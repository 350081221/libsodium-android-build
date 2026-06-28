package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;

/* loaded from: classes2.dex */
public class f implements IMediationDislikeCallback {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5080a;

    public f(Bridge bridge) {
        this.f5080a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onCancel() {
        this.f5080a.call(268014, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onSelected(int i5, String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.e(0, i5);
        b5.h(1, str);
        this.f5080a.call(268013, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onShow() {
        this.f5080a.call(268015, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }
}
