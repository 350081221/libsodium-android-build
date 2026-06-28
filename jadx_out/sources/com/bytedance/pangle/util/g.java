package com.bytedance.pangle.util;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    static String f4644a = null;

    /* renamed from: b, reason: collision with root package name */
    static String f4645b = null;

    /* renamed from: c, reason: collision with root package name */
    static int f4646c = 8192;

    public static void a(String str) {
        a(new File(str));
    }

    public static String b(Context context) {
        File parentFile;
        if (f4645b == null && (parentFile = context.getCacheDir().getParentFile()) != null) {
            try {
                f4645b = parentFile.getCanonicalPath();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return f4645b;
    }

    public static void a(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        file.delete();
    }

    public static void b(String str, String str2) {
        ZipInputStream zipInputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!name.contains("..")) {
                            if (nextEntry.isDirectory()) {
                                new File(str2 + File.separator + name).mkdirs();
                            } else {
                                File file = new File(str2 + File.separator + name);
                                if (file.exists()) {
                                    file.delete();
                                } else {
                                    file.getParentFile().mkdirs();
                                }
                                file.createNewFile();
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        } else {
                                            bufferedOutputStream2.write(bArr, 0, read);
                                        }
                                    }
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                    bufferedOutputStream = bufferedOutputStream2;
                                } catch (Exception e5) {
                                    e = e5;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    a(bufferedOutputStream);
                                    a(zipInputStream);
                                    throw e;
                                }
                            }
                        }
                    } else {
                        zipInputStream.close();
                        return;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            }
        } catch (Exception e7) {
            e = e7;
            zipInputStream = null;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String a(Context context) {
        File parentFile;
        if (f4644a == null && (parentFile = context.getCacheDir().getParentFile()) != null) {
            f4644a = parentFile.getAbsolutePath();
        }
        return f4644a;
    }

    public static void a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists()) {
            if (file.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file2.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null || listFiles.length == 0) {
                        return;
                    }
                    for (File file3 : listFiles) {
                        String str3 = file2 + File.separator + file3.getName();
                        if (file3.isDirectory()) {
                            a(file3.getAbsolutePath(), str3);
                        } else if (!new File(str3).exists()) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file3));
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                            byte[] bArr = new byte[f4646c];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                            }
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                        }
                    }
                    return;
                }
                throw new Exception("目标文件夹不是目录");
            }
            throw new Exception("源文件夹不是目录");
        }
        throw new Exception("文件夹不存在");
    }

    public static boolean b(File file) {
        FileInputStream fileInputStream = null;
        if (file == null) {
            a((Closeable) null);
            return false;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[6];
                if (fileInputStream2.read(bArr) != 6) {
                    a(fileInputStream2);
                    return false;
                }
                byte[] bArr2 = {80, 75, 3, 4};
                for (int i5 = 0; i5 < 4; i5++) {
                    if (bArr2[i5] != bArr[i5]) {
                        a(fileInputStream2);
                        return false;
                    }
                }
                byte b5 = bArr[4];
                if (b5 == 0 && bArr[5] == 0) {
                    a(fileInputStream2);
                    return false;
                }
                if (b5 == 20) {
                    if (bArr[5] == 3) {
                        a(fileInputStream2);
                        return true;
                    }
                }
                a(fileInputStream2);
                return false;
            } catch (Throwable unused) {
                fileInputStream = fileInputStream2;
                a(fileInputStream);
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, long j5, long j6, String str) {
        byte[] bArr;
        long j7 = 0;
        if (j5 < 0 || j6 < 0 || j5 > j6) {
            throw new IOException("invalid offsets  ".concat(String.valueOf(str)));
        }
        if (j5 == j6) {
            return;
        }
        randomAccessFile.seek(j5);
        long j8 = j6 - j5;
        int i5 = f4646c;
        if (j8 < i5) {
            bArr = new byte[(int) j8];
        } else {
            bArr = new byte[i5];
        }
        while (true) {
            int read = randomAccessFile.read(bArr);
            if (read == -1) {
                return;
            }
            randomAccessFile2.write(bArr, 0, read);
            j7 += read;
            if (j7 == j8) {
                return;
            }
            if (bArr.length + j7 > j8) {
                bArr = new byte[(int) (j8 - j7)];
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    return;
                }
            }
        } finally {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }
    }
}
