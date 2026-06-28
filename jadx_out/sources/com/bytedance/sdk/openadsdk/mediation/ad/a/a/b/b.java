package com.bytedance.sdk.openadsdk.mediation.ad.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5154a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationDislikeCallback f5155b;

    public b(IMediationDislikeCallback iMediationDislikeCallback) {
        this.f5155b = iMediationDislikeCallback;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        IMediationDislikeCallback iMediationDislikeCallback = this.f5155b;
        if (iMediationDislikeCallback == null) {
            return null;
        }
        switch (i5) {
            case 268013:
                this.f5155b.onSelected(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 268014:
                iMediationDislikeCallback.onCancel();
                break;
            case 268015:
                iMediationDislikeCallback.onShow();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5154a;
    }
}
