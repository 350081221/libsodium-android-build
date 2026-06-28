package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* loaded from: classes3.dex */
public class p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f12728a;

    /* renamed from: b, reason: collision with root package name */
    private t f12729b;

    public p() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f12728a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void a(t tVar) {
        this.f12729b = tVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12728a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != Thread.getDefaultUncaughtExceptionHandler()) {
            this.f12728a.uncaughtException(thread, th);
        }
    }

    private void a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f12729b.a(th);
        } else {
            this.f12729b.a(null);
        }
    }
}
