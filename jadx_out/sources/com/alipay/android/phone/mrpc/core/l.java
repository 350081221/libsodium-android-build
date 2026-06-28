package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l implements ab {

    /* renamed from: b, reason: collision with root package name */
    public static l f2728b;

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadFactory f2729i = new n();

    /* renamed from: a, reason: collision with root package name */
    public Context f2730a;

    /* renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f2731c;

    /* renamed from: d, reason: collision with root package name */
    public b f2732d = b.a(SharedLibraryInfo.PLATFORM_PACKAGE_NAME);

    /* renamed from: e, reason: collision with root package name */
    public long f2733e;

    /* renamed from: f, reason: collision with root package name */
    public long f2734f;

    /* renamed from: g, reason: collision with root package name */
    public long f2735g;

    /* renamed from: h, reason: collision with root package name */
    public int f2736h;

    public l(Context context) {
        this.f2730a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f2729i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f2731c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f2730a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final l a(Context context) {
        l lVar = f2728b;
        return lVar != null ? lVar : b(context);
    }

    public static final synchronized l b(Context context) {
        synchronized (l.class) {
            l lVar = f2728b;
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(context);
            f2728b = lVar2;
            return lVar2;
        }
    }

    public final b a() {
        return this.f2732d;
    }

    @Override // com.alipay.android.phone.mrpc.core.ab
    public final Future<u> a(t tVar) {
        if (s.a(this.f2730a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f2731c.getActiveCount());
            objArr[1] = Long.valueOf(this.f2731c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f2731c.getTaskCount());
            long j5 = this.f2735g;
            objArr[3] = Long.valueOf(j5 == 0 ? 0L : ((this.f2733e * 1000) / j5) >> 10);
            int i5 = this.f2736h;
            objArr[4] = Long.valueOf(i5 != 0 ? this.f2734f / i5 : 0L);
            objArr[5] = Long.valueOf(this.f2733e);
            objArr[6] = Long.valueOf(this.f2734f);
            objArr[7] = Long.valueOf(this.f2735g);
            objArr[8] = Integer.valueOf(this.f2736h);
            String.format(str, objArr);
        }
        q qVar = new q(this, (o) tVar);
        m mVar = new m(this, qVar, qVar);
        this.f2731c.execute(mVar);
        return mVar;
    }

    public final void a(long j5) {
        this.f2733e += j5;
    }

    public final void b(long j5) {
        this.f2734f += j5;
        this.f2736h++;
    }

    public final void c(long j5) {
        this.f2735g += j5;
    }
}
