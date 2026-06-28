package com.bytedance.sdk.openadsdk.g.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.c.a.a.l;

/* loaded from: classes2.dex */
public class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4988a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.FullScreenVideoAdListener f4989b;

    public c(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f4989b = fullScreenVideoAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener = this.f4989b;
        if (fullScreenVideoAdListener == null) {
            return null;
        }
        switch (i5) {
            case 132101:
                this.f4989b.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 132102:
                this.f4989b.onFullScreenVideoAdLoad(new l((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 132103:
                this.f4989b.onFullScreenVideoCached(new l((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 132104:
                fullScreenVideoAdListener.onFullScreenVideoCached();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4988a;
    }
}
