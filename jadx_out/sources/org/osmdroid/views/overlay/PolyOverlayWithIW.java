package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.Distance;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.PointL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.infowindow.b;
import org.osmdroid.views.overlay.milestones.e;

/* loaded from: classes4.dex */
public abstract class PolyOverlayWithIW extends OverlayWithIW {
    private final boolean mClosePath;
    protected float mDensity;
    private boolean mDowngradeDisplay;
    private int mDowngradeMaximumPixelSize;
    private int mDowngradeMaximumRectanglePixelSize;
    private float[] mDowngradeSegments;
    protected Paint mFillPaint;
    private GeoPoint mInfoWindowLocation;
    private LineDrawer mLineDrawer;
    protected LinearRing mOutline;
    protected Path mPath;
    protected List<LinearRing> mHoles = new ArrayList();
    protected Paint mOutlinePaint = new Paint();
    private final List<PaintList> mOutlinePaintLists = new ArrayList();
    private List<e> mMilestoneManagers = new ArrayList();
    private boolean mIsPaintOrPaintList = true;
    private final PointL mVisibilityProjectedCenter = new PointL();
    private final PointL mVisibilityProjectedCorner = new PointL();
    private final PointL mVisibilityRectangleCenter = new PointL();
    private final PointL mVisibilityRectangleCorner = new PointL();
    private final Point mDowngradeTopLeft = new Point();
    private final Point mDowngradeBottomRight = new Point();
    private final PointL mDowngradeCenter = new PointL();
    private final PointL mDowngradeOffset = new PointL();
    private float mDensityMultiplier = 1.0f;

