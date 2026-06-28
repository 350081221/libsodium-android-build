package com.tendcloud.tenddata;

import android.content.Context;
import android.util.Log;
import com.tendcloud.tenddata.bu;
import com.tendcloud.tenddata.zz;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class bl {

    /* renamed from: a, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f11509a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final long f11510b = 30000;

    /* renamed from: c, reason: collision with root package name */
    private static long f11511c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, Object> f11512d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final long f11513e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static volatile bl f11514f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f11515g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f11516h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.tendcloud.tenddata.a aVar = com.tendcloud.tenddata.a.UNIVERSAL;
                if (y.b(ab.f11351g, "android.permission.READ_PHONE_STATE")) {
                    bl.f11512d.put("isGetIMEI", Boolean.TRUE);
                    bl.f11512d.put("duration", Long.valueOf(System.currentTimeMillis() - bl.f11511c));
                    bl.h(aVar);
                } else if (System.currentTimeMillis() - i.d(aVar) >= 30000) {
                    bl.f11512d.put("isGetIMEI", Boolean.FALSE);
                    bl.f11512d.put("duration", Long.valueOf(System.currentTimeMillis() - bl.f11511c));
                    bl.h(aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Check_Thread #");
        }
    }

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
        f11514f = null;
        f11515g = false;
        f11516h = false;
    }

    private bl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        try {
            if (i.e() == 0) {
                i.setInitTime(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    private static void f(final com.tendcloud.tenddata.a aVar) {
        try {
            new Timer().schedule(new TimerTask() { // from class: com.tendcloud.tenddata.bl.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    l.a();
                    bl.d(com.tendcloud.tenddata.a.this);
                    bl.e();
                    bl.g(com.tendcloud.tenddata.a.this);
                }
            }, ab.f11361q);
        } catch (Throwable th) {
            h.eForInternal(th);
            g(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(final com.tendcloud.tenddata.a aVar) {
        try {
            if (aVar == null) {
                h.eForInternal("TDFeatures is null...");
                return;
            }
            TreeMap treeMap = new TreeMap();
            boolean a5 = ab.a(aVar);
            treeMap.put("first", Boolean.valueOf(a5));
            if (!y.b(zz.f11851a)) {
                treeMap.put("custom", y.a(zz.f11851a));
            }
            try {
                int c5 = y.c(ab.f11351g);
                treeMap.put("targetAPI", Integer.valueOf(c5));
                if ((aVar.name().equals("TRACKING") || aVar.name().equals("SDK")) && a5) {
                    boolean a6 = a(ab.f11351g);
                    boolean b5 = y.b(ab.f11351g, "android.permission.READ_PHONE_STATE");
                    treeMap.put("isDeclareIMEI", Boolean.valueOf(a6));
                    treeMap.put("isGetIMEI", Boolean.valueOf(b5));
                    if (a6 && !b5 && c5 >= 23) {
                        TreeMap treeMap2 = new TreeMap();
                        f11512d = treeMap2;
                        treeMap2.put("targetAPI", Integer.valueOf(c5));
                        f11512d.put("isDeclareIMEI", Boolean.valueOf(a6));
                        f();
                    }
                }
            } catch (Throwable unused) {
            }
            bv bvVar = new bv();
            try {
                bvVar.f11569b = "app";
                bvVar.f11570c = "init";
                bvVar.f11571d = treeMap;
                bvVar.f11568a = aVar;
                if (a5) {
                    bvVar.f11573f = new cs() { // from class: com.tendcloud.tenddata.bl.2
                        @Override // com.tendcloud.tenddata.cs
                        public void onStoreFailed() {
                        }

                        @Override // com.tendcloud.tenddata.cs
                        public void onStoreSuccess() {
                            try {
                                i.a(false, com.tendcloud.tenddata.a.this);
                            } catch (Throwable unused2) {
                            }
                        }
                    };
                }
                z.a().post(bvVar);
            } catch (Throwable unused2) {
            }
            bu buVar = new bu();
            buVar.f11566a = aVar;
            buVar.f11567b = bu.a.IMMEDIATELY;
            z.a().post(buVar);
            if (a5) {
                g();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(com.tendcloud.tenddata.a aVar) {
        try {
            bv bvVar = new bv();
            bvVar.f11569b = "app";
            bvVar.f11570c = "getIMEI";
            bvVar.f11571d = f11512d;
            bvVar.f11568a = aVar;
            z.a().post(bvVar);
            bu buVar = new bu();
            buVar.f11566a = aVar;
            buVar.f11567b = bu.a.IMMEDIATELY;
            z.a().post(buVar);
            f11509a.shutdown();
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventInitEvent(zz.a aVar) {
        try {
            if (Integer.parseInt(String.valueOf(aVar.paraMap.get("apiType"))) != 1) {
                return;
            }
            String valueOf = String.valueOf(aVar.paraMap.get("action"));
            com.tendcloud.tenddata.a aVar2 = (com.tendcloud.tenddata.a) aVar.paraMap.get("service");
            if ((!valueOf.equals("install") && !valueOf.equals("deeplink")) || (!aVar2.name().equals("TRACKING") && !aVar2.name().equals("SDK"))) {
                if (valueOf.equals("init")) {
                    Context context = ab.f11351g;
                    bp.a();
                    be.a();
                    bj.a();
                    bf.a();
                    bn.a();
                    bg.a();
                    bk.a();
                    if (!y.a(context)) {
                        bd.a().b();
                    }
                    ab.f11346b = true;
                    if (aVar2.name().equals("SDK")) {
                        a(context, aVar2);
                    }
                    e(aVar2);
                    f(aVar2);
                    return;
                }
                return;
            }
            bv bvVar = new bv();
            Object obj = aVar.paraMap.get("data");
            bvVar.f11569b = String.valueOf(aVar.paraMap.get(ClientCookie.DOMAIN_ATTR));
            bvVar.f11570c = valueOf;
            if (obj != null && (obj instanceof Map)) {
                bvVar.f11571d = (Map) obj;
            }
            bvVar.f11568a = aVar2;
            z.a().post(bvVar);
        } catch (Throwable unused) {
        }
    }

    private void a(Context context, com.tendcloud.tenddata.a aVar) {
        if (f11516h) {
            return;
        }
        try {
            String str = "TalkingData SDK init...\n\tSDK_VERSION is: Android+TD+V5.0.28 gp Type:" + ab.c() + "  Build_Num:" + ab.f11366v + "\n\tApp ID is: " + ab.a(context, aVar) + "\n\tApp Channel is: " + ab.b(context, aVar) + "\n\tApp Custom is: " + ab.c(context, aVar) + "\n\tSDK_OVC is: " + d.f11667e;
            if (ab.f11346b || h.f11713a) {
                Log.i(ab.f11364t, str);
            }
            f11516h = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(com.tendcloud.tenddata.a aVar) {
        try {
            if (aVar == null) {
                h.eForInternal("TDFeatures is null...");
            } else if (i.d(aVar) == 0) {
                i.b(System.currentTimeMillis(), aVar);
            }
        } catch (Throwable unused) {
        }
    }

    private static void e(com.tendcloud.tenddata.a aVar) {
        try {
            if (i.d(aVar) != 0 && System.currentTimeMillis() - i.d(aVar) > 86400000) {
                y.f11829c = true;
            }
        } catch (Throwable unused) {
        }
    }

    private static void f() {
        try {
            f11511c = System.currentTimeMillis();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b());
            f11509a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new a(), 0L, 2L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }

    private static boolean a(Context context) {
        if (context == null) {
            h.eForInternal("[ModuleInit] current context is null...");
            return false;
        }
        for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
            if (str.equalsIgnoreCase("android.permission.READ_PHONE_STATE")) {
                return true;
            }
        }
        return false;
    }

    public static bl a() {
        if (f11514f == null) {
            synchronized (bl.class) {
                if (f11514f == null) {
                    f11514f = new bl();
                }
            }
        }
        return f11514f;
    }

    private static void g() {
        try {
            bv bvVar = new bv();
            bvVar.f11569b = com.umeng.analytics.pro.au.f12193a;
            bvVar.f11570c = "getProp";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sysproperty", y.a());
            bvVar.f11571d = treeMap;
            bvVar.f11568a = com.tendcloud.tenddata.a.ENV;
            z.a().post(bvVar);
        } catch (Throwable unused) {
        }
    }
}
