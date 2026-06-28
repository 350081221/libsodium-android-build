package com.bytedance.sdk.openadsdk.live;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.android.live.base.api.ILiveHostContextParam;
import com.bytedance.android.live.base.api.ILiveInitCallback;
import com.bytedance.android.live.base.api.IOuterLiveService;
import com.bytedance.android.live.base.api.MethodChannelService;
import com.bytedance.android.openliveplugin.LivePluginHelper;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.c.a.a.i;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private static final c f5026a = new c();

    /* renamed from: b, reason: collision with root package name */
    private ITTLiveTokenInjectionAuth f5027b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Bridge f5028c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f5029d;

    /* renamed from: e, reason: collision with root package name */
    private volatile b f5030e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements Bridge {

        /* renamed from: a, reason: collision with root package name */
        private ILiveAdCustomConfig f5033a;

        a(ILiveAdCustomConfig iLiveAdCustomConfig) {
            this.f5033a = iLiveAdCustomConfig;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                return null;
                            }
                            this.f5033a.onEventV3(valueSet.stringValue(0), (JSONObject) valueSet.objectValue(1, JSONObject.class));
                            return null;
                        }
                        return (T) this.f5033a.invoke(valueSet.intValue(0), (Bundle) valueSet.objectValue(1, Bundle.class));
                    }
                    return (T) this.f5033a.convertToEnterMethod(valueSet.intValue(0), valueSet.booleanValue(1));
                }
                return (T) this.f5033a.convertToEnterFromMerge(valueSet.intValue(0));
            }
            return (T) Integer.valueOf(this.f5033a.openLR(valueSet.stringValue(0)));
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return com.bykv.a.a.a.a.b.a().e(10000, 1).k();
        }
    }

    /* loaded from: classes2.dex */
    private final class b implements TTPluginListener {

        /* renamed from: a, reason: collision with root package name */
        int f5034a;

        /* renamed from: b, reason: collision with root package name */
        String f5035b;

        private b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTPluginListener
        public Bundle config() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.TTPluginListener
        public void onPluginListener(int i5, ClassLoader classLoader, Resources resources, Bundle bundle) {
            a(i5, classLoader, resources, bundle, false);
        }

        @Override // com.bytedance.sdk.openadsdk.TTPluginListener
        public String packageName() {
            return "com.byted.live.lite";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i5, ClassLoader classLoader, Resources resources, Bundle bundle, boolean z4) {
            this.f5034a = i5;
            if (c.this.f5028c != null) {
                c.this.f5028c.call(3, com.bykv.a.a.a.a.b.a().e(0, i5).g(1, classLoader).g(2, resources).g(3, bundle).g(4, c.this.a(z4)).k(), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i5, String str, boolean z4) {
            this.f5034a = i5;
            this.f5035b = str;
            if (c.this.f5028c != null) {
                com.bykv.a.a.a.a.b e5 = com.bykv.a.a.a.a.b.a().e(0, i5);
                if (str != null) {
                    e5.h(1, str);
                }
                e5.g(2, c.this.a(z4));
                c.this.f5028c.call(2, e5.k(), null);
            }
        }
    }

    private c() {
    }

    private void c(Map map) {
        ILiveHostContextParam.Builder addHostInitExtra = new ILiveHostContextParam.Builder().setAppName(String.valueOf(map.get("app_name"))).setChannel(String.valueOf(map.get("channel"))).setIsDebug(Boolean.valueOf(String.valueOf(map.get("debug"))).booleanValue()).setECHostAppId(String.valueOf(map.get("ec_host_appid"))).setPartner(String.valueOf(map.get(i0.b.f16186z0))).provideMethodChannel(new MethodChannelService() { // from class: com.bytedance.sdk.openadsdk.live.c.1
            @Override // com.bytedance.android.live.base.api.MethodChannelService
            public String identity() {
                return MediationConstant.ADN_PANGLE;
            }

            @Override // com.bytedance.android.live.base.api.MethodChannelService
            public Object invokeMethod(String str, Map<String, String> map2) {
                if (c.this.f5028c != null) {
                    return c.this.f5028c.call(0, com.bykv.a.a.a.a.b.a().h(0, str).g(1, map2).k(), Object.class);
                }
                return null;
            }
        }).setPartnerSecret("p_secret").setHostPermission(new com.bytedance.sdk.openadsdk.live.a.a(d(map))).setHostActionParam(new com.bytedance.sdk.openadsdk.live.a.b(this.f5028c)).addHostInitExtra(b(map));
        ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth = this.f5027b;
        if (iTTLiveTokenInjectionAuth != null) {
            addHostInitExtra.setInjectionAuth(new com.bytedance.sdk.openadsdk.live.a.c(iTTLiveTokenInjectionAuth));
        }
        Map<String, String> map2 = this.f5029d;
        if (map2 != null) {
            addHostInitExtra.addHostInitExtra(map2);
        }
        ILiveInitCallback iLiveInitCallback = new ILiveInitCallback() { // from class: com.bytedance.sdk.openadsdk.live.c.2
            @Override // com.bytedance.android.live.base.api.ILiveInitCallback
            public void onLiveInitFailed(String str) {
                com.bytedance.sdk.openadsdk.api.c.a("TTLiveSDkBridge", "onLiveInitFailed! ", str);
                if (c.this.f5030e != null) {
                    c.this.f5030e.a(-3, str, false);
                }
            }

            @Override // com.bytedance.android.live.base.api.ILiveInitCallback
            public void onLiveInitFinish() {
                com.bytedance.sdk.openadsdk.api.c.b("TTLiveSDkBridge", "onLiveInitFinish!");
                com.bytedance.sdk.openadsdk.live.b.a();
                if (c.this.f5030e != null) {
                    c.this.f5030e.a(2, null, false);
                }
                c.this.f5029d = null;
                c.this.f5027b = null;
            }
        };
        if (TTAppContextHolder.getContext() instanceof Application) {
            addHostInitExtra.setContext((Application) TTAppContextHolder.getContext());
        }
        boolean booleanValue = Boolean.valueOf(String.valueOf(map.get("sub_process"))).booleanValue();
        com.bytedance.sdk.openadsdk.api.c.a("TTLiveSDkBridge", "execute live sdk initLive method end, (方法顺利执行结果)result: ", Boolean.valueOf(com.bytedance.sdk.openadsdk.live.b.a(TTAppContextHolder.getContext(), String.valueOf(map.get("g_appid")), addHostInitExtra, iLiveInitCallback, booleanValue)), " subProcess=", Boolean.valueOf(booleanValue));
    }

    private TTCustomController d(Map map) {
        Object obj = map.get("c_control");
        if (obj instanceof Bridge) {
            return new i((Bridge) obj);
        }
        return null;
    }

    private Object e(Map<String, Object> map) {
        try {
            String str = (String) map.get("expand_method_name");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            IOuterLiveService liveRoomService = LivePluginHelper.getLiveRoomService();
            Object[] objArr = (Object[]) map.get("expand_method_param");
            if (objArr != null) {
                for (int i5 = 0; i5 < objArr.length; i5++) {
                    Object obj = objArr[i5];
                    if (obj instanceof Bridge) {
                        objArr[i5] = new com.bytedance.sdk.openadsdk.live.a((Bridge) obj);
                    }
                }
                return liveRoomService.callExpandMethod(str, objArr);
            }
            return liveRoomService.callExpandMethod(str, new Object[0]);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.b("TTLiveSDkBridge", th);
            return null;
        }
    }

    private Boolean f(Map<String, Object> map) {
        try {
            String str = (String) map.get("scheme_uri");
            if (TextUtils.isEmpty(str)) {
                return Boolean.FALSE;
            }
            Context a5 = a(map.get(d.X));
            Uri parse = Uri.parse(str);
            if (parse != null && a5 != null) {
                return Boolean.valueOf(com.bytedance.sdk.openadsdk.live.b.a(a5, parse));
            }
            return Boolean.FALSE;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.b("TTLiveSDkBridge", th);
            return Boolean.FALSE;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 != 5) {
            if (i5 != 9) {
                return (T) a(cls, i5, (Map) valueSet.objectValue(0, Map.class));
            }
            this.f5028c = (Bridge) valueSet.objectValue(0, Bridge.class);
            if (this.f5030e != null) {
                if (this.f5030e.f5034a == 2 || this.f5030e.f5034a == -3) {
                    this.f5030e.a(this.f5030e.f5034a, this.f5030e.f5035b, true);
                } else if (this.f5030e.f5034a != 0) {
                    this.f5030e.a(this.f5030e.f5034a, null, null, null, true);
                }
            } else {
                this.f5030e = new b();
                Bridge bridge = (Bridge) com.bytedance.sdk.openadsdk.a.c.a().call(10, com.bykv.a.a.a.a.b.b(1).e(0, 4).k(), Bridge.class);
                ValueSet k5 = com.bykv.a.a.a.a.b.b(1).g(0, this.f5030e).k();
                if (bridge != null) {
                    bridge.call(106, k5, Void.class);
                }
            }
            return null;
        }
        c((Map) valueSet.objectValue(0, Map.class));
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bykv.a.a.a.a.b.a().e(10000, 2).k();
    }

    private Map<String, String> b(Map map) {
        Map<String, Object> userPrivacyConfig;
        HashMap hashMap = new HashMap();
        TTCustomController d5 = d(map);
        if (d5 == null || (userPrivacyConfig = d5.userPrivacyConfig()) == null) {
            return hashMap;
        }
        Object obj = userPrivacyConfig.get("motion_info");
        if ((obj instanceof String) && TextUtils.equals((String) obj, "0")) {
            hashMap.put("can_use_sensor", "false");
        }
        return hashMap;
    }

    public static c a() {
        return f5026a;
    }

    public static Bridge a(ILiveAdCustomConfig iLiveAdCustomConfig) {
        return new a(iLiveAdCustomConfig);
    }

    public void a(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
        this.f5027b = iTTLiveTokenInjectionAuth;
    }

    private Bundle b(Object obj) {
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        return null;
    }

    public void a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        this.f5029d = map;
    }

    public <T> T a(Class<T> cls, int i5, Map<String, Object> map) {
        if (i5 == 0) {
            if (!com.bytedance.sdk.openadsdk.live.b.a(a(map.get(d.X)), b(map.get("bundle")))) {
                return (T) 2;
            }
            return (T) 0;
        }
        if (i5 == 7) {
            return (T) e(map);
        }
        if (i5 != 8) {
            return null;
        }
        return (T) f(map);
    }

    private Context a(Object obj) {
        if (obj instanceof Context) {
            return (Context) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("onlyUpdateState", Boolean.valueOf(z4));
        return hashMap;
    }
}
