package com.ss.android.downloadlib;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadlib.g.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements com.ss.android.socialbase.appdownloader.c.h {

    /* renamed from: a, reason: collision with root package name */
    private static String f9994a = "c";

    /* renamed from: b, reason: collision with root package name */
    private Handler f9995b = new Handler(Looper.getMainLooper());

    @Override // com.ss.android.socialbase.appdownloader.c.h
    public void a(DownloadInfo downloadInfo, BaseException baseException, int i5) {
        BaseException baseException2;
        final DownloadModel a5;
        if (downloadInfo == null) {
            return;
        }
        if (i5 == -1 && baseException != null) {
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.g.f.c(downloadInfo, jSONObject);
            a.a(jSONObject, downloadInfo);
            k.a("download_failed", jSONObject.toString());
        }
        com.ss.android.downloadad.api.a.b a6 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
        if (a6 == null) {
            return;
        }
        try {
            if (i5 != -1) {
                if (i5 == -3) {
                    a.a(downloadInfo, a6);
                    return;
                }
                if (i5 == 2001) {
                    a.a().a(downloadInfo, a6, 2001);
                    return;
                } else {
                    if (i5 == 11) {
                        a.a().a(downloadInfo, a6, 2000);
                        if (a6.S()) {
                            return;
                        }
                        a(downloadInfo, a6);
                        return;
                    }
                    return;
                }
            }
            if (baseException != null) {
                if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("toast_without_network", 0) == 1 && baseException.getErrorCode() == 1049) {
                    this.f9995b.post(new Runnable() { // from class: com.ss.android.downloadlib.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.ss.android.downloadlib.addownload.k.d().a(5, com.ss.android.downloadlib.addownload.k.a(), null, "无网络，请检查网络设置", null, 0);
                        }
                    });
                }
                if (com.ss.android.socialbase.downloader.i.f.h(baseException)) {
                    if (com.ss.android.downloadlib.addownload.k.n() != null) {
                        com.ss.android.downloadlib.addownload.k.n().a(a6.b());
                    }
                    com.ss.android.downloadlib.d.a.a().a("download_failed_for_space", a6);
                    if (!a6.Q()) {
                        com.ss.android.downloadlib.d.a.a().a("download_can_restart", a6);
                        a(downloadInfo);
                    }
                    if ((com.ss.android.downloadlib.addownload.k.n() == null || !com.ss.android.downloadlib.addownload.k.n().d()) && (a5 = com.ss.android.downloadlib.addownload.b.f.a().a(a6.b())) != null && a5.isShowToast()) {
                        final com.ss.android.socialbase.downloader.g.a a7 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
                        if (a7.a("show_no_enough_space_toast", 0) == 1) {
                            this.f9995b.post(new Runnable() { // from class: com.ss.android.downloadlib.c.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.ss.android.downloadlib.addownload.k.d().a(2, com.ss.android.downloadlib.addownload.k.a(), a5, a7.a("no_enough_space_toast_text", "您的存储空间不足，请清理后再试"), null, 0);
                                }
                            });
                        }
                    }
                }
                baseException2 = new BaseException(baseException.getErrorCode(), m.a(baseException.getMessage(), com.ss.android.downloadlib.addownload.k.j().optInt("exception_msg_length", 500)));
            } else {
                baseException2 = null;
            }
            com.ss.android.downloadlib.d.a.a().b(downloadInfo, baseException2);
            g.a().a(downloadInfo, baseException, "");
        } catch (Exception e5) {
            com.ss.android.downloadlib.addownload.k.u().a(e5, "onAppDownloadMonitorSend");
        }
    }

    private void a(final DownloadInfo downloadInfo, final com.ss.android.downloadad.api.a.b bVar) {
        final long a5 = m.a(Environment.getDataDirectory(), -1L);
        long min = Math.min(524288000L, m.a(Environment.getDataDirectory()) / 10);
        final long totalBytes = downloadInfo.getTotalBytes();
        final double d5 = (totalBytes * 2.5d) + min;
        if (a5 > -1 && totalBytes > -1) {
            double d6 = a5;
            if (d6 < d5 && d5 - d6 > com.ss.android.downloadlib.addownload.d.b()) {
                com.ss.android.downloadlib.addownload.d.a(downloadInfo.getId());
            }
        }
        com.ss.android.socialbase.downloader.a.a.a().a(new a.InterfaceC0196a() { // from class: com.ss.android.downloadlib.c.3
            @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
            public void b() {
                if (!m.b(bVar)) {
                    long j5 = a5;
                    if (j5 > -1 && totalBytes > -1 && j5 < d5) {
                        com.ss.android.downloadlib.d.a.a().a("clean_space_install", com.ss.android.downloadlib.addownload.d.a("install_no_enough_space"), bVar);
                        if (com.ss.android.downloadlib.addownload.d.a(downloadInfo, ((long) d5) - a5)) {
                            com.ss.android.socialbase.downloader.a.a.a().b(this);
                            bVar.g(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.ss.android.socialbase.downloader.a.a.a().b(this);
            }

            @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
            public void c() {
            }
        });
    }

    private void a(@NonNull DownloadInfo downloadInfo) {
        if (com.ss.android.downloadlib.g.e.f(downloadInfo.getId())) {
            d.a().b(new com.ss.android.downloadlib.addownload.c.b(downloadInfo));
        }
    }
}
