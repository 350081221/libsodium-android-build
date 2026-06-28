package com.huawei.secure.android.common.ssl.util;

import android.database.Cursor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9029a = "IOUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9030b = 4096;

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return b(inputStream, outputStream, new byte[4096]);
    }

    public static long b(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
                j5 += read;
            } else {
                return j5;
            }
        }
    }

    public static InputStream c(byte[] bArr) throws IOException {
        return new ByteArrayInputStream(bArr);
    }

    public static void d(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                i.d(f9029a, "closeSecure IOException");
            }
        }
    }

    public static void f(File file) {
        if (file != null && file.exists() && !file.delete()) {
            i.d(f9029a, "deleteSecure exception");
        }
    }

    public static void g(InputStream inputStream) {
        e(inputStream);
    }

    public static void h(OutputStream outputStream) {
        e(outputStream);
    }

    public static void i(Reader reader) {
        e(reader);
    }

    public static void j(Writer writer) {
        e(writer);
    }

    public static void k(String str) {
        if (!TextUtils.isEmpty(str)) {
            f(new File(str));
        }
    }

    public static byte[] l(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
