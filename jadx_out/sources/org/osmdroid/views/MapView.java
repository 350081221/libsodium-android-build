package org.osmdroid.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.ZoomButtonsController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.metalev.multitouch.controller.MultiTouchController;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ScrollEvent;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.MapTileProviderBasic;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.d;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.SimpleInvalidationHandler;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.GeometryMath;
import org.osmdroid.util.TileSystem;
import org.osmdroid.util.TileSystemWebMercator;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.overlay.DefaultOverlayManager;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.OverlayManager;
import org.osmdroid.views.overlay.TilesOverlay;

/* loaded from: classes4.dex */
public class MapView extends ViewGroup implements IMapView, MultiTouchController.MultiTouchObjectCanvas<Object> {
    private static TileSystem mTileSystem = new TileSystemWebMercator();
    private boolean enableFling;
    private boolean horizontalMapRepetitionEnabled;
    private GeoPoint mCenter;
    private final MapController mController;
    private boolean mDestroyModeOnDetach;
    private final GestureDetector mGestureDetector;
    private boolean mImpossibleFlinging;
    private final Rect mInvalidateRect;
    protected final AtomicBoolean mIsAnimating;
    protected boolean mIsFlinging;
    private boolean mLayoutOccurred;
    private final Point mLayoutPoint;
    protected List<MapListener> mListners;
    private int mMapCenterOffsetX;
    private int mMapCenterOffsetY;
    private TilesOverlay mMapOverlay;
    private long mMapScrollX;
    private long mMapScrollY;
    protected Double mMaximumZoomLevel;
    protected Double mMinimumZoomLevel;
    private MultiTouchController<Object> mMultiTouchController;
    private PointF mMultiTouchScaleCurrentPoint;
    private final GeoPoint mMultiTouchScaleGeoPoint;
    private final PointF mMultiTouchScaleInitPoint;
    private final LinkedList<OnFirstLayoutListener> mOnFirstLayoutListeners;
    private OverlayManager mOverlayManager;
    protected Projection mProjection;
    private final MapViewRepository mRepository;
    private final Rect mRescaleScreenRect;
    final Point mRotateScalePoint;
    private double mScrollableAreaLimitEast;
    private int mScrollableAreaLimitExtraPixelHeight;
    private int mScrollableAreaLimitExtraPixelWidth;
    private boolean mScrollableAreaLimitLatitude;
    private boolean mScrollableAreaLimitLongitude;
    private double mScrollableAreaLimitNorth;
    private double mScrollableAreaLimitSouth;
    private double mScrollableAreaLimitWest;
    private final Scroller mScroller;
    private double mStartAnimationZoom;
    private MapTileProviderBase mTileProvider;
    private Handler mTileRequestCompleteHandler;
    private float mTilesScaleFactor;
    private boolean mTilesScaledToDpi;
    private final CustomZoomButtonsController mZoomController;
    private double mZoomLevel;
    private boolean mZoomRounding;
    private float mapOrientation;
    private boolean pauseFling;
    private boolean verticalMapRepetitionEnabled;

    /* loaded from: classes4.dex */
    private class MapViewDoubleClickListener implements GestureDetector.OnDoubleTapListener {
        private MapViewDoubleClickListener() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (MapView.this.getOverlayManager().onDoubleTap(motionEvent, MapView.this)) {
                return true;
            }
            MapView.this.getProjection().rotateAndScalePoint((int) motionEvent.getX(), (int) motionEvent.getY(), MapView.this.mRotateScalePoint);
            IMapController controller = MapView.this.getController();
            Point point = MapView.this.mRotateScalePoint;
            return controller.zoomInFixing(point.x, point.y);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return MapView.this.getOverlayManager().onDoubleTapEvent(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return MapView.this.getOverlayManager().onSingleTapConfirmed(motionEvent, MapView.this);
        }
    }

