package com.bytedance.sdk.openadsdk.mediation.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public final class MediationCustomServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f5242a;

    /* renamed from: b, reason: collision with root package name */
    private String f5243b;

    /* renamed from: c, reason: collision with root package name */
    private int f5244c;

    /* renamed from: d, reason: collision with root package name */
    private int f5245d;

    /* renamed from: e, reason: collision with root package name */
    private String f5246e;

    public MediationCustomServiceConfig(String str, String str2, int i5, int i6, String str3) {
        this.f5242a = str;
        this.f5243b = str2;
        this.f5244c = i5;
        this.f5245d = i6;
        this.f5246e = str3;
    }

    public String getADNNetworkName() {
        return this.f5242a;
    }

    public String getADNNetworkSlotId() {
        return this.f5243b;
    }

    public int getAdStyleType() {
        return this.f5244c;
    }

    public String getCustomAdapterJson() {
        return this.f5246e;
    }

    public int getSubAdtype() {
        return this.f5245d;
    }

    public String toString() {
        return "MediationCustomServiceConfig{mADNNetworkName='" + this.f5242a + "', mADNNetworkSlotId='" + this.f5243b + "', mAdStyleType=" + this.f5244c + ", mSubAdtype=" + this.f5245d + ", mCustomAdapterJson='" + this.f5246e + "'}";
    }

    public MediationCustomServiceConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.f5242a = valueSet.stringValue(8003);
            this.f5243b = valueSet.stringValue(2);
            this.f5244c = valueSet.intValue(8008);
            this.f5245d = valueSet.intValue(8094);
            this.f5246e = valueSet.stringValue(8547);
        }
    }
}
