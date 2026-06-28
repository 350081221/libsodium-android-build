package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.ComplianceInfo;
import java.util.Map;

/* loaded from: classes2.dex */
public class c implements ComplianceInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4892a;

    public c(Bridge bridge) {
        this.f4892a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getAppName() {
        return (String) this.f4892a.values().objectValue(250001, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getAppVersion() {
        return (String) this.f4892a.values().objectValue(250002, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getDeveloperName() {
        return (String) this.f4892a.values().objectValue(250003, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getFunctionDescUrl() {
        return (String) this.f4892a.values().objectValue(250007, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getPermissionUrl() {
        return (String) this.f4892a.values().objectValue(250005, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public Map<String, String> getPermissionsMap() {
        return (Map) this.f4892a.values().objectValue(250006, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getPrivacyUrl() {
        return (String) this.f4892a.values().objectValue(250004, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.ComplianceInfo
    public String getRegNumber() {
        return (String) this.f4892a.values().objectValue(250008, String.class);
    }
}
