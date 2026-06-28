package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9074a = "ZipUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9075b = 104857600;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9076c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9077d = 4096;

    /* renamed from: e, reason: collision with root package name */
    private static final String f9078e = "..";

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f9079f = {"..\\", "../", "./", ".\\.\\", "%00", "..%2F", "..%5C", ".%2F"};

    /* JADX WARN: Code restructure failed: missing block: B:102:0x006c, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.m.f9074a, "zipPath is a invalid path: " + l(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0084, code lost:
    
        r21 = r10;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.m.f9074a, "unzipFileNew: over than top size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r9 = false;
        r11 = false;
        r21 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable, java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.io.File> a(java.io.File r16, java.io.File r17, long r18, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.util.m.a(java.io.File, java.io.File, long, boolean, boolean):java.util.List");
    }

    private static void b(FileInputStream fileInputStream, BufferedOutputStream bufferedOutputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        d.c(fileInputStream);
        d.d(bufferedOutputStream);
        d.c(zipInputStream);
        d.d(fileOutputStream);
    }

    private static void c(String str) {
        if (!TextUtils.isEmpty(str) && o(str)) {
            Log.e(f9074a, "IllegalArgumentException--path is not a standard path");
            throw new IllegalArgumentException("path is not a standard path");
        }
    }

    private static boolean d(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    @RequiresApi(api = 24)
    private static boolean e(String str, long j5, int i5, boolean z4) {
        ZipFile zipFile;
        ZipEntry nextElement;
        ZipFile zipFile2 = null;
        boolean z5 = false;
        try {
            try {
                try {
                    if (!z4) {
                        zipFile = new ZipFile(str);
                    } else {
                        e.r(f9074a, "not a utf8 zip file, use gbk open zip file : " + str);
                        zipFile = new ZipFile(str, Charset.forName("GBK"));
                    }
                    ZipFile zipFile3 = zipFile;
                    Enumeration<? extends ZipEntry> entries = zipFile3.entries();
                    long j6 = 0;
                    int i6 = 0;
                    do {
                        if (entries.hasMoreElements()) {
                            try {
                                nextElement = entries.nextElement();
                                j6 += nextElement.getSize();
                                i6++;
                                if (o(nextElement.getName()) || i6 >= i5 || j6 > j5) {
                                    break;
                                }
                            } catch (IllegalArgumentException e5) {
                                e.r(f9074a, "not a utf8 zip file, IllegalArgumentException : " + e5.getMessage());
                                z5 = e(str, j5, i5, true);
                            }
                        } else {
                            z5 = true;
                            break;
                        }
                    } while (nextElement.getSize() != -1);
                    e.l(f9074a, "File name is invalid or too many files or too big");
                    zipFile3.close();
                } catch (IOException unused) {
                    e.l(f9074a, "close zipFile IOException ");
                }
            } catch (IOException e6) {
                e.l(f9074a, "not a valid zip file, IOException : " + e6.getMessage());
                if (0 != 0) {
                    zipFile2.close();
                }
            }
            return z5;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    zipFile2.close();
                } catch (IOException unused2) {
                    e.l(f9074a, "close zipFile IOException ");
                }
            }
            throw th;
        }
    }

    private static boolean f(String str, String str2, long j5, int i5) throws k {
        if (!TextUtils.isEmpty(str) && !o(str)) {
            if (!TextUtils.isEmpty(str2) && !o(str2)) {
                if (e(str, j5, i5, false)) {
                    return true;
                }
                e.l(f9074a, "zip file contains valid chars or too many files");
                throw new k("unsecure zipfile!");
            }
            e.l(f9074a, "target directory is not valid");
            return false;
        }
        e.l(f9074a, "zip file is not valid");
        return false;
    }

    private static boolean g(List<File> list) {
        try {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                n(it.next());
            }
            return true;
        } catch (Exception e5) {
            e.l(f9074a, "unzip fail delete file failed" + e5.getMessage());
            return false;
        }
    }

    private static File h(String str) {
        c(str);
        return new File(str);
    }

    private static boolean i(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!d(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            Log.e(f9074a, "createOrExistsFile IOException ");
            return false;
        }
    }

    private static File j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return h(str);
    }

    private static void k(File file) {
        if (file != null && !file.delete()) {
            e.l(f9074a, "delete file error");
        }
    }

    private static String l(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }

    private static void m(File file) {
        if (file != null && !file.exists() && !file.mkdirs()) {
            e.l(f9074a, "mkdirs error , files exists or IOException.");
        }
    }

    private static void n(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            k(file);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    n(file2);
                }
                k(file);
                return;
            }
            k(file);
        }
    }

    private static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f9074a, "isContainInvalidStr: name is null");
            return false;
        }
        if (str.equals(f9078e)) {
            return true;
        }
        for (String str2 : f9079f) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.m.f9074a, "unzip  over than top size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d3, code lost:
    
        r2 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x006d, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.m.f9074a, "zipPath is a invalid path: " + l(r13));
        r2 = r3;
        r10 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(java.lang.String r17, java.lang.String r18, long r19, int r21, boolean r22) throws com.huawei.secure.android.common.util.k {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.util.m.p(java.lang.String, java.lang.String, long, int, boolean):boolean");
    }

    @Deprecated
    public static boolean q(String str, String str2, boolean z4) throws k {
        return p(str, str2, 104857600L, 100, z4);
    }

    public static List<File> r(String str, String str2, long j5, int i5, boolean z4) throws k {
        if (!f(str, str2, j5, i5)) {
            return null;
        }
        String str3 = File.separator;
        if (str2.endsWith(str3) && str2.length() > str3.length()) {
            str2 = str2.substring(0, str2.length() - str3.length());
        }
        return a(j(str), j(str2), j5, z4, false);
    }

    public static List<File> s(String str, String str2, boolean z4) throws k {
        return r(str, str2, 104857600L, 100, z4);
    }
}
