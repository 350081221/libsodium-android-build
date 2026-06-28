package com.bytedance.mtesttools.b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeAdInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeToBannerListener;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.bytedance.mtesttools.b.h {

    /* renamed from: a, reason: collision with root package name */
    private TTNativeExpressAd f4054a;

    /* renamed from: b, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4055b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f4056c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f4057d;

    /* renamed from: e, reason: collision with root package name */
    private String f4058e;

    /* renamed from: f, reason: collision with root package name */
    TTNativeExpressAd.ExpressAdInteractionListener f4059f = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends MediationNativeToBannerListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeToBannerListener, com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeToBannerListener
        public View getMediationBannerViewFromNativeAd(IMediationNativeAdInfo iMediationNativeAdInfo) {
            return d.this.m(iMediationNativeAdInfo);
        }
    }

    /* loaded from: classes2.dex */
    class b implements TTAdNative.NativeExpressAdListener {

        /* loaded from: classes2.dex */
        class a implements TTAdDislike.DislikeInteractionCallback {
            a() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onCancel() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onSelected(int i5, String str, boolean z4) {
                com.bytedance.mtesttools.b.c.b("onAdClosed", d.this.f4058e, d.this.f4054a.getMediationManager().getShowEcpm(), null);
                if (d.this.f4057d != null) {
                    d.this.f4057d.removeAllViews();
                }
                if (d.this.f4054a != null) {
                    d.this.f4054a.destroy();
                }
                if (d.this.f4055b == null) {
                    return;
                }
                d.this.f4055b.b("onAdClosed", null);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onShow() {
            }
        }

        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
        public void onError(int i5, String str) {
            com.bytedance.mtesttools.b.c.a("onAdFailedToLoad", new com.bytedance.mtesttools.b.a(i5, str));
            if (d.this.f4055b == null) {
                return;
            }
            d.this.f4055b.a("onAdFailedToLoad", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
        public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
            if (list != null && list.size() > 0) {
                d.this.f4054a = list.get(0);
                d.this.f4054a.setExpressInteractionListener(d.this.f4059f);
                d.this.f4054a.setDislikeCallback(d.this.f4056c, new a());
                if (d.this.f4055b == null) {
                    return;
                }
                d.this.f4055b.a("onAdLoaded", null);
                return;
            }
            if (d.this.f4055b == null) {
                return;
            }
            d.this.f4055b.a("onAdFailedToLoad", new com.bytedance.mtesttools.b.a());
        }
    }

    /* loaded from: classes2.dex */
    class c implements TTNativeExpressAd.ExpressAdInteractionListener {
        c() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onAdClicked(View view, int i5) {
            com.bytedance.mtesttools.b.c.b("onAdClicked", d.this.f4058e, d.this.f4054a.getMediationManager().getShowEcpm(), null);
            if (d.this.f4055b == null) {
                return;
            }
            d.this.f4055b.b("onAdClicked", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onAdShow(View view, int i5) {
            com.bytedance.mtesttools.b.c.b("onAdShow", d.this.f4058e, d.this.f4054a.getMediationManager().getShowEcpm(), null);
            if (d.this.f4055b == null) {
                return;
            }
            d.this.f4055b.b("onAdShow", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onRenderFail(View view, String str, int i5) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onRenderSuccess(View view, float f5, float f6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.mtesttools.b.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC0106d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediationAdDislike f4064a;

        ViewOnClickListenerC0106d(MediationAdDislike mediationAdDislike) {
            this.f4064a = mediationAdDislike;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4064a.showDislikeDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        MediationViewBinder f4066a;

        /* renamed from: b, reason: collision with root package name */
        ImageView f4067b;

        /* renamed from: c, reason: collision with root package name */
        ImageView f4068c;

        /* renamed from: d, reason: collision with root package name */
        Button f4069d;

        /* renamed from: e, reason: collision with root package name */
        TextView f4070e;

        /* renamed from: f, reason: collision with root package name */
        TextView f4071f;

        /* renamed from: g, reason: collision with root package name */
        TextView f4072g;

        /* renamed from: h, reason: collision with root package name */
        RelativeLayout f4073h;

        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f extends e {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4074i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f4075j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f4076k;

        private f() {
            super(null);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class g extends e {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4077i;

        private g() {
            super(null);
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class h extends e {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4078i;

        private h() {
            super(null);
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class i extends e {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4079i;

        private i() {
            super(null);
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class j extends e {

        /* renamed from: i, reason: collision with root package name */
        FrameLayout f4080i;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    private View k(ViewGroup viewGroup, @NonNull IMediationNativeAdInfo iMediationNativeAdInfo) {
        LayoutInflater from = LayoutInflater.from(this.f4056c);
        int i5 = R.layout.S0;
        View inflate = from.inflate(i5, viewGroup, false);
        i iVar = new i(null);
        int i6 = R.id.G4;
        iVar.f4070e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        iVar.f4072g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        iVar.f4071f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        iVar.f4079i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        iVar.f4067b = (ImageView) inflate.findViewById(i10);
        iVar.f4068c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        iVar.f4069d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        iVar.f4073h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i8).mainImageId(i9).iconImageId(i10).callToActionId(i11).sourceId(i7).logoLayoutId(i12).build();
        iVar.f4066a = build;
        p(inflate, iVar, iMediationNativeAdInfo, build);
        if (iMediationNativeAdInfo.getImageUrl() != null) {
            i1.a.c(iVar.f4079i, iMediationNativeAdInfo.getImageUrl());
        }
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View m(IMediationNativeAdInfo iMediationNativeAdInfo) {
        if (iMediationNativeAdInfo.getAdImageMode() == 2) {
            return w(null, iMediationNativeAdInfo);
        }
        if (iMediationNativeAdInfo.getAdImageMode() == 3) {
            return t(null, iMediationNativeAdInfo);
        }
        if (iMediationNativeAdInfo.getAdImageMode() == 4) {
            return u(null, iMediationNativeAdInfo);
        }
        if (iMediationNativeAdInfo.getAdImageMode() == 5) {
            return q(null, iMediationNativeAdInfo);
        }
        if (iMediationNativeAdInfo.getAdImageMode() == 16) {
            return k(null, iMediationNativeAdInfo);
        }
        if (iMediationNativeAdInfo.getAdImageMode() != 15) {
            return null;
        }
        return q(null, iMediationNativeAdInfo);
    }

    private void p(View view, e eVar, IMediationNativeAdInfo iMediationNativeAdInfo, MediationViewBinder mediationViewBinder) {
        String source;
        String actionText;
        String actionText2;
        if (iMediationNativeAdInfo.hasDislike()) {
            MediationAdDislike dislikeDialog = iMediationNativeAdInfo.getDislikeDialog(this.f4056c);
            eVar.f4068c.setVisibility(0);
            eVar.f4068c.setOnClickListener(new ViewOnClickListenerC0106d(dislikeDialog));
        } else {
            ImageView imageView = eVar.f4068c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(eVar.f4072g);
        arrayList.add(eVar.f4070e);
        arrayList.add(eVar.f4071f);
        arrayList.add(eVar.f4067b);
        if (eVar instanceof g) {
            arrayList.add(((g) eVar).f4077i);
        } else if (eVar instanceof h) {
            arrayList.add(((h) eVar).f4078i);
        } else if (eVar instanceof i) {
            arrayList.add(((i) eVar).f4079i);
        } else if (eVar instanceof j) {
            arrayList.add(((j) eVar).f4080i);
        } else if (eVar instanceof f) {
            f fVar = (f) eVar;
            arrayList.add(fVar.f4074i);
            arrayList.add(fVar.f4075j);
            arrayList.add(fVar.f4076k);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(eVar.f4069d);
        iMediationNativeAdInfo.registerView(this.f4056c, (ViewGroup) view, arrayList, arrayList2, null, mediationViewBinder);
        eVar.f4070e.setText(iMediationNativeAdInfo.getTitle());
        eVar.f4071f.setText(iMediationNativeAdInfo.getDescription());
        TextView textView = eVar.f4072g;
        if (TextUtils.isEmpty(iMediationNativeAdInfo.getSource())) {
            source = "广告来源";
        } else {
            source = iMediationNativeAdInfo.getSource();
        }
        textView.setText(source);
        if (iMediationNativeAdInfo.getIconUrl() != null) {
            i1.a.c(eVar.f4067b, iMediationNativeAdInfo.getImageUrl());
        }
        Button button = eVar.f4069d;
        int interactionType = iMediationNativeAdInfo.getInteractionType();
        if (interactionType != 2 && interactionType != 3) {
            if (interactionType != 4) {
                if (interactionType != 5) {
                    button.setVisibility(8);
                    return;
                } else {
                    button.setVisibility(0);
                    button.setText("立即拨打");
                    return;
                }
            }
            button.setVisibility(0);
            if (TextUtils.isEmpty(iMediationNativeAdInfo.getActionText())) {
                actionText2 = "立即下载";
            } else {
                actionText2 = iMediationNativeAdInfo.getActionText();
            }
            button.setText(actionText2);
            return;
        }
        button.setVisibility(0);
        if (TextUtils.isEmpty(iMediationNativeAdInfo.getActionText())) {
            actionText = "查看详情";
        } else {
            actionText = iMediationNativeAdInfo.getActionText();
        }
        button.setText(actionText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.mtesttools.b.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View] */
    private View q(ViewGroup viewGroup, @NonNull IMediationNativeAdInfo iMediationNativeAdInfo) {
        a aVar = null;
        try {
            LayoutInflater from = LayoutInflater.from(this.f4056c);
            int i5 = R.layout.O0;
            ?? inflate = from.inflate(i5, viewGroup, false);
            try {
                j jVar = new j(aVar);
                int i6 = R.id.G4;
                jVar.f4070e = (TextView) inflate.findViewById(i6);
                int i7 = R.id.E4;
                jVar.f4071f = (TextView) inflate.findViewById(i7);
                int i8 = R.id.F4;
                jVar.f4072g = (TextView) inflate.findViewById(i8);
                int i9 = R.id.f5826x1;
                jVar.f4080i = (FrameLayout) inflate.findViewById(i9);
                int i10 = R.id.f5799s1;
                jVar.f4067b = (ImageView) inflate.findViewById(i10);
                jVar.f4068c = (ImageView) inflate.findViewById(R.id.f5781p1);
                int i11 = R.id.f5732h0;
                jVar.f4069d = (Button) inflate.findViewById(i11);
                int i12 = R.id.f5742i4;
                jVar.f4073h = (RelativeLayout) inflate.findViewById(i12);
                MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).sourceId(i8).descriptionTextId(i7).mediaViewIdId(i9).callToActionId(i11).logoLayoutId(i12).iconImageId(i10).build();
                jVar.f4066a = build;
                p(inflate, jVar, iMediationNativeAdInfo, build);
                return inflate;
            } catch (Exception e5) {
                e = e5;
                aVar = inflate;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    private View t(ViewGroup viewGroup, @NonNull IMediationNativeAdInfo iMediationNativeAdInfo) {
        LayoutInflater from = LayoutInflater.from(this.f4056c);
        int i5 = R.layout.N0;
        View inflate = from.inflate(i5, viewGroup, false);
        g gVar = new g(null);
        int i6 = R.id.G4;
        gVar.f4070e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.E4;
        gVar.f4071f = (TextView) inflate.findViewById(i7);
        int i8 = R.id.F4;
        gVar.f4072g = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        gVar.f4077i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        gVar.f4067b = (ImageView) inflate.findViewById(i10);
        gVar.f4068c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        gVar.f4069d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        gVar.f4073h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i7).sourceId(i8).mainImageId(i9).callToActionId(i11).logoLayoutId(i12).iconImageId(i10).build();
        gVar.f4066a = build;
        p(inflate, gVar, iMediationNativeAdInfo, build);
        if (iMediationNativeAdInfo.getImageUrl() != null) {
            i1.a.c(gVar.f4077i, iMediationNativeAdInfo.getImageUrl());
        }
        return inflate;
    }

    private View u(ViewGroup viewGroup, @NonNull IMediationNativeAdInfo iMediationNativeAdInfo) {
        LayoutInflater from = LayoutInflater.from(this.f4056c);
        int i5 = R.layout.L0;
        View inflate = from.inflate(i5, viewGroup, false);
        f fVar = new f(null);
        int i6 = R.id.G4;
        fVar.f4070e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        fVar.f4072g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        fVar.f4071f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5811u1;
        fVar.f4074i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5816v1;
        fVar.f4075j = (ImageView) inflate.findViewById(i10);
        int i11 = R.id.f5821w1;
        fVar.f4076k = (ImageView) inflate.findViewById(i11);
        int i12 = R.id.f5799s1;
        fVar.f4067b = (ImageView) inflate.findViewById(i12);
        fVar.f4068c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i13 = R.id.f5732h0;
        fVar.f4069d = (Button) inflate.findViewById(i13);
        int i14 = R.id.f5742i4;
        fVar.f4073h = (RelativeLayout) inflate.findViewById(i14);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i8).sourceId(i7).mainImageId(i9).logoLayoutId(i14).callToActionId(i13).iconImageId(i12).groupImage1Id(i9).groupImage2Id(i10).groupImage3Id(i11).build();
        fVar.f4066a = build;
        p(inflate, fVar, iMediationNativeAdInfo, build);
        if (iMediationNativeAdInfo.getImageList() != null && iMediationNativeAdInfo.getImageList().size() >= 3) {
            String str = iMediationNativeAdInfo.getImageList().get(0);
            String str2 = iMediationNativeAdInfo.getImageList().get(1);
            String str3 = iMediationNativeAdInfo.getImageList().get(2);
            if (str != null) {
                i1.a.c(fVar.f4074i, iMediationNativeAdInfo.getImageUrl());
            }
            if (str2 != null) {
                i1.a.c(fVar.f4075j, iMediationNativeAdInfo.getImageUrl());
            }
            if (str3 != null) {
                i1.a.c(fVar.f4076k, iMediationNativeAdInfo.getImageUrl());
            }
        }
        return inflate;
    }

    private View w(ViewGroup viewGroup, @NonNull IMediationNativeAdInfo iMediationNativeAdInfo) {
        LayoutInflater from = LayoutInflater.from(this.f4056c);
        int i5 = R.layout.Q0;
        View inflate = from.inflate(i5, (ViewGroup) null, false);
        h hVar = new h(null);
        int i6 = R.id.G4;
        hVar.f4070e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        hVar.f4072g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        hVar.f4071f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        hVar.f4078i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        hVar.f4067b = (ImageView) inflate.findViewById(i10);
        hVar.f4068c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        hVar.f4069d = (Button) inflate.findViewById(i11);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).sourceId(i7).descriptionTextId(i8).mainImageId(i9).logoLayoutId(R.id.f5742i4).callToActionId(i11).iconImageId(i10).build();
        hVar.f4066a = build;
        p(inflate, hVar, iMediationNativeAdInfo, build);
        if (iMediationNativeAdInfo.getImageUrl() != null) {
            i1.a.c(hVar.f4078i, iMediationNativeAdInfo.getImageUrl());
        }
        return inflate;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        TTNativeExpressAd tTNativeExpressAd = this.f4054a;
        if (tTNativeExpressAd != null && (showEcpm = tTNativeExpressAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        if (this.f4054a != null && viewGroup != null) {
            this.f4057d = viewGroup;
            viewGroup.removeAllViews();
            View expressAdView = this.f4054a.getExpressAdView();
            if (expressAdView != null) {
                viewGroup.addView(expressAdView);
            }
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public void c(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        this.f4056c = activity;
        this.f4055b = bVar;
        this.f4058e = fVar.d();
        TTAdSdk.getAdManager().createAdNative(this.f4056c).loadBannerExpressAd(new AdSlot.Builder().setCodeId(this.f4058e).setImageAcceptedSize(1080, 400).setMediationAdSlot(new MediationAdSlot.Builder().setAllowShowCloseBtn(true).setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setScenarioId("aaabbb").setBidNotify(true).setMediationNativeToBannerListener(new a()).build()).build(), new b());
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4058e;
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        TTNativeExpressAd tTNativeExpressAd = this.f4054a;
        if (tTNativeExpressAd != null) {
            return tTNativeExpressAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        TTNativeExpressAd tTNativeExpressAd = this.f4054a;
        if (tTNativeExpressAd != null && (showEcpm = tTNativeExpressAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }
}
