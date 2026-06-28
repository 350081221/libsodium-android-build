package com.bytedance.sdk.openadsdk.i.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTFeedAd;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5001a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTFeedAd.VideoRewardListener f5002b;

    public b(TTFeedAd.VideoRewardListener videoRewardListener) {
        this.f5002b = videoRewardListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5002b == null) {
            return null;
        }
        if (i5 == 163101) {
            this.f5002b.onFeedRewardCountDown(valueSet.intValue(0));
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5001a;
    }
}
