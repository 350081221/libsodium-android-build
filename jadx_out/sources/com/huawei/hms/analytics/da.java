package com.huawei.hms.analytics;

import com.android.multidex.ClassPathElement;
import java.nio.charset.Charset;
import okio.q1;

/* loaded from: classes3.dex */
public final class da {
    private static final char[] lmn = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', ClassPathElement.SEPARATOR_CHAR, o0.a.f20835h};
    private static final byte[] klm = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, q1.f21021a, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.a.f19277h, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, com.umeng.analytics.pro.cx.f12475k, com.umeng.analytics.pro.cx.f12476l, com.umeng.analytics.pro.cx.f12477m, com.umeng.analytics.pro.cx.f12478n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static String klm(String str) {
        try {
            byte[] lmn2 = lmn(str);
            return lmn2.length == 0 ? "" : new String(lmn2, Charset.forName("UTF-8"));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] lmn(String str) {
        int length = str.length();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt > 255 || klm[charAt] < 0) {
                length--;
            }
        }
        int i6 = (length / 4) * 3;
        int i7 = length % 4;
        if (i7 == 3) {
            i6 += 2;
        }
        if (i7 == 2) {
            i6++;
        }
        byte[] bArr = new byte[i6];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt2 = str.charAt(i11);
            byte b5 = charAt2 > 255 ? (byte) -1 : klm[charAt2];
            if (b5 >= 0) {
                i10 += 6;
                i9 = (i9 << 6) | b5;
                if (i10 >= 8) {
                    i10 -= 8;
                    bArr[i8] = (byte) ((i9 >> i10) & 255);
                    i8++;
                }
            }
        }
        return i8 != i6 ? new byte[0] : bArr;
    }
}
