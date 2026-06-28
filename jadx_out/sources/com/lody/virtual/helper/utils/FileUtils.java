package com.lody.virtual.helper.utils;

import android.content.Context;
import android.os.Parcel;
import android.system.Os;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.y1;

/* loaded from: classes3.dex */
public class FileUtils {

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

    public static String buildValidExtFilename(String str) {
        if (!TextUtils.isEmpty(str) && !".".equals(str) && !"..".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i5 = 0; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (isValidExtFilenameChar(charAt)) {
                    sb.append(charAt);
                } else {
                    sb.append('_');
                }
            }
            return sb.toString();
        }
        return "(invalid)";
    }

    public static boolean canRead(String str) {
        return new File(str).canRead();
    }

    public static File changeExt(File file, String str) {
        String str2;
        String absolutePath = file.getAbsolutePath();
        if (!getFilenameExt(absolutePath).equals(str)) {
            int lastIndexOf = absolutePath.lastIndexOf(".");
            if (lastIndexOf > 0) {
                str2 = absolutePath.substring(0, lastIndexOf + 1) + str;
            } else {
                str2 = absolutePath + "." + str;
            }
            return new File(str2);
        }
        return file;
    }

    public static void chmod(String str, int i5) {
        try {
            Os.chmod(str, i5);
        } catch (Exception unused) {
            String str2 = "chmod ";
            if (new File(str).isDirectory()) {
                str2 = "chmod  -R ";
            }
            String format = String.format("%o", Integer.valueOf(i5));
            try {
                Runtime.getRuntime().exec(str2 + format + " " + str).waitFor();
            } catch (IOException | InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream;
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream2.getChannel();
                    FileChannel channel2 = fileOutputStream.getChannel();
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    while (true) {
                        allocate.clear();
                        if (channel.read(allocate) == -1) {
                            closeQuietly(fileInputStream2);
                            closeQuietly(fileOutputStream);
                            return;
                        } else {
                            allocate.limit(allocate.position());
                            allocate.position(0);
                            channel2.write(allocate);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void copyFileFromAssets(Context context, String str, File file) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream open = context.getResources().getAssets().open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            closeQuietly(open);
                            closeQuietly(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = open;
                    closeQuietly(inputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void copyTo(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read > 0) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                return;
            }
        }
    }

    public static void createSymlink(String str, String str2) throws Exception {
        Os.symlink(str, str2);
    }

    public static void deleteDir(File file) {
        boolean z4;
        String[] list;
        if (file.isDirectory()) {
            try {
                z4 = isSymlink(file);
            } catch (Exception unused) {
                z4 = false;
            }
            if (!z4 && (list = file.list()) != null) {
                for (String str : list) {
                    deleteDir(new File(file, str));
                }
            }
        }
        file.delete();
    }

    public static boolean ensureDirCreate(File file) {
        return file.exists() || file.mkdirs();
    }

    public static long fileSize(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public static String getFilenameExt(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static boolean isExist(String str) {
        return new File(str).exists();
    }

    public static boolean isSymlink(File file) throws IOException {
        if (file != null) {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
        throw new NullPointerException("File must not be null");
    }

    public static boolean isValidExtFilename(String str) {
        return str != null && str.equals(buildValidExtFilename(str));
    }

    private static boolean isValidExtFilenameChar(char c5) {
        return (c5 == 0 || c5 == '/') ? false : true;
    }

    public static void linkDir(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File[] listFiles = file.listFiles();
        if (!ArrayUtils.isEmpty(listFiles)) {
            for (File file3 : listFiles) {
                try {
                    Runtime.getRuntime().exec(String.format("ln -s %s %s", file3.getAbsoluteFile(), new File(file2, file3.getName()).getAbsolutePath())).waitFor();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static int peekInt(byte[] bArr, int i5, ByteOrder byteOrder) {
        int i6;
        int i7;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            int i8 = i5 + 1;
            int i9 = i8 + 1;
            i6 = ((bArr[i5] & y1.f19838d) << 24) | ((bArr[i8] & y1.f19838d) << 16) | ((bArr[i9] & y1.f19838d) << 8);
            i7 = bArr[i9 + 1] & y1.f19838d;
        } else {
            int i10 = i5 + 1;
            int i11 = i10 + 1;
            i6 = (bArr[i5] & y1.f19838d) | ((bArr[i10] & y1.f19838d) << 8) | ((bArr[i11] & y1.f19838d) << 16);
            i7 = (bArr[i11 + 1] & y1.f19838d) << 24;
        }
        return i7 | i6;
    }

    public static String readToString(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                byteArrayOutputStream.write(read);
            } else {
                return byteArrayOutputStream.toString();
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void writeParcelToFile(Parcel parcel, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(parcel.marshall());
        fileOutputStream.close();
    }

    public static void writeToFile(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        bufferedOutputStream.close();
                        return;
                    }
                }
            } catch (IOException e5) {
                throw e5;
            }
        } finally {
            closeQuietly(bufferedOutputStream);
        }
    }

    public static boolean ensureDirCreate(File... fileArr) {
        boolean z4 = true;
        for (File file : fileArr) {
            if (!ensureDirCreate(file)) {
                z4 = false;
            }
        }
        return z4;
    }

    public static void deleteDir(String str) {
        deleteDir(new File(str));
    }

    public static void writeToFile(byte[] bArr, File file) throws IOException {
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannel2 = null;
        fileOutputStream = null;
        try {
            readableByteChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileChannel2 = fileOutputStream2.getChannel();
                    fileChannel2.transferFrom(readableByteChannel, 0L, bArr.length);
                    fileOutputStream2.close();
                    if (readableByteChannel != null) {
                        readableByteChannel.close();
                    }
                    fileChannel2.close();
                } catch (Throwable th) {
                    th = th;
                    fileChannel = fileChannel2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (readableByteChannel != null) {
                        readableByteChannel.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannel = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
            readableByteChannel = null;
        }
    }
}
