package com.bytedance.sdk.openadsdk.mediation.ad.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo;

/* loaded from: classes2.dex */
public class d implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5158a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationSplashRequestInfo f5159b;

    public d(IMediationSplashRequestInfo iMediationSplashRequestInfo) {
        this.f5159b = iMediationSplashRequestInfo;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        IMediationSplashRequestInfo iMediationSplashRequestInfo = this.f5159b;
        if (iMediationSplashRequestInfo == null) {
            return null;
        }
        switch (i5) {
            case 267001:
                return (T) iMediationSplashRequestInfo.getAdnName();
            case 267002:
                return (T) iMediationSplashRequestInfo.getAdnSlotId();
            case 267003:
                return (T) iMediationSplashRequestInfo.getAppId();
            case 267004:
                return (T) iMediationSplashRequestInfo.getAppkey();
            default:
                a(i5, valueSet, cls);
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5158a;
    }
}
