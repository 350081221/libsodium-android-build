package com.bytedance.sdk.openadsdk.c.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4909a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTAdNative.CSJSplashAdListener f4910b;

    public b(TTAdNative.CSJSplashAdListener cSJSplashAdListener) {
        this.f4910b = cSJSplashAdListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f4910b == null) {
            return null;
        }
        switch (i5) {
            case 114102:
                Bridge bridge = (Bridge) valueSet.objectValue(0, Bridge.class);
                com.bytedance.sdk.openadsdk.c.a.a.b bVar = new com.bytedance.sdk.openadsdk.c.a.a.b(bridge);
                if (bridge != null) {
                    try {
                        if (bridge.values().intValue(1) >= 5700) {
                            this.f4910b.onSplashLoadSuccess(bVar);
                        } else {
                            Method declaredMethod = this.f4910b.getClass().getDeclaredMethod("onSplashLoadSuccess", null);
                            if (declaredMethod != null) {
                                declaredMethod.invoke(this.f4910b, new Object[0]);
                            }
                        }
                        break;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        break;
                    }
                }
                break;
            case 114103:
                this.f4910b.onSplashLoadFail(new com.bytedance.sdk.openadsdk.c.a.a.a((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 114104:
                this.f4910b.onSplashRenderSuccess(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 114105:
                this.f4910b.onSplashRenderFail(new com.bytedance.sdk.openadsdk.c.a.a.b((Bridge) valueSet.objectValue(0, Bridge.class)), new com.bytedance.sdk.openadsdk.c.a.a.a((Bridge) valueSet.objectValue(1, Bridge.class)));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4909a;
    }
}
