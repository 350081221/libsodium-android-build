package com.alipay.apmobilesecuritysdk.e;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static String f2805a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f2806b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f2807c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f2808d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f2809e = "";

    /* renamed from: f, reason: collision with root package name */
    public static Map<String, String> f2810f = new HashMap();

    public static synchronized String a(String str) {
        synchronized (i.class) {
            String str2 = "apdidTokenCache" + str;
            if (f2810f.containsKey(str2)) {
                String str3 = f2810f.get(str2);
                if (f1.a.f(str3)) {
                    return str3;
                }
            }
            return "";
        }
    }

    public static synchronized void a() {
        synchronized (i.class) {
        }
    }

    public static synchronized void a(b bVar) {
        synchronized (i.class) {
            if (bVar != null) {
                f2805a = bVar.f2791a;
                f2806b = bVar.f2792b;
                f2807c = bVar.f2793c;
            }
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (i.class) {
            if (cVar != null) {
                f2805a = cVar.f2794a;
                f2806b = cVar.f2795b;
                f2808d = cVar.f2797d;
                f2809e = cVar.f2798e;
                f2807c = cVar.f2796c;
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            String str3 = "apdidTokenCache" + str;
            if (f2810f.containsKey(str3)) {
                f2810f.remove(str3);
            }
            f2810f.put(str3, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r1 < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<com.alipay.apmobilesecuritysdk.e.i> r0 = com.alipay.apmobilesecuritysdk.e.i.class
            monitor-enter(r0)
            long r1 = com.alipay.apmobilesecuritysdk.e.h.a(r5)     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
        Ld:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
        L10:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L24
            long r5 = com.alipay.apmobilesecuritysdk.e.h.h(r5, r6)     // Catch: java.lang.Throwable -> L24
            long r3 = r3 - r5
            long r5 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L24
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L28
            monitor-exit(r0)
            r5 = 1
            return r5
        L24:
            r5 = move-exception
            com.alipay.apmobilesecuritysdk.c.a.a(r5)     // Catch: java.lang.Throwable -> L2b
        L28:
            monitor-exit(r0)
            r5 = 0
            return r5
        L2b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.e.i.a(android.content.Context, java.lang.String):boolean");
    }

    public static synchronized String b() {
        String str;
        synchronized (i.class) {
            str = f2805a;
        }
        return str;
    }

    public static void b(String str) {
        f2805a = str;
    }

    public static synchronized String c() {
        String str;
        synchronized (i.class) {
            str = f2806b;
        }
        return str;
    }

    public static void c(String str) {
        f2806b = str;
    }

    public static synchronized String d() {
        String str;
        synchronized (i.class) {
            str = f2808d;
        }
        return str;
    }

    public static void d(String str) {
        f2807c = str;
    }

    public static synchronized String e() {
        String str;
        synchronized (i.class) {
            str = f2809e;
        }
        return str;
    }

    public static void e(String str) {
        f2808d = str;
    }

    public static synchronized String f() {
        String str;
        synchronized (i.class) {
            str = f2807c;
        }
        return str;
    }

    public static void f(String str) {
        f2809e = str;
    }

    public static synchronized c g() {
        c cVar;
        synchronized (i.class) {
            cVar = new c(f2805a, f2806b, f2807c, f2808d, f2809e);
        }
        return cVar;
    }

    public static void h() {
        f2810f.clear();
        f2805a = "";
        f2806b = "";
        f2808d = "";
        f2809e = "";
        f2807c = "";
    }
}
