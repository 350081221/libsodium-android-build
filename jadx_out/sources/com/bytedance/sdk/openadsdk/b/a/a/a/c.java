package com.bytedance.sdk.openadsdk.b.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.CSJSplashAd;

/* loaded from: classes2.dex */
public class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4885a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final CSJSplashAd.SplashClickEyeListener f4886b;

    public c(CSJSplashAd.SplashClickEyeListener splashClickEyeListener) {
        this.f4886b = splashClickEyeListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        CSJSplashAd.SplashClickEyeListener splashClickEyeListener = this.f4886b;
        if (splashClickEyeListener == null) {
            return null;
        }
        switch (i5) {
            case 113101:
                this.f4886b.onSplashClickEyeReadyToShow(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 113102:
                splashClickEyeListener.onSplashClickEyeClick();
                break;
            case 113103:
                splashClickEyeListener.onSplashClickEyeClose();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4885a;
    }
}
