package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.e;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

@TargetApi(14)
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static String f12638a;

    /* renamed from: b, reason: collision with root package name */
    boolean f12647b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12648c;

    /* renamed from: f, reason: collision with root package name */
    com.umeng.analytics.vshelper.a f12649f;

    /* renamed from: g, reason: collision with root package name */
    Application.ActivityLifecycleCallbacks f12650g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, Long> f12651h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12652l;

    /* renamed from: m, reason: collision with root package name */
    private int f12653m;

    /* renamed from: n, reason: collision with root package name */
    private int f12654n;

    /* renamed from: i, reason: collision with root package name */
    private static JSONArray f12641i = new JSONArray();

    /* renamed from: j, reason: collision with root package name */
    private static Object f12642j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static Application f12643k = null;

    /* renamed from: d, reason: collision with root package name */
    static String f12639d = null;

    /* renamed from: e, reason: collision with root package name */
    static int f12640e = -1;

    /* renamed from: o, reason: collision with root package name */
    private static boolean f12644o = true;

    /* renamed from: p, reason: collision with root package name */
    private static Object f12645p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static bn f12646q = new com.umeng.analytics.vshelper.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final l f12656a = new l();

        private a() {
        }
    }

    static /* synthetic */ int a(l lVar) {
        int i5 = lVar.f12654n;
        lVar.f12654n = i5 - 1;
        return i5;
    }

    static /* synthetic */ int b(l lVar) {
        int i5 = lVar.f12653m;
        lVar.f12653m = i5 - 1;
        return i5;
    }

    static /* synthetic */ int e(l lVar) {
        int i5 = lVar.f12654n;
        lVar.f12654n = i5 + 1;
        return i5;
    }

    static /* synthetic */ int f(l lVar) {
        int i5 = lVar.f12653m;
        lVar.f12653m = i5 + 1;
        return i5;
    }

    private void g() {
        if (!this.f12652l) {
            this.f12652l = true;
            if (f12643k != null) {
                f12643k.registerActivityLifecycleCallbacks(this.f12650g);
            }
        }
    }

    private l() {
        this.f12651h = new HashMap();
        this.f12652l = false;
        this.f12647b = false;
        this.f12648c = false;
        this.f12653m = 0;
        this.f12654n = 0;
        this.f12649f = PageNameMonitor.getInstance();
        this.f12650g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.l.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                l.f12646q.a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (l.f12645p) {
                        if (l.f12644o) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    l.this.c(activity);
                    com.umeng.analytics.b.a().i();
                    l.this.f12647b = false;
                    l.f12646q.d(activity);
                    return;
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                    com.umeng.analytics.b.a().i();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (l.f12645p) {
                        if (l.f12644o) {
                            boolean unused = l.f12644o = false;
                        }
                    }
                    l.this.a(activity);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    l.this.a(activity);
                }
                l.f12646q.c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (l.this.f12653m <= 0) {
                        if (l.f12639d == null) {
                            l.f12639d = UUID.randomUUID().toString();
                        }
                        if (l.f12640e == -1) {
                            l.f12640e = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (l.f12640e == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("activityName", activity.toString());
                            hashMap.put("pid", Integer.valueOf(Process.myPid()));
                            hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            com.umeng.analytics.b a5 = com.umeng.analytics.b.a();
                            if (a5 != null) {
                                a5.a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) hashMap);
                            }
                            l.f12640e = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, j.ar);
                            }
                        } else if (l.f12640e == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("pairUUID", l.f12639d);
                            hashMap2.put("pid", Integer.valueOf(Process.myPid()));
                            hashMap2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            hashMap2.put("activityName", activity.toString());
                            if (com.umeng.analytics.b.a() != null) {
                                com.umeng.analytics.b.a().a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) hashMap2);
                            }
                        }
                    }
                    if (l.this.f12654n < 0) {
                        l.e(l.this);
                    } else {
                        l.f(l.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                MobclickAgent.PageMode pageMode = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION;
                MobclickAgent.PageMode pageMode2 = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        l.a(l.this);
                        return;
                    }
                    l.b(l.this);
                    if (l.this.f12653m <= 0) {
                        if (l.f12640e != 0 || !UMUtils.isMainProgress(activity)) {
                            int i5 = l.f12640e;
                            if (i5 == 1 || (i5 == 0 && !UMUtils.isMainProgress(activity))) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("pairUUID", l.f12639d);
                                hashMap.put(MediationConstant.KEY_REASON, "Normal");
                                hashMap.put("pid", Integer.valueOf(Process.myPid()));
                                hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                                hashMap.put("activityName", activity.toString());
                                com.umeng.analytics.b a5 = com.umeng.analytics.b.a();
                                if (a5 != null) {
                                    a5.a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
                                }
                                if (l.f12639d != null) {
                                    l.f12639d = null;
                                }
                            }
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f12643k != null) {
                g();
            }
        }
    }

    public void c() {
        c((Activity) null);
        b();
    }

    public void b(Context context) {
        synchronized (f12645p) {
            if (f12644o) {
                f12644o = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
                a(globleActivity);
                return;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    public static void c(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f12642j) {
                    jSONArray = f12641i.toString();
                    f12641i = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put(e.d.a.f12562c, new JSONArray(jSONArray));
                    i.a(context).a(u.a().c(), jSONObject, i.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a() {
        return this.f12652l;
    }

    public static synchronized l a(Context context) {
        l lVar;
        synchronized (l.class) {
            if (f12643k == null && context != null) {
                if (context instanceof Activity) {
                    f12643k = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    f12643k = (Application) context;
                }
            }
            lVar = a.f12656a;
        }
        return lVar;
    }

    public static void a(Context context, String str) {
        if (f12640e == 1 && UMUtils.isMainProgress(context)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pairUUID", f12639d);
            hashMap.put(MediationConstant.KEY_REASON, str);
            if (f12639d != null) {
                f12639d = null;
            }
            if (context != null) {
                hashMap.put("pid", Integer.valueOf(Process.myPid()));
                hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                hashMap.put("Context", context.toString());
                com.umeng.analytics.b.a().a(context, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
            }
        }
    }

    public void b() {
        this.f12652l = false;
        if (f12643k != null) {
            f12643k.unregisterActivityLifecycleCallbacks(this.f12650g);
            f12643k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        long j5;
        long j6;
        try {
            synchronized (this.f12651h) {
                if (f12638a == null && activity != null) {
                    f12638a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                if (TextUtils.isEmpty(f12638a) || !this.f12651h.containsKey(f12638a)) {
                    j5 = 0;
                    j6 = 0;
                } else {
                    j5 = this.f12651h.get(f12638a).longValue();
                    j6 = System.currentTimeMillis() - j5;
                    this.f12651h.remove(f12638a);
                }
            }
            synchronized (f12642j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(d.f12500v, f12638a);
                    jSONObject.put("duration", j6);
                    jSONObject.put(d.f12502x, j5);
                    jSONObject.put("type", 0);
                    f12641i.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private void b(Activity activity) {
        f12638a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f12651h) {
            this.f12651h.put(f12638a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                synchronized (f12645p) {
                    com.umeng.analytics.b.a().h();
                }
                return;
            }
            return;
        }
        if (activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f12649f.activityResume(str);
            if (this.f12647b) {
                this.f12647b = false;
                if (!TextUtils.isEmpty(f12638a)) {
                    if (f12638a.equals(str)) {
                        return;
                    }
                    b(activity);
                    synchronized (f12645p) {
                        com.umeng.analytics.b.a().h();
                    }
                    return;
                }
                f12638a = str;
                return;
            }
            b(activity);
            synchronized (f12645p) {
                com.umeng.analytics.b.a().h();
            }
        }
    }
}
