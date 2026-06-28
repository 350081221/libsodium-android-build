package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class DownloadService extends Service {

    /* renamed from: b, reason: collision with root package name */
    private static final String f10578b = "DownloadService";

    /* renamed from: a, reason: collision with root package name */
    protected o f10579a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        boolean z4;
        String str = f10578b;
        StringBuilder sb = new StringBuilder();
        sb.append("onBind downloadServiceHandler != null:");
        if (this.f10579a != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        sb.append(z4);
        com.ss.android.socialbase.downloader.c.a.b(str, sb.toString());
        o oVar = this.f10579a;
        if (oVar != null) {
            return oVar.a(intent);
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.a(this);
        o z4 = c.z();
        this.f10579a = z4;
        z4.a(new WeakReference(this));
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (com.ss.android.socialbase.downloader.c.a.a()) {
            com.ss.android.socialbase.downloader.c.a.b(f10578b, "Service onDestroy");
        }
        o oVar = this.f10579a;
        if (oVar != null) {
            oVar.d();
            this.f10579a = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, final int i5, final int i6) {
        if (com.ss.android.socialbase.downloader.c.a.a()) {
            com.ss.android.socialbase.downloader.c.a.b(f10578b, "DownloadService onStartCommand");
        }
        this.f10579a.c();
        ExecutorService l5 = c.l();
        if (l5 != null) {
            l5.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadService.1
                @Override // java.lang.Runnable
                public void run() {
                    o oVar = DownloadService.this.f10579a;
                    if (oVar != null) {
                        oVar.a(intent, i5, i6);
                    }
                }
            });
        }
        if (c.j()) {
            return 2;
        }
        return 3;
    }
}
