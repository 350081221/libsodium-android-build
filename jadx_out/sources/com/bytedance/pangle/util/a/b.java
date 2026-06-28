package com.bytedance.pangle.util.a;

import com.bytedance.pangle.util.f;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f4618a = "";

    public static String[] a(File file) {
        String str;
        ByteBuffer b5;
        boolean z4;
        String str2 = "";
        try {
            b5 = b(file);
        } catch (Exception unused) {
            str = "";
        }
        if (b5.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer a5 = a(b5, b5.capacity() - 24);
            int i5 = 0;
            while (a5.hasRemaining()) {
                i5++;
                if (a5.remaining() >= 8) {
                    long j5 = a5.getLong();
                    if (j5 >= 4 && j5 <= 2147483647L) {
                        int i6 = (int) j5;
                        int position = a5.position() + i6;
                        if (i6 <= a5.remaining()) {
                            int i7 = a5.getInt();
                            if (i7 == -262969152) {
                                f4618a = "V3";
                            } else if (i7 == 1896449818) {
                                f4618a = "V2";
                            } else {
                                a5.position(position);
                            }
                            z4 = true;
                            break;
                        }
                        throw new Exception("APK Signing Block entry #" + i5 + " size out of range: " + i6 + ", available: " + a5.remaining());
                    }
                    throw new Exception("APK Signing Block entry #" + i5 + " size out of range: " + j5);
                }
                throw new Exception("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i5)));
            }
            z4 = false;
            if (z4) {
                str2 = f.a(b5.array());
                str = "";
            } else {
                str = "without v2 & v3 signature.";
            }
            return new String[]{str2, f4618a, str};
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:5:0x0008, B:9:0x0024, B:11:0x003a, B:15:0x004b, B:17:0x005d, B:21:0x0075, B:23:0x00a8, B:25:0x00b5, B:29:0x00c9, B:31:0x00d3, B:33:0x00f4, B:37:0x0104, B:38:0x011f, B:39:0x0120, B:40:0x012f, B:41:0x0130, B:42:0x013f, B:43:0x0140, B:44:0x0147, B:45:0x0148, B:46:0x0157, B:47:0x0158, B:48:0x015f, B:49:0x0160, B:50:0x017b, B:51:0x017c, B:52:0x0183, B:54:0x0184, B:55:0x018b, B:56:0x0014, B:59:0x001b), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:5:0x0008, B:9:0x0024, B:11:0x003a, B:15:0x004b, B:17:0x005d, B:21:0x0075, B:23:0x00a8, B:25:0x00b5, B:29:0x00c9, B:31:0x00d3, B:33:0x00f4, B:37:0x0104, B:38:0x011f, B:39:0x0120, B:40:0x012f, B:41:0x0130, B:42:0x013f, B:43:0x0140, B:44:0x0147, B:45:0x0148, B:46:0x0157, B:47:0x0158, B:48:0x015f, B:49:0x0160, B:50:0x017b, B:51:0x017c, B:52:0x0183, B:54:0x0184, B:55:0x018b, B:56:0x0014, B:59:0x001b), top: B:4:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.nio.ByteBuffer b(java.io.File r13) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.util.a.b.b(java.io.File):java.nio.ByteBuffer");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i5) {
        if (i5 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i5 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i5);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            throw new IllegalArgumentException("end > capacity: " + i5 + " > " + capacity);
        }
        throw new IllegalArgumentException("end < start: " + i5 + " < 8");
    }
}
