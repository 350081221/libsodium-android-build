package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.Map;

/* loaded from: classes2.dex */
public class MediationNativeAdAppInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f5122a;

    /* renamed from: b, reason: collision with root package name */
    private String f5123b;

    /* renamed from: c, reason: collision with root package name */
    private long f5124c;

    /* renamed from: d, reason: collision with root package name */
    private String f5125d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f5126e;

    /* renamed from: f, reason: collision with root package name */
    private String f5127f;

    /* renamed from: g, reason: collision with root package name */
    private String f5128g;

    /* renamed from: h, reason: collision with root package name */
    private String f5129h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f5130i;

    public Map<String, Object> getAppInfoExtra() {
        return this.f5130i;
    }

    public String getAppName() {
        return this.f5122a;
    }

    public String getAuthorName() {
        return this.f5123b;
    }

    public String getFunctionDescUrl() {
        return this.f5129h;
    }

    public long getPackageSizeBytes() {
        return this.f5124c;
    }

    public Map<String, String> getPermissionsMap() {
        return this.f5126e;
    }

    public String getPermissionsUrl() {
        return this.f5125d;
    }

    public String getPrivacyAgreement() {
        return this.f5127f;
    }

    public String getVersionName() {
        return this.f5128g;
    }

    public void setAppInfoExtra(Map<String, Object> map) {
        this.f5130i = map;
    }

    public void setAppName(String str) {
        this.f5122a = str;
    }

    public void setAuthorName(String str) {
        this.f5123b = str;
    }

    public void setFunctionDescUrl(String str) {
        this.f5129h = str;
    }

    public void setPackageSizeBytes(long j5) {
        this.f5124c = j5;
    }

    public void setPermissionsMap(Map<String, String> map) {
        this.f5126e = map;
    }

    public void setPermissionsUrl(String str) {
        this.f5125d = str;
    }

    public void setPrivacyAgreement(String str) {
        this.f5127f = str;
    }

    public void setVersionName(String str) {
        this.f5128g = str;
    }
}
