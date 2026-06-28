package com.lody.virtual.helper;

import com.lody.virtual.helper.utils.VLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class ApkLibraryHelper {
    public static final int INSTALL_FAILED_INVALID_APK = -2;
    public static final int INSTALL_FAILED_NO_MATCHING_ABIS = -113;
    public static final int INSTALL_SUCCEEDED = 1;
    public static final int NO_NATIVE_LIBRARIES = -114;
    private ZipFile apkFile;
    public static final String[] DEFAULT_SUPPORTED_ABI_32BIT = {"armeabi", "armeabi-v7a"};
    public static final String[] DEFAULT_SUPPORTED_ABI_64BIT = {"arm64-v8a"};
    public static final String[] ABI_32BIT = {"armeabi", "armeabi-v7a", "x86"};
    public static final String[] ABI_64BIT = {"arm64-v8a", "x86_64"};

    public ApkLibraryHelper(File file) {
        try {
            this.apkFile = new ZipFile(file, 1);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public int copyNativeBinaries(File file, String str) {
        ZipFile zipFile = this.apkFile;
        if (zipFile == null) {
            return -2;
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        byte[] bArr = new byte[8192];
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory()) {
                String name = nextElement.getName();
                String str2 = "lib/" + str + "/";
                if (name.startsWith(str2)) {
                    File file2 = new File(file, name.substring(str2.length()));
                    VLog.e("ApkLibraryHelper", "Writing: " + file2);
                    try {
                        file2.createNewFile();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                        InputStream inputStream = this.apkFile.getInputStream(nextElement);
                        while (true) {
                            int read = inputStream.read(bArr, 0, 100);
                            if (read <= 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    continue;
                }
            }
        }
        return 1;
    }

    public int findSupportedAbi(String[] strArr) {
        ZipFile zipFile = this.apkFile;
        if (zipFile == null) {
            return -2;
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        int i5 = -114;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory()) {
                String name = nextElement.getName();
                if (name.startsWith("lib/")) {
                    for (int i6 = 0; i6 < strArr.length; i6++) {
                        if (name.startsWith("lib/" + strArr[i6])) {
                            return i6;
                        }
                    }
                } else {
                    continue;
                }
            }
            i5 = -113;
        }
        return i5;
    }
}
