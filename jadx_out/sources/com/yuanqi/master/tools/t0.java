package com.yuanqi.master.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.bi;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rJ\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002J*\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rJ \u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/yuanqi/master/tools/FileUtil;", "", "()V", "TAG", "", "copyAndZipVirtualFolder", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "action", "Lkotlin/Function0;", "copyDirectoryRecursively", "sourceDir", "Ljava/io/File;", "targetDir", "deleteDirectory", "", "directory", "deleteFolder", "file", "shouldSkipFile", "zis", "Ljava/util/zip/ZipInputStream;", "existingFile", "unzipFile", "zipFile", "Lkotlin/Function1;", "uriToFile", "uri", "Landroid/net/Uri;", "write", bi.ae, "Ljava/io/InputStream;", bi.f12278x, "Ljava/io/OutputStream;", "writeToFile", "buffer", "", "zipDirectory", "rootDir", "currentDir", "zos", "Ljava/util/zip/ZipOutputStream;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\ncom/yuanqi/master/tools/FileUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n13309#2,2:280\n13309#2:282\n13310#2:284\n13309#2,2:285\n1#3:283\n*S KotlinDebug\n*F\n+ 1 FileUtil.kt\ncom/yuanqi/master/tools/FileUtil\n*L\n34#1:280,2\n60#1:282\n60#1:284\n83#1:285,2\n*E\n"})
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final t0 f15250a = new t0();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final String f15251b = "FileUtil";

    /* renamed from: c, reason: collision with root package name */
    public static final int f15252c = 0;

    private t0() {
    }

    private final boolean e(ZipInputStream zipInputStream, File file) {
        byte[] v4;
        v4 = kotlin.io.o.v(file);
        return Arrays.equals(v4, kotlin.io.b.p(zipInputStream));
    }

    private final void h(InputStream inputStream, OutputStream outputStream) {
        int read;
        byte[] bArr = new byte[1048576];
        while (true) {
            try {
                read = inputStream.read(bArr);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                try {
                    outputStream.flush();
                    inputStream.close();
                    outputStream.close();
                    return;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return;
                }
            }
        }
    }

    private final void i(ZipInputStream zipInputStream, File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            try {
                int read = zipInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    r2 r2Var = r2.f19517a;
                    kotlin.io.c.a(fileOutputStream, null);
                    return;
                }
            } finally {
            }
        }
    }

    private final void k(File file, File file2, ZipOutputStream zipOutputStream) {
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                String path = file3.getPath();
                kotlin.jvm.internal.l0.o(path, "getPath(...)");
                String substring = path.substring(file.getPath().length() + 1);
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
                if (file3.isDirectory()) {
                    t0 t0Var = f15250a;
                    kotlin.jvm.internal.l0.m(file3);
                    t0Var.k(file, file3, zipOutputStream);
                } else {
                    zipOutputStream.putNextEntry(new ZipEntry(substring));
                    FileInputStream fileInputStream = new FileInputStream(file3);
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    zipOutputStream.write(bArr, 0, read);
                                }
                            }
                            r2 r2Var = r2.f19517a;
                            kotlin.io.c.a(bufferedInputStream, null);
                            kotlin.io.c.a(fileInputStream, null);
                            zipOutputStream.closeEntry();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                kotlin.io.c.a(bufferedInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            kotlin.io.c.a(fileInputStream, th3);
                            throw th4;
                        }
                    }
                }
            }
        }
    }

    public final void a(@p4.l Context context, @p4.l v3.a<r2> action) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(action, "action");
        String str = context.getFilesDir().getParent() + "/virtual";
        String str2 = "/storage/emulated/0/YQDK_Backup_" + f1.d();
        String str3 = str2 + ".zip";
        File file = new File(str);
        File file2 = new File(str2);
        File file3 = new File(str3);
        b(file, file2);
        if (file2.exists()) {
            j(file2, file3);
            if (c(file2)) {
                System.out.println((Object) ("目标文件夹已删除: " + str2));
                action.invoke();
            } else {
                System.out.println((Object) ("删除目标文件夹失败: " + str2));
            }
        } else {
            System.out.println((Object) ("目标文件夹不存在: " + str2));
        }
        System.out.println((Object) ("文件夹已压缩为: " + str3));
    }

    public final void b(@p4.l File sourceDir, @p4.l File targetDir) {
        kotlin.jvm.internal.l0.p(sourceDir, "sourceDir");
        kotlin.jvm.internal.l0.p(targetDir, "targetDir");
        if (!sourceDir.exists()) {
            System.out.println((Object) ("源目录不存在: " + sourceDir.getPath()));
            return;
        }
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        File[] listFiles = sourceDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                File file2 = new File(targetDir, file.getName());
                if (file.isDirectory()) {
                    t0 t0Var = f15250a;
                    kotlin.jvm.internal.l0.m(file);
                    t0Var.b(file, file2);
                } else {
                    try {
                        kotlin.jvm.internal.l0.m(file);
                        kotlin.io.q.Q(file, file2, true, 0, 4, null);
                        System.out.println((Object) ("文件已复制: " + file.getPath() + " -> " + file2.getPath()));
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        System.out.println((Object) ("复制文件失败: " + file.getPath()));
                    }
                }
            }
        }
    }

    public final boolean c(@p4.l File directory) {
        File[] listFiles;
        kotlin.jvm.internal.l0.p(directory, "directory");
        if (directory.isDirectory() && (listFiles = directory.listFiles()) != null) {
            for (File file : listFiles) {
                t0 t0Var = f15250a;
                kotlin.jvm.internal.l0.m(file);
                if (!t0Var.c(file)) {
                    return false;
                }
            }
        }
        return directory.delete();
    }

    public final void d(@p4.l File file) {
        File[] listFiles;
        kotlin.jvm.internal.l0.p(file, "file");
        try {
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    kotlin.jvm.internal.l0.m(file2);
                    d(file2);
                }
            }
            file.delete();
        } catch (IOException e5) {
            Log.d("test", "删除异常" + e5);
        }
    }

    public final void f(@p4.l File zipFile, @p4.l File targetDir, @p4.l v3.l<? super String, r2> action) {
        kotlin.jvm.internal.l0.p(zipFile, "zipFile");
        kotlin.jvm.internal.l0.p(targetDir, "targetDir");
        kotlin.jvm.internal.l0.p(action, "action");
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        try {
            byte[] bArr = new byte[1024];
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFile)));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        kotlin.jvm.internal.l0.m(nextEntry);
                        File file = new File(targetDir, nextEntry.getName());
                        if (nextEntry.isDirectory()) {
                            file.mkdirs();
                        } else {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            if (file.exists()) {
                                t0 t0Var = f15250a;
                                if (!t0Var.e(zipInputStream, file)) {
                                    t0Var.i(zipInputStream, file, bArr);
                                }
                            } else {
                                f15250a.i(zipInputStream, file, bArr);
                            }
                        }
                        zipInputStream.closeEntry();
                    } else {
                        r2 r2Var = r2.f19517a;
                        kotlin.io.c.a(zipInputStream, null);
                        action.invoke("恢复完成，请重启应用");
                        return;
                    }
                } finally {
                }
            }
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message != null) {
                action.invoke("恢复失败：" + message);
            }
        }
    }

    @p4.m
    public final String g(@p4.m Uri uri, @p4.l Context context) {
        int D3;
        kotlin.jvm.internal.l0.p(context, "context");
        if (uri == null) {
            Log.d(f15251b, "uri is null.");
            return null;
        }
        if (uri.getPath() == null) {
            Log.d(f15251b, "getPath is null.");
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        kotlin.jvm.internal.l0.o(contentResolver, "getContentResolver(...)");
        String path = uri.getPath();
        String str = f15251b;
        Log.d(str, "uriToFile: " + path);
        kotlin.jvm.internal.l0.m(path);
        D3 = kotlin.text.f0.D3(path, "/", 0, false, 6, null);
        String substring = path.substring(D3 + 1);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
        Log.d(str, "uriToFile: " + substring);
        String path2 = Environment.getExternalStorageDirectory().getPath();
        Log.d(str, "uriToFile: " + path2);
        File file = new File(path2, substring);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            Log.d(str, "uriToFile: 文件已存在");
            return "文件已存在";
        }
        try {
            file.createNewFile();
            InputStream openInputStream = contentResolver.openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            if (openInputStream != null) {
                h(openInputStream, fileOutputStream);
                Log.d(str, "uriToFile: 写入数据");
                return "文件保存到本地，恢复时可以直接使用。";
            }
            return "文件保存到本地，恢复时可以直接使用。";
        } catch (IOException e5) {
            e5.printStackTrace();
            Log.e(f15251b, "uriToFile: " + e5.getMessage());
            return "错误异常：" + e5.getMessage();
        }
    }

    public final void j(@p4.l File directory, @p4.l File zipFile) {
        kotlin.jvm.internal.l0.p(directory, "directory");
        kotlin.jvm.internal.l0.p(zipFile, "zipFile");
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)));
        try {
            f15250a.k(directory, directory, zipOutputStream);
            r2 r2Var = r2.f19517a;
            kotlin.io.c.a(zipOutputStream, null);
        } finally {
        }
    }
}
