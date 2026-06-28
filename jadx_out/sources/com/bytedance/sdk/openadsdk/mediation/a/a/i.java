package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo;

/* loaded from: classes2.dex */
public class i extends com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.d {

    /* renamed from: a, reason: collision with root package name */
    private IMediationSplashRequestInfo f5083a;

    public i(IMediationSplashRequestInfo iMediationSplashRequestInfo) {
        super(iMediationSplashRequestInfo);
        this.f5083a = iMediationSplashRequestInfo;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.d, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        String str = "";
        switch (i5) {
            case 267001:
                IMediationSplashRequestInfo iMediationSplashRequestInfo = this.f5083a;
                if (iMediationSplashRequestInfo != null && iMediationSplashRequestInfo.getAdnName() != null) {
                    str = this.f5083a.getAdnName();
                }
                return (T) String.valueOf(str);
            case 267002:
                IMediationSplashRequestInfo iMediationSplashRequestInfo2 = this.f5083a;
                if (iMediationSplashRequestInfo2 != null && iMediationSplashRequestInfo2.getAdnSlotId() != null) {
                    str = this.f5083a.getAdnSlotId();
                }
                return (T) String.valueOf(str);
            case 267003:
                IMediationSplashRequestInfo iMediationSplashRequestInfo3 = this.f5083a;
                if (iMediationSplashRequestInfo3 != null && iMediationSplashRequestInfo3.getAppId() != null) {
                    str = this.f5083a.getAppId();
                }
                return (T) String.valueOf(str);
            case 267004:
                IMediationSplashRequestInfo iMediationSplashRequestInfo4 = this.f5083a;
                if (iMediationSplashRequestInfo4 != null && iMediationSplashRequestInfo4.getAppkey() != null) {
                    str = this.f5083a.getAppkey();
                }
                return (T) String.valueOf(str);
            default:
                return (T) super.call(i5, valueSet, cls);
        }
    }
}
