package org.osmdroid.views;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IProjection;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.GeometryMath;
import org.osmdroid.util.PointL;
import org.osmdroid.util.RectL;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class Projection implements IProjection {
    public static final double mProjectedMapSize = 1.15292150460684698E18d;
    private boolean horizontalWrapEnabled;
    private final BoundingBox mBoundingBoxProjection;
    private final GeoPoint mCurrentCenter;
    private final Rect mIntrinsicScreenRectProjection;
    private final int mMapCenterOffsetX;
    private final int mMapCenterOffsetY;
    private final double mMercatorMapSize;
    private long mOffsetX;
    private long mOffsetY;
    private final float mOrientation;
    private final Matrix mRotateAndScaleMatrix;
    private final float[] mRotateScalePoints;
    private final Rect mScreenRectProjection;
    private long mScrollX;
    private long mScrollY;
    private final double mTileSize;
    private final TileSystem mTileSystem;
    private final Matrix mUnrotateAndScaleMatrix;
    private final double mZoomLevelProjection;
    private boolean verticalWrapEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Projection(MapView mapView) {
        this(mapView.getZoomLevelDouble(), mapView.getIntrinsicScreenRect(null), mapView.getExpectedCenter(), mapView.getMapScrollX(), mapView.getMapScrollY(), mapView.getMapOrientation(), mapView.isHorizontalMapRepetitionEnabled(), mapView.isVerticalMapRepetitionEnabled(), MapView.getTileSystem(), mapView.getMapCenterOffsetX(), mapView.getMapCenterOffsetY());
    }

    private Point applyMatrixToPoint(int i5, int i6, Point point, Matrix matrix, boolean z4) {
        if (point == null) {
            point = new Point();
        }
        if (z4) {
            float[] fArr = this.mRotateScalePoints;
            fArr[0] = i5;
            fArr[1] = i6;
            matrix.mapPoints(fArr);
            float[] fArr2 = this.mRotateScalePoints;
            point.x = (int) fArr2[0];
            point.y = (int) fArr2[1];
        } else {
            point.x = i5;
            point.y = i6;
        }
        return point;
    }

    private long getCloserPixel(long j5, int i5, int i6, double d5) {
        long j6 = (i5 + i6) / 2;
        long j7 = i5;
        long j8 = 0;
        if (j5 < j7) {
            while (j5 < j7) {
                long j9 = j5;
                j5 = (long) (j5 + d5);
                j8 = j9;
            }
            if (j5 < i6) {
                return j5;
            }
            if (Math.abs(j6 - j5) < Math.abs(j6 - j8)) {
                return j5;
            }
            return j8;
        }
        while (j5 >= j7) {
            long j10 = j5;
            j5 = (long) (j5 - d5);
            j8 = j10;
        }
        if (j8 < i6) {
            return j8;
        }
        if (Math.abs(j6 - j5) < Math.abs(j6 - j8)) {
            return j5;
        }
        return j8;
    }

    private long getLongPixelFromMercator(long j5, boolean z4, long j6, int i5, int i6) {
        long j7 = j5 + j6;
        return z4 ? getCloserPixel(j7, i5, i6, this.mMercatorMapSize) : j7;
    }

    private long getLongPixelXFromMercator(long j5, boolean z4) {
        long j6 = this.mOffsetX;
        Rect rect = this.mIntrinsicScreenRectProjection;
        return getLongPixelFromMercator(j5, z4, j6, rect.left, rect.right);
    }

    private long getLongPixelYFromMercator(long j5, boolean z4) {
        long j6 = this.mOffsetY;
        Rect rect = this.mIntrinsicScreenRectProjection;
        return getLongPixelFromMercator(j5, z4, j6, rect.top, rect.bottom);
    }

    public static long getScrollableOffset(long j5, long j6, double d5, int i5, int i6) {
        long j7;
        while (true) {
            j7 = j6 - j5;
            if (j7 >= 0) {
                break;
            }
            j6 = (long) (j6 + d5);
        }
        if (j7 < i5 - (i6 * 2)) {
            long j8 = j7 / 2;
            long j9 = i5 / 2;
            long j10 = (j9 - j8) - j5;
            if (j10 > 0) {
                return j10;
            }
            long j11 = (j9 + j8) - j6;
            if (j11 >= 0) {
                return 0L;
            }
            return j11;
        }
        long j12 = i6 - j5;
        if (j12 < 0) {
            return j12;
        }
        long j13 = (i5 - i6) - j6;
        if (j13 <= 0) {
            return 0L;
        }
        return j13;
    }

    private void refresh() {
        fromPixels(getScreenCenterX(), getScreenCenterY(), this.mCurrentCenter);
        float f5 = this.mOrientation;
        if (f5 != 0.0f && f5 != 180.0f) {
            GeometryMath.getBoundingBoxForRotatatedRectangle(this.mIntrinsicScreenRectProjection, getScreenCenterX(), getScreenCenterY(), this.mOrientation, this.mScreenRectProjection);
        } else {
            Rect rect = this.mScreenRectProjection;
            Rect rect2 = this.mIntrinsicScreenRectProjection;
            rect.left = rect2.left;
            rect.top = rect2.top;
            rect.right = rect2.right;
            rect.bottom = rect2.bottom;
        }
        Rect rect3 = this.mScreenRectProjection;
        IGeoPoint fromPixels = fromPixels(rect3.right, rect3.top, null, true);
        TileSystem tileSystem = MapView.getTileSystem();
        if (fromPixels.getLatitude() > tileSystem.getMaxLatitude()) {
            fromPixels = new GeoPoint(tileSystem.getMaxLatitude(), fromPixels.getLongitude());
        }
        if (fromPixels.getLatitude() < tileSystem.getMinLatitude()) {
            fromPixels = new GeoPoint(tileSystem.getMinLatitude(), fromPixels.getLongitude());
        }
        Rect rect4 = this.mScreenRectProjection;
        IGeoPoint fromPixels2 = fromPixels(rect4.left, rect4.bottom, null, true);
        if (fromPixels2.getLatitude() > tileSystem.getMaxLatitude()) {
            fromPixels2 = new GeoPoint(tileSystem.getMaxLatitude(), fromPixels2.getLongitude());
        }
        if (fromPixels2.getLatitude() < tileSystem.getMinLatitude()) {
            fromPixels2 = new GeoPoint(tileSystem.getMinLatitude(), fromPixels2.getLongitude());
        }
        this.mBoundingBoxProjection.set(fromPixels.getLatitude(), fromPixels.getLongitude(), fromPixels2.getLatitude(), fromPixels2.getLongitude());
    }

    public void adjustOffsets(IGeoPoint iGeoPoint, PointF pointF) {
        if (pointF == null || iGeoPoint == null) {
            return;
        }
        Point unrotateAndScalePoint = unrotateAndScalePoint((int) pointF.x, (int) pointF.y, null);
        Point pixels = toPixels(iGeoPoint, null);
        adjustOffsets(unrotateAndScalePoint.x - pixels.x, unrotateAndScalePoint.y - pixels.y);
    }

    public void detach() {
    }

    @Override // org.osmdroid.api.IProjection
    public IGeoPoint fromPixels(int i5, int i6) {
        return fromPixels(i5, i6, null, false);
    }

    public BoundingBox getBoundingBox() {
        return this.mBoundingBoxProjection;
    }

    public long getCleanMercator(long j5, boolean z4) {
        return this.mTileSystem.getCleanMercator(j5, this.mMercatorMapSize, z4);
    }

    public GeoPoint getCurrentCenter() {
        return this.mCurrentCenter;
    }

    public int getHeight() {
        return this.mIntrinsicScreenRectProjection.height();
    }

    public Rect getIntrinsicScreenRect() {
        return this.mIntrinsicScreenRectProjection;
    }

    public Matrix getInvertedScaleRotateCanvasMatrix() {
        return this.mUnrotateAndScaleMatrix;
    }

    public long getLongPixelXFromLongitude(double d5, boolean z4) {
        return getLongPixelXFromMercator(this.mTileSystem.getMercatorXFromLongitude(d5, this.mMercatorMapSize, this.horizontalWrapEnabled || z4), this.horizontalWrapEnabled);
    }

    public long getLongPixelYFromLatitude(double d5, boolean z4) {
        return getLongPixelYFromMercator(this.mTileSystem.getMercatorYFromLatitude(d5, this.mMercatorMapSize, this.verticalWrapEnabled || z4), this.verticalWrapEnabled);
    }

    public PointL getLongPixelsFromProjected(PointL pointL, double d5, boolean z4, PointL pointL2) {
        if (pointL2 == null) {
            pointL2 = new PointL();
        }
        pointL2.f21839x = getLongPixelXFromMercator((long) (pointL.f21839x / d5), z4);
        pointL2.f21840y = getLongPixelYFromMercator((long) (pointL.f21840y / d5), z4);
        return pointL2;
    }

    public long getMercatorFromTile(int i5) {
        return TileSystem.getMercatorFromTile(i5, this.mTileSize);
    }

    public RectL getMercatorViewPort(RectL rectL) {
        if (rectL == null) {
            rectL = new RectL();
        }
        Rect rect = this.mIntrinsicScreenRectProjection;
        int i5 = rect.left;
        float f5 = i5;
        int i6 = rect.right;
        float f6 = i6;
        int i7 = rect.top;
        float f7 = i7;
        int i8 = rect.bottom;
        float f8 = i8;
        if (this.mOrientation != 0.0f) {
            float[] fArr = {i5, i7, i6, i8, i5, i8, i6, i7};
            this.mUnrotateAndScaleMatrix.mapPoints(fArr);
            for (int i9 = 0; i9 < 8; i9 += 2) {
                float f9 = fArr[i9];
                if (f5 > f9) {
                    f5 = f9;
                }
                if (f6 < f9) {
                    f6 = f9;
                }
                float f10 = fArr[i9 + 1];
                if (f7 > f10) {
                    f7 = f10;
                }
                if (f8 < f10) {
                    f8 = f10;
                }
            }
        }
        rectL.left = getMercatorXFromPixel((int) f5);
        rectL.top = getMercatorYFromPixel((int) f7);
        rectL.right = getMercatorXFromPixel((int) f6);
        rectL.bottom = getMercatorYFromPixel((int) f8);
        return rectL;
    }

    public long getMercatorXFromPixel(int i5) {
        return i5 - this.mOffsetX;
    }

    public long getMercatorYFromPixel(int i5) {
        return i5 - this.mOffsetY;
    }

    @Override // org.osmdroid.api.IProjection
    public IGeoPoint getNorthEast() {
        Rect rect = this.mIntrinsicScreenRectProjection;
        return fromPixels(rect.right, rect.top, null, true);
    }

    public long getOffsetX() {
        return this.mOffsetX;
    }

    public long getOffsetY() {
        return this.mOffsetY;
    }

    public Projection getOffspring(double d5, Rect rect) {
        return new Projection(d5, rect, this.mCurrentCenter, 0L, 0L, this.mOrientation, this.horizontalWrapEnabled, this.verticalWrapEnabled, this.mTileSystem, 0, 0);
    }

    public float getOrientation() {
        return this.mOrientation;
    }

    public Rect getPixelFromTile(int i5, int i6, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = TileSystem.truncateToInt(getLongPixelXFromMercator(getMercatorFromTile(i5), false));
        rect.top = TileSystem.truncateToInt(getLongPixelYFromMercator(getMercatorFromTile(i6), false));
        rect.right = TileSystem.truncateToInt(getLongPixelXFromMercator(getMercatorFromTile(i5 + 1), false));
        rect.bottom = TileSystem.truncateToInt(getLongPixelYFromMercator(getMercatorFromTile(i6 + 1), false));
        return rect;
    }

    @Deprecated
    public Point getPixelsFromProjected(PointL pointL, double d5, Point point) {
        if (point == null) {
            point = new Point();
        }
        PointL pointL2 = new PointL();
        getLongPixelsFromProjected(pointL, d5, true, pointL2);
        point.x = TileSystem.truncateToInt(pointL2.f21839x);
        point.y = TileSystem.truncateToInt(pointL2.f21840y);
        return point;
    }

    public double getProjectedPowerDifference() {
        return 1.15292150460684698E18d / getWorldMapSize();
    }

    public Matrix getScaleRotateCanvasMatrix() {
        return this.mRotateAndScaleMatrix;
    }

    public int getScreenCenterX() {
        Rect rect = this.mIntrinsicScreenRectProjection;
        return ((rect.right + rect.left) / 2) + this.mMapCenterOffsetX;
    }

    public int getScreenCenterY() {
        Rect rect = this.mIntrinsicScreenRectProjection;
        return ((rect.bottom + rect.top) / 2) + this.mMapCenterOffsetY;
    }

    public Rect getScreenRect() {
        return this.mScreenRectProjection;
    }

    @Override // org.osmdroid.api.IProjection
    public IGeoPoint getSouthWest() {
        Rect rect = this.mIntrinsicScreenRectProjection;
        return fromPixels(rect.left, rect.bottom, null, true);
    }

    public int getTileFromMercator(long j5) {
        return TileSystem.getTileFromMercator(j5, this.mTileSize);
    }

    public int getWidth() {
        return this.mIntrinsicScreenRectProjection.width();
    }

    public double getWorldMapSize() {
        return this.mMercatorMapSize;
    }

    public double getZoomLevel() {
        return this.mZoomLevelProjection;
    }

    public boolean isHorizontalWrapEnabled() {
        return this.horizontalWrapEnabled;
    }

    public boolean isVerticalWrapEnabled() {
        return this.verticalWrapEnabled;
    }

    @Override // org.osmdroid.api.IProjection
    public float metersToEquatorPixels(float f5) {
        return metersToPixels(f5, 0.0d, this.mZoomLevelProjection);
    }

    public float metersToPixels(float f5) {
        return metersToPixels(f5, getBoundingBox().getCenterWithDateLine().getLatitude(), this.mZoomLevelProjection);
    }

    public void restore(Canvas canvas, boolean z4) {
        if (this.mOrientation != 0.0f || z4) {
            canvas.restore();
        }
    }

    public Point rotateAndScalePoint(int i5, int i6, Point point) {
        return applyMatrixToPoint(i5, i6, point, this.mRotateAndScaleMatrix, this.mOrientation != 0.0f);
    }

    public void save(Canvas canvas, boolean z4, boolean z5) {
        Matrix matrix;
        if (this.mOrientation != 0.0f || z5) {
            canvas.save();
            if (z4) {
                matrix = this.mRotateAndScaleMatrix;
            } else {
                matrix = this.mUnrotateAndScaleMatrix;
            }
            canvas.concat(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setMapScroll(MapView mapView) {
        if (mapView.getMapScrollX() == this.mScrollX && mapView.getMapScrollY() == this.mScrollY) {
            return false;
        }
        mapView.setMapScroll(this.mScrollX, this.mScrollY);
        return true;
    }

    public PointL toMercatorPixels(int i5, int i6, PointL pointL) {
        if (pointL == null) {
            pointL = new PointL();
        }
        pointL.f21839x = getCleanMercator(getMercatorXFromPixel(i5), this.horizontalWrapEnabled);
        pointL.f21840y = getCleanMercator(getMercatorYFromPixel(i6), this.verticalWrapEnabled);
        return pointL;
    }

    @Override // org.osmdroid.api.IProjection
    public Point toPixels(IGeoPoint iGeoPoint, Point point) {
        return toPixels(iGeoPoint, point, false);
    }

    @Deprecated
    public Point toPixelsFromMercator(long j5, long j6, Point point) {
        if (point == null) {
            point = new Point();
        }
        point.x = TileSystem.truncateToInt(getLongPixelXFromMercator(j5, true));
        point.y = TileSystem.truncateToInt(getLongPixelYFromMercator(j6, true));
        return point;
    }

    @Deprecated
    public Point toPixelsFromProjected(PointL pointL, Point point) {
        if (point == null) {
            point = new Point();
        }
        double projectedPowerDifference = getProjectedPowerDifference();
        PointL pointL2 = new PointL();
        getLongPixelsFromProjected(pointL, projectedPowerDifference, true, pointL2);
        point.x = TileSystem.truncateToInt(pointL2.f21839x);
        point.y = TileSystem.truncateToInt(pointL2.f21840y);
        return point;
    }

    public PointL toProjectedPixels(GeoPoint geoPoint, PointL pointL) {
        return toProjectedPixels(geoPoint.getLatitude(), geoPoint.getLongitude(), pointL);
    }

    public Point unrotateAndScalePoint(int i5, int i6, Point point) {
        return applyMatrixToPoint(i5, i6, point, this.mUnrotateAndScaleMatrix, this.mOrientation != 0.0f);
    }

    public IGeoPoint fromPixels(int i5, int i6, GeoPoint geoPoint) {
        return fromPixels(i5, i6, geoPoint, false);
    }

    public long getLongPixelXFromLongitude(double d5) {
        return getLongPixelXFromMercator(this.mTileSystem.getMercatorXFromLongitude(d5, this.mMercatorMapSize, false), false);
    }

    public long getLongPixelYFromLatitude(double d5) {
        return getLongPixelYFromMercator(this.mTileSystem.getMercatorYFromLatitude(d5, this.mMercatorMapSize, false), false);
    }

    public float metersToPixels(float f5, double d5, double d6) {
        return (float) (f5 / TileSystem.GroundResolution(d5, d6));
    }

    public Point toPixels(IGeoPoint iGeoPoint, Point point, boolean z4) {
        if (point == null) {
            point = new Point();
        }
        point.x = TileSystem.truncateToInt(getLongPixelXFromLongitude(iGeoPoint.getLongitude(), z4));
        point.y = TileSystem.truncateToInt(getLongPixelYFromLatitude(iGeoPoint.getLatitude(), z4));
        return point;
    }

    @Deprecated
    public PointL toProjectedPixels(long j5, long j6, PointL pointL) {
        return toProjectedPixels(j5 * 1.0E-6d, j6 * 1.0E-6d, pointL);
    }

    public IGeoPoint fromPixels(int i5, int i6, GeoPoint geoPoint, boolean z4) {
        return this.mTileSystem.getGeoFromMercator(getCleanMercator(getMercatorXFromPixel(i5), this.horizontalWrapEnabled), getCleanMercator(getMercatorYFromPixel(i6), this.verticalWrapEnabled), this.mMercatorMapSize, geoPoint, this.horizontalWrapEnabled || z4, this.verticalWrapEnabled || z4);
    }

    public PointL toProjectedPixels(double d5, double d6, PointL pointL) {
        return toProjectedPixels(d5, d6, true, pointL);
    }

    public PointL toProjectedPixels(double d5, double d6, boolean z4, PointL pointL) {
        return this.mTileSystem.getMercatorFromGeo(d5, d6, 1.15292150460684698E18d, pointL, z4);
    }

    @Deprecated
    public void adjustOffsets(BoundingBox boundingBox) {
        if (boundingBox == null) {
            return;
        }
        adjustOffsets(boundingBox.getLonWest(), boundingBox.getLonEast(), false, 0);
        adjustOffsets(boundingBox.getActualNorth(), boundingBox.getActualSouth(), true, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void adjustOffsets(double d5, double d6, boolean z4, int i5) {
        long j5;
        long j6 = 0;
        if (z4) {
            j5 = getScrollableOffset(getLongPixelYFromLatitude(d5), getLongPixelYFromLatitude(d6), this.mMercatorMapSize, this.mIntrinsicScreenRectProjection.height(), i5);
        } else {
            j5 = 0;
            j6 = getScrollableOffset(getLongPixelXFromLongitude(d5), getLongPixelXFromLongitude(d6), this.mMercatorMapSize, this.mIntrinsicScreenRectProjection.width(), i5);
        }
        adjustOffsets(j6, j5);
    }

    public Projection(double d5, Rect rect, GeoPoint geoPoint, long j5, long j6, float f5, boolean z4, boolean z5, TileSystem tileSystem, int i5, int i6) {
        Matrix matrix = new Matrix();
        this.mRotateAndScaleMatrix = matrix;
        Matrix matrix2 = new Matrix();
        this.mUnrotateAndScaleMatrix = matrix2;
        this.mRotateScalePoints = new float[2];
        this.mBoundingBoxProjection = new BoundingBox();
        this.mScreenRectProjection = new Rect();
        this.mCurrentCenter = new GeoPoint(0.0d, 0.0d);
        this.mMapCenterOffsetX = i5;
        this.mMapCenterOffsetY = i6;
        this.mZoomLevelProjection = d5;
        this.horizontalWrapEnabled = z4;
        this.verticalWrapEnabled = z5;
        this.mTileSystem = tileSystem;
        double MapSize = TileSystem.MapSize(d5);
        this.mMercatorMapSize = MapSize;
        this.mTileSize = TileSystem.getTileSize(d5);
        this.mIntrinsicScreenRectProjection = rect;
        GeoPoint geoPoint2 = geoPoint != null ? geoPoint : new GeoPoint(0.0d, 0.0d);
        this.mScrollX = j5;
        this.mScrollY = j6;
        this.mOffsetX = (getScreenCenterX() - this.mScrollX) - tileSystem.getMercatorXFromLongitude(geoPoint2.getLongitude(), MapSize, this.horizontalWrapEnabled);
        this.mOffsetY = (getScreenCenterY() - this.mScrollY) - tileSystem.getMercatorYFromLatitude(geoPoint2.getLatitude(), MapSize, this.verticalWrapEnabled);
        this.mOrientation = f5;
        matrix.preRotate(f5, getScreenCenterX(), getScreenCenterY());
        matrix.invert(matrix2);
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void adjustOffsets(long j5, long j6) {
        if (j5 == 0 && j6 == 0) {
            return;
        }
        this.mOffsetX += j5;
        this.mOffsetY += j6;
        this.mScrollX -= j5;
        this.mScrollY -= j6;
        refresh();
    }

    public Projection(double d5, int i5, int i6, GeoPoint geoPoint, float f5, boolean z4, boolean z5, int i7, int i8) {
        this(d5, new Rect(0, 0, i5, i6), geoPoint, 0L, 0L, f5, z4, z5, MapView.getTileSystem(), i7, i8);
    }
}
