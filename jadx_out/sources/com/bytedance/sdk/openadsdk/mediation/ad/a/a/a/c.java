package com.bytedance.sdk.openadsdk.mediation.ad.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends MediationNativeAdAppInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5151a;

    public c(Bridge bridge) {
        this.f5151a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public Map<String, Object> getAppInfoExtra() {
        return (Map) this.f5151a.call(271042, com.bykv.a.a.a.a.b.b(0).k(), Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public String getAppName() {
        return (String) this.f5151a.call(271035, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public String getAuthorName() {
        return (String) this.f5151a.call(271036, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public String getFunctionDescUrl() {
        return (String) this.f5151a.call(271047, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public long getPackageSizeBytes() {
        return ((Long) this.f5151a.call(271037, com.bykv.a.a.a.a.b.b(0).k(), Long.TYPE)).longValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public Map<String, String> getPermissionsMap() {
        return (Map) this.f5151a.call(271039, com.bykv.a.a.a.a.b.b(0).k(), Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public String getPermissionsUrl() {
        return (String) this.f5151a.call(271038, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public String getPrivacyAgreement() {
        return (String) this.f5151a.call(271040, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo
    public String getVersionName() {
        return (String) this.f5151a.call(271041, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }
}
