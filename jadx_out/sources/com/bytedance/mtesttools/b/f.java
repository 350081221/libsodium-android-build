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
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends com.bytedance.mtesttools.b.h {

    /* renamed from: a, reason: collision with root package name */
    private com.bytedance.mtesttools.b.b f4112a;

    /* renamed from: b, reason: collision with root package name */
    private TTFeedAd f4113b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f4114c;

    /* renamed from: d, reason: collision with root package name */
    private String f4115d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements TTAdNative.FeedAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
        public void onError(int i5, String str) {
            com.bytedance.mtesttools.b.c.a("onAdLoadedFail", new com.bytedance.mtesttools.b.a(i5, str));
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.a("onAdLoadedFial", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
        public void onFeedAdLoad(List<TTFeedAd> list) {
            if (list != null && list.size() > 0) {
                f.this.f4113b = list.get(0);
            }
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.a("onAdLoaded", null);
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
            f.this.w();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onShow() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements MediationExpressRenderListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f4118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TTFeedAd f4119b;

        c(j jVar, TTFeedAd tTFeedAd) {
            this.f4118a = jVar;
            this.f4119b = tTFeedAd;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener
        public void onAdClick() {
            com.bytedance.mtesttools.b.c.b("onAdClick", f.this.f4115d, f.this.f4113b.getMediationManager().getShowEcpm(), null);
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onAdClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener
        public void onAdShow() {
            com.bytedance.mtesttools.b.c.b("onAdShow", f.this.f4115d, f.this.f4113b.getMediationManager().getShowEcpm(), null);
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onAdShow", null);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener
        public void onRenderFail(View view, String str, int i5) {
            com.bytedance.mtesttools.b.c.a("onRenderFail", new com.bytedance.mtesttools.b.a(i5, str));
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onRenderFail", new com.bytedance.mtesttools.b.a(i5, str));
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.ExpressRenderListener
        public void onRenderSuccess(View view, float f5, float f6, boolean z4) {
            View adView;
            com.bytedance.mtesttools.b.c.b("onRenderSuccess", f.this.f4115d, f.this.f4113b.getMediationManager().getShowEcpm(), null);
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onRenderSuccess", null);
            if (this.f4118a.f4137a != null && (adView = this.f4119b.getAdView()) != null && adView.getParent() == null) {
                this.f4118a.f4137a.removeAllViews();
                this.f4118a.f4137a.addView(adView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements TTFeedAd.VideoAdListener {
        d() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onProgressUpdate(long j5, long j6) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onProgressUpdate", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdComplete(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoCompleted", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdContinuePlay(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoResume", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdPaused(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoPause", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdStartPlay(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoStart", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoError(int i5, int i6) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoError", new com.bytedance.mtesttools.b.a(i5, "" + i6));
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoLoad(TTFeedAd tTFeedAd) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements TTFeedAd.VideoAdListener {
        e() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onProgressUpdate(long j5, long j6) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onProgressUpdate", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdComplete(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoCompleted", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdContinuePlay(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoResume", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdPaused(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoPause", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdStartPlay(TTFeedAd tTFeedAd) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoStart", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoError(int i5, int i6) {
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onVideoError", new com.bytedance.mtesttools.b.a(i5, "" + i6));
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoLoad(TTFeedAd tTFeedAd) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.mtesttools.b.f$f, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0108f implements TTAppDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4123a;

        C0108f(Context context) {
            this.f4123a = context;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAppDownloadListener
        public void onDownloadActive(long j5, long j6, String str, String str2) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAppDownloadListener
        public void onDownloadFailed(long j5, long j6, String str, String str2) {
            Toast.makeText(this.f4123a, "下载失败回调", 0).show();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAppDownloadListener
        public void onDownloadFinished(long j5, String str, String str2) {
            Toast.makeText(this.f4123a, "安装完成回调", 0).show();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAppDownloadListener
        public void onDownloadPaused(long j5, long j6, String str, String str2) {
            Toast.makeText(this.f4123a, "下载暂停回调", 0).show();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAppDownloadListener
        public void onIdle() {
            Toast.makeText(this.f4123a, "未开始下载", 0).show();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAppDownloadListener
        public void onInstalled(String str, String str2) {
            Toast.makeText(this.f4123a, "下载完成回调", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TTAdDislike f4125a;

        /* loaded from: classes2.dex */
        class a implements TTAdDislike.DislikeInteractionCallback {
            a() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onCancel() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onSelected(int i5, String str, boolean z4) {
                f.this.w();
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
            public void onShow() {
            }
        }

        g(TTAdDislike tTAdDislike) {
            this.f4125a = tTAdDislike;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4125a.showDislikeDialog();
            this.f4125a.setDislikeInteractionCallback(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements TTNativeAd.AdInteractionListener {
        h() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdClicked(View view, TTNativeAd tTNativeAd) {
            com.bytedance.mtesttools.b.c.b("onAdClick", f.this.f4115d, f.this.f4113b.getMediationManager().getShowEcpm(), null);
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onAdClick", null);
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdShow(TTNativeAd tTNativeAd) {
            com.bytedance.mtesttools.b.c.b("onAdShow", f.this.f4115d, f.this.f4113b.getMediationManager().getShowEcpm(), null);
            if (f.this.f4112a == null) {
                return;
            }
            f.this.f4112a.b("onAdShow", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        MediationViewBinder f4129a;

        /* renamed from: b, reason: collision with root package name */
        ImageView f4130b;

        /* renamed from: c, reason: collision with root package name */
        ImageView f4131c;

        /* renamed from: d, reason: collision with root package name */
        Button f4132d;

        /* renamed from: e, reason: collision with root package name */
        TextView f4133e;

        /* renamed from: f, reason: collision with root package name */
        TextView f4134f;

        /* renamed from: g, reason: collision with root package name */
        TextView f4135g;

        /* renamed from: h, reason: collision with root package name */
        RelativeLayout f4136h;

        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        FrameLayout f4137a;

        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class k extends i {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4138i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f4139j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f4140k;

        private k() {
            super(null);
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class l extends i {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4141i;

        private l() {
            super(null);
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class m extends i {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4142i;

        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class n extends i {

        /* renamed from: i, reason: collision with root package name */
        ImageView f4143i;

        private n() {
            super(null);
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class o extends i {

        /* renamed from: i, reason: collision with root package name */
        FrameLayout f4144i;

        private o() {
            super(null);
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View] */
    private View k(Context context, ViewGroup viewGroup, @NonNull TTFeedAd tTFeedAd) {
        ?? inflate;
        a aVar = null;
        try {
            inflate = LayoutInflater.from(context).inflate(R.layout.P0, viewGroup, false);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            j jVar = new j(aVar);
            jVar.f4137a = (FrameLayout) inflate.findViewById(R.id.f5793r1);
            if (tTFeedAd.getMediationManager().hasDislike()) {
                tTFeedAd.setDislikeCallback((Activity) context, new b());
            }
            tTFeedAd.setExpressRenderListener(new c(jVar, tTFeedAd));
            tTFeedAd.setVideoAdListener(new d());
            tTFeedAd.render();
            return inflate;
        } catch (Exception e6) {
            e = e6;
            aVar = inflate;
            e.printStackTrace();
            return aVar;
        }
    }

    private void n(Context context, View view, i iVar, TTFeedAd tTFeedAd, MediationViewBinder mediationViewBinder) {
        String source;
        String str;
        String buttonText;
        String buttonText2;
        if (tTFeedAd.getMediationManager().hasDislike()) {
            TTAdDislike dislikeDialog = tTFeedAd.getDislikeDialog((Activity) context);
            iVar.f4131c.setVisibility(0);
            iVar.f4131c.setOnClickListener(new g(dislikeDialog));
        } else {
            ImageView imageView = iVar.f4131c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(iVar.f4135g);
        arrayList.add(iVar.f4133e);
        arrayList.add(iVar.f4134f);
        arrayList.add(iVar.f4130b);
        if (iVar instanceof l) {
            arrayList.add(((l) iVar).f4141i);
        } else if (iVar instanceof m) {
            arrayList.add(((m) iVar).f4142i);
        } else if (iVar instanceof n) {
            arrayList.add(((n) iVar).f4143i);
        } else if (iVar instanceof o) {
            arrayList.add(((o) iVar).f4144i);
        } else if (iVar instanceof k) {
            k kVar = (k) iVar;
            arrayList.add(kVar.f4138i);
            arrayList.add(kVar.f4139j);
            arrayList.add(kVar.f4140k);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(iVar.f4132d);
        tTFeedAd.registerViewForInteraction((Activity) context, (ViewGroup) view, arrayList, arrayList2, (List<View>) null, new h(), mediationViewBinder);
        iVar.f4133e.setText(tTFeedAd.getTitle());
        iVar.f4134f.setText(tTFeedAd.getDescription());
        TextView textView = iVar.f4135g;
        if (TextUtils.isEmpty(tTFeedAd.getSource())) {
            source = "广告来源";
        } else {
            source = tTFeedAd.getSource();
        }
        textView.setText(source);
        if (tTFeedAd.getIcon() != null) {
            str = tTFeedAd.getIcon().getImageUrl();
        } else {
            str = "";
        }
        if (str != null) {
            i1.a.c(iVar.f4130b, str);
        }
        Button button = iVar.f4132d;
        int interactionType = tTFeedAd.getInteractionType();
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
            if (TextUtils.isEmpty(tTFeedAd.getButtonText())) {
                buttonText2 = "立即下载";
            } else {
                buttonText2 = tTFeedAd.getButtonText();
            }
            button.setText(buttonText2);
            return;
        }
        button.setVisibility(0);
        if (TextUtils.isEmpty(tTFeedAd.getButtonText())) {
            buttonText = "查看详情";
        } else {
            buttonText = tTFeedAd.getButtonText();
        }
        button.setText(buttonText);
    }

    private View o(Context context, ViewGroup viewGroup, @NonNull TTFeedAd tTFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.Q0;
        View inflate = from.inflate(i5, viewGroup, false);
        m mVar = new m(null);
        int i6 = R.id.G4;
        mVar.f4133e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        mVar.f4135g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        mVar.f4134f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        mVar.f4142i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        mVar.f4130b = (ImageView) inflate.findViewById(i10);
        mVar.f4131c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        mVar.f4132d = (Button) inflate.findViewById(i11);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).sourceId(i7).descriptionTextId(i8).mainImageId(i9).logoLayoutId(R.id.f5742i4).callToActionId(i11).iconImageId(i10).build();
        mVar.f4129a = build;
        inflate.setTag(mVar);
        n(context, inflate, mVar, tTFeedAd, build);
        if (tTFeedAd.getImageList() != null && tTFeedAd.getImageList().size() > 0) {
            i1.a.c(mVar.f4142i, tTFeedAd.getImageList().get(0).getImageUrl());
        }
        return inflate;
    }

    private View q(Context context, ViewGroup viewGroup, @NonNull TTFeedAd tTFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.N0;
        View inflate = from.inflate(i5, viewGroup, false);
        l lVar = new l(null);
        int i6 = R.id.G4;
        lVar.f4133e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.E4;
        lVar.f4134f = (TextView) inflate.findViewById(i7);
        int i8 = R.id.F4;
        lVar.f4135g = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        lVar.f4141i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        lVar.f4130b = (ImageView) inflate.findViewById(i10);
        lVar.f4131c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        lVar.f4132d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        lVar.f4136h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i7).sourceId(i8).mainImageId(i9).callToActionId(i11).logoLayoutId(i12).iconImageId(i10).build();
        lVar.f4129a = build;
        inflate.setTag(lVar);
        n(context, inflate, lVar, tTFeedAd, build);
        if (tTFeedAd.getImageList() != null && tTFeedAd.getImageList().size() > 0) {
            i1.a.c(lVar.f4141i, tTFeedAd.getImageList().get(0).getImageUrl());
        }
        return inflate;
    }

    private View s(Context context, ViewGroup viewGroup, @NonNull TTFeedAd tTFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.L0;
        View inflate = from.inflate(i5, viewGroup, false);
        k kVar = new k(null);
        int i6 = R.id.G4;
        kVar.f4133e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        kVar.f4135g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        kVar.f4134f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5811u1;
        kVar.f4138i = (ImageView) inflate.findViewById(i9);
        kVar.f4139j = (ImageView) inflate.findViewById(R.id.f5816v1);
        kVar.f4140k = (ImageView) inflate.findViewById(R.id.f5821w1);
        int i10 = R.id.f5799s1;
        kVar.f4130b = (ImageView) inflate.findViewById(i10);
        kVar.f4131c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        kVar.f4132d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        kVar.f4136h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i8).sourceId(i7).mainImageId(i9).logoLayoutId(i12).callToActionId(i11).iconImageId(i10).build();
        kVar.f4129a = build;
        inflate.setTag(kVar);
        n(context, inflate, kVar, tTFeedAd, build);
        if (tTFeedAd.getImageList() != null && tTFeedAd.getImageList().size() >= 3) {
            String imageUrl = tTFeedAd.getImageList().get(0).getImageUrl();
            String imageUrl2 = tTFeedAd.getImageList().get(1).getImageUrl();
            String imageUrl3 = tTFeedAd.getImageList().get(2).getImageUrl();
            if (imageUrl != null) {
                i1.a.c(kVar.f4138i, imageUrl);
            }
            if (imageUrl2 != null) {
                i1.a.c(kVar.f4139j, imageUrl2);
            }
            if (imageUrl3 != null) {
                i1.a.c(kVar.f4140k, imageUrl3);
            }
        }
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.mtesttools.b.f] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View] */
    private View u(Context context, ViewGroup viewGroup, @NonNull TTFeedAd tTFeedAd) {
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
            o oVar = new o(aVar);
            int i6 = R.id.G4;
            oVar.f4133e = (TextView) inflate.findViewById(i6);
            int i7 = R.id.E4;
            oVar.f4134f = (TextView) inflate.findViewById(i7);
            int i8 = R.id.F4;
            oVar.f4135g = (TextView) inflate.findViewById(i8);
            int i9 = R.id.f5826x1;
            oVar.f4144i = (FrameLayout) inflate.findViewById(i9);
            int i10 = R.id.f5799s1;
            oVar.f4130b = (ImageView) inflate.findViewById(i10);
            oVar.f4131c = (ImageView) inflate.findViewById(R.id.f5781p1);
            int i11 = R.id.f5732h0;
            oVar.f4132d = (Button) inflate.findViewById(i11);
            int i12 = R.id.f5742i4;
            oVar.f4136h = (RelativeLayout) inflate.findViewById(i12);
            MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).sourceId(i8).descriptionTextId(i7).mediaViewIdId(i9).callToActionId(i11).logoLayoutId(i12).iconImageId(i10).build();
            oVar.f4129a = build;
            inflate.setTag(oVar);
            tTFeedAd.setVideoAdListener(new e());
            tTFeedAd.setDownloadListener(new C0108f(context));
            n(context, inflate, oVar, tTFeedAd, build);
            return inflate;
        } catch (Exception e6) {
            e = e6;
            aVar = inflate;
            e.printStackTrace();
            return aVar;
        }
    }

    private View v(Context context, ViewGroup viewGroup, @NonNull TTFeedAd tTFeedAd) {
        LayoutInflater from = LayoutInflater.from(context);
        int i5 = R.layout.S0;
        View inflate = from.inflate(i5, viewGroup, false);
        n nVar = new n(null);
        int i6 = R.id.G4;
        nVar.f4133e = (TextView) inflate.findViewById(i6);
        int i7 = R.id.F4;
        nVar.f4135g = (TextView) inflate.findViewById(i7);
        int i8 = R.id.E4;
        nVar.f4134f = (TextView) inflate.findViewById(i8);
        int i9 = R.id.f5805t1;
        nVar.f4143i = (ImageView) inflate.findViewById(i9);
        int i10 = R.id.f5799s1;
        nVar.f4130b = (ImageView) inflate.findViewById(i10);
        nVar.f4131c = (ImageView) inflate.findViewById(R.id.f5781p1);
        int i11 = R.id.f5732h0;
        nVar.f4132d = (Button) inflate.findViewById(i11);
        int i12 = R.id.f5742i4;
        nVar.f4136h = (RelativeLayout) inflate.findViewById(i12);
        MediationViewBinder build = new MediationViewBinder.Builder(i5).titleId(i6).descriptionTextId(i8).mainImageId(i9).iconImageId(i10).callToActionId(i11).sourceId(i7).logoLayoutId(i12).build();
        nVar.f4129a = build;
        inflate.setTag(nVar);
        n(context, inflate, nVar, tTFeedAd, build);
        if (tTFeedAd.getImageList() != null && tTFeedAd.getImageList().size() > 0) {
            i1.a.c(nVar.f4143i, tTFeedAd.getImageList().get(0).getImageUrl());
        }
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        ViewGroup viewGroup = this.f4114c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.bytedance.mtesttools.b.h
    public String a() {
        MediationAdEcpmInfo showEcpm;
        TTFeedAd tTFeedAd = this.f4113b;
        if (tTFeedAd != null && (showEcpm = tTFeedAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getSlotId();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public void b(Activity activity, ViewGroup viewGroup) {
        View view;
        this.f4114c = viewGroup;
        TTFeedAd tTFeedAd = this.f4113b;
        if (tTFeedAd == null) {
            k1.i.b(activity, "暂无数据，请稍后重试");
            return;
        }
        if (tTFeedAd.getMediationManager().isExpress()) {
            view = k(activity, viewGroup, this.f4113b);
        } else if (this.f4113b.getImageMode() == 2) {
            view = o(activity, viewGroup, this.f4113b);
        } else if (this.f4113b.getImageMode() == 3) {
            view = q(activity, viewGroup, this.f4113b);
        } else if (this.f4113b.getImageMode() == 4) {
            view = s(activity, viewGroup, this.f4113b);
        } else if (this.f4113b.getImageMode() == 5) {
            view = u(activity, viewGroup, this.f4113b);
        } else if (this.f4113b.getImageMode() == 16) {
            view = v(activity, viewGroup, this.f4113b);
        } else if (this.f4113b.getImageMode() == 15) {
            view = u(activity, viewGroup, this.f4113b);
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
        this.f4112a = bVar;
        this.f4115d = fVar.d();
        TTAdSdk.getAdManager().createAdNative(activity).loadFeedAd(new AdSlot.Builder().setCodeId(this.f4115d).setAdCount(1).setImageAcceptedSize(1080, 500).setExpressViewAcceptedSize(400.0f, 300.0f).setMediationAdSlot(new MediationAdSlot.Builder().setExtraObject("testToolSlotId", "gm_test_slot_" + fVar.i()).setMuted(true).setVolume(1.0f).setBidNotify(true).build()).build(), new a());
    }

    @Override // com.bytedance.mtesttools.b.h
    public String d() {
        return this.f4115d;
    }

    @Override // com.bytedance.mtesttools.b.h
    public MediationAdEcpmInfo f() {
        TTFeedAd tTFeedAd = this.f4113b;
        if (tTFeedAd != null) {
            return tTFeedAd.getMediationManager().getShowEcpm();
        }
        return null;
    }

    @Override // com.bytedance.mtesttools.b.h
    public String g() {
        MediationAdEcpmInfo showEcpm;
        TTFeedAd tTFeedAd = this.f4113b;
        if (tTFeedAd != null && (showEcpm = tTFeedAd.getMediationManager().getShowEcpm()) != null) {
            return showEcpm.getEcpm();
        }
        return null;
    }
}
