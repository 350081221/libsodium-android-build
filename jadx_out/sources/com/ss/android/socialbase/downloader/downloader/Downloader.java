package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class Downloader extends b {
    private static volatile Downloader instance;

    static {
        c.a(new v());
        instance = null;
    }

    private Downloader() {
    }

    public static Downloader getInstance(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                if (instance == null) {
                    c.a(context);
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static synchronized void init(DownloaderBuilder downloaderBuilder) {
        synchronized (Downloader.class) {
            initOrCover(downloaderBuilder, false);
        }
    }

    public static synchronized void initOrCover(DownloaderBuilder downloaderBuilder, boolean z4) {
        synchronized (Downloader.class) {
            if (downloaderBuilder == null) {
                return;
            }
            if (instance == null) {
                instance = downloaderBuilder.build();
            } else if (!c.S()) {
                c.a(downloaderBuilder);
            } else if (z4) {
                c.b(downloaderBuilder);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void addMainThreadListener(int i5, IDownloadListener iDownloadListener) {
        super.addMainThreadListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void addNotificationListener(int i5, IDownloadListener iDownloadListener) {
        super.addNotificationListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void addSubThreadListener(int i5, IDownloadListener iDownloadListener) {
        super.addSubThreadListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean canResume(int i5) {
        return super.canResume(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void cancel(int i5) {
        super.cancel(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void clearDownloadData(int i5) {
        super.clearDownloadData(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void destoryDownloader() {
        super.destoryDownloader();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void forceDownloadIngoreRecommendSize(int i5) {
        super.forceDownloadIngoreRecommendSize(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getAllDownloadInfo() {
        return super.getAllDownloadInfo();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ long getCurBytes(int i5) {
        return super.getCurBytes(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ IDownloadFileUriProvider getDownloadFileUriProvider(int i5) {
        return super.getDownloadFileUriProvider(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ int getDownloadId(String str, String str2) {
        return super.getDownloadId(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(int i5) {
        return super.getDownloadInfo(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getDownloadInfoList(String str) {
        return super.getDownloadInfoList(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ z getDownloadNotificationEventListener(int i5) {
        return super.getDownloadNotificationEventListener(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getDownloadingDownloadInfosWithMimeType(String str) {
        return super.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getFailedDownloadInfosWithMimeType(String str) {
        return super.getFailedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ File getGlobalSaveDir() {
        return super.getGlobalSaveDir();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ File getGlobalSaveTempDir() {
        return super.getGlobalSaveTempDir();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ r getReserveWifiStatusListener() {
        return super.getReserveWifiStatusListener();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ int getStatus(int i5) {
        return super.getStatus(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getSuccessedDownloadInfosWithMimeType(String str) {
        return super.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ List getUnCompletedDownloadInfosWithMimeType(String str) {
        return super.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloadCacheSyncSuccess() {
        return super.isDownloadCacheSyncSuccess();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloadServiceForeground(int i5) {
        return super.isDownloadServiceForeground(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return super.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isDownloading(int i5) {
        return super.isDownloading(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ boolean isHttpServiceInit() {
        return super.isHttpServiceInit();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void pause(int i5) {
        super.pause(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void pauseAll() {
        super.pauseAll();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void registerDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.k kVar) {
        super.registerDownloadCacheSyncListener(kVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void registerDownloaderProcessConnectedListener(ac acVar) {
        super.registerDownloaderProcessConnectedListener(acVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeMainThreadListener(int i5, IDownloadListener iDownloadListener) {
        super.removeMainThreadListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeNotificationListener(int i5, IDownloadListener iDownloadListener) {
        super.removeNotificationListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void removeSubThreadListener(int i5, IDownloadListener iDownloadListener) {
        super.removeSubThreadListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void removeTaskMainListener(int i5) {
        super.removeTaskMainListener(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void removeTaskNotificationListener(int i5) {
        super.removeTaskNotificationListener(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void removeTaskSubListener(int i5) {
        super.removeTaskSubListener(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void restart(int i5) {
        super.restart(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void restartAllFailedDownloadTasks(List list) {
        super.restartAllFailedDownloadTasks(list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void restartAllPauseReserveOnWifiDownloadTasks(List list) {
        super.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void resume(int i5) {
        super.resume(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDefaultSavePath(String str) {
        super.setDefaultSavePath(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDefaultSaveTempPath(String str) {
        super.setDefaultSaveTempPath(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDownloadInMultiProcess() {
        super.setDownloadInMultiProcess();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setDownloadNotificationEventListener(int i5, z zVar) {
        super.setDownloadNotificationEventListener(i5, zVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setLogLevel(int i5) {
        super.setLogLevel(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i5, IDownloadListener iDownloadListener) {
        super.setMainThreadListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setNotificationListener(int i5, IDownloadListener iDownloadListener) {
        super.setNotificationListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setReserveWifiStatusListener(r rVar) {
        super.setReserveWifiStatusListener(rVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setSubThreadListener(int i5, IDownloadListener iDownloadListener) {
        super.setSubThreadListener(i5, iDownloadListener);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i5, long j5) {
        super.setThrottleNetSpeed(i5, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void unRegisterDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.k kVar) {
        super.unRegisterDownloadCacheSyncListener(kVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void unRegisterDownloaderProcessConnectedListener(ac acVar) {
        super.unRegisterDownloaderProcessConnectedListener(acVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Downloader(DownloaderBuilder downloaderBuilder) {
        c.a(downloaderBuilder);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void cancel(int i5, boolean z4) {
        super.cancel(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ void clearDownloadData(int i5, boolean z4) {
        super.clearDownloadData(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(String str, String str2) {
        return super.getDownloadInfo(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i5, IDownloadListener iDownloadListener, boolean z4) {
        super.setMainThreadListener(i5, iDownloadListener, z4);
    }
}
