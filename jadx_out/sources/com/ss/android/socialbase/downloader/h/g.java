package com.ss.android.socialbase.downloader.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Object f10878a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<b> f10879b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private a f10880c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f10881d;

    /* loaded from: classes3.dex */
    private class a extends HandlerThread {
        a(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            Looper looper = getLooper();
            synchronized (g.this.f10878a) {
                g.this.f10881d = new Handler(looper);
            }
            while (!g.this.f10879b.isEmpty()) {
                b bVar = (b) g.this.f10879b.poll();
                if (bVar != null) {
                    g.this.f10881d.postDelayed(bVar.f10883a, bVar.f10884b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f10883a;

        /* renamed from: b, reason: collision with root package name */
        public long f10884b;

        public b(Runnable runnable, long j5) {
            this.f10883a = runnable;
            this.f10884b = j5;
        }
    }

    public g(String str) {
        this.f10880c = new a(str);
    }

    public void b() {
        this.f10880c.quit();
    }

    public void a() {
        this.f10880c.start();
    }

    public void a(Runnable runnable) {
        a(runnable, 0L);
    }

    public void a(Runnable runnable, long j5) {
        if (this.f10881d == null) {
            synchronized (this.f10878a) {
                if (this.f10881d == null) {
                    this.f10879b.add(new b(runnable, j5));
                    return;
                }
            }
        }
        this.f10881d.postDelayed(runnable, j5);
    }
}
