package com.ss.android.downloadlib.c;

import android.content.Context;
import androidx.core.view.PointerIconCompat;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f implements com.ss.android.socialbase.appdownloader.c.d {

    /* renamed from: a, reason: collision with root package name */
    private Context f10009a;

    public f(Context context) {
        this.f10009a = context.getApplicationContext();
    }

    @Override // com.ss.android.socialbase.appdownloader.c.d
    public void a(Context context, String str) {
        com.ss.android.downloadlib.a.a().a(str);
    }

    @Override // com.ss.android.socialbase.appdownloader.c.d
    public void a(int i5, int i6, String str, int i7, long j5) {
        DownloadInfo downloadInfo;
        com.ss.android.downloadad.api.a.b a5;
        Context context = this.f10009a;
        if (context == null || (downloadInfo = Downloader.getInstance(context).getDownloadInfo(i5)) == null || downloadInfo.getStatus() == 0 || (a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo)) == null) {
            return;
        }
        if (i6 == 1) {
            com.ss.android.downloadlib.a.a(downloadInfo, a5);
            if ("application/vnd.android.package-archive".equals(downloadInfo.getMimeType())) {
                com.ss.android.downloadlib.addownload.a.a().a(downloadInfo, a5.b(), a5.l(), a5.e(), downloadInfo.getTitle(), a5.d(), downloadInfo.getTargetFilePath());
                return;
            }
            return;
        }
        if (i6 == 3) {
            com.ss.android.downloadlib.d.a.a().a("download_notification", "download_notification_install", com.ss.android.downloadlib.a.b(new JSONObject(), downloadInfo), a5);
            return;
        }
        if (i6 == 5) {
            com.ss.android.downloadlib.d.a.a().a("download_notification", "download_notification_pause", a5);
        } else if (i6 == 6) {
            com.ss.android.downloadlib.d.a.a().a("download_notification", "download_notification_continue", a5);
        } else {
            if (i6 != 7) {
                return;
            }
            com.ss.android.downloadlib.d.a.a().a("download_notification", "download_notification_click", a5);
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.c.d
    public boolean a(int i5, boolean z4) {
        if (k.p() != null) {
            return k.p().a(z4);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.d
    public void a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        com.ss.android.downloadlib.g.a().a(downloadInfo);
        if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("report_download_cancel", 1) == 1) {
            com.ss.android.downloadlib.d.a.a().a(downloadInfo, new BaseException(PointerIconCompat.TYPE_NO_DROP, ""));
        } else {
            com.ss.android.downloadlib.d.a.a().b(downloadInfo, new BaseException(PointerIconCompat.TYPE_NO_DROP, ""));
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.c.d
    public void a(int i5, int i6, String str, String str2, String str3) {
        DownloadInfo downloadInfo;
        Context context = this.f10009a;
        if (context == null || (downloadInfo = Downloader.getInstance(context).getDownloadInfo(i5)) == null || downloadInfo.getStatus() != -3) {
            return;
        }
        downloadInfo.setPackageName(str2);
        com.ss.android.downloadlib.addownload.b.a().a(this.f10009a, downloadInfo);
    }

    @Override // com.ss.android.socialbase.appdownloader.c.d
    public boolean a() {
        return com.ss.android.downloadlib.addownload.b.a().b();
    }
}
