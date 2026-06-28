package com.bytedance.sdk.openadsdk.m.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5039a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTRewardVideoAd.RewardAdPlayAgainController f5040b;

    public b(TTRewardVideoAd.RewardAdPlayAgainController rewardAdPlayAgainController) {
        this.f5040b = rewardAdPlayAgainController;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5040b == null) {
            return null;
        }
        if (i5 == 122101) {
            this.f5040b.getPlayAgainCondition(valueSet.intValue(0), new com.bytedance.sdk.openadsdk.d.a.a.a.a.a((Bridge) valueSet.objectValue(1, Bridge.class)));
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5039a;
    }
}
