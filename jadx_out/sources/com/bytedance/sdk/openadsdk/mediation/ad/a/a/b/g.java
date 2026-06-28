package com.bytedance.sdk.openadsdk.mediation.ad.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationShakeViewListener;

/* loaded from: classes2.dex */
public class g implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5164a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final MediationShakeViewListener f5165b;

    public g(MediationShakeViewListener mediationShakeViewListener) {
        this.f5165b = mediationShakeViewListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        MediationShakeViewListener mediationShakeViewListener = this.f5165b;
        if (mediationShakeViewListener == null) {
            return null;
        }
        if (i5 == 270012) {
            mediationShakeViewListener.onDismissed();
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5164a;
    }
}
