package com.huawei.agconnect.config.impl;

import com.umeng.analytics.pro.cx;

/* loaded from: classes3.dex */
public class Hex {
    private static final char[] HEX_CODE = "0123456789ABCDEF".toCharArray();

    private static byte[] decodeHex(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int i5 = 0;
        int i6 = 0;
        while (i5 < cArr.length) {
            int digit = Character.digit(cArr[i5], 16);
            if (digit == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i5);
            }
            int i7 = i5 + 1;
            int digit2 = Character.digit(cArr[i7], 16);
            if (digit2 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i7);
            }
            i5 = i7 + 1;
            bArr[i6] = (byte) (((digit << 4) | digit2) & 255);
            i6++;
        }
        return bArr;
    }

    public static byte[] decodeHexString(String str) {
        return decodeHex(str.toCharArray());
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            char[] cArr = HEX_CODE;
            sb.append(cArr[(b5 >> 4) & 15]);
            sb.append(cArr[b5 & cx.f12477m]);
        }
        return sb.toString();
    }
}
