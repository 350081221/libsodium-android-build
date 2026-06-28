package com.bytedance.sdk.openadsdk.c.a.a;

import android.app.Activity;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationFullScreenManager;
import java.util.Map;

/* loaded from: classes2.dex */
public class l implements TTFullScreenVideoAd {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4903a;

    public l(Bridge bridge) {
        this.f4903a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public long getExpirationTimestamp() {
        return this.f4903a.values().longValue(130004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public int getFullVideoAdType() {
        return this.f4903a.values().intValue(130003);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public int getInteractionType() {
        return this.f4903a.values().intValue(130001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.f4903a.values().objectValue(130002, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public MediationFullScreenManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.a.a.a.c((Bridge) this.f4903a.call(130106, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, d5);
        b5.h(1, str);
        b5.h(2, str2);
        this.f4903a.call(210102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.a(tTAdInteractionListener));
        this.f4903a.call(210104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.b(tTAppDownloadListener));
        this.f4903a.call(130102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.j.a.a.a.a(fullScreenVideoAdInteractionListener));
        this.f4903a.call(130101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4903a.call(210103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setShowDownLoadBar(boolean z4) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.i(0, z4);
        this.f4903a.call(130105, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void showFullScreenVideoAd(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        this.f4903a.call(130103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4903a.call(210101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, activity);
        b5.g(1, ritScenes);
        b5.h(2, str);
        this.f4903a.call(130104, b5.k(), Void.class);
    }
}
