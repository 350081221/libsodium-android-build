package com.bytedance.sdk.openadsdk.mediation.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeAdTokenCallback;

/* loaded from: classes2.dex */
public class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5071a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationNativeAdTokenCallback f5072b;

    public c(IMediationNativeAdTokenCallback iMediationNativeAdTokenCallback) {
        this.f5072b = iMediationNativeAdTokenCallback;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5072b == null) {
            return null;
        }
        switch (i5) {
            case 270026:
                this.f5072b.onAdTokenLoaded((String) valueSet.objectValue(0, String.class), new com.bytedance.sdk.openadsdk.mediation.a.a.a.c((Bridge) valueSet.objectValue(1, Bridge.class)));
                break;
            case 270027:
                this.f5072b.onAdTokenLoadedFail(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5071a;
    }
}
