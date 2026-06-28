package com.bytedance.sdk.openadsdk.m.a.a.a;

import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5037a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTRewardVideoAd.RewardAdInteractionListener f5038b;

    public a(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f5038b = rewardAdInteractionListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f5038b;
        if (rewardAdInteractionListener == null) {
            return null;
        }
        switch (i5) {
            case 121101:
                rewardAdInteractionListener.onAdShow();
                break;
            case 121102:
                rewardAdInteractionListener.onAdVideoBarClick();
                break;
            case 121103:
                rewardAdInteractionListener.onAdClose();
                break;
            case 121104:
                rewardAdInteractionListener.onVideoComplete();
                break;
            case 121105:
                rewardAdInteractionListener.onVideoError();
                break;
            case 121106:
                this.f5038b.onRewardVerify(valueSet.booleanValue(0), valueSet.intValue(1), (String) valueSet.objectValue(2, String.class), valueSet.intValue(3), (String) valueSet.objectValue(4, String.class));
                break;
            case 121107:
                this.f5038b.onRewardArrived(valueSet.booleanValue(0), valueSet.intValue(1), (Bundle) valueSet.objectValue(2, Bundle.class));
                break;
            case 121108:
                rewardAdInteractionListener.onSkippedVideo();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5037a;
    }
}
