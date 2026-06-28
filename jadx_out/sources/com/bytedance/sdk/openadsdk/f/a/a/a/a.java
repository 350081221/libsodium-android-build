package com.bytedance.sdk.openadsdk.f.a.a.a;

import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdDislike;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4982a = b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdDislike.DislikeInteractionCallback f4983b;

    public a(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f4983b = dislikeInteractionCallback;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback = this.f4983b;
        if (dislikeInteractionCallback == null) {
            return null;
        }
        switch (i5) {
            case 244101:
                dislikeInteractionCallback.onShow();
                break;
            case 244102:
                this.f4983b.onSelected(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class), valueSet.booleanValue(2));
                break;
            case 244103:
                dislikeInteractionCallback.onCancel();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4982a;
    }
}
