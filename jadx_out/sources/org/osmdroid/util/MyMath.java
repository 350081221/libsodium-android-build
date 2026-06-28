package org.osmdroid.util;

import s4.a;

/* loaded from: classes4.dex */
public class MyMath implements a {
    private MyMath() {
    }

    public static double cleanPositiveAngle(double d5) {
        while (d5 < 0.0d) {
            d5 += 360.0d;
        }
        while (d5 >= 360.0d) {
            d5 -= 360.0d;
        }
        return d5;
    }

    public static double computeAngle(long j5, long j6, long j7, long j8) {
        return Math.atan2(j8 - j6, j7 - j5);
    }

    public static void computeCirclePoint(long j5, long j6, double d5, double d6, PointL pointL) {
        pointL.f21839x = j5 + ((long) (Math.cos(d6) * d5));
        pointL.f21840y = j6 + ((long) (d5 * Math.sin(d6)));
    }

    public static int floorToInt(double d5) {
        int i5 = (int) d5;
        return ((double) i5) <= d5 ? i5 : i5 - 1;
    }

    public static long floorToLong(double d5) {
        long j5 = (long) d5;
        return ((double) j5) <= d5 ? j5 : j5 - 1;
    }

    public static double getAngleDifference(double d5, double d6, Boolean bool) {
        double cleanPositiveAngle = cleanPositiveAngle(d6 - d5);
        if (bool != null) {
            if (bool.booleanValue()) {
                return cleanPositiveAngle;
            }
            return cleanPositiveAngle - 360.0d;
        }
        if (cleanPositiveAngle < 180.0d) {
            return cleanPositiveAngle;
        }
        return cleanPositiveAngle - 360.0d;
    }

    public static int getNextSquareNumberAbove(float f5) {
        int i5 = 1;
        int i6 = 0;
        int i7 = 1;
        while (i5 <= f5) {
            i5 *= 2;
            i6 = i7;
            i7++;
        }
        return i6;
    }

    public static double gudermann(double d5) {
        return Math.atan(Math.sinh(d5)) * 57.29577951308232d;
    }

    public static double gudermannInverse(double d5) {
        return Math.log(Math.tan(((d5 * 0.017453292519943295d) / 2.0d) + 0.7853981633974483d));
    }

    public static int mod(int i5, int i6) {
        if (i5 > 0) {
            return i5 % i6;
        }
        while (i5 < 0) {
            i5 += i6;
        }
        return i5;
    }
}
