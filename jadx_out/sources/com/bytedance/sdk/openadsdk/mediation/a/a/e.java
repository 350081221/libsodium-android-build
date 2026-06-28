package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeToBannerListener;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;

/* loaded from: classes2.dex */
public class e extends com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private IMediationAdSlot f5079a;

    public e(IMediationAdSlot iMediationAdSlot) {
        super(iMediationAdSlot);
        this.f5079a = iMediationAdSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.a, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5079a == null) {
            return (T) MediationValueUtil.checkClassType(cls);
        }
        if (i5 == 266101) {
            return (T) new com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.c((IMediationNativeToBannerListener) super.call(i5, null, IMediationNativeToBannerListener.class));
        }
        if (i5 == 266102) {
            IMediationSplashRequestInfo iMediationSplashRequestInfo = (IMediationSplashRequestInfo) super.call(i5, null, IMediationSplashRequestInfo.class);
            if (iMediationSplashRequestInfo == null) {
                return null;
            }
            return (T) new i(iMediationSplashRequestInfo);
        }
        return (T) super.call(i5, valueSet, cls);
    }
}
