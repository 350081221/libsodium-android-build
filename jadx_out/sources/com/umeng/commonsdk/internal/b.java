package com.umeng.commonsdk.internal;

import android.content.Context;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f13146b;

    /* renamed from: a, reason: collision with root package name */
    private Context f13147a;

    /* renamed from: c, reason: collision with root package name */
    private c f13148c;

    private b(Context context) {
        this.f13147a = context;
        this.f13148c = new c(context);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f13146b == null) {
                f13146b = new b(context.getApplicationContext());
            }
            bVar = f13146b;
        }
        return bVar;
    }

    public c a() {
        return this.f13148c;
    }
}
