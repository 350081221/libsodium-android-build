package com.bytedance.mtesttools.b;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;

/* loaded from: classes2.dex */
public class j extends h {

    /* renamed from: a, reason: collision with root package name */
    private TTRewardVideoAd f4161a;

    /* renamed from: b, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4162b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4163c;

    /* renamed from: d, reason: collision with root package name */
    private String f4164d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f4165e;

    /* renamed from: f, reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f4166f = new b();

    /* renamed from: g, reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f4167g = new c();

    /* loaded from: classes2.dex */
    class b implements TTRewardVideoAd.RewardAdInteractionListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdClose() {
            com.bytedance.mtesttools.b.c.b("onRewardedAdClosed", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardedAdClosed", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdShow() {
            com.bytedance.mtesttools.b.c.b("onRewardedAdShow", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardedAdShow", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdVideoBarClick() {
            com.bytedance.mtesttools.b.c.b("onRewardClick", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardArrived(boolean z4, int i5, Bundle bundle) {
            j.this.f4165e = bundle;
            j.this.f4165e.putBoolean("rewardVeridy", z4);
            com.bytedance.mtesttools.b.c.b("onRewardVerify", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardVerify", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardVerify(boolean z4, int i5, String str, int i6, String str2) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onSkippedVideo() {
            com.bytedance.mtesttools.b.c.b("onSkippedVideo", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onSkippedVideo", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoComplete() {
            com.bytedance.mtesttools.b.c.b("onVideoComplete", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onVideoComplete", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoError() {
            com.bytedance.mtesttools.b.c.a("onVideoError", new com.bytedance.mtesttools.b.a(-1, "video play error"));
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onVideoError", new com.bytedance.mtesttools.b.a(-1, "video play error"));
        }
    }

    /* loaded from: classes2.dex */
    class c implements TTRewardVideoAd.RewardAdInteractionListener {
        c() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdClose() {
            com.bytedance.mtesttools.b.c.b("在看一次 onRewardedAdClosed", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardedAdClosed-----2", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdShow() {
            com.bytedance.mtesttools.b.c.b("在看一次 onRewardedAdShow", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardedAdShow-----2", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdVideoBarClick() {
            com.bytedance.mtesttools.b.c.b("在看一次 onRewardClick", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardClick-----2", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardArrived(boolean z4, int i5, Bundle bundle) {
            j.this.f4165e = bundle;
            j.this.f4165e.putBoolean("rewardVeridy", z4);
            com.bytedance.mtesttools.b.c.b("在看一次 onVideoComplete", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onRewardVerify-----2", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardVerify(boolean z4, int i5, String str, int i6, String str2) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onSkippedVideo() {
            com.bytedance.mtesttools.b.c.b("在看一次 onSkippedVideo", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onSkippedVideo-----2", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoComplete() {
            com.bytedance.mtesttools.b.c.b("在看一次 onVideoComplete", j.this.f4164d, j.this.f4161a.getMediationManager().getShowEcpm(), j.this.f4165e);
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onVideoComplete-----2", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoError() {
            com.bytedance.mtesttools.b.c.a("在看一次 onVideoError", new com.bytedance.mtesttools.b.a(-1, "video play error"));
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.b("onVideoError-----2", new com.bytedance.mtesttools.b.a(-1, "video play error"));
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        TTRewardVideoAd tTRewardVideoAd = this.f4161a;
        if (tTRewardVideoAd != null && (showEcpm = tTRewardVideoAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        TTRewardVideoAd tTRewardVideoAd = this.f4161a;
        if (tTRewardVideoAd != null) {
            tTRewardVideoAd.setRewardAdInteractionListener(this.f4166f);
            this.f4161a.setRewardPlayAgainInteractionListener(this.f4167g);
            this.f4161a.showRewardVideoAd(activity);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public void c(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        this.f4162b = bVar;
        this.f4164d = fVar.d();
        TTAdSdk.getAdManager().createAdNative(activity).loadRewardVideoAd(new AdSlot.Builder().setCodeId(this.f4164d).setUserID("test tools").setRewardAmount(123).setRewardName("rewardName").setMediationAdSlot(new MediationAdSlot.Builder().setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setScenarioId("test tools").setUseSurfaceView(false).setMuted(true).setBidNotify(true).setExtraObject(MediationConstant.ADN_PANGLE, "pangle reward custom data").setExtraObject(MediationConstant.ADN_SIGMOB, "sigmob reward custom data").setExtraObject(MediationConstant.ADN_KS, "ks reward custom data").setExtraObject(MediationConstant.ADN_GDT, "gdt reward custom data").build()).build(), new a());
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4164d;
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        TTRewardVideoAd tTRewardVideoAd = this.f4161a;
        if (tTRewardVideoAd != null) {
            return tTRewardVideoAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        TTRewardVideoAd tTRewardVideoAd = this.f4161a;
        if (tTRewardVideoAd != null && (showEcpm = tTRewardVideoAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public Bundle h() {
        return this.f4165e;
    }

    @Override // com.bytedance.mtesttools.b.h
    public boolean i() {
        TTRewardVideoAd tTRewardVideoAd;
        return this.f4163c && (tTRewardVideoAd = this.f4161a) != null && tTRewardVideoAd.getMediationManager().isReady();
    }

    /* loaded from: classes2.dex */
    class a implements TTAdNative.RewardVideoAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onError(int i5, String str) {
            com.bytedance.mtesttools.b.c.a("onRewardVideoLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            j.this.f4163c = false;
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.a("onRewardVideoLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
            j.this.f4161a = tTRewardVideoAd;
            j.this.f4163c = true;
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.a("onRewardVideoAdLoad", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached() {
            j.this.f4163c = true;
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.a("onRewardVideoCached", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached(TTRewardVideoAd tTRewardVideoAd) {
            j.this.f4163c = true;
            if (j.this.f4162b == null) {
                return;
            }
            j.this.f4162b.a("onRewardVideoCached", null);
        }
    }
}
