package com.bytedance.sdk.openadsdk.mediation.bridge.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public class MediationCustomInitConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f5178a;

    /* renamed from: b, reason: collision with root package name */
    private String f5179b;

    /* renamed from: c, reason: collision with root package name */
    private String f5180c;

    /* renamed from: d, reason: collision with root package name */
    private String f5181d;

    /* renamed from: e, reason: collision with root package name */
    private String f5182e;

    /* renamed from: f, reason: collision with root package name */
    private String f5183f;

    /* renamed from: g, reason: collision with root package name */
    private String f5184g;

    /* renamed from: h, reason: collision with root package name */
    private String f5185h;

    /* renamed from: i, reason: collision with root package name */
    private String f5186i;

    /* renamed from: j, reason: collision with root package name */
    private String f5187j;

    /* renamed from: k, reason: collision with root package name */
    private String f5188k;

    public MediationCustomInitConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5180c = str;
        this.f5178a = str2;
        this.f5179b = str3;
        this.f5181d = str4;
        this.f5182e = str5;
        this.f5183f = str6;
        this.f5184g = str7;
        this.f5185h = str8;
        this.f5186i = str9;
        this.f5187j = str10;
        this.f5188k = str11;
    }

    public String getADNName() {
        return this.f5180c;
    }

    public String getAdnInitClassName() {
        return this.f5181d;
    }

    public String getAppId() {
        return this.f5178a;
    }

    public String getAppKey() {
        return this.f5179b;
    }

    public String getBannerClassName() {
        return this.f5182e;
    }

    public String getDrawClassName() {
        return this.f5188k;
    }

    public String getFeedClassName() {
        return this.f5187j;
    }

    public String getFullVideoClassName() {
        return this.f5185h;
    }

    public String getInterstitialClassName() {
        return this.f5183f;
    }

    public String getRewardClassName() {
        return this.f5184g;
    }

    public String getSplashClassName() {
        return this.f5186i;
    }

    public String toString() {
        return "MediationCustomInitConfig{mAppId='" + this.f5178a + "', mAppKey='" + this.f5179b + "', mADNName='" + this.f5180c + "', mAdnInitClassName='" + this.f5181d + "', mBannerClassName='" + this.f5182e + "', mInterstitialClassName='" + this.f5183f + "', mRewardClassName='" + this.f5184g + "', mFullVideoClassName='" + this.f5185h + "', mSplashClassName='" + this.f5186i + "', mFeedClassName='" + this.f5187j + "', mDrawClassName='" + this.f5188k + "'}";
    }

    public MediationCustomInitConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.f5180c = valueSet.stringValue(8003);
            this.f5178a = valueSet.stringValue(8534);
            this.f5179b = valueSet.stringValue(8535);
            this.f5181d = valueSet.stringValue(8536);
            this.f5182e = valueSet.stringValue(8537);
            this.f5183f = valueSet.stringValue(8538);
            this.f5184g = valueSet.stringValue(8539);
            this.f5185h = valueSet.stringValue(8540);
            this.f5186i = valueSet.stringValue(8541);
            this.f5187j = valueSet.stringValue(8542);
            this.f5188k = valueSet.stringValue(8543);
        }
    }
}