    /* JADX INFO: Access modifiers changed from: protected */
    public PolyOverlayWithIW(MapView mapView, boolean z4, boolean z5) {
        this.mDensity = 1.0f;
        this.mClosePath = z5;
        if (mapView != null) {
            setInfoWindow(mapView.getRepository().getDefaultPolylineInfoWindow());
            this.mDensity = mapView.getContext().getResources().getDisplayMetrics().density;
        }
        usePath(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void displayDowngrade(android.graphics.Canvas r23, org.osmdroid.views.Projection r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.PolyOverlayWithIW.displayDowngrade(android.graphics.Canvas, org.osmdroid.views.Projection):void");
    }

    private void drawWithLines(Canvas canvas, Projection projection) {
        boolean z4;
        b bVar;
        this.mLineDrawer.setCanvas(canvas);
        this.mOutline.setClipArea(projection);
        if (this.mMilestoneManagers.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.mIsPaintOrPaintList) {
            this.mLineDrawer.setPaint(getOutlinePaint());
            this.mOutline.buildLinePortion(projection, z4);
        } else {
            Iterator<PaintList> it = getOutlinePaintLists().iterator();
            while (it.hasNext()) {
                this.mLineDrawer.setPaint(it.next());
                this.mOutline.buildLinePortion(projection, z4);
                z4 = false;
            }
        }
        for (e eVar : this.mMilestoneManagers) {
            eVar.init();
            eVar.b(this.mOutline.getDistances());
            Iterator<PointL> it2 = this.mOutline.getPointsForMilestones().iterator();
            while (it2.hasNext()) {
                PointL next = it2.next();
                eVar.add(next.f21839x, next.f21840y);
            }
            eVar.end();
        }
        Iterator<e> it3 = this.mMilestoneManagers.iterator();
        while (it3.hasNext()) {
            it3.next().a(canvas);
        }
        if (isInfoWindowOpen() && (bVar = this.mInfoWindow) != null && bVar.f() == this) {
            this.mInfoWindow.c();
        }
    }

    private void drawWithPath(Canvas canvas, Projection projection) {
        boolean z4;
        b bVar;
        boolean z5;
        this.mPath.rewind();
        this.mOutline.setClipArea(projection);
        LinearRing linearRing = this.mOutline;
        if (this.mMilestoneManagers.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        PointL buildPathPortion = linearRing.buildPathPortion(projection, null, z4);
        for (e eVar : this.mMilestoneManagers) {
            eVar.init();
            eVar.b(this.mOutline.getDistances());
            Iterator<PointL> it = this.mOutline.getPointsForMilestones().iterator();
            while (it.hasNext()) {
                PointL next = it.next();
                eVar.add(next.f21839x, next.f21840y);
            }
            eVar.end();
        }
        List<LinearRing> list = this.mHoles;
        if (list != null) {
            for (LinearRing linearRing2 : list) {
                linearRing2.setClipArea(projection);
                if (this.mMilestoneManagers.size() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                linearRing2.buildPathPortion(projection, buildPathPortion, z5);
            }
            this.mPath.setFillType(Path.FillType.EVEN_ODD);
        }
        if (isVisible(this.mFillPaint)) {
            canvas.drawPath(this.mPath, this.mFillPaint);
        }
        if (isVisible(this.mOutlinePaint)) {
            canvas.drawPath(this.mPath, this.mOutlinePaint);
        }
        Iterator<e> it2 = this.mMilestoneManagers.iterator();
        while (it2.hasNext()) {
            it2.next().a(canvas);
        }
        if (isInfoWindowOpen() && (bVar = this.mInfoWindow) != null && bVar.f() == this) {
            this.mInfoWindow.c();
        }
    }

    private boolean isWorthDisplaying(Projection projection) {
        BoundingBox bounds = getBounds();
        projection.toPixels(new GeoPoint(bounds.getLatNorth(), bounds.getLonEast()), this.mDowngradeTopLeft);
        projection.toPixels(new GeoPoint(bounds.getLatSouth(), bounds.getLonWest()), this.mDowngradeBottomRight);
        double worldMapSize = projection.getWorldMapSize();
        long round = Math.round(LinearRing.getCloserValue(this.mDowngradeTopLeft.x, this.mDowngradeBottomRight.x, worldMapSize));
        long round2 = Math.round(LinearRing.getCloserValue(this.mDowngradeTopLeft.y, this.mDowngradeBottomRight.y, worldMapSize));
        if (Math.abs(this.mDowngradeTopLeft.x - this.mDowngradeBottomRight.x) < this.mDowngradeMaximumPixelSize || Math.abs(this.mDowngradeTopLeft.x - round) < this.mDowngradeMaximumPixelSize || Math.abs(this.mDowngradeTopLeft.y - this.mDowngradeBottomRight.y) < this.mDowngradeMaximumPixelSize || Math.abs(this.mDowngradeTopLeft.y - round2) < this.mDowngradeMaximumPixelSize) {
            return false;
        }
        return true;
    }

    public void addPoint(GeoPoint geoPoint) {
        this.mOutline.addPoint(geoPoint);
    }

    protected abstract boolean click(MapView mapView, GeoPoint geoPoint);

    public boolean contains(MotionEvent motionEvent) {
        if (this.mPath.isEmpty()) {
            return false;
        }
        RectF rectF = new RectF();
        this.mPath.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(this.mPath, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (!isVisible(projection)) {
            return;
        }
        if (this.mDowngradeMaximumPixelSize > 0 && !isWorthDisplaying(projection)) {
            if (this.mDowngradeDisplay) {
                displayDowngrade(canvas, projection);
            }
        } else if (this.mPath != null) {
            drawWithPath(canvas, projection);
        } else {
            drawWithLines(canvas, projection);
        }
    }

    public List<GeoPoint> getActualPoints() {
        return this.mOutline.getPoints();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public BoundingBox getBounds() {
        return this.mOutline.getBoundingBox();
    }

    public GeoPoint getCloseTo(GeoPoint geoPoint, double d5, MapView mapView) {
        return this.mOutline.getCloseTo(geoPoint, d5, mapView.getProjection(), this.mClosePath);
    }

    public double getDistance() {
        return this.mOutline.getDistance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Paint getFillPaint() {
        return this.mFillPaint;
    }

    public GeoPoint getInfoWindowLocation() {
        return this.mInfoWindowLocation;
    }

    public Paint getOutlinePaint() {
        this.mIsPaintOrPaintList = true;
        return this.mOutlinePaint;
    }

    public List<PaintList> getOutlinePaintLists() {
        this.mIsPaintOrPaintList = false;
        return this.mOutlinePaintLists;
    }

    public boolean isCloseTo(GeoPoint geoPoint, double d5, MapView mapView) {
        return getCloseTo(geoPoint, d5, mapView) != null;
    }

    public boolean isGeodesic() {
        return this.mOutline.isGeodesic();
    }

    public boolean isVisible() {
        return isEnabled();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        LinearRing linearRing = this.mOutline;
        if (linearRing != null) {
            linearRing.clear();
            this.mOutline = null;
        }
        this.mHoles.clear();
        this.mMilestoneManagers.clear();
        onDestroy();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        GeoPoint geoPoint = (GeoPoint) mapView.getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY());
        if (this.mPath != null) {
            if (!contains(motionEvent)) {
                geoPoint = null;
            }
        } else {
            geoPoint = getCloseTo(geoPoint, this.mOutlinePaint.getStrokeWidth() * this.mDensity * this.mDensityMultiplier, mapView);
        }
        if (geoPoint != null) {
            return click(mapView, geoPoint);
        }
        return false;
    }

    protected void setDefaultInfoWindowLocation() {
        if (this.mOutline.getPoints().size() == 0) {
            this.mInfoWindowLocation = new GeoPoint(0.0d, 0.0d);
            return;
        }
        if (this.mInfoWindowLocation == null) {
            this.mInfoWindowLocation = new GeoPoint(0.0d, 0.0d);
        }
        this.mOutline.getCenter(this.mInfoWindowLocation);
    }

    public void setDensityMultiplier(float f5) {
        this.mDensityMultiplier = f5;
    }

    public void setDowngradeDisplay(boolean z4) {
        this.mDowngradeDisplay = z4;
    }

    public void setDowngradePixelSizes(int i5, int i6) {
        this.mDowngradeMaximumRectanglePixelSize = i6;
        this.mDowngradeMaximumPixelSize = Math.max(i5, i6);
    }

    public void setGeodesic(boolean z4) {
        this.mOutline.setGeodesic(z4);
    }

    @Override // org.osmdroid.views.overlay.OverlayWithIW
    public void setInfoWindow(b bVar) {
        b bVar2 = this.mInfoWindow;
        if (bVar2 != null && bVar2.f() == this) {
            this.mInfoWindow.m(null);
        }
        this.mInfoWindow = bVar;
    }

    public void setInfoWindowLocation(GeoPoint geoPoint) {
        this.mInfoWindowLocation = geoPoint;
    }

    public void setMilestoneManagers(List<e> list) {
        if (list == null) {
            if (this.mMilestoneManagers.size() > 0) {
                this.mMilestoneManagers.clear();
                return;
            }
            return;
        }
        this.mMilestoneManagers = list;
    }

    public void setPoints(List<GeoPoint> list) {
        this.mOutline.setPoints(list);
        setDefaultInfoWindowLocation();
    }

    public void setVisible(boolean z4) {
        setEnabled(z4);
    }

    public void showInfoWindow() {
        GeoPoint geoPoint;
        b bVar = this.mInfoWindow;
        if (bVar != null && (geoPoint = this.mInfoWindowLocation) != null) {
            bVar.l(this, geoPoint, 0, 0);
        }
    }

    public void usePath(boolean z4) {
        ArrayList<GeoPoint> points;
        LinearRing linearRing = this.mOutline;
        if (linearRing == null) {
            points = null;
        } else {
            points = linearRing.getPoints();
        }
        if (z4) {
            Path path = new Path();
            this.mPath = path;
            this.mLineDrawer = null;
            this.mOutline = new LinearRing(path, this.mClosePath);
        } else {
            this.mPath = null;
            LineDrawer lineDrawer = new LineDrawer(256);
            this.mLineDrawer = lineDrawer;
            this.mOutline = new LinearRing(lineDrawer, this.mClosePath);
            this.mLineDrawer.setPaint(this.mOutlinePaint);
        }
        if (points != null) {
            setPoints(points);
        }
    }

    private boolean isVisible(Projection projection) {
        BoundingBox bounds = getBounds();
        projection.toProjectedPixels(bounds.getCenterLatitude(), bounds.getCenterLongitude(), this.mVisibilityProjectedCenter);
        projection.toProjectedPixels(bounds.getLatNorth(), bounds.getLonEast(), this.mVisibilityProjectedCorner);
        projection.getLongPixelsFromProjected(this.mVisibilityProjectedCenter, projection.getProjectedPowerDifference(), true, this.mVisibilityRectangleCenter);
        projection.getLongPixelsFromProjected(this.mVisibilityProjectedCorner, projection.getProjectedPowerDifference(), true, this.mVisibilityRectangleCorner);
        int width = projection.getWidth() / 2;
        int height = projection.getHeight() / 2;
        PointL pointL = this.mVisibilityRectangleCenter;
        double d5 = pointL.f21839x;
        double d6 = pointL.f21840y;
        PointL pointL2 = this.mVisibilityRectangleCorner;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d5, d6, pointL2.f21839x, pointL2.f21840y));
        PointL pointL3 = this.mVisibilityRectangleCenter;
        double d7 = pointL3.f21839x;
        double d8 = pointL3.f21840y;
        double d9 = width;
        double d10 = height;
        return Math.sqrt(Distance.getSquaredDistanceToPoint(d7, d8, d9, d10)) <= sqrt + Math.sqrt(Distance.getSquaredDistanceToPoint(0.0d, 0.0d, d9, d10));
    }

    private boolean isVisible(Paint paint) {
        return (paint == null || paint.getColor() == 0) ? false : true;
    }
}
