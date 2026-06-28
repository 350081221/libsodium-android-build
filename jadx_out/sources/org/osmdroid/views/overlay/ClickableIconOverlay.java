package org.osmdroid.views.overlay;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.List;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public abstract class ClickableIconOverlay<DataType> extends IconOverlay {
    private DataType mData;
    protected int mId = 0;

    protected ClickableIconOverlay(DataType datatype) {
        this.mData = datatype;
    }

    public static ClickableIconOverlay find(List<ClickableIconOverlay> list, int i5) {
        for (ClickableIconOverlay clickableIconOverlay : list) {
            if (clickableIconOverlay != null && clickableIconOverlay.mId == i5) {
                return clickableIconOverlay;
            }
        }
        return null;
    }

    public DataType getData() {
        return this.mData;
    }

    public int getID() {
        return this.mId;
    }

    protected boolean hitTest(MotionEvent motionEvent, MapView mapView) {
        Point point;
        Projection projection = mapView.getProjection();
        IGeoPoint iGeoPoint = this.mPosition;
        if (iGeoPoint != null && (point = this.mPositionPixels) != null && projection != null) {
            projection.toPixels(iGeoPoint, point);
            Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
            return this.mIcon.getBounds().contains((-this.mPositionPixels.x) + intrinsicScreenRect.left + ((int) motionEvent.getX()), (-this.mPositionPixels.y) + intrinsicScreenRect.top + ((int) motionEvent.getY()));
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        if (hitTest(motionEvent, mapView)) {
            return onMarkerLongPress(mapView, this.mId, this.mPosition, this.mData);
        }
        return super.onLongPress(motionEvent, mapView);
    }

    protected abstract boolean onMarkerClicked(MapView mapView, int i5, IGeoPoint iGeoPoint, DataType datatype);

    protected boolean onMarkerLongPress(MapView mapView, int i5, IGeoPoint iGeoPoint, Object obj) {
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        if (hitTest(motionEvent, mapView)) {
            return onMarkerClicked(mapView, this.mId, this.mPosition, this.mData);
        }
        return super.onSingleTapConfirmed(motionEvent, mapView);
    }

    public ClickableIconOverlay set(int i5, IGeoPoint iGeoPoint, Drawable drawable, DataType datatype) {
        set(iGeoPoint, drawable);
        this.mId = i5;
        this.mData = datatype;
        return this;
    }
}
