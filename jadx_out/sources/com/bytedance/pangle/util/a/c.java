package com.bytedance.pangle.util.a;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipFile;
import kotlin.m2;

/* loaded from: classes2.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, int i5) {
        if (i5 >= 0 && i5 <= 65535) {
            long length = randomAccessFile.length();
            if (length < 22) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i5, length - 22)) + 22);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            int b5 = b(allocate);
            if (b5 == -1) {
                return null;
            }
            allocate.position(b5);
            ByteBuffer slice = allocate.slice();
            slice.order(byteOrder);
            return Pair.create(slice, Long.valueOf(capacity + b5));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i5)));
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i5 = capacity - 22;
        int min = Math.min(i5, 65535);
        for (int i6 = 0; i6 <= min; i6++) {
            int i7 = i5 - i6;
            if (byteBuffer.getInt(i7) == 101010256 && (byteBuffer.getShort(i7 + 20) & m2.f19496d) == i6) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(ByteBuffer byteBuffer, int i5) {
        return byteBuffer.getInt(i5) & 4294967295L;
    }

    public static void a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (Throwable unused) {
        }
    }
}
