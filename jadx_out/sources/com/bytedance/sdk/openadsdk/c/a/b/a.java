package com.bytedance.sdk.openadsdk.c.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4911a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdInteractionListener f4912b;

    public a(TTAdInteractionListener tTAdInteractionListener) {
        this.f4912b = tTAdInteractionListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4912b == null) {
            return null;
        }
        if (i5 == 100101) {
            this.f4912b.onAdEvent(valueSet.intValue(0), (Map) valueSet.objectValue(1, Map.class));
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4911a;
    }
}
