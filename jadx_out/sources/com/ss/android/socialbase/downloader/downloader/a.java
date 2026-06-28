package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a implements o {

    /* renamed from: e, reason: collision with root package name */
    private static final String f10585e = "a";

    /* renamed from: c, reason: collision with root package name */
    protected volatile boolean f10588c;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<Service> f10590f;

    /* renamed from: a, reason: collision with root package name */
    protected final SparseArray<List<DownloadTask>> f10586a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f10587b = false;

    /* renamed from: d, reason: collision with root package name */
    protected volatile boolean f10589d = false;

    /* renamed from: g, reason: collision with root package name */
    private Handler f10591g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    private Runnable f10592h = new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.a.1
        @Override // java.lang.Runnable
        public void run() {
            if (com.ss.android.socialbase.downloader.c.a.a()) {
                com.ss.android.socialbase.downloader.c.a.b(a.f10585e, "tryDownload: 2 try");
            }
            if (!a.this.f10587b) {
                if (com.ss.android.socialbase.downloader.c.a.a()) {
                    com.ss.android.socialbase.downloader.c.a.b(a.f10585e, "tryDownload: 2 error");
                }
                a.this.a(c.O(), (ServiceConnection) null);
            }
        }
    };

    protected void a(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void a(Intent intent, int i5, int i6) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void a(n nVar) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void a(WeakReference weakReference) {
        this.f10590f = weakReference;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public boolean b() {
        com.ss.android.socialbase.downloader.c.a.c(f10585e, "isServiceForeground = " + this.f10588c);
        return this.f10588c;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void c() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void c(DownloadTask downloadTask) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void d() {
        this.f10587b = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        SparseArray<List<DownloadTask>> clone;
        synchronized (this.f10586a) {
            com.ss.android.socialbase.downloader.c.a.b(f10585e, "resumePendingTask pendingTasks.size:" + this.f10586a.size());
            clone = this.f10586a.clone();
            this.f10586a.clear();
        }
        com.ss.android.socialbase.downloader.impls.a D = c.D();
        if (D != null) {
            for (int i5 = 0; i5 < clone.size(); i5++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i5));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        com.ss.android.socialbase.downloader.c.a.b(f10585e, "resumePendingTask key:" + downloadTask.getDownloadId());
                        D.a(downloadTask);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void f() {
        if (!this.f10587b) {
            if (com.ss.android.socialbase.downloader.c.a.a()) {
                com.ss.android.socialbase.downloader.c.a.b(f10585e, "startService");
            }
            a(c.O(), (ServiceConnection) null);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public boolean a() {
        return this.f10587b;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public IBinder a(Intent intent) {
        com.ss.android.socialbase.downloader.c.a.b(f10585e, "onBind Abs");
        return new Binder();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void b(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if (!this.f10587b) {
            if (com.ss.android.socialbase.downloader.c.a.a()) {
                com.ss.android.socialbase.downloader.c.a.b(f10585e, "tryDownload but service is not alive");
            }
            if (com.ss.android.socialbase.downloader.i.a.a(262144)) {
                a(downloadTask);
                if (!this.f10589d) {
                    if (com.ss.android.socialbase.downloader.c.a.a()) {
                        com.ss.android.socialbase.downloader.c.a.b(f10585e, "tryDownload: 1");
                    }
                    a(c.O(), (ServiceConnection) null);
                    this.f10589d = true;
                    return;
                }
                this.f10591g.removeCallbacks(this.f10592h);
                this.f10591g.postDelayed(this.f10592h, 10L);
                return;
            }
            a(downloadTask);
            a(c.O(), (ServiceConnection) null);
            return;
        }
        String str = f10585e;
        com.ss.android.socialbase.downloader.c.a.b(str, "tryDownload when isServiceAlive");
        e();
        com.ss.android.socialbase.downloader.impls.a D = c.D();
        if (D != null) {
            com.ss.android.socialbase.downloader.c.a.b(str, "tryDownload current task: " + downloadTask.getDownloadId());
            D.a(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void a(int i5, Notification notification) {
        WeakReference<Service> weakReference = this.f10590f;
        if (weakReference != null && weakReference.get() != null) {
            com.ss.android.socialbase.downloader.c.a.c(f10585e, "startForeground  id = " + i5 + ", service = " + this.f10590f.get() + ",  isServiceAlive = " + this.f10587b);
            try {
                this.f10590f.get().startForeground(i5, notification);
                this.f10588c = true;
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        com.ss.android.socialbase.downloader.c.a.d(f10585e, "startForeground: downloadService is null, do nothing!");
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void a(boolean z4) {
        WeakReference<Service> weakReference = this.f10590f;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.ss.android.socialbase.downloader.c.a.c(f10585e, "stopForeground  service = " + this.f10590f.get() + ",  isServiceAlive = " + this.f10587b);
        try {
            this.f10588c = false;
            this.f10590f.get().stopForeground(z4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        int downloadId = downloadTask.getDownloadId();
        synchronized (this.f10586a) {
            String str = f10585e;
            com.ss.android.socialbase.downloader.c.a.b(str, "pendDownloadTask pendingTasks.size:" + this.f10586a.size() + " downloadId:" + downloadId);
            List<DownloadTask> list = this.f10586a.get(downloadId);
            if (list == null) {
                list = new ArrayList<>();
                this.f10586a.put(downloadId, list);
            }
            com.ss.android.socialbase.downloader.c.a.b(str, "before pendDownloadTask taskArray.size:" + list.size());
            list.add(downloadTask);
            com.ss.android.socialbase.downloader.c.a.b(str, "after pendDownloadTask pendingTasks.size:" + this.f10586a.size());
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public void a(int i5) {
        com.ss.android.socialbase.downloader.c.a.a(i5);
    }
}
