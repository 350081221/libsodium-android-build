package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8814a = false;

    /* renamed from: b, reason: collision with root package name */
    public static ScheduledExecutorService f8815b = Executors.newSingleThreadScheduledExecutor();

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f8816a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f8817b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f8818c;

        public a(File file, long j5, String str) {
            this.f8816a = file;
            this.f8817b = j5;
            this.f8818c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = this.f8816a;
            if (file == null) {
                HMSLog.e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && (parentFile.mkdirs() || parentFile.isDirectory())) {
                RandomAccessFile randomAccessFile = null;
                try {
                    try {
                        long length = this.f8816a.length();
                        if (length > this.f8817b) {
                            String canonicalPath = this.f8816a.getCanonicalPath();
                            if (!this.f8816a.delete()) {
                                HMSLog.e("FileUtil", "last file delete failed.");
                            }
                            randomAccessFile = new RandomAccessFile(new File(canonicalPath), "rw");
                        } else {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f8816a, "rw");
                            try {
                                randomAccessFile2.seek(length);
                                randomAccessFile = randomAccessFile2;
                            } catch (IOException e5) {
                                e = e5;
                                randomAccessFile = randomAccessFile2;
                                HMSLog.e("FileUtil", "writeFile exception:", e);
                                IOUtils.closeQuietly(randomAccessFile);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                randomAccessFile = randomAccessFile2;
                                IOUtils.closeQuietly(randomAccessFile);
                                throw th;
                            }
                        }
                        randomAccessFile.writeBytes(this.f8818c + System.getProperty("line.separator"));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e6) {
                    e = e6;
                }
                IOUtils.closeQuietly(randomAccessFile);
                return;
            }
            HMSLog.e("FileUtil", "In writeFile, Failed to create directory.");
        }
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        if (digest != null && HEX.encodeHexString(digest, true).equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static void writeFile(File file, String str, long j5) {
        f8815b.execute(new a(file, j5, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j5, int i5) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f8814a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e("FileUtil", "file delete failed.");
                }
                f8814a = true;
            }
            writeFile(file2, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j5 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i5, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
