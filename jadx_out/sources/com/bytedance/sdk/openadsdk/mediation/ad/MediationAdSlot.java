package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediationAdSlot implements IMediationAdSlot {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5090a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5091b;

    /* renamed from: c, reason: collision with root package name */
    private String f5092c;

    /* renamed from: d, reason: collision with root package name */
    private int f5093d;

    /* renamed from: e, reason: collision with root package name */
    private float f5094e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5095f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5096g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f5097h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5098i;

    /* renamed from: j, reason: collision with root package name */
    private String f5099j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5100k;

    /* renamed from: l, reason: collision with root package name */
    private MediationNativeToBannerListener f5101l;

    /* renamed from: m, reason: collision with root package name */
    private float f5102m;

    /* renamed from: n, reason: collision with root package name */
    private float f5103n;

    /* renamed from: o, reason: collision with root package name */
    private String f5104o;

    /* renamed from: p, reason: collision with root package name */
    private MediationSplashRequestInfo f5105p;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5106a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5107b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5108c;

        /* renamed from: d, reason: collision with root package name */
        private float f5109d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5110e;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5112g;

        /* renamed from: h, reason: collision with root package name */
        private String f5113h;

        /* renamed from: j, reason: collision with root package name */
        private int f5115j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f5116k;

        /* renamed from: l, reason: collision with root package name */
        private MediationNativeToBannerListener f5117l;

        /* renamed from: o, reason: collision with root package name */
        private String f5120o;

        /* renamed from: p, reason: collision with root package name */
        private MediationSplashRequestInfo f5121p;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, Object> f5111f = new HashMap();

        /* renamed from: i, reason: collision with root package name */
        private String f5114i = "";

        /* renamed from: m, reason: collision with root package name */
        private float f5118m = 80.0f;

        /* renamed from: n, reason: collision with root package name */
        private float f5119n = 80.0f;

        public MediationAdSlot build() {
            MediationAdSlot mediationAdSlot = new MediationAdSlot();
            mediationAdSlot.f5090a = this.f5106a;
            mediationAdSlot.f5091b = this.f5107b;
            mediationAdSlot.f5096g = this.f5108c;
            mediationAdSlot.f5094e = this.f5109d;
            mediationAdSlot.f5095f = this.f5110e;
            mediationAdSlot.f5097h = this.f5111f;
            mediationAdSlot.f5098i = this.f5112g;
            mediationAdSlot.f5099j = this.f5113h;
            mediationAdSlot.f5092c = this.f5114i;
            mediationAdSlot.f5093d = this.f5115j;
            mediationAdSlot.f5100k = this.f5116k;
            mediationAdSlot.f5101l = this.f5117l;
            mediationAdSlot.f5102m = this.f5118m;
            mediationAdSlot.f5103n = this.f5119n;
            mediationAdSlot.f5104o = this.f5120o;
            mediationAdSlot.f5105p = this.f5121p;
            return mediationAdSlot;
        }

        public Builder setAllowShowCloseBtn(boolean z4) {
            this.f5116k = z4;
            return this;
        }

        public Builder setBidNotify(boolean z4) {
            this.f5112g = z4;
            return this;
        }

        public Builder setExtraObject(String str, Object obj) {
            Map<String, Object> map = this.f5111f;
            if (map != null) {
                map.put(str, obj);
            }
            return this;
        }

        public Builder setMediationNativeToBannerListener(MediationNativeToBannerListener mediationNativeToBannerListener) {
            this.f5117l = mediationNativeToBannerListener;
            return this;
        }

        public Builder setMediationSplashRequestInfo(MediationSplashRequestInfo mediationSplashRequestInfo) {
            this.f5121p = mediationSplashRequestInfo;
            return this;
        }

        public Builder setMuted(boolean z4) {
            this.f5108c = z4;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i5) {
            this.f5115j = i5;
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            this.f5114i = str;
            return this;
        }

        public Builder setScenarioId(String str) {
            this.f5113h = str;
            return this;
        }

        public Builder setShakeViewSize(float f5, float f6) {
            this.f5118m = f5;
            this.f5119n = f6;
            return this;
        }

        public Builder setSplashPreLoad(boolean z4) {
            this.f5107b = z4;
            return this;
        }

        public Builder setSplashShakeButton(boolean z4) {
            this.f5106a = z4;
            return this;
        }

        public Builder setUseSurfaceView(boolean z4) {
            this.f5110e = z4;
            return this;
        }

        public Builder setVolume(float f5) {
            this.f5109d = f5;
            return this;
        }

        public Builder setWxAppId(String str) {
            this.f5120o = str;
            return this;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public Map<String, Object> getExtraObject() {
        return this.f5097h;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public int getRewardAmount() {
        return this.f5093d;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public String getRewardName() {
        return this.f5092c;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public String getScenarioId() {
        return this.f5099j;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public float getShakeViewHeight() {
        return this.f5103n;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public float getShakeViewWidth() {
        return this.f5102m;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public float getVolume() {
        return this.f5094e;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public String getWxAppId() {
        return this.f5104o;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isAllowShowCloseBtn() {
        return this.f5100k;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isBidNotify() {
        return this.f5098i;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isMuted() {
        return this.f5096g;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isSplashPreLoad() {
        return this.f5091b;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isSplashShakeButton() {
        return this.f5090a;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isUseSurfaceView() {
        return this.f5095f;
    }

    private MediationAdSlot() {
        this.f5092c = "";
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public MediationNativeToBannerListener getMediationNativeToBannerListener() {
        return this.f5101l;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public MediationSplashRequestInfo getMediationSplashRequestInfo() {
        return this.f5105p;
    }
}
