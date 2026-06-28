package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.Initializer;
import com.bykv.vk.openvk.api.proto.Result;
import com.bytedance.android.openliveplugin.process.LiveProcessUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.api.a;
import com.bytedance.sdk.openadsdk.api.plugin.e;
import com.bytedance.sdk.openadsdk.live.ILiveAdCustomConfig;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends com.bytedance.sdk.openadsdk.api.a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4876a = new a();

    /* renamed from: b, reason: collision with root package name */
    private volatile Initializer f4877b;

    /* renamed from: c, reason: collision with root package name */
    private d f4878c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.a.b f4879d = new com.bytedance.sdk.openadsdk.a.b() { // from class: com.bytedance.sdk.openadsdk.api.plugin.f.1
        @Override // com.bytedance.sdk.openadsdk.a.b
        public Bridge a(int i5) {
            return f.this.a(i5);
        }
    };

    /* loaded from: classes2.dex */
    private static final class a extends a.c {
        private a() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.a.c
        protected void a(Throwable th) {
            e.a(th);
        }

        @Override // com.bytedance.sdk.openadsdk.api.a.c
        protected Object a(Object obj) {
            boolean z4 = obj instanceof TTPluginListener;
            if (z4) {
                e.a(TTAppContextHolder.getContext()).a((TTPluginListener) obj);
            }
            if (!z4) {
                return obj instanceof ILiveAdCustomConfig ? com.bytedance.sdk.openadsdk.live.c.a((ILiveAdCustomConfig) obj) : obj;
            }
            TTPluginListener tTPluginListener = (TTPluginListener) obj;
            return e.a(TTAppContextHolder.getContext()).a(tTPluginListener.packageName(), tTPluginListener.config());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.api.a
    public boolean b(Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        super.b(context, adConfig, initCallback);
        this.f4878c = d.a("duration");
        if (LiveProcessUtils.inLiveProcess(TTAppContextHolder.getContext()).booleanValue()) {
            return false;
        }
        c.a(adConfig);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.a
    protected com.bytedance.sdk.openadsdk.a.b c() {
        return this.f4879d;
    }

    @Override // com.bytedance.sdk.openadsdk.api.a
    protected void a(Result result) {
        if (result.isSuccess()) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 0);
            ExecutorService executorService = (ExecutorService) TTAdSdk.getAdManager().getExtra(ExecutorService.class, bundle);
            if (executorService != null) {
                com.bytedance.sdk.openadsdk.e.a.a().a(executorService);
            }
            c.a();
            return;
        }
        c.a(result.code(), result.message(), 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.api.a
    public void b(Context context, com.bykv.a.a.a.a.b bVar) {
        d dVar = this.f4878c;
        if (dVar == null) {
            dVar = d.a("duration");
        }
        dVar.b("wait_asyn_cost");
        try {
            Initializer a5 = a(dVar);
            try {
                if (a5 != null) {
                    a(a5.getManager());
                    try {
                        dVar.a();
                        JSONObject jSONObject = new JSONObject();
                        dVar.a(jSONObject, 20L);
                        jSONObject.put("zeus", e.a(TTAppContextHolder.getContext()).a());
                        a5.init(context, bVar.g(9, jSONObject).k());
                        if (context != null) {
                            Zeus.hookHuaWeiVerifier((Application) context.getApplicationContext());
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        Zeus.unInstallPlugin(TTAdSdk.BUILT_IN_PLUGIN_NAME);
                        b(com.bykv.a.a.a.a.a.a().e(false).b(4207).d("Init error").f());
                        throw e5;
                    }
                }
                b(com.bykv.a.a.a.a.a.a().e(false).b(TTAdConstant.INIT_FAILED_CREATE_INITIALIZER_FAILED).d("Init error").f());
            } catch (Throwable th) {
                th.printStackTrace();
                b(com.bykv.a.a.a.a.a.a().e(false).b(4203).d("UnExpected initializer error :" + th.getMessage()).f());
            }
        } catch (com.bytedance.sdk.openadsdk.api.plugin.a e6) {
            e6.printStackTrace();
            b(com.bykv.a.a.a.a.a.a().e(false).b(e6.a()).d(e6.getMessage()).f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bridge a(int i5) {
        if (i5 == 2) {
            return com.bytedance.sdk.openadsdk.live.c.a();
        }
        if (i5 == 3) {
            return com.bytedance.sdk.openadsdk.downloadnew.d.a(TTAppContextHolder.getContext());
        }
        if (i5 != 4) {
            return null;
        }
        return com.bytedance.sdk.openadsdk.api.plugin.a.a.a();
    }

    @Override // com.bytedance.sdk.openadsdk.api.a
    public boolean a(Context context, com.bykv.a.a.a.a.b bVar) {
        if (this.f4877b == null) {
            return false;
        }
        this.f4877b.init(context, bVar.k());
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.a
    public boolean a() {
        if (this.f4877b != null) {
            return this.f4877b.isInitSuccess();
        }
        return false;
    }

    private Initializer a(d dVar) throws com.bytedance.sdk.openadsdk.api.plugin.a {
        if (this.f4877b == null) {
            synchronized (this) {
                if (this.f4877b == null) {
                    com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "Create initializer");
                    this.f4877b = b(dVar);
                }
            }
        }
        return this.f4877b;
    }

    @Override // com.bytedance.sdk.openadsdk.api.a
    public a.c b() {
        return f4876a;
    }

    private static Initializer b(d dVar) throws com.bytedance.sdk.openadsdk.api.plugin.a {
        try {
            dVar.b("call_create_initializer");
            BaseDexClassLoader a5 = e.a(TTAppContextHolder.getContext()).a(dVar);
            if (a5 != null) {
                Class<?> loadClass = a5.loadClass(TTAdSdk.INITIALIZER_CLASS_NAME);
                dVar.b("get_init_class_cost");
                Bundle bundle = new Bundle();
                bundle.putLong("call_init_time", dVar.b());
                bundle.putSerializable(PluginConstants.KEY_PL_UPDATE_EVENT_LISTENER, new e.c());
                dVar.b("create_bundle_cost");
                Method declaredMethod = loadClass.getDeclaredMethod("getNewInstance", Bundle.class);
                dVar.b("get_init_method_cost");
                try {
                    Initializer initializer = (Initializer) declaredMethod.invoke(null, bundle);
                    dVar.b("get_init_instance_cost");
                    com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "Create initializer success");
                    return initializer;
                } catch (Throwable th) {
                    Zeus.unInstallPlugin(TTAdSdk.BUILT_IN_PLUGIN_NAME);
                    throw th;
                }
            }
            throw new com.bytedance.sdk.openadsdk.api.plugin.a(4205, "Get initializer failed");
        } catch (Throwable th2) {
            if (th2 instanceof com.bytedance.sdk.openadsdk.api.plugin.a) {
                throw new com.bytedance.sdk.openadsdk.api.plugin.a(4205, "(" + th2.a() + ", " + th2.getMessage() + ")");
            }
            throw new com.bytedance.sdk.openadsdk.api.plugin.a(4206, th2.getMessage());
        }
    }
}
