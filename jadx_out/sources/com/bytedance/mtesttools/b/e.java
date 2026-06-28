package com.bytedance.mtesttools.b;

import android.app.Activity;
import android.content.Context;
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
import com.bytedance.sdk.openadsdk.TTDrawFeedAd;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends com.bytedance.mtesttools.b.h {

    /* renamed from: a, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4081a;

    /* renamed from: b, reason: collision with root package name */
    private TTDrawFeedAd f4082b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f4083c;

    /* renamed from: d, reason: collision with root package name */
    private String f4084d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements TTAdNative.DrawFeedAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.DrawFeedAdListener
        public void onDrawFeedAdLoad(List<TTDrawFeedAd> list) {
            if (list != null && list.size() > 0) {
                e.this.f4082b = list.get(0);
            }
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.a("onAdLoadSuccess", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.DrawFeedAdListener
        public void onError(int i5, String str) {
            com.bytedance.mtesttools.b.c.a("onAdLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.a("onAdLoadFail", new com.bytedance.mtesttools.b.a(i5, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements TTAdDislike.DislikeInteractionCallback {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onCancel() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onSelected(int i5, String str, boolean z4) {
            e.this.w();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onShow() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements MediationExpressRenderListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f4087a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TTDrawFeedAd f4088b;

        c(i iVar, TTDrawFeedAd tTDrawFeedAd) {
            this.f4087a = iVar;
            this.f4088b = tTDrawFeedAd;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener
        public void onAdClick() {
            com.bytedance.mtesttools.b.c.b("onAdClick", e.this.f4084d, e.this.f4082b.getMediationManager().getShowEcpm(), null);
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.b("onAdClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener
        public void onAdShow() {
            com.bytedance.mtesttools.b.c.b("onAdShow", e.this.f4084d, e.this.f4082b.getMediationManager().getShowEcpm(), null);
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.b("onAdShow", null);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener
        public void onRenderFail(View view, String str, int i5) {
            com.bytedance.mtesttools.b.c.a("onRenderFail", new com.bytedance.mtesttools.b.a(i5, str));
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.b("onRenderFail", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.ExpressRenderListener
        public void onRenderSuccess(View view, float f5, float f6, boolean z4) {
            View adView;
            com.bytedance.mtesttools.b.c.b("onRenderSuccess", e.this.f4084d, e.this.f4082b.getMediationManager().getShowEcpm(), null);
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.b("onRenderSuccess", null);
            if (this.f4087a.f4104a != null && (adView = this.f4088b.getAdView()) != null && adView.getParent() == null) {
                this.f4087a.f4104a.removeAllViews();
                this.f4087a.f4104a.addView(adView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements TTDrawFeedAd.DrawVideoListener {
        d() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTDrawFeedAd.DrawVideoListener
        public void onClick() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTDrawFeedAd.DrawVideoListener
        public void onClickRetry() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.mtesttools.b.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0107e implements TTDrawFeedAd.DrawVideoListener {
        C0107e() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTDrawFeedAd.DrawVideoListener
        public void onClick() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTDrawFeedAd.DrawVideoListener
        public void onClickRetry() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TTAdDislike f4092a;

        /* loaded from: classes2.dex */
        class a implements TTAdDislike.DislikeInteractionCallback {
            a() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onCancel() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onSelected(int i5, String str, boolean z4) {
                e.this.w();
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onShow() {
            }
        }

        f(TTAdDislike tTAdDislike) {
            this.f4092a = tTAdDislike;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4092a.showDislikeDialog();
            this.f4092a.setDislikeInteractionCallback(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements TTNativeAd.AdInteractionListener {
        g() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdClicked(View view, TTNativeAd tTNativeAd) {
            com.bytedance.mtesttools.b.c.b("onAdClick", e.this.f4084d, e.this.f4082b.getMediationManager().getShowEcpm(), null);
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.b("onAdClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdShow(TTNativeAd tTNativeAd) {
            com.bytedance.mtesttools.b.c.b("onAdShow", e.this.f4084d, e.this.f4082b.getMediationManager().getShowEcpm(), null);
            if (e.this.f4081a == null) {
                return;
            }
            e.this.f4081a.b("onAdShow", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        MediationViewBinder f4096a;

        /* renamed from: b, reason: collision with root package name */
        ImageView f4097b;

        /* renamed from: c, reason: collision with root package name */
        ImageView f4098c;

        /* renamed from: d, reason: collision with root package name */
        Button f4099d;

        /* renamed from: e, reason: collision with root package name */
        TextView f4100e;

        /* renamed from: f, reason: collision with root package name */
        TextView f4101f;

        /* renamed from: g, reason: collision with root package name */
        TextView f4102g;

        /* renamed from: h, reason: collision with root package name */
        RelativeLayout f4103h;

        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        FrameLayout f4104a;

        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class j extends h {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4105i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f4106j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f4107k;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class k extends h {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4108i;

        private k() {
            super(null);
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class l extends h {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4109i;

        private l() {
            super(null);
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class m extends h {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4110i;

        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class n extends h {

        /* renamed from: i, reason: collision with root package name */
        FrameLayout f4111i;

        private n() {
            super(null);
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View] */
    private View k(Context context, ViewGroup viewGroup, @NonNull TTDrawFeedAd tTDrawFeedAd) {
        ?? inflate;
        a aVar = null;
        try {
            inflate = LayoutInflater.from(context).inflate(R.layout.P0, viewGroup, false);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            i iVar = new i(aVar);
            iVar.f4104a = (FrameLayout) inflate.findViewById(R.id.f5793r1);
            if (tTDrawFeedAd.getMediationManager().hasDislike()) {
                tTDrawFeedAd.setDislikeCallback((Activity) context, new b());
            }
            tTDrawFeedAd.setExpressRenderListener(new c(iVar, tTDrawFeedAd));
            tTDrawFeedAd.setDrawVideoListener(new d());
            tTDrawFeedAd.render();
            return inflate;
        } catch (Exception e6) {
            e = e6;
            aVar = inflate;
            e.printStackTrace();
            return aVar;
        }
    }

    private void n(Context context, View view, h hVar, TTDrawFeedAd tTDrawFeedAd, MediationViewBinder mediationViewBinder) {
        String source;
        String str;
        String buttonText;
        String buttonText2;
        if (tTDrawFeedAd.getMediationManager().hasDislike()) {
            TTAdDislike dislikeDialog = tTDrawFeedAd.getDislikeDialog((Activity) context);
            hVar.f4098c.setVisibility(0);
            hVar.f4098c.setOnClickListener(new f(dislikeDialog));
        } else {
            ImageView imageView = hVar.f4098c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(hVar.f4102g);
        arrayList.add(hVar.f4100e);
        arrayList.add(hVar.f4101f);
        arrayList.add(hVar.f4097b);
        if (hVar instanceof k) {
            arrayList.add(((k) hVar).f4108i);
        } else if (hVar instanceof l) {
            arrayList.add(((l) hVar).f4109i);
        } else if (hVar instanceof m) {
            arrayList.add(((m) hVar).f4110i);
        } else if (hVar instanceof n) {
            arrayList.add(((n) hVar).f4111i);
        } else if (hVar instanceof j) {
            j jVar = (j) hVar;
            arrayList.add(jVar.f4105i);
            arrayList.add(jVar.f4106j);
            arrayList.add(jVar.f4107k);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hVar.f4099d);
        tTDrawFeedAd.registerViewForInteraction((Activity) context, (ViewGroup) view, arrayList, arrayList2, (List<View>) null, new g(), mediationViewBinder);
        hVar.f4100e.setText(tTDrawFeedAd.getTitle());
        hVar.f4101f.setText(tTDrawFeedAd.getDescription());
        TextView textView = hVar.f4102g;
        if (TextUtils.isEmpty(tTDrawFeedAd.getSource())) {
            source = "广告来源";
        } else {
            source = tTDrawFeedAd.getSource();
        }
        textView.setText(source);
        if (tTDrawFeedAd.getIcon() != null) {
            str = tTDrawFeedAd.getIcon().getImageUrl();
        } else {
            str = "";
        }
        if (str != null) {
            i1.a.c(hVar.f4097b, str);
        }
        Button button = hVar.f4099d;
        int interactionType = tTDrawFeedAd.getInteractionType();
        if (interactionType != 2 && interactionType != 3) {
            if (interactionType != 4) {
                if (interactionType != 5) {
                    button.setVisibility(8);
                    k1.i.b(context, "交互类型异常");
                    return;
                } else {
                    button.setVisibility(0);
                    button.setText("立即拨打");
                    return;
                }
            }
            button.setVisibility(0);
            if (TextUtils.isEmpty(tTDrawFeedAd.getButtonText())) {
                buttonText2 = "立即下载";
            } else {
                buttonText2 = tTDrawFeedAd.getButtonText();
            }
            button.setText(buttonText2);
            return;
        }
        button.setVisibility(0);
        if (TextUtils.isEmpty(tTDrawFeedAd.getButtonText())) {
            buttonText = "查看详情";
        } else {
            buttonText = tTDrawFeedAd.getButtonText();
        }
        button.setText(buttonText);
    }

    private View o(Context context, ViewGroup viewGroup, @NonNull TTDrawFeedAd tTDrawFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.Q0;
        View inflate = from.inflate(i5, viewGroup, false);
        l lVar = new l(null);
        int i6 = R.id.G4;
        lVar.f4100e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        lVar.f4102g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        lVar.f4101f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        lVar.f4109i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        lVar.f4097b = (ImageView) inflate.findViewById(i10);
        lVar.f4098c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        lVar.f4099d = (Button) inflate.findViewById(i11);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).sourceId(i7).descriptionTextId(i8).mainImageId(i9).logoLayoutId(R.id.f5742i4).callToActionId(i11).iconImageId(i10).build();
        lVar.f4096a = build;
        inflate.setTag(lVar);
        n(context, inflate, lVar, tTDrawFeedAd, build);
        if (tTDrawFeedAd.getImageList() != null && tTDrawFeedAd.getImageList().size() > 0) {
            i1.a.c(lVar.f4109i, tTDrawFeedAd.getImageList().get(0).getImageUrl());
        }
        return inflate;
    }

    private View q(Context context, ViewGroup viewGroup, @NonNull TTDrawFeedAd tTDrawFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.N0;
        View inflate = from.inflate(i5, viewGroup, false);
        k kVar = new k(null);
        int i6 = R.id.G4;
        kVar.f4100e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.E4;
        kVar.f4101f = (TextView) inflate.findViewById(i7);
        int i8 = R.id.F4;
        kVar.f4102g = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        kVar.f4108i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        kVar.f4097b = (ImageView) inflate.findViewById(i10);
        kVar.f4098c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        kVar.f4099d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        kVar.f4103h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i7).sourceId(i8).mainImageId(i9).callToActionId(i11).logoLayoutId(i12).iconImageId(i10).build();
        kVar.f4096a = build;
        inflate.setTag(kVar);
        n(context, inflate, kVar, tTDrawFeedAd, build);
        if (tTDrawFeedAd.getImageList() != null && tTDrawFeedAd.getImageList().size() > 0) {
            i1.a.c(kVar.f4108i, tTDrawFeedAd.getImageList().get(0).getImageUrl());
        }
        return inflate;
    }

    private View s(Context context, ViewGroup viewGroup, @NonNull TTDrawFeedAd tTDrawFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.L0;
        View inflate = from.inflate(i5, viewGroup, false);
        j jVar = new j(null);
        int i6 = R.id.G4;
        jVar.f4100e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        jVar.f4102g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        jVar.f4101f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5811u1;
        jVar.f4105i = (ImageView) inflate.findViewById(i9);
        jVar.f4106j = (ImageView) inflate.findViewById(R.id.f5816v1);
        jVar.f4107k = (ImageView) inflate.findViewById(R.id.f5821w1);
        int i10 = R.id.f5799s1;
        jVar.f4097b = (ImageView) inflate.findViewById(i10);
        jVar.f4098c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        jVar.f4099d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        jVar.f4103h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i8).sourceId(i7).mainImageId(i9).logoLayoutId(i12).callToActionId(i11).iconImageId(i10).build();
        jVar.f4096a = build;
        inflate.setTag(jVar);
        n(context, inflate, jVar, tTDrawFeedAd, build);
        if (tTDrawFeedAd.getImageList() != null && tTDrawFeedAd.getImageList().size() >= 3) {
            String imageUrl = tTDrawFeedAd.getImageList().get(0).getImageUrl();
            String imageUrl2 = tTDrawFeedAd.getImageList().get(1).getImageUrl();
            String imageUrl3 = tTDrawFeedAd.getImageList().get(2).getImageUrl();
            if (imageUrl != null) {
                i1.a.c(jVar.f4105i, imageUrl);
            }
            if (imageUrl2 != null) {
                i1.a.c(jVar.f4106j, imageUrl2);
            }
            if (imageUrl3 != null) {
                i1.a.c(jVar.f4107k, imageUrl3);
            }
        }
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.mtesttools.b.e] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View] */
    private View u(Context context, ViewGroup viewGroup, @NonNull TTDrawFeedAd tTDrawFeedAd) {
        int i5;
        ?? inflate;
        a aVar = null;
        try {
            LayoutInflater from = LayoutInflater.from(context);
            i5 = R.layout.O0;
            inflate = from.inflate(i5, viewGroup, false);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            n nVar = new n(aVar);
            int i6 = R.id.G4;
            nVar.f4100e = (TextView) inflate.findViewById(i6);
            int i7 = R.id.E4;
            nVar.f4101f = (TextView) inflate.findViewById(i7);
            int i8 = R.id.F4;
            nVar.f4102g = (TextView) inflate.findViewById(i8);
            int i9 = R.id.f5826x1;
            nVar.f4111i = (FrameLayout) inflate.findViewById(i9);
            int i10 = R.id.f5799s1;
            nVar.f4097b = (ImageView) inflate.findViewById(i10);
            nVar.f4098c = (ImageView) inflate.findViewById(R.id.f5781p1);
            int i11 = R.id.f5732h0;
            nVar.f4099d = (Button) inflate.findViewById(i11);
            int i12 = R.id.f5742i4;
            nVar.f4103h = (RelativeLayout) inflate.findViewById(i12);
            MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).sourceId(i8).descriptionTextId(i7).mediaViewIdId(i9).callToActionId(i11).logoLayoutId(i12).iconImageId(i10).build();
            nVar.f4096a = build;
            inflate.setTag(nVar);
            tTDrawFeedAd.setDrawVideoListener(new C0107e());
            n(context, inflate, nVar, tTDrawFeedAd, build);
            return inflate;
        } catch (Exception e6) {
            e = e6;
            aVar = inflate;
            e.printStackTrace();
            return aVar;
        }
    }

    private View v(Context context, ViewGroup viewGroup, @NonNull TTDrawFeedAd tTDrawFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.S0;
        View inflate = from.inflate(i5, viewGroup, false);
        m mVar = new m(null);
        int i6 = R.id.G4;
        mVar.f4100e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        mVar.f4102g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        mVar.f4101f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        mVar.f4110i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        mVar.f4097b = (ImageView) inflate.findViewById(i10);
        mVar.f4098c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        mVar.f4099d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        mVar.f4103h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i8).mainImageId(i9).iconImageId(i10).callToActionId(i11).sourceId(i7).logoLayoutId(i12).build();
        mVar.f4096a = build;
        inflate.setTag(mVar);
        n(context, inflate, mVar, tTDrawFeedAd, build);
        if (tTDrawFeedAd.getImageList() != null && tTDrawFeedAd.getImageList().size() > 0) {
            i1.a.c(mVar.f4110i, tTDrawFeedAd.getImageList().get(0).getImageUrl());
        }
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        ViewGroup viewGroup = this.f4083c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        TTDrawFeedAd tTDrawFeedAd = this.f4082b;
        if (tTDrawFeedAd != null && (showEcpm = tTDrawFeedAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        View view;
        this.f4083c = viewGroup;
        TTDrawFeedAd tTDrawFeedAd = this.f4082b;
        if (tTDrawFeedAd == null) {
            k1.i.b(activity, "暂无数据，请稍后重试");
            return;
        }
        if (tTDrawFeedAd.getMediationManager().isExpress()) {
            view = k(activity, viewGroup, this.f4082b);
        } else if (this.f4082b.getImageMode() == 2) {
            view = o(activity, viewGroup, this.f4082b);
        } else if (this.f4082b.getImageMode() == 3) {
            view = q(activity, viewGroup, this.f4082b);
        } else if (this.f4082b.getImageMode() == 4) {
            view = s(activity, viewGroup, this.f4082b);
        } else if (this.f4082b.getImageMode() == 5) {
            view = u(activity, viewGroup, this.f4082b);
        } else if (this.f4082b.getImageMode() == 16) {
            view = v(activity, viewGroup, this.f4082b);
        } else if (this.f4082b.getImageMode() == 15) {
            view = u(activity, viewGroup, this.f4082b);
        } else {
            k1.i.b(activity, "图片展示样式错误");
            view = null;
        }
        if (view != null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public void c(Activity activity, j1.f fVar, int i5, int i6, com.bytedance.mtesttools.b.b bVar) {
        this.f4081a = bVar;
        this.f4084d = fVar.d();
        TTAdSdk.getAdManager().createAdNative(activity).loadDrawFeedAd(new AdSlot.Builder().setCodeId(this.f4084d).setAdCount(1).setImageAcceptedSize(1080, 1920).setMediationAdSlot(new MediationAdSlot.Builder().setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setMuted(true).setVolume(1.0f).setBidNotify(true).setScenarioId("test tools id").build()).build(), new a());
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4084d;
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        TTDrawFeedAd tTDrawFeedAd = this.f4082b;
        if (tTDrawFeedAd != null) {
            return tTDrawFeedAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        TTDrawFeedAd tTDrawFeedAd = this.f4082b;
        if (tTDrawFeedAd != null && (showEcpm = tTDrawFeedAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }
}
