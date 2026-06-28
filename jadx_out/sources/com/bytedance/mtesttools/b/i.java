package com.bytedance.mtesttools.b;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;

/* loaded from: classes2.dex */
public class i extends h {

    /* renamed from: a, reason: collision with root package name */
    private TTFullScreenVideoAd f4153a;

    /* renamed from: b, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4154b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4155c;

    /* renamed from: d, reason: collision with root package name */
    private String f4156d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f4157e;

    /* renamed from: f, reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f4158f = new b();

    /* loaded from: classes2.dex */
    class a implements TTAdNative.FullScreenVideoAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onError(int i5, String str) {
            c.a("onInterstitialFullLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            i.this.f4155c = false;
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.a("onInterstitialFullLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            i.this.f4155c = true;
            i.this.f4153a = tTFullScreenVideoAd;
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.a("onInterstitialFullAdLoad", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached() {
            i.this.f4155c = true;
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.a("onInterstitialFullCached", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached(TTFullScreenVideoAd tTFullScreenVideoAd) {
        }
    }

    /* loaded from: classes2.dex */
    class b implements TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdClose() {
            c.b("onInterstitialFullClosed", i.this.f4156d, i.this.f4153a.getMediationManager().getShowEcpm(), i.this.f4157e);
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.b("onInterstitialFullClosed", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdShow() {
            c.b("onIntersitialFullShow", i.this.f4156d, i.this.f4153a.getMediationManager().getShowEcpm(), i.this.f4157e);
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.b("onInterstitialFullShow", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() {
            c.b("onInterstitialFullClick", i.this.f4156d, i.this.f4153a.getMediationManager().getShowEcpm(), i.this.f4157e);
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.b("onInterstitialFullClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onSkippedVideo() {
            c.b("onSkippedVideo", i.this.f4156d, i.this.f4153a.getMediationManager().getShowEcpm(), i.this.f4157e);
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.b("onSkippedVideo", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoComplete() {
            c.b("onVideoComplete", i.this.f4156d, i.this.f4153a.getMediationManager().getShowEcpm(), i.this.f4157e);
            if (i.this.f4154b == null) {
                return;
            }
            i.this.f4154b.b("onVideoComplete", null);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        TTFullScreenVideoAd tTFullScreenVideoAd = this.f4153a;
        if (tTFullScreenVideoAd != null && (showEcpm = tTFullScreenVideoAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        TTFullScreenVideoAd tTFullScreenVideoAd;
        if (this.f4155c && (tTFullScreenVideoAd = this.f4153a) != null && tTFullScreenVideoAd.getMediationManager().isReady()) {
            this.f4153a.setFullScreenVideoAdInteractionListener(this.f4158f);
            this.f4153a.showFullScreenVideoAd(activity);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public void c(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        this.f4154b = bVar;
        this.f4156d = fVar.d();
        TTAdSdk.getAdManager().createAdNative(activity).loadFullScreenVideoAd(new AdSlot.Builder().setCodeId(this.f4156d).setUserID("testTools").setMediationAdSlot(new MediationAdSlot.Builder().setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setScenarioId("test tools").setBidNotify(true).build()).build(), new a());
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4156d;
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        TTFullScreenVideoAd tTFullScreenVideoAd = this.f4153a;
        if (tTFullScreenVideoAd != null) {
            return tTFullScreenVideoAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        TTFullScreenVideoAd tTFullScreenVideoAd = this.f4153a;
        if (tTFullScreenVideoAd != null && (showEcpm = tTFullScreenVideoAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public Bundle h() {
        return this.f4157e;
    }

    @Override // com.bytedance.mtesttools.b.h
    public boolean i() {
        TTFullScreenVideoAd tTFullScreenVideoAd;
        return this.f4155c && (tTFullScreenVideoAd = this.f4153a) != null && tTFullScreenVideoAd.getMediationManager().isReady();
    }
}
