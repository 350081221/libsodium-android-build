package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.CSJConfig;
import com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth;
import com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig;

/* loaded from: classes2.dex */
public final class TTAdConfig extends CSJConfig {

    /* renamed from: a, reason: collision with root package name */
    private ITTLiveTokenInjectionAuth f4743a;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private ITTLiveTokenInjectionAuth f4744a;

        /* renamed from: b, reason: collision with root package name */
        private CSJConfig.a f4745b = new CSJConfig.a();

        public Builder addExtra(String str, Object obj) {
            this.f4745b.a(str, obj);
            return this;
        }

        public Builder allowShowNotify(boolean z4) {
            this.f4745b.b(z4);
            return this;
        }

        public Builder appId(String str) {
            this.f4745b.a(str);
            return this;
        }

        public Builder appName(String str) {
            this.f4745b.b(str);
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig(this.f4745b);
            tTAdConfig.setInjectionAuth(this.f4744a);
            return tTAdConfig;
        }

        public Builder customController(TTCustomController tTCustomController) {
            this.f4745b.a(tTCustomController);
            return this;
        }

        public Builder data(String str) {
            this.f4745b.d(str);
            return this;
        }

        public Builder debug(boolean z4) {
            this.f4745b.c(z4);
            return this;
        }

        public Builder directDownloadNetworkType(int... iArr) {
            this.f4745b.a(iArr);
            return this;
        }

        public Builder injectionAuth(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
            this.f4744a = iTTLiveTokenInjectionAuth;
            return this;
        }

        public Builder keywords(String str) {
            this.f4745b.c(str);
            return this;
        }

        public Builder paid(boolean z4) {
            this.f4745b.a(z4);
            return this;
        }

        public Builder setAgeGroup(int i5) {
            this.f4745b.d(i5);
            return this;
        }

        public Builder setMediationConfig(IMediationConfig iMediationConfig) {
            this.f4745b.a(iMediationConfig);
            return this;
        }

        public Builder setPluginUpdateConfig(int i5) {
            this.f4745b.c(i5);
            return this;
        }

        public Builder supportMultiProcess(boolean z4) {
            this.f4745b.d(z4);
            return this;
        }

        public Builder themeStatus(int i5) {
            this.f4745b.b(i5);
            return this;
        }

        public Builder titleBarTheme(int i5) {
            this.f4745b.a(i5);
            return this;
        }

        public Builder useMediation(boolean z4) {
            this.f4745b.e(z4);
            return this;
        }
    }

    public ITTLiveTokenInjectionAuth getInjectionAuth() {
        return this.f4743a;
    }

    public void setInjectionAuth(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
        this.f4743a = iTTLiveTokenInjectionAuth;
    }

    private TTAdConfig(CSJConfig.a aVar) {
        super(aVar);
    }
}
