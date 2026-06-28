package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    private String globalDefaultSavePath;
    private String globalDefaultSaveTempPath;

    public static DownloadTask with(Context context) {
        Downloader.getInstance(context);
        return new DownloadTask();
    }

    public void addMainThreadListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().b(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.MAIN, false);
    }

    public void addNotificationListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().b(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.NOTIFICATION, false);
    }

    public void addSubThreadListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().b(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.SUB, false);
    }

    public boolean canResume(int i5) {
        return d.a().e(i5);
    }

    public void cancel(int i5) {
        cancel(i5, true);
    }

    public void clearDownloadData(int i5) {
        d.a().d(i5, true);
    }

    public void destoryDownloader() {
        c.a();
    }

    public void forceDownloadIngoreRecommendSize(int i5) {
        d.a().n(i5);
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        return d.a().e();
    }

    public long getCurBytes(int i5) {
        return d.a().h(i5);
    }

    public IDownloadFileUriProvider getDownloadFileUriProvider(int i5) {
        return d.a().r(i5);
    }

    public int getDownloadId(String str, String str2) {
        return d.a().a(str, str2);
    }

    public DownloadInfo getDownloadInfo(int i5) {
        return d.a().k(i5);
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        return d.a().a(str);
    }

    public z getDownloadNotificationEventListener(int i5) {
        return d.a().l(i5);
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return d.a().e(str);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        return d.a().b(str);
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath, true);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath, false);
    }

    public r getReserveWifiStatusListener() {
        return c.R();
    }

    public int getStatus(int i5) {
        return d.a().i(i5);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return d.a().c(str);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return d.a().d(str);
    }

    public boolean isDownloadCacheSyncSuccess() {
        return d.a().f();
    }

    public boolean isDownloadServiceForeground(int i5) {
        return d.a().c(i5).b();
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return d.a().a(downloadInfo);
    }

    public boolean isDownloading(int i5) {
        boolean j5;
        if (com.ss.android.socialbase.downloader.i.a.a(4194304)) {
            synchronized (this) {
                j5 = d.a().j(i5);
            }
            return j5;
        }
        return d.a().j(i5);
    }

    public boolean isHttpServiceInit() {
        return d.a().d();
    }

    public void pause(int i5) {
        d.a().d(i5);
    }

    public void pauseAll() {
        d.a().c();
    }

    public void registerDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.k kVar) {
        d.a().a(kVar);
    }

    public void registerDownloaderProcessConnectedListener(ac acVar) {
        d.a().a(acVar);
    }

    public void removeMainThreadListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().a(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.MAIN, false);
    }

    public void removeNotificationListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().a(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.NOTIFICATION, false);
    }

    public void removeSubThreadListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().a(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.SUB, false);
    }

    @Deprecated
    public void removeTaskMainListener(int i5) {
        d.a().a(i5, null, com.ss.android.socialbase.downloader.constants.f.MAIN, true);
    }

    @Deprecated
    public void removeTaskNotificationListener(int i5) {
        d.a().a(i5, null, com.ss.android.socialbase.downloader.constants.f.NOTIFICATION, true);
    }

    @Deprecated
    public void removeTaskSubListener(int i5) {
        d.a().a(i5, null, com.ss.android.socialbase.downloader.constants.f.SUB, true);
    }

    public void restart(int i5) {
        d.a().g(i5);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        d.a().a(list);
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        d.a().b(list);
    }

    public void resume(int i5) {
        d.a().f(i5);
    }

    public void setDefaultSavePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSavePath = str;
        }
    }

    public void setDefaultSaveTempPath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSaveTempPath = str;
        }
    }

    public void setDownloadInMultiProcess() {
        if (com.ss.android.socialbase.downloader.i.a.a(4194304)) {
            synchronized (this) {
                c.b();
            }
        } else {
            c.b();
        }
    }

    public void setDownloadNotificationEventListener(int i5, z zVar) {
        d.a().a(i5, zVar);
    }

    public void setLogLevel(int i5) {
        d.a().p(i5);
    }

    @Deprecated
    public void setMainThreadListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().b(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.MAIN, true);
    }

    @Deprecated
    public void setNotificationListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().b(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.NOTIFICATION, true);
    }

    public void setReserveWifiStatusListener(r rVar) {
        c.a(rVar);
    }

    @Deprecated
    public void setSubThreadListener(int i5, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().b(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.SUB, true);
    }

    public void setThrottleNetSpeed(int i5, long j5) {
        d.a().a(i5, j5);
    }

    public void unRegisterDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.k kVar) {
        d.a().b(kVar);
    }

    public void unRegisterDownloaderProcessConnectedListener(ac acVar) {
        d.a().b(acVar);
    }

    private File getGlobalSaveDir(String str, boolean z4) {
        File file = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file2 = new File(str);
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                } else if (!file2.isDirectory()) {
                    if (!z4) {
                        return null;
                    }
                    file2.delete();
                    file2.mkdirs();
                }
                return file2;
            } catch (Throwable unused) {
                file = file2;
                return file;
            }
        } catch (Throwable unused2) {
        }
    }

    public void cancel(int i5, boolean z4) {
        d.a().c(i5, z4);
    }

    public void clearDownloadData(int i5, boolean z4) {
        d.a().d(i5, z4);
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        return d.a().b(str, str2);
    }

    @Deprecated
    public void setMainThreadListener(int i5, IDownloadListener iDownloadListener, boolean z4) {
        if (iDownloadListener == null) {
            return;
        }
        d.a().a(i5, iDownloadListener, com.ss.android.socialbase.downloader.constants.f.MAIN, true, z4);
    }
}
