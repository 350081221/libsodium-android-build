package org.osmdroid.views.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.MapViewRepository;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.infowindow.b;
import org.osmdroid.views.overlay.infowindow.c;

/* loaded from: classes4.dex */
public class Marker extends OverlayWithIW {
    public static final float ANCHOR_BOTTOM = 1.0f;
    public static final float ANCHOR_CENTER = 0.5f;
    public static final float ANCHOR_LEFT = 0.0f;
    public static final float ANCHOR_RIGHT = 1.0f;
    public static final float ANCHOR_TOP = 0.0f;
    protected float mAlpha;
    protected float mAnchorU;
    protected float mAnchorV;
    protected float mBearing;
    private boolean mDisplayed;
    protected float mDragOffsetY;
    protected boolean mDraggable;
    protected boolean mFlat;
    protected float mIWAnchorU;
    protected float mIWAnchorV;
    protected Drawable mIcon;
    protected Drawable mImage;
    protected boolean mIsDragged;
    private MapViewRepository mMapViewRepository;
    protected OnMarkerClickListener mOnMarkerClickListener;
    protected OnMarkerDragListener mOnMarkerDragListener;
    private final Rect mOrientedMarkerRect;
    private Paint mPaint;
    protected boolean mPanToView;
    protected GeoPoint mPosition;
    protected Point mPositionPixels;
    private final Rect mRect;
    protected Resources mResources;
    protected int mTextLabelBackgroundColor;
    protected int mTextLabelFontSize;
    protected int mTextLabelForegroundColor;

