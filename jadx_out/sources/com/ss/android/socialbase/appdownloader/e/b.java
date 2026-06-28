package com.ss.android.socialbase.appdownloader.e;

import android.content.Context;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public class b extends com.ss.android.socialbase.downloader.depend.d {

    /* renamed from: a, reason: collision with root package name */
    private Context f10271a;

    /* renamed from: b, reason: collision with root package name */
    private int f10272b;

    /* renamed from: c, reason: collision with root package name */
    private String f10273c;

    /* renamed from: d, reason: collision with root package name */
    private String f10274d;

    /* renamed from: e, reason: collision with root package name */
    private String f10275e;

    /* renamed from: f, reason: collision with root package name */
    private String f10276f;

    /* renamed from: g, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.notification.a f10277g;

    public b(Context context, int i5, String str, String str2, String str3, String str4) {
        if (context != null) {
            this.f10271a = context.getApplicationContext();
        } else {
            this.f10271a = com.ss.android.socialbase.downloader.downloader.c.O();
        }
        this.f10272b = i5;
        this.f10273c = str;
        this.f10274d = str2;
        this.f10275e = str3;
        this.f10276f = str4;
    }

    @Override // com.ss.android.socialbase.downloader.depend.d
    public com.ss.android.socialbase.downloader.notification.a a() {
        Context context;
        com.ss.android.socialbase.downloader.notification.a aVar = this.f10277g;
        if (aVar == null && (context = this.f10271a) != null) {
            return new a(context, this.f10272b, this.f10273c, this.f10274d, this.f10275e, this.f10276f);
        }
        return aVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.d, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo != null && this.f10271a != null && downloadInfo.canShowNotification() && !downloadInfo.isAutoInstallWithoutNotification()) {
            super.onFailed(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.d, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !downloadInfo.isAutoInstallWithoutNotification()) {
            super.onPause(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.d, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !downloadInfo.isAutoInstallWithoutNotification()) {
            super.onPrepare(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.d, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !downloadInfo.isAutoInstallWithoutNotification()) {
            super.onProgress(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.d, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !downloadInfo.isAutoInstallWithoutNotification()) {
            super.onStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.d, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null && this.f10271a != null) {
            if (downloadInfo.canShowNotification() && (!downloadInfo.isAutoInstallWithoutNotification() || !downloadInfo.isAutoInstall())) {
                super.onSuccessed(downloadInfo);
            }
            if (downloadInfo.isAutoInstall()) {
                com.ss.android.socialbase.appdownloader.f.b.a(downloadInfo);
            }
        }
    }

    public b(com.ss.android.socialbase.downloader.notification.a aVar) {
        this.f10271a = com.ss.android.socialbase.downloader.downloader.c.O();
        this.f10277g = aVar;
    }
}
