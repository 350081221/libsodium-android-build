package com.bytedance.sdk.openadsdk.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Loader;
import com.bykv.vk.openvk.api.proto.Manager;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.downloadnew.core.DownloadBridgeFactory;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationTTLiveTokenInjectionAuthImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitCLassLoader;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private TTAdSdk.InitCallback f4764a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0126a<T> {
        private AbstractC0126a() {
        }

        abstract void a(b<T> bVar, int i5);

        void a(Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(T t5);
    }

    /* loaded from: classes2.dex */
    public static abstract class c implements TTAdManager {

        /* renamed from: a, reason: collision with root package name */
        private volatile Manager f4771a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f4772b;

        /* renamed from: c, reason: collision with root package name */
        private List<WeakReference<b<Manager>>> f4773c = new CopyOnWriteArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.sdk.openadsdk.api.a$c$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 extends AbstractC0126a<Loader> {

            /* renamed from: a, reason: collision with root package name */
            Loader f4774a;

            /* renamed from: b, reason: collision with root package name */
            final b<Manager> f4775b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftReference f4776c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SoftReference softReference) {
                super();
                this.f4776c = softReference;
                this.f4775b = new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.1.1
                    @Override // com.bytedance.sdk.openadsdk.api.a.b
                    public void a(Manager manager) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.f4774a = manager.createLoader((Context) anonymousClass1.f4776c.get());
                    }
                };
            }

            @Override // com.bytedance.sdk.openadsdk.api.a.AbstractC0126a
            public void a(final b<Loader> bVar, int i5) {
                Loader loader = this.f4774a;
                if (loader != null) {
                    bVar.a(loader);
                } else {
                    c.this.a(new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.1.2
                        @Override // com.bytedance.sdk.openadsdk.api.a.b
                        public void a(Manager manager) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            c.this.a(anonymousClass1.f4775b);
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            anonymousClass12.f4774a = manager.createLoader((Context) anonymousClass12.f4776c.get());
                            bVar.a(AnonymousClass1.this.f4774a);
                        }
                    }, i5 + 10000);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Manager manager, Class<T> cls, Bundle bundle) {
            return (T) manager.getBridge(1).call(6, com.bykv.a.a.a.a.b.b(2).g(9, cls).g(10, bundle).k(), cls);
        }

        protected Object a(Object obj) {
            return obj;
        }

        protected void a(Throwable th) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public TTAdNative createAdNative(Context context) {
            return new e(new AnonymousClass1(new SoftReference(context))).a();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getBiddingToken(AdSlot adSlot) {
            return getBiddingToken(adSlot, false, adSlot.getAdType() > 0 ? adSlot.getAdType() : adSlot.getNativeAdType());
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public <T> T getExtra(final Class<T> cls, final Bundle bundle) {
            if (this.f4771a != null) {
                return (T) b(this.f4771a, cls, bundle);
            }
            a(new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.4
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Manager manager) {
                    c.b(c.this.f4771a, cls, bundle);
                }
            }, 6);
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getPluginVersion() {
            return this.f4771a != null ? this.f4771a.values().stringValue(12) : "";
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getSDKVersion() {
            return TTAdSdk.SDK_VERSION_NAME;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public int getThemeStatus() {
            if (this.f4771a != null) {
                return this.f4771a.values().intValue(11);
            }
            return 0;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void register(final Object obj) {
            a(new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.2
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Manager manager) {
                    manager.getBridge(1).call(4, com.bykv.a.a.a.a.b.b(1).g(8, c.this.a(obj)).k(), Void.class);
                }
            }, 4);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void requestPermissionIfNecessary(final Context context) {
            a(new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.5
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Manager manager) {
                    manager.getBridge(1).call(3, com.bykv.a.a.a.a.b.b(1).g(7, context).k(), Void.class);
                }
            }, 3);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void setThemeStatus(final int i5) {
            a(new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.6
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Manager manager) {
                    manager.getBridge(1).call(1, com.bykv.a.a.a.a.b.a().e(11, i5).k(), Void.class);
                }
            }, 1);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public boolean tryShowInstallDialogWhenExit(Activity activity, ExitInstallListener exitInstallListener) {
            HashMap hashMap = new HashMap();
            hashMap.put("activity", activity);
            hashMap.put(TTDownloadField.TT_EXIT_INSTALL_LISTENER, exitInstallListener);
            return ((Boolean) DownloadBridgeFactory.getDownloadBridge(TTAppContextHolder.getContext()).call(0, com.bykv.a.a.a.a.b.b(1).g(0, hashMap).k(), Boolean.class)).booleanValue();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void unregister(final Object obj) {
            a(new b<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.a.c.3
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Manager manager) {
                    manager.getBridge(1).call(5, com.bykv.a.a.a.a.b.b(1).g(8, obj).k(), Void.class);
                }
            }, 5);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getBiddingToken(AdSlot adSlot, boolean z4, int i5) {
            if (i5 <= 0) {
                i5 = adSlot.getAdType() > 0 ? adSlot.getAdType() : adSlot.getNativeAdType();
            }
            ValueSet k5 = com.bykv.a.a.a.a.b.j(com.bytedance.sdk.openadsdk.c.a.c.b.b(adSlot)).i(13, z4).e(14, i5).k();
            if (this.f4771a != null) {
                return (String) this.f4771a.getBridge(1).call(2, k5, String.class);
            }
            return null;
        }

        public void a(boolean z4) {
            this.f4772b = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Manager manager) {
            this.f4771a = manager;
            if (this.f4771a != null) {
                Iterator<WeakReference<b<Manager>>> it = this.f4773c.iterator();
                while (it.hasNext()) {
                    WeakReference<b<Manager>> next = it.next();
                    b<Manager> bVar = next != null ? next.get() : null;
                    if (bVar != null) {
                        bVar.a(manager);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(b<Manager> bVar) {
            this.f4773c.add(new WeakReference<>(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final b<Manager> bVar, final int i5) {
            if (this.f4771a != null) {
                try {
                    bVar.a(this.f4771a);
                    return;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.api.c.d("_tt_ad_sdk_", "Unexpected manager call error: " + th.getMessage());
                    a(th);
                    return;
                }
            }
            if (!this.f4772b && i5 > 10000) {
                throw new IllegalStateException("广告SDK未Ready, 请在load(请求广告）之前，先调用init and start方法，以避免无法请求广告");
            }
            com.bytedance.sdk.openadsdk.e.a.a().a(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.a.c.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (c.this.f4771a != null) {
                            bVar.a(c.this.f4771a);
                        } else {
                            com.bytedance.sdk.openadsdk.api.c.d("_tt_ad_sdk_", "Not ready, no manager: " + i5);
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.openadsdk.api.c.d("_tt_ad_sdk_", "Unexpected manager call error: " + th2.getMessage());
                        c.this.a(th2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d implements EventListener {
        private d() {
        }

        @Override // com.bykv.vk.openvk.api.proto.EventListener
        public ValueSet onEvent(int i5, Result result) {
            a.this.b(result);
            return null;
        }
    }

    public void a(final Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        com.bytedance.sdk.openadsdk.a.c.a().a(c());
        if (b(context, adConfig, initCallback)) {
            this.f4764a = initCallback;
            final com.bykv.a.a.a.a.b j5 = com.bykv.a.a.a.a.b.j(com.bytedance.sdk.openadsdk.c.a.c.a.a(adConfig));
            j5.f(1, SystemClock.elapsedRealtime());
            j5.h(5, TTAdSdk.S_C);
            j5.i(4, true);
            j5.e(6, 999);
            j5.e(10, TTAdSdk.SDK_VERSION_CODE);
            j5.h(11, TTAdSdk.SDK_VERSION_NAME);
            j5.h(12, TTAdSdk.BUILT_IN_PLUGIN_NAME);
            j5.i(14, false);
            j5.g(16, com.bytedance.sdk.openadsdk.a.c.a());
            Thread currentThread = Thread.currentThread();
            j5.h(2, currentThread.getName());
            j5.e(3, currentThread.getPriority());
            j5.g(15, new d());
            j5.g(8301, new MediationInitCLassLoader());
            if (adConfig instanceof TTAdConfig) {
                j5.g(8318, new MediationTTLiveTokenInjectionAuthImpl(((TTAdConfig) adConfig).getInjectionAuth()));
            }
            if (adConfig != null) {
                MediationApiLog.setDebug(Boolean.valueOf(adConfig.isDebug()));
            }
            if (!a(context, j5)) {
                com.bytedance.sdk.openadsdk.e.a.a().a(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b(context, j5);
                    }
                });
            }
            b().a(true);
        }
    }

    protected void a(Result result) {
    }

    public abstract boolean a();

    public abstract boolean a(Context context, com.bykv.a.a.a.a.b bVar);

    public abstract c b();

    public abstract void b(Context context, com.bykv.a.a.a.a.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Result result) {
        String str;
        a(result);
        if (result.isSuccess()) {
            com.bytedance.sdk.openadsdk.api.c.b("_tt_ad_sdk_", "init sdk success ");
            TTAdSdk.InitCallback initCallback = this.f4764a;
            if (initCallback != null) {
                initCallback.success();
            }
        } else {
            com.bytedance.sdk.openadsdk.api.c.e("_tt_ad_sdk_", "int sdk failed, code: " + result.code() + ", message: " + result.message());
            TTAdSdk.InitCallback initCallback2 = this.f4764a;
            if (initCallback2 != null) {
                int code = result.code();
                if (result.message() != null) {
                    str = result.message();
                } else {
                    str = "";
                }
                initCallback2.fail(code, str);
            }
        }
        this.f4764a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        return false;
    }

    protected abstract com.bytedance.sdk.openadsdk.a.b c();

    /* loaded from: classes2.dex */
    private static class e extends com.bytedance.sdk.openadsdk.c.a.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC0126a<Loader> f4797a;

        e(AbstractC0126a<Loader> abstractC0126a) {
            this.f4797a = abstractC0126a;
        }

        private void a(b<Loader> bVar, int i5) {
            try {
                com.bytedance.sdk.openadsdk.api.c.b("_tt_ad_sdk_", "load ad slot type: " + i5);
                this.f4797a.a(bVar, i5);
            } catch (Throwable th) {
                this.f4797a.a(th);
                throw th;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void b(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.3
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(6, com.bykv.a.a.a.a.b.j(valueSet).g(1, bridge).k(), null);
                }
            }, 6);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void c(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.4
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(9, com.bykv.a.a.a.a.b.j(valueSet).g(1, bridge).k(), null);
                }
            }, 9);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void d(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.5
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(1, com.bykv.a.a.a.a.b.j(valueSet).g(1, bridge).k(), null);
                }
            }, 1);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void e(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.7
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(7, com.bykv.a.a.a.a.b.j(valueSet).g(1, bridge).k(), null);
                }
            }, 7);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void f(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.8
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(8, com.bykv.a.a.a.a.b.j(valueSet).g(1, bridge).k(), null);
                }
            }, 8);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void g(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.9
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(5, com.bykv.a.a.a.a.b.j(valueSet).i(2, true).g(1, bridge).k(), null);
                }
            }, 5);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void h(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.10
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(9, com.bykv.a.a.a.a.b.j(valueSet).i(2, true).g(1, bridge).k(), null);
                }
            }, 9);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void i(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.2
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(1, com.bykv.a.a.a.a.b.j(valueSet).i(2, true).g(1, bridge).k(), null);
                }
            }, 1);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void a(final ValueSet valueSet, final Bridge bridge) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.1
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(5, com.bykv.a.a.a.a.b.j(valueSet).g(1, bridge).k(), null);
                }
            }, 5);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public void a(final ValueSet valueSet, final Bridge bridge, final int i5) {
            a(new b<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.a.e.6
                @Override // com.bytedance.sdk.openadsdk.api.a.b
                public void a(Loader loader) {
                    loader.load(3, com.bykv.a.a.a.a.b.j(valueSet).e(3, i5).g(1, bridge).k(), null);
                }
            }, 3);
        }

        @Override // com.bytedance.sdk.openadsdk.c.a.a
        public Pair<Integer, String> a(Exception exc) {
            com.bytedance.sdk.openadsdk.api.c.d("_tt_ad_sdk_", "Load ad failed: " + exc.getMessage());
            if ((exc instanceof IllegalStateException) && "广告SDK未Ready, 请在load(请求广告）之前，先调用init and start方法，以避免无法请求广告".equals(exc.getMessage())) {
                return new Pair<>(4208, exc.getMessage());
            }
            return new Pair<>(Integer.valueOf(TTAdConstant.INIT_FAILED_CREATE_INVOKE_FAILED), "Load ad failed: " + exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Manager manager) {
        com.bytedance.sdk.openadsdk.api.c.b("_tt_ad_sdk_", "update manager");
        b().a(manager);
        b().register(com.bytedance.sdk.openadsdk.a.c.a());
    }
}
