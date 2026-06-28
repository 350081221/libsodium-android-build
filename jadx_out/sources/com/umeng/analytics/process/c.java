package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f12813a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f12814b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private Context f12815c;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(Context context) {
        if (f12813a == null) {
            synchronized (c.class) {
                if (f12813a == null) {
                    f12813a = new c();
                }
            }
        }
        c cVar = f12813a;
        cVar.f12815c = context;
        return cVar;
    }

    private a c(String str) {
        if (this.f12814b.get(str) == null) {
            a a5 = a.a(this.f12815c, str);
            this.f12814b.put(str, a5);
            return a5;
        }
        return this.f12814b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(String str) {
        c(str).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private AtomicInteger f12816a = new AtomicInteger();

        /* renamed from: b, reason: collision with root package name */
        private SQLiteOpenHelper f12817b;

        /* renamed from: c, reason: collision with root package name */
        private SQLiteDatabase f12818c;

        private a() {
        }

        static a a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f12817b = b.a(appContext, str);
            return aVar;
        }

        synchronized void b() {
            try {
                if (this.f12816a.decrementAndGet() == 0) {
                    this.f12818c.close();
                }
            } catch (Throwable unused) {
            }
        }

        synchronized SQLiteDatabase a() {
            if (this.f12816a.incrementAndGet() == 1) {
                this.f12818c = this.f12817b.getWritableDatabase();
            }
            return this.f12818c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized SQLiteDatabase a(String str) {
        return c(str).a();
    }
}
