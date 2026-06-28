package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<Integer> f10368a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10369b;

    /* renamed from: c, reason: collision with root package name */
    private long f10370c;

    /* renamed from: d, reason: collision with root package name */
    private long f10371d;

    /* renamed from: e, reason: collision with root package name */
    private SoftReference<JumpUnknownSourceActivity> f10372e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f10373f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f10374g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f10384a = new h();
    }

    private h() {
        this.f10368a = new ArrayDeque();
        this.f10369b = false;
        this.f10373f = new Handler(Looper.getMainLooper());
        this.f10374g = new Runnable() { // from class: com.ss.android.socialbase.appdownloader.h.1
            @Override // java.lang.Runnable
            public void run() {
                h.this.c();
            }
        };
        com.ss.android.socialbase.downloader.a.a.a().a(new a.InterfaceC0196a() { // from class: com.ss.android.socialbase.appdownloader.h.2
            @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
            public void b() {
                boolean hasCallbacks;
                if (h.this.f10368a.isEmpty()) {
                    return;
                }
                long a5 = com.ss.android.socialbase.downloader.g.a.c().a("install_on_resume_install_interval", 120000L);
                long currentTimeMillis = System.currentTimeMillis() - h.this.f10371d;
                if (currentTimeMillis < a5) {
                    hasCallbacks = h.this.f10373f.hasCallbacks(h.this.f10374g);
                    if (!hasCallbacks) {
                        h.this.f10373f.postDelayed(h.this.f10374g, a5 - currentTimeMillis);
                        return;
                    }
                    return;
                }
                h.this.f10371d = System.currentTimeMillis();
                h.this.c();
            }

            @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
            public void c() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Context context, int i5, boolean z4) {
        int b5 = c.b(context, i5, z4);
        if (b5 == 1) {
            this.f10369b = true;
        }
        this.f10370c = System.currentTimeMillis();
        return b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        final Integer poll;
        if (Build.VERSION.SDK_INT < 29 || com.ss.android.socialbase.downloader.a.a.a().b()) {
            synchronized (this.f10368a) {
                poll = this.f10368a.poll();
            }
            this.f10373f.removeCallbacks(this.f10374g);
            if (poll != null) {
                final Context O = com.ss.android.socialbase.downloader.downloader.c.O();
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    this.f10373f.post(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.h.3
                        @Override // java.lang.Runnable
                        public void run() {
                            h.this.b(O, poll.intValue(), false);
                        }
                    });
                } else {
                    b(O, poll.intValue(), false);
                }
                this.f10373f.postDelayed(this.f10374g, 20000L);
                return;
            }
            this.f10369b = false;
        }
    }

    private boolean d() {
        return System.currentTimeMillis() - this.f10370c < 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DownloadInfo downloadInfo, String str) {
        if (downloadInfo == null || TextUtils.isEmpty(str)) {
            return;
        }
        c();
    }

    public JumpUnknownSourceActivity b() {
        SoftReference<JumpUnknownSourceActivity> softReference = this.f10372e;
        JumpUnknownSourceActivity jumpUnknownSourceActivity = softReference == null ? null : softReference.get();
        this.f10372e = null;
        return jumpUnknownSourceActivity;
    }

    public static h a() {
        return a.f10384a;
    }

    public int a(final Context context, final int i5, final boolean z4) {
        if (z4) {
            return b(context, i5, z4);
        }
        if (d()) {
            this.f10373f.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.h.4
                @Override // java.lang.Runnable
                public void run() {
                    h.this.a(context, i5, z4);
                }
            }, 1000L);
            return 1;
        }
        if (com.ss.android.socialbase.downloader.a.a.a().b()) {
            com.ss.android.socialbase.downloader.c.a.c("leaves", "on Foreground");
            return b(context, i5, z4);
        }
        if (b.a()) {
            return 1;
        }
        boolean z5 = Build.VERSION.SDK_INT < 29;
        if (this.f10368a.isEmpty() && !this.f10369b && z5) {
            return b(context, i5, z4);
        }
        int a5 = com.ss.android.socialbase.downloader.g.a.c().a("install_queue_size", 3);
        synchronized (this.f10368a) {
            while (this.f10368a.size() > a5) {
                this.f10368a.poll();
            }
        }
        if (z5) {
            this.f10373f.removeCallbacks(this.f10374g);
            this.f10373f.postDelayed(this.f10374g, com.ss.android.socialbase.downloader.g.a.a(i5).a("install_queue_timeout", 20000L));
        }
        synchronized (this.f10368a) {
            if (!this.f10368a.contains(Integer.valueOf(i5))) {
                this.f10368a.offer(Integer.valueOf(i5));
            }
        }
        return 1;
    }

    public void a(JumpUnknownSourceActivity jumpUnknownSourceActivity) {
        this.f10372e = new SoftReference<>(jumpUnknownSourceActivity);
    }
}
