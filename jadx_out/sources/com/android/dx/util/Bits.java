package com.android.dx.util;

/* loaded from: classes2.dex */
public final class Bits {
    private Bits() {
    }

    public static boolean anyInRange(int[] iArr, int i5, int i6) {
        int findFirst = findFirst(iArr, i5);
        return findFirst >= 0 && findFirst < i6;
    }

    public static int bitCount(int[] iArr) {
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += Integer.bitCount(i6);
        }
        return i5;
    }

    public static void clear(int[] iArr, int i5) {
        int i6 = i5 >> 5;
        iArr[i6] = (~(1 << (i5 & 31))) & iArr[i6];
    }

    public static int findFirst(int[] iArr, int i5) {
        int findFirst;
        int length = iArr.length;
        int i6 = i5 & 31;
        int i7 = i5 >> 5;
        while (i7 < length) {
            int i8 = iArr[i7];
            if (i8 != 0 && (findFirst = findFirst(i8, i6)) >= 0) {
                return (i7 << 5) + findFirst;
            }
            i7++;
            i6 = 0;
        }
        return -1;
    }

    public static boolean get(int[] iArr, int i5) {
        return (iArr[i5 >> 5] & (1 << (i5 & 31))) != 0;
    }

    public static int getMax(int[] iArr) {
        return iArr.length * 32;
    }

    public static boolean isEmpty(int[] iArr) {
        for (int i5 : iArr) {
            if (i5 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] makeBitSet(int i5) {
        return new int[(i5 + 31) >> 5];
    }

    public static void or(int[] iArr, int[] iArr2) {
        for (int i5 = 0; i5 < iArr2.length; i5++) {
            iArr[i5] = iArr[i5] | iArr2[i5];
        }
    }

    public static void set(int[] iArr, int i5, boolean z4) {
        int i6 = i5 >> 5;
        int i7 = 1 << (i5 & 31);
        if (z4) {
            iArr[i6] = i7 | iArr[i6];
        } else {
            iArr[i6] = (~i7) & iArr[i6];
        }
    }

    public static String toHuman(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int length = iArr.length * 32;
        boolean z4 = false;
        for (int i5 = 0; i5 < length; i5++) {
            if (get(iArr, i5)) {
                if (z4) {
                    sb.append(',');
                }
                sb.append(i5);
                z4 = true;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void set(int[] iArr, int i5) {
        int i6 = i5 >> 5;
        iArr[i6] = (1 << (i5 & 31)) | iArr[i6];
    }

    public static int findFirst(int i5, int i6) {
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i5 & (~((1 << i6) - 1)));
        if (numberOfTrailingZeros == 32) {
            return -1;
        }
        return numberOfTrailingZeros;
    }
}
