package com.bytedance.sdk.openadsdk.mediation.ad;

import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.Bridge;
import java.util.Map;

/* loaded from: classes2.dex */
public class MApiIMediationViewBinderReversal implements IMediationViewBinderReversal {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5089a;

    public MApiIMediationViewBinderReversal(Bridge bridge) {
        this.f5089a = bridge == null ? b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getCallToActionId() {
        return ((Integer) this.f5089a.call(271024, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getDecriptionTextId() {
        return ((Integer) this.f5089a.call(271023, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public Map<String, Integer> getExtras() {
        return (Map) this.f5089a.call(271034, b.b(0).k(), Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getGroupImage1Id() {
        return ((Integer) this.f5089a.call(271029, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getGroupImage2Id() {
        return ((Integer) this.f5089a.call(271030, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getGroupImage3Id() {
        return ((Integer) this.f5089a.call(271031, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getIconImageId() {
        return ((Integer) this.f5089a.call(271025, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getLayoutId() {
        return ((Integer) this.f5089a.call(271021, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getLogoLayoutId() {
        return ((Integer) this.f5089a.call(271032, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getMainImageId() {
        return ((Integer) this.f5089a.call(271026, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getMediaViewId() {
        return ((Integer) this.f5089a.call(271027, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getShakeViewContainerId() {
        return ((Integer) this.f5089a.call(271033, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getSourceId() {
        return ((Integer) this.f5089a.call(271028, b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinderReversal
    public int getTitleId() {
        return ((Integer) this.f5089a.call(271022, b.b(0).k(), Integer.TYPE)).intValue();
    }
}
