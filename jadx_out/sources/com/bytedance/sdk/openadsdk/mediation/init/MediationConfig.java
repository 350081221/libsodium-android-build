package com.bytedance.sdk.openadsdk.mediation.init;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediationConfig implements IMediationConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f5247a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5248b;

    /* renamed from: c, reason: collision with root package name */
    private MediationConfigUserInfoForSegment f5249c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f5250d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5251e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f5252f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5253g;

    /* renamed from: h, reason: collision with root package name */
    private String f5254h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5255i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5256j;

    /* renamed from: k, reason: collision with root package name */
    private String f5257k;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f5258a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5259b;

        /* renamed from: c, reason: collision with root package name */
        private MediationConfigUserInfoForSegment f5260c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, Object> f5261d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5262e;

        /* renamed from: f, reason: collision with root package name */
        private JSONObject f5263f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5264g;

        /* renamed from: h, reason: collision with root package name */
        private String f5265h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f5266i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f5267j;

        /* renamed from: k, reason: collision with root package name */
        private String f5268k;

        public MediationConfig build() {
            MediationConfig mediationConfig = new MediationConfig();
            mediationConfig.f5247a = this.f5258a;
            mediationConfig.f5248b = this.f5259b;
            mediationConfig.f5249c = this.f5260c;
            mediationConfig.f5250d = this.f5261d;
            mediationConfig.f5251e = this.f5262e;
            mediationConfig.f5252f = this.f5263f;
            mediationConfig.f5253g = this.f5264g;
            mediationConfig.f5254h = this.f5265h;
            mediationConfig.f5255i = this.f5266i;
            mediationConfig.f5256j = this.f5267j;
            mediationConfig.f5257k = this.f5268k;
            return mediationConfig;
        }

        public Builder setCustomLocalConfig(JSONObject jSONObject) {
            this.f5263f = jSONObject;
            return this;
        }

        public Builder setHttps(boolean z4) {
            this.f5262e = z4;
            return this;
        }

        @Deprecated
        public Builder setLocalExtra(Map<String, Object> map) {
            this.f5261d = map;
            return this;
        }

        public Builder setMediationConfigUserInfoForSegment(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
            this.f5260c = mediationConfigUserInfoForSegment;
            return this;
        }

        public Builder setOpenAdnTest(boolean z4) {
            this.f5259b = z4;
            return this;
        }

        public Builder setOpensdkVer(String str) {
            this.f5265h = str;
            return this;
        }

        public Builder setPublisherDid(String str) {
            this.f5258a = str;
            return this;
        }

        public Builder setSupportH265(boolean z4) {
            this.f5266i = z4;
            return this;
        }

        public Builder setSupportSplashZoomout(boolean z4) {
            this.f5267j = z4;
            return this;
        }

        public Builder setWxAppId(String str) {
            this.f5268k = str;
            return this;
        }

        public Builder setWxInstalled(boolean z4) {
            this.f5264g = z4;
            return this;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public JSONObject getCustomLocalConfig() {
        return this.f5252f;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean getHttps() {
        return this.f5251e;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public Map<String, Object> getLocalExtra() {
        return this.f5250d;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public MediationConfigUserInfoForSegment getMediationConfigUserInfoForSegment() {
        return this.f5249c;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public String getOpensdkVer() {
        return this.f5254h;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public String getPublisherDid() {
        return this.f5247a;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isOpenAdnTest() {
        return this.f5248b;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isSupportH265() {
        return this.f5255i;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isSupportSplashZoomout() {
        return this.f5256j;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isWxInstalled() {
        return this.f5253g;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public String wxAppId() {
        return this.f5257k;
    }

    private MediationConfig() {
    }
}
