package com.efs.sdk.base.core.f;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.efs.sdk.base.core.controller.ControllerCenter;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public c f6618a;

    /* renamed from: b, reason: collision with root package name */
    public ControllerCenter f6619b;

    /* renamed from: c, reason: collision with root package name */
    public d f6620c;

    /* renamed from: d, reason: collision with root package name */
    public g f6621d;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f6622a = new f(0);

        public static /* synthetic */ f a() {
            return f6622a;
        }
    }

    /* synthetic */ f(byte b5) {
        this();
    }

    public final void a(String str, String str2, String str3) {
        this.f6621d.a(str, str2, str3);
    }

    private f() {
        this.f6618a = new c();
        this.f6620c = new d();
        this.f6621d = new g();
    }

    public final void a(int i5) {
        ControllerCenter controllerCenter = this.f6619b;
        if (controllerCenter != null) {
            controllerCenter.send(a("flow_limit", i5));
        }
    }

    public final void a(int i5, String str) {
        if (this.f6619b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            b a5 = a("flow_limit_type", i5);
            a5.put(PluginConstants.KEY_ERROR_CODE, str);
            this.f6619b.send(a5);
        }
    }

    public final b a(String str, int i5) {
        b bVar = new b("efs_core", str, this.f6618a.f6612c);
        bVar.put("cver", Integer.valueOf(i5));
        return bVar;
    }
}
