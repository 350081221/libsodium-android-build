package com.bytedance.sdk.openadsdk.mediation.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;

/* loaded from: classes2.dex */
public class d extends com.bytedance.sdk.openadsdk.g.a.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    private TTAdNative.FullScreenVideoAdListener f5078a;

    public d(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        super(fullScreenVideoAdListener);
        this.f5078a = fullScreenVideoAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.g.a.a.a.c, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 == 132102) {
            if (this.f5078a != null) {
                this.f5078a.onFullScreenVideoAdLoad(new m((Bridge) valueSet.objectValue(0, Bridge.class)));
                return null;
            }
        } else if (i5 == 132103 && this.f5078a != null) {
            this.f5078a.onFullScreenVideoCached(new m((Bridge) valueSet.objectValue(0, Bridge.class)));
            return null;
        }
        return (T) super.call(i5, valueSet, cls);
    }
}
