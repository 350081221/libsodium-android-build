package com.bytedance.sdk.openadsdk.mediation;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;

/* loaded from: classes2.dex */
public class MediationDislikeCallbackImpl implements Bridge, IMediationDislikeCallback {

    /* renamed from: a, reason: collision with root package name */
    private IMediationDislikeCallback f5050a;

    public MediationDislikeCallbackImpl(IMediationDislikeCallback iMediationDislikeCallback) {
        this.f5050a = iMediationDislikeCallback;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 == 8188) {
            onSelected(valueSet.intValue(8038), valueSet.stringValue(8039));
            return null;
        }
        if (i5 == 8189) {
            onCancel();
            return null;
        }
        if (i5 == 8190) {
            onShow();
            return null;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onCancel() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onSelected(int i5, String str) {
        IMediationDislikeCallback iMediationDislikeCallback = this.f5050a;
        if (iMediationDislikeCallback != null) {
            iMediationDislikeCallback.onSelected(i5, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onShow() {
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
