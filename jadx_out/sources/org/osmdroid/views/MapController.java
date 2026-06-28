package org.osmdroid.views;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.config.a;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.MyMath;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public class MapController implements IMapController, MapView.OnFirstLayoutListener {
    private Animator mCurrentAnimator;
    private TimeInterpolator mInterpolator;
    protected final MapView mMapView;
    private ScaleAnimation mZoomInAnimationOld;
    private ScaleAnimation mZoomOutAnimationOld;
    private double mTargetZoomLevel = 0.0d;
    private ReplayController mReplayController = new ReplayController(this, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.osmdroid.views.MapController$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$MapController$ReplayType;

        static {
            int[] iArr = new int[ReplayType.values().length];
            $SwitchMap$org$osmdroid$views$MapController$ReplayType = iArr;
            try {
                iArr[ReplayType.AnimateToGeoPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$MapController$ReplayType[ReplayType.AnimateToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$MapController$ReplayType[ReplayType.SetCenterPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$osmdroid$views$MapController$ReplayType[ReplayType.ZoomToSpanPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    /* loaded from: classes4.dex */
    public static class MapAnimatorListener implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        private final GeoPoint mCenter = new GeoPoint(0.0d, 0.0d);
        private final IGeoPoint mCenterEnd;
        private final IGeoPoint mCenterStart;
        private final MapController mMapController;
        private final Float mOrientationSpan;
        private final Float mOrientationStart;
        private final Double mZoomEnd;
        private final Double mZoomStart;

        public MapAnimatorListener(MapController mapController, Double d5, Double d6, IGeoPoint iGeoPoint, IGeoPoint iGeoPoint2, Float f5, Float f6, Boolean bool) {
            this.mMapController = mapController;
            this.mZoomStart = d5;
            this.mZoomEnd = d6;
            this.mCenterStart = iGeoPoint;
            this.mCenterEnd = iGeoPoint2;
            if (f6 == null) {
                this.mOrientationStart = null;
                this.mOrientationSpan = null;
            } else {
                this.mOrientationStart = f5;
                this.mOrientationSpan = Float.valueOf((float) MyMath.getAngleDifference(f5.floatValue(), f6.floatValue(), bool));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mMapController.onAnimationEnd();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.mMapController.onAnimationEnd();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.mMapController.onAnimationStart();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.mZoomEnd != null) {
                this.mMapController.mMapView.setZoomLevel(this.mZoomStart.doubleValue() + ((this.mZoomEnd.doubleValue() - this.mZoomStart.doubleValue()) * floatValue));
            }
            if (this.mOrientationSpan != null) {
                this.mMapController.mMapView.setMapOrientation(this.mOrientationStart.floatValue() + (this.mOrientationSpan.floatValue() * floatValue));
            }
            if (this.mCenterEnd != null) {
                MapView mapView = this.mMapController.mMapView;
                TileSystem tileSystem = MapView.getTileSystem();
                double cleanLongitude = tileSystem.cleanLongitude(this.mCenterStart.getLongitude());
                double d5 = floatValue;
                double cleanLongitude2 = tileSystem.cleanLongitude(cleanLongitude + ((tileSystem.cleanLongitude(this.mCenterEnd.getLongitude()) - cleanLongitude) * d5));
                double cleanLatitude = tileSystem.cleanLatitude(this.mCenterStart.getLatitude());
                this.mCenter.setCoords(tileSystem.cleanLatitude(cleanLatitude + ((tileSystem.cleanLatitude(this.mCenterEnd.getLatitude()) - cleanLatitude) * d5)), cleanLongitude2);
                this.mMapController.mMapView.setExpectedCenter(this.mCenter);
            }
            this.mMapController.mMapView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class ReplayController {
        private LinkedList<ReplayClass> mReplayList;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public class ReplayClass {
            private final Boolean mClockwise;
            private IGeoPoint mGeoPoint;
            private final Float mOrientation;
            private Point mPoint;
            private ReplayType mReplayType;
            private final Long mSpeed;
            private final Double mZoom;

            public ReplayClass(ReplayController replayController, ReplayType replayType, Point point, IGeoPoint iGeoPoint) {
                this(replayType, point, iGeoPoint, null, null, null, null);
            }

            public ReplayClass(ReplayType replayType, Point point, IGeoPoint iGeoPoint, Double d5, Long l5, Float f5, Boolean bool) {
                this.mReplayType = replayType;
                this.mPoint = point;
                this.mGeoPoint = iGeoPoint;
                this.mSpeed = l5;
                this.mZoom = d5;
                this.mOrientation = f5;
                this.mClockwise = bool;
            }
        }

        private ReplayController() {
            this.mReplayList = new LinkedList<>();
        }

        public void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5, Float f5, Boolean bool) {
            this.mReplayList.add(new ReplayClass(ReplayType.AnimateToGeoPoint, null, iGeoPoint, d5, l5, f5, bool));
        }

        public void replayCalls() {
            Iterator<ReplayClass> it = this.mReplayList.iterator();
            while (it.hasNext()) {
                ReplayClass next = it.next();
                int i5 = AnonymousClass1.$SwitchMap$org$osmdroid$views$MapController$ReplayType[next.mReplayType.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 4 && next.mPoint != null) {
                                MapController.this.zoomToSpan(next.mPoint.x, next.mPoint.y);
                            }
                        } else if (next.mGeoPoint != null) {
                            MapController.this.setCenter(next.mGeoPoint);
                        }
                    } else if (next.mPoint != null) {
                        MapController.this.animateTo(next.mPoint.x, next.mPoint.y);
                    }
                } else if (next.mGeoPoint != null) {
                    MapController.this.animateTo(next.mGeoPoint, next.mZoom, next.mSpeed, next.mOrientation, next.mClockwise);
                }
            }
            this.mReplayList.clear();
        }

        public void setCenter(IGeoPoint iGeoPoint) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.SetCenterPoint, null, iGeoPoint));
        }

        public void zoomToSpan(int i5, int i6) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.ZoomToSpanPoint, new Point(i5, i6), null));
        }

        public void animateTo(int i5, int i6) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.AnimateToPoint, new Point(i5, i6), null));
        }

        public void zoomToSpan(double d5, double d6) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.ZoomToSpanPoint, new Point((int) (d5 * 1000000.0d), (int) (d6 * 1000000.0d)), null));
        }

        /* synthetic */ ReplayController(MapController mapController, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum ReplayType {
        ZoomToSpanPoint,
        AnimateToPoint,
        AnimateToGeoPoint,
        SetCenterPoint
    }

    /* loaded from: classes4.dex */
    protected static class ZoomAnimationListener implements Animation.AnimationListener {
        private MapController mMapController;

        public ZoomAnimationListener(MapController mapController) {
            this.mMapController = mapController;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.mMapController.onAnimationEnd();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.mMapController.onAnimationStart();
        }
    }

    public MapController(MapView mapView) {
        this.mMapView = mapView;
        if (!mapView.isLayoutOccurred()) {
            mapView.addOnFirstLayoutListener(this);
        }
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint) {
        animateTo(iGeoPoint, null, null);
    }

    protected void onAnimationEnd() {
        this.mMapView.mIsAnimating.set(false);
        this.mMapView.resetMultiTouchScale();
        this.mCurrentAnimator = null;
        this.mMapView.invalidate();
    }

    protected void onAnimationStart() {
        this.mMapView.mIsAnimating.set(true);
    }

    @Override // org.osmdroid.views.MapView.OnFirstLayoutListener
    public void onFirstLayout(View view, int i5, int i6, int i7, int i8) {
        this.mReplayController.replayCalls();
    }

    @Override // org.osmdroid.api.IMapController
    public void scrollBy(int i5, int i6) {
        this.mMapView.scrollBy(i5, i6);
    }

    @Override // org.osmdroid.api.IMapController
    public void setCenter(IGeoPoint iGeoPoint) {
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.setCenter(iGeoPoint);
        } else {
            this.mMapView.setExpectedCenter(iGeoPoint);
        }
    }

    @Override // org.osmdroid.api.IMapController
    public int setZoom(int i5) {
        return (int) setZoom(i5);
    }

    @Override // org.osmdroid.api.IMapController
    public void stopAnimation(boolean z4) {
        if (!this.mMapView.getScroller().isFinished()) {
            if (z4) {
                MapView mapView = this.mMapView;
                mapView.mIsFlinging = false;
                mapView.getScroller().abortAnimation();
            } else {
                stopPanning();
            }
        }
        Animator animator = this.mCurrentAnimator;
        if (this.mMapView.mIsAnimating.get()) {
            if (z4) {
                animator.end();
            } else {
                animator.cancel();
            }
        }
    }

    @Override // org.osmdroid.api.IMapController
    public void stopPanning() {
        MapView mapView = this.mMapView;
        mapView.mIsFlinging = false;
        mapView.getScroller().forceFinished(true);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomIn() {
        return zoomIn(null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomInFixing(int i5, int i6, Long l5) {
        return zoomToFixing(this.mMapView.getZoomLevelDouble() + 1.0d, i5, i6, l5);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomOut(Long l5) {
        return zoomTo(this.mMapView.getZoomLevelDouble() - 1.0d, l5);
    }

    @Override // org.osmdroid.api.IMapController
    @Deprecated
    public boolean zoomOutFixing(int i5, int i6) {
        return zoomToFixing(this.mMapView.getZoomLevelDouble() - 1.0d, i5, i6, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(int i5) {
        return zoomTo(i5, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(int i5, int i6, int i7, Long l5) {
        return zoomToFixing(i5, i6, i7, l5);
    }

    @Override // org.osmdroid.api.IMapController
    public void zoomToSpan(double d5, double d6) {
        if (d5 <= 0.0d || d6 <= 0.0d) {
            return;
        }
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.zoomToSpan(d5, d6);
            return;
        }
        BoundingBox boundingBox = this.mMapView.getProjection().getBoundingBox();
        double zoomLevel = this.mMapView.getProjection().getZoomLevel();
        double max = Math.max(d5 / boundingBox.getLatitudeSpan(), d6 / boundingBox.getLongitudeSpan());
        if (max > 1.0d) {
            this.mMapView.setZoomLevel(zoomLevel - MyMath.getNextSquareNumberAbove((float) max));
        } else if (max < 0.5d) {
            this.mMapView.setZoomLevel((zoomLevel + MyMath.getNextSquareNumberAbove(1.0f / ((float) max))) - 1.0d);
        }
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5, Float f5) {
        animateTo(iGeoPoint, d5, l5, f5, null);
    }

    @Override // org.osmdroid.api.IMapController
    public double setZoom(double d5) {
        return this.mMapView.setZoomLevel(d5);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomIn(Long l5) {
        return zoomTo(this.mMapView.getZoomLevelDouble() + 1.0d, l5);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomInFixing(int i5, int i6) {
        return zoomInFixing(i5, i6, null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomOut() {
        return zoomOut(null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(int i5, Long l5) {
        return zoomTo(i5, l5);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(double d5, int i5, int i6, Long l5) {
        double maxZoomLevel = d5 > this.mMapView.getMaxZoomLevel() ? this.mMapView.getMaxZoomLevel() : d5;
        if (maxZoomLevel < this.mMapView.getMinZoomLevel()) {
            maxZoomLevel = this.mMapView.getMinZoomLevel();
        }
        double zoomLevelDouble = this.mMapView.getZoomLevelDouble();
        if (!((maxZoomLevel < zoomLevelDouble && this.mMapView.canZoomOut()) || (maxZoomLevel > zoomLevelDouble && this.mMapView.canZoomIn())) || this.mMapView.mIsAnimating.getAndSet(true)) {
            return false;
        }
        ZoomEvent zoomEvent = null;
        for (MapListener mapListener : this.mMapView.mListners) {
            if (zoomEvent == null) {
                zoomEvent = new ZoomEvent(this.mMapView, maxZoomLevel);
            }
            mapListener.onZoom(zoomEvent);
        }
        this.mMapView.setMultiTouchScaleInitPoint(i5, i6);
        this.mMapView.startAnimation();
        Math.pow(2.0d, maxZoomLevel - zoomLevelDouble);
        MapAnimatorListener mapAnimatorListener = new MapAnimatorListener(this, Double.valueOf(zoomLevelDouble), Double.valueOf(maxZoomLevel), null, null, null, null, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(mapAnimatorListener);
        ofFloat.addUpdateListener(mapAnimatorListener);
        if (l5 == null) {
            ofFloat.setDuration(a.a().a0());
        } else {
            ofFloat.setDuration(l5.longValue());
        }
        ofFloat.setInterpolator(this.mInterpolator);
        this.mCurrentAnimator = ofFloat;
        ofFloat.start();
        return true;
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5, Float f5, Boolean bool) {
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.animateTo(iGeoPoint, d5, l5, f5, bool);
            return;
        }
        MapAnimatorListener mapAnimatorListener = new MapAnimatorListener(this, Double.valueOf(this.mMapView.getZoomLevelDouble()), d5, new GeoPoint(this.mMapView.getProjection().getCurrentCenter()), iGeoPoint, Float.valueOf(this.mMapView.getMapOrientation()), f5, bool);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(mapAnimatorListener);
        ofFloat.addUpdateListener(mapAnimatorListener);
        if (l5 == null) {
            ofFloat.setDuration(a.a().N());
        } else {
            ofFloat.setDuration(l5.longValue());
        }
        Animator animator = this.mCurrentAnimator;
        if (animator != null) {
            mapAnimatorListener.onAnimationCancel(animator);
        }
        ofFloat.setInterpolator(this.mInterpolator);
        this.mCurrentAnimator = ofFloat;
        ofFloat.start();
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(double d5, Long l5) {
        return zoomToFixing(d5, this.mMapView.getWidth() / 2, this.mMapView.getHeight() / 2, l5);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(double d5) {
        return zoomTo(d5, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public void zoomToSpan(int i5, int i6) {
        zoomToSpan(i5 * 1.0E-6d, i6 * 1.0E-6d);
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5) {
        animateTo(iGeoPoint, d5, l5, null);
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(int i5, int i6) {
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.animateTo(i5, i6);
            return;
        }
        if (this.mMapView.isAnimating()) {
            return;
        }
        MapView mapView = this.mMapView;
        mapView.mIsFlinging = false;
        int mapScrollX = (int) mapView.getMapScrollX();
        int mapScrollY = (int) this.mMapView.getMapScrollY();
        int width = i5 - (this.mMapView.getWidth() / 2);
        int height = i6 - (this.mMapView.getHeight() / 2);
        if (width == mapScrollX && height == mapScrollY) {
            return;
        }
        this.mMapView.getScroller().startScroll(mapScrollX, mapScrollY, width, height, a.a().N());
        this.mMapView.postInvalidate();
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(double d5, int i5, int i6) {
        return zoomToFixing(d5, i5, i6, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(int i5, int i6, int i7) {
        return zoomToFixing(i5, i6, i7, (Long) null);
    }
}
