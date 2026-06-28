package com.huawei.agconnect.apms;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.umeng.analytics.pro.bi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class j1 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final int[] bcd = {Process.myPid()};
    public static final FileFilter cde = new abc();

    /* loaded from: classes3.dex */
    public static class abc implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file == null) {
                return false;
            }
            try {
                String name = file.getName();
                if (name.startsWith(bi.f12277w)) {
                    for (int i5 = 3; i5 < name.length(); i5++) {
                        char charAt = name.charAt(i5);
                        if (charAt < '0' || charAt > '9') {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    public static long abc(Context context) {
        ActivityManager activityManager;
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get memory usage: "), abc);
        }
        if (activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(bcd)) == null || processMemoryInfo.length <= 0 || (memoryInfo = processMemoryInfo[0]) == null) {
            return 0L;
        }
        long totalPss = memoryInfo.getTotalPss();
        if (totalPss >= 0) {
            return totalPss / 1024;
        }
        return 0L;
    }

    public static int bcd() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(cde);
            if (listFiles == null) {
                return -1;
            }
            return listFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int abc(String str, BufferedReader bufferedReader) {
        if (bufferedReader == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (readLine.contains(str)) {
                                for (int i5 = 0; i5 < readLine.length(); i5++) {
                                    if (readLine.charAt(i5) >= '0' && readLine.charAt(i5) <= '9') {
                                        sb.append(readLine.charAt(i5));
                                    }
                                }
                            }
                        } catch (IOException unused) {
                            abc.warn("failed to close /proc/meminfo file");
                            return -1;
                        }
                    } finally {
                        return -1;
                    }
                } catch (NumberFormatException e5) {
                    abc.warn("failed to parse mem info: " + e5.getMessage());
                    bufferedReader.close();
                    return -1;
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                    abc.warn("failed to close /proc/meminfo file");
                }
            }
        }
        if (sb.length() == 0) {
            return -1;
        }
        int parseInt = Integer.parseInt(sb.toString());
        try {
            bufferedReader.close();
        } catch (IOException unused3) {
            abc.warn("failed to close /proc/meminfo file");
        }
        return parseInt;
    }

    public static long abc() {
        long[] jArr = new long[2];
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getCanonicalPath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getCanonicalPath());
            jArr[0] = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            long availableBlocksLong = statFs2.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            jArr[1] = availableBlocksLong;
            if (jArr[0] < 0) {
                jArr[0] = 0;
            }
            if (availableBlocksLong < 0) {
                jArr[1] = 0;
            }
        } catch (Throwable th) {
            try {
                abc.warn("can not get available disk size: " + th.getMessage());
            } finally {
                if (jArr[0] < 0) {
                    jArr[0] = 0;
                }
                if (jArr[1] < 0) {
                    jArr[1] = 0;
                }
            }
        }
        return jArr[0] + jArr[1];
    }
}
