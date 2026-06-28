package com.bytedance.sdk.openadsdk.mediation.bridge.valueset;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;

/* loaded from: classes2.dex */
public class MediationLocationImpl implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private IMediationLocation f5230a;

    public MediationLocationImpl(IMediationLocation iMediationLocation) {
        this.f5230a = iMediationLocation;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        double d5;
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        IMediationLocation iMediationLocation = this.f5230a;
        double d6 = 0.0d;
        if (iMediationLocation != null) {
            d5 = iMediationLocation.getLatitude();
        } else {
            d5 = 0.0d;
        }
        create.add(8481, d5);
        IMediationLocation iMediationLocation2 = this.f5230a;
        if (iMediationLocation2 != null) {
            d6 = iMediationLocation2.getLongitude();
        }
        create.add(8482, d6);
        return create.build();
    }
}
