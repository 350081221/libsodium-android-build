package com.bytedance.sdk.openadsdk.mediation.a.a.b;

import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.IMediationInterstitialFullAdListener;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5069a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationInterstitialFullAdListener f5070b;

    public b(IMediationInterstitialFullAdListener iMediationInterstitialFullAdListener) {
        this.f5070b = iMediationInterstitialFullAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        IMediationInterstitialFullAdListener iMediationInterstitialFullAdListener = this.f5070b;
        if (iMediationInterstitialFullAdListener == null) {
            return null;
        }
        switch (i5) {
            case 131101:
                iMediationInterstitialFullAdListener.onAdShow();
                break;
            case 131102:
                iMediationInterstitialFullAdListener.onAdVideoBarClick();
                break;
            case 131103:
                iMediationInterstitialFullAdListener.onAdClose();
                break;
            case 131104:
                iMediationInterstitialFullAdListener.onVideoComplete();
                break;
            case 131105:
                iMediationInterstitialFullAdListener.onSkippedVideo();
                break;
            case 131106:
                this.f5070b.onInterstitialFullShowFail(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 131107:
                iMediationInterstitialFullAdListener.onVideoError();
                break;
            case 131108:
                iMediationInterstitialFullAdListener.onAdOpened();
                break;
            case 131109:
                iMediationInterstitialFullAdListener.onAdLeftApplication();
                break;
            case 131110:
                this.f5070b.onRewardVerify((Bundle) valueSet.objectValue(0, Bundle.class));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5069a;
    }
}
