package com.bytedance.pangle.res.a;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class d {
    private static <T> T a(T t5) {
        t5.getClass();
        return t5;
    }

    public static void a(InputStream inputStream, byte[] bArr, int i5, int i6) {
        a(inputStream);
        a(bArr);
        int i7 = 0;
        if (i6 >= 0) {
            int i8 = i5 + i6;
            int length = bArr.length;
            if (i5 < 0 || i8 < i5 || i8 > length) {
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append(i8);
                sb.append(length);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            while (i7 < i6) {
                int read = inputStream.read(bArr, i5 + i7, i6 - i7);
                if (read == -1) {
                    break;
                } else {
                    i7 += read;
                }
            }
            if (i7 == i6) {
                return;
            }
            throw new EOFException("reached end of stream after reading " + i7 + " bytes; " + i6 + " bytes expected");
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i6)));
    }
}
