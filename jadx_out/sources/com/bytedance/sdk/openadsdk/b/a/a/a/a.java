package com.bytedance.sdk.openadsdk.b.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.CSJSplashAd;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4881a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final CSJSplashAd.SplashAdListener f4882b;

    public a(CSJSplashAd.SplashAdListener splashAdListener) {
        this.f4882b = splashAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4882b == null) {
            return null;
        }
        switch (i5) {
            case 111101:
                this.f4882b.onSplashAdShow(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 111102:
                this.f4882b.onSplashAdClick(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 111103:
                this.f4882b.onSplashAdClose(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)), valueSet.intValue(1));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4881a;
    }
}
