package com.android.dx.util;

/* loaded from: classes2.dex */
public final class Hex {
    private Hex() {
    }

    public static String dump(byte[] bArr, int i5, int i6, int i7, int i8, int i9) {
        String u12;
        int i10 = i5 + i6;
        if ((i5 | i6 | i10) >= 0 && i10 <= bArr.length) {
            if (i7 >= 0) {
                if (i6 == 0) {
                    return "";
                }
                StringBuilder sb = new StringBuilder((i6 * 4) + 6);
                int i11 = 0;
                while (i6 > 0) {
                    if (i11 == 0) {
                        if (i9 != 2) {
                            if (i9 != 4) {
                                if (i9 != 6) {
                                    u12 = u4(i7);
                                } else {
                                    u12 = u3(i7);
                                }
                            } else {
                                u12 = u2(i7);
                            }
                        } else {
                            u12 = u1(i7);
                        }
                        sb.append(u12);
                        sb.append(": ");
                    } else if ((i11 & 1) == 0) {
                        sb.append(' ');
                    }
                    sb.append(u1(bArr[i5]));
                    i7++;
                    i5++;
                    i11++;
                    if (i11 == i8) {
                        sb.append('\n');
                        i11 = 0;
                    }
                    i6--;
                }
                if (i11 != 0) {
                    sb.append('\n');
                }
                return sb.toString();
            }
            throw new IllegalArgumentException("outOffset < 0");
        }
        throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i5 + "..!" + i10);
    }

    public static String s1(int i5) {
        char[] cArr = new char[3];
        if (i5 < 0) {
            cArr[0] = '-';
            i5 = -i5;
        } else {
            cArr[0] = '+';
        }
        for (int i6 = 0; i6 < 2; i6++) {
            cArr[2 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String s2(int i5) {
        char[] cArr = new char[5];
        if (i5 < 0) {
            cArr[0] = '-';
            i5 = -i5;
        } else {
            cArr[0] = '+';
        }
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[4 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String s4(int i5) {
        char[] cArr = new char[9];
        if (i5 < 0) {
            cArr[0] = '-';
            i5 = -i5;
        } else {
            cArr[0] = '+';
        }
        for (int i6 = 0; i6 < 8; i6++) {
            cArr[8 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String s8(long j5) {
        char[] cArr = new char[17];
        if (j5 < 0) {
            cArr[0] = '-';
            j5 = -j5;
        } else {
            cArr[0] = '+';
        }
        for (int i5 = 0; i5 < 16; i5++) {
            cArr[16 - i5] = Character.forDigit(((int) j5) & 15, 16);
            j5 >>= 4;
        }
        return new String(cArr);
    }

    public static String u1(int i5) {
        char[] cArr = new char[2];
        for (int i6 = 0; i6 < 2; i6++) {
            cArr[1 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String u2(int i5) {
        char[] cArr = new char[4];
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[3 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String u2or4(int i5) {
        if (i5 == ((char) i5)) {
            return u2(i5);
        }
        return u4(i5);
    }

    public static String u3(int i5) {
        char[] cArr = new char[6];
        for (int i6 = 0; i6 < 6; i6++) {
            cArr[5 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String u4(int i5) {
        char[] cArr = new char[8];
        for (int i6 = 0; i6 < 8; i6++) {
            cArr[7 - i6] = Character.forDigit(i5 & 15, 16);
            i5 >>= 4;
        }
        return new String(cArr);
    }

    public static String u8(long j5) {
        char[] cArr = new char[16];
        for (int i5 = 0; i5 < 16; i5++) {
            cArr[15 - i5] = Character.forDigit(((int) j5) & 15, 16);
            j5 >>= 4;
        }
        return new String(cArr);
    }

    public static String uNibble(int i5) {
        return new String(new char[]{Character.forDigit(i5 & 15, 16)});
    }
}
