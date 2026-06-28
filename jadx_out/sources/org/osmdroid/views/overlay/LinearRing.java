package org.osmdroid.views.overlay;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.Distance;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.IntegerAccepter;
import org.osmdroid.util.LineBuilder;
import org.osmdroid.util.ListPointAccepter;
import org.osmdroid.util.ListPointL;
import org.osmdroid.util.PathBuilder;
import org.osmdroid.util.PointAccepter;
import org.osmdroid.util.PointL;
import org.osmdroid.util.SegmentClipper;
import org.osmdroid.util.SideOptimizationPointAccepter;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class LinearRing {
    private boolean isHorizontalRepeating;
    private boolean isVerticalRepeating;
    private final BoundingBox mBoundingBox;
    private final boolean mClosed;
    private double[] mDistances;
    private boolean mDistancesPrecomputed;
    private int mDowngradePixelSize;
    private float[] mDowngradePointList;
    private boolean mGeodesic;
    private final IntegerAccepter mIntegerAccepter;
    private final ArrayList<GeoPoint> mOriginalPoints;
    private final Path mPath;
    private final PointAccepter mPointAccepter;
    private final ListPointL mPointsForMilestones;
    private final PointL mProjectedCenter;
    private long mProjectedHeight;
    private long[] mProjectedPoints;
    private boolean mProjectedPrecomputed;
    private long mProjectedWidth;
    private final SegmentClipper mSegmentClipper;

    public LinearRing(Path path) {
        this(path, true);
    }

    private void clipAndStore(Projection projection, PointL pointL, boolean z4, boolean z5, SegmentClipper segmentClipper) {
        this.mPointsForMilestones.clear();
        double projectedPowerDifference = projection.getProjectedPowerDifference();
        PointL pointL2 = new PointL();
        PointL pointL3 = new PointL();
        PointL pointL4 = new PointL();
        int i5 = 0;
        while (true) {
            long[] jArr = this.mProjectedPoints;
            if (i5 >= jArr.length) {
                break;
            }
            pointL2.set(jArr[i5], jArr[i5 + 1]);
            projection.getLongPixelsFromProjected(pointL2, projectedPowerDifference, false, pointL3);
            long j5 = pointL3.f21839x + pointL.f21839x;
            long j6 = pointL3.f21840y + pointL.f21840y;
            if (z5) {
                this.mPointsForMilestones.add(j5, j6);
            }
            if (segmentClipper != null) {
                segmentClipper.add(j5, j6);
            }
            if (i5 == 0) {
                pointL4.set(j5, j6);
            }
            i5 += 2;
        }
        if (z4) {
            if (segmentClipper != null) {
                segmentClipper.add(pointL4.f21839x, pointL4.f21840y);
            }
            if (z5) {
                this.mPointsForMilestones.add(pointL4.f21839x, pointL4.f21840y);
            }
        }
    }

    private void computeDistances() {
        if (this.mDistancesPrecomputed) {
            return;
        }
        this.mDistancesPrecomputed = true;
        double[] dArr = this.mDistances;
        if (dArr == null || dArr.length != this.mOriginalPoints.size()) {
            this.mDistances = new double[this.mOriginalPoints.size()];
        }
        GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
        Iterator<GeoPoint> it = this.mOriginalPoints.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            GeoPoint next = it.next();
            if (i5 == 0) {
                this.mDistances[i5] = 0.0d;
            } else {
                this.mDistances[i5] = next.distanceToAsDouble(geoPoint);
            }
            geoPoint.setCoords(next.getLatitude(), next.getLongitude());
            i5++;
        }
    }

    private void computeProjected() {
        if (this.mProjectedPrecomputed) {
            return;
        }
        this.mProjectedPrecomputed = true;
        long[] jArr = this.mProjectedPoints;
        if (jArr == null || jArr.length != this.mOriginalPoints.size() * 2) {
            this.mProjectedPoints = new long[this.mOriginalPoints.size() * 2];
        }
        PointL pointL = new PointL();
        PointL pointL2 = new PointL();
        TileSystem tileSystem = MapView.getTileSystem();
        Iterator<GeoPoint> it = this.mOriginalPoints.iterator();
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            GeoPoint next = it.next();
            double latitude = next.getLatitude();
            double longitude = next.getLongitude();
            tileSystem.getMercatorFromGeo(latitude, longitude, 1.15292150460684698E18d, pointL2, false);
            if (i5 == 0) {
                j5 = pointL2.f21839x;
                j6 = j5;
                j7 = pointL2.f21840y;
                j8 = j7;
                d5 = latitude;
                d7 = d5;
                d6 = longitude;
                d8 = d6;
            } else {
                setCloserPoint(pointL, pointL2, 1.15292150460684698E18d);
                long j9 = pointL2.f21839x;
                if (j6 > j9) {
                    j6 = j9;
                    d8 = longitude;
                }
                if (j5 < j9) {
                    j5 = j9;
                    d6 = longitude;
                }
                long j10 = pointL2.f21840y;
                if (j8 > j10) {
                    j8 = j10;
                    d5 = latitude;
                }
                if (j7 < j10) {
                    j7 = j10;
                    d7 = latitude;
                }
            }
            long[] jArr2 = this.mProjectedPoints;
            int i6 = i5 * 2;
            long j11 = pointL2.f21839x;
            jArr2[i6] = j11;
            long j12 = pointL2.f21840y;
            jArr2[i6 + 1] = j12;
            pointL.set(j11, j12);
            i5++;
        }
        this.mProjectedWidth = j5 - j6;
        this.mProjectedHeight = j7 - j8;
        this.mProjectedCenter.set((j6 + j5) / 2, (j8 + j7) / 2);
        this.mBoundingBox.set(d5, d6, d7, d8);
    }

    private void getBestOffset(Projection projection, PointL pointL) {
        getBestOffset(projection, pointL, projection.getLongPixelsFromProjected(this.mProjectedCenter, projection.getProjectedPowerDifference(), false, null));
    }

    public static double getCloserValue(double d5, double d6, double d7) {
        while (true) {
            double d8 = d6 - d7;
            if (Math.abs(d8 - d5) >= Math.abs(d6 - d5)) {
                break;
            }
            d6 = d8;
        }
        while (true) {
            double d9 = d6 + d7;
            if (Math.abs(d9 - d5) < Math.abs(d6 - d5)) {
                d6 = d9;
            } else {
                return d6;
            }
        }
    }

    private void resetPrecomputations() {
        this.mProjectedPrecomputed = false;
        this.mDistancesPrecomputed = false;
        this.mDowngradePixelSize = 0;
        this.mDowngradePointList = null;
    }

    private void setCloserPoint(PointL pointL, PointL pointL2, double d5) {
        if (this.isHorizontalRepeating) {
            pointL2.f21839x = Math.round(getCloserValue(pointL.f21839x, pointL2.f21839x, d5));
        }
        if (this.isVerticalRepeating) {
            pointL2.f21840y = Math.round(getCloserValue(pointL.f21840y, pointL2.f21840y, d5));
        }
    }

    protected void addGreatCircle(GeoPoint geoPoint, GeoPoint geoPoint2, int i5) {
        double latitude = geoPoint.getLatitude() * 0.017453292519943295d;
        double longitude = geoPoint.getLongitude() * 0.017453292519943295d;
        double latitude2 = geoPoint2.getLatitude() * 0.017453292519943295d;
        double longitude2 = geoPoint2.getLongitude() * 0.017453292519943295d;
        double asin = Math.asin(Math.sqrt(Math.pow(Math.sin((latitude - latitude2) / 2.0d), 2.0d) + (Math.cos(latitude) * Math.cos(latitude2) * Math.pow(Math.sin((longitude - longitude2) / 2.0d), 2.0d)))) * 2.0d;
        int i6 = 1;
        while (i6 <= i5) {
            double d5 = (i6 * 1.0d) / (i5 + 1);
            double sin = Math.sin((1.0d - d5) * asin) / Math.sin(asin);
            double sin2 = Math.sin(d5 * asin) / Math.sin(asin);
            double cos = (Math.cos(latitude) * sin * Math.cos(longitude)) + (Math.cos(latitude2) * sin2 * Math.cos(longitude2));
            double d6 = asin;
            double cos2 = (Math.cos(latitude) * sin * Math.sin(longitude)) + (Math.cos(latitude2) * sin2 * Math.sin(longitude2));
            this.mOriginalPoints.add(new GeoPoint(Math.atan2((sin * Math.sin(latitude)) + (sin2 * Math.sin(latitude2)), Math.sqrt(Math.pow(cos, 2.0d) + Math.pow(cos2, 2.0d))) * 57.29577951308232d, Math.atan2(cos2, cos) * 57.29577951308232d));
            i6++;
            asin = d6;
        }
    }

    public void addPoint(GeoPoint geoPoint) {
        if (this.mGeodesic && this.mOriginalPoints.size() > 0) {
            GeoPoint geoPoint2 = this.mOriginalPoints.get(r0.size() - 1);
            addGreatCircle(geoPoint2, geoPoint, ((int) geoPoint2.distanceToAsDouble(geoPoint)) / 100000);
        }
        this.mOriginalPoints.add(geoPoint);
        resetPrecomputations();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void buildLinePortion(Projection projection, boolean z4) {
        if (this.mOriginalPoints.size() < 2) {
            return;
        }
        computeProjected();
        computeDistances();
        PointL pointL = new PointL();
        getBestOffset(projection, pointL);
        this.mSegmentClipper.init();
        clipAndStore(projection, pointL, this.mClosed, z4, this.mSegmentClipper);
        this.mSegmentClipper.end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointL buildPathPortion(Projection projection, PointL pointL, boolean z4) {
        if (this.mOriginalPoints.size() < 2) {
            return pointL;
        }
        computeProjected();
        computeDistances();
        if (pointL == null) {
            pointL = new PointL();
            getBestOffset(projection, pointL);
        }
        this.mSegmentClipper.init();
        clipAndStore(projection, pointL, this.mClosed, z4, this.mSegmentClipper);
        this.mSegmentClipper.end();
        if (this.mClosed) {
            this.mPath.close();
        }
        return pointL;
    }

    public void clear() {
        this.mOriginalPoints.clear();
        Path path = this.mPath;
        if (path != null) {
            path.reset();
        }
        this.mPointsForMilestones.clear();
    }

    void clearPath() {
        this.mOriginalPoints.clear();
        this.mProjectedPoints = null;
        this.mDistances = null;
        resetPrecomputations();
        this.mPointAccepter.init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] computeDowngradePointList(int i5) {
        if (i5 == 0) {
            return null;
        }
        if (this.mDowngradePixelSize == i5) {
            return this.mDowngradePointList;
        }
        computeProjected();
        long j5 = this.mProjectedWidth;
        long j6 = this.mProjectedHeight;
        if (j5 <= j6) {
            j5 = j6;
        }
        if (j5 == 0) {
            return null;
        }
        ListPointAccepter listPointAccepter = new ListPointAccepter(true);
        SideOptimizationPointAccepter sideOptimizationPointAccepter = new SideOptimizationPointAccepter(listPointAccepter);
        double d5 = (j5 * 1.0d) / i5;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            long[] jArr = this.mProjectedPoints;
            if (i7 >= jArr.length) {
                break;
            }
            long j7 = jArr[i7];
            i7 = i7 + 1 + 1;
            sideOptimizationPointAccepter.add(Math.round((j7 - this.mProjectedCenter.f21839x) / d5), Math.round((jArr[r7] - this.mProjectedCenter.f21840y) / d5));
        }
        this.mDowngradePixelSize = i5;
        this.mDowngradePointList = new float[listPointAccepter.getList().size()];
        while (true) {
            float[] fArr = this.mDowngradePointList;
            if (i6 < fArr.length) {
                fArr[i6] = (float) listPointAccepter.getList().get(i6).longValue();
                i6++;
            } else {
                return fArr;
            }
        }
    }

    public BoundingBox getBoundingBox() {
        if (!this.mProjectedPrecomputed) {
            computeProjected();
        }
        return this.mBoundingBox;
    }

    public GeoPoint getCenter(GeoPoint geoPoint) {
        if (geoPoint == null) {
            geoPoint = new GeoPoint(0.0d, 0.0d);
        }
        BoundingBox boundingBox = getBoundingBox();
        geoPoint.setLatitude(boundingBox.getCenterLatitude());
        geoPoint.setLongitude(boundingBox.getCenterLongitude());
        return geoPoint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeoPoint getCloseTo(GeoPoint geoPoint, double d5, Projection projection, boolean z4) {
        double d6;
        double d7;
        double d8;
        double d9;
        Iterator<PointL> it;
        LinearRing linearRing = this;
        computeProjected();
        GeoPoint geoPoint2 = null;
        Point pixels = projection.toPixels(geoPoint, null);
        PointL pointL = new PointL();
        linearRing.getBestOffset(projection, pointL);
        clipAndStore(projection, pointL, z4, true, null);
        double worldMapSize = projection.getWorldMapSize();
        Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
        int width = intrinsicScreenRect.width();
        int height = intrinsicScreenRect.height();
        double d10 = pixels.x;
        while (true) {
            double d11 = d10 - worldMapSize;
            if (d11 < 0.0d) {
                break;
            }
            d10 = d11;
        }
        double d12 = pixels.y;
        while (true) {
            double d13 = d12 - worldMapSize;
            if (d13 < 0.0d) {
                break;
            }
            d12 = d13;
        }
        double d14 = d5 * d5;
        PointL pointL2 = new PointL();
        PointL pointL3 = new PointL();
        Iterator<PointL> it2 = linearRing.mPointsForMilestones.iterator();
        boolean z5 = true;
        int i5 = 0;
        while (it2.hasNext()) {
            pointL3.set(it2.next());
            if (z5) {
                d7 = worldMapSize;
                d8 = d10;
                d6 = d12;
                d9 = d14;
                it = it2;
                z5 = false;
            } else {
                double d15 = d10;
                d6 = d12;
                while (d15 < width) {
                    double d16 = d6;
                    int i6 = width;
                    double d17 = d10;
                    while (d16 < height) {
                        Iterator<PointL> it3 = it2;
                        double d18 = worldMapSize;
                        double d19 = d15;
                        double d20 = d16;
                        double projectionFactorToSegment = Distance.getProjectionFactorToSegment(d19, d20, pointL2.f21839x, pointL2.f21840y, pointL3.f21839x, pointL3.f21840y);
                        double d21 = d14;
                        int i7 = i6;
                        if (d21 > Distance.getSquaredDistanceToProjection(d19, d20, pointL2.f21839x, pointL2.f21840y, pointL3.f21839x, pointL3.f21840y, projectionFactorToSegment)) {
                            long[] jArr = this.mProjectedPoints;
                            int i8 = (i5 - 1) * 2;
                            int i9 = i5 * 2;
                            return MapView.getTileSystem().getGeoFromMercator((long) (jArr[i8] + ((jArr[i9] - r5) * projectionFactorToSegment)), (long) (jArr[i8 + 1] + ((jArr[i9 + 1] - r7) * projectionFactorToSegment)), 1.15292150460684698E18d, null, false, false);
                        }
                        d16 += d18;
                        it2 = it3;
                        linearRing = this;
                        i6 = i7;
                        worldMapSize = d18;
                        d14 = d21;
                    }
                    d15 += worldMapSize;
                    width = i6;
                    d10 = d17;
                    d14 = d14;
                }
                d7 = worldMapSize;
                d8 = d10;
                d9 = d14;
                it = it2;
            }
            int i10 = width;
            LinearRing linearRing2 = linearRing;
            pointL2.set(pointL3);
            i5++;
            it2 = it;
            d12 = d6;
            linearRing = linearRing2;
            width = i10;
            d10 = d8;
            worldMapSize = d7;
            d14 = d9;
            geoPoint2 = null;
        }
        return geoPoint2;
    }

    public double getDistance() {
        double d5 = 0.0d;
        for (double d6 : getDistances()) {
            d5 += d6;
        }
        return d5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] getDistances() {
        computeDistances();
        return this.mDistances;
    }

    public ArrayList<GeoPoint> getPoints() {
        return this.mOriginalPoints;
    }

    public ListPointL getPointsForMilestones() {
        return this.mPointsForMilestones;
    }

    boolean isCloseTo(GeoPoint geoPoint, double d5, Projection projection, boolean z4) {
        return getCloseTo(geoPoint, d5, projection, z4) != null;
    }

    public boolean isGeodesic() {
        return this.mGeodesic;
    }

    public void setClipArea(long j5, long j6, long j7, long j8) {
        this.mSegmentClipper.set(j5, j6, j7, j8, this.mPointAccepter, this.mIntegerAccepter, this.mPath != null);
    }

    public void setGeodesic(boolean z4) {
        this.mGeodesic = z4;
    }

    public void setPoints(List<GeoPoint> list) {
        clearPath();
        Iterator<GeoPoint> it = list.iterator();
        while (it.hasNext()) {
            addPoint(it.next());
        }
    }

    public LinearRing(LineBuilder lineBuilder, boolean z4) {
        this.mOriginalPoints = new ArrayList<>();
        this.mProjectedCenter = new PointL();
        this.mSegmentClipper = new SegmentClipper();
        this.mBoundingBox = new BoundingBox();
        this.isHorizontalRepeating = true;
        this.isVerticalRepeating = true;
        this.mPointsForMilestones = new ListPointL();
        this.mGeodesic = false;
        this.mPath = null;
        this.mPointAccepter = lineBuilder;
        if (lineBuilder instanceof LineDrawer) {
            IntegerAccepter integerAccepter = new IntegerAccepter(lineBuilder.getLines().length / 2);
            this.mIntegerAccepter = integerAccepter;
            ((LineDrawer) lineBuilder).setIntegerAccepter(integerAccepter);
        } else {
            this.mIntegerAccepter = null;
        }
        this.mClosed = z4;
    }

    public void setClipArea(Projection projection) {
        Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
        int width = intrinsicScreenRect.width() / 2;
        int height = intrinsicScreenRect.height() / 2;
        int sqrt = (int) (Math.sqrt((width * width) + (height * height)) * 2.0d * 1.1d);
        setClipArea(width - sqrt, height - sqrt, width + sqrt, height + sqrt);
        this.isHorizontalRepeating = projection.isHorizontalWrapEnabled();
        this.isVerticalRepeating = projection.isVerticalWrapEnabled();
    }

    public void getBestOffset(Projection projection, PointL pointL, PointL pointL2) {
        Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
        getBestOffset(pointL2.f21839x, pointL2.f21840y, (intrinsicScreenRect.left + intrinsicScreenRect.right) / 2.0d, (intrinsicScreenRect.top + intrinsicScreenRect.bottom) / 2.0d, projection.getWorldMapSize(), pointL);
    }

    private void getBestOffset(double d5, double d6, double d7, double d8, double d9, PointL pointL) {
        long j5;
        int bestOffset;
        int i5;
        long j6;
        int bestOffset2;
        long round = Math.round(d9);
        int i6 = 0;
        if (this.isVerticalRepeating) {
            int bestOffset3 = getBestOffset(d5, d6, d7, d8, 0L, round);
            j5 = round;
            bestOffset = getBestOffset(d5, d6, d7, d8, 0L, -round);
            i5 = bestOffset3;
        } else {
            j5 = round;
            bestOffset = 0;
            i5 = 0;
        }
        if (i5 <= bestOffset) {
            i5 = -bestOffset;
        }
        long j7 = j5;
        pointL.f21840y = j5 * i5;
        if (this.isHorizontalRepeating) {
            i6 = getBestOffset(d5, d6, d7, d8, j7, 0L);
            j6 = j7;
            bestOffset2 = getBestOffset(d5, d6, d7, d8, -j7, 0L);
        } else {
            j6 = j7;
            bestOffset2 = 0;
        }
        if (i6 <= bestOffset2) {
            i6 = -bestOffset2;
        }
        pointL.f21839x = j6 * i6;
    }

    public LinearRing(LineBuilder lineBuilder) {
        this(lineBuilder, false);
    }

    private int getBestOffset(double d5, double d6, double d7, double d8, long j5, long j6) {
        double d9 = 0.0d;
        int i5 = 0;
        while (true) {
            long j7 = i5;
            double squaredDistanceToPoint = Distance.getSquaredDistanceToPoint(d5 + (j7 * j5), d6 + (j7 * j6), d7, d8);
            if (i5 != 0 && d9 <= squaredDistanceToPoint) {
                return i5 - 1;
            }
            i5++;
            d9 = squaredDistanceToPoint;
        }
    }

    public LinearRing(Path path, boolean z4) {
        this.mOriginalPoints = new ArrayList<>();
        this.mProjectedCenter = new PointL();
        this.mSegmentClipper = new SegmentClipper();
        this.mBoundingBox = new BoundingBox();
        this.isHorizontalRepeating = true;
        this.isVerticalRepeating = true;
        this.mPointsForMilestones = new ListPointL();
        this.mGeodesic = false;
        this.mPath = path;
        this.mPointAccepter = new SideOptimizationPointAccepter(new PathBuilder(path));
        this.mIntegerAccepter = null;
        this.mClosed = z4;
    }
}
