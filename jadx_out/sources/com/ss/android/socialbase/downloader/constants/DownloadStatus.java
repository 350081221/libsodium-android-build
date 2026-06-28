package com.ss.android.socialbase.downloader.constants;

/* loaded from: classes3.dex */
public class DownloadStatus {
    public static final int CANCELED = -4;
    public static final int CONNECTED = 3;
    public static final int DOWNLOAD_COMPLETE_HANDLE = 11;
    public static final int FAILED = -1;
    public static final int FIRST_START = 6;
    public static final int FIRST_SUCCESS = -6;
    public static final int IDLE_STATUS = 0;
    public static final int INTERCEPT = -7;
    public static final int PAUSED = -2;
    public static final int PAUSED_BY_DB_INIT = -5;
    public static final int PREPARE = 1;
    public static final int PROGRESS = 4;
    public static final int RETRY = 5;
    public static final int RETRY_DELAY = 7;
    public static final int SINGLE_CHUNK_DELAY_RETRY = 10;
    public static final int SINGLE_CHUNK_RETRY = 9;
    public static final int START = 2;
    public static final int SUCCESSED = -3;
    public static final int WAITING_ASYNC_HANDLER = 8;

    public static boolean isDownloadOver(int i5) {
        return (i5 >= 0 || i5 == -2 || i5 == -5) ? false : true;
    }

    public static boolean isDownloading(int i5) {
        return (i5 <= 0 || i5 == 7 || i5 == 8 || i5 == 10) ? false : true;
    }

    public static boolean isFailedStatus(int i5) {
        return i5 == -1 || i5 == -7;
    }

    public static boolean isMonitorStatus(int i5) {
        return i5 == 2 || i5 == -3 || i5 == -1 || i5 == -4 || i5 == -2 || i5 == 6 || i5 == 0;
    }

    public static boolean isRealTimeUploadStatus(int i5) {
        return i5 == -3 || i5 == -1 || i5 == -4 || i5 == -2 || i5 == 5 || i5 == 7 || i5 == 8;
    }

    public static boolean isTimeUploadStatus(int i5) {
        return i5 == -3 || i5 == -1 || i5 == -4;
    }

    public static boolean isUnCompletedStatus(int i5) {
        return i5 == -1 || i5 == -2 || i5 == -7 || i5 == -4 || i5 == -5;
    }
}
