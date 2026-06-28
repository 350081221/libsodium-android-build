package com.bytedance.sdk.openadsdk.c.a.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements CSJSplashAd {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4891a;

    public b(Bridge bridge) {
        this.f4891a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public int getInteractionType() {
        return this.f4891a.values().intValue(110004);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.f4891a.values().objectValue(110005, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public MediationSplashManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.a.a.a.f((Bridge) this.f4891a.call(110110, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public View getSplashCardView() {
        return (View) this.f4891a.values().objectValue(110003, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public int[] getSplashClickEyeSizeToDp() {
        return (int[]) this.f4891a.values().objectValue(110006, int[].class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public View getSplashClickEyeView() {
        return (View) this.f4891a.values().objectValue(110002, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public View getSplashView() {
        return (View) this.f4891a.values().objectValue(110001, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void hideSkipButton() {
        this.f4891a.call(110101, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, d5);
        b5.h(1, str);
        b5.h(2, str2);
        this.f4891a.call(210102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.a(tTAdInteractionListener));
        this.f4891a.call(210104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.b(tTAppDownloadListener));
        this.f4891a.call(110102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4891a.call(210103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setSplashAdListener(CSJSplashAd.SplashAdListener splashAdListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.b.a.a.a.a(splashAdListener));
        this.f4891a.call(110103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setSplashCardListener(CSJSplashAd.SplashCardListener splashCardListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.b.a.a.a.b(splashCardListener));
        this.f4891a.call(110106, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setSplashClickEyeListener(CSJSplashAd.SplashClickEyeListener splashClickEyeListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.b.a.a.a.c(splashClickEyeListener));
        this.f4891a.call(110105, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void showSplashCardView(ViewGroup viewGroup, Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.g(0, viewGroup);
        b5.g(1, activity);
        this.f4891a.call(110109, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void showSplashClickEyeView(ViewGroup viewGroup) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, viewGroup);
        this.f4891a.call(110107, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void showSplashView(ViewGroup viewGroup) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, viewGroup);
        this.f4891a.call(110108, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void startClickEye() {
        this.f4891a.call(110104, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4891a.call(210101, b5.k(), Void.class);
    }
}
