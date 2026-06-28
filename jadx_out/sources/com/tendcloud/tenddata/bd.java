package com.tendcloud.tenddata;

import java.util.Map;

/* loaded from: classes3.dex */
public class bd {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bd f11474a;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    public static bd a() {
        if (f11474a == null) {
            synchronized (bd.class) {
                if (f11474a == null) {
                    f11474a = new bd();
                }
            }
        }
        return f11474a;
    }

    public void b() {
        try {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.bd.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Map<String, Object> C = o.C(ab.f11351g);
                        if (C != null) {
                            bv bvVar = new bv();
                            bvVar.f11569b = com.umeng.analytics.pro.au.f12193a;
                            bvVar.f11570c = "arp";
                            bvVar.f11571d = C;
                            bvVar.f11568a = a.ENV;
                            z.a().post(bvVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventCommonEnvironment(bt btVar) {
        try {
            if (btVar.f11562a != 3) {
                return;
            }
            b();
        } catch (Throwable unused) {
        }
    }
}
