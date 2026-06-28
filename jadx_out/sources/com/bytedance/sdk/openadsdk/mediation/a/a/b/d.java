package com.bytedance.sdk.openadsdk.mediation.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;

/* loaded from: classes2.dex */
public class d implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5073a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationPreloadRequestInfo f5074b;

    public d(IMediationPreloadRequestInfo iMediationPreloadRequestInfo) {
        this.f5074b = iMediationPreloadRequestInfo;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        IMediationPreloadRequestInfo iMediationPreloadRequestInfo = this.f5074b;
        if (iMediationPreloadRequestInfo == null) {
            return null;
        }
        switch (i5) {
            case 271044:
                return (T) Integer.class.cast(Integer.valueOf(iMediationPreloadRequestInfo.getAdType()));
            case 271045:
                return (T) iMediationPreloadRequestInfo.getAdSlot();
            case 271046:
                return (T) iMediationPreloadRequestInfo.getPrimeRitList();
            default:
                a(i5, valueSet, cls);
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5073a;
    }
}