    /* loaded from: classes4.dex */
    private class MapViewGestureDetectorListener implements GestureDetector.OnGestureListener {
        private MapViewGestureDetectorListener() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            MapView mapView = MapView.this;
            if (mapView.mIsFlinging) {
                if (mapView.mScroller != null) {
                    MapView.this.mScroller.abortAnimation();
                }
                MapView.this.mIsFlinging = false;
            }
            if (!MapView.this.getOverlayManager().onDown(motionEvent, MapView.this) && MapView.this.mZoomController != null) {
                MapView.this.mZoomController.activate();
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            if (MapView.this.enableFling && !MapView.this.pauseFling) {
                if (MapView.this.getOverlayManager().onFling(motionEvent, motionEvent2, f5, f6, MapView.this)) {
                    return true;
                }
                if (MapView.this.mImpossibleFlinging) {
                    MapView.this.mImpossibleFlinging = false;
                    return false;
                }
                MapView mapView = MapView.this;
                mapView.mIsFlinging = true;
                if (mapView.mScroller != null) {
                    MapView.this.mScroller.fling((int) MapView.this.getMapScrollX(), (int) MapView.this.getMapScrollY(), -((int) f5), -((int) f6), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                return true;
            }
            MapView.this.pauseFling = false;
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (MapView.this.mMultiTouchController != null && MapView.this.mMultiTouchController.isPinching()) {
                return;
            }
            MapView.this.getOverlayManager().onLongPress(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            if (MapView.this.getOverlayManager().onScroll(motionEvent, motionEvent2, f5, f6, MapView.this)) {
                return true;
            }
            MapView.this.scrollBy((int) f5, (int) f6);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            MapView.this.getOverlayManager().onShowPress(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return MapView.this.getOverlayManager().onSingleTapUp(motionEvent, MapView.this);
        }
    }

    /* loaded from: classes4.dex */
    private class MapViewZoomListener implements CustomZoomButtonsController.OnZoomListener, ZoomButtonsController.OnZoomListener {
        private MapViewZoomListener() {
        }

        @Override // org.osmdroid.views.CustomZoomButtonsController.OnZoomListener, android.widget.ZoomButtonsController.OnZoomListener
        public void onVisibilityChanged(boolean z4) {
        }

        @Override // org.osmdroid.views.CustomZoomButtonsController.OnZoomListener, android.widget.ZoomButtonsController.OnZoomListener
        public void onZoom(boolean z4) {
            if (z4) {
                MapView.this.getController().zoomIn();
            } else {
                MapView.this.getController().zoomOut();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface OnFirstLayoutListener {
        void onFirstLayout(View view, int i5, int i6, int i7, int i8);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase, Handler handler, AttributeSet attributeSet) {
        this(context, mapTileProviderBase, handler, attributeSet, a.a().B());
    }

    private void checkZoomButtons() {
        this.mZoomController.setZoomInEnabled(canZoomIn());
        this.mZoomController.setZoomOutEnabled(canZoomOut());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.osmdroid.tileprovider.tilesource.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
    private e getTileSourceFromAttributes(AttributeSet attributeSet) {
        String attributeValue;
        OnlineTileSourceBase onlineTileSourceBase = TileSourceFactory.DEFAULT_TILE_SOURCE;
        if (attributeSet != null && (attributeValue = attributeSet.getAttributeValue(null, "tilesource")) != null) {
            try {
                ?? tileSource = TileSourceFactory.getTileSource(attributeValue);
                Log.i(IMapView.LOGTAG, "Using tile source specified in layout attributes: " + tileSource);
                onlineTileSourceBase = tileSource;
            } catch (IllegalArgumentException unused) {
                Log.w(IMapView.LOGTAG, "Invalid tile source specified in layout attributes: " + onlineTileSourceBase);
            }
        }
        if (attributeSet != null && (onlineTileSourceBase instanceof d)) {
            String attributeValue2 = attributeSet.getAttributeValue(null, "style");
            if (attributeValue2 == null) {
                Log.i(IMapView.LOGTAG, "Using default style: 1");
            } else {
                Log.i(IMapView.LOGTAG, "Using style specified in layout attributes: " + attributeValue2);
                ((d) onlineTileSourceBase).c(attributeValue2);
            }
        }
        Log.i(IMapView.LOGTAG, "Using tile source: " + onlineTileSourceBase.name());
        return onlineTileSourceBase;
    }

    public static TileSystem getTileSystem() {
        return mTileSystem;
    }

    private void resetProjection() {
        this.mProjection = null;
    }

    private MotionEvent rotateTouchEvent(MotionEvent motionEvent) {
        if (getMapOrientation() == 0.0f) {
            return motionEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.transform(getProjection().getInvertedScaleRotateCanvasMatrix());
        return obtain;
    }

    public static void setTileSystem(TileSystem tileSystem) {
        mTileSystem = tileSystem;
    }

    private void updateTileSizeForDensity(e eVar) {
        float f5;
        float tileSizePixels = eVar.getTileSizePixels();
        float f6 = (getResources().getDisplayMetrics().density * 256.0f) / tileSizePixels;
        if (isTilesScaledToDpi()) {
            f5 = f6 * this.mTilesScaleFactor;
        } else {
            f5 = this.mTilesScaleFactor;
        }
        int i5 = (int) (tileSizePixels * f5);
        if (a.a().U()) {
            Log.d(IMapView.LOGTAG, "Scaling tiles to " + i5);
        }
        TileSystem.setTileSize(i5);
    }

    public void addMapListener(MapListener mapListener) {
        this.mListners.add(mapListener);
    }

    public void addOnFirstLayoutListener(OnFirstLayoutListener onFirstLayoutListener) {
        if (!isLayoutOccurred()) {
            this.mOnFirstLayoutListeners.add(onFirstLayoutListener);
        }
    }

    public boolean canZoomIn() {
        return this.mZoomLevel < getMaxZoomLevel();
    }

    public boolean canZoomOut() {
        return this.mZoomLevel > getMinZoomLevel();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.mScroller;
        if (scroller == null || !this.mIsFlinging || !scroller.computeScrollOffset()) {
            return;
        }
        if (this.mScroller.isFinished()) {
            this.mIsFlinging = false;
        } else {
            scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        resetProjection();
        getProjection().save(canvas, true, false);
        try {
            getOverlayManager().onDraw(canvas, this);
            getProjection().restore(canvas, false);
            CustomZoomButtonsController customZoomButtonsController = this.mZoomController;
            if (customZoomButtonsController != null) {
                customZoomButtonsController.draw(canvas);
            }
            super.dispatchDraw(canvas);
        } catch (Exception e5) {
            Log.e(IMapView.LOGTAG, "error dispatchDraw, probably in edit mode", e5);
        }
        if (a.a().U()) {
            Log.d(IMapView.LOGTAG, "Rendering overall: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (a.a().U()) {
            Log.d(IMapView.LOGTAG, "dispatchTouchEvent(" + motionEvent + ")");
        }
        if (this.mZoomController.isTouched(motionEvent)) {
            this.mZoomController.activate();
            return true;
        }
        MotionEvent rotateTouchEvent = rotateTouchEvent(motionEvent);
        try {
            if (super.dispatchTouchEvent(motionEvent)) {
                if (a.a().U()) {
                    Log.d(IMapView.LOGTAG, "super handled onTouchEvent");
                }
                return true;
            }
            if (getOverlayManager().onTouchEvent(rotateTouchEvent, this)) {
                if (rotateTouchEvent != motionEvent) {
                    rotateTouchEvent.recycle();
                }
                return true;
            }
            MultiTouchController<Object> multiTouchController = this.mMultiTouchController;
            if (multiTouchController != null && multiTouchController.onTouchEvent(motionEvent)) {
                if (a.a().U()) {
                    Log.d(IMapView.LOGTAG, "mMultiTouchController handled onTouchEvent");
                }
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.mGestureDetector.onTouchEvent(rotateTouchEvent)) {
                if (a.a().U()) {
                    Log.d(IMapView.LOGTAG, "mGestureDetector handled onTouchEvent");
                }
                z4 = true;
            }
            if (z4) {
                if (rotateTouchEvent != motionEvent) {
                    rotateTouchEvent.recycle();
                }
                return true;
            }
            if (rotateTouchEvent != motionEvent) {
                rotateTouchEvent.recycle();
            }
            if (a.a().U()) {
                Log.d(IMapView.LOGTAG, "no-one handled onTouchEvent");
            }
            return false;
        } finally {
            if (rotateTouchEvent != motionEvent) {
                rotateTouchEvent.recycle();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2, null, 8, 0, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public BoundingBox getBoundingBox() {
        return getProjection().getBoundingBox();
    }

    @Override // org.osmdroid.api.IMapView
    public IMapController getController() {
        return this.mController;
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public Object getDraggableObjectAtPoint(MultiTouchController.PointInfo pointInfo) {
        if (isAnimating()) {
            return null;
        }
        setMultiTouchScaleInitPoint(pointInfo.getX(), pointInfo.getY());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeoPoint getExpectedCenter() {
        return this.mCenter;
    }

    public Rect getIntrinsicScreenRect(Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(0, 0, getWidth(), getHeight());
        return rect;
    }

    @Override // org.osmdroid.api.IMapView
    public double getLatitudeSpanDouble() {
        return getBoundingBox().getLatitudeSpan();
    }

    @Override // org.osmdroid.api.IMapView
    public double getLongitudeSpanDouble() {
        return getBoundingBox().getLongitudeSpan();
    }

    @Override // org.osmdroid.api.IMapView
    public IGeoPoint getMapCenter() {
        return getMapCenter(null);
    }

    public int getMapCenterOffsetX() {
        return this.mMapCenterOffsetX;
    }

    public int getMapCenterOffsetY() {
        return this.mMapCenterOffsetY;
    }

    public float getMapOrientation() {
        return this.mapOrientation;
    }

    public TilesOverlay getMapOverlay() {
        return this.mMapOverlay;
    }

    @Deprecated
    public float getMapScale() {
        return 1.0f;
    }

    public long getMapScrollX() {
        return this.mMapScrollX;
    }

    public long getMapScrollY() {
        return this.mMapScrollY;
    }

    @Override // org.osmdroid.api.IMapView
    public double getMaxZoomLevel() {
        Double d5 = this.mMaximumZoomLevel;
        return d5 == null ? this.mMapOverlay.getMaximumZoomLevel() : d5.doubleValue();
    }

    public double getMinZoomLevel() {
        Double d5 = this.mMinimumZoomLevel;
        return d5 == null ? this.mMapOverlay.getMinimumZoomLevel() : d5.doubleValue();
    }

    public OverlayManager getOverlayManager() {
        return this.mOverlayManager;
    }

    public List<Overlay> getOverlays() {
        return getOverlayManager().overlays();
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public void getPositionAndScale(Object obj, MultiTouchController.PositionAndScale positionAndScale) {
        startAnimation();
        PointF pointF = this.mMultiTouchScaleInitPoint;
        positionAndScale.set(pointF.x, pointF.y, true, 1.0f, false, 0.0f, 0.0f, false, 0.0f);
    }

    public MapViewRepository getRepository() {
        return this.mRepository;
    }

    public Rect getScreenRect(Rect rect) {
        Rect intrinsicScreenRect = getIntrinsicScreenRect(rect);
        if (getMapOrientation() != 0.0f && getMapOrientation() != 180.0f) {
            GeometryMath.getBoundingBoxForRotatatedRectangle(intrinsicScreenRect, intrinsicScreenRect.centerX(), intrinsicScreenRect.centerY(), getMapOrientation(), intrinsicScreenRect);
        }
        return intrinsicScreenRect;
    }

    public Scroller getScroller() {
        return this.mScroller;
    }

    public MapTileProviderBase getTileProvider() {
        return this.mTileProvider;
    }

    public Handler getTileRequestCompleteHandler() {
        return this.mTileRequestCompleteHandler;
    }

    public float getTilesScaleFactor() {
        return this.mTilesScaleFactor;
    }

    public CustomZoomButtonsController getZoomController() {
        return this.mZoomController;
    }

    @Override // org.osmdroid.api.IMapView
    @Deprecated
    public int getZoomLevel() {
        return (int) getZoomLevelDouble();
    }

    @Override // org.osmdroid.api.IMapView
    public double getZoomLevelDouble() {
        return this.mZoomLevel;
    }

    public void invalidateMapCoordinates(Rect rect) {
        invalidateMapCoordinates(rect.left, rect.top, rect.right, rect.bottom, false);
    }

    public boolean isAnimating() {
        return this.mIsAnimating.get();
    }

    public boolean isFlingEnabled() {
        return this.enableFling;
    }

    public boolean isHorizontalMapRepetitionEnabled() {
        return this.horizontalMapRepetitionEnabled;
    }

    public boolean isLayoutOccurred() {
        return this.mLayoutOccurred;
    }

    public boolean isScrollableAreaLimitLatitude() {
        return this.mScrollableAreaLimitLatitude;
    }

    public boolean isScrollableAreaLimitLongitude() {
        return this.mScrollableAreaLimitLongitude;
    }

    public boolean isTilesScaledToDpi() {
        return this.mTilesScaledToDpi;
    }

    public boolean isVerticalMapRepetitionEnabled() {
        return this.verticalMapRepetitionEnabled;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x005c. Please report as an issue. */
    protected void myOnLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int paddingTop;
        long paddingTop2;
        int i9;
        long j5;
        int paddingTop3;
        resetProjection();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredWidth = childAt.getMeasuredWidth();
                getProjection().toPixels(layoutParams.geoPoint, this.mLayoutPoint);
                if (getMapOrientation() != 0.0f) {
                    Projection projection = getProjection();
                    Point point = this.mLayoutPoint;
                    Point rotateAndScalePoint = projection.rotateAndScalePoint(point.x, point.y, null);
                    Point point2 = this.mLayoutPoint;
                    point2.x = rotateAndScalePoint.x;
                    point2.y = rotateAndScalePoint.y;
                }
                Point point3 = this.mLayoutPoint;
                long j6 = point3.x;
                long j7 = point3.y;
                switch (layoutParams.alignment) {
                    case 1:
                        j6 += getPaddingLeft();
                        paddingTop = getPaddingTop();
                        j7 += paddingTop;
                        break;
                    case 2:
                        j6 = (getPaddingLeft() + j6) - (measuredWidth / 2);
                        paddingTop = getPaddingTop();
                        j7 += paddingTop;
                        break;
                    case 3:
                        j6 = (getPaddingLeft() + j6) - measuredWidth;
                        paddingTop = getPaddingTop();
                        j7 += paddingTop;
                        break;
                    case 4:
                        j6 += getPaddingLeft();
                        paddingTop2 = getPaddingTop() + j7;
                        i9 = measuredHeight / 2;
                        j5 = i9;
                        j7 = paddingTop2 - j5;
                        break;
                    case 5:
                        j6 = (getPaddingLeft() + j6) - (measuredWidth / 2);
                        paddingTop2 = getPaddingTop() + j7;
                        i9 = measuredHeight / 2;
                        j5 = i9;
                        j7 = paddingTop2 - j5;
                        break;
                    case 6:
                        j6 = (getPaddingLeft() + j6) - measuredWidth;
                        paddingTop2 = getPaddingTop() + j7;
                        i9 = measuredHeight / 2;
                        j5 = i9;
                        j7 = paddingTop2 - j5;
                        break;
                    case 7:
                        j6 += getPaddingLeft();
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j7;
                        j5 = measuredHeight;
                        j7 = paddingTop2 - j5;
                        break;
                    case 8:
                        j6 = (getPaddingLeft() + j6) - (measuredWidth / 2);
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j7;
                        j5 = measuredHeight;
                        j7 = paddingTop2 - j5;
                        break;
                    case 9:
                        j6 = (getPaddingLeft() + j6) - measuredWidth;
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j7;
                        j5 = measuredHeight;
                        j7 = paddingTop2 - j5;
                        break;
                }
                long j8 = j6 + layoutParams.offsetX;
                long j9 = j7 + layoutParams.offsetY;
                childAt.layout(TileSystem.truncateToInt(j8), TileSystem.truncateToInt(j9), TileSystem.truncateToInt(j8 + measuredWidth), TileSystem.truncateToInt(j9 + measuredHeight));
            }
        }
        if (!isLayoutOccurred()) {
            this.mLayoutOccurred = true;
            Iterator<OnFirstLayoutListener> it = this.mOnFirstLayoutListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstLayout(this, i5, i6, i7, i8);
            }
            this.mOnFirstLayoutListeners.clear();
        }
        resetProjection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetach() {
        getOverlayManager().onDetach(this);
        this.mTileProvider.detach();
        CustomZoomButtonsController customZoomButtonsController = this.mZoomController;
        if (customZoomButtonsController != null) {
            customZoomButtonsController.onDetach();
        }
        Handler handler = this.mTileRequestCompleteHandler;
        if (handler instanceof SimpleInvalidationHandler) {
            ((SimpleInvalidationHandler) handler).destroy();
        }
        this.mTileRequestCompleteHandler = null;
        Projection projection = this.mProjection;
        if (projection != null) {
            projection.detach();
        }
        this.mProjection = null;
        this.mRepository.onDetach();
        this.mListners.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.mDestroyModeOnDetach) {
            onDetach();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (!getOverlayManager().onKeyDown(i5, keyEvent, this) && !super.onKeyDown(i5, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (!getOverlayManager().onKeyUp(i5, keyEvent, this) && !super.onKeyUp(i5, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        myOnLayout(z4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        measureChildren(i5, i6);
        super.onMeasure(i5, i6);
    }

    public void onPause() {
        getOverlayManager().onPause();
    }

    public void onResume() {
        getOverlayManager().onResume();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (getOverlayManager().onTrackballEvent(motionEvent, this)) {
            return true;
        }
        scrollBy((int) (motionEvent.getX() * 25.0f), (int) (motionEvent.getY() * 25.0f));
        return super.onTrackballEvent(motionEvent);
    }

    public void postInvalidateMapCoordinates(int i5, int i6, int i7, int i8) {
        invalidateMapCoordinates(i5, i6, i7, i8, true);
    }

    public void removeMapListener(MapListener mapListener) {
        this.mListners.remove(mapListener);
    }

    public void removeOnFirstLayoutListener(OnFirstLayoutListener onFirstLayoutListener) {
        this.mOnFirstLayoutListeners.remove(onFirstLayoutListener);
    }

    public void resetMultiTouchScale() {
        this.mMultiTouchScaleCurrentPoint = null;
    }

    public void resetScrollableAreaLimitLatitude() {
        this.mScrollableAreaLimitLatitude = false;
    }

    public void resetScrollableAreaLimitLongitude() {
        this.mScrollableAreaLimitLongitude = false;
    }

    public void resetTilesScaleFactor() {
        this.mTilesScaleFactor = 1.0f;
        updateTileSizeForDensity(getTileProvider().getTileSource());
    }

    @Override // android.view.View
    public void scrollBy(int i5, int i6) {
        scrollTo((int) (getMapScrollX() + i5), (int) (getMapScrollY() + i6));
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i6) {
        setMapScroll(i5, i6);
        resetProjection();
        invalidate();
        if (getMapOrientation() != 0.0f) {
            myOnLayout(true, getLeft(), getTop(), getRight(), getBottom());
        }
        ScrollEvent scrollEvent = null;
        for (MapListener mapListener : this.mListners) {
            if (scrollEvent == null) {
                scrollEvent = new ScrollEvent(this, i5, i6);
            }
            mapListener.onScroll(scrollEvent);
        }
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public void selectObject(Object obj, MultiTouchController.PointInfo pointInfo) {
        if (this.mZoomRounding) {
            this.mZoomLevel = Math.round(this.mZoomLevel);
            invalidate();
        }
        resetMultiTouchScale();
    }

    @Override // android.view.View, org.osmdroid.api.IMapView
    public void setBackgroundColor(int i5) {
        this.mMapOverlay.setLoadingBackgroundColor(i5);
        invalidate();
    }

    @Deprecated
    public void setBuiltInZoomControls(boolean z4) {
        CustomZoomButtonsController.Visibility visibility;
        CustomZoomButtonsController customZoomButtonsController = this.mZoomController;
        if (z4) {
            visibility = CustomZoomButtonsController.Visibility.SHOW_AND_FADEOUT;
        } else {
            visibility = CustomZoomButtonsController.Visibility.NEVER;
        }
        customZoomButtonsController.setVisibility(visibility);
    }

    public void setDestroyMode(boolean z4) {
        this.mDestroyModeOnDetach = z4;
    }

    public void setExpectedCenter(IGeoPoint iGeoPoint, long j5, long j6) {
        GeoPoint currentCenter = getProjection().getCurrentCenter();
        this.mCenter = (GeoPoint) iGeoPoint;
        setMapScroll(-j5, -j6);
        resetProjection();
        if (!getProjection().getCurrentCenter().equals(currentCenter)) {
            ScrollEvent scrollEvent = null;
            for (MapListener mapListener : this.mListners) {
                if (scrollEvent == null) {
                    scrollEvent = new ScrollEvent(this, 0, 0);
                }
                mapListener.onScroll(scrollEvent);
            }
        }
        invalidate();
    }

    public void setFlingEnabled(boolean z4) {
        this.enableFling = z4;
    }

    public void setHorizontalMapRepetitionEnabled(boolean z4) {
        this.horizontalMapRepetitionEnabled = z4;
        this.mMapOverlay.setHorizontalWrapEnabled(z4);
        resetProjection();
        invalidate();
    }

    @Deprecated
    public void setInitCenter(IGeoPoint iGeoPoint) {
        setExpectedCenter(iGeoPoint);
    }

    @Deprecated
    void setMapCenter(IGeoPoint iGeoPoint) {
        getController().animateTo(iGeoPoint);
    }

    public void setMapCenterOffset(int i5, int i6) {
        this.mMapCenterOffsetX = i5;
        this.mMapCenterOffsetY = i6;
    }

    @Deprecated
    public void setMapListener(MapListener mapListener) {
        this.mListners.add(mapListener);
    }

    public void setMapOrientation(float f5) {
        setMapOrientation(f5, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMapScroll(long j5, long j6) {
        this.mMapScrollX = j5;
        this.mMapScrollY = j6;
        requestLayout();
    }

    public void setMaxZoomLevel(Double d5) {
        this.mMaximumZoomLevel = d5;
    }

    public void setMinZoomLevel(Double d5) {
        this.mMinimumZoomLevel = d5;
    }

    public void setMultiTouchControls(boolean z4) {
        this.mMultiTouchController = z4 ? new MultiTouchController<>(this, false) : null;
    }

    protected void setMultiTouchScale(float f5) {
        setZoomLevel((Math.log(f5) / Math.log(2.0d)) + this.mStartAnimationZoom);
    }

    protected void setMultiTouchScaleCurrentPoint(float f5, float f6) {
        this.mMultiTouchScaleCurrentPoint = new PointF(f5, f6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMultiTouchScaleInitPoint(float f5, float f6) {
        this.mMultiTouchScaleInitPoint.set(f5, f6);
        Point unrotateAndScalePoint = getProjection().unrotateAndScalePoint((int) f5, (int) f6, null);
        getProjection().fromPixels(unrotateAndScalePoint.x, unrotateAndScalePoint.y, this.mMultiTouchScaleGeoPoint);
        setMultiTouchScaleCurrentPoint(f5, f6);
    }

    public void setOverlayManager(OverlayManager overlayManager) {
        this.mOverlayManager = overlayManager;
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public boolean setPositionAndScale(Object obj, MultiTouchController.PositionAndScale positionAndScale, MultiTouchController.PointInfo pointInfo) {
        setMultiTouchScaleCurrentPoint(positionAndScale.getXOff(), positionAndScale.getYOff());
        setMultiTouchScale(positionAndScale.getScale());
        requestLayout();
        invalidate();
        return true;
    }

    @Deprecated
    protected void setProjection(Projection projection) {
        this.mProjection = projection;
    }

    public void setScrollableAreaLimitDouble(BoundingBox boundingBox) {
        if (boundingBox == null) {
            resetScrollableAreaLimitLatitude();
            resetScrollableAreaLimitLongitude();
        } else {
            setScrollableAreaLimitLatitude(boundingBox.getActualNorth(), boundingBox.getActualSouth(), 0);
            setScrollableAreaLimitLongitude(boundingBox.getLonWest(), boundingBox.getLonEast(), 0);
        }
    }

    public void setScrollableAreaLimitLatitude(double d5, double d6, int i5) {
        this.mScrollableAreaLimitLatitude = true;
        this.mScrollableAreaLimitNorth = d5;
        this.mScrollableAreaLimitSouth = d6;
        this.mScrollableAreaLimitExtraPixelHeight = i5;
    }

    public void setScrollableAreaLimitLongitude(double d5, double d6, int i5) {
        this.mScrollableAreaLimitLongitude = true;
        this.mScrollableAreaLimitWest = d5;
        this.mScrollableAreaLimitEast = d6;
        this.mScrollableAreaLimitExtraPixelWidth = i5;
    }

    public void setTileProvider(MapTileProviderBase mapTileProviderBase) {
        this.mTileProvider.detach();
        this.mTileProvider.clearTileCache();
        this.mTileProvider = mapTileProviderBase;
        mapTileProviderBase.getTileRequestCompleteHandlers().add(this.mTileRequestCompleteHandler);
        updateTileSizeForDensity(this.mTileProvider.getTileSource());
        TilesOverlay tilesOverlay = new TilesOverlay(this.mTileProvider, getContext(), this.horizontalMapRepetitionEnabled, this.verticalMapRepetitionEnabled);
        this.mMapOverlay = tilesOverlay;
        this.mOverlayManager.setTilesOverlay(tilesOverlay);
        invalidate();
    }

    public void setTileSource(e eVar) {
        this.mTileProvider.setTileSource(eVar);
        updateTileSizeForDensity(eVar);
        checkZoomButtons();
        setZoomLevel(this.mZoomLevel);
        postInvalidate();
    }

    public void setTilesScaleFactor(float f5) {
        this.mTilesScaleFactor = f5;
        updateTileSizeForDensity(getTileProvider().getTileSource());
    }

    public void setTilesScaledToDpi(boolean z4) {
        this.mTilesScaledToDpi = z4;
        updateTileSizeForDensity(getTileProvider().getTileSource());
    }

    public void setUseDataConnection(boolean z4) {
        this.mMapOverlay.setUseDataConnection(z4);
    }

    public void setVerticalMapRepetitionEnabled(boolean z4) {
        this.verticalMapRepetitionEnabled = z4;
        this.mMapOverlay.setVerticalWrapEnabled(z4);
        resetProjection();
        invalidate();
    }

    public double setZoomLevel(double d5) {
        double max = Math.max(getMinZoomLevel(), Math.min(getMaxZoomLevel(), d5));
        double d6 = this.mZoomLevel;
        if (max != d6) {
            Scroller scroller = this.mScroller;
            if (scroller != null) {
                scroller.forceFinished(true);
            }
            this.mIsFlinging = false;
        }
        GeoPoint currentCenter = getProjection().getCurrentCenter();
        this.mZoomLevel = max;
        setExpectedCenter(currentCenter);
        checkZoomButtons();
        ZoomEvent zoomEvent = null;
        if (isLayoutOccurred()) {
            getController().setCenter(currentCenter);
            Point point = new Point();
            Projection projection = getProjection();
            OverlayManager overlayManager = getOverlayManager();
            PointF pointF = this.mMultiTouchScaleInitPoint;
            if (overlayManager.onSnapToItem((int) pointF.x, (int) pointF.y, point, this)) {
                getController().animateTo(projection.fromPixels(point.x, point.y, null, false));
            }
            this.mTileProvider.rescaleCache(projection, max, d6, getScreenRect(this.mRescaleScreenRect));
            this.pauseFling = true;
        }
        if (max != d6) {
            for (MapListener mapListener : this.mListners) {
                if (zoomEvent == null) {
                    zoomEvent = new ZoomEvent(this, max);
                }
                mapListener.onZoom(zoomEvent);
            }
        }
        requestLayout();
        invalidate();
        return this.mZoomLevel;
    }

    public void setZoomRounding(boolean z4) {
        this.mZoomRounding = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startAnimation() {
        this.mStartAnimationZoom = getZoomLevelDouble();
    }

    public boolean useDataConnection() {
        return this.mMapOverlay.useDataConnection();
    }

    @Deprecated
    boolean zoomIn() {
        return getController().zoomIn();
    }

    @Deprecated
    boolean zoomInFixing(IGeoPoint iGeoPoint) {
        Point pixels = getProjection().toPixels(iGeoPoint, null);
        return getController().zoomInFixing(pixels.x, pixels.y);
    }

    @Deprecated
    boolean zoomOut() {
        return getController().zoomOut();
    }

    @Deprecated
    boolean zoomOutFixing(IGeoPoint iGeoPoint) {
        Point pixels = getProjection().toPixels(iGeoPoint, null);
        return zoomOutFixing(pixels.x, pixels.y);
    }

    public void zoomToBoundingBox(BoundingBox boundingBox, boolean z4) {
        zoomToBoundingBox(boundingBox, z4, 0);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase, Handler handler, AttributeSet attributeSet, boolean z4) {
        super(context, attributeSet);
        this.mZoomLevel = 0.0d;
        this.mIsAnimating = new AtomicBoolean(false);
        this.mMultiTouchScaleInitPoint = new PointF();
        this.mMultiTouchScaleGeoPoint = new GeoPoint(0.0d, 0.0d);
        this.mapOrientation = 0.0f;
        this.mInvalidateRect = new Rect();
        this.mTilesScaledToDpi = false;
        this.mTilesScaleFactor = 1.0f;
        this.mRotateScalePoint = new Point();
        this.mLayoutPoint = new Point();
        this.mOnFirstLayoutListeners = new LinkedList<>();
        this.mLayoutOccurred = false;
        this.horizontalMapRepetitionEnabled = true;
        this.verticalMapRepetitionEnabled = true;
        this.mListners = new ArrayList();
        this.mRepository = new MapViewRepository(this);
        this.mRescaleScreenRect = new Rect();
        this.mDestroyModeOnDetach = true;
        this.enableFling = true;
        this.pauseFling = false;
        a.a().H(context);
        if (isInEditMode()) {
            this.mTileRequestCompleteHandler = null;
            this.mController = null;
            this.mZoomController = null;
            this.mScroller = null;
            this.mGestureDetector = null;
            return;
        }
        if (!z4) {
            setLayerType(1, null);
        }
        this.mController = new MapController(this);
        this.mScroller = new Scroller(context);
        mapTileProviderBase = mapTileProviderBase == null ? new MapTileProviderBasic(context.getApplicationContext(), getTileSourceFromAttributes(attributeSet)) : mapTileProviderBase;
        this.mTileRequestCompleteHandler = handler == null ? new SimpleInvalidationHandler(this) : handler;
        this.mTileProvider = mapTileProviderBase;
        mapTileProviderBase.getTileRequestCompleteHandlers().add(this.mTileRequestCompleteHandler);
        updateTileSizeForDensity(this.mTileProvider.getTileSource());
        this.mMapOverlay = new TilesOverlay(this.mTileProvider, context, this.horizontalMapRepetitionEnabled, this.verticalMapRepetitionEnabled);
        this.mOverlayManager = new DefaultOverlayManager(this.mMapOverlay);
        CustomZoomButtonsController customZoomButtonsController = new CustomZoomButtonsController(this);
        this.mZoomController = customZoomButtonsController;
        customZoomButtonsController.setOnZoomListener(new MapViewZoomListener());
        checkZoomButtons();
        GestureDetector gestureDetector = new GestureDetector(context, new MapViewGestureDetectorListener());
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new MapViewDoubleClickListener());
        if (a.a().a()) {
            setHasTransientState(true);
        }
        customZoomButtonsController.setVisibility(CustomZoomButtonsController.Visibility.SHOW_AND_FADEOUT);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public IGeoPoint getMapCenter(GeoPoint geoPoint) {
        return getProjection().fromPixels(getWidth() / 2, getHeight() / 2, geoPoint, false);
    }

    @Override // org.osmdroid.api.IMapView
    public Projection getProjection() {
        if (this.mProjection == null) {
            Projection projection = new Projection(this);
            this.mProjection = projection;
            projection.adjustOffsets(this.mMultiTouchScaleGeoPoint, this.mMultiTouchScaleCurrentPoint);
            if (this.mScrollableAreaLimitLatitude) {
                projection.adjustOffsets(this.mScrollableAreaLimitNorth, this.mScrollableAreaLimitSouth, true, this.mScrollableAreaLimitExtraPixelHeight);
            }
            if (this.mScrollableAreaLimitLongitude) {
                projection.adjustOffsets(this.mScrollableAreaLimitWest, this.mScrollableAreaLimitEast, false, this.mScrollableAreaLimitExtraPixelWidth);
            }
            this.mImpossibleFlinging = projection.setMapScroll(this);
        }
        return this.mProjection;
    }

    @Deprecated
    public double getZoomLevel(boolean z4) {
        return getZoomLevelDouble();
    }

    public void invalidateMapCoordinates(int i5, int i6, int i7, int i8) {
        invalidateMapCoordinates(i5, i6, i7, i8, false);
    }

    @Deprecated
    void setMapCenter(int i5, int i6) {
        setMapCenter(new GeoPoint(i5, i6));
    }

    public void setMapOrientation(float f5, boolean z4) {
        this.mapOrientation = f5 % 360.0f;
        if (z4) {
            requestLayout();
            invalidate();
        }
    }

    public double zoomToBoundingBox(BoundingBox boundingBox, boolean z4, int i5, double d5, Long l5) {
        int i6 = i5 * 2;
        double boundingBoxZoom = mTileSystem.getBoundingBoxZoom(boundingBox, getWidth() - i6, getHeight() - i6);
        if (boundingBoxZoom == Double.MIN_VALUE || boundingBoxZoom > d5) {
            boundingBoxZoom = d5;
        }
        double min = Math.min(getMaxZoomLevel(), Math.max(boundingBoxZoom, getMinZoomLevel()));
        GeoPoint centerWithDateLine = boundingBox.getCenterWithDateLine();
        Projection projection = new Projection(min, getWidth(), getHeight(), centerWithDateLine, getMapOrientation(), isHorizontalMapRepetitionEnabled(), isVerticalMapRepetitionEnabled(), getMapCenterOffsetX(), getMapCenterOffsetY());
        Point point = new Point();
        double centerLongitude = boundingBox.getCenterLongitude();
        projection.toPixels(new GeoPoint(boundingBox.getActualNorth(), centerLongitude), point);
        int i7 = point.y;
        projection.toPixels(new GeoPoint(boundingBox.getActualSouth(), centerLongitude), point);
        int height = ((getHeight() - point.y) - i7) / 2;
        if (height != 0) {
            projection.adjustOffsets(0L, height);
            projection.fromPixels(getWidth() / 2, getHeight() / 2, centerWithDateLine);
        }
        if (z4) {
            getController().animateTo(centerWithDateLine, Double.valueOf(min), l5);
        } else {
            getController().setZoom(min);
            getController().setCenter(centerWithDateLine);
        }
        return min;
    }

    private void invalidateMapCoordinates(int i5, int i6, int i7, int i8, boolean z4) {
        this.mInvalidateRect.set(i5, i6, i7, i8);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        if (getMapOrientation() != 0.0f) {
            GeometryMath.getBoundingBoxForRotatatedRectangle(this.mInvalidateRect, width, height, getMapOrientation() + 180.0f, this.mInvalidateRect);
        }
        if (z4) {
            Rect rect = this.mInvalidateRect;
            super.postInvalidate(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            super.invalidate(this.mInvalidateRect);
        }
    }

    @Deprecated
    void setMapCenter(double d5, double d6) {
        setMapCenter(new GeoPoint(d5, d6));
    }

    @Deprecated
    boolean zoomInFixing(int i5, int i6) {
        return getController().zoomInFixing(i5, i6);
    }

    @Deprecated
    boolean zoomOutFixing(int i5, int i6) {
        return getController().zoomOutFixing(i5, i6);
    }

    /* loaded from: classes4.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public static final int BOTTOM_CENTER = 8;
        public static final int BOTTOM_LEFT = 7;
        public static final int BOTTOM_RIGHT = 9;
        public static final int CENTER = 5;
        public static final int CENTER_LEFT = 4;
        public static final int CENTER_RIGHT = 6;
        public static final int TOP_CENTER = 2;
        public static final int TOP_LEFT = 1;
        public static final int TOP_RIGHT = 3;
        public int alignment;
        public IGeoPoint geoPoint;
        public int offsetX;
        public int offsetY;

        public LayoutParams(int i5, int i6, IGeoPoint iGeoPoint, int i7, int i8, int i9) {
            super(i5, i6);
            if (iGeoPoint != null) {
                this.geoPoint = iGeoPoint;
            } else {
                this.geoPoint = new GeoPoint(0.0d, 0.0d);
            }
            this.alignment = i7;
            this.offsetX = i8;
            this.offsetY = i9;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.geoPoint = new GeoPoint(0.0d, 0.0d);
            this.alignment = 8;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public void setExpectedCenter(IGeoPoint iGeoPoint) {
        setExpectedCenter(iGeoPoint, 0L, 0L);
    }

    public void zoomToBoundingBox(BoundingBox boundingBox, boolean z4, int i5) {
        zoomToBoundingBox(boundingBox, z4, i5, getMaxZoomLevel(), null);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        this(context, null, null, attributeSet);
    }

    public MapView(Context context) {
        this(context, null, null, null);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase) {
        this(context, mapTileProviderBase, null);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase, Handler handler) {
        this(context, mapTileProviderBase, handler, null);
    }
}
