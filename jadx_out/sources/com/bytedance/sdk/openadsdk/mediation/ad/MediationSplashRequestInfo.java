package com.bytedance.sdk.openadsdk.mediation.ad;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class MediationSplashRequestInfo implements IMediationSplashRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f5131a;

    /* renamed from: b, reason: collision with root package name */
    private String f5132b;

    /* renamed from: c, reason: collision with root package name */
    private String f5133c;

    /* renamed from: d, reason: collision with root package name */
    private String f5134d;

    public MediationSplashRequestInfo(String str, String str2, String str3, String str4) {
        this.f5131a = str;
        this.f5132b = str2;
        this.f5133c = str3;
        this.f5134d = str4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAdnName() {
        return this.f5131a;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAdnSlotId() {
        return this.f5132b;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAppId() {
        return this.f5133c;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAppkey() {
        return this.f5134d;
    }
}
