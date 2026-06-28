package com.bytedance.sdk.openadsdk.mediation.bridge.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public final class MediationCustomServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f5190a;

    /* renamed from: b, reason: collision with root package name */
    private String f5191b;

    /* renamed from: c, reason: collision with root package name */
    private int f5192c;

    /* renamed from: d, reason: collision with root package name */
    private int f5193d;

    /* renamed from: e, reason: collision with root package name */
    private String f5194e;

    public MediationCustomServiceConfig(String str, String str2, int i5, int i6, String str3) {
        this.f5190a = str;
        this.f5191b = str2;
        this.f5192c = i5;
        this.f5193d = i6;
        this.f5194e = str3;
    }

    public String getADNNetworkName() {
        return this.f5190a;
    }

    public String getADNNetworkSlotId() {
        return this.f5191b;
    }

    public int getAdStyleType() {
        return this.f5192c;
    }

    public String getCustomAdapterJson() {
        return this.f5194e;
    }

    public int getSubAdtype() {
        return this.f5193d;
    }

    public String toString() {
        return "MediationCustomServiceConfig{mADNNetworkName='" + this.f5190a + "', mADNNetworkSlotId='" + this.f5191b + "', mAdStyleType=" + this.f5192c + ", mSubAdtype=" + this.f5193d + ", mCustomAdapterJson='" + this.f5194e + "'}";
    }

    public MediationCustomServiceConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.f5190a = valueSet.stringValue(8003);
            this.f5191b = valueSet.stringValue(2);
            this.f5192c = valueSet.intValue(8008);
            this.f5193d = valueSet.intValue(8094);
            this.f5194e = valueSet.stringValue(8547);
        }
    }
}
