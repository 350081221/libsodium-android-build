package org.osmdroid.views.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class FolderOverlay extends Overlay {
    protected String mDescription;
    protected String mName;
    protected OverlayManager mOverlayManager;

    @Deprecated
    public FolderOverlay(Context context) {
        this();
    }

    private void recalculateBounds() {
        Iterator<Overlay> it = this.mOverlayManager.iterator();
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        double d7 = -1.7976931348623157E308d;
        double d8 = -1.7976931348623157E308d;
        while (it.hasNext()) {
            BoundingBox bounds = it.next().getBounds();
            d5 = Math.min(d5, bounds.getLatSouth());
            d6 = Math.min(d6, bounds.getLonWest());
            d7 = Math.max(d7, bounds.getLatNorth());
            d8 = Math.max(d8, bounds.getLonEast());
        }
        if (d5 == Double.MAX_VALUE) {
            TileSystem tileSystem = MapView.getTileSystem();
            this.mBounds = new BoundingBox(tileSystem.getMaxLatitude(), tileSystem.getMaxLongitude(), tileSystem.getMinLatitude(), tileSystem.getMinLongitude());
        } else {
            this.mBounds = new BoundingBox(d7, d8, d5, d6);
        }
    }

    public boolean add(Overlay overlay) {
        boolean add = this.mOverlayManager.add(overlay);
        if (add) {
            recalculateBounds();
        }
        return add;
    }

    public void closeAllInfoWindows() {
        for (Overlay overlay : this.mOverlayManager) {
            if (overlay instanceof FolderOverlay) {
                ((FolderOverlay) overlay).closeAllInfoWindows();
            } else if (overlay instanceof OverlayWithIW) {
                ((OverlayWithIW) overlay).closeInfoWindow();
            }
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas, Projection projection) {
        this.mOverlayManager.onDraw(canvas, projection);
    }

    public String getDescription() {
        return this.mDescription;
    }

    public List<Overlay> getItems() {
        return this.mOverlayManager;
    }

    public String getName() {
        return this.mName;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        OverlayManager overlayManager = this.mOverlayManager;
        if (overlayManager != null) {
            overlayManager.onDetach(mapView);
        }
        this.mOverlayManager = null;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onDoubleTap(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onDoubleTap(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onLongPress(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onSingleTapConfirmed(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapUp(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onSingleTapUp(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onTouchEvent(motionEvent, mapView);
        }
        return false;
    }

    public boolean remove(Overlay overlay) {
        boolean remove = this.mOverlayManager.remove(overlay);
        if (remove) {
            recalculateBounds();
        }
        return remove;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public FolderOverlay() {
        this.mOverlayManager = new DefaultOverlayManager(null);
        this.mName = "";
        this.mDescription = "";
    }

    @Override // org.osmdroid.views.overlay.Overlay
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas, MapView mapView, boolean z4) {
        if (z4) {
            return;
        }
        this.mOverlayManager.onDraw(canvas, mapView);
    }
}
