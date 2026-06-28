package org.osmdroid.util;

/* loaded from: classes4.dex */
public class SpeechBalloonHelper {
    public static final int CORNER_BOTTOM = 8;
    public static final int CORNER_INSIDE = -1;
    public static final int CORNER_LEFT = 1;
    public static final int CORNER_NONE = 0;
    public static final int CORNER_RIGHT = 2;
    public static final int CORNER_TOP = 4;
    private PointL mPoint;
    private RectL mRect;
    private final PointL mTrianglePoint = new PointL();

    private int checkIntersection(PointL pointL) {
        long j5 = this.mPoint.f21840y;
        long j6 = this.mRect.top;
        if (j5 <= j6 && checkIntersectionY(j6, pointL)) {
            return 4;
        }
        long j7 = this.mPoint.f21840y;
        long j8 = this.mRect.bottom;
        if (j7 >= j8 && checkIntersectionY(j8, pointL)) {
            return 8;
        }
        long j9 = this.mPoint.f21839x;
        long j10 = this.mRect.left;
        if (j9 <= j10 && checkIntersectionX(j10, pointL)) {
            return 1;
        }
        long j11 = this.mPoint.f21839x;
        long j12 = this.mRect.right;
        if (j11 >= j12 && checkIntersectionX(j12, pointL)) {
            return 2;
        }
        throw new IllegalArgumentException();
    }

    private boolean checkIntersectionX(long j5, PointL pointL) {
        PointL pointL2 = this.mPoint;
        double d5 = pointL2.f21839x;
        double d6 = pointL2.f21840y;
        PointL pointL3 = this.mTrianglePoint;
        double d7 = pointL3.f21839x;
        double d8 = pointL3.f21840y;
        double d9 = j5;
        RectL rectL = this.mRect;
        return SegmentIntersection.intersection(d5, d6, d7, d8, d9, rectL.top, d9, rectL.bottom, pointL);
    }

    private boolean checkIntersectionY(long j5, PointL pointL) {
        PointL pointL2 = this.mPoint;
        double d5 = pointL2.f21839x;
        double d6 = pointL2.f21840y;
        PointL pointL3 = this.mTrianglePoint;
        double d7 = pointL3.f21839x;
        double d8 = pointL3.f21840y;
        RectL rectL = this.mRect;
        double d9 = j5;
        return SegmentIntersection.intersection(d5, d6, d7, d8, rectL.left, d9, rectL.right, d9, pointL);
    }

    private void computeCirclePoint(PointL pointL, double d5, double d6, boolean z4) {
        MyMath.computeCirclePoint(this.mRect.centerX(), this.mRect.centerY(), d5, d6 + ((z4 ? 1 : -1) * 1.5707963267948966d), pointL);
    }

    public int compute(RectL rectL, PointL pointL, double d5, PointL pointL2, PointL pointL3) {
        this.mRect = rectL;
        this.mPoint = pointL;
        if (rectL.contains(pointL.f21839x, pointL.f21840y)) {
            return -1;
        }
        long centerX = this.mRect.centerX();
        long centerY = this.mRect.centerY();
        PointL pointL4 = this.mPoint;
        double computeAngle = MyMath.computeAngle(centerX, centerY, pointL4.f21839x, pointL4.f21840y);
        computeCirclePoint(this.mTrianglePoint, d5, computeAngle, false);
        int checkIntersection = checkIntersection(pointL2);
        computeCirclePoint(this.mTrianglePoint, d5, computeAngle, true);
        int checkIntersection2 = checkIntersection(pointL3);
        if (checkIntersection == checkIntersection2) {
            return 0;
        }
        return checkIntersection2 | checkIntersection;
    }
}
