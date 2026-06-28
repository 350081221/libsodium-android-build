package com.ss.android.download.api.model;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class DownloadShortInfo {
    public String fileName;
    public boolean onlyWifi;
    public long id = -1;
    public int status = -1;
    public long totalBytes = -1;
    public long currentBytes = -1;
    public int failStatus = 0;

    public boolean equals(Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if ((obj instanceof DownloadShortInfo) && obj != null) {
            DownloadShortInfo downloadShortInfo = (DownloadShortInfo) obj;
            if (this.id == downloadShortInfo.id) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.status == downloadShortInfo.status) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (this.totalBytes == downloadShortInfo.totalBytes) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((TextUtils.isEmpty(this.fileName) && TextUtils.isEmpty(downloadShortInfo.fileName)) || (!TextUtils.isEmpty(this.fileName) && !TextUtils.isEmpty(downloadShortInfo.fileName) && this.fileName.equals(downloadShortInfo.fileName))) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z4 && z5 && z6 && z7) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.id), Integer.valueOf(this.status), Long.valueOf(this.totalBytes), this.fileName});
    }

    public void updateFromNewDownloadInfo(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        this.id = downloadInfo.getId();
        this.status = downloadInfo.getStatus();
        this.currentBytes = downloadInfo.getCurBytes();
        this.totalBytes = downloadInfo.getTotalBytes();
        this.fileName = downloadInfo.getTargetFilePath();
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException != null) {
            this.failStatus = failedException.getErrorCode();
        } else {
            this.failStatus = 0;
        }
        this.onlyWifi = downloadInfo.isOnlyWifi();
    }
}
