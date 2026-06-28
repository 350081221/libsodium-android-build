package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.concurrent.atomic.AtomicInteger;
import org.osmdroid.api.IMapView;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import s4.b;

/* loaded from: classes4.dex */
public abstract class Overlay implements b {
    protected static final float SHADOW_X_SKEW = -0.9f;
    protected static final float SHADOW_Y_SCALE = 0.5f;
    protected BoundingBox mBounds;
    private boolean mEnabled = true;
    private final TileSystem tileSystem;
    private static AtomicInteger sOrdinal = new AtomicInteger();
    private static final Rect mRect = new Rect();

    /* loaded from: classes4.dex */
    public interface Snappable {
        boolean onSnapToItem(int i5, int i6, Point point, IMapView iMapView);
    }

    @Deprecated
    public Overlay(Context context) {
        TileSystem tileSystem = MapView.getTileSystem();
        this.tileSystem = tileSystem;
        this.mBounds = new BoundingBox(tileSystem.getMaxLatitude(), tileSystem.getMaxLongitude(), tileSystem.getMinLatitude(), tileSystem.getMinLongitude());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized void drawAt(Canvas canvas, Drawable drawable, int i5, int i6, boolean z4, float f5) {
        synchronized (Overlay.class) {
            canvas.save();
            canvas.rotate(-f5, i5, i6);
            Rect rect = mRect;
            drawable.copyBounds(rect);
            drawable.setBounds(rect.left + i5, rect.top + i6, rect.right + i5, rect.bottom + i6);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int getSafeMenuId() {
        return sOrdinal.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int getSafeMenuIdSequence(int i5) {
        return sOrdinal.getAndAdd(i5);
    }

    public void draw(Canvas canvas, MapView mapView, boolean z4) {
        if (z4) {
            return;
        }
        draw(canvas, mapView.getProjection());
    }

    public void draw(Canvas canvas, Projection projection) {
    }

    public BoundingBox getBounds() {
        return this.mBounds;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void onDetach(MapView mapView) {
    }

    public boolean onDoubleTap(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6, MapView mapView) {
        return false;
    }

    public boolean onKeyDown(int i5, KeyEvent keyEvent, MapView mapView) {
        return false;
    }

    public boolean onKeyUp(int i5, KeyEvent keyEvent, MapView mapView) {
        return false;
    }

    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6, MapView mapView) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent, MapView mapView) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public void setEnabled(boolean z4) {
        this.mEnabled = z4;
    }

    public Overlay() {
        TileSystem tileSystem = MapView.getTileSystem();
        this.tileSystem = tileSystem;
        this.mBounds = new BoundingBox(tileSystem.getMaxLatitude(), tileSystem.getMaxLongitude(), tileSystem.getMinLatitude(), tileSystem.getMinLongitude());
    }
}
