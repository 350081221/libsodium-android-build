package org.osmdroid.util;

/* loaded from: classes4.dex */
public class SegmentIntersection {
    private static boolean check(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL, double d13, double d14) {
        if (d13 < Math.min(d5, d7) || d13 > Math.max(d5, d7) || d13 < Math.min(d9, d11) || d13 > Math.max(d9, d11) || d14 < Math.min(d6, d8) || d14 > Math.max(d6, d8) || d14 < Math.min(d10, d12) || d14 > Math.max(d10, d12)) {
            return false;
        }
        if (pointL == null) {
            return true;
        }
        pointL.f21839x = Math.round(d13);
        pointL.f21840y = Math.round(d14);
        return true;
    }

    private static boolean divisionByZeroSideEffect(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL) {
        if (!divisionByZeroSideEffectX(d5, d6, d7, d8, d9, d10, d11, d12, pointL) && !divisionByZeroSideEffectX(d9, d10, d11, d12, d5, d6, d7, d8, pointL) && !divisionByZeroSideEffectY(d5, d6, d7, d8, d9, d10, d11, d12, pointL) && !divisionByZeroSideEffectY(d9, d10, d11, d12, d5, d6, d7, d8, pointL)) {
            return false;
        }
        return true;
    }

    private static boolean divisionByZeroSideEffectX(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL) {
        if (d5 == d7 && d9 != d11) {
            return check(d5, d6, d7, d8, d9, d10, d11, d12, pointL, d5, (((d5 - d9) / (d11 - d9)) * (d12 - d10)) + d10);
        }
        return false;
    }

    private static boolean divisionByZeroSideEffectY(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL) {
        if (d6 == d8 && d10 != d12) {
            return check(d5, d6, d7, d8, d9, d10, d11, d12, pointL, (((d6 - d10) / (d12 - d10)) * (d11 - d9)) + d9, d6);
        }
        return false;
    }

    public static boolean intersection(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL) {
        if (parallelSideEffect(d5, d6, d7, d8, d9, d10, d11, d12, pointL) || divisionByZeroSideEffect(d5, d6, d7, d8, d9, d10, d11, d12, pointL)) {
            return true;
        }
        double d13 = d5 - d7;
        double d14 = d10 - d12;
        double d15 = d6 - d8;
        double d16 = d9 - d11;
        double d17 = (d13 * d14) - (d15 * d16);
        if (d17 == 0.0d) {
            return false;
        }
        double d18 = (d5 * d8) - (d6 * d7);
        double d19 = (d9 * d12) - (d10 * d11);
        return check(d5, d6, d7, d8, d9, d10, d11, d12, pointL, ((d16 * d18) - (d13 * d19)) / d17, ((d14 * d18) - (d15 * d19)) / d17);
    }

    private static double middle(double d5, double d6, double d7, double d8) {
        return (Math.min(Math.max(d5, d6), Math.max(d7, d8)) + Math.max(Math.min(d5, d6), Math.min(d7, d8))) / 2.0d;
    }

    private static boolean parallelSideEffect(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL) {
        if (d5 == d7) {
            return parallelSideEffectSameX(d5, d6, d7, d8, d9, d10, d11, d12, pointL);
        }
        if (d9 == d11) {
            return parallelSideEffectSameX(d9, d10, d11, d12, d5, d6, d7, d8, pointL);
        }
        double d13 = (d8 - d6) / (d7 - d5);
        double d14 = (d12 - d10) / (d11 - d9);
        if (d13 != d14 || d6 - (d13 * d5) != d10 - (d14 * d9)) {
            return false;
        }
        return check(d5, d6, d7, d8, d9, d10, d11, d12, pointL, middle(d5, d7, d9, d11), middle(d6, d8, d10, d12));
    }

    private static boolean parallelSideEffectSameX(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, PointL pointL) {
        if (d5 != d7 || d9 != d11 || d5 != d9) {
            return false;
        }
        return check(d5, d6, d7, d8, d9, d10, d11, d12, pointL, d5, middle(d6, d8, d10, d12));
    }
}
