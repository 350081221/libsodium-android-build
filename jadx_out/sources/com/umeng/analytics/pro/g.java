package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    private static SQLiteOpenHelper f12587b;

    /* renamed from: d, reason: collision with root package name */
    private static Context f12588d;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f12589a;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f12590c;

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f12591a = new g();

        private a() {
        }
    }

    public static g a(Context context) {
        if (f12588d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f12588d = applicationContext;
            f12587b = f.a(applicationContext);
        }
        return a.f12591a;
    }

    public synchronized void b() {
        try {
            if (this.f12589a.decrementAndGet() == 0) {
                this.f12590c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private g() {
        this.f12589a = new AtomicInteger();
    }

    public synchronized SQLiteDatabase a() {
        if (this.f12589a.incrementAndGet() == 1) {
            this.f12590c = f12587b.getWritableDatabase();
        }
        return this.f12590c;
    }
}
