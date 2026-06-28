package com.umeng.ccg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f12842a = true;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f12843b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f12844c = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f12845d = true;

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, Boolean> f12847f = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static Object f12846e = new Object();

    public static boolean a() {
        boolean z4;
        synchronized (f12846e) {
            z4 = f12842a;
        }
        return z4;
    }

    public static boolean b() {
        boolean z4;
        synchronized (f12846e) {
            z4 = f12843b;
        }
        return z4;
    }

    public static boolean c() {
        boolean z4;
        synchronized (f12846e) {
            z4 = f12844c;
        }
        return z4;
    }

    public static boolean d() {
        boolean z4;
        synchronized (f12846e) {
            z4 = f12845d;
        }
        return z4;
    }

    public static void a(boolean z4) {
        synchronized (f12846e) {
            f12845d = z4;
            f12847f.put(a.f12826e, Boolean.valueOf(z4));
        }
    }

    public static boolean a(String str) {
        boolean booleanValue;
        synchronized (f12846e) {
            booleanValue = f12847f.containsKey(str) ? f12847f.get(str).booleanValue() : true;
        }
        return booleanValue;
    }
}
