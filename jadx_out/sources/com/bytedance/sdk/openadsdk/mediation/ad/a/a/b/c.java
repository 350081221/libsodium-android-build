package com.bytedance.sdk.openadsdk.mediation.ad.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeToBannerListener;

/* loaded from: classes2.dex */
public class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5156a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationNativeToBannerListener f5157b;

    public c(IMediationNativeToBannerListener iMediationNativeToBannerListener) {
        this.f5157b = iMediationNativeToBannerListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5157b == null) {
            return null;
        }
        if (i5 != 266013) {
            a(i5, valueSet, cls);
            return null;
        }
        return (T) this.f5157b.getMediationBannerViewFromNativeAd(new com.bytedance.sdk.openadsdk.mediation.ad.a.a.a.a((Bridge) valueSet.objectValue(0, Bridge.class)));
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5156a;
    }
}
