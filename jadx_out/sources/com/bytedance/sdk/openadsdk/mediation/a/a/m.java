package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.mediation.IMediationInterstitialFullAdListener;

/* loaded from: classes2.dex */
public class m extends com.bytedance.sdk.openadsdk.c.a.a.l {

    /* renamed from: a, reason: collision with root package name */
    private Bridge f5088a;

    public m(Bridge bridge) {
        super(bridge);
        this.f5088a = bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.c.a.a.l, com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        if (fullScreenVideoAdInteractionListener instanceof IMediationInterstitialFullAdListener) {
            b5.g(0, new com.bytedance.sdk.openadsdk.mediation.a.a.b.b((IMediationInterstitialFullAdListener) fullScreenVideoAdInteractionListener));
            b5.e(1, 1);
        } else {
            b5.g(0, new com.bytedance.sdk.openadsdk.j.a.a.a.a(fullScreenVideoAdInteractionListener));
            b5.e(1, 0);
        }
        Bridge bridge = this.f5088a;
        if (bridge != null) {
            bridge.call(130101, b5.k(), Void.class);
        }
    }
}
