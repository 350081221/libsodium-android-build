package com.bytedance.sdk.openadsdk.g.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.c.a.a.p;

/* loaded from: classes2.dex */
public class f implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4994a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.RewardVideoAdListener f4995b;

    public f(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f4995b = rewardVideoAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTAdNative.RewardVideoAdListener rewardVideoAdListener = this.f4995b;
        if (rewardVideoAdListener == null) {
            return null;
        }
        switch (i5) {
            case 124101:
                this.f4995b.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 124102:
                this.f4995b.onRewardVideoAdLoad(new p((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 124103:
                this.f4995b.onRewardVideoCached(new p((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 124104:
                rewardVideoAdListener.onRewardVideoCached();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4994a;
    }
}
