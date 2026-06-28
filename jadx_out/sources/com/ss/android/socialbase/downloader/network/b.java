package com.ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f11164a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f11165b = "b";

    /* renamed from: g, reason: collision with root package name */
    private static long f11166g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static volatile b f11167h;

    /* renamed from: c, reason: collision with root package name */
    private final k f11168c = k.a();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f11169d = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    private final a f11170e = new a(com.ss.android.socialbase.downloader.h.e.a());

    /* renamed from: f, reason: collision with root package name */
    private long f11171f;

    /* loaded from: classes3.dex */
    private class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void a() {
            sendEmptyMessage(1);
        }

        public void b() {
            removeMessages(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                b.this.f();
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    private b() {
    }

    public static b a() {
        if (f11167h == null) {
            synchronized (b.class) {
                if (f11167h == null) {
                    f11167h = new b();
                }
            }
        }
        return f11167h;
    }

    public static long d() {
        return TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
    }

    public static void e() {
        f11164a = com.ss.android.socialbase.downloader.i.f.b(com.ss.android.socialbase.downloader.downloader.c.O());
    }

    public void b() {
        try {
            com.ss.android.socialbase.downloader.c.a.c(f11165b, "startSampling: mSamplingCounter = " + this.f11169d);
            if (this.f11169d.getAndIncrement() == 0) {
                this.f11170e.a();
                this.f11171f = SystemClock.uptimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        try {
            com.ss.android.socialbase.downloader.c.a.c(f11165b, "stopSampling: mSamplingCounter = " + this.f11169d);
            if (this.f11169d.decrementAndGet() == 0) {
                this.f11170e.b();
                g();
            }
        } catch (Throwable unused) {
        }
    }

    protected void f() {
        long mobileRxBytes;
        try {
            e();
            if (f11164a) {
                mobileRxBytes = d();
            } else {
                mobileRxBytes = TrafficStats.getMobileRxBytes();
            }
            long j5 = f11166g;
            long j6 = mobileRxBytes - j5;
            if (j5 >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f11168c.a(j6, uptimeMillis - this.f11171f);
                    this.f11171f = uptimeMillis;
                }
            }
            f11166g = mobileRxBytes;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    protected void g() {
        f();
        f11166g = -1L;
    }
}
