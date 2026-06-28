package com.bytedance.sdk.openadsdk.mediation.ad.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;

/* loaded from: classes2.dex */
public class b implements MediationAdDislike {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5150a;

    public b(Bridge bridge) {
        this.f5150a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike
    public void setDislikeCallback(IMediationDislikeCallback iMediationDislikeCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.b(iMediationDislikeCallback));
        this.f5150a.call(270033, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike
    public void showDislikeDialog() {
        this.f5150a.call(270032, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }
}
