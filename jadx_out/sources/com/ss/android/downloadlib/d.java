package com.ss.android.downloadlib;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f10029a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f10030b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f10031c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f10032d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static d f10034a = new d();
    }

    public static d a() {
        return a.f10034a;
    }

    public void b(Runnable runnable) {
        b(runnable, false);
    }

    public void c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        e().execute(runnable);
    }

    public ScheduledExecutorService d() {
        if (this.f10031c == null) {
            synchronized (d.class) {
                if (this.f10031c == null) {
                    this.f10031c = new ScheduledThreadPoolExecutor(0, new com.ss.android.socialbase.downloader.h.a(i.class.getName() + "-ScheduledThreadPool"));
                }
            }
        }
        return this.f10031c;
    }

    public ExecutorService e() {
        if (this.f10032d == null) {
            synchronized (d.class) {
                if (this.f10032d == null) {
                    this.f10032d = new ThreadPoolExecutor(5, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new com.ss.android.socialbase.downloader.h.a(i.class.getName() + "-InstallFinishCheckCPUThreadPool"));
                }
            }
        }
        return this.f10032d;
    }

    public void f() {
        a(new Runnable() { // from class: com.ss.android.downloadlib.d.1
            @Override // java.lang.Runnable
            public void run() {
                j y4;
                synchronized (d.class) {
                    try {
                        String[] strArr = {"sp_ad_download_event", "sp_download_finish_cache", "sp_delay_operation_info", "sp_ttdownloader_md5", "sp_name_installed_app", "misc_config", "sp_ad_install_back_dialog", "sp_ttdownloader_clean", "sp_order_download", "sp_a_b_c", "sp_ah_config", "sp_download_info", "sp_appdownloader"};
                        for (int i5 = 0; i5 < 13; i5++) {
                            SharedPreferences sharedPreferences = k.a().getSharedPreferences(strArr[i5], 0);
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().clear().apply();
                            }
                        }
                        y4 = com.ss.android.socialbase.downloader.downloader.c.y();
                    } catch (Throwable unused) {
                    }
                    if (!(y4 instanceof com.ss.android.socialbase.downloader.impls.d)) {
                        return;
                    }
                    SparseArray<DownloadInfo> a5 = ((com.ss.android.socialbase.downloader.impls.d) y4).a().a();
                    for (int size = a5.size() - 1; size >= 0; size--) {
                        DownloadInfo downloadInfo = a5.get(a5.keyAt(size));
                        if (downloadInfo != null) {
                            Downloader.getInstance(k.a()).clearDownloadData(downloadInfo.getId());
                        }
                    }
                }
            }
        });
    }

    private d() {
    }

    public void a(Runnable runnable) {
        a(runnable, false);
    }

    public void b(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !m.b()) {
            runnable.run();
        } else {
            c().execute(runnable);
        }
    }

    public ExecutorService c() {
        if (this.f10030b == null) {
            synchronized (d.class) {
                if (this.f10030b == null) {
                    this.f10030b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new com.ss.android.socialbase.downloader.h.a(i.class.getName() + "-IOThreadPool"));
                }
            }
        }
        return this.f10030b;
    }

    public void a(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !m.b()) {
            runnable.run();
        } else {
            b().execute(runnable);
        }
    }

    public ExecutorService b() {
        if (this.f10029a == null) {
            synchronized (d.class) {
                if (this.f10029a == null) {
                    this.f10029a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new com.ss.android.socialbase.downloader.h.a(i.class.getName() + "-CPUThreadPool"));
                }
            }
        }
        return this.f10029a;
    }

    public void a(Runnable runnable, long j5) {
        try {
            d().schedule(runnable, j5, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
