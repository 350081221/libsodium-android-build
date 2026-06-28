package com.swift.sandhook.utils;

import android.system.Os;
import android.text.TextUtils;
import com.swift.sandhook.HookLog;
import com.swift.sandhook.SandHookConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FileUtils {
    public static final boolean IS_USING_PROTECTED_STORAGE = true;

    /* loaded from: classes3.dex */
    public interface FileMode {
        public static final int MODE_755 = 493;
        public static final int MODE_IRGRP = 32;
        public static final int MODE_IROTH = 4;
        public static final int MODE_IRUSR = 256;
        public static final int MODE_ISGID = 1024;
        public static final int MODE_ISUID = 2048;
        public static final int MODE_ISVTX = 512;
        public static final int MODE_IWGRP = 16;
        public static final int MODE_IWOTH = 2;
        public static final int MODE_IWUSR = 128;
        public static final int MODE_IXGRP = 8;
        public static final int MODE_IXOTH = 1;
        public static final int MODE_IXUSR = 64;
    }

    public static void chmod(String str, int i5) throws Exception {
        if (SandHookConfig.SDK_INT >= 21) {
            try {
                Os.chmod(str, i5);
                return;
            } catch (Exception unused) {
            }
        }
        String str2 = "chmod ";
        if (new File(str).isDirectory()) {
            str2 = "chmod  -R ";
        }
        String format = String.format("%o", Integer.valueOf(i5));
        Runtime.getRuntime().exec(str2 + format + " " + str).waitFor();
    }

    public static void delete(File file) throws IOException {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                delete(file2);
            } else if (!file2.delete()) {
                throw new IOException();
            }
        }
        if (!file.delete()) {
            throw new IOException();
        }
    }

    public static String getDataPathPrefix() {
        return IS_USING_PROTECTED_STORAGE ? "/data/user_de/0/" : "/data/data/";
    }

    public static String getPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            HookLog.e("getPackageName using empty dataDir");
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String readLine(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void writeLine(File file, String str) {
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            } finally {
            }
        } catch (Throwable th) {
            HookLog.e("error writing line to file " + file + ": " + th.getMessage());
        }
    }
}
