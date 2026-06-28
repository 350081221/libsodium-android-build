package com.ss.android.downloadlib.c;

import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* loaded from: classes3.dex */
public class c implements m {
    @Override // com.ss.android.socialbase.downloader.depend.m
    public void a(DownloadInfo downloadInfo) throws BaseException {
        com.ss.android.download.api.config.m l5 = k.l();
        if (downloadInfo == null || l5 == null) {
            return;
        }
        String packageName = downloadInfo.getPackageName();
        String targetFilePath = downloadInfo.getTargetFilePath();
        File a5 = a(packageName, targetFilePath);
        com.ss.android.downloadad.api.a.b a6 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
        l5.a(packageName, targetFilePath, a5, a6 != null ? com.ss.android.downloadlib.g.m.a(a6.g()) : null);
        downloadInfo.setMimeType("application/vnd.android.package-archive");
        downloadInfo.setName(a5.getName());
        downloadInfo.setMd5(null);
    }

    @Override // com.ss.android.socialbase.downloader.depend.m
    public boolean b(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            return com.ss.android.download.api.c.b.a(com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()), downloadInfo.getMimeType());
        }
        return false;
    }

    private File a(String str, String str2) {
        File file = new File(str2);
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            str = name.substring(0, lastIndexOf);
        }
        return new File(file.getParent(), str + ".apk");
    }
}
