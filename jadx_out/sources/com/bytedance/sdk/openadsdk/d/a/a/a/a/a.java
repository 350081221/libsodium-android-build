package com.bytedance.sdk.openadsdk.d.a.a.a.a;

import android.os.Bundle;
import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* loaded from: classes2.dex */
public class a implements TTRewardVideoAd.RewardAdPlayAgainController.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4935a;

    public a(Bridge bridge) {
        this.f4935a = bridge == null ? b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdPlayAgainController.Callback
    public void onConditionReturn(Bundle bundle) {
        b b5 = b.b(1);
        b5.g(0, bundle);
        this.f4935a.call(123101, b5.k(), Void.class);
    }
}
