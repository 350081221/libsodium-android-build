package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;

/* loaded from: classes2.dex */
public class k extends com.bytedance.sdk.openadsdk.c.a.a.j {

    /* renamed from: a, reason: collision with root package name */
    private Bridge f5086a;

    public k(Bridge bridge) {
        super(bridge);
        this.f5086a = bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.c.a.a.j, com.bytedance.sdk.openadsdk.TTNativeAd
    public void setExpressRenderListener(TTNativeAd.ExpressRenderListener expressRenderListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        if (expressRenderListener instanceof MediationExpressRenderListener) {
            b5.g(0, new com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.f((MediationExpressRenderListener) expressRenderListener));
            b5.e(1, 1);
        } else {
            b5.g(0, new com.bytedance.sdk.openadsdk.k.a.a.a.c(expressRenderListener));
            b5.e(1, 0);
        }
        Bridge bridge = this.f5086a;
        if (bridge != null) {
            bridge.call(140111, b5.k(), Void.class);
        }
    }
}
