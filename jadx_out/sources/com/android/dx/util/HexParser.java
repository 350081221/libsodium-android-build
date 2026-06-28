package com.android.dx.util;

/* loaded from: classes2.dex */
public final class HexParser {
    private HexParser() {
    }

    public static byte[] parse(String str) {
        String substring;
        int indexOf;
        int length = str.length();
        int i5 = length / 2;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int indexOf2 = str.indexOf(10, i7);
            if (indexOf2 < 0) {
                indexOf2 = length;
            }
            int indexOf3 = str.indexOf(35, i7);
            if (indexOf3 >= 0 && indexOf3 < indexOf2) {
                substring = str.substring(i7, indexOf3);
            } else {
                substring = str.substring(i7, indexOf2);
            }
            int i9 = indexOf2 + 1;
            int indexOf4 = substring.indexOf(58);
            if (indexOf4 != -1 && ((indexOf = substring.indexOf(34)) == -1 || indexOf >= indexOf4)) {
                String trim = substring.substring(i6, indexOf4).trim();
                substring = substring.substring(indexOf4 + 1);
                if (Integer.parseInt(trim, 16) != i8) {
                    throw new RuntimeException("bogus offset marker: " + trim);
                }
            }
            int length2 = substring.length();
            int i10 = i6;
            int i11 = i10;
            int i12 = -1;
            while (i10 < length2) {
                char charAt = substring.charAt(i10);
                if (i11 != 0) {
                    if (charAt == '\"') {
                        i11 = 0;
                    } else {
                        bArr[i8] = (byte) charAt;
                        i8++;
                    }
                } else if (charAt > ' ') {
                    if (charAt == '\"') {
                        if (i12 == -1) {
                            i11 = 1;
                        } else {
                            throw new RuntimeException("spare digit around offset " + Hex.u4(i8));
                        }
                    } else {
                        int digit = Character.digit(charAt, 16);
                        if (digit != -1) {
                            if (i12 == -1) {
                                i12 = digit;
                            } else {
                                bArr[i8] = (byte) ((i12 << 4) | digit);
                                i8++;
                                i12 = -1;
                            }
                        } else {
                            throw new RuntimeException("bogus digit character: \"" + charAt + "\"");
                        }
                    }
                }
                i10++;
            }
            if (i12 == -1) {
                if (i11 == 0) {
                    i7 = i9;
                    i6 = 0;
                } else {
                    throw new RuntimeException("unterminated quote around offset " + Hex.u4(i8));
                }
            } else {
                throw new RuntimeException("spare digit around offset " + Hex.u4(i8));
            }
        }
        if (i8 < i5) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, i8);
            return bArr2;
        }
        return bArr;
    }
}
