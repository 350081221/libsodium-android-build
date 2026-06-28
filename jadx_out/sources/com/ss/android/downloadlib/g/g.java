package com.ss.android.downloadlib.g;

import java.io.File;

/* loaded from: classes3.dex */
public class g {
    public static long a(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return a(file, file.lastModified(), 0);
    }

    private static long a(File file, long j5, int i5) {
        File[] listFiles;
        if (file != null && file.exists()) {
            j5 = Math.max(j5, file.lastModified());
            int i6 = i5 + 1;
            if (i6 >= 50) {
                return j5;
            }
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    j5 = Math.max(j5, a(file2, j5, i6));
                }
            }
        }
        return j5;
    }
}
