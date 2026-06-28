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
public class g extends h {

    /* renamed from: a, reason: collision with root package name */
    private TTFullScreenVideoAd f4145a;

    /* renamed from: b, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4146b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4147c;

    /* renamed from: d, reason: collision with root package name */
    private String f4148d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f4149e;

    /* renamed from: f, reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f4150f = new b();

    /* loaded from: classes2.dex */
    class a implements TTAdNative.FullScreenVideoAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onError(int i5, String str) {
            c.a("onFullVideoLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            g.this.f4147c = false;
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.a("onFullVideoLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            g.this.f4147c = true;
            g.this.f4145a = tTFullScreenVideoAd;
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.a("onFullVideoAdLoad", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached() {
            g.this.f4147c = true;
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.a("onFullVideoCached", null);
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
            c.b("onFullVideoAdClosed", g.this.f4148d, g.this.f4145a.getMediationManager().getShowEcpm(), g.this.f4149e);
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.b("onFullVideoAdClosed", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdShow() {
            c.b("onFullVideoAdShow", g.this.f4148d, g.this.f4145a.getMediationManager().getShowEcpm(), g.this.f4149e);
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.b("onFullVideoAdShow", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() {
            c.b("onFullVideoAdClick", g.this.f4148d, g.this.f4145a.getMediationManager().getShowEcpm(), g.this.f4149e);
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.b("onFullVideoAdClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onSkippedVideo() {
            c.b("onSkippedVideo", g.this.f4148d, g.this.f4145a.getMediationManager().getShowEcpm(), g.this.f4149e);
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.b("onSkippedVideo", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoComplete() {
            c.b("onVideoComplete", g.this.f4148d, g.this.f4145a.getMediationManager().getShowEcpm(), g.this.f4149e);
            if (g.this.f4146b == null) {
                return;
            }
            g.this.f4146b.b("onVideoComplete", null);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        TTFullScreenVideoAd tTFullScreenVideoAd = this.f4145a;
        if (tTFullScreenVideoAd != null && (showEcpm = tTFullScreenVideoAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        TTFullScreenVideoAd tTFullScreenVideoAd;
        if (this.f4147c && (tTFullScreenVideoAd = this.f4145a) != null && tTFullScreenVideoAd.getMediationManager().isReady()) {
            this.f4145a.setFullScreenVideoAdInteractionListener(this.f4150f);
            this.f4145a.showFullScreenVideoAd(activity);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public void c(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        this.f4146b = bVar;
        this.f4148d = fVar.d();
        TTAdSdk.getAdManager().createAdNative(activity).loadFullScreenVideoAd(new AdSlot.Builder().setCodeId(this.f4148d).setUserID("testTools").setMediationAdSlot(new MediationAdSlot.Builder().setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setScenarioId("test tools").setBidNotify(true).build()).build(), new a());
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4148d;
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        TTFullScreenVideoAd tTFullScreenVideoAd = this.f4145a;
        if (tTFullScreenVideoAd != null) {
            return tTFullScreenVideoAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        TTFullScreenVideoAd tTFullScreenVideoAd = this.f4145a;
        if (tTFullScreenVideoAd != null && (showEcpm = tTFullScreenVideoAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public Bundle h() {
        return this.f4149e;
    }

    @Override // com.bytedance.mtesttools.b.h
    public boolean i() {
        TTFullScreenVideoAd tTFullScreenVideoAd;
        return this.f4147c && (tTFullScreenVideoAd = this.f4145a) != null && tTFullScreenVideoAd.getMediationManager().isReady();
    }
}
