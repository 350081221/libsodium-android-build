package com.bytedance.sdk.openadsdk.mediation.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeTokenInfo;

/* loaded from: classes2.dex */
public class c implements IMediationNativeTokenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5065a;

    public c(Bridge bridge) {
        this.f5065a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationNativeTokenInfo
    public void loadNativeAdByAdm(String str, TTAdNative.FeedAdListener feedAdListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.h(0, str);
        b5.g(1, new com.bytedance.sdk.openadsdk.g.a.a.a.b(feedAdListener));
        this.f5065a.call(270028, b5.k(), Void.class);
    }
}
