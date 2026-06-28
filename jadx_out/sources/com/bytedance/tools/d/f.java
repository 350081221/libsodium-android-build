package com.bytedance.tools.d;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class f {
    public static File a(String str, String str2) {
        ZipOutputStream zipOutputStream;
        IOException e5;
        File file;
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                File file2 = new File(str);
                file = new File(file2.getParentFile(), str2);
                try {
                    if (file2.exists() && file2.isDirectory()) {
                        zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                        try {
                            try {
                                for (File file3 : file2.listFiles()) {
                                    zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                                    d(zipOutputStream, file3);
                                    zipOutputStream.closeEntry();
                                }
                                zipOutputStream.flush();
                                zipOutputStream2 = zipOutputStream;
                            } catch (IOException e6) {
                                e5 = e6;
                                Log.w("TT_TOOLS", e5);
                                b(zipOutputStream);
                                return file;
                            }
                        } catch (Throwable th) {
                            th = th;
                            zipOutputStream2 = zipOutputStream;
                            b(zipOutputStream2);
                            throw th;
                        }
                    }
                    b(zipOutputStream2);
                } catch (IOException e7) {
                    e5 = e7;
                    zipOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                b(zipOutputStream2);
                throw th;
            }
        } catch (IOException e8) {
            zipOutputStream = null;
            e5 = e8;
            file = null;
        }
        return file;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                Log.w("TT_TOOLS", e5);
            }
        }
    }

    public static void c(File file) {
        if (file.isDirectory()) {
            e(file);
        } else {
            file.delete();
        }
    }

    public static void d(OutputStream outputStream, File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
        } catch (IOException e6) {
            e = e6;
        }
        try {
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    b(fileInputStream);
                    return;
                }
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            fileInputStream2 = fileInputStream;
            Log.w("TT_TOOLS", e);
            b(fileInputStream2);
        } catch (IOException e8) {
            e = e8;
            fileInputStream2 = fileInputStream;
            Log.w("TT_TOOLS", e);
            b(fileInputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            b(fileInputStream2);
            throw th;
        }
    }

    private static void e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                c(file2);
            }
        }
    }
}
