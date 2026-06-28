package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public abstract class d extends AbsDownloadListener implements s {
    private void a(int i5, DownloadInfo downloadInfo, BaseException baseException, boolean z4) {
        if (downloadInfo == null || !downloadInfo.canShowNotification() || i5 == 4) {
            return;
        }
        com.ss.android.socialbase.downloader.notification.a e5 = com.ss.android.socialbase.downloader.notification.b.a().e(downloadInfo.getId());
        if (e5 == null) {
            e5 = a();
        }
        e5.b(downloadInfo.getTotalBytes());
        if (i5 == -3) {
            e5.a(downloadInfo.getTotalBytes());
        } else {
            e5.a(downloadInfo.getCurBytes());
        }
        e5.a(i5, baseException, z4);
    }

    private void b(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification()) {
            com.ss.android.socialbase.downloader.notification.a e5 = com.ss.android.socialbase.downloader.notification.b.a().e(downloadInfo.getId());
            if (e5 == null) {
                com.ss.android.socialbase.downloader.notification.b.a().a(a());
            } else {
                e5.a(downloadInfo);
            }
        }
    }

    private void c(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification() && downloadInfo.getStatus() == 4) {
            com.ss.android.socialbase.downloader.notification.a e5 = com.ss.android.socialbase.downloader.notification.b.a().e(downloadInfo.getId());
            if (e5 == null) {
                e5 = a();
            }
            e5.a(downloadInfo.getCurBytes(), downloadInfo.getTotalBytes());
        }
    }

    protected abstract com.ss.android.socialbase.downloader.notification.a a();

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        a(-1, downloadInfo, baseException, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        a(-2, downloadInfo, null, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        super.onPrepare(downloadInfo);
        b(downloadInfo);
        a(1, downloadInfo, null, true);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        c(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        a(2, downloadInfo, null, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        a(-3, downloadInfo, null, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.s
    public void a(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        a(11, downloadInfo, null, true);
    }
}
