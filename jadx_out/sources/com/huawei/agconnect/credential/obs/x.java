package com.huawei.agconnect.credential.obs;

import android.content.Context;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7965a = "4D5480E9";

    /* renamed from: b, reason: collision with root package name */
    private static final x f7966b = new x();

    /* renamed from: c, reason: collision with root package name */
    private Context f7967c;

    private x() {
    }

    public static x a() {
        return f7966b;
    }

    public static synchronized void a(Context context) {
        synchronized (x.class) {
            Context applicationContext = context.getApplicationContext();
            x xVar = f7966b;
            if (applicationContext != null) {
                context = applicationContext;
            }
            xVar.f7967c = context;
        }
    }

    public static String c() {
        return "1C4DE4EC";
    }

    public static String d() {
        return "80fedfd8941a368fafdae46750a4d367";
    }

    public Context b() {
        return this.f7967c;
    }
}
