package com.bytedance.sdk.openadsdk.mediation.ad.a.a.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.DislikeInfo;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.c.a.a.d;
import com.bytedance.sdk.openadsdk.c.a.a.h;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.e;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements IMediationNativeAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5149a;

    public a(Bridge bridge) {
        this.f5149a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public String getActionText() {
        return (String) this.f5149a.call(268005, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public int getAdImageMode() {
        return ((Integer) this.f5149a.call(268009, com.bykv.a.a.a.a.b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public String getDescription() {
        return (String) this.f5149a.call(268002, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public MediationAdDislike getDislikeDialog(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        return new b((Bridge) this.f5149a.call(268102, b5.k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public TTAdDislike getDislikeDialog2(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        return new h((Bridge) this.f5149a.call(268018, b5.k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public DislikeInfo getDislikeInfo() {
        return new d((Bridge) this.f5149a.call(268020, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public String getIconUrl() {
        return (String) this.f5149a.call(268003, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public List<String> getImageList() {
        return (List) this.f5149a.call(268007, com.bykv.a.a.a.a.b.b(0).k(), List.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public String getImageUrl() {
        return (String) this.f5149a.call(268004, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public int getInteractionType() {
        return ((Integer) this.f5149a.call(268010, com.bykv.a.a.a.a.b.b(0).k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public MediationNativeAdAppInfo getNativeAdAppInfo() {
        return new c((Bridge) this.f5149a.values().objectValue(268101, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public String getSource() {
        return (String) this.f5149a.call(268008, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public double getStarRating() {
        return ((Double) this.f5149a.call(268006, com.bykv.a.a.a.a.b.b(0).k(), Double.TYPE)).doubleValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public String getTitle() {
        return (String) this.f5149a.call(268001, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public boolean hasDislike() {
        return ((Boolean) this.f5149a.call(268012, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, IMediationViewBinder iMediationViewBinder) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(6);
        b5.g(0, activity);
        b5.g(1, viewGroup);
        b5.g(2, list);
        b5.g(3, list2);
        b5.g(4, list3);
        b5.g(5, new e(iMediationViewBinder));
        this.f5149a.call(268011, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.g(0, activity);
        b5.g(1, new com.bytedance.sdk.openadsdk.f.a.a.a.a(dislikeInteractionCallback));
        this.f5149a.call(268016, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, tTDislikeDialogAbstract);
        this.f5149a.call(268017, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public MediationAdDislike getDislikeDialog(Activity activity, Map<String, Object> map) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.g(0, activity);
        b5.g(1, map);
        return new b((Bridge) this.f5149a.call(268103, b5.k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo
    public TTAdDislike getDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, tTDislikeDialogAbstract);
        return new h((Bridge) this.f5149a.call(268019, b5.k(), Bridge.class));
    }
}
