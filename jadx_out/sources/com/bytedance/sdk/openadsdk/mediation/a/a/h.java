package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;

/* loaded from: classes2.dex */
public class h extends com.bytedance.sdk.openadsdk.mediation.a.a.b.d {

    /* renamed from: a, reason: collision with root package name */
    private IMediationPreloadRequestInfo f5082a;

    public h(IMediationPreloadRequestInfo iMediationPreloadRequestInfo) {
        super(iMediationPreloadRequestInfo);
        this.f5082a = iMediationPreloadRequestInfo;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.a.a.b.d, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        IMediationPreloadRequestInfo iMediationPreloadRequestInfo = this.f5082a;
        if (iMediationPreloadRequestInfo == null) {
            return (T) MediationValueUtil.checkClassType(cls);
        }
        if (i5 == 271045) {
            if (iMediationPreloadRequestInfo != null) {
                return (T) a.a(iMediationPreloadRequestInfo.getAdSlot());
            }
            return null;
        }
        return (T) super.call(i5, valueSet, cls);
    }
}
