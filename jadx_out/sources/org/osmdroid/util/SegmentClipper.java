package org.osmdroid.util;

/* loaded from: classes4.dex */
public class SegmentClipper implements PointAccepter {
    private int mCurrentSegmentIndex;
    private boolean mFirstPoint;
    private IntegerAccepter mIntegerAccepter;
    private boolean mPathMode;
    private PointAccepter mPointAccepter;
    private long mXMax;
    private long mXMin;
    private long mYMax;
    private long mYMin;
    private final PointL mOptimIntersection = new PointL();
    private final PointL mOptimIntersection1 = new PointL();
    private final PointL mOptimIntersection2 = new PointL();
    private final long[] cornerX = new long[4];
    private final long[] cornerY = new long[4];
    private final PointL mPoint0 = new PointL();
    private final PointL mPoint1 = new PointL();

    private static long clip(long j5, long j6, long j7) {
        return j5 <= j6 ? j6 : j5 >= j7 ? j7 : j5;
    }

    private long clipX(long j5) {
        return clip(j5, this.mXMin, this.mXMax);
    }

    private long clipY(long j5) {
        return clip(j5, this.mYMin, this.mYMax);
    }

    private int getClosestCorner(long j5, long j6, long j7, long j8) {
        SegmentClipper segmentClipper = this;
        double d5 = Double.MAX_VALUE;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < segmentClipper.cornerX.length) {
                double d6 = d5;
                int i7 = i5;
                int i8 = i6;
                double squaredDistanceToSegment = Distance.getSquaredDistanceToSegment(r5[i5], segmentClipper.cornerY[i5], j5, j6, j7, j8);
                if (d6 > squaredDistanceToSegment) {
                    i6 = i7;
                } else {
                    i6 = i8;
                    squaredDistanceToSegment = d6;
                }
                d5 = squaredDistanceToSegment;
                i5 = i7 + 1;
                segmentClipper = this;
            } else {
                return i6;
            }
        }
    }

    private boolean intersection(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return SegmentIntersection.intersection(j5, j6, j7, j8, j9, j10, j11, j12, this.mOptimIntersection);
    }

    private boolean isOnTheSameSideOut(long j5, long j6, long j7, long j8) {
        long j9 = this.mXMin;
        if (j5 >= j9 || j7 >= j9) {
            long j10 = this.mXMax;
            if (j5 <= j10 || j7 <= j10) {
                long j11 = this.mYMin;
                if (j6 >= j11 || j8 >= j11) {
                    long j12 = this.mYMax;
                    if (j6 <= j12 || j8 <= j12) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void nextVertex(long j5, long j6) {
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.add(this.mCurrentSegmentIndex);
        }
        this.mPointAccepter.add(j5, j6);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        this.mPoint1.set(j5, j6);
        if (this.mFirstPoint) {
            this.mFirstPoint = false;
            this.mCurrentSegmentIndex = 0;
        } else {
            PointL pointL = this.mPoint0;
            long j7 = pointL.f21839x;
            long j8 = pointL.f21840y;
            PointL pointL2 = this.mPoint1;
            clip(j7, j8, pointL2.f21839x, pointL2.f21840y);
            this.mCurrentSegmentIndex++;
        }
        this.mPoint0.set(this.mPoint1);
    }

    public void clip(long j5, long j6, long j7, long j8) {
        int i5;
        SegmentClipper segmentClipper;
        SegmentClipper segmentClipper2;
        SegmentClipper segmentClipper3;
        int i6;
        if (this.mPathMode || !isOnTheSameSideOut(j5, j6, j7, j8)) {
            if (isInClipArea(j5, j6)) {
                if (isInClipArea(j7, j8)) {
                    nextVertex(j5, j6);
                    nextVertex(j7, j8);
                    return;
                }
                if (intersection(j5, j6, j7, j8)) {
                    nextVertex(j5, j6);
                    PointL pointL = this.mOptimIntersection;
                    nextVertex(pointL.f21839x, pointL.f21840y);
                    if (this.mPathMode) {
                        nextVertex(clipX(j7), clipY(j8));
                        return;
                    }
                    return;
                }
                throw new RuntimeException("Cannot find expected mOptimIntersection for " + new RectL(j5, j6, j7, j8));
            }
            if (isInClipArea(j7, j8)) {
                if (intersection(j5, j6, j7, j8)) {
                    if (this.mPathMode) {
                        nextVertex(clipX(j5), clipY(j6));
                    }
                    PointL pointL2 = this.mOptimIntersection;
                    nextVertex(pointL2.f21839x, pointL2.f21840y);
                    nextVertex(j7, j8);
                    return;
                }
                throw new RuntimeException("Cannot find expected mOptimIntersection for " + new RectL(j5, j6, j7, j8));
            }
            long j9 = this.mXMin;
            if (intersection(j5, j6, j7, j8, j9, this.mYMin, j9, this.mYMax)) {
                this.mOptimIntersection1.set(this.mOptimIntersection);
                i5 = 1;
            } else {
                i5 = 0;
            }
            long j10 = this.mXMax;
            if (intersection(j5, j6, j7, j8, j10, this.mYMin, j10, this.mYMax)) {
                int i7 = i5 + 1;
                segmentClipper = this;
                (i5 == 0 ? segmentClipper.mOptimIntersection1 : segmentClipper.mOptimIntersection2).set(segmentClipper.mOptimIntersection);
                i5 = i7;
            } else {
                segmentClipper = this;
            }
            long j11 = segmentClipper.mXMin;
            long j12 = segmentClipper.mYMin;
            if (intersection(j5, j6, j7, j8, j11, j12, segmentClipper.mXMax, j12)) {
                int i8 = i5 + 1;
                segmentClipper2 = this;
                (i5 == 0 ? segmentClipper2.mOptimIntersection1 : segmentClipper2.mOptimIntersection2).set(segmentClipper2.mOptimIntersection);
                i5 = i8;
            } else {
                segmentClipper2 = this;
            }
            long j13 = segmentClipper2.mXMin;
            long j14 = segmentClipper2.mYMax;
            if (intersection(j5, j6, j7, j8, j13, j14, segmentClipper2.mXMax, j14)) {
                i6 = i5 + 1;
                segmentClipper3 = this;
                (i5 == 0 ? segmentClipper3.mOptimIntersection1 : segmentClipper3.mOptimIntersection2).set(segmentClipper3.mOptimIntersection);
            } else {
                segmentClipper3 = this;
                i6 = i5;
            }
            if (i6 == 2) {
                PointL pointL3 = segmentClipper3.mOptimIntersection1;
                double d5 = j5;
                double d6 = j6;
                double squaredDistanceToPoint = Distance.getSquaredDistanceToPoint(pointL3.f21839x, pointL3.f21840y, d5, d6);
                PointL pointL4 = segmentClipper3.mOptimIntersection2;
                double squaredDistanceToPoint2 = Distance.getSquaredDistanceToPoint(pointL4.f21839x, pointL4.f21840y, d5, d6);
                PointL pointL5 = squaredDistanceToPoint < squaredDistanceToPoint2 ? segmentClipper3.mOptimIntersection1 : segmentClipper3.mOptimIntersection2;
                PointL pointL6 = squaredDistanceToPoint < squaredDistanceToPoint2 ? segmentClipper3.mOptimIntersection2 : segmentClipper3.mOptimIntersection1;
                if (segmentClipper3.mPathMode) {
                    segmentClipper3.nextVertex(clipX(j5), segmentClipper3.clipY(j6));
                }
                segmentClipper3.nextVertex(pointL5.f21839x, pointL5.f21840y);
                segmentClipper3.nextVertex(pointL6.f21839x, pointL6.f21840y);
                if (segmentClipper3.mPathMode) {
                    segmentClipper3.nextVertex(segmentClipper3.clipX(j7), segmentClipper3.clipY(j8));
                    return;
                }
                return;
            }
            if (i6 == 1) {
                if (segmentClipper3.mPathMode) {
                    segmentClipper3.nextVertex(clipX(j5), segmentClipper3.clipY(j6));
                    PointL pointL7 = segmentClipper3.mOptimIntersection1;
                    segmentClipper3.nextVertex(pointL7.f21839x, pointL7.f21840y);
                    segmentClipper3.nextVertex(segmentClipper3.clipX(j7), segmentClipper3.clipY(j8));
                    return;
                }
                return;
            }
            if (i6 == 0) {
                if (segmentClipper3.mPathMode) {
                    segmentClipper3.nextVertex(clipX(j5), segmentClipper3.clipY(j6));
                    int closestCorner = getClosestCorner(j5, j6, j7, j8);
                    segmentClipper3.nextVertex(segmentClipper3.cornerX[closestCorner], segmentClipper3.cornerY[closestCorner]);
                    segmentClipper3.nextVertex(segmentClipper3.clipX(j7), segmentClipper3.clipY(j8));
                    return;
                }
                return;
            }
            throw new RuntimeException("Impossible mOptimIntersection count (" + i6 + ")");
        }
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.end();
        }
        this.mPointAccepter.end();
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mFirstPoint = true;
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.init();
        }
        this.mPointAccepter.init();
    }

    public boolean isInClipArea(long j5, long j6) {
        return j5 > this.mXMin && j5 < this.mXMax && j6 > this.mYMin && j6 < this.mYMax;
    }

    public void set(long j5, long j6, long j7, long j8, PointAccepter pointAccepter, IntegerAccepter integerAccepter, boolean z4) {
        this.mXMin = j5;
        this.mYMin = j6;
        this.mXMax = j7;
        this.mYMax = j8;
        long[] jArr = this.cornerX;
        jArr[1] = j5;
        jArr[0] = j5;
        jArr[3] = j7;
        jArr[2] = j7;
        long[] jArr2 = this.cornerY;
        jArr2[2] = j6;
        jArr2[0] = j6;
        jArr2[3] = j8;
        jArr2[1] = j8;
        this.mPointAccepter = pointAccepter;
        this.mIntegerAccepter = integerAccepter;
        this.mPathMode = z4;
    }

    private boolean intersection(long j5, long j6, long j7, long j8) {
        long j9 = this.mXMin;
        if (!intersection(j5, j6, j7, j8, j9, this.mYMin, j9, this.mYMax)) {
            long j10 = this.mXMax;
            if (!intersection(j5, j6, j7, j8, j10, this.mYMin, j10, this.mYMax)) {
                long j11 = this.mXMin;
                long j12 = this.mYMin;
                if (!intersection(j5, j6, j7, j8, j11, j12, this.mXMax, j12)) {
                    long j13 = this.mXMin;
                    long j14 = this.mYMax;
                    if (!intersection(j5, j6, j7, j8, j13, j14, this.mXMax, j14)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void set(long j5, long j6, long j7, long j8, PointAccepter pointAccepter, boolean z4) {
        set(j5, j6, j7, j8, pointAccepter, null, z4);
    }
}
