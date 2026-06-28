package com.ss.android.downloadlib;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.downloadlib.addownload.b.d;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.addownload.l;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.appdownloader.b;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.tendcloud.tenddata.ab;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements com.ss.android.downloadad.api.a, b.c, a.InterfaceC0196a, ag {

    /* renamed from: a, reason: collision with root package name */
    private static String f9524a = "a";

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f9525d;

    /* renamed from: b, reason: collision with root package name */
    private long f9526b;

    /* renamed from: c, reason: collision with root package name */
    private b f9527c;

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: com.ss.android.downloadlib.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0179a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final int f9540b;

        public RunnableC0179a(int i5) {
            this.f9540b = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ss.android.downloadlib.addownload.b.f.a().b();
                ConcurrentHashMap<Long, com.ss.android.downloadad.api.a.b> c5 = com.ss.android.downloadlib.addownload.b.f.a().c();
                if (c5 != null && !c5.isEmpty()) {
                    a.this.a(c5, this.f9540b);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private long f9566a;

        /* renamed from: b, reason: collision with root package name */
        private int f9567b;

        /* renamed from: c, reason: collision with root package name */
        private long f9568c;

        /* renamed from: d, reason: collision with root package name */
        private int f9569d;

        /* renamed from: e, reason: collision with root package name */
        private long f9570e;

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f9570e = System.currentTimeMillis();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a()) {
                    a.a().a(this.f9566a, this.f9567b);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private b(long j5, int i5, long j6, int i6) {
            this.f9566a = j5;
            this.f9567b = i5;
            this.f9568c = j6;
            this.f9569d = i6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            if (r9 < r1) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean a() {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.a.b.a():boolean");
        }

        private int a(boolean z4, com.ss.android.downloadad.api.a.b bVar, DownloadInfo downloadInfo, boolean z5, JSONObject jSONObject) {
            com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
            int i5 = 1;
            if (a5.a("install_failed_check_ttmd5", 1) == 1) {
                int checkMd5Status = downloadInfo.checkMd5Status();
                try {
                    jSONObject.put("ttmd5_status", checkMd5Status);
                } catch (Throwable unused) {
                }
                if (!com.ss.android.socialbase.downloader.i.f.a(checkMd5Status)) {
                    return 2005;
                }
            }
            int i6 = this.f9569d;
            if (i6 != 2000) {
                return i6;
            }
            if (a5.a("install_failed_check_signature", 1) == 1 && m.e(k.a(), bVar.e())) {
                if (!m.a(m.i(k.a(), downloadInfo.getTargetFilePath()), m.h(k.a(), bVar.e()))) {
                    return 2006;
                }
            }
            if (!z4) {
                return 2002;
            }
            long j5 = this.f9570e;
            long j6 = this.f9568c;
            if (j5 <= j6) {
                return 2000;
            }
            try {
                jSONObject.put("install_time", j5 - j6);
                if (bVar.C() <= this.f9568c) {
                    i5 = 0;
                }
                jSONObject.put("install_again", i5);
            } catch (Throwable unused2) {
            }
            return !z5 ? 2003 : 2004;
        }
    }

    private a() {
        com.ss.android.socialbase.appdownloader.b.a(this);
        com.ss.android.socialbase.downloader.a.a.a().a(this);
    }

    public static JSONObject b(JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (jSONObject == null || downloadInfo == null || com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("download_event_opt", 1) == 0) {
            return jSONObject;
        }
        try {
            long b5 = m.b(0L);
            double d5 = b5;
            jSONObject.put("available_space", d5 / 1048576.0d);
            long totalBytes = downloadInfo.getTotalBytes();
            double d6 = totalBytes;
            jSONObject.put("apk_size", d6 / 1048576.0d);
            if (b5 > 0 && totalBytes > 0) {
                jSONObject.put("available_space_ratio", d5 / d6);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public static String c(@NonNull DownloadInfo downloadInfo, @NonNull com.ss.android.downloadad.api.a.b bVar) {
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        String str = null;
        if (file.exists()) {
            try {
                PackageInfo packageArchiveInfo = k.a().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), com.ss.android.socialbase.appdownloader.c.a());
                if (packageArchiveInfo != null) {
                    str = packageArchiveInfo.packageName;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str) && !str.equals(downloadInfo.getPackageName())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("real_package_name", str);
                jSONObject.put("input_package_name", downloadInfo.getPackageName());
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            com.ss.android.downloadlib.d.a.a().a("embeded_ad", "package_name_error", jSONObject, bVar);
            return str;
        }
        return downloadInfo.getPackageName();
    }

    synchronized void d() {
        b bVar = this.f9527c;
        if (bVar != null) {
            bVar.b();
            this.f9527c = null;
        }
    }

    public static a a() {
        if (f9525d == null) {
            synchronized (a.class) {
                if (f9525d == null) {
                    f9525d = new a();
                }
            }
        }
        return f9525d;
    }

    @WorkerThread
    public static synchronized void a(DownloadInfo downloadInfo, com.ss.android.downloadad.api.a.b bVar) {
        synchronized (a.class) {
            if (downloadInfo == null) {
                com.ss.android.downloadlib.e.c.a().a("onDownloadFinish info null");
                return;
            }
            if (bVar == null) {
                com.ss.android.downloadlib.e.c.a().a("onDownloadFinish nativeModel null");
                return;
            }
            if (bVar.G() != 1) {
                return;
            }
            com.ss.android.downloadlib.c.h.a().d(bVar);
            String c5 = c(downloadInfo, bVar);
            com.ss.android.downloadlib.addownload.b.f.a().b(downloadInfo.getUrl(), c5);
            Map<Long, com.ss.android.downloadad.api.a.b> a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo.getUrl(), c5);
            bVar.f(System.currentTimeMillis());
            bVar.e(2);
            bVar.b(c5);
            a5.put(Long.valueOf(bVar.b()), bVar);
            com.ss.android.downloadlib.addownload.b.i.a().a(a5.values());
            a(bVar);
            g.a().a(downloadInfo, c5);
            if ("application/vnd.android.package-archive".equals(downloadInfo.getMimeType())) {
                if (com.ss.android.downloadlib.g.e.a((com.ss.android.downloadad.api.a.a) bVar).a("enable_app_install_receiver", 1) != 1 && k.j().optInt("enable_app_install_receiver", 1) != 1) {
                    l.a().a(bVar);
                }
                a().b(downloadInfo, bVar);
                if (bVar.L()) {
                    com.ss.android.downloadlib.addownload.a.a.a().a(downloadInfo.getId(), bVar.b(), bVar.l(), c5, downloadInfo.getTitle(), bVar.d(), downloadInfo.getTargetFilePath());
                }
                com.ss.android.downloadlib.addownload.e.a.a(downloadInfo, bVar.b(), bVar.d(), c5);
            }
        }
    }

    public void b(DownloadInfo downloadInfo, final com.ss.android.downloadad.api.a.b bVar) {
        if (downloadInfo == null || bVar == null || com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("install_finish_check_ttmd5", 1) == 0) {
            return;
        }
        final String targetFilePath = downloadInfo.getTargetFilePath();
        if (TextUtils.isEmpty(targetFilePath)) {
            return;
        }
        d.a().b(new Runnable() { // from class: com.ss.android.downloadlib.a.3
            @Override // java.lang.Runnable
            public void run() {
                String a5 = com.ss.android.downloadlib.g.a.a(targetFilePath);
                if (TextUtils.isEmpty(a5)) {
                    return;
                }
                k.a().getSharedPreferences("sp_ttdownloader_md5", 0).edit().putString(String.valueOf(bVar.b()), a5).apply();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
    public void b() {
        com.ss.android.socialbase.downloader.c.a.b(f9524a, "onAppForeground()");
        d();
        a(5);
    }

    @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
    public void c() {
        com.ss.android.socialbase.downloader.c.a.b(f9524a, "onAppBackground()");
        a(6);
    }

    private int b(com.ss.android.downloadad.api.a.b bVar) {
        int realStatus;
        double a5 = com.ss.android.socialbase.downloader.g.a.a(bVar.s()).a("download_failed_finally_hours", 48.0d);
        if (a5 <= 0.0d) {
            return -1;
        }
        if (System.currentTimeMillis() - bVar.H() < a5 * 60.0d * 60.0d * 1000.0d) {
            return 1;
        }
        if (bVar.f9501d.get()) {
            return 0;
        }
        DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(bVar.s());
        if (downloadInfo == null || (realStatus = downloadInfo.getRealStatus()) == -3 || realStatus == -4) {
            return -1;
        }
        if (!DownloadStatus.isDownloading(realStatus) && bVar.f9501d.compareAndSet(false, true)) {
            try {
                JSONObject jSONObject = new JSONObject();
                a(jSONObject, downloadInfo);
                jSONObject.putOpt("download_status", Integer.valueOf(realStatus));
                jSONObject.putOpt("fail_status", Integer.valueOf(bVar.E()));
                jSONObject.putOpt("fail_msg", bVar.F());
                jSONObject.put("download_failed_times", bVar.x());
                if (downloadInfo.getTotalBytes() > 0) {
                    jSONObject.put("download_percent", downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
                }
                jSONObject.put("is_update_download", bVar.V() ? 1 : 2);
                com.ss.android.downloadlib.d.a.a().a(bVar.j(), "download_failed_finally", jSONObject, bVar);
                com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
                return 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 1;
    }

    @WorkerThread
    public synchronized void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!m.b()) {
            final com.ss.android.downloadad.api.a.b a5 = com.ss.android.downloadlib.addownload.b.f.a().a(str);
            if (a5 == null) {
                com.ss.android.downloadlib.addownload.b.d.a().a(str);
                return;
            }
            com.ss.android.downloadlib.addownload.e a6 = g.a().a(a5.a());
            if (a6 != null) {
                a6.f();
            }
            if (a5.f9500c.get()) {
                return;
            }
            if (com.ss.android.socialbase.downloader.g.a.a(a5.s()).b("notification_opt_2") == 1) {
                com.ss.android.socialbase.downloader.notification.b.a().f(a5.s());
            }
            new com.ss.android.downloadlib.b.b().a(a5, new com.ss.android.downloadlib.b.g() { // from class: com.ss.android.downloadlib.a.1
                @Override // com.ss.android.downloadlib.b.g
                public void a(boolean z4) {
                    boolean z5;
                    com.ss.android.socialbase.downloader.c.a.b(a.f9524a, "appBackForeground->" + z4);
                    if (z4) {
                        if (com.ss.android.downloadlib.b.f.c(a5)) {
                            z5 = com.ss.android.downloadlib.b.a.a(str, a5);
                        } else {
                            z5 = false;
                        }
                        if (!z5 && com.ss.android.downloadlib.b.f.d(a5) && a5.K() == 4) {
                            com.ss.android.downloadlib.addownload.a.a.a().a(a5);
                            return;
                        }
                        return;
                    }
                    if (!com.ss.android.downloadlib.b.a.a(str, a5) && a5.K() == 4) {
                        com.ss.android.downloadlib.addownload.a.a.a().a(a5);
                    }
                }
            }, com.ss.android.downloadlib.g.e.a((com.ss.android.downloadad.api.a.a) a5).a("try_applink_delay_after_installed", 0));
            com.ss.android.downloadlib.c.h.a().f(a5);
            a(str, a5);
            com.ss.android.downloadlib.addownload.a.a.a().b(str);
            DownloadInfo a7 = a((List<DownloadInfo>) Downloader.getInstance(k.a()).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive"), str);
            if (a7 != null) {
                if (com.ss.android.socialbase.downloader.g.a.a(a7.getId()).b("no_hide_notification") != 1) {
                    com.ss.android.socialbase.downloader.notification.b.a().a(a7.getId());
                }
                g.a().b(a7, str);
                com.ss.android.downloadlib.addownload.c.d.a(a7);
            } else {
                g.a().b(null, str);
            }
            return;
        }
        throw new RuntimeException("handleAppInstalled in main thread.");
    }

    private JSONObject b(@NonNull DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.a aVar) {
        com.ss.android.downloadad.api.a.b a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
        if (a5 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        aVar.a(jSONObject);
        try {
            jSONObject.put("download_id", downloadInfo.getId());
            jSONObject.put("name", downloadInfo.getName());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.ss.android.downloadlib.g.f.a(jSONObject, downloadInfo.getId());
        com.ss.android.downloadlib.d.a.a().a("embeded_ad", "ah_result", jSONObject, a5);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DownloadInfo downloadInfo, com.ss.android.downloadad.api.a.b bVar, int i5) {
        long max;
        if (downloadInfo == null || bVar == null) {
            return;
        }
        d();
        long currentTimeMillis = System.currentTimeMillis();
        bVar.b(currentTimeMillis);
        bVar.g(m.a(Environment.getDataDirectory(), -1L));
        if (i5 != 2000) {
            max = 2000;
        } else {
            long a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("check_install_failed_delay_time", 120000L);
            if (a5 < 0) {
                return;
            } else {
                max = Math.max(a5, ab.aa);
            }
        }
        long j5 = max;
        b bVar2 = new b(bVar.b(), downloadInfo.getId(), currentTimeMillis, i5);
        d.a().a(bVar2, j5);
        this.f9527c = bVar2;
        com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
    }

    public void a(final long j5, int i5) {
        long a5 = com.ss.android.socialbase.downloader.g.a.a(i5).a("check_install_finish_hijack_delay_time", 900000L);
        if (a5 < 0) {
            return;
        }
        d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.a.2
            @Override // java.lang.Runnable
            public void run() {
                a.a().a(j5);
            }
        }, Math.max(a5, 300000L));
    }

    public void a(long j5) {
        d.a a5;
        int i5;
        try {
            com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(j5);
            if (d5 != null && !m.b(d5) && !d5.f9500c.get()) {
                Pair<d.a, Integer> b5 = com.ss.android.downloadlib.addownload.b.d.a().b(d5);
                if (b5 != null) {
                    a5 = (d.a) b5.first;
                    i5 = ((Integer) b5.second).intValue();
                } else {
                    a5 = com.ss.android.downloadlib.addownload.b.d.a().a(d5);
                    i5 = -1;
                }
                if (a5 == null) {
                    return;
                }
                com.ss.android.downloadlib.addownload.b.d.a().b(a5.f9653a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("installed_app_name", a5.f9656d);
                jSONObject.put("installed_pkg_name", a5.f9653a);
                if (i5 != -1) {
                    jSONObject.put("error_code", i5);
                    com.ss.android.downloadlib.g.f.a(jSONObject, d5.s());
                    com.ss.android.downloadlib.d.a.a().b("install_finish_hijack", jSONObject, d5);
                    return;
                }
                com.ss.android.downloadlib.d.a.a().b("install_finish_may_hijack", jSONObject, d5);
            }
        } catch (Throwable th) {
            com.ss.android.downloadlib.e.c.a().a(th, "trySendInstallFinishHijack");
        }
    }

    public void a(String str, com.ss.android.downloadad.api.a.b bVar) {
        if (bVar != null && m.b(bVar) && bVar.f9500c.compareAndSet(false, true)) {
            com.ss.android.downloadlib.d.a.a().a(bVar.j(), "install_finish", a(bVar, str, bVar.K() != 4 ? 3 : 4), bVar);
            com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
        }
    }

    private static DownloadInfo a(List<DownloadInfo> list, String str) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null) {
                    if (str.equals(downloadInfo.getPackageName())) {
                        return downloadInfo;
                    }
                    if (m.a(k.a(), downloadInfo.getTargetFilePath(), str)) {
                        return downloadInfo;
                    }
                }
            }
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (jSONObject != null && downloadInfo != null) {
            int i5 = 1;
            if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("download_event_opt", 1) == 0) {
                return jSONObject;
            }
            try {
                jSONObject.put("download_id", downloadInfo.getId());
                jSONObject.put("name", downloadInfo.getName());
                jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                jSONObject.put("current_network_quality", com.ss.android.socialbase.downloader.network.k.a().b().name());
                jSONObject.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
                jSONObject.put("need_https_degrade", downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
                jSONObject.put("https_degrade_retry_used", downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                jSONObject.put("retry_count", downloadInfo.getRetryCount());
                jSONObject.put("cur_retry_time", downloadInfo.getCurRetryTime());
                jSONObject.put("need_retry_delay", downloadInfo.isNeedRetryDelay() ? 1 : 0);
                jSONObject.put("backup_url_used", downloadInfo.isBackUpUrlUsed() ? 1 : 0);
                jSONObject.put("head_connection_error_msg", downloadInfo.getHeadConnectionException() != null ? downloadInfo.getHeadConnectionException() : "");
                jSONObject.put("need_independent_process", downloadInfo.isNeedIndependentProcess() ? 1 : 0);
                jSONObject.put("total_retry_count", downloadInfo.getTotalRetryCount());
                jSONObject.put("cur_retry_time_in_total", downloadInfo.getCurRetryTimeInTotal());
                jSONObject.put("real_download_time", downloadInfo.getRealDownloadTime());
                jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
                jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
                jSONObject.put("download_prepare_time", downloadInfo.getDownloadPrepareTime());
                jSONObject.put("download_time", downloadInfo.getRealDownloadTime() + downloadInfo.getAllConnectTime() + downloadInfo.getDownloadPrepareTime());
                jSONObject.put("chunk_downgrade_retry_used", downloadInfo.isChunkDowngradeRetryUsed() ? 1 : 0);
                jSONObject.put("need_chunk_downgrade_retry", downloadInfo.isNeedChunkDowngradeRetry() ? 1 : 0);
                jSONObject.put("failed_resume_count", downloadInfo.getFailedResumeCount());
                jSONObject.put("preconnect_level", downloadInfo.getPreconnectLevel());
                jSONObject.put(TTDownloadField.TT_MD5, downloadInfo.getMd5());
                jSONObject.put("expect_file_length", downloadInfo.getExpectFileLength());
                jSONObject.put("retry_schedule_count", downloadInfo.getRetryScheduleCount());
                jSONObject.put("rw_concurrent", downloadInfo.isRwConcurrent() ? 1 : 0);
                double curBytes = downloadInfo.getCurBytes() / 1048576.0d;
                double realDownloadTime = downloadInfo.getRealDownloadTime() / 1000.0d;
                if (curBytes > 0.0d && realDownloadTime > 0.0d) {
                    double d5 = curBytes / realDownloadTime;
                    try {
                        jSONObject.put("download_speed", d5);
                    } catch (Exception unused) {
                    }
                    com.ss.android.socialbase.downloader.c.a.b(f9524a, "download speed : " + d5 + "MB/s");
                }
                try {
                    jSONObject.put("is_download_service_foreground", Downloader.getInstance(k.a()).isDownloadServiceForeground(downloadInfo.getId()) ? 1 : 0);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (downloadInfo.getBackUpUrls() != null) {
                    jSONObject.put("backup_url_count", downloadInfo.getBackUpUrls().size());
                    jSONObject.put("cur_backup_url_index", downloadInfo.getCurBackUpUrlIndex());
                }
                jSONObject.put("clear_space_restart_times", com.ss.android.downloadlib.addownload.c.d.a().b(downloadInfo.getUrl()));
                jSONObject.put("mime_type", downloadInfo.getMimeType());
                if (!com.ss.android.socialbase.downloader.i.f.c(k.a())) {
                    i5 = 2;
                }
                jSONObject.put("network_available", i5);
                jSONObject.put("status_code", downloadInfo.getHttpStatusCode());
                b(jSONObject, downloadInfo);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static void a(com.ss.android.downloadad.api.a.b bVar) {
        if (bVar == null) {
            return;
        }
        String P = TextUtils.isEmpty(bVar.P()) ? "" : bVar.P();
        DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(bVar.s());
        bVar.l("");
        com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
        JSONObject a5 = a(new JSONObject(), downloadInfo);
        int i5 = 1;
        try {
            a5.putOpt("finish_reason", P);
            a5.putOpt("finish_from_reserve_wifi", Integer.valueOf(downloadInfo.isDownloadFromReserveWifi() ? 1 : 0));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadad.api.a.b a6 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
        com.ss.android.downloadlib.g.f.a(a5, downloadInfo.getId());
        try {
            a5.put("download_failed_times", a6.x());
            a5.put("can_show_notification", com.ss.android.socialbase.appdownloader.e.d.a() ? 1 : 2);
            if (downloadInfo.getExpectFileLength() > 0 && downloadInfo.getTotalBytes() > 0) {
                a5.put("file_length_gap", downloadInfo.getExpectFileLength() - downloadInfo.getTotalBytes());
            }
            a5.put("ttmd5_status", downloadInfo.getTTMd5CheckStatus());
            a5.put("has_send_download_failed_finally", a6.f9501d.get() ? 1 : 2);
            if (!a6.V()) {
                i5 = 2;
            }
            a5.put("is_update_download", i5);
            com.ss.android.downloadlib.g.f.a(a6, a5);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().b("download_finish", a5, bVar);
    }

    private int a(com.ss.android.downloadad.api.a.b bVar, DownloadInfo downloadInfo, String str, JSONObject jSONObject) {
        int b5 = com.ss.android.socialbase.appdownloader.c.b(k.a(), downloadInfo);
        int b6 = m.b(k.a(), str);
        if (b5 > 0 && b6 > 0 && b5 != b6) {
            return b6 > b5 ? 3011 : 3010;
        }
        if (com.ss.android.socialbase.downloader.g.a.a(bVar.s()).a("install_finish_check_ttmd5", 1) != 1) {
            return 3001;
        }
        String string = k.a().getSharedPreferences("sp_ttdownloader_md5", 0).getString(String.valueOf(bVar.b()), null);
        if (TextUtils.isEmpty(string) && downloadInfo != null) {
            string = com.ss.android.downloadlib.g.a.a(downloadInfo.getTargetFilePath());
        }
        int a5 = com.ss.android.downloadlib.g.a.a(string, com.ss.android.downloadlib.g.a.b(str));
        try {
            jSONObject.put("ttmd5_status", a5);
        } catch (Throwable unused) {
        }
        if (a5 == 0) {
            return 3000;
        }
        return a5 == 1 ? 3002 : 3001;
    }

    @Override // com.ss.android.downloadad.api.a
    public void a(int i5) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f9526b < 120000) {
            return;
        }
        d.a().a(new RunnableC0179a(i5), this.f9526b > 0 ? 2000L : 8000L);
        this.f9526b = currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void a(@NonNull ConcurrentHashMap<Long, com.ss.android.downloadad.api.a.b> concurrentHashMap, int i5) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (com.ss.android.downloadad.api.a.b bVar : concurrentHashMap.values()) {
            if (bVar.f9500c.get()) {
                if (currentTimeMillis - bVar.H() >= com.ss.android.socialbase.downloader.g.a.a(bVar.s()).a("start_event_expire_hours", 168) * 60 * 60 * 1000) {
                    arrayList.add(Long.valueOf(bVar.b()));
                }
            } else if (bVar.G() == 1) {
                if (b(bVar) <= 0 && currentTimeMillis - bVar.H() >= com.ss.android.socialbase.downloader.g.a.a(bVar.s()).a("start_event_expire_hours", 168) * 60 * 60 * 1000) {
                    arrayList.add(Long.valueOf(bVar.b()));
                }
            } else if (bVar.G() == 2) {
                if (!bVar.Y()) {
                    if (m.b(bVar)) {
                        if (bVar.K() == 4) {
                            i5 = bVar.K();
                        }
                        bVar.j(false);
                        com.ss.android.downloadlib.d.a.a().a(a(bVar, bVar.e(), i5), bVar);
                        arrayList.add(Long.valueOf(bVar.b()));
                        com.ss.android.downloadlib.addownload.c.d.a(bVar);
                    } else if (bVar.Y() && bVar.K() == 4 && i5 == 1 && !m.b(bVar)) {
                        com.ss.android.downloadlib.g.l.a().a(f9524a, "trySendAndRefreshAdEvent", "命中兜底逻辑,尝试对广播监听执行冷启兜底逻辑");
                        h.a().a(bVar);
                    } else if (currentTimeMillis - bVar.H() >= com.ss.android.socialbase.downloader.g.a.a(bVar.s()).a("finish_event_expire_hours", 168) * 60 * 60 * 1000) {
                        arrayList.add(Long.valueOf(bVar.b()));
                    } else if (TextUtils.isEmpty(bVar.e())) {
                        arrayList.add(Long.valueOf(bVar.b()));
                    }
                }
            } else {
                arrayList.add(Long.valueOf(bVar.b()));
            }
        }
        com.ss.android.downloadlib.addownload.b.f.a().a(arrayList);
    }

    @Override // com.ss.android.socialbase.appdownloader.b.c
    public void a(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.a aVar) {
        JSONObject b5;
        if (downloadInfo == null || aVar == null) {
            return;
        }
        JSONArray e5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).e("ah_report_config");
        if (aVar.f10183b != 0) {
            downloadInfo.getTempCacheData().remove(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        }
        if (e5 == null || (b5 = b(downloadInfo, aVar)) == null) {
            return;
        }
        downloadInfo.getTempCacheData().put("ah_ext_json", b5);
    }

    @Override // com.ss.android.socialbase.downloader.depend.ag
    public void a(@Nullable final DownloadInfo downloadInfo, @Nullable String str) {
        if (downloadInfo == null) {
            com.ss.android.downloadlib.e.c.a().a("info is null");
        } else if ((com.ss.android.socialbase.downloader.g.a.a(downloadInfo).b("check_applink_mode") & 2) != 0) {
            final JSONObject jSONObject = (JSONObject) downloadInfo.getTempCacheData().get("ah_ext_json");
            com.ss.android.downloadlib.b.e.a().b(new com.ss.android.downloadlib.b.d() { // from class: com.ss.android.downloadlib.a.4
                @Override // com.ss.android.downloadlib.b.d
                public void a(boolean z4) {
                    String str2;
                    if (!z4) {
                        Intent intent = (Intent) downloadInfo.getTempCacheData().get(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        if (intent != null) {
                            downloadInfo.getTempCacheData().remove(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                            com.ss.android.socialbase.appdownloader.c.a(k.a(), intent);
                            m.a(jSONObject, "backup", (Object) 1);
                        } else {
                            m.a(jSONObject, "backup", (Object) 2);
                        }
                    }
                    com.ss.android.downloadad.api.a.b a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
                    if (a5 != null) {
                        com.ss.android.downloadlib.d.a a6 = com.ss.android.downloadlib.d.a.a();
                        if (z4) {
                            str2 = "installer_delay_success";
                        } else {
                            str2 = "installer_delay_failed";
                        }
                        a6.a(str2, jSONObject, a5);
                    } else {
                        com.ss.android.downloadlib.e.c.a().b("ah nativeModel=null");
                    }
                    if (z4) {
                        k.v().a(k.a(), null, null, null, null, 1);
                    }
                }
            });
        }
    }

    private JSONObject a(com.ss.android.downloadad.api.a.b bVar, String str, int i5) {
        com.ss.android.socialbase.appdownloader.a a5;
        JSONObject jSONObject = new JSONObject();
        try {
            DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(bVar.s());
            jSONObject.putOpt("scene", Integer.valueOf(i5));
            com.ss.android.downloadlib.g.f.a(jSONObject, bVar.s());
            com.ss.android.downloadlib.g.f.a(bVar, jSONObject);
            jSONObject.put("is_update_download", bVar.V() ? 1 : 2);
            jSONObject.put("install_after_back_app", bVar.ab() ? 1 : 2);
            jSONObject.putOpt("clean_space_install_params", bVar.R() ? "1" : "2");
            if (downloadInfo != null) {
                a(jSONObject, downloadInfo);
                try {
                    jSONObject.put("uninstall_resume_count", downloadInfo.getUninstallResumeCount());
                    if (bVar.C() > 0) {
                        long currentTimeMillis = System.currentTimeMillis() - bVar.C();
                        jSONObject.put("install_time", currentTimeMillis);
                        if (currentTimeMillis > com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("check_install_finish_expired_duration", 86400000L)) {
                            jSONObject.put("install_expired", 1);
                        } else {
                            jSONObject.put("install_expired", 0);
                        }
                    }
                } catch (Throwable unused) {
                }
                String a6 = com.ss.android.socialbase.downloader.i.f.a(downloadInfo.getTempCacheData().get("ah_attempt"), (String) null);
                if (!TextUtils.isEmpty(a6) && (a5 = com.ss.android.socialbase.appdownloader.a.a(a6)) != null) {
                    a5.a(jSONObject);
                }
            }
            int a7 = a(bVar, downloadInfo, str, jSONObject);
            jSONObject.put("fail_status", a7);
            if (a7 == 3000) {
                jSONObject.put("hijack", 2);
            } else if (a7 == 3001) {
                jSONObject.put("hijack", 0);
            } else {
                jSONObject.put("hijack", 1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public void a(DownloadInfo downloadInfo, long j5, long j6, long j7, long j8, long j9, boolean z4) {
        com.ss.android.downloadad.api.a.b a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
        if (a5 == null) {
            com.ss.android.downloadlib.e.c.a().a("trySendClearSpaceEvent nativeModel null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("space_before", Double.valueOf(j5 / 1048576.0d));
            jSONObject.putOpt("space_cleaned", Double.valueOf((j6 - j5) / 1048576.0d));
            jSONObject.putOpt("clean_up_time_cost", Long.valueOf(j8));
            jSONObject.putOpt("is_download_restarted", Integer.valueOf(z4 ? 1 : 0));
            jSONObject.putOpt("byte_required", Long.valueOf(j7));
            jSONObject.putOpt("byte_required_after", Double.valueOf((j7 - j6) / 1048576.0d));
            jSONObject.putOpt("clear_sleep_time", Long.valueOf(j9));
            com.ss.android.downloadlib.g.f.c(downloadInfo, jSONObject);
            com.ss.android.downloadlib.d.a.a().a("cleanup", jSONObject, a5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
