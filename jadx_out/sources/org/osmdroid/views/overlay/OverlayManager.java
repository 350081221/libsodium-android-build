package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import java.util.List;
import org.osmdroid.api.IMapView;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public interface OverlayManager extends List<Overlay> {
    @Override // java.util.List, org.osmdroid.views.overlay.OverlayManager
    void add(int i5, Overlay overlay);

    @Override // java.util.List, org.osmdroid.views.overlay.OverlayManager
    Overlay get(int i5);

    TilesOverlay getTilesOverlay();

    boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView);

    void onDetach(MapView mapView);

    boolean onDoubleTap(MotionEvent motionEvent, MapView mapView);

    boolean onDoubleTapEvent(MotionEvent motionEvent, MapView mapView);

    boolean onDown(MotionEvent motionEvent, MapView mapView);

    void onDraw(Canvas canvas, MapView mapView);

    void onDraw(Canvas canvas, Projection projection);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6, MapView mapView);

    boolean onKeyDown(int i5, KeyEvent keyEvent, MapView mapView);

    boolean onKeyUp(int i5, KeyEvent keyEvent, MapView mapView);

    boolean onLongPress(MotionEvent motionEvent, MapView mapView);

    boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView);

    void onPause();

    boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView);

    void onResume();

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6, MapView mapView);

    void onShowPress(MotionEvent motionEvent, MapView mapView);

    boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView);

    boolean onSingleTapUp(MotionEvent motionEvent, MapView mapView);

    boolean onSnapToItem(int i5, int i6, Point point, IMapView iMapView);

    boolean onTouchEvent(MotionEvent motionEvent, MapView mapView);

    boolean onTrackballEvent(MotionEvent motionEvent, MapView mapView);

    List<Overlay> overlays();

    Iterable<Overlay> overlaysReversed();

    @Override // java.util.List, org.osmdroid.views.overlay.OverlayManager
    Overlay remove(int i5);

    @Override // java.util.List, org.osmdroid.views.overlay.OverlayManager
    Overlay set(int i5, Overlay overlay);

    void setOptionsMenusEnabled(boolean z4);

    void setTilesOverlay(TilesOverlay tilesOverlay);

    @Override // java.util.Collection, java.util.List, org.osmdroid.views.overlay.OverlayManager
    int size();
}
