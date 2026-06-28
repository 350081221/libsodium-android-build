package com.bytedance.sdk.openadsdk.c.a.a;

import android.app.Activity;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.DislikeInfo;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o implements TTNativeExpressAd {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4906a;

    public o(Bridge bridge) {
        this.f4906a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void destroy() {
        this.f4906a.call(150105, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public TTAdDislike getDislikeDialog(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        return new h((Bridge) this.f4906a.call(150108, b5.k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public DislikeInfo getDislikeInfo() {
        return new d((Bridge) this.f4906a.values().objectValue(150003, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public View getExpressAdView() {
        return (View) this.f4906a.values().objectValue(150001, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getImageMode() {
        return this.f4906a.values().intValue(150002);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getInteractionType() {
        return this.f4906a.values().intValue(150004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.f4906a.values().objectValue(150005, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public MediationNativeManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.a.a.a.d((Bridge) this.f4906a.call(150113, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, d5);
        b5.h(1, str);
        b5.h(2, str2);
        this.f4906a.call(210102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void registerClickableRects(JSONObject jSONObject) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, jSONObject);
        this.f4906a.call(150115, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void render() {
        this.f4906a.call(150104, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.a(tTAdInteractionListener));
        this.f4906a.call(210104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setCanInterruptVideoPlay(boolean z4) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.i(0, z4);
        this.f4906a.call(150112, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.g(0, activity);
        b5.g(1, new com.bytedance.sdk.openadsdk.f.a.a.a.a(dislikeInteractionCallback));
        this.f4906a.call(150106, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, tTDislikeDialogAbstract);
        this.f4906a.call(150107, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.b(tTAppDownloadListener));
        this.f4906a.call(150103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.l.a.a.a.b(expressAdInteractionListener));
        this.f4906a.call(150101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4906a.call(210103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setSlideIntervalTime(int i5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.e(0, i5);
        this.f4906a.call(150110, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.l.a.a.a.c(expressVideoAdListener));
        this.f4906a.call(150111, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void showInteractionExpressAd(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        this.f4906a.call(150109, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void unRegisterRects() {
        this.f4906a.call(150116, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void uploadDislikeEvent(String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.h(0, str);
        this.f4906a.call(150114, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4906a.call(210101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.l.a.a.a.a(adInteractionListener));
        this.f4906a.call(150102, b5.k(), Void.class);
    }
}
