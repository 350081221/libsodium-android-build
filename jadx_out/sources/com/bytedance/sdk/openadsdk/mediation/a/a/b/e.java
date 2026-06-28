package com.bytedance.sdk.openadsdk.mediation.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.MediationAppDialogClickListener;

/* loaded from: classes2.dex */
public class e implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5075a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final MediationAppDialogClickListener f5076b;

    public e(MediationAppDialogClickListener mediationAppDialogClickListener) {
        this.f5076b = mediationAppDialogClickListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5076b == null) {
            return null;
        }
        if (i5 == 270025) {
            this.f5076b.onButtonClick(valueSet.intValue(0));
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5075a;
    }
}
