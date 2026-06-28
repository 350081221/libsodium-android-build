package com.bytedance.sdk.openadsdk.mediation.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public class MediationCustomInitConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f5231a;

    /* renamed from: b, reason: collision with root package name */
    private String f5232b;

    /* renamed from: c, reason: collision with root package name */
    private String f5233c;

    /* renamed from: d, reason: collision with root package name */
    private String f5234d;

    /* renamed from: e, reason: collision with root package name */
    private String f5235e;

    /* renamed from: f, reason: collision with root package name */
    private String f5236f;

    /* renamed from: g, reason: collision with root package name */
    private String f5237g;

    /* renamed from: h, reason: collision with root package name */
    private String f5238h;

    /* renamed from: i, reason: collision with root package name */
    private String f5239i;

    /* renamed from: j, reason: collision with root package name */
    private String f5240j;

    /* renamed from: k, reason: collision with root package name */
    private String f5241k;

    public MediationCustomInitConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5233c = str;
        this.f5231a = str2;
        this.f5232b = str3;
        this.f5234d = str4;
        this.f5235e = str5;
        this.f5236f = str6;
        this.f5237g = str7;
        this.f5238h = str8;
        this.f5239i = str9;
        this.f5240j = str10;
        this.f5241k = str11;
    }

    public String getADNName() {
        return this.f5233c;
    }

    public String getAdnInitClassName() {
        return this.f5234d;
    }

    public String getAppId() {
        return this.f5231a;
    }

    public String getAppKey() {
        return this.f5232b;
    }

    public String getBannerClassName() {
        return this.f5235e;
    }

    public String getDrawClassName() {
        return this.f5241k;
    }

    public String getFeedClassName() {
        return this.f5240j;
    }

    public String getFullVideoClassName() {
        return this.f5238h;
    }

    public String getInterstitialClassName() {
        return this.f5236f;
    }

    public String getRewardClassName() {
        return this.f5237g;
    }

    public String getSplashClassName() {
        return this.f5239i;
    }

    public String toString() {
        return "MediationCustomInitConfig{mAppId='" + this.f5231a + "', mAppKey='" + this.f5232b + "', mADNName='" + this.f5233c + "', mAdnInitClassName='" + this.f5234d + "', mBannerClassName='" + this.f5235e + "', mInterstitialClassName='" + this.f5236f + "', mRewardClassName='" + this.f5237g + "', mFullVideoClassName='" + this.f5238h + "', mSplashClassName='" + this.f5239i + "', mFeedClassName='" + this.f5240j + "', mDrawClassName='" + this.f5241k + "'}";
    }

    public MediationCustomInitConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.f5233c = valueSet.stringValue(8003);
            this.f5231a = valueSet.stringValue(8534);
            this.f5232b = valueSet.stringValue(8535);
            this.f5234d = valueSet.stringValue(8536);
            this.f5235e = valueSet.stringValue(8537);
            this.f5236f = valueSet.stringValue(8538);
            this.f5237g = valueSet.stringValue(8539);
            this.f5238h = valueSet.stringValue(8540);
            this.f5239i = valueSet.stringValue(8541);
            this.f5240j = valueSet.stringValue(8542);
            this.f5241k = valueSet.stringValue(8543);
        }
    }
}
