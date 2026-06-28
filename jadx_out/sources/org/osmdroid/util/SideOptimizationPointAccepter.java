package org.osmdroid.util;

/* loaded from: classes4.dex */
public class SideOptimizationPointAccepter implements PointAccepter {
    private static final int STATUS_DIFFERENT = 0;
    private static final int STATUS_SAME_X = 1;
    private static final int STATUS_SAME_Y = 2;
    private boolean mFirst;
    private long mMax;
    private long mMin;
    private final PointAccepter mPointAccepter;
    private int mStatus;
    private final PointL mLatestPoint = new PointL();
    private final PointL mStartPoint = new PointL();

    public SideOptimizationPointAccepter(PointAccepter pointAccepter) {
        this.mPointAccepter = pointAccepter;
    }

    private void addToAccepter(long j5, long j6) {
        this.mPointAccepter.add(j5, j6);
    }

    private void flushSides() {
        int i5 = this.mStatus;
        if (i5 != 1) {
            if (i5 == 2) {
                PointL pointL = this.mStartPoint;
                long j5 = pointL.f21840y;
                long j6 = pointL.f21839x;
                long j7 = this.mLatestPoint.f21839x;
                if (j6 > j7) {
                    j6 = j7;
                    j7 = j6;
                }
                long j8 = this.mMin;
                if (j8 < j6) {
                    addToAccepter(j8, j5);
                }
                long j9 = this.mMax;
                if (j9 > j7) {
                    addToAccepter(j9, j5);
                }
                addToAccepter(this.mLatestPoint.f21839x, j5);
            }
        } else {
            PointL pointL2 = this.mStartPoint;
            long j10 = pointL2.f21839x;
            long j11 = pointL2.f21840y;
            long j12 = this.mLatestPoint.f21840y;
            if (j11 > j12) {
                j11 = j12;
                j12 = j11;
            }
            long j13 = this.mMin;
            if (j13 < j11) {
                addToAccepter(j10, j13);
            }
            long j14 = this.mMax;
            if (j14 > j12) {
                addToAccepter(j10, j14);
            }
            addToAccepter(j10, this.mLatestPoint.f21840y);
        }
        this.mStatus = 0;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        if (this.mFirst) {
            this.mFirst = false;
            addToAccepter(j5, j6);
            this.mLatestPoint.set(j5, j6);
            return;
        }
        PointL pointL = this.mLatestPoint;
        long j7 = pointL.f21839x;
        if (j7 == j5 && pointL.f21840y == j6) {
            return;
        }
        if (j7 == j5) {
            if (this.mStatus == 1) {
                if (this.mMin > j6) {
                    this.mMin = j6;
                }
                if (this.mMax < j6) {
                    this.mMax = j6;
                }
            } else {
                flushSides();
                this.mStatus = 1;
                this.mStartPoint.set(this.mLatestPoint);
                this.mMin = Math.min(j6, this.mLatestPoint.f21840y);
                this.mMax = Math.max(j6, this.mLatestPoint.f21840y);
            }
        } else if (pointL.f21840y == j6) {
            if (this.mStatus == 2) {
                if (this.mMin > j5) {
                    this.mMin = j5;
                }
                if (this.mMax < j5) {
                    this.mMax = j5;
                }
            } else {
                flushSides();
                this.mStatus = 2;
                this.mStartPoint.set(this.mLatestPoint);
                this.mMin = Math.min(j5, this.mLatestPoint.f21839x);
                this.mMax = Math.max(j5, this.mLatestPoint.f21839x);
            }
        } else {
            flushSides();
            addToAccepter(j5, j6);
        }
        this.mLatestPoint.set(j5, j6);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
        flushSides();
        this.mPointAccepter.end();
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mFirst = true;
        this.mStatus = 0;
        this.mPointAccepter.init();
    }
}
