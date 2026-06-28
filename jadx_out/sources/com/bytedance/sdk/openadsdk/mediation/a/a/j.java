package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;

/* loaded from: classes2.dex */
public class j implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5084a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final MediationAdDislike f5085b;

    public j(MediationAdDislike mediationAdDislike) {
        this.f5085b = mediationAdDislike;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        MediationAdDislike mediationAdDislike = this.f5085b;
        if (mediationAdDislike == null) {
            return null;
        }
        switch (i5) {
            case 270032:
                mediationAdDislike.showDislikeDialog();
                break;
            case 270033:
                this.f5085b.setDislikeCallback(new f((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5084a;
    }
}
