package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    private static final int f13462e = 1;

    /* renamed from: a, reason: collision with root package name */
    private final long f13463a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13464b;

    /* renamed from: c, reason: collision with root package name */
    private long f13465c;

    /* renamed from: f, reason: collision with root package name */
    private HandlerThread f13467f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f13468g;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13466d = false;

    /* renamed from: h, reason: collision with root package name */
    private Handler.Callback f13469h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (a.this) {
                if (a.this.f13466d) {
                    return true;
                }
                long elapsedRealtime = a.this.f13465c - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                    a.this.c();
                    if (a.this.f13467f != null) {
                        a.this.f13467f.quit();
                    }
                } else if (elapsedRealtime < a.this.f13464b) {
                    a.this.f13468g.sendMessageDelayed(a.this.f13468g.obtainMessage(1), elapsedRealtime);
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    a.this.a(elapsedRealtime);
                    long elapsedRealtime3 = (elapsedRealtime2 + a.this.f13464b) - SystemClock.elapsedRealtime();
                    while (elapsedRealtime3 < 0) {
                        elapsedRealtime3 += a.this.f13464b;
                    }
                    a.this.f13468g.sendMessageDelayed(a.this.f13468g.obtainMessage(1), elapsedRealtime3);
                }
                return false;
            }
        }
    };

    public a(long j5, long j6) {
        this.f13463a = j5;
        this.f13464b = j6;
        if (!d()) {
            HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
            this.f13467f = handlerThread;
            handlerThread.start();
            this.f13468g = new Handler(this.f13467f.getLooper(), this.f13469h);
            return;
        }
        this.f13468g = new Handler(this.f13469h);
    }

    public abstract void a(long j5);

    public abstract void c();

    private boolean d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    public final synchronized void a() {
        this.f13466d = true;
        this.f13468g.removeMessages(1);
    }

    public final synchronized a b() {
        this.f13466d = false;
        if (this.f13463a <= 0) {
            c();
            return this;
        }
        this.f13465c = SystemClock.elapsedRealtime() + this.f13463a;
        Handler handler = this.f13468g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }
}
