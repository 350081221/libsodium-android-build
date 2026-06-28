package org.osmdroid.util;

/* loaded from: classes4.dex */
public class MapTileIndex {
    public static int mMaxZoomLevel = 29;
    private static int mModulo = 1 << 29;

    private static void checkValues(int i5, int i6, int i7) {
        if (i5 < 0 || i5 > mMaxZoomLevel) {
            throwIllegalValue(i5, i5, "Zoom");
        }
        long j5 = 1 << i5;
        if (i6 < 0 || i6 >= j5) {
            throwIllegalValue(i5, i6, "X");
        }
        if (i7 < 0 || i7 >= j5) {
            throwIllegalValue(i5, i7, "Y");
        }
    }

    public static long getTileIndex(int i5, int i6, int i7) {
        checkValues(i5, i6, i7);
        long j5 = i5;
        int i8 = mMaxZoomLevel;
        return (j5 << (i8 * 2)) + (i6 << i8) + i7;
    }

    public static int getX(long j5) {
        return (int) ((j5 >> mMaxZoomLevel) % mModulo);
    }

    public static int getY(long j5) {
        return (int) (j5 % mModulo);
    }

    public static int getZoom(long j5) {
        return (int) (j5 >> (mMaxZoomLevel * 2));
    }

    private static void throwIllegalValue(int i5, int i6, String str) {
        throw new IllegalArgumentException("MapTileIndex: " + str + " (" + i6 + ") is too big (zoom=" + i5 + ")");
    }

    public static String toString(int i5, int i6, int i7) {
        return "/" + i5 + "/" + i6 + "/" + i7;
    }

    public static String toString(long j5) {
        return toString(getZoom(j5), getX(j5), getY(j5));
    }
}
