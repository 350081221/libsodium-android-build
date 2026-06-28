package com.bytedance.sdk.openadsdk.b.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.CSJSplashAd;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4883a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final CSJSplashAd.SplashCardListener f4884b;

    public b(CSJSplashAd.SplashCardListener splashCardListener) {
        this.f4884b = splashCardListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        CSJSplashAd.SplashCardListener splashCardListener = this.f4884b;
        if (splashCardListener == null) {
            return null;
        }
        switch (i5) {
            case 112102:
                splashCardListener.onSplashCardClick();
                break;
            case 112103:
                splashCardListener.onSplashCardClose();
                break;
            case 121201:
                this.f4884b.onSplashCardReadyToShow(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4883a;
    }
}
