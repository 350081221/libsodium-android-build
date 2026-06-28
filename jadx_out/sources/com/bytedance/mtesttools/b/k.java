package com.bytedance.mtesttools.b;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;

/* loaded from: classes2.dex */
public class k extends h {

    /* renamed from: a, reason: collision with root package name */
    private CSJSplashAd f4171a;

    /* renamed from: b, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4172b;

    /* renamed from: c, reason: collision with root package name */
    private String f4173c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f4174d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f4175e;

    /* renamed from: f, reason: collision with root package name */
    CSJSplashAd.SplashAdListener f4176f = new b();

    /* renamed from: g, reason: collision with root package name */
    CSJSplashAd.SplashCardListener f4177g = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements TTAdNative.CSJSplashAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
        public void onSplashLoadFail(CSJAdError cSJAdError) {
            int i5;
            String str;
            if (cSJAdError != null) {
                i5 = cSJAdError.getCode();
                str = cSJAdError.getMsg();
            } else {
                i5 = -1;
                str = "";
            }
            com.bytedance.mtesttools.b.c.a("onSplashAdLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            if (k.this.f4172b != null) {
                k.this.f4172b.a("onSplashAdLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
        public void onSplashLoadSuccess(CSJSplashAd cSJSplashAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
        public void onSplashRenderFail(CSJSplashAd cSJSplashAd, CSJAdError cSJAdError) {
            int i5;
            String str;
            if (cSJAdError != null) {
                i5 = cSJAdError.getCode();
                str = cSJAdError.getMsg();
            } else {
                i5 = -1;
                str = "";
            }
            com.bytedance.mtesttools.b.c.a("onSplashAdLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            if (k.this.f4172b != null) {
                k.this.f4172b.a("onSplashAdLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
        public void onSplashRenderSuccess(CSJSplashAd cSJSplashAd) {
            k.this.f4171a = cSJSplashAd;
            if (k.this.f4172b == null) {
                return;
            }
            k.this.f4172b.a("onSplashAdLoadSuccess", null);
        }
    }

    /* loaded from: classes2.dex */
    class b implements CSJSplashAd.SplashAdListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
        public void onSplashAdClick(CSJSplashAd cSJSplashAd) {
            if (k.this.f4172b == null) {
                return;
            }
            k.this.f4172b.b("onAdClicked", null);
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
        public void onSplashAdClose(CSJSplashAd cSJSplashAd, int i5) {
            com.bytedance.mtesttools.b.c.b("onAdDismiss", k.this.f4173c, k.this.f4171a.getMediationManager().getShowEcpm(), null);
            if (k.this.f4172b == null) {
                return;
            }
            k.this.f4172b.b("onAdDismiss", null);
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
        public void onSplashAdShow(CSJSplashAd cSJSplashAd) {
            if (k.this.f4172b == null) {
                return;
            }
            k.this.f4172b.b("onAdShow", null);
        }
    }

    /* loaded from: classes2.dex */
    class c implements CSJSplashAd.SplashCardListener {
        c() {
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
        public void onSplashCardClick() {
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
        public void onSplashCardClose() {
        }

        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
        public void onSplashCardReadyToShow(CSJSplashAd cSJSplashAd) {
            k.this.f4171a.showSplashCardView(k.this.f4174d, k.this.f4175e);
        }
    }

    private int k(Context context) {
        if (context == null) {
            return 1080;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private int n(Context context) {
        if (context == null) {
            return 1920;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        CSJSplashAd cSJSplashAd = this.f4171a;
        if (cSJSplashAd != null && (showEcpm = cSJSplashAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        CSJSplashAd cSJSplashAd = this.f4171a;
        if (cSJSplashAd != null) {
            this.f4175e = activity;
            this.f4174d = viewGroup;
            cSJSplashAd.setSplashAdListener(this.f4176f);
            this.f4171a.setSplashCardListener(this.f4177g);
            this.f4171a.showSplashView(viewGroup);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public void c(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        this.f4172b = bVar;
        this.f4173c = fVar.d();
        TTAdSdk.getAdManager().createAdNative(activity).loadSplashAd(new AdSlot.Builder().setCodeId(this.f4173c).setImageAcceptedSize(k(activity), n(activity)).setMediationAdSlot(new MediationAdSlot.Builder().setBidNotify(true).setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setMuted(true).setScenarioId("testTools").build()).build(), new a(), 3000);
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4173c;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void e(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        c(activity, fVar, i5, i6, bVar);
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        CSJSplashAd cSJSplashAd = this.f4171a;
        if (cSJSplashAd != null) {
            return cSJSplashAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        CSJSplashAd cSJSplashAd = this.f4171a;
        if (cSJSplashAd != null && (showEcpm = cSJSplashAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }
}
