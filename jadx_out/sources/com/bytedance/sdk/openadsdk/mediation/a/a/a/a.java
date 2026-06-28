package com.bytedance.sdk.openadsdk.mediation.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawTokenInfo;

/* loaded from: classes2.dex */
public class a implements IMediationDrawTokenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5063a;

    public a(Bridge bridge) {
        this.f5063a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationDrawTokenInfo
    public void loadDrawAdByAdm(String str, TTAdNative.DrawFeedAdListener drawFeedAdListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.h(0, str);
        b5.g(1, new com.bytedance.sdk.openadsdk.g.a.a.a.a(drawFeedAdListener));
        this.f5063a.call(270031, b5.k(), Void.class);
    }
}
