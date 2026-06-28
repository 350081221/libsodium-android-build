package com.huawei.hms.support.log.common;

import com.android.multidex.ClassPathElement;
import com.umeng.analytics.pro.cx;
import kotlin.y1;
import o0.a;
import okio.q1;

/* loaded from: classes3.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8794a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', ClassPathElement.SEPARATOR_CHAR, a.f20835h};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8795b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, q1.f21021a, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.a.f19277h, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, cx.f12475k, cx.f12476l, cx.f12477m, cx.f12478n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static int a(String str) {
        int length = str.length();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt > 255 || f8795b[charAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        byte b5;
        int a5 = a(str);
        int i5 = (a5 / 4) * 3;
        int i6 = a5 % 4;
        if (i6 == 3) {
            i5 += 2;
        }
        if (i6 == 2) {
            i5++;
        }
        byte[] bArr = new byte[i5];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt > 255) {
                b5 = -1;
            } else {
                b5 = f8795b[charAt];
            }
            if (b5 >= 0) {
                i9 += 6;
                i8 = (i8 << 6) | b5;
                if (i9 >= 8) {
                    i9 -= 8;
                    bArr[i7] = (byte) (255 & (i8 >> i9));
                    i7++;
                }
            }
        }
        if (i7 != i5) {
            return new byte[0];
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static String encode(byte[] bArr, int i5) {
        boolean z4;
        char[] cArr = new char[((i5 + 2) / 3) * 4];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = (bArr[i6] & y1.f19838d) << 8;
            int i9 = i6 + 1;
            boolean z5 = true;
            if (i9 < i5) {
                i8 |= bArr[i9] & y1.f19838d;
                z4 = true;
            } else {
                z4 = false;
            }
            int i10 = i8 << 8;
            int i11 = i6 + 2;
            if (i11 < i5) {
                i10 |= bArr[i11] & y1.f19838d;
            } else {
                z5 = false;
            }
            int i12 = i7 + 3;
            char[] cArr2 = f8794a;
            int i13 = 64;
            cArr[i12] = cArr2[z5 ? i10 & 63 : 64];
            int i14 = i10 >> 6;
            int i15 = i7 + 2;
            if (z4) {
                i13 = i14 & 63;
            }
            cArr[i15] = cArr2[i13];
            int i16 = i14 >> 6;
            cArr[i7 + 1] = cArr2[i16 & 63];
            cArr[i7 + 0] = cArr2[(i16 >> 6) & 63];
            i6 += 3;
            i7 += 4;
        }
        return new String(cArr);
    }
}
