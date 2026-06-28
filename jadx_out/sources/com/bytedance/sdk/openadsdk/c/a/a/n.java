package com.bytedance.sdk.openadsdk.c.a.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.ComplianceInfo;
import com.bytedance.sdk.openadsdk.DislikeInfo;
import com.bytedance.sdk.openadsdk.DownloadStatusController;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class n implements TTNativeAd {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4905a;

    public n(Bridge bridge) {
        this.f4905a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void destroy() {
        this.f4905a.call(140114, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public Bitmap getAdLogo() {
        return (Bitmap) this.f4905a.values().objectValue(140002, Bitmap.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public View getAdView() {
        return (View) this.f4905a.values().objectValue(140016, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppCommentNum() {
        return this.f4905a.values().intValue(140006);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppScore() {
        return this.f4905a.values().intValue(140005);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppSize() {
        return this.f4905a.values().intValue(140007);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getButtonText() {
        return (String) this.f4905a.values().objectValue(140018, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public ComplianceInfo getComplianceInfo() {
        return new c((Bridge) this.f4905a.values().objectValue(140014, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getDescription() {
        return (String) this.f4905a.values().objectValue(140004, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTAdDislike getDislikeDialog(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        return new h((Bridge) this.f4905a.call(140101, b5.k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public DislikeInfo getDislikeInfo() {
        return new d((Bridge) this.f4905a.values().objectValue(140013, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public DownloadStatusController getDownloadStatusController() {
        return new e((Bridge) this.f4905a.values().objectValue(140015, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTImage getIcon() {
        return new m((Bridge) this.f4905a.values().objectValue(140009, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public List<TTImage> getImageList() {
        List list = (List) this.f4905a.values().objectValue(140010, List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new m((Bridge) it.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getImageMode() {
        return this.f4905a.values().intValue(140012);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getInteractionType() {
        return this.f4905a.values().intValue(140011);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.f4905a.values().objectValue(140017, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public MediationNativeManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.a.a.a.d((Bridge) this.f4905a.call(140116, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getSource() {
        return (String) this.f4905a.values().objectValue(140008, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getTitle() {
        return (String) this.f4905a.values().objectValue(140003, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTImage getVideoCoverImage() {
        return new m((Bridge) this.f4905a.values().objectValue(140001, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, d5);
        b5.h(1, str);
        b5.h(2, str2);
        this.f4905a.call(210102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, viewGroup);
        b5.g(1, view);
        b5.g(2, new com.bytedance.sdk.openadsdk.k.a.a.a.a(adInteractionListener));
        this.f4905a.call(140103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void render() {
        this.f4905a.call(140110, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setActivityForDownloadApp(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        this.f4905a.call(140109, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.a(tTAdInteractionListener));
        this.f4905a.call(210104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.g(0, activity);
        b5.g(1, new com.bytedance.sdk.openadsdk.f.a.a.a.a(dislikeInteractionCallback));
        this.f4905a.call(140112, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, tTDislikeDialogAbstract);
        this.f4905a.call(140113, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.c.a.b.b(tTAppDownloadListener));
        this.f4905a.call(140108, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setEasyPlayWidgetListener(TTNativeAd.EasyPlayWidgetListener easyPlayWidgetListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.k.a.a.a.b(easyPlayWidgetListener));
        this.f4905a.call(140119, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setExpressRenderListener(TTNativeAd.ExpressRenderListener expressRenderListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.k.a.a.a.c(expressRenderListener));
        this.f4905a.call(140111, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4905a.call(210103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void showInteractionExpressAd(Activity activity) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, activity);
        this.f4905a.call(140115, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void uploadDislikeEvent(String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.h(0, str);
        this.f4905a.call(140118, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, d5);
        this.f4905a.call(210101, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTAdDislike getDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, tTDislikeDialogAbstract);
        return new h((Bridge) this.f4905a.call(140102, b5.k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(4);
        b5.g(0, viewGroup);
        b5.g(1, list);
        b5.g(2, list2);
        b5.g(3, new com.bytedance.sdk.openadsdk.k.a.a.a.a(adInteractionListener));
        this.f4905a.call(140104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(5);
        b5.g(0, viewGroup);
        b5.g(1, list);
        b5.g(2, list2);
        b5.g(3, view);
        b5.g(4, new com.bytedance.sdk.openadsdk.k.a.a.a.a(adInteractionListener));
        this.f4905a.call(140105, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(6);
        b5.g(0, viewGroup);
        b5.g(1, list);
        b5.g(2, list2);
        b5.g(3, list3);
        b5.g(4, view);
        b5.g(5, new com.bytedance.sdk.openadsdk.k.a.a.a.a(adInteractionListener));
        this.f4905a.call(140106, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, List<View> list4, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(7);
        b5.g(0, viewGroup);
        b5.g(1, list);
        b5.g(2, list2);
        b5.g(3, list3);
        b5.g(4, list4);
        b5.g(5, view);
        b5.g(6, new com.bytedance.sdk.openadsdk.k.a.a.a.a(adInteractionListener));
        this.f4905a.call(140107, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, TTNativeAd.AdInteractionListener adInteractionListener, IMediationViewBinder iMediationViewBinder) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(7);
        b5.g(0, activity);
        b5.g(1, viewGroup);
        b5.g(2, list);
        b5.g(3, list2);
        b5.g(4, list3);
        b5.g(5, new com.bytedance.sdk.openadsdk.k.a.a.a.a(adInteractionListener));
        b5.g(6, new com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.e(iMediationViewBinder));
        this.f4905a.call(140117, b5.k(), Void.class);
    }
}
