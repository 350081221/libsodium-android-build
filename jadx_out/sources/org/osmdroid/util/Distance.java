package org.osmdroid.util;

/* loaded from: classes4.dex */
public class Distance {
    private static double dotProduct(double d5, double d6, double d7, double d8, double d9, double d10) {
        return ((d7 - d5) * (d9 - d5)) + ((d8 - d6) * (d10 - d6));
    }

    public static double getProjectionFactorToLine(double d5, double d6, double d7, double d8, double d9, double d10) {
        if (d7 == d9 && d8 == d10) {
            return 0.0d;
        }
        return dotProduct(d7, d8, d9, d10, d5, d6) / getSquaredDistanceToPoint(d7, d8, d9, d10);
    }

    public static double getProjectionFactorToSegment(double d5, double d6, double d7, double d8, double d9, double d10) {
        double projectionFactorToLine = getProjectionFactorToLine(d5, d6, d7, d8, d9, d10);
        if (projectionFactorToLine < 0.0d) {
            return 0.0d;
        }
        if (projectionFactorToLine > 1.0d) {
            return 1.0d;
        }
        return projectionFactorToLine;
    }

    public static double getSquaredDistanceToLine(double d5, double d6, double d7, double d8, double d9, double d10) {
        return getSquaredDistanceToProjection(d5, d6, d7, d8, d9, d10, getProjectionFactorToLine(d5, d6, d7, d8, d9, d10));
    }

    public static double getSquaredDistanceToPoint(double d5, double d6, double d7, double d8) {
        double d9 = d5 - d7;
        double d10 = d6 - d8;
        return (d9 * d9) + (d10 * d10);
    }

    public static double getSquaredDistanceToProjection(double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        return getSquaredDistanceToPoint(d5, d6, ((d9 - d7) * d11) + d7, ((d10 - d8) * d11) + d8);
    }

    public static double getSquaredDistanceToSegment(double d5, double d6, double d7, double d8, double d9, double d10) {
        return getSquaredDistanceToProjection(d5, d6, d7, d8, d9, d10, getProjectionFactorToSegment(d5, d6, d7, d8, d9, d10));
    }
}
