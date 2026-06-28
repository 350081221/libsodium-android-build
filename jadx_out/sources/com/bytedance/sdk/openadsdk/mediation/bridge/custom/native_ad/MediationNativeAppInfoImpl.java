package com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;

/* loaded from: classes2.dex */
public class MediationNativeAppInfoImpl implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private MediationNativeAdAppInfo f5217a;

    /* renamed from: b, reason: collision with root package name */
    private MediationValueSetBuilder f5218b = MediationValueSetBuilder.create();

    public MediationNativeAppInfoImpl(MediationNativeAdAppInfo mediationNativeAdAppInfo) {
        this.f5217a = mediationNativeAdAppInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        MediationNativeAdAppInfo mediationNativeAdAppInfo = this.f5217a;
        if (mediationNativeAdAppInfo != null) {
            this.f5218b.add(8505, mediationNativeAdAppInfo.getAppName());
            this.f5218b.add(8506, this.f5217a.getAuthorName());
            this.f5218b.add(8507, this.f5217a.getPackageSizeBytes());
            this.f5218b.add(8508, this.f5217a.getPermissionsUrl());
            this.f5218b.add(8509, this.f5217a.getPermissionsMap());
            this.f5218b.add(8510, this.f5217a.getPrivacyAgreement());
            this.f5218b.add(8511, this.f5217a.getVersionName());
            this.f5218b.add(8512, this.f5217a.getAppInfoExtra());
        }
        return this.f5218b.build();
    }
}
