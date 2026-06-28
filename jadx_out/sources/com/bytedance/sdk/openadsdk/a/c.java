package com.bytedance.sdk.openadsdk.a;

import android.app.Application;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.a.a;

/* loaded from: classes2.dex */
public final class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f4759a;

    /* renamed from: b, reason: collision with root package name */
    private b f4760b;

    /* renamed from: c, reason: collision with root package name */
    private a f4761c = new a();

    private c() {
    }

    public static c a() {
        if (f4759a == null) {
            synchronized (c.class) {
                if (f4759a == null) {
                    f4759a = new c();
                }
            }
        }
        return f4759a;
    }

    public Application.ActivityLifecycleCallbacks b() {
        return this.f4761c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        Bridge a5;
        switch (i5) {
            case 2:
                return (T) this.f4761c.a();
            case 3:
                return (T) TTAppContextHolder.getContext();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                b bVar = this.f4760b;
                if (bVar == null || (a5 = bVar.a(4)) == null) {
                    return null;
                }
                return (T) a5.call(i5, valueSet, cls);
            case 9:
                Object objectValue = valueSet.objectValue(0, Object.class);
                if (objectValue instanceof EventListener) {
                    a((EventListener) objectValue);
                }
                return null;
            case 10:
                b bVar2 = this.f4760b;
                if (bVar2 == null) {
                    return null;
                }
                return (T) bVar2.a(valueSet.intValue(0));
            default:
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bykv.a.a.a.a.b.a().e(10000, 5).k();
    }

    public void a(b bVar) {
        this.f4760b = bVar;
    }

    private void a(final EventListener eventListener) {
        this.f4761c.a(new a.InterfaceC0125a() { // from class: com.bytedance.sdk.openadsdk.a.c.1
            @Override // com.bytedance.sdk.openadsdk.a.a.InterfaceC0125a
            public void a() {
                eventListener.onEvent(0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.a.a.InterfaceC0125a
            public void b() {
                eventListener.onEvent(1, null);
            }
        });
    }
}
