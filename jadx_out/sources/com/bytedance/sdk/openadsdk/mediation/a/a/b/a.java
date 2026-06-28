package com.bytedance.sdk.openadsdk.mediation.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawAdTokenCallback;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5067a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationDrawAdTokenCallback f5068b;

    public a(IMediationDrawAdTokenCallback iMediationDrawAdTokenCallback) {
        this.f5068b = iMediationDrawAdTokenCallback;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5068b == null) {
            return null;
        }
        switch (i5) {
            case 270029:
                this.f5068b.onAdTokenLoaded((String) valueSet.objectValue(0, String.class), new com.bytedance.sdk.openadsdk.mediation.a.a.a.a((Bridge) valueSet.objectValue(1, Bridge.class)));
                break;
            case 270030:
                this.f5068b.onAdTokenLoadedFail(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5067a;
    }
}
