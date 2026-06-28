package com.ss.android.socialbase.appdownloader.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* loaded from: classes3.dex */
public class b {
    public static void a(DownloadInfo downloadInfo) {
        b(downloadInfo);
    }

    private static void b(final DownloadInfo downloadInfo) {
        final int i5;
        final Context O = com.ss.android.socialbase.downloader.downloader.c.O();
        boolean z4 = true;
        if (((downloadInfo.isAutoResumed() && !downloadInfo.isShowNotificationForNetworkResumed()) || com.ss.android.socialbase.appdownloader.c.b(downloadInfo.getExtra()) || TextUtils.isEmpty(downloadInfo.getMimeType()) || !downloadInfo.getMimeType().equals("application/vnd.android.package-archive")) && com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("auto_install_when_resume", 0) != 1) {
            z4 = false;
        }
        if (z4) {
            i5 = com.ss.android.socialbase.appdownloader.c.a(O, downloadInfo.getId(), false);
        } else {
            i5 = 2;
        }
        com.ss.android.socialbase.downloader.downloader.c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.f.b.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                com.ss.android.socialbase.appdownloader.c.d b5 = com.ss.android.socialbase.appdownloader.d.j().b();
                z downloadNotificationEventListener = Downloader.getInstance(O).getDownloadNotificationEventListener(downloadInfo.getId());
                if (b5 != null || downloadNotificationEventListener != null) {
                    File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                    if (file.exists()) {
                        try {
                            PackageInfo a5 = com.ss.android.socialbase.appdownloader.c.a(downloadInfo, file);
                            if (a5 != null) {
                                if (i5 != 1 && !TextUtils.isEmpty(downloadInfo.getPackageName())) {
                                    str = downloadInfo.getPackageName();
                                } else {
                                    str = a5.packageName;
                                }
                                String str2 = str;
                                if (b5 != null) {
                                    b5.a(downloadInfo.getId(), 1, str2, -3, downloadInfo.getDownloadTime());
                                }
                                if (downloadNotificationEventListener != null) {
                                    downloadNotificationEventListener.a(1, downloadInfo, str2, "");
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
