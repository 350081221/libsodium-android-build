package com.huawei.hms.hatool;

import android.content.Context;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static h1 f8553b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8554c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Context f8555a;

    public static h1 a() {
        if (f8553b == null) {
            b();
        }
        return f8553b;
    }

    public static synchronized void b() {
        synchronized (h1.class) {
            if (f8553b == null) {
                f8553b = new h1();
            }
        }
    }

    public void a(Context context) {
        synchronized (f8554c) {
            if (this.f8555a != null) {
                y.f("hmsSdk", "DataManager already initialized.");
                return;
            }
            this.f8555a = context;
            i.c().b().a(this.f8555a);
            i.c().b().j(context.getPackageName());
            z0.a().a(context);
        }
    }

    public void a(String str) {
        y.c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f8555a;
        if (context == null) {
            y.e("hmsSdk", "sdk is not init");
        } else {
            i.c().b().i(s0.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
