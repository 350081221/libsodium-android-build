package com.bytedance.sdk.openadsdk.mediation;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback;
import com.bytedance.sdk.openadsdk.live.TTLiveToken;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;

/* loaded from: classes2.dex */
public class MediationTTLiveAuthCallBackImpl implements TTLiveAuthCallback {

    /* renamed from: a, reason: collision with root package name */
    private Bridge f5060a;

    public MediationTTLiveAuthCallBackImpl(Bridge bridge) {
        this.f5060a = bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback
    public void onAuth(TTLiveToken tTLiveToken) {
        if (this.f5060a != null && tTLiveToken != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8520, tTLiveToken.name);
            create.add(8521, tTLiveToken.accessToken);
            create.add(8522, tTLiveToken.openId);
            create.add(8523, tTLiveToken.expireAt);
            create.add(8524, tTLiveToken.refreshToken);
            this.f5060a.call(8527, create.build(), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback
    public void onFailed(Throwable th) {
        if (this.f5060a != null && th != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8014, th);
            this.f5060a.call(8528, create.build(), null);
        }
    }
}
