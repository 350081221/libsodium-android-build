package com.ss.android.downloadlib.addownload.c;

import com.ss.android.downloadlib.g.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public class a implements r {

    /* renamed from: a, reason: collision with root package name */
    private int f9686a;

    private long b(com.ss.android.socialbase.downloader.g.a aVar) {
        long a5 = aVar.a("clear_space_sleep_time", 0L);
        if (a5 <= 0) {
            return 0L;
        }
        if (a5 > 5000) {
            a5 = 5000;
        }
        k.b("AppDownloadDiskSpaceHandler", "waiting for space clear, sleepTime = " + a5, null);
        try {
            Thread.sleep(a5);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
        k.b("AppDownloadDiskSpaceHandler", "waiting end!", null);
        return a5;
    }

    public void a(int i5) {
        this.f9686a = i5;
    }

    @Override // com.ss.android.socialbase.downloader.depend.r
    public boolean a(long j5, long j6, q qVar) {
        long j7;
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(this.f9686a);
        if (!a(a5)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        d.a().c();
        long b5 = m.b(0L);
        a();
        long b6 = m.b(0L);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (b6 < j6) {
            long b7 = b(a5);
            if (b7 > 0) {
                b6 = m.b(0L);
            }
            j7 = b7;
        } else {
            j7 = 0;
        }
        k.b("AppDownloadDiskSpaceHandler", "cleanUpDisk, byteRequired = " + j6 + ", byteAvailableAfter = " + b6 + ", cleaned = " + (b6 - b5), null);
        long j8 = b6;
        a(b5, b6, j6, currentTimeMillis2, j7);
        if (j8 < j6) {
            return false;
        }
        if (qVar == null) {
            return true;
        }
        qVar.a();
        return true;
    }

    private boolean a(com.ss.android.socialbase.downloader.g.a aVar) {
        if (aVar.a("clear_space_use_disk_handler", 0) != 1) {
            return false;
        }
        return System.currentTimeMillis() - d.a().b() >= aVar.a("clear_space_min_time_interval", 600000L);
    }

    private void a() {
        com.ss.android.download.api.config.e q5 = com.ss.android.downloadlib.addownload.k.q();
        if (q5 != null) {
            q5.a();
        }
        c.a();
        c.b();
    }

    private void a(long j5, long j6, long j7, long j8, long j9) {
        DownloadInfo downloadInfo = Downloader.getInstance(com.ss.android.downloadlib.addownload.k.a()).getDownloadInfo(this.f9686a);
        if (downloadInfo == null) {
            return;
        }
        try {
            com.ss.android.downloadlib.a.a().a(downloadInfo, j5, j6, j7, j8, j9, j6 > j7);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
