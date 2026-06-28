package com.bytedance.sdk.openadsdk.c.a.a;

import android.app.Activity;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationRewardManager;
import java.util.Map;

/* loaded from: classes2.dex */
public class p implements TTRewardVideoAd {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4907a;

    public p(Bridge bridge) {
        this.f4907a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public long getExpirationTimestamp() {
        return this.f4907a.values().longValue(120004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public int getInteractionType() {
        return this.f4907a.values().intValue(120001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.f4907a.values().objectValue(120002, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public MediationRewardManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.a.a.a.e((Bridge) this.f4907a.call(121109, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public int getRewardVideoAdType() {
        return this.f4907a.values().intValue(120003);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, d5);
        b5.h(1, str);
        b5.h(2, str2);
        this.f4907a.call(210102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.a(tTAdInteractionListener));
        this.f4907a.call(210104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.b(tTAppDownloadListener));
        this.f4907a.call(120104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4907a.call(210103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.m.a.a.a.a(rewardAdInteractionListener));
        this.f4907a.call(120101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardPlayAgainController(TTRewardVideoAd.RewardAdPlayAgainController rewardAdPlayAgainController) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.m.a.a.a.b(rewardAdPlayAgainController));
        this.f4907a.call(120103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardPlayAgainInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.m.a.a.a.a(rewardAdInteractionListener));
        this.f4907a.call(120102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setShowDownLoadBar(boolean z4) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.i(0, z4);
        this.f4907a.call(120107, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void showRewardVideoAd(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        this.f4907a.call(120105, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4907a.call(210101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, activity);
        b5.g(1, ritScenes);
        b5.h(2, str);
        this.f4907a.call(120106, b5.k(), Void.class);
    }
}
