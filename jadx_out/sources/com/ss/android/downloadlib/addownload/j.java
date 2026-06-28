package com.ss.android.downloadlib.addownload;

import com.ss.android.download.api.model.DownloadShortInfo;

/* loaded from: classes3.dex */
public class j {
    public static int a(int i5, int i6) {
        return (i6 <= 0 || i6 >= 100 || !a(i5)) ? i6 : (int) (Math.sqrt(i6) * 10.0d);
    }

    public static long a(int i5, long j5, long j6) {
        if (!a(i5)) {
            return j5;
        }
        if (j5 <= 0) {
            return 0L;
        }
        return j6 <= 0 ? j5 : (j6 * a(i5, (int) ((j5 * 100) / j6))) / 100;
    }

    public static DownloadShortInfo a(DownloadShortInfo downloadShortInfo) {
        if (downloadShortInfo != null && a((int) downloadShortInfo.id)) {
            downloadShortInfo.currentBytes = a((int) downloadShortInfo.id, downloadShortInfo.currentBytes, downloadShortInfo.totalBytes);
        }
        return downloadShortInfo;
    }

    private static boolean a(int i5) {
        return com.ss.android.socialbase.downloader.g.a.a(i5).a("pause_optimise_pretend_download_percent_switch", 0) == 1 && com.ss.android.socialbase.downloader.g.a.a(i5).a("pause_optimise_switch", 0) == 1;
    }
}