    /* loaded from: classes4.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker, MapView mapView);
    }

    /* loaded from: classes4.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public Marker(MapView mapView) {
        this(mapView, mapView.getContext());
    }

    @Deprecated
    public static void cleanDefaults() {
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        float f5;
        if (this.mIcon == null || !isEnabled()) {
            return;
        }
        projection.toPixels(this.mPosition, this.mPositionPixels);
        if (this.mFlat) {
            f5 = -this.mBearing;
        } else {
            f5 = (-projection.getOrientation()) - this.mBearing;
        }
        Point point = this.mPositionPixels;
        drawAt(canvas, point.x, point.y, f5);
        if (isInfoWindowShown()) {
            this.mInfoWindow.c();
        }
    }

    protected void drawAt(Canvas canvas, int i5, int i6, float f5) {
        int intrinsicWidth = this.mIcon.getIntrinsicWidth();
        int intrinsicHeight = this.mIcon.getIntrinsicHeight();
        int round = i5 - Math.round(intrinsicWidth * this.mAnchorU);
        int round2 = i6 - Math.round(intrinsicHeight * this.mAnchorV);
        this.mRect.set(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
        RectL.getBounds(this.mRect, i5, i6, f5, this.mOrientedMarkerRect);
        boolean intersects = Rect.intersects(this.mOrientedMarkerRect, canvas.getClipBounds());
        this.mDisplayed = intersects;
        if (!intersects || this.mAlpha == 0.0f) {
            return;
        }
        if (f5 != 0.0f) {
            canvas.save();
            canvas.rotate(f5, i5, i6);
        }
        this.mIcon.setAlpha((int) (this.mAlpha * 255.0f));
        this.mIcon.setBounds(this.mRect);
        this.mIcon.draw(canvas);
        if (f5 != 0.0f) {
            canvas.restore();
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getDragOffset() {
        return this.mDragOffsetY;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public Drawable getImage() {
        return this.mImage;
    }

    public GeoPoint getPosition() {
        return this.mPosition;
    }

    public float getRotation() {
        return this.mBearing;
    }

    public int getTextLabelBackgroundColor() {
        return this.mTextLabelBackgroundColor;
    }

    public int getTextLabelFontSize() {
        return this.mTextLabelFontSize;
    }

    public int getTextLabelForegroundColor() {
        return this.mTextLabelForegroundColor;
    }

    public boolean hitTest(MotionEvent motionEvent, MapView mapView) {
        return this.mIcon != null && this.mDisplayed && this.mOrientedMarkerRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public boolean isDisplayed() {
        return this.mDisplayed;
    }

    public boolean isDraggable() {
        return this.mDraggable;
    }

    public boolean isFlat() {
        return this.mFlat;
    }

    public boolean isInfoWindowShown() {
        b bVar = this.mInfoWindow;
        if (bVar instanceof c) {
            c cVar = (c) bVar;
            if (cVar != null && cVar.h() && cVar.o() == this) {
                return true;
            }
            return false;
        }
        return super.isInfoWindowOpen();
    }

    public void moveToEventPosition(MotionEvent motionEvent, MapView mapView) {
        setPosition((GeoPoint) mapView.getProjection().fromPixels((int) motionEvent.getX(), (int) (motionEvent.getY() - TypedValue.applyDimension(5, this.mDragOffsetY, mapView.getContext().getResources().getDisplayMetrics()))));
        mapView.invalidate();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        BitmapPool.getInstance().asyncRecycle(this.mIcon);
        this.mIcon = null;
        BitmapPool.getInstance().asyncRecycle(this.mImage);
        this.mOnMarkerClickListener = null;
        this.mOnMarkerDragListener = null;
        this.mResources = null;
        setRelatedObject(null);
        if (isInfoWindowShown()) {
            closeInfoWindow();
        }
        this.mMapViewRepository = null;
        setInfoWindow((c) null);
        onDestroy();
        super.onDetach(mapView);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        boolean hitTest = hitTest(motionEvent, mapView);
        if (hitTest && this.mDraggable) {
            this.mIsDragged = true;
            closeInfoWindow();
            OnMarkerDragListener onMarkerDragListener = this.mOnMarkerDragListener;
            if (onMarkerDragListener != null) {
                onMarkerDragListener.onMarkerDragStart(this);
            }
            moveToEventPosition(motionEvent, mapView);
        }
        return hitTest;
    }

    protected boolean onMarkerClickDefault(Marker marker, MapView mapView) {
        marker.showInfoWindow();
        if (marker.mPanToView) {
            mapView.getController().animateTo(marker.getPosition());
            return true;
        }
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        boolean hitTest = hitTest(motionEvent, mapView);
        if (hitTest) {
            OnMarkerClickListener onMarkerClickListener = this.mOnMarkerClickListener;
            if (onMarkerClickListener == null) {
                return onMarkerClickDefault(this, mapView);
            }
            return onMarkerClickListener.onMarkerClick(this, mapView);
        }
        return hitTest;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (this.mDraggable && this.mIsDragged) {
            if (motionEvent.getAction() == 1) {
                this.mIsDragged = false;
                OnMarkerDragListener onMarkerDragListener = this.mOnMarkerDragListener;
                if (onMarkerDragListener != null) {
                    onMarkerDragListener.onMarkerDragEnd(this);
                }
                return true;
            }
            if (motionEvent.getAction() == 2) {
                moveToEventPosition(motionEvent, mapView);
                OnMarkerDragListener onMarkerDragListener2 = this.mOnMarkerDragListener;
                if (onMarkerDragListener2 != null) {
                    onMarkerDragListener2.onMarkerDrag(this);
                }
                return true;
            }
        }
        return false;
    }

    public void remove(MapView mapView) {
        mapView.getOverlays().remove(this);
    }

    public void setAlpha(float f5) {
        this.mAlpha = f5;
    }

    public void setAnchor(float f5, float f6) {
        this.mAnchorU = f5;
        this.mAnchorV = f6;
    }

    public void setDefaultIcon() {
        this.mIcon = this.mMapViewRepository.getDefaultMarkerIcon();
        setAnchor(0.5f, 1.0f);
    }

    public void setDragOffset(float f5) {
        this.mDragOffsetY = f5;
    }

    public void setDraggable(boolean z4) {
        this.mDraggable = z4;
    }

    public void setFlat(boolean z4) {
        this.mFlat = z4;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.mIcon = drawable;
        } else {
            setDefaultIcon();
        }
    }

    public void setImage(Drawable drawable) {
        this.mImage = drawable;
    }

    public void setInfoWindow(c cVar) {
        this.mInfoWindow = cVar;
    }

    public void setInfoWindowAnchor(float f5, float f6) {
        this.mIWAnchorU = f5;
        this.mIWAnchorV = f6;
    }

    public void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        this.mOnMarkerClickListener = onMarkerClickListener;
    }

    public void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        this.mOnMarkerDragListener = onMarkerDragListener;
    }

    public void setPanToView(boolean z4) {
        this.mPanToView = z4;
    }

    public void setPosition(GeoPoint geoPoint) {
        this.mPosition = geoPoint.clone();
        if (isInfoWindowShown()) {
            closeInfoWindow();
            showInfoWindow();
        }
        this.mBounds = new BoundingBox(geoPoint.getLatitude(), geoPoint.getLongitude(), geoPoint.getLatitude(), geoPoint.getLongitude());
    }

    public void setRotation(float f5) {
        this.mBearing = f5;
    }

    public void setTextIcon(String str) {
        Paint paint = new Paint();
        paint.setColor(this.mTextLabelBackgroundColor);
        Paint paint2 = new Paint();
        paint2.setTextSize(this.mTextLabelFontSize);
        paint2.setColor(this.mTextLabelForegroundColor);
        paint2.setAntiAlias(true);
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        paint2.setTextAlign(Paint.Align.LEFT);
        int measureText = (int) (paint2.measureText(str) + 0.5f);
        float f5 = (int) ((-paint2.ascent()) + 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap(measureText, (int) (paint2.descent() + f5 + 0.5f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawPaint(paint);
        canvas.drawText(str, 0.0f, f5, paint2);
        this.mIcon = new BitmapDrawable(this.mResources, createBitmap);
        setAnchor(0.5f, 0.5f);
    }

    public void setTextLabelBackgroundColor(int i5) {
        this.mTextLabelBackgroundColor = i5;
    }

    public void setTextLabelFontSize(int i5) {
        this.mTextLabelFontSize = i5;
    }

    public void setTextLabelForegroundColor(int i5) {
        this.mTextLabelForegroundColor = i5;
    }

    public void setVisible(boolean z4) {
        if (z4) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.0f);
        }
    }

    public void showInfoWindow() {
        if (this.mInfoWindow == null) {
            return;
        }
        int intrinsicWidth = this.mIcon.getIntrinsicWidth();
        int intrinsicHeight = this.mIcon.getIntrinsicHeight();
        int i5 = (int) (intrinsicWidth * (this.mIWAnchorU - this.mAnchorU));
        int i6 = (int) (intrinsicHeight * (this.mIWAnchorV - this.mAnchorV));
        if (this.mBearing == 0.0f) {
            this.mInfoWindow.l(this, this.mPosition, i5, i6);
            return;
        }
        double d5 = ((-r3) * 3.141592653589793d) / 180.0d;
        double cos = Math.cos(d5);
        double sin = Math.sin(d5);
        long j5 = i5;
        long j6 = i6;
        this.mInfoWindow.l(this, this.mPosition, (int) RectL.getRotatedX(j5, j6, 0L, 0L, cos, sin), (int) RectL.getRotatedY(j5, j6, 0L, 0L, cos, sin));
    }

    public Marker(MapView mapView, Context context) {
        this.mTextLabelBackgroundColor = -1;
        this.mTextLabelForegroundColor = ViewCompat.MEASURED_STATE_MASK;
        this.mTextLabelFontSize = 24;
        this.mRect = new Rect();
        this.mOrientedMarkerRect = new Rect();
        this.mMapViewRepository = mapView.getRepository();
        this.mResources = mapView.getContext().getResources();
        this.mBearing = 0.0f;
        this.mAlpha = 1.0f;
        this.mPosition = new GeoPoint(0.0d, 0.0d);
        this.mAnchorU = 0.5f;
        this.mAnchorV = 0.5f;
        this.mIWAnchorU = 0.5f;
        this.mIWAnchorV = 0.0f;
        this.mDraggable = false;
        this.mIsDragged = false;
        this.mPositionPixels = new Point();
        this.mPanToView = true;
        this.mDragOffsetY = 0.0f;
        this.mFlat = false;
        this.mOnMarkerClickListener = null;
        this.mOnMarkerDragListener = null;
        setDefaultIcon();
        setInfoWindow(this.mMapViewRepository.getDefaultMarkerInfoWindow());
    }
}
