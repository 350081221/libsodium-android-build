package com.bytedance.sdk.openadsdk.mediation.manager.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;
import java.util.Map;

/* loaded from: classes2.dex */
public class a extends MediationAdEcpmInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5307a;

    public a(Bridge bridge) {
        this.f5307a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getAbTestId() {
        return (String) this.f5307a.values().objectValue(271019, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getChannel() {
        return (String) this.f5307a.values().objectValue(271017, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public Map<String, String> getCustomData() {
        return (Map) this.f5307a.values().objectValue(271006, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getCustomSdkName() {
        return (String) this.f5307a.values().objectValue(271008, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getEcpm() {
        return (String) this.f5307a.values().objectValue(271011, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getErrorMsg() {
        return (String) this.f5307a.values().objectValue(271013, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getLevelTag() {
        return (String) this.f5307a.values().objectValue(271010, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public int getReqBiddingType() {
        return this.f5307a.values().intValue(271012);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getRequestId() {
        return (String) this.f5307a.values().objectValue(271014, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getRitType() {
        return (String) this.f5307a.values().objectValue(271015, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getScenarioId() {
        return (String) this.f5307a.values().objectValue(271020, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getSdkName() {
        return (String) this.f5307a.values().objectValue(271007, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getSegmentId() {
        return (String) this.f5307a.values().objectValue(271016, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getSlotId() {
        return (String) this.f5307a.values().objectValue(271009, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getSubChannel() {
        return (String) this.f5307a.values().objectValue(271018, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo
    public String getSubRitType() {
        return (String) this.f5307a.values().objectValue(271051, String.class);
    }
}
